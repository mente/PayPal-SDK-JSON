package common.com.paypal.platform.sdk;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;

import common.com.paypal.platform.sdk.exceptions.FatalException;
import common.com.paypal.platform.sdk.exceptions.SSLConnectionException;
import common.com.paypal.platform.sdk.logging.SOAPMessageLoggingHandler;
import common.com.paypal.platform.sdk.utils.SSLKeysManager;
import common.com.paypal.platform.sdk.utils.SSLUtil;

public class CallerServices {
	protected static Log log = LogFactory.getLog(CallerServices.class);
	private static Properties headers = new Properties();

	public static Properties getHeaders() {
		return headers;
	}

	public static void setHeaders(Properties headers) {
		CallerServices.headers = headers;
	}

	public static Properties getClientprops() {
		return clientprops;
	}

	public static void setClientprops(Properties clientprops) {
		CallerServices.clientprops = clientprops;
	}

	private static Properties clientprops = new Properties();
	private static String PayPal_HOST_URI = "https://svcs.beta-sandbox.paypal.com/";
	private static boolean trustAll;
	private static boolean logging = false;
	private static boolean client_auth_certificate = false;
	private final static String APIUSER_CERTIFICATE_PATH = "APIUSER_CERTIFICATE_PATH";
	private final static String APIUSER_CERTIFICATE_PASSWORD = "APIUSER_CERTIFICATE_PASSWORD";
	private final static String JSSE_PROVIDER = "JSSE_PROVIDER";
	private static String propsLocation = "config/paypal_sdk_client.properties";
	protected OutputStream output = new StringOutputStream();
	private boolean apiCallStatus = false;
	
	/**
	 * Returns the status of the last API call
	 * @return boolean either true or False
	 */
	public boolean isSucess() {
		return apiCallStatus;
	}

	protected void setApiCallStatus(boolean apiCallStatus) {
		this.apiCallStatus = apiCallStatus;
	}

	public static boolean isClientAuthCertificateUsed() {
		return client_auth_certificate;
	}

	public static void setClientAuthcertificate(boolean client_auth_certificate) {
		CallerServices.client_auth_certificate = client_auth_certificate;
	}

	private static String logFileName = "";

	public static String getPayPalBaseEndpoint() {
		return PayPal_HOST_URI;
	}

	public static void setPayPalBaseEndpoint(String payPal_HOST_URI) {
		PayPal_HOST_URI = payPal_HOST_URI;
	}

	public static boolean isLogging() {
		return logging;
	}

	public static void setLogging(boolean logging) {
		CallerServices.logging = logging;
	}

	public static boolean isTrustAll() {
		return trustAll;
	}

	public static void setTrustAll(boolean trustAll) {
		CallerServices.trustAll = trustAll;
	}

	private static void initialize() {
		CallerServices.setLogFileName((String) clientprops.get("LOGFILENAME"));
		CallerServices.setPayPalBaseEndpoint(clientprops
				.get("API_BASE_ENDPOINT").toString().trim());
		if ("true".equalsIgnoreCase(clientprops
				.getProperty("TRUST_ALL_CONNECTION"))) {
			CallerServices.setTrustAll(true);
		} else {
			CallerServices.setTrustAll(false);
		}
		if ("true".equalsIgnoreCase(clientprops.getProperty("LOGENABLED"))) {
			CallerServices.setLogging(true);
		} else {
			CallerServices.setLogging(false);
		}
		if ("true".equalsIgnoreCase(clientprops.getProperty("CLIENT_AUTH_SSL"))) {
			CallerServices.setClientAuthcertificate(true);
		} else {
			CallerServices.setClientAuthcertificate(false);
		}
		if (log.isInfoEnabled()) {
			log.info("The Base Endpoint used for all transactions is: "
					+ CallerServices.getPayPalBaseEndpoint());
			log.info("The Credential type for the transaction is: "
					+ CallerServices.getCredentialType());
			log.info("Proxy Host server through which API is calls are made: "
					+ CallerServices.getProxyHostName());
			log.info("The requests and reponses from PayPal webservices will be logged to the file: "
					+ clientprops.getProperty("LOGFILENAME"));
		}
	}
	
	@Override
    public void finalize() {
	//	SSLKeysManager.unregisterKeys(String.valueOf(this.hashCode()));
		try {
			if (output != null)
				output.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getPropsLocation() {
		return propsLocation;
	}

	public static void setPropsLocation(String propsLocation) {
		CallerServices.propsLocation = propsLocation;
	}

	/**
	 * Sets up SSL context and initializes context with an appropriate
	 * trust manager as per CLIENT_AUTH_SSL settings. 
	 * 
	 * For using client side API certificate, set APIUSER_CERTIFICATE_PATH and 
	 * APIUSER_CERTIFICATE_PASSWORD in paypal_sdk_client.properties
	 *  
	 * @throws SSLConnectionException
	 */
	protected void setupSSL() throws SSLConnectionException  {
			// setup SSL only when Certificate credentials is used
			SSLContext sc = null;
			if (CallerServices.isClientAuthCertificateUsed()) {
				try {
					sc = SSLUtil.setupClientAuthSSL(clientprops
							.getProperty(JSSE_PROVIDER), clientprops
							.getProperty(APIUSER_CERTIFICATE_PATH), clientprops
							.getProperty(APIUSER_CERTIFICATE_PASSWORD), CallerServices
							.isTrustAll());
				} catch (UnrecoverableKeyException e) {
					e.printStackTrace();
					throw new SSLConnectionException(e);
				} catch (NoSuchAlgorithmException e) {
					e.printStackTrace();
					throw new SSLConnectionException(e);
				} catch (KeyStoreException e) {
					e.printStackTrace();
					throw new SSLConnectionException(e);
				} catch (NoSuchProviderException e) {
					e.printStackTrace();
					throw new SSLConnectionException(e);
				} catch (CertificateException e) {
					e.printStackTrace();
					throw new SSLConnectionException(e);
				} catch (IOException e) {
					e.printStackTrace();
					throw new SSLConnectionException(e);
				}
			//	this.registerKey();

			} else {
				try {
					sc = SSLUtil.getDefaultSSLContext(CallerServices.isTrustAll());
				} catch (KeyManagementException e) {
					e.printStackTrace();
					throw new SSLConnectionException(e);
				} catch (NoSuchAlgorithmException e) {
					e.printStackTrace();
					throw new SSLConnectionException(e);
				} catch (IOException e) {
					e.printStackTrace();
					throw new SSLConnectionException(e);
				}
			}
			javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc
					.getSocketFactory());
			if (CallerServices.isTrustAll()) {
				javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(hv);

			}
		}
	
	/**
	 * A No-Op hostname verifier that always returns a "verified to be correct" 
	 * status. 
	 *  
	 * See the TRUST_ALL_CONNECTION property. This property is recommended only
	 * for testing purposes.
	 */
	HostnameVerifier hv = new HostnameVerifier()
	{
		@Override
        public boolean verify(String urlHostname, SSLSession session)
		{
			return true;
		}
	};

	/**
	 * Loads the paypal_sdk_client.properties config file
	 * 
	 * This method will first try to read the file from the location 
	 * specified in propsLocation. 
	 * If the file is not found at this location, falls back to the
	 * default file that is bundled with the *base* jars
	 */
	protected static void loadPropertiesFromDefaultLocation()
		throws FatalException {
			try {
				loadPropertyFiles();

			} catch (FatalException e1) {
				if (log.isWarnEnabled()) {
					log.warn("No Property files found or error reading them, fix it to call PayPal APIs",e1);
				}
				loadPropertyFilesfromSDKJar();
			}
			CallerServices.initialize();
	}

	protected static void loadPropertiesFromFiles(String clientFile)
	throws FatalException {

		CallerServices.setPropsLocation(clientFile);
		try {
			loadPropertyFiles();
		} catch (FatalException e1) {
			if (log.isWarnEnabled()) {
				log.warn("No Property files found or error reading them, fix it to call PayPal APIs",e1);
			}
			throw new RuntimeException(e1);
		}
		CallerServices.initialize();
	}

	protected static void loadProperties(Properties client)
	throws FatalException {
		CallerServices.setClientprops(client);
		CallerServices.initialize();
	}

	private static String getProxyHostName() {
		if ("true".equalsIgnoreCase(clientprops.getProperty("USE_PROXY"))) {
			String proxy = clientprops.getProperty("PROXY_HOST") + ":"
			+ clientprops.getProperty("PROXY_PORT");
			return proxy;
		} else {
			return "No proxy server used!";
		}
	}

	private static String getCredentialType() {
		if (isClientAuthCertificateUsed()) {
			return "Client Auth Certification";
		} else {
			return "3 Token";
		}
	}

	public static String getLogFileName() {
		return logFileName;
	}

	public static void setLogFileName(String logFileName) {
		CallerServices.logFileName = logFileName;
	}

	/**
	 * Set up required SOAP headers (API credentials etc)	 *  
	 * @param bp
	 */
	@SuppressWarnings("unchecked")
	public static void setupHeaders(BindingProvider bp) {
	  final Map headers = getHeader();
	  try {
		//Axis2 Implementation  
	    Class.forName("org.apache.axis2.builder.SOAPBuilder"); 
	    SOAPHandler<SOAPMessageContext> h = new SOAPHandler<SOAPMessageContext>() {
	      public void close(MessageContext arg0) {}
	      public Set getHeaders() {return null;}
	      public boolean handleFault(SOAPMessageContext context) {return true;}
	      public boolean handleMessage(SOAPMessageContext context) {
	        context.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
	        return true;
	      }
	    };
	    List<Handler> handlers = bp.getBinding().getHandlerChain();
	    if (handlers == null) {
	      handlers = new LinkedList<Handler>();
	      bp.getBinding().setHandlerChain(handlers);
	    }
	    handlers.add(h);
	  } catch (ClassNotFoundException e) {
	    // JAX-WS Implementation
	    bp.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
	  }
	}
	/**
	 * Sets Proxy server parameters for the connection
	 * if proxying has been configured in the properties file
	 */
	public static void setupHttpProxyServer() {
		if ("true".equalsIgnoreCase(clientprops.getProperty("USE_PROXY"))) {
			final String username=clientprops.getProperty("PROXY_USERNAME");
			final String password=clientprops.getProperty("PROXY_PASSWORD");
			if(username != null  && password!=null){
				Authenticator authenticator = new Authenticator() {
					public PasswordAuthentication getPasswordAuthentication() {
						return (new PasswordAuthentication(username,
								password.toCharArray()));
					}
				};
				Authenticator.setDefault(authenticator);
			}
			  
			System.setProperty("https.proxyHost", clientprops.getProperty("PROXY_HOST"));  
			System.setProperty("https.proxyPort",clientprops.getProperty("PROXY_PORT")); 
		}

	}

	/**
	 * Sets the service endpoint for the request.
	 * For platform APIs, the endpoint varies with the operation being invoked.
	 * It takes the form BASE_URL + "/" + wsdlOperationName
	 * @param bp
	 * @param endpoint Complete endpoint URL
	 */
	public static void setupEndPoint(BindingProvider bp, String endpoint) {
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				endpoint);
	}

	protected void registerKey() throws Exception {
		if (SSLKeysManager.containsKey(String.valueOf(this.hashCode()))) {
			SSLKeysManager.unregisterKeys(String.valueOf(this.hashCode()));
		}
		SSLKeysManager.registerKeys(String.valueOf(this.hashCode()),
				SSLUtil.kmf.getKeyManagers());
	}

	@SuppressWarnings("unchecked")
	private static Map getHeader() {
	  try {
		// Axis2 Reference Implementation  
	    Class.forName("org.apache.axis2.builder.SOAPBuilder"); 
	    Map<String, String> map = new HashMap<String, String>();
	    for (Iterator<Map.Entry<Object, Object>> iterator = clientprops
	        .entrySet().iterator(); iterator.hasNext();) {
	      Map.Entry<Object, Object> type = iterator.next();
	      String headername = (String) type.getKey();
	      if (headername.startsWith("X-PAYPAL")) {
	        map.put(headername, ((String) type.getValue()));
	      }
	    }
	    if(clientprops.getProperty("X-PAYPAL-REQUEST-DATA-FORMAT").equalsIgnoreCase("SOAP11")){
			map.remove("X-PAYPAL-REQUEST-DATA-FORMAT");
			map.remove("X-PAYPAL-RESPONSE-DATA-FORMAT");
		}
	    map.put("X-PAYPAL-MESSAGE-PROTOCOL", "SOAP11");
	    
	    if(clientprops.containsKey("X-PAYPAL-REQUEST-SOURCE")){
			String value=(String)clientprops.get("X-PAYPAL-REQUEST-SOURCE");
			String newValue="";
		   if(value !=null && value.length()>0){
			   newValue="JAVA_SOAP_SDK_V1.1"+"-"+value;
			   map.put("X-PAYPAL-REQUEST-SOURCE", newValue);
		   }else{
			   map.put("X-PAYPAL-REQUEST-SOURCE", "JAVA_SOAP_SDK_V1.1");
		   }
		}else{
			map.put("X-PAYPAL-REQUEST-SOURCE", "JAVA_SOAP_SDK_V1.1");
		}
	    
	    return map;
	  } catch (ClassNotFoundException e) {
	    // JAX-WS Reference Implementation
		log.info("[PayPal CallerServices] using JAX-WS reference implementation");
	    Map<String, List<String>> map = new ConcurrentHashMap<String, List<String>>();
	    for (Iterator<Map.Entry<Object, Object>> iterator = clientprops
	        .entrySet().iterator(); iterator.hasNext();) {
	      Map.Entry<Object, Object> type = iterator.next();
	      String headername = (String) type.getKey();
	      if (headername.startsWith("X-PAYPAL")) {
	        map.put(headername, Collections.singletonList((String) type.getValue()));
	      }
	    }
	    if(clientprops.getProperty("X-PAYPAL-REQUEST-DATA-FORMAT").equalsIgnoreCase("SOAP11")){
			map.remove("X-PAYPAL-REQUEST-DATA-FORMAT");
			map.remove("X-PAYPAL-RESPONSE-DATA-FORMAT");
		}
	    map.put("X-PAYPAL-MESSAGE-PROTOCOL", Collections.singletonList("SOAP11"));
	    
	    if(clientprops.containsKey("X-PAYPAL-REQUEST-SOURCE")){
	    	String value=(String)clientprops.get("X-PAYPAL-REQUEST-SOURCE");
			String newValue="";
		   if(value !=null && value.length()>0){
			   newValue="JAVA_SOAP_SDK_V1.1"+"-"+value;
			   map.put("X-PAYPAL-REQUEST-SOURCE", Collections.singletonList(newValue));
		   }else{
			   map.put("X-PAYPAL-REQUEST-SOURCE", Collections.singletonList("JAVA_SOAP_SDK_V1.1"));
		   }
		}else{
			   map.put("X-PAYPAL-REQUEST-SOURCE", Collections.singletonList("JAVA_SOAP_SDK_V1.1"));
		 }
	    return map;
	  }
	}


	protected static void loadPropertyFiles() throws FatalException {
		try {
			File fl = new File(propsLocation);
			String path = fl.getAbsolutePath();
			log.info("Client Property file used is " + path);
			clientprops.load(new FileInputStream(path));
		} catch (Exception e) {
			throw new FatalException(e);
		}

	}

	private static void loadPropertyFilesfromSDKJar() throws FatalException {
		try {
			ResourceBundle clientbundle = ResourceBundle
			.getBundle("common.com.paypal.platform.sdk.resource.paypal_sdk_client");
			Enumeration<String> ckeys = clientbundle.getKeys();
			while (ckeys.hasMoreElements()) {
				String key = ckeys.nextElement();
				clientprops.put(key, clientbundle.getString(key));
			}

		} catch (Exception e) {
			if (log.isWarnEnabled()) {
				log.warn("No Property files found or error reading them from classpath: com.paypal.sdk.resources. You may ignore it if they are supplied later during SDK object constructions",e);
			}
			throw new RuntimeException(e);
		}
	}

	private static void loadPropertyFiles(String clientFile, String headerFile)
	throws FatalException {
		try {
			File hfl = new File(headerFile);
			String headerpath = hfl.getAbsolutePath();
			headers.load(new FileInputStream(headerpath));
			File fl = new File(clientFile);
			String path = fl.getAbsolutePath();
			clientprops.load(new FileInputStream(path));

		} catch (Exception e) {
			throw new FatalException(e);
		}

	}

	protected void addLogHandler(BindingProvider bp) {
		Binding binding = bp.getBinding();
		List handlerList = binding.getHandlerChain();
		if (handlerList == null)
			handlerList = new ArrayList();
		SOAPMessageLoggingHandler loggingHandler = new SOAPMessageLoggingHandler(output);
		handlerList.add(loggingHandler);
		binding.setHandlerChain(handlerList);

	}

	public  String call(String payload,String endpoint) throws FatalException{
			HttpEntity entity = null;
			String response = "";
			try {
				log.debug(clientprops.getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")+" request : "+payload.toString());
				URL url = new URL(endpoint);
				HttpHost target = new HttpHost(url.getHost(), 443,"https");
				
				// general setup
				SchemeRegistry supportedSchemes = new SchemeRegistry();
				supportedSchemes.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
				supportedSchemes.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));

				// prepare parameters
				HttpParams params = new BasicHttpParams();
				HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
				HttpProtocolParams.setContentCharset(params, "UTF-8");
				if ("true".equalsIgnoreCase(clientprops.getProperty("USE_PROXY"))) {
					String proxyHost =(String) clientprops.get("PROXY_HOST");
					int proxyPort = Integer.parseInt( (String)clientprops.get("PROXY_PORT") );
					if( (proxyHost != null) && (proxyPort>0) ) {
					    params.setParameter(ConnRoutePNames.DEFAULT_PROXY, new HttpHost(proxyHost, proxyPort));
					}
				}
				ClientConnectionManager ccm = new ThreadSafeClientConnManager(params, supportedSchemes);
				DefaultHttpClient httpclient = new DefaultHttpClient(ccm,params);
				
				if ("true".equalsIgnoreCase(clientprops.getProperty("USE_PROXY"))) {
					String proxyHost =(String) clientprops.get("PROXY_HOST");
					int proxyPort = Integer.parseInt( (String)clientprops.get("PROXY_PORT") );
					String proxyUsername = (String) clientprops.get("PROXY_USERNAME");
					String proxyPassword = (String) clientprops.get("PROXY_PASSWORD");
					
					if( (proxyUsername != null) && (proxyPassword != null) ) {
						httpclient.getCredentialsProvider().setCredentials(
					new AuthScope(proxyHost, proxyPort), new UsernamePasswordCredentials(proxyUsername, proxyPassword));
					}
				}
				HttpPost req = new HttpPost(url.toString());
				HttpEntity reqEntity = new StringEntity(payload, "UTF-8");


				req.setEntity(reqEntity);
				addHeaders(req,clientprops);
				HttpResponse rsp = httpclient.execute(target, req);
				int statusCode=rsp.getStatusLine().getStatusCode();
				if ( statusCode != 200 ) {
					throw new FatalException("HTTP Error code " + statusCode + " received, transaction not submitted");
				}
				entity = rsp.getEntity();

				response = EntityUtils.toString(entity);
				
				log.debug(clientprops.getProperty("X-PAYPAL-RESPONSE-DATA-FORMAT")+" response : "+response.toString());
			} catch (Exception e) {
				throw new FatalException("Transaction Failed : ", e);
			}
			return response;
		}
		private void addHeaders(HttpPost httppost,Properties prop){
			if(prop.containsKey("X-PAYPAL-REQUEST-SOURCE")){
				String value=(String)prop.get("X-PAYPAL-REQUEST-SOURCE");
				String newValue="";
			   if(value !=null && value.length()>0){
				   newValue="JAVA_SOAP_SDK_V1.1"+"-"+value;
				   prop.put("X-PAYPAL-REQUEST-SOURCE", newValue);
			   }else{
				   prop.put("X-PAYPAL-REQUEST-SOURCE", "JAVA_SOAP_SDK_V1.1");
			   }
			}else{
				prop.put("X-PAYPAL-REQUEST-SOURCE", "JAVA_SOAP_SDK_V1.1");
			}
			for (Map.Entry<Object, Object> entry : prop.entrySet())
			{
				String key=(String)entry.getKey();
				String value=(String)entry.getValue();
				httppost.addHeader(key,value);
			}
		}
}