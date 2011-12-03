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
<%@page import="java.util.ArrayList"%><html>
<head>
<title>PayPal Platform SDK - Adaptive Accounts - Add payment Card</title>
</head>
<body alink=#0000FF vlink=#0000FF>
<center><font size=2 color=black face=Verdana><b>Adaptive Accounts - Add payment Card</b></font>
<%
AddPaymentCardResponse addCardResponse=null;
try {
	  AddPaymentCardRequest addCardRequest=new AddPaymentCardRequest();
	  addCardRequest.setEmailAddress((String)request.getParameter("emailID"));
	  addCardRequest.setCardVerificationNumber((String)request.getParameter("cardVerificationNumber"));
	  String createAccountKey=request.getParameter("createAccountKey");
	  if(createAccountKey != null && createAccountKey.length()>0){
		  addCardRequest.setCreateAccountKey(createAccountKey);  
	  }
	  addCardRequest.setCardType((String)request.getParameter("creditCardType"));
	  addCardRequest.setCardNumber((String)request.getParameter("cardNumber"));
	  addCardRequest.setConfirmationType(ConfirmationType.fromValue((String)request.getParameter("confirmationType")));
	  
	  CardDateType expireDate=new CardDateType();
	  expireDate.setMonth(new BigInteger((String)request.getParameter("expDateMonth")));
	  expireDate.setYear(new BigInteger((String)request.getParameter("expDateYear")));
	  addCardRequest.setExpirationDate(expireDate);
	  
	  NameType cardOwner=new NameType();
	  cardOwner.setFirstName((String)request.getParameter("firstName"));
	  cardOwner.setLastName((String)request.getParameter("lastName"));
	  addCardRequest.setNameOnCard(cardOwner);
	  
	  AddressType billingAddress=new AddressType();
	  billingAddress.setLine1((String)request.getParameter("address1"));
	  billingAddress.setLine2((String)request.getParameter("address2"));
	  billingAddress.setCity((String)request.getParameter("city"));
	  billingAddress.setState((String)request.getParameter("state"));
	  billingAddress.setPostalCode((String)request.getParameter("zip"));
	  billingAddress.setCountryCode((String)request.getParameter("countryCode"));
	  addCardRequest.setBillingAddress(billingAddress);
	  
	  RequestEnvelope requestEnvelope=new RequestEnvelope();
	  requestEnvelope.setErrorLanguage("en_US");
	  addCardRequest.setRequestEnvelope(requestEnvelope);
	  
	  String confirmationType=request.getParameter("confirmationType"); 
	  if(confirmationType != null && !"NONE".equalsIgnoreCase(confirmationType)){
		  StringBuilder url = new StringBuilder();
		  url.append("http://");
		  url.append(request.getServerName());
		  url.append(":");
		  url.append(request.getServerPort());
		  url.append(request.getContextPath());
		  String returnURL = url.toString()+ "/samples/AddPaymentCardDetail.jsp";
		  String cancelURL = url.toString()+ "/samples/AddPaymentCard.jsp";
		  
		  WebOptionsType webOptions=new WebOptionsType();
		  webOptions.setCancelUrl(cancelURL); 
		  webOptions.setCancelUrlDescription("Cancel URL");
		  webOptions.setReturnUrl(returnURL); 
		  webOptions.setReturnUrlDescription("Return URL");
		  addCardRequest.setWebOptions(webOptions);
	  } 
	  
	AdaptiveAccounts aa = new AdaptiveAccounts();
	addCardResponse  = aa.addPaymentCard(addCardRequest);
	session.setAttribute("addCardResponse", addCardResponse);
	String  redirectUrl=addCardResponse.getRedirectURL();
	if (redirectUrl != null && redirectUrl.length()>0 ) {
		response.sendRedirect(redirectUrl);
    }else{
    	response.sendRedirect("AddPaymentCardDetail.jsp");
    }
} catch (PPFaultMessage e) {
	session.setAttribute("exception", e);
	response.sendRedirect("APIError.jsp"); 		
} catch (IOException e) {
	session.setAttribute("exception", e);
	response.sendRedirect("ConfigError.jsp"); 		
} catch (Exception e) {
	session.setAttribute("exception", e);
	response.sendRedirect("Error.jsp"); 		
}
%>
</center>
</body>
</html>