<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="adaptivepayments.AdaptivePayments"%>
<%@ page import="common.com.paypal.platform.sdk.utils.*"%>
<%@ page import="com.paypal.svcs.types.ap.*"%>
<%@ page import="common.com.paypal.platform.sdk.exceptions.*"%>
<%@ page import="com.paypal.svcs.types.common.*"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.io.IOException"%>
<%@ page language="java"%>
<html>
<head>
<title>PayPal JSP SDK - Adaptive Payments- Payment details</title>
<link href="common/style.css" rel="stylesheet" type="text/css" />
<%@ include file='constants.jsp'%>
</head>
<body >
<br/>
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
    CancelPreapprovalResponse resp=null;
    String preapprovalKey="";   
    if(!SSLUtil.isEmpty((String)request.getParameter("preapprovalKey"))) {
    	preapprovalKey=(String)request.getParameter("preapprovalKey");
    } 
    
  //  else {		
 //		throw new Exception("Preapproval key is missing");
 //	}		
	 
try {		   
	CancelPreapprovalRequest req = new CancelPreapprovalRequest();
	RequestEnvelope en = new RequestEnvelope();
	en.setErrorLanguage("en_US");
	req.setPreapprovalKey(preapprovalKey);
	req.setRequestEnvelope(en);
	AdaptivePayments ap = new AdaptivePayments();
	resp =  ap.cancelPreapproval(req);		 			
%>

<table width=500>
<tr>
<h3>AP
- Preapproval</h3> <br>

<b>Preapproval Cancelled!</b>
<br>
</tr>
	<tr>
		<td class="thinfield">Transaction Status:</td>
		<td class="thinfield"><%=resp.getResponseEnvelope().getAck() %></td>
	</tr>
	<tr>
		<td class="thinfield">CorrelationId:</td>
		<td class="thinfield"><%=resp.getResponseEnvelope().getCorrelationId() %></td>
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