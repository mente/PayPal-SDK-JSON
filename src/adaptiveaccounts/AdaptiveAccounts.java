package adaptiveaccounts;

import java.util.Properties;

import javax.xml.ws.BindingProvider;

import com.paypal.svcs.services.AdaptiveAccountsPortType;
import com.paypal.svcs.services.PPFaultMessage;
import com.paypal.svcs.types.aa.AddBankAccountRequest;
import com.paypal.svcs.types.aa.AddBankAccountResponse;
import com.paypal.svcs.types.aa.AddPaymentCardRequest;
import com.paypal.svcs.types.aa.AddPaymentCardResponse;
import com.paypal.svcs.types.aa.CreateAccountRequest;
import com.paypal.svcs.types.aa.CreateAccountResponse;
import com.paypal.svcs.types.aa.GetVerifiedStatusRequest;
import com.paypal.svcs.types.aa.GetVerifiedStatusResponse;
import com.paypal.svcs.types.aa.SetFundingSourceConfirmedRequest;
import com.paypal.svcs.types.aa.SetFundingSourceConfirmedResponse;
import common.com.paypal.platform.sdk.CallerServices;
import common.com.paypal.platform.sdk.exceptions.FatalException;
import common.com.paypal.platform.sdk.exceptions.SSLConnectionException;
import common.com.paypal.platform.sdk.utils.JsonSerialiser;
import common.com.paypal.platform.sdk.utils.XMLSerialiser;


public class AdaptiveAccounts extends CallerServices {
	private final com.paypal.svcs.services.AdaptiveAccounts service = new com.paypal.svcs.services.AdaptiveAccounts();
	private static String aaEndpoint = null;
	String packageContext="com.paypal.svcs.types.aa";

	/**
	 * Constructs the AdaptiveAccounts object which has wrapper APIs for
	 * AdaptiveAccounts Web Services.
	 * <p>
	 * Use this constructor when the paypal_sdk_client.properties and
	 * paypal_sdk_headers.properties files (which contain API_BASE_ENDPOINT,
	 * proxy server name, port and credentials respectively) are available at
	 * the default location. The default location for example in case of Tomcat
	 * server is tomcat_directory/bin/config
	 *
	 */
	public AdaptiveAccounts() throws FatalException, SSLConnectionException {

		try {
			CallerServices.loadPropertiesFromDefaultLocation();
			aaEndpoint = CallerServices.getPayPalBaseEndpoint()
			+ "/AdaptiveAccounts/";
			this.setupSSL();
		} catch (Exception e) {
			throw new FatalException(e);
		}
	}

	/**
	 * Constructs the AdaptiveAccounts object which has wrapper APIs for
	 * AdaptiveAccounts Web Services.
	 * <p>
	 * Use this constructor to override the reading of the property file from
	 * its default location. To know what properties are needed
	 * paypal_sdk_client.properties included in
	 * the<PayPal_Platform_Java_SDK_Instal_Dir>\samples\commandLine\config can
	 * be referred.
	 *
	 * @param clientFile
	 *            Absolute path of the paypal_sdk_client.properties file which
	 *            contain API_BASE_ENDPOINT, proxy server, SSL certificate
	 *            location, SSL is used or not, API Credentials, etc.
	 *
	 *
	 */
	public AdaptiveAccounts(String clientFile) throws FatalException, SSLConnectionException{

		try {
			CallerServices.loadPropertiesFromFiles(clientFile);
			aaEndpoint = CallerServices.getPayPalBaseEndpoint()
			+ "/AdaptiveAccounts/";
			this.setupSSL();
		} catch (Exception e) {
			throw new FatalException(e);
		}
	}

	/**
	 * Constructs the AdaptiveAccounts object which has wrapper APIs for
	 * AdaptiveAccounts Web Services.
	 * <p>
	 * Use this constructor to supply the properties using Properties Objects
	 * created by you. This constructor can be used in situations where
	 * properties files are encrypted. Use your own logic to read the encrypted
	 * properties and load them as Properties Objects. To know what properties
	 * paypal_sdk_client.properties included in the
	 * <PayPal_Platform_Java_SDK_Install_Dir>\samples\commandLine\config can be
	 * referred.
	 *
	 * @param clientprops
	 *            Properties object which contain the properties
	 *            API_BASE_ENDPOINT, API Credentials, proxy server, SSL
	 *            certificate location, SSL is used or not, etc
	 *
	 * @see AdaptiveAccounts
	 */
	public AdaptiveAccounts(Properties clientprops) throws FatalException, SSLConnectionException {

		try {
			CallerServices.loadProperties(clientprops);
			aaEndpoint = CallerServices.getPayPalBaseEndpoint()
			+ "/AdaptiveAccounts/";
			this.setupSSL();
		} catch (Exception e) {
			throw new FatalException(e);
		}
	}

	public CreateAccountResponse createAccount(CreateAccountRequest request)
	throws FatalException,PPFaultMessage{
		AdaptiveAccountsPortType aa = null;
		CreateAccountResponse resp = null;
		String payload="";
		String serverResponse="";
		String endpoint=aaEndpoint + "CreateAccount";
		if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			 payload=JsonSerialiser.serializeObjectToJson(request);
			 serverResponse=call(payload,endpoint);
			 resp=(CreateAccountResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,CreateAccountResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			 payload= XMLSerialiser.serializeObjectToXML(request,packageContext);
			 serverResponse =  call(payload,endpoint);
			 resp=(CreateAccountResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,CreateAccountResponse.class,packageContext);
		}
		else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
				aa = this.setupSoapClient(endpoint);
				resp = aa.createAccount(request);
				log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

		if (("Success").equalsIgnoreCase(resp.getResponseEnvelope()
				.getAck().value())) {
			this.setApiCallStatus(true);
		} else {
			this.setApiCallStatus(false);
		}
		return resp;
	}

    public GetVerifiedStatusResponse getVerifiedStatus(GetVerifiedStatusRequest getRequest)throws FatalException,PPFaultMessage{
    	AdaptiveAccountsPortType aa = null;
    	GetVerifiedStatusResponse resp = null;
    	String payload="";
		String serverResponse="";
		String endpoint=aaEndpoint + "GetVerifiedStatus";
		if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			 payload=JsonSerialiser.serializeObjectToJson(getRequest);
			 serverResponse=call(payload,endpoint);
			 resp=(GetVerifiedStatusResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,GetVerifiedStatusResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			 payload= XMLSerialiser.serializeObjectToXML(getRequest,packageContext);
			 serverResponse =  call(payload,endpoint);
			 resp=(GetVerifiedStatusResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,GetVerifiedStatusResponse.class,packageContext);
		}
		else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{  
				aa = this.setupSoapClient(endpoint);
				resp = aa.getVerifiedStatus(getRequest);
				log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

			if (("Success").equalsIgnoreCase(resp.getResponseEnvelope()
					.getAck().value())) {
				this.setApiCallStatus(true);
			} else {
				this.setApiCallStatus(false);
			}
		return resp;
    }

    public AddBankAccountResponse addBankAccount(AddBankAccountRequest accountRequest)throws FatalException,PPFaultMessage{
    	AdaptiveAccountsPortType aa = null;
    	AddBankAccountResponse resp = null;
    	String payload="";
		String serverResponse="";
		String endpoint=aaEndpoint + "AddBankAccount";
		if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			 payload=JsonSerialiser.serializeObjectToJson(accountRequest);
			 serverResponse=call(payload,endpoint);
			 resp=(AddBankAccountResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,AddBankAccountResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			 payload= XMLSerialiser.serializeObjectToXML(accountRequest,packageContext);
			 serverResponse =  call(payload,endpoint);
			 resp=(AddBankAccountResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,AddBankAccountResponse.class,packageContext);
		}
		else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
				aa = this.setupSoapClient(endpoint);
				resp = aa.addBankAccount(accountRequest);
				log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

			if (("Success").equalsIgnoreCase(resp.getResponseEnvelope().getAck().value()))
			{
				this.setApiCallStatus(true);
			} else {
				this.setApiCallStatus(false);
			}
		return resp;
    }
    
    public AddPaymentCardResponse addPaymentCard(AddPaymentCardRequest adCardRequest)throws FatalException,PPFaultMessage{
    	AdaptiveAccountsPortType aa = null;
    	AddPaymentCardResponse resp = null;
    	String payload="";
		String serverResponse="";
		String endpoint=aaEndpoint + "AddPaymentCard";
		if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			 payload=JsonSerialiser.serializeObjectToJson(adCardRequest);
			 serverResponse=call(payload,endpoint);
			 resp=(AddPaymentCardResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,AddPaymentCardResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			 payload= XMLSerialiser.serializeObjectToXML(adCardRequest,packageContext);
			 serverResponse =  call(payload,endpoint);
			 resp=(AddPaymentCardResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,AddPaymentCardResponse.class,packageContext);
		}
		else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
				aa = this.setupSoapClient(endpoint);
				resp = aa.addPaymentCard(adCardRequest);
				log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

			if (("Success").equalsIgnoreCase(resp.getResponseEnvelope().getAck().value()))
			{
				this.setApiCallStatus(true);
			} else {
				this.setApiCallStatus(false);
			}
		return resp;
    	
    }
   
    public SetFundingSourceConfirmedResponse setFundingSourceConfirmed(SetFundingSourceConfirmedRequest setConfirmedRequest)throws FatalException,PPFaultMessage{
    	AdaptiveAccountsPortType aa = null;
    	SetFundingSourceConfirmedResponse resp = null;
    	String payload="";
		String serverResponse="";
		String endpoint=aaEndpoint + "SetFundingSourceConfirmed";
		if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			 payload=JsonSerialiser.serializeObjectToJson(setConfirmedRequest);
			 serverResponse=call(payload,endpoint);
			 resp=(SetFundingSourceConfirmedResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,SetFundingSourceConfirmedResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			 payload= XMLSerialiser.serializeObjectToXML(setConfirmedRequest,packageContext);
			 serverResponse =  call(payload,endpoint);
			 resp=(SetFundingSourceConfirmedResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,SetFundingSourceConfirmedResponse.class,packageContext);
		}
		else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
				aa = this.setupSoapClient(endpoint);
				resp = aa.setFundingSourceConfirmed(setConfirmedRequest);
				log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

			if (("Success").equalsIgnoreCase(resp.getResponseEnvelope().getAck().value()))
			{
				this.setApiCallStatus(true);
			} else {
				this.setApiCallStatus(false);
			}
		return resp;
    	
    }
    
	private AdaptiveAccountsPortType setupSoapClient(String ep)
	throws FatalException {
		AdaptiveAccountsPortType ap = null;
		try {
			ap = this.service.getAdaptiveAccountsSOAP11PortHttp();
			BindingProvider bp = (BindingProvider) ap;
			if (CallerServices.isLogging()) {
				addLogHandler(bp);
			}
			CallerServices.setupHeaders(bp);
			CallerServices.setupHttpProxyServer();
			CallerServices.setupEndPoint(bp, ep);
		} catch (Exception e) {
			throw new FatalException(e);
		}
		return ap;
	}

}
