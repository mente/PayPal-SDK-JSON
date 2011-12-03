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
                    <span >You must be Logged in to<a href="https://<%=devCentral%>.paypal.com">PayPal sandbox</a></span>
                    <a title="Paypal X Home" href="#"><div id="titlex"></div></a>
                </div>
            </div>

<div id="main">
<%@ include file='menu.html'%>

<div id="request_form">
<form name="Form1" id="Form1" method="POST" action="CreatePayReceipt.jsp">

	<h3>Pay - Create, Set, Execute API Flow</h3>
	<h3>Adaptive Payments-Pay(Create)</h3>
<table class="api">
	<tr>
		<td class="thinfield">Sender's Email</td>
		<td><input type="text" size="50" name="email"
			value="platfo_1255077030_biz@gmail.com" /></td>
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
		<td class="thinfield">Preapproval Key</td>
		<td><input type="text" size="50" maxlength="32" name="preapprovalKey"
			value="" /></td>
	</tr>
	<tr>
		<td class="thinfield">Action Type</td>
		<td><input type="text" size="50" maxlength="32" name="actionType"
			value="CREATE" /></td>
	</tr>
	<TR>
		<TD class="thinfield" height="14" colSpan="3">
		<P align="center">Pay Details</P>
		</TD>
	</TR>
	<tr>
		<td width="52" class="thinfield">Payee</td>
		<td class="thinfield">ReceiverEmail**</td>
		<td class="thinfield">Amount**</td>

	</tr>
	<tr>
		<td width="52">
		<P align="left">1</P>
		</td>
		<td><input type="text" name="receiveremail" size="50"
			value="platfo_1255611349_biz@gmail.com"></td>
		<td class="thinfield"><input class="thinfield"  type="text" name="amount" size="5" maxlength="7"
			value="1.00"></td>

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
