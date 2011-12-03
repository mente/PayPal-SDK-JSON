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
  <title>PayPal PHP SDK -SetFundingSourceConfirmed Details</title>
  <link href="sdk.css" rel="stylesheet" type="text/css">
</head>

<%

SetFundingSourceConfirmedResponse setConfirmedResponse=null;
try {
	
	SetFundingSourceConfirmedRequest fundingRequest=new SetFundingSourceConfirmedRequest();
	fundingRequest.setFundingSourceKey(request.getParameter("fundingSourceKey"));
	fundingRequest.setEmailAddress(request.getParameter("emailid"));
    
	RequestEnvelope requestEnvelope=new RequestEnvelope();
	requestEnvelope.setErrorLanguage("en_US");
	fundingRequest.setRequestEnvelope(requestEnvelope);
	
	AdaptiveAccounts aa = new AdaptiveAccounts();
	setConfirmedResponse  = aa.setFundingSourceConfirmed(fundingRequest);
	session.setAttribute("setConfirmedResponse", setConfirmedResponse);
	response.sendRedirect("SetFundingSourceConfirmedDetail.jsp");
} catch (PPFaultMessage e) {
	session.setAttribute("exception", e);
	response.sendRedirect("APIError.jsp"); 		
} catch (Exception e) {
	session.setAttribute("exception", e);
	response.sendRedirect("Error.jsp"); 		
}
%>

