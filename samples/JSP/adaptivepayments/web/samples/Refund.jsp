<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>PayPal Platform SDK - Pay Center</title>
<link href="common/style.css" rel="stylesheet" type="text/css" />
<%@ include file='constants.jsp'%>
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

<form name="Form1" id="Form1" method="POST" action="RefundReceipt.jsp">
<%
		String payKey = request.getParameter("payKey");
		if (payKey == null) payKey = "";
	
%>

<table class="api">
	<tr>
		<h3>Adaptive Payments - Refund</h3>
	</tr>
	
	<tr>
		<td class="thinfield">Pay Key</td>
		<td><input type="text" size="50" maxlength="32" name="payKey"
			value="<%=payKey%>" /></td>
	</tr>

	<tr>
		<td class="thinfield" width="52">Currency Code</td>
		<td class="thinfield"><select name="currencyCode">
			<option value="USD" selected>USD</option>
			<option value="GBP">GBP</option>
			<option value="EUR">EUR</option>
			<option value="JPY">JPY</option>
			<option value="CAD">CAD</option>
			<option value="AUD">AUD</option>
		</select></td>
	</tr>
	<TR>
		<TD class="thinfield" height="14" colSpan="3">
		<P align="center">Refund Details</P>
		</TD>
	</TR>
	<tr>
		<td class="thinfield" width="52">Receivers</td>
		<td class="thinfield">ReceiverEmail**</td>
		<td class="thinfield">Amount**</td>

	</tr>
	<tr>
		<td width="52">
		<P align="right">1</P>
		</td>
		<td><input type="text" name="receiveremail" size="50"
			value="platfo_1255611349_biz@gmail.com"></td>
		<td><input class="smalltext"  type="text" name="amount" size="5" maxlength="7"
			value="1.0"></td>

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
