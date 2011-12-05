
package com.paypal.svcs.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * 
 * 			adaptiveaccountsapiserv connects to: - asfcryptoserv: for
 * 			access to strong encryption - devplat: for platform-related
 * 			data persistence - accountmanagementserv: to validate the
 * 			account data - authandauthserv: for API-level access control
 * 			- adminauthandauthserv: for write access to
 * 			ValidateInternals - DXPT: for user agreement content
 * 		
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AdaptiveAccounts", targetNamespace = "http://svcs.paypal.com/services", wsdlLocation = "https://svcs.sandbox.paypal.com/AdaptiveAccounts/CreateAccount?wsdl")
public class AdaptiveAccounts
    extends Service
{

    private final static URL ADAPTIVEACCOUNTS_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.paypal.svcs.services.AdaptiveAccounts.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.paypal.svcs.services.AdaptiveAccounts.class.getResource(".");
            url = new URL(baseUrl, "https://svcs.sandbox.paypal.com/AdaptiveAccounts/CreateAccount?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://svcs.sandbox.paypal.com/AdaptiveAccounts/CreateAccount?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ADAPTIVEACCOUNTS_WSDL_LOCATION = url;
    }

    public AdaptiveAccounts(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdaptiveAccounts() {
        super(ADAPTIVEACCOUNTS_WSDL_LOCATION, new QName("http://svcs.paypal.com/services", "AdaptiveAccounts"));
    }

    /**
     * 
     * @return
     *     returns AdaptiveAccountsPortType
     */
    @WebEndpoint(name = "AdaptiveAccountsSOAP11port_http")
    public AdaptiveAccountsPortType getAdaptiveAccountsSOAP11PortHttp() {
        return super.getPort(new QName("http://svcs.paypal.com/services", "AdaptiveAccountsSOAP11port_http"), AdaptiveAccountsPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdaptiveAccountsPortType
     */
    @WebEndpoint(name = "AdaptiveAccountsSOAP11port_http")
    public AdaptiveAccountsPortType getAdaptiveAccountsSOAP11PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://svcs.paypal.com/services", "AdaptiveAccountsSOAP11port_http"), AdaptiveAccountsPortType.class, features);
    }

}