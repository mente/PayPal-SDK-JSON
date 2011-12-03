<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>PayPal Platform SDK - Add Bank Accounts</title>
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
<form name="Form1" id="Form1" method="POST" action="AddBankAccountReceipt.jsp">

<table class="api">
	<tr>
		<h3> Add Bank
		Account - Web Redirect</h3>
	</tr>
	
	<tr>
		<td class="thinfield">Email Id</td>
		<td><input type="text" size="30" maxlength="50" name="emailID" 	value="" /></td>
	</tr>
	<tr>
		<td class="thinfield">Bank Country Code</td>

		<td><input type="text" size="30" maxlength="10"	name="bankCountryCode" value="US" /></td>
	</tr>

	<tr>
		<td class="thinfield">Bank Name</td>
		<td><input type="text" size="30" maxlength="32" name="bankName" value="Huntington Bank" /></td>
	</tr>
	<tr>
		<td class="thinfield">Routing Number</td>

		<td><input type="text" size="30" maxlength="10" name="routingNumber" value="021473030" /></td>
	</tr>
	<tr>
		<td class="thinfield">Bank Account Number</td>
		<td><input type="text" size="30" maxlength="10" name="bankAccountNumber" value="23668680" /></td>
	</tr>
	<tr>
		<td class="thinfield">Account Type</td>
		<td>
		  <select name="accounttype">
		     <option value="CHECKING">CHECKING</option>
		     <option value="SAVINGS" selected="selected">SAVINGS</option>
		     <option value="BUSINESS_CHECKING">BUSINESS_CHECKING</option>
		     <option value="BUSINESS_SAVINGS">BUSINESS_SAVINGS</option>
		     <option value="NORMAL">NORMAL</option>
		     <option value="UNKNOWN">UNKNOWN</option>
		  </select>
		</td>	
	</tr>
	<tr>
		<td class="thinfield">Confirmation Type</td>
		<td><select name="confirmationType">
			<option value="WEB">WEB</option>
			<option value="MOBILE">MOBILE</option>
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
