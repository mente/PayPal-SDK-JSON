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
<form name="Form1" id="Form1" method="POST" action="ExecutePaymentReceipt.jsp">

  
  <table class="api">
  <tr>
  <h3>Pay - Create, Set, Execute API Flow</h3>
  
  <b>Adaptive Payments - Execute Payment</b>
  <br/>
  </tr>
	<tr>
	    <td class="thinfield">Pay Key</td>
		<td><input type="text" size="30" maxlength="32" name="payKey"
			value="<%=request.getParameter("payKey")==null?"":request.getParameter("payKey") %>" /></td>
	</tr>
	<tr>
		<td class="thinfield" width="52"></td>
		<td class="pop-button primary" onclick="Form1.submit();" id="Submit"><span>Submit</span></td>
	</tr>
  </table>
  
</form> 	
</div>
</div>
</div>
</body>
</html>