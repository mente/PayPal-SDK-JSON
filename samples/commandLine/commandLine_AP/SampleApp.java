import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import src.paypalsamples.utils.DateUtil;

import com.paypal.svcs.services.PPFaultMessage;
import com.paypal.svcs.types.ap.CancelPreapprovalRequest;
import com.paypal.svcs.types.ap.CancelPreapprovalResponse;
import com.paypal.svcs.types.ap.ConfirmPreapprovalRequest;
import com.paypal.svcs.types.ap.ConfirmPreapprovalResponse;
import com.paypal.svcs.types.ap.ConvertCurrencyRequest;
import com.paypal.svcs.types.ap.ConvertCurrencyResponse;
import com.paypal.svcs.types.ap.CurrencyCodeList;
import com.paypal.svcs.types.ap.CurrencyConversionList;
import com.paypal.svcs.types.ap.CurrencyList;
import com.paypal.svcs.types.ap.DisplayOptions;
import com.paypal.svcs.types.ap.ExecutePaymentRequest;
import com.paypal.svcs.types.ap.ExecutePaymentResponse;
import com.paypal.svcs.types.ap.GetAllowedFundingSourcesRequest;
import com.paypal.svcs.types.ap.GetAllowedFundingSourcesResponse;
import com.paypal.svcs.types.ap.GetAvailableShippingAddressesRequest;
import com.paypal.svcs.types.ap.GetAvailableShippingAddressesResponse;
import com.paypal.svcs.types.ap.GetFundingPlansRequest;
import com.paypal.svcs.types.ap.GetFundingPlansResponse;
import com.paypal.svcs.types.ap.GetPaymentOptionsRequest;
import com.paypal.svcs.types.ap.GetPaymentOptionsResponse;
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
import com.paypal.svcs.types.ap.Receiver;
import com.paypal.svcs.types.ap.ReceiverList;
import com.paypal.svcs.types.ap.RefundRequest;
import com.paypal.svcs.types.ap.RefundResponse;
import com.paypal.svcs.types.ap.SetPaymentOptionsRequest;
import com.paypal.svcs.types.ap.SetPaymentOptionsResponse;
import com.paypal.svcs.types.common.ClientDetailsType;
import com.paypal.svcs.types.common.CurrencyType;
import com.paypal.svcs.types.common.RequestEnvelope;
import common.com.paypal.platform.sdk.exceptions.FatalException;

public class SampleApp {
	ClientDetailsType cl = new ClientDetailsType();
	ClientDetailsType acl = new ClientDetailsType();
	RequestEnvelope en = new RequestEnvelope();
	Receiver rec1 = new Receiver();
	adaptivepayments.AdaptivePayments ap = null;

	public static void main(String[] args) {
		try {
			SampleApp app = new SampleApp();
			app.ap = new adaptivepayments.AdaptivePayments();
			String paykey = app.pay();
			String preapprovalKey = app.preapproval();
			app.refund(paykey);
			app.paymentDetails(paykey);
			app.getAllowedFundingSources(preapprovalKey);
			app.confirmPreapproval(preapprovalKey);
			
			app.cancelPreapproval(preapprovalKey);
			app.preapprovalDetails(preapprovalKey);
			String[] fromcodes = { "USD", "EUR" };
			String[] tocodes = { "GBP", "JPY", "CAD" };
			app.convertCurrency(fromcodes, tocodes);

			// New AP Features
			String pKey = app.createPay();
			app.getAvailableShippingAddresses(pKey);
			app.getShippingAddresses(pKey);
			app.getFundingPlans(pKey);
			app.setPayOption(pKey);
			app.executePay(pKey);
			app.getPayOption(pKey);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String pay() throws FatalException {
		PayResponse response = null;
		try {
			PayRequest request = new PayRequest();
			ReceiverList list = new ReceiverList();
			rec1.setAmount(new BigDecimal(1.0));
			rec1.setEmail("platfo_1255170694_biz@gmail.com");
			list.getReceiver().add(rec1);
			en.setErrorLanguage("en_US");
			cl.setDeviceId("pudurSDK");
			cl.setIpAddress("127.0.0.1");
			cl.setApplicationId("APP-1JE4291016473214C");
			request.setCancelUrl("http://www.google.com");
			request.setReturnUrl("http://www.google.com");
			request.setSenderEmail("Platfo_1255077030_biz@gmail.com");
			request.setCurrencyCode("USD");
			request.setClientDetails(cl);
			request.setReceiverList(list);
			request.setRequestEnvelope(en);
			request.setActionType("PAY");
			response = ap.pay(request);
			System.out.println("********** Pay: Success: Created payKey is "
					+ response.getPayKey());
		} catch (Exception fe) {
			throw new FatalException(fe);

		}
		return response.getPayKey();
	}

	public void paymentDetails(String key) throws FatalException {
		try {

			PaymentDetailsRequest paydetailReq = new PaymentDetailsRequest();
			paydetailReq.setPayKey(key);
			paydetailReq.setRequestEnvelope(en);
			adaptivepayments.AdaptivePayments apd = new adaptivepayments.AdaptivePayments(
					"config/paypal_sdk_client.properties");
			PaymentDetailsResponse paydetailsResp = apd
					.paymentDetails(paydetailReq);
			System.out
					.println("********** PaymentDetails: Success: Pay Key from paymentDetails "
							+ paydetailsResp.getPayKey());

		} catch (Exception fe) {
			throw new FatalException(fe);

		}

	}

	public void refund(String key) throws FatalException {
		try {
			// Refund
			RefundRequest refundReq = new RefundRequest();
			refundReq.setPayKey(key);
			refundReq.setCurrencyCode("USD");
			ReceiverList refundlist = new ReceiverList();
			Receiver refundrec = new Receiver();
			refundrec.setAmount(new BigDecimal(0.05));
			refundrec.setEmail("platfo_1255170694_biz@gmail.com");
			refundlist.getReceiver().add(rec1);
			refundReq.setReceiverList(refundlist);
			refundReq.setRequestEnvelope(en);
			RefundResponse refundResp = ap.refund(refundReq);
			System.out
					.println("********** Refund: Success: currency code used for refund is "
							+ refundResp.getCurrencyCode());

		} catch (PPFaultMessage fe) {
			System.out.println("********** Pay Failed due to invalid data!"
					+ fe.getMessage());

		}
	}

	public String preapproval() throws FatalException {
		String preapprovalKey = null;
		try {
			PreapprovalRequest approvalReq = new PreapprovalRequest();
			approvalReq.setSenderEmail("Platfo_1255077030_biz@gmail.com");
			approvalReq.setCurrencyCode("USD");
			DatatypeFactory df = DatatypeFactory.newInstance();
			XMLGregorianCalendar start = DateUtil.getNextMonthDate();
			approvalReq.setMaxAmountPerPayment(new BigDecimal(1.0));
			XMLGregorianCalendar end = DateUtil.getNextYearDate();
			approvalReq.setStartingDate(start);
			approvalReq.setEndingDate(end);
			approvalReq.setMaxNumberOfPayments(10);
			approvalReq.setClientDetails(cl);
			approvalReq.setCancelUrl("http://www.google.com");
			approvalReq.setReturnUrl("http://www.google.com");
			approvalReq.setMaxTotalAmountOfAllPayments(new BigDecimal(50.0));
			approvalReq.setRequestEnvelope(en);
			PreapprovalResponse approvalresponse = ap.preapproval(approvalReq);
			preapprovalKey = approvalresponse.getPreapprovalKey();
			System.out
					.println("********** Preapproval: Success: Preapproval Key is "
							+ preapprovalKey);

		} catch (PPFaultMessage fe) {
			System.out
					.println("********** Preapproval: Failed due to invalid data!"
							+ fe.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return preapprovalKey;
	}

	public void preapprovalDetails(String key) throws FatalException {
		try {
			PreapprovalDetailsRequest approvaldetailsReq = new PreapprovalDetailsRequest();
			approvaldetailsReq.setPreapprovalKey(key);
			approvaldetailsReq.setRequestEnvelope(en);
			PreapprovalDetailsResponse paDetailsResp = ap
					.preapprovalDetails(approvaldetailsReq);
			System.out
					.println("********** PreapprovalDetails: Success: Preapproval status: "
							+ paDetailsResp.getResponseEnvelope().getAck());
		} catch (PPFaultMessage fe) {
			System.out
					.println("********** PreapprovalDeatils Failed due to invalid data!"
							+ fe.getMessage());

		}

	}

	public void cancelPreapproval(String key) throws FatalException {
		try {
			CancelPreapprovalRequest req = new CancelPreapprovalRequest();
			req.setPreapprovalKey(key);
			req.setRequestEnvelope(en);
			CancelPreapprovalResponse resp = ap.cancelPreapproval(req);
			System.out
					.println("********** CancelPreapproval: Cancellation status:"
							+ resp.getResponseEnvelope().getAck());
		} catch (PPFaultMessage fe) {
			System.out
					.println("********** CancelPreapproval: Failed due to invalid data!"
							+ fe.getMessage());
		}

	}

	public void convertCurrency(String[] fromcodes, String[] tocodes)
			throws FatalException {
		try {
			CurrencyList clist = new CurrencyList();
			CurrencyCodeList cclist = new CurrencyCodeList();
			for (int i = 0; i < 2; i++) {
				CurrencyType ct = new CurrencyType();
				ct.setAmount(new BigDecimal(100.0));
				ct.setCode(fromcodes[i]);
				clist.getCurrency().add(ct);

			}
			for (int i = 0; i < tocodes.length; i++) {
				cclist.getCurrencyCode().add(tocodes[i]);

			}
			System.out
					.println("********** Converting currencies 100USD, and 100EUR ");
			ConvertCurrencyRequest creq = new ConvertCurrencyRequest();
			creq.setBaseAmountList(clist);
			creq.setConvertToCurrencyList(cclist);
			creq.setRequestEnvelope(en);
			ConvertCurrencyResponse ccresp = ap.convertCurrency(creq);
			for (Iterator<CurrencyConversionList> iterator = ccresp
					.getEstimatedAmountTable().getCurrencyConversionList()
					.iterator(); iterator.hasNext();) {
				CurrencyConversionList ccclist = iterator.next();
				System.out.print(ccclist.getBaseAmount().getCode()
						+ ccclist.getBaseAmount().getAmount() + " -> ");
				List l = ccclist.getCurrencyList().getCurrency();
				for (int i = 0; i < l.size(); i++) {
					CurrencyType ct = (CurrencyType) l.get(i);
					System.out.print(ct.getCode() + ct.getAmount() + ", ");
				}
				System.out.println();

			}

		} catch (PPFaultMessage fe) {
			System.out
					.println("********** ConvertCurrency Failed due to invalid data!"
							+ fe.getMessage());

		}
	}

	public String createPay() throws FatalException {
		PayResponse response = null;
		try {
			PayRequest request = new PayRequest();
			ReceiverList list = new ReceiverList();
			rec1.setAmount(new BigDecimal(1.0));
			rec1.setEmail("platfo_1255170694_biz@gmail.com");
			list.getReceiver().add(rec1);
			en.setErrorLanguage("en_US");
			cl.setDeviceId("pudurSDK");
			cl.setIpAddress("127.0.0.1");
			cl.setApplicationId("APP-1JE4291016473214C");
			request.setCancelUrl("http://www.google.com");
			request.setReturnUrl("http://www.google.com");
			request.setSenderEmail("Platfo_1255077030_biz@gmail.com");
			request.setCurrencyCode("USD");
			request.setClientDetails(cl);
			request.setReceiverList(list);
			request.setRequestEnvelope(en);
			request.setActionType("CREATE");
			response = ap.pay(request);
			System.out
					.println("********** CreatePay: Success: Created payKey is "
							+ response.getPayKey());
		} catch (Exception fe) {
			throw new FatalException(fe);

		}
		return response.getPayKey();
	}

	public void setPayOption(String payKey) throws FatalException {
		try {
			SetPaymentOptionsRequest setOptionsRequest = new SetPaymentOptionsRequest();
			setOptionsRequest.setPayKey(payKey);

			DisplayOptions displayOptions = new DisplayOptions();
			displayOptions
					.setEmailHeaderImageUrl("http://bankone.com/images/emailHeaderImage.jpg");
			displayOptions
					.setEmailMarketingImageUrl("http://bankone.com/images/emailMarketingImage.jpg");
			setOptionsRequest.setDisplayOptions(displayOptions);

			// InitiatingEntity initiatingEntity = new InitiatingEntity();
			// InstitutionCustomer institutionCustomer = new
			// InstitutionCustomer();
			// institutionCustomer.setCountryCode((String)request.getParameter("countryCode"));
			// institutionCustomer.setDisplayName((String)request.getParameter("displayName"));
			// institutionCustomer.setEmail((String)request.getParameter("email"));
			// institutionCustomer.setFirstName((String)request.getParameter("firstName"));
			// institutionCustomer.setLastName((String)request.getParameter("lastName"));
			// institutionCustomer.setInstitutionCustomerId((String)request.getParameter("customerId"));
			// institutionCustomer.setInstitutionId((String)request.getParameter("institutionId"));
			// initiatingEntity.setInstitutionCustomer(institutionCustomer);
			// setOptionsRequest.setInitiatingEntity(initiatingEntity);

			RequestEnvelope en = new RequestEnvelope();
			en.setErrorLanguage("en_US");
			setOptionsRequest.setRequestEnvelope(en);

			SetPaymentOptionsResponse setOptionsResponse = ap
					.setPaymentOption(setOptionsRequest);
			System.out.println("********** SetPayOption: Success");
		} catch (Exception e) {
			throw new FatalException(e);
		}
	}

	public void executePay(String payKey) throws FatalException {
		try {
			ExecutePaymentRequest exePay = new ExecutePaymentRequest();
			exePay.setPayKey(payKey);

			RequestEnvelope en = new RequestEnvelope();
			en.setErrorLanguage("en_US");
			exePay.setRequestEnvelope(en);

			ExecutePaymentResponse executePaymentResponse = ap
					.executePayment(exePay);
			System.out
					.println("********** ExecutePay: Success: Execution Status "
							+ executePaymentResponse.getPaymentExecStatus());
		} catch (Exception e) {
			throw new FatalException(e);
		}
	}

	public void getPayOption(String payKey) throws FatalException {
		try {
			GetPaymentOptionsRequest getPayOp = new GetPaymentOptionsRequest();
			getPayOp.setPayKey(payKey);

			RequestEnvelope en = new RequestEnvelope();
			en.setErrorLanguage("en_US");
			getPayOp.setRequestEnvelope(en);

			GetPaymentOptionsResponse paymentResponse = ap
					.getPaymentOption(getPayOp);
			System.out
					.println("********** GetPayOption: Success: EmailHeaderURL  "
							+ paymentResponse.getDisplayOptions()
									.getEmailHeaderImageUrl());
		} catch (Exception e) {
			throw new FatalException(e);
		}
	}

	public void getShippingAddresses(String payKey) throws FatalException {
		try {

			GetShippingAddressesRequest req = new GetShippingAddressesRequest();
			req.setKey(payKey);
			RequestEnvelope en = new RequestEnvelope();
			en.setErrorLanguage("en_US");
			req.setRequestEnvelope(en);
			GetShippingAddressesResponse resp = ap.getShippingAddresses(req);
			System.out.println("ShippingAddresses................"
					+ resp.getResponseEnvelope().getAck());
		} catch (Exception e) {
			throw new FatalException(e);
		}
	}

	public void getAvailableShippingAddresses(String payKey)
			throws FatalException {
		try {
			GetAvailableShippingAddressesRequest req = new GetAvailableShippingAddressesRequest();
			req.setKey(payKey);
			RequestEnvelope en = new RequestEnvelope();
			en.setErrorLanguage("en_US");
			req.setRequestEnvelope(en);
			GetAvailableShippingAddressesResponse resp = ap
					.getAvailableShippingAddresses(req);
			System.out.println("AvailableShippingAddresses................"
					+ resp.getAvailableAddress().size());
		} catch (Exception e) {
			throw new FatalException(e);
		}
	}

	public void confirmPreapproval(String preapprovalKey) throws FatalException {
		try {
			ConfirmPreapprovalRequest req = new ConfirmPreapprovalRequest();
			req.setPreapprovalKey(preapprovalKey);
			RequestEnvelope en = new RequestEnvelope();
			en.setErrorLanguage("en_US");
			req.setRequestEnvelope(en);
			ConfirmPreapprovalResponse resp = ap.confirmPreapproval(req);
			System.out.println("Confirm Preapproval........"
					+ resp.getResponseEnvelope().getAck());
		} catch (Exception e) {
			throw new FatalException(e);
		}
	}

	public void getFundingPlans(String payKey) throws FatalException {
		try {

			GetFundingPlansRequest req = new GetFundingPlansRequest();
			req.setPayKey(payKey);
			RequestEnvelope en = new RequestEnvelope();
			en.setErrorLanguage("en_US");
			req.setRequestEnvelope(en);
			GetFundingPlansResponse resp = ap.getFundingPlans(req);
			System.out.println("GetFundingPlans........"
					+ resp.getFundingPlan().size());
		} catch (Exception e) {
			throw new FatalException(e);
		}
	}

	public void getAllowedFundingSources(String preapprovalKey)
			throws FatalException {
		try {

			GetAllowedFundingSourcesRequest req = new GetAllowedFundingSourcesRequest();
			req.setKey(preapprovalKey);
			RequestEnvelope en = new RequestEnvelope();
			en.setErrorLanguage("en_US");
			req.setRequestEnvelope(en);
			GetAllowedFundingSourcesResponse resp = ap
					.getAllowedFundingSources(req);
			System.out.println("GetAllowedFundingSources........"
					+ resp.getResponseEnvelope().getAck());
		} catch (Exception e) {
			throw new FatalException(e);
		}
	}
}
