<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="adaptivepayments.AdaptivePayments"%>
<%@ page import="common.com.paypal.platform.sdk.utils.*"%>
<%@ page import="com.paypal.svcs.types.ap.*"%>
<%@ page import="java.io.IOException"%>
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
<div id="jive-wrapper">
            <div id="jive-header">
                <div id="logo">
                	<span >You must be Logged in to <a href="https://<%=devCentral%>.paypal.com" target="_blank">PayPal sandbox</a></span>
                    <a title="Paypal X Home" href="#"><div id="titlex"></div></a>
                </div>
            </div>
		
<div id="main">
<%@ include file='menu.html'%>

<div id="request_form">
<%
PreapprovalDetailsResponse paDetailsResp=null;
//PreapprovalResponse pr  = (PreapprovalResponse)session.getValue("appRespRef");  
String preapprovalKey="";

if(!SSLUtil.isEmpty((String)request.getParameter("preapprovalKey"))) {
	preapprovalKey =(String)request.getParameter("preapprovalKey");
} 
//else {		
	// if (pr != null) {
		// preapprovalKey =pr.getPreapprovalKey();
	 //}
//}	 
try {
			   
	PreapprovalDetailsRequest approvaldetailsReq = new PreapprovalDetailsRequest();
	RequestEnvelope en = new RequestEnvelope();
	en.setErrorLanguage("en_US");
	approvaldetailsReq.setPreapprovalKey(preapprovalKey);
	approvaldetailsReq.setRequestEnvelope(en);
	AdaptivePayments ap = new AdaptivePayments();
	paDetailsResp = ap.preapprovalDetails(approvaldetailsReq);
			
%>

<table width=500>
<tr>
<h3>AP- Preapproval Details</h3> <br>

<b>Thank you for your Contract!</b><br>
<br>
</tr>
	<tr>
       <td class="thinfield">Preapproval Key: </td>
       <td class="thinfield"><%= preapprovalKey %> </td>
    </tr>
	<tr>
		<td class="thinfield">CurPaymentsAmount:</td>
		<td class="thinfield"><%=paDetailsResp.getCurPaymentsAmount() %></td>
	</tr>
	<tr>
		<td class="thinfield">Status:</td>
		<td class="thinfield"><%=paDetailsResp.getStatus()%></td>
	</tr>
	<tr>
		<td class="thinfield">curPeriodAttempts:</td>
		<td class="thinfield"><%=paDetailsResp.getCurPeriodAttempts()%></td>
	</tr>
	<tr>
		<td class="thinfield">Approval Status:</td>
		<td class="thinfield"><%=paDetailsResp.isApproved()%></td>
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

</br>

</div>
</div>
</div>
</body>
</html>