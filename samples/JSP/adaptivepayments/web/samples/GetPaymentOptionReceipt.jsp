<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="adaptivepayments.AdaptivePayments"%>
<%@ page import="com.paypal.svcs.types.ap.*"%>
<%@ page import="com.paypal.svcs.types.common.*"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page import="java.io.IOException"%>
<%@ page import="common.com.paypal.platform.sdk.exceptions.*"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ page import="src.paypalsamples.utils.*"%>
<%@ include file='constants.jsp'%>
<%@ page language="java"%>

<html>
<head>
<title>PayPal Platform SDK - Get Payment Option Receipt</title>
<link href="common/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
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
   try{
	   AdaptivePayments ap = new AdaptivePayments();
	   GetPaymentOptionsRequest getPayOp=new GetPaymentOptionsRequest();
	   
	   String payKey = (String) request.getParameter("payKey");
	   getPayOp.setPayKey(payKey);
	   
	   RequestEnvelope en = new RequestEnvelope();
   	   en.setErrorLanguage("en_US");
   	   getPayOp.setRequestEnvelope(en);
   	   
	   GetPaymentOptionsResponse paymentResponse = ap.getPaymentOption(getPayOp);
	   InitiatingEntity iEntity=paymentResponse.getInitiatingEntity();
	   InstitutionCustomer iCustomer=null;
	   if(iEntity != null){
	      iCustomer=iEntity.getInstitutionCustomer();
	   }   
	   DisplayOptions dOptions=paymentResponse.getDisplayOptions();
%>	   

<table width=500 class="api">
    <tr>
	<h3>AP
- Get Payment Option Receipt</b></h3>

<br>
	</tr>
	<tr>
		<td class="thinfield">Email Header Image URL:</td>
		<td class="thinfield"><%=dOptions!=null?dOptions.getEmailHeaderImageUrl():""%></td>
	</tr>
	<tr>
		<td class="thinfield">Email Marketing Image URL:</td>
		<td class="thinfield"><%=dOptions!=null?dOptions.getEmailMarketingImageUrl():""%></td>
	</tr>
	<tr>
		<td class="thinfield">InstitutionId:</td>
		<td class="thinfield"><%=iCustomer!=null?iCustomer.getInstitutionId():""%></td>
	</tr>
	<tr>
		<td class="thinfield">Institution CustomerId:</td>
		<td class="thinfield"><%=iCustomer!=null?iCustomer.getInstitutionCustomerId():""%></td>
	</tr>
	<tr>
		<td class="thinfield">Email:</td>
		<td class="thinfield"><%=iCustomer!=null?iCustomer.getEmail():""%></td>
	</tr>
	
	<tr>
		<td class="thinfield">Country Code:</td>
		<td class="thinfield"><%=iCustomer!=null?iCustomer.getCountryCode():""%></td>
	</tr>
	<tr>
		<td class="thinfield">Display Name:</td>
		<td class="thinfield"><%=iCustomer!=null?iCustomer.getDisplayName():""%></td>
	</tr>
	<tr>
		<td class="thinfield">First Name:</td>
		 <td class="thinfield"><%=iCustomer!=null?iCustomer.getFirstName():"" %>
		</td>
	</tr>
	<tr>
		<td class="thinfield">Last Name:</td>
		 <td class="thinfield"><%=iCustomer!=null?iCustomer.getLastName():"" %>
		</td>
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