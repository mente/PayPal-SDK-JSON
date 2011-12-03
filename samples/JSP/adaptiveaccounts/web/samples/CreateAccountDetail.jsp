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
<%@ page import="common.com.paypal.platform.sdk.utils.SSLUtil"%>
<%@ include file='constants.jsp'%>
<%@ page language="java"%>
<html>
<head>
<title>PayPal Platform SDK - Adaptive Accounts</title>
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
    CreateAccountResponse resp=(CreateAccountResponse)session.getValue("responseAA");
    String createAccountKey="";
    String correlationId="";
    String execStatus="";
    
    if(!SSLUtil.isEmpty((String)application.getAttribute("execStatus"))) {
      	createAccountKey =(String)application.getAttribute("execStatus");
      	application.removeAttribute("execStatus");
     }
    if(!SSLUtil.isEmpty((String)application.getAttribute("createAccountKey"))) {
      	createAccountKey =(String)application.getAttribute("createAccountKey");
      	application.removeAttribute("createAccountKey");
     }
    if(!SSLUtil.isEmpty((String)application.getAttribute("correlationId"))) {
    	correlationId=(String)application.getAttribute("correlationId");
    	application.removeAttribute("correlationId");
     }

   if(resp != null){
     %>
     
   	<table width=400>
	<tr>
	 <h3>AA
   	- Account Details!</h3> <br>

   	
	</tr>
	   		<tr>
	   			<td class="thinfield">Status:</td>
	   			<td class="thinfield"><%=resp.getExecStatus() %></td>
	   		</tr>		
	   		<tr>
	   			<td class="thinfield">AccountKey:</td>
	   			<td class="thinfield"><%=resp.getCreateAccountKey() %></td>
	   		</tr>	
	   		<tr>
	   			<td class="thinfield">CorrelationId:</td>
	   			<td class="thinfield"><%=resp.getResponseEnvelope().getCorrelationId() %></td>
	   		</tr>	
   	
        </table>

        
<%}else{%>

     <table width=400>
	 <tr>
	 <h3>AA
   	- Account Details!</h3> <br>

   	
	</tr>
     		<tr>
     			<td class="thinfield" >Status:</td>
     			<td class="thinfield"><%= execStatus %></td>
     		</tr>		
     		<tr>
     			<td  class="thinfield">AccountKey:</td>
     			<td class="thinfield"><%= createAccountKey %></td>
     		</tr>	
     		<tr>
     			<td class="thinfield">CorrelationId:</td>
     			<td class="thinfield"><%= correlationId %></td>
     		</tr>
      </table>

<%}%>
</div>
</div>
</div>
</body>
</html>	
	