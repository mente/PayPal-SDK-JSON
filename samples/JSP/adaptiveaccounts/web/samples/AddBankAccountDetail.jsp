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
<title>PayPal Platform SDK - Add Bank Account Detail</title>
<link href="common/style.css" rel="stylesheet" type="text/css" />
</head>
<body >
<br/>
 <div id="jive-wrapper">
     <div id="jive-header">
         <div id="logo">
             <a title="Paypal X Home" href="#"><div id="titlex"></div></a>
         </div>
     </div>


<div id="main">
<%@ include file='menu.html'%>
<div id="request_form">
  <% 
  AddBankAccountResponse resp=(AddBankAccountResponse)session.getValue("responseBankAcc");
    String fundingSourceKey="";
    
    if(!SSLUtil.isEmpty((String)application.getAttribute("fundingSourceKey"))) {
    	fundingSourceKey =(String)application.getAttribute("fundingSourceKey");
    } else {		
    	 if (resp != null) {
    		 fundingSourceKey =resp.getFundingSourceKey();
    	 }
    }
    
     
   if(resp != null){
     %>
      
<table>

	<tr>
	 <td><h3>Bank Account Details!</h3> <br><br></td>
   </tr>
	<tr>
		<td  class="thinfield">Status:</td>
		<td  class="thinfield"><%=resp.getExecStatus() %></td>
	</tr>		
	<tr>
		<td  class="thinfield">Funding Source Key:</td>
		<td  class="thinfield"><%=resp.getFundingSourceKey() %></td>
	</tr>	
   			
   	</table>
     
<%}else{%>
   
<table>
		 <tr>
			<h3>Bank Account Details!</h3> <br>
		   	<br>
	   	
	     </tr>
   		<tr>
   			<td  class="thinfield">Status:</td>
   			<td  class="thinfield">COMPLETED</td>
   		</tr>		
   		<tr>
   			<td  class="thinfield">AccountKey:</td>
   			<td  class="thinfield"><%= fundingSourceKey %></td>
   		</tr>	
</table>
<%}%>
</div>
</div>
</div>
</body>
</html>	
	