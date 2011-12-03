<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="adaptivepayments.AdaptivePayments"%>
<%@ page import="src.paypalsamples.utils.*"%>
<%@ page import="common.com.paypal.platform.sdk.exceptions.*"%>
<%@ page import="com.paypal.svcs.types.ap.*"%>
<%@ page import="com.paypal.svcs.types.common.*"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page import="java.io.IOException"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ include file='constants.jsp'%>
<%@ page language="java"%>
<html>
<head>
<title>PayPal Platform SDK - Adaptive Payments</title>
<link href="common/style.css" rel="stylesheet" type="text/css" />
</head>
<body >

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
		String cancelURL = url.toString() + "/samples/CreatePay.jsp";
		String[] receiverEmailItems = request
				.getParameterValues("receiveremail");
		String[] amountItems = request.getParameterValues("amount");
		ReceiverList list = new ReceiverList();
		for (int i = 0; i < receiverEmailItems.length; i++) {
			String recreceiverEmail = receiverEmailItems[i];
			if (recreceiverEmail != null
					&& recreceiverEmail.length() != 0) {
				Receiver rec1 = new Receiver();
				rec1.setAmount(new BigDecimal(amountItems[i]));
				rec1.setEmail(receiverEmailItems[i]);
				list.getReceiver().add(rec1);

			}
		}
		PayRequest payRequest = new PayRequest();
		ClientDetailsType cl = new ClientDetailsType();
		RequestEnvelope en = new RequestEnvelope();
		payRequest.setCancelUrl(cancelURL);
		payRequest.setReturnUrl(returnURL);
		payRequest.setSenderEmail((String) request
				.getParameter("email"));
		payRequest.setCurrencyCode((String) request
				.getParameter("currencyCode"));
		payRequest.setClientDetails(ClientInfoUtil.getMyAppDetails());
		payRequest.setReceiverList(list);
		payRequest.setRequestEnvelope(ClientInfoUtil
				.getMyAppRequestEnvelope());
		payRequest.setActionType((String)request.getParameter("actionType"));
		String pkey =request.getParameter("preapprovalKey");
		if (pkey !=null & pkey.length() > 0) {
			payRequest.setPreapprovalKey(pkey);
		}
		AdaptivePayments ap = new AdaptivePayments();
		PayResponse payResp = ap.pay(payRequest);
		session.setAttribute("payResponseRef", payResp);
		
		//String nextUrl = "https://www." + testEnv
			//+ ".paypal.com/cgi-bin/webscr?cmd=_ap-payment&paykey="
				//+ payResp.getPayKey();
		
		//if (payResp.getPaymentExecStatus().equalsIgnoreCase("CREATED")) {
			//response.sendRedirect("SetPaymentOption.jsp?payKey="+payResp.getPayKey());
		//} else {
			//response.sendRedirect(nextUrl);
		//}
%> 

<br/>
        <div id="jive-wrapper">
            <div id="jive-header">
                <div id="logo">
                    <span >You must be Logged in to <a href="https://<%=devCentral%>.paypal.com" target="_blank">PayPal sandbox</a></span>
                    <a title="Paypal X Home" href="#"><div id="titlex"></div></a>
                </div>
            </div>

<div id="main" >

<%@ include file='menu.html'%>
<div id="request_form" >
<center><h3>Pay - Create, Set, Execute API Flow</h3>
<p class="header2"><b>Pay(Create Payment) - Response</b></p>
</center>
<br>
 <table  align="center" width="50%">
 

	<tr>
	   <td class="thinfield">PayKey:</td>
	   <td class="thinfield"><%=payResp!=null?payResp.getPayKey():"" %></td>
	</tr>
	<tr>
	   <td class="thinfield">PaymentExecStatus:</td>
	   <td class="thinfield"><%=payResp!=null?payResp.getPaymentExecStatus():"" %></td>
	</tr>
	
 </table>
 <br/>
 <table align="center" width="50%">
    <tr>
   
      <td class="thinfield"><a href="SetPaymentOption.jsp?payKey=<%=payResp.getPayKey()%>">* (Optional)Set Payment Options</a></td>
    </tr>
    <tr>
	
      <td class="thinfield"><a href="ExecutePayment.jsp?payKey=<%=payResp.getPayKey()%>">* Execute Payment</a></td>
    </tr>
 </table>

<%
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


</div>
</div>
</div>
</body>
</html>