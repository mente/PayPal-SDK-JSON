package adaptivepayments;


import java.util.Properties;

import javax.xml.ws.BindingProvider;

import com.paypal.svcs.services.AdaptivePaymentsPortType;
import com.paypal.svcs.services.PPFaultMessage;
import com.paypal.svcs.types.ap.CancelPreapprovalRequest;
import com.paypal.svcs.types.ap.CancelPreapprovalResponse;
import com.paypal.svcs.types.ap.ConfirmPreapprovalRequest;
import com.paypal.svcs.types.ap.ConfirmPreapprovalResponse;
import com.paypal.svcs.types.ap.ConvertCurrencyRequest;
import com.paypal.svcs.types.ap.ConvertCurrencyResponse;
import com.paypal.svcs.types.ap.ExecutePaymentRequest;
import com.paypal.svcs.types.ap.ExecutePaymentResponse;
import com.paypal.svcs.types.ap.GetAvailableShippingAddressesRequest;
import com.paypal.svcs.types.ap.GetAvailableShippingAddressesResponse;
import com.paypal.svcs.types.ap.GetFundingPlansRequest;
import com.paypal.svcs.types.ap.GetFundingPlansResponse;
import com.paypal.svcs.types.ap.GetPaymentOptionsRequest;
import com.paypal.svcs.types.ap.GetPaymentOptionsResponse;
import com.paypal.svcs.types.ap.GetAllowedFundingSourcesRequest;
import com.paypal.svcs.types.ap.GetAllowedFundingSourcesResponse;
import com.paypal.svcs.types.ap.GetShippingAddressesRequest;
import com.paypal.svcs.types.ap.GetShippingAddressesResponse;
import com.paypal.svcs.types.ap.PayRequest;
import com.paypal.svcs.types.ap.PayResponse;
import com.paypal.svcs.types.ap.PaymentDetailsRequest;
import com.paypal.svcs.types.ap.PaymentDetailsResponse;
import com.paypal.svcs.types.ap.PreapprovalDetailsRequest;
import com.paypal.svcs.types.ap.PreapprovalDetailsResponse;
import com.paypal.svcs.types.ap.PreapprovalRequest;
import com.paypal.svcs.types.ap.PreapprovalResponse;
import com.paypal.svcs.types.ap.RefundRequest;
import com.paypal.svcs.types.ap.RefundResponse;
import com.paypal.svcs.types.ap.SetPaymentOptionsRequest;
import com.paypal.svcs.types.ap.SetPaymentOptionsResponse;
import common.com.paypal.platform.sdk.CallerServices;
import common.com.paypal.platform.sdk.exceptions.FatalException;
import common.com.paypal.platform.sdk.exceptions.SSLConnectionException;
import common.com.paypal.platform.sdk.utils.JsonSerialiser;
import common.com.paypal.platform.sdk.utils.XMLSerialiser;

public class AdaptivePayments extends CallerServices
{
  private static String apEndpoint = null;
  String packageContext="com.paypal.svcs.types.ap";
  private final com.paypal.svcs.services.AdaptivePayments service = new com.paypal.svcs.services.AdaptivePayments();

  public AdaptivePayments()
    throws FatalException, SSLConnectionException
  {
    try
    {
      CallerServices.loadPropertiesFromDefaultLocation();
      apEndpoint = CallerServices.getPayPalBaseEndpoint() + "/AdaptivePayments/";
      setupSSL();
    }
    catch (Exception localException)
    {
      throw new FatalException(localException);
    }
  }

  public AdaptivePayments(String paramString)
    throws FatalException, SSLConnectionException
  {
    try
    {
      CallerServices.loadPropertiesFromFiles(paramString);
      apEndpoint = CallerServices.getPayPalBaseEndpoint() + "/AdaptivePayments/";
      setupSSL();
    }
    catch (Exception localException)
    {
      throw new FatalException(localException);
    }
  }

  public AdaptivePayments(Properties paramProperties)
    throws FatalException, SSLConnectionException
  {
    try
    {
      CallerServices.loadProperties(paramProperties);
      setupSSL();
      apEndpoint = CallerServices.getPayPalBaseEndpoint() + "/AdaptivePayments/";
    }
    catch (Exception localException)
    {
      throw new FatalException(localException);
    }
  }
 
  
  public PayResponse pay(PayRequest paramPayRequest) throws FatalException, PPFaultMessage
  {
	PayResponse localPayResponse = null;
	String payload="";
	String serverResponse="";
	String endpoint=apEndpoint + "Pay";
	if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
	{
		 payload=JsonSerialiser.serializeObjectToJson(paramPayRequest);
		 serverResponse=call(payload,endpoint);
		 localPayResponse=(PayResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,PayResponse.class);
	}
	else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
	{
		 payload= XMLSerialiser.serializeObjectToXML(paramPayRequest,packageContext);
		 serverResponse =  call(payload,endpoint);
	     localPayResponse=(PayResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,PayResponse.class,packageContext);
	}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
	{
		try{ 
			 AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
			 localAdaptivePaymentsPortType = setupSoapClient(endpoint);
			 localPayResponse = localAdaptivePaymentsPortType.pay(paramPayRequest);
			 log.debug("SOAP request and response :" +output.toString());
		}catch (PPFaultMessage ppf) {
			 log.debug("SOAP request and response :" +output.toString());
			 throw ppf;
		}
	}
    return localPayResponse;
  }

  public CancelPreapprovalResponse cancelPreapproval(CancelPreapprovalRequest paramCancelPreapprovalRequest)
    throws FatalException, PPFaultMessage
  {
	  CancelPreapprovalResponse localCancelPreapprovalResponse = null;
	  String payload="";
	  String serverResponse="";
	  String endpoint=apEndpoint + "CancelPreapproval";
		if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload=JsonSerialiser.serializeObjectToJson(paramCancelPreapprovalRequest);
			serverResponse=call(payload,endpoint);
			localCancelPreapprovalResponse=(CancelPreapprovalResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,CancelPreapprovalResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
		    payload= XMLSerialiser.serializeObjectToXML(paramCancelPreapprovalRequest,packageContext);
		    serverResponse =  call(payload,endpoint);
		    localCancelPreapprovalResponse=(CancelPreapprovalResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,CancelPreapprovalResponse.class,packageContext);
		}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
				AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
			    localAdaptivePaymentsPortType = setupSoapClient(endpoint);
			    localCancelPreapprovalResponse = localAdaptivePaymentsPortType.cancelPreapproval(paramCancelPreapprovalRequest);
			    log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

		if ("Success".equalsIgnoreCase(localCancelPreapprovalResponse.getResponseEnvelope().getAck().value()))
		{
		      setApiCallStatus(true);
		}
		else
		{
		      setApiCallStatus(false);
		}
    return localCancelPreapprovalResponse;
  }

  public ConvertCurrencyResponse convertCurrency(ConvertCurrencyRequest paramConvertCurrencyRequest)
    throws FatalException, PPFaultMessage
  {
	  ConvertCurrencyResponse localConvertCurrencyResponse = null;
	  String payload="";
	  String serverResponse="";
	  String endpoint=apEndpoint + "ConvertCurrency";
		if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			 payload=JsonSerialiser.serializeObjectToJson(paramConvertCurrencyRequest);
			 serverResponse=call(payload,endpoint);
			 localConvertCurrencyResponse=(ConvertCurrencyResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,ConvertCurrencyResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
		    payload= XMLSerialiser.serializeObjectToXML(paramConvertCurrencyRequest,packageContext);
		    serverResponse =  call(payload,endpoint);
		    localConvertCurrencyResponse=(ConvertCurrencyResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,ConvertCurrencyResponse.class,packageContext);
		}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
				AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
			    localAdaptivePaymentsPortType = setupSoapClient(endpoint);
			    localConvertCurrencyResponse = localAdaptivePaymentsPortType.convertCurrency(paramConvertCurrencyRequest);
			    log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

    return localConvertCurrencyResponse;
  }

  public PreapprovalDetailsResponse preapprovalDetails(PreapprovalDetailsRequest paramPreapprovalDetailsRequest)
    throws FatalException, PPFaultMessage
  {
	  PreapprovalDetailsResponse localPreapprovalDetailsResponse = null;
	  String payload="";
	  String serverResponse="";
	  String endpoint=apEndpoint + "PreapprovalDetails";
	  if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
		     payload=JsonSerialiser.serializeObjectToJson(paramPreapprovalDetailsRequest);
			 serverResponse=call(payload,endpoint);
			 localPreapprovalDetailsResponse=(PreapprovalDetailsResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,PreapprovalDetailsResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
		   payload= XMLSerialiser.serializeObjectToXML(paramPreapprovalDetailsRequest,packageContext);
		   serverResponse =  call(payload,endpoint);
		   localPreapprovalDetailsResponse=(PreapprovalDetailsResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,PreapprovalDetailsResponse.class,packageContext);
		}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
				AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
			    localAdaptivePaymentsPortType = setupSoapClient(endpoint);
			    localPreapprovalDetailsResponse = localAdaptivePaymentsPortType.preapprovalDetails(paramPreapprovalDetailsRequest);
			    log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

    return localPreapprovalDetailsResponse;
  }

  public RefundResponse refund(RefundRequest paramRefundRequest)throws FatalException, PPFaultMessage
  {
	  RefundResponse localRefundResponse = null;
	  String payload="";
	  String serverResponse="";
	  String endpoint=apEndpoint + "Refund";
	  if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
		     payload= JsonSerialiser.serializeObjectToJson(paramRefundRequest);
			 serverResponse=call(payload,endpoint);
			 localRefundResponse=(RefundResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,RefundResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload= XMLSerialiser.serializeObjectToXML(paramRefundRequest,packageContext);
			serverResponse =  call(payload,endpoint);
			localRefundResponse=(RefundResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,RefundResponse.class,packageContext);
		}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
				AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
			    localAdaptivePaymentsPortType = setupSoapClient(endpoint);
			    localRefundResponse = localAdaptivePaymentsPortType.refund(paramRefundRequest);
			    log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

    return localRefundResponse;
  }

  public PaymentDetailsResponse paymentDetails(PaymentDetailsRequest paramPaymentDetailsRequest) throws FatalException, PPFaultMessage
  {
	PaymentDetailsResponse localPaymentDetailsResponse = null;
	String payload="";
	String serverResponse="";
	String endpoint=apEndpoint + "PaymentDetails";
	if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
	{
		 payload= JsonSerialiser.serializeObjectToJson(paramPaymentDetailsRequest);
		 serverResponse=call(payload,endpoint);
		 localPaymentDetailsResponse=(PaymentDetailsResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,PaymentDetailsResponse.class);
	}
	else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
	{
		payload= XMLSerialiser.serializeObjectToXML(paramPaymentDetailsRequest,packageContext);
		serverResponse =  call(payload,endpoint);
		localPaymentDetailsResponse=(PaymentDetailsResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,PaymentDetailsResponse.class,packageContext);
	}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
	{
		try{
			AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
		    localAdaptivePaymentsPortType = setupSoapClient(endpoint);
		    localPaymentDetailsResponse = localAdaptivePaymentsPortType.paymentDetails(paramPaymentDetailsRequest);
		    log.debug("SOAP request and response :" +output.toString());
		}catch (PPFaultMessage ppf) {
			log.debug("SOAP request and response :" +output.toString());
			throw ppf;
		}
	}
    return localPaymentDetailsResponse;
  }

  public PreapprovalResponse preapproval(PreapprovalRequest paramPreapprovalRequest) throws FatalException, PPFaultMessage
  {
	  PreapprovalResponse localPreapprovalResponse = null;
	  String payload="";
	  String serverResponse="";
	  String endpoint=apEndpoint + "Preapproval";
		if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload= JsonSerialiser.serializeObjectToJson(paramPreapprovalRequest);
			serverResponse=call(payload,endpoint);
			localPreapprovalResponse=(PreapprovalResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,PreapprovalResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload= XMLSerialiser.serializeObjectToXML(paramPreapprovalRequest,packageContext);
			serverResponse =  call(payload,endpoint);
			localPreapprovalResponse=(PreapprovalResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,PreapprovalResponse.class,packageContext);

		}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
			AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
		    localAdaptivePaymentsPortType = setupSoapClient(endpoint);
		    localPreapprovalResponse = localAdaptivePaymentsPortType.preapproval(paramPreapprovalRequest);
		    log.debug("SOAP request and response :" +output.toString());
		    }catch (PPFaultMessage ppf) {
		    	log.debug("SOAP request and response :" +output.toString());
		    	throw ppf;
		    }
	}
    return localPreapprovalResponse;
  }
  /**
   * Set the payment option with the given payment key.
   * @param setOptionsRequest
   * @return
   * @throws FatalException
   * @throws PPFaultMessage
   */
  public SetPaymentOptionsResponse setPaymentOption(SetPaymentOptionsRequest paramSetOptionsRequest) throws FatalException, PPFaultMessage{
	  SetPaymentOptionsResponse localSetPaymentOptionsResponse = null;
	  String payload="";
	  String serverResponse="";
	  String endpoint=apEndpoint + "SetPaymentOptions";
		if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload=JsonSerialiser.serializeObjectToJson(paramSetOptionsRequest);
			serverResponse=call(payload,endpoint);
			localSetPaymentOptionsResponse=(SetPaymentOptionsResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,SetPaymentOptionsResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload= XMLSerialiser.serializeObjectToXML(paramSetOptionsRequest,packageContext);
			serverResponse =  call(payload,endpoint);
			localSetPaymentOptionsResponse=(SetPaymentOptionsResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,SetPaymentOptionsResponse.class,packageContext);

		}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{ 
			  AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
			  localAdaptivePaymentsPortType = setupSoapClient(endpoint);
			  localSetPaymentOptionsResponse = localAdaptivePaymentsPortType.setPaymentOptions(paramSetOptionsRequest);
			  log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			} 
		}

	  return localSetPaymentOptionsResponse;
  }
  /**
   * Execute the payment Transaction with the requested payment key.
   * @param executePaymentRequest
   * @return
   * @throws FatalException
   * @throws PPFaultMessage
   */
  public ExecutePaymentResponse executePayment(ExecutePaymentRequest paramExecutePaymentRequest) throws FatalException,PPFaultMessage{
	  ExecutePaymentResponse localExecutePaymentResponse = null;
	  String payload="";
	  String serverResponse="";
	  String endpoint=apEndpoint + "ExecutePayment";
		if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload=JsonSerialiser.serializeObjectToJson(paramExecutePaymentRequest);
			serverResponse=call(payload,endpoint);
			localExecutePaymentResponse=(ExecutePaymentResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,ExecutePaymentResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload= XMLSerialiser.serializeObjectToXML(paramExecutePaymentRequest,packageContext);
			serverResponse =  call(payload,endpoint);
			localExecutePaymentResponse=(ExecutePaymentResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,ExecutePaymentResponse.class,packageContext);
		}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
			  AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
			  localAdaptivePaymentsPortType = setupSoapClient(endpoint);
			  localExecutePaymentResponse = localAdaptivePaymentsPortType.executePayment(paramExecutePaymentRequest);
			  log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

	  return localExecutePaymentResponse;

  }
  /**
   * Get Payment options for the requested payment key.
   * @param getOptionsRequest
   * @return
   * @throws FatalException
   * @throws PPFaultMessage
   */
  public GetPaymentOptionsResponse getPaymentOption(GetPaymentOptionsRequest paramGetOptionsRequest)throws FatalException, PPFaultMessage{
	  GetPaymentOptionsResponse localGetPaymentOptionsResponse = null;
	  String payload="";
	  String serverResponse="";
	  String endpoint=apEndpoint + "GetPaymentOptions";
	  if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
		  payload= JsonSerialiser.serializeObjectToJson(paramGetOptionsRequest);
		  serverResponse=call(payload,endpoint);
		  localGetPaymentOptionsResponse=(GetPaymentOptionsResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,GetPaymentOptionsResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload= XMLSerialiser.serializeObjectToXML(paramGetOptionsRequest,packageContext);
			serverResponse =  call(payload,endpoint);
			localGetPaymentOptionsResponse=(GetPaymentOptionsResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,GetPaymentOptionsResponse.class,packageContext);

		}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
			  AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
			  localAdaptivePaymentsPortType = setupSoapClient(endpoint);
			  localGetPaymentOptionsResponse = localAdaptivePaymentsPortType.getPaymentOptions(paramGetOptionsRequest);
			  log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

	  return localGetPaymentOptionsResponse;
  }
   /**
  
   * @param getAllowedFundingSourcesRequest
   * @return
   * @throws FatalException
   * @throws PPFaultMessage
   */
  public GetAllowedFundingSourcesResponse getAllowedFundingSources(GetAllowedFundingSourcesRequest paramGetAllowedFundingSourcesRequest)throws FatalException, PPFaultMessage{
	  GetAllowedFundingSourcesResponse localGetAllowedFundingSourcesResponse = null;
	  String payload="";
	  String serverResponse="";
	  String endpoint=apEndpoint + "GetAllowedFundingSources";
	  if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
		  payload= JsonSerialiser.serializeObjectToJson(paramGetAllowedFundingSourcesRequest);
		  serverResponse=call(payload,endpoint);
		  localGetAllowedFundingSourcesResponse=(GetAllowedFundingSourcesResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,GetAllowedFundingSourcesResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload= XMLSerialiser.serializeObjectToXML(paramGetAllowedFundingSourcesRequest,packageContext);
			serverResponse =  call(payload,endpoint);
			localGetAllowedFundingSourcesResponse=(GetAllowedFundingSourcesResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,GetAllowedFundingSourcesResponse.class,packageContext);

		}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
			  AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
			  localAdaptivePaymentsPortType = setupSoapClient(endpoint);
			  localGetAllowedFundingSourcesResponse = localAdaptivePaymentsPortType.getAllowedFundingSources(paramGetAllowedFundingSourcesRequest);
			  log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

	  return localGetAllowedFundingSourcesResponse;
  }
  
 /**
  
   * @param getAvailableShippingAddressesRequest
   * @return
   * @throws FatalException
   * @throws PPFaultMessage
   */
  public GetAvailableShippingAddressesResponse getAvailableShippingAddresses(GetAvailableShippingAddressesRequest paramGetAvailableShippingAddressesRequest)throws FatalException, PPFaultMessage{
	  GetAvailableShippingAddressesResponse localGetAvailableShippingAddressesResponse = null;
	  String payload="";
	  String serverResponse="";
	  String endpoint=apEndpoint + "GetAvailableShippingAddresses";
	  if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
		  payload= JsonSerialiser.serializeObjectToJson(paramGetAvailableShippingAddressesRequest);
		  serverResponse=call(payload,endpoint);
		  localGetAvailableShippingAddressesResponse=(GetAvailableShippingAddressesResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,GetAvailableShippingAddressesResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload= XMLSerialiser.serializeObjectToXML(paramGetAvailableShippingAddressesRequest,packageContext);
			serverResponse =  call(payload,endpoint);
			localGetAvailableShippingAddressesResponse=(GetAvailableShippingAddressesResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,GetAvailableShippingAddressesResponse.class,packageContext);

		}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
			  AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
			  localAdaptivePaymentsPortType = setupSoapClient(endpoint);
			  localGetAvailableShippingAddressesResponse = localAdaptivePaymentsPortType.getAvailableShippingAddresses(paramGetAvailableShippingAddressesRequest);
			  log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

	  return localGetAvailableShippingAddressesResponse;
  }
  public GetShippingAddressesResponse getShippingAddresses(GetShippingAddressesRequest paramGetShippingAddressesRequest)throws FatalException, PPFaultMessage{
	  GetShippingAddressesResponse localGetShippingAddressesResponse = null;
	  String payload="";
	  String serverResponse="";
	  String endpoint=apEndpoint + "GetShippingAddresses";
	  if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
		  payload= JsonSerialiser.serializeObjectToJson(paramGetShippingAddressesRequest);
		  serverResponse=call(payload,endpoint);
		  localGetShippingAddressesResponse=(GetShippingAddressesResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,GetShippingAddressesResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload= XMLSerialiser.serializeObjectToXML(paramGetShippingAddressesRequest,packageContext);
			serverResponse =  call(payload,endpoint);
			localGetShippingAddressesResponse=(GetShippingAddressesResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,GetShippingAddressesResponse.class,packageContext);

		}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
			  AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
			  localAdaptivePaymentsPortType = setupSoapClient(endpoint);
			  localGetShippingAddressesResponse = localAdaptivePaymentsPortType.getShippingAddresses(paramGetShippingAddressesRequest);
			  log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

	  return localGetShippingAddressesResponse;
  }
  public ConfirmPreapprovalResponse confirmPreapproval(ConfirmPreapprovalRequest paramConfirmPreapprovalRequest)throws FatalException, PPFaultMessage{
	  ConfirmPreapprovalResponse localConfirmPreapprovalResponse = null;
	  String payload="";
	  String serverResponse="";
	  String endpoint=apEndpoint + "ConfirmPreapproval";
	  if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
		  payload= JsonSerialiser.serializeObjectToJson(paramConfirmPreapprovalRequest);
		  serverResponse=call(payload,endpoint);
		  localConfirmPreapprovalResponse=(ConfirmPreapprovalResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,ConfirmPreapprovalResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload= XMLSerialiser.serializeObjectToXML(paramConfirmPreapprovalRequest,packageContext);
			serverResponse =  call(payload,endpoint);
			localConfirmPreapprovalResponse=(ConfirmPreapprovalResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,ConfirmPreapprovalResponse.class,packageContext);

		}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
			  AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
			  localAdaptivePaymentsPortType = setupSoapClient(endpoint);
			  localConfirmPreapprovalResponse = localAdaptivePaymentsPortType.confirmPreapproval(paramConfirmPreapprovalRequest);
			  log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

	  return localConfirmPreapprovalResponse;
  }

	public GetFundingPlansResponse getFundingPlans(
			GetFundingPlansRequest paramGetFundingPlansRequest)throws FatalException, PPFaultMessage{
	  GetFundingPlansResponse localGetFundingPlansResponse = null;
	  String payload="";
	  String serverResponse="";
	  String endpoint=apEndpoint + "GetFundingPlans";
	  if ("JSON".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
		  payload= JsonSerialiser.serializeObjectToJson(paramGetFundingPlansRequest);
		  serverResponse=call(payload,endpoint);
		  localGetFundingPlansResponse=(GetFundingPlansResponse)JsonSerialiser.deserializeJsonToObject(serverResponse,GetFundingPlansResponse.class);
		}
		else if ("XML".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			payload= XMLSerialiser.serializeObjectToXML(paramGetFundingPlansRequest,packageContext);
			serverResponse =  call(payload,endpoint);
			localGetFundingPlansResponse=(GetFundingPlansResponse)XMLSerialiser.deserializeXMLToObject(serverResponse,GetFundingPlansResponse.class,packageContext);

		}else if("SOAP11".equalsIgnoreCase(getClientprops().getProperty("X-PAYPAL-REQUEST-DATA-FORMAT")))
		{
			try{
			  AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
			  localAdaptivePaymentsPortType = setupSoapClient(endpoint);
			  localGetFundingPlansResponse = localAdaptivePaymentsPortType.getFundingPlans(paramGetFundingPlansRequest);
			  log.debug("SOAP request and response :" +output.toString());
			}catch (PPFaultMessage ppf) {
				log.debug("SOAP request and response :" +output.toString());
				throw ppf;
			}
		}

	  return localGetFundingPlansResponse;
  }

  private AdaptivePaymentsPortType setupSoapClient(String paramString) throws FatalException
  {
    AdaptivePaymentsPortType localAdaptivePaymentsPortType = null;
    localAdaptivePaymentsPortType = this.service.getAdaptivePaymentsSOAP11Http();
    BindingProvider localBindingProvider = (BindingProvider)localAdaptivePaymentsPortType;
    if (CallerServices.isLogging())
    	addLogHandler(localBindingProvider);
    	CallerServices.setupHeaders(localBindingProvider);
    	CallerServices.setupHttpProxyServer();
		CallerServices.setupEndPoint(localBindingProvider, paramString);
		return localAdaptivePaymentsPortType;
  }

}
