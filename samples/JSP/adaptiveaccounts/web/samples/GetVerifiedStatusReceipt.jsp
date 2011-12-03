<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="adaptiveaccounts.AdaptiveAccounts"%>
<%@ page import="com.paypal.svcs.types.aa.*"%>
<%@ page import="java.io.IOException"%>
<%@ page import="com.paypal.svcs.types.common.*"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ page import="javax.xml.datatype.XMLGregorianCalendar"%>
<%@ page import="javax.xml.datatype.DatatypeFactory"%>
<%@ page import="src.paypalsamples.utils.*"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ page import="java.util.*"%>
<%@ include file='constants.jsp'%>

<%@ page language="java"%>

<%@page import="java.math.BigInteger"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<title>PayPal Platform SDK - Get Verified Status</title>
<link href="common/style.css" rel="stylesheet" type="text/css" />
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
GetVerifiedStatusResponse getVerifiedStatusResponse=null;
   try{
	   
	   GetVerifiedStatusRequest getStatusRequest=new GetVerifiedStatusRequest();
	   getStatusRequest.setRequestEnvelope(ClientInfoUtil.getMyAppRequestEnvelope());
	   getStatusRequest.setEmailAddress((String)request.getParameter("emailID"));
	   getStatusRequest.setFirstName((String)request.getParameter("firstName"));
	   getStatusRequest.setLastName((String)request.getParameter("lastName"));
	   getStatusRequest.setMatchCriteria((String)request.getParameter("matchCrieteria"));
	   
	   AdaptiveAccounts aa = new AdaptiveAccounts();
	   getVerifiedStatusResponse  = aa.getVerifiedStatus(getStatusRequest);
	   String status=getVerifiedStatusResponse.getAccountStatus();
	   
   }catch (PPFaultMessage e) {
		session.setAttribute("exception", e);
		response.sendRedirect("APIError.jsp"); 		
	}  catch (Exception e) {
		session.setAttribute("exception", e);
		response.sendRedirect("Error.jsp"); 
	}	

%>
<% if(getVerifiedStatusResponse != null){ %>

   	<table width=400>
	<tr>
		<h3>Account Verified Status!</h3> <br>
   	</tr>
   		<tr>
   			<td class="thinfield">Status:</td>
   			<td class="thinfield"><%=getVerifiedStatusResponse.getAccountStatus() %></td>
   		</tr>		
    </table>
<%}%>  

</div>
</div>
</div>
</body>
</html>
