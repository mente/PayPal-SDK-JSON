<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="common/style.css" rel="stylesheet" type="text/css" />
<%@ include file='constants.jsp'%>
<%@ page import="src.paypalsamples.utils.*"%>
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
<form name="Form1" id="Form1" method="POST" action="PreapprovalReceipt.jsp">

<table class="api">
	<tr>
		<h3>Adaptive Payments - Preapproval</h3>
	</tr>
	
	
	<tr>
		<td class="thinfield">Sender's Email</td>
		<td><input type="text" size="50" name="senderEmail"
			value="platfo_1255077030_biz@gmail.com" /></td>
	</tr>
   <tr>
		<td class="thinfield">Starting Date</td>
		<td><input type="text" size="50" maxlength="32" name="startingDate"
			value="<%=DateUtil.getNextMonth() %>" /></td>
	</tr>
	<tr>
		<td class="thinfield">Ending Date</td>
		<td><input type="text" size="50" maxlength="32" name="endingDate"
			value="<%=DateUtil.getNextYear() %>" /></td>
	</tr>
	<tr>
		<td class="thinfield">Maximum Amount Per Payment</td>
		<td><input type="text" size="50" maxlength="32" name="maxAmountPerPayment"
			value="1.00" /></td>
	</tr>
	<tr>
		<td class="thinfield">Maximum Number Of Payments</td>
		<td><input type="text" size="50" maxlength="32" name="maxNumberOfPayments"
			value="10" /></td>
	</tr>
	<tr>
		<td class="thinfield">Maximum Total Amount Of All Payment</td>
		<td><input type="text" size="50" maxlength="32" name="maxTotalAmountOfAllPayments"
			value="50.00" /></td>
	</tr>
	<tr>
		<td class="thinfield" width="52">Currency Code</td>
		<td><select name="currencyCode">
			<option value="USD" selected>USD</option>
			<option value="GBP">GBP</option>
			<option value="EUR">EUR</option>
			<option value="JPY">JPY</option>
			<option value="CAD">CAD</option>
			<option value="AUD">AUD</option>
		</select></td>
	</tr>
	<tr>
	<td>
	<br />
	</td>
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
