<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="adaptivepayments.AdaptivePayments"%>
<%@ page import="common.com.paypal.platform.sdk.utils.*"%>
<%@ page import="com.paypal.svcs.types.ap.*"%>
<%@ page import="common.com.paypal.platform.sdk.exceptions.*"%>
<%@ page import="com.paypal.svcs.types.common.*"%>
<%@ page import="common.com.paypal.platform.sdk.utils.*"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ page import="java.util.HashMap;"%>
<%@ page language="java"%>
<html>
<head>
<title>PayPal JSP SDK - Adaptive Payments- Payment details</title>
<link href="common/style.css" rel="stylesheet" type="text/css" />
<%@ include file='constants.jsp'%>
</head>
<body >
<br />
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
<%
   //PayResponse pr  = (PayResponse)session.getValue("payResponseRef");  
   String payKey="";
   
    if(!SSLUtil.isEmpty((String)request.getParameter("payKey"))) {
	 	  payKey =(String)request.getParameter("payKey");
    }
    
    //else {		
	//	 if ( pr != null) {
	//		 	payKey =pr.getPayKey();
	//	 }
	//}		
	 
try {		   
	PaymentDetailsRequest paydetailReq = new PaymentDetailsRequest();
	RequestEnvelope en = new RequestEnvelope();
	en.setErrorLanguage("en_US");
	paydetailReq.setPayKey(payKey);
	paydetailReq.setRequestEnvelope(en);
	AdaptivePayments ap = new AdaptivePayments();
	PaymentDetailsResponse paydetailsResp =	 ap.paymentDetails(paydetailReq);	
	 			
%>

<center><h3>AP - Payment Details </h3>
<p class="header2"><b>Thank you for your payment!</b></p>
</center>
<br>
<table align="center" width="50%">

    <tr>
		<td class="thinfield">TransactionId:</td>
		<td class="thinfield"><%=((PaymentInfo)(paydetailsResp.getPaymentInfoList().getPaymentInfo().get(0))).getTransactionId()%></td>
	</tr>
	<tr>
		<td class="thinfield">Transaction Status:</td>
		<td class="thinfield"><%=paydetailsResp.getStatus()%></td>
	</tr>
	<tr>
		<td class="thinfield">PayKey:</td>
		<td class="thinfield"><%=paydetailsResp.getPayKey()%></td>
	</tr>
	<tr>
		<td class="thinfield">SenderEmail:</td>
		<td class="thinfield"><%=paydetailsResp.getSenderEmail()%></td>
	</tr>
	<tr>
		<td class="thinfield">ActionType:</td>
		<td class="thinfield" ><%=paydetailsResp.getActionType()%></td>
	</tr>
	<tr>
		<td class="thinfield">FeesPayer:</td>
		<td class="thinfield"><%=paydetailsResp.getFeesPayer()%></td>
	</tr>
	<tr>
		<td class="thinfield">ReverseAllParallelPaymentsOnError:</td>
		<td class="thinfield"><%=paydetailsResp.isReverseAllParallelPaymentsOnError()%></td>
	</tr>
	<tr>
		<td class="thinfield">Currency:</td>
		<td class="thinfield"><%= paydetailsResp.getCurrencyCode() %>
		</td>
	</tr>

</table>

<%
} catch (PPFaultMessage e) {
	session.setAttribute("exception", e);
	response.sendRedirect("APIError.jsp"); 	
} catch (Exception e) {
	session.setAttribute("exception", e);
	response.sendRedirect("APIError.jsp"); 		
}
%>

</div>
</div>
</div>
</body>
</html>