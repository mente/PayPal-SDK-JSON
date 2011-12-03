<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>PayPal Platform SDK - Pay Parallel</title>

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
<form name="Form1" id="Form1" method="POST" action="PayChainedReceipt.jsp">

<table class="api">
	<tr>
		<b><h3>Adaptive Payments - Pay Chained</h3></b>
	</tr>
	
	<tr>
		<td class="thinfield">Sender's Email</td>
		<td><input type="text" size="50" name="email"
			value="platfo_1255077030_biz@gmail.com" /></td>
	</tr>
	<tr>
		<td class="thinfield">Memo</td>
		<td><input type="text" size="50" maxlength="32" name="memo"
			value="chained" ></td>
	</tr>
	<tr>
		<td class="thinfield">Fees Payer</td>
		<td><input type="text" size="50" maxlength="32" name="feesPayer"
			value="EACHRECEIVER" /></td>
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
	<TR>
		<TD class="thinfield" height="14" colSpan="3">
		<P align="center">Pay Details</P>
		</TD>
	</TR>
	<tr>
		<td class="thinfield" width="52">Payee</td>
		<td class="thinfield">ReceiverEmail**</td>
		<td class="thinfield">Amount**</td>
		<td class="thinfield">Primay Receiver**</td>

	</tr>
	<tr>
		<td width="52">
		<P align="center">1</P>
		</td>
		<td><input type="text" name="receiveremail" size="50"
			value="platfo_1255612361_per@gmail.com"></td>
		<td ><input type="text" class="smalltext" name="amount" width="10"
			value="0.01"></td>
		<td><input type="text" name="primary"  class="smalltext" 
			value="false"></td>	
	</tr>		
	<tr>
		<td width="52">
		<P align="center">2</P>
		</td>		
		<td><input type="text" name="receiveremail" size="50"
			value="platfo_1255611349_biz@gmail.com"></td>
		<td><input type="text" name="amount" class="smalltext" 
			value="0.02"></td>
		<td><input type="text" name="primary" class="smalltext" 
			value="true"></td>		
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
  
      <a  colspan='3'>NOTE: Chained payment requires one primary receiver, Please set one primary receiver to true</a>
  
</form>
</div>
</div>
</div>
</body>
</html>
