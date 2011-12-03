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
<title>PayPal Platform SDK - Execute Payments</title>

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
   try{
	   AdaptivePayments ap = new AdaptivePayments();
	   ExecutePaymentRequest exePay=new ExecutePaymentRequest();
	   
	   String payKey = (String) request.getParameter("payKey");
	   exePay.setPayKey(payKey);
	   
	   RequestEnvelope en = new RequestEnvelope();
   	   en.setErrorLanguage("en_US");
   	   exePay.setRequestEnvelope(en);
   	   
	   ExecutePaymentResponse executePaymentResponse = ap.executePayment(exePay);
	   
	   //String nextUrl="https://www."+testEnv+".paypal.com/cgi-bin/webscr?cmd=_ap-payment&paykey="+payKey;
	   //if("COMPLETED".equalsIgnoreCase(executePaymentResponse.getPaymentExecStatus())){
		 //  response.sendRedirect("PaymentDetails.jsp?payKey="+payKey);
	   //}else{
		 //  response.sendRedirect(nextUrl);  
	   //}
%>

  <center><h3>Pay - Create, Set, Execute API Flow</h3>
<p class="header2"><b>Execute Payment - Response</b></p>
</center>
	<br>
	
  <table align="center" width="50%">
 
	<tr>
	   <td class="thinfield">PaymentExecStatus:</td>
	   <td class="thinfield"><%=executePaymentResponse!=null?executePaymentResponse.getPaymentExecStatus():"" %></td>
	</tr>
	<tr>
	   <td class="thinfield">Ack:</td>
	   <td class="thinfield"><%=executePaymentResponse!=null?executePaymentResponse.getResponseEnvelope().getAck():"" %></td>
	</tr>
	<tr>
	   <td class="thinfield">CorrelationId:</td>
	   <td class="thinfield"><%=executePaymentResponse!=null?executePaymentResponse.getResponseEnvelope().getCorrelationId():"" %></td>
	</tr>
	<tr>
	   <td class="thinfield">TimeStamp:</td>
	   <td class="thinfield"><%=executePaymentResponse!=null?executePaymentResponse.getResponseEnvelope().getTimestamp():"" %></td>
	</tr>
	<tr>
	   <td class="thinfield">Build:</td>
	   <td class="thinfield"><%=executePaymentResponse!=null?executePaymentResponse.getResponseEnvelope().getBuild():"" %></td>
	</tr>
  </table>	
  <br/>
 <table align="center" width="50%">
   <tr>
      
      <td class="thinfield"><a href="GetPaymentDetails.jsp?payKey=<%=payKey%>">* Get Payment Details</a></td>
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