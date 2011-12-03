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
<title>PayPal Platform SDK - Add Bank Accounts</title>
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
AddBankAccountResponse addBankAccountResponse=null;
  try{
	  StringBuilder url = new StringBuilder();
	  url.append("http://");
	  url.append(request.getServerName());
	  url.append(":");
	  url.append(request.getServerPort());
	  url.append(request.getContextPath());
	  String returnURL = url.toString()+ "/samples/AddBankAccountDetail.jsp";
	  String cancelURL = url.toString()+ "/samples/AddBankAccount.jsp";		
	  AddBankAccountRequest addBankAccountRequest= new AddBankAccountRequest();
	  
	  addBankAccountRequest.setRequestEnvelope(ClientInfoUtil.getMyAppRequestEnvelope());
	  addBankAccountRequest.setEmailAddress((String)request.getParameter("emailID"));
	  addBankAccountRequest.setBankCountryCode((String)request.getParameter("bankCountryCode"));
	  addBankAccountRequest.setBankName((String)request.getParameter("bankName"));
	  addBankAccountRequest.setRoutingNumber((String)request.getParameter("routingNumber"));
	  addBankAccountRequest.setBankAccountNumber((String)request.getParameter("bankAccountNumber"));
	  addBankAccountRequest.setBankAccountType(BankAccountType.fromValue((String)request.getParameter("accounttype")));
	  addBankAccountRequest.setConfirmationType(ConfirmationType.fromValue((String)request.getParameter("confirmationType")));
	  
	  String createAccountKey=request.getParameter("createAccKey");
	  if(createAccountKey != null && createAccountKey.length()>0){
		  addBankAccountRequest.setCreateAccountKey(createAccountKey);  
	  }
	  
	  String confirmationType=request.getParameter("confirmationType"); 
	  if(confirmationType != null && !"NONE".equalsIgnoreCase(confirmationType)){
		  WebOptionsType webOptionsType=new WebOptionsType();
		  webOptionsType.setCancelUrl(cancelURL);
		  webOptionsType.setCancelUrlDescription("Cancel URL");
		  webOptionsType.setReturnUrl(returnURL);
		  webOptionsType.setReturnUrlDescription("Return URL");
		  addBankAccountRequest.setWebOptions(webOptionsType);
	  }
	  AdaptiveAccounts aa = new AdaptiveAccounts();
	  addBankAccountResponse  = aa.addBankAccount(addBankAccountRequest);
	  session.setAttribute("responseBankAcc", addBankAccountResponse);
	  application.setAttribute("fundingSourceKey",addBankAccountResponse.getFundingSourceKey());
	  String  redirectUrl=addBankAccountResponse.getRedirectURL();
	   if (redirectUrl != null && redirectUrl.length()>0 ) {
		   response.sendRedirect(redirectUrl);  
	   }else{
		   response.sendRedirect("AddBankAccountDetail.jsp");
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

</div>
</div>
</div>
</body>
</html>

