<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="adaptivepayments.AdaptivePayments"%>
<%@ page import="com.paypal.svcs.types.ap.*"%>
<%@ page import="com.paypal.svcs.types.common.*"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page import="common.com.paypal.platform.sdk.exceptions.*"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ page import="java.io.IOException"%>
<%@ page import="src.paypalsamples.utils.*"%>
<%@ include file='constants.jsp'%>
<%@ page language="java"%>
<html>
<head>
<title>PayPal Platform SDK - Adaptive Payments</title>
</head>
<body alink=#0000FF vlink=#0000FF>
<center><font size=2 color=black face=Verdana><b>Pay</b></font>

<%
	try {
		StringBuilder url = new StringBuilder();
		url.append("http://");
		url.append(request.getServerName());
		url.append(":");
		url.append(request.getServerPort());
		url.append(request.getContextPath());
		String returnURL = url.toString()
				+ "/samples/PaymentDetails.jsp?payKey=${payKey}";
		String cancelURL = url.toString() + "/samples/SetPayChained.jsp";
		String[] receiverEmailItems=request.getParameterValues("receiveremail");
		String[] amountItems=request.getParameterValues("amount");		
		String[] primaryItems = request.getParameterValues("primary");
		ReceiverList list = new ReceiverList();
		for(int i=0;i<receiverEmailItems.length; i++)
		{
			String recreceiverEmail=receiverEmailItems[i];
			//if(recreceiverEmail != null && recreceiverEmail.length()!= 0)
			//{
				Receiver rec1 = new Receiver();
				rec1.setAmount(new BigDecimal(amountItems[i]));
				rec1.setEmail(receiverEmailItems[i]);
				if ("true".equalsIgnoreCase(primaryItems[i])) {
					rec1.setPrimary(true);
				} else {
					rec1.setPrimary(false);	
				}				
				list.getReceiver().add(rec1);
				
			//}								
		}		
		PayRequest payRequest   = new PayRequest();		
		ClientDetailsType cl = new ClientDetailsType();
		RequestEnvelope en = new RequestEnvelope();
		payRequest.setMemo((String) request.getParameter("memo"));
		payRequest.setFeesPayer((String) request.getParameter("feesPayer"));
		payRequest.setCancelUrl(cancelURL);
		payRequest.setReturnUrl(returnURL);
		payRequest.setSenderEmail((String)request.getParameter("email"));
		payRequest.setCurrencyCode((String)request.getParameter("currencyCode"));
		payRequest.setClientDetails(ClientInfoUtil.getMyAppDetails());
		payRequest.setReceiverList(list);
		payRequest.setRequestEnvelope(ClientInfoUtil.getMyAppRequestEnvelope());
		payRequest.setActionType("PAY");
		AdaptivePayments ap = new AdaptivePayments();
		PayResponse payResp  = ap.pay(payRequest);
		System.out.println("**** 1.Pay: Success: Created payKey is "+ payResp.getPayKey());
		session.setAttribute("payResponseRef", payResp);			    
	        String nextUrl="https://www."+testEnv+".paypal.com/cgi-bin/webscr?cmd=_ap-payment&paykey="+payResp.getPayKey();
	    	if (payResp.getPaymentExecStatus()
				.equalsIgnoreCase("COMPLETED")) {
			response.sendRedirect("PaymentDetails.jsp?payKey="+payResp.getPayKey());
		} else {
			response.sendRedirect(nextUrl);
		}
%> <%
	} catch (PPFaultMessage e) {
		session.setAttribute("exception", e);
		response.sendRedirect("APIError.jsp"); 	
	} catch (SSLConnectionException e) {
		session.setAttribute("exception", e);
		response.sendRedirect("ConfigError.jsp"); 		
	} catch (IOException e) {
		session.setAttribute("exception", e);
		response.sendRedirect("ConfigError.jsp"); 		
	} catch (Exception e) {
		session.setAttribute("exception", e);
		response.sendRedirect("Error.jsp"); 		
	}
 %>
</center>
<a id="CallsLink" href="Calls.jsp">Home</a>
</body>
</html>