<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>PayPal Platform SDK - Adaptive Accounts</title>
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
<form name="Form1" id="Form1" method="POST" action="CreateAccountReceipt.jsp">

<table class="api">
	<tr>
		<h3>  Create Account</h3>
	</tr>
	
	<tr>
		<td class="thinfield" >Account Type</td>
		<td><select name="accountType">
			<option value="PERSONAL" selected>PERSONAL</option>		
			<option value="PREMIER" >PREMIER</option>	
		</select></td>
	</tr>
	<tr>
		<td class="thinfield" >Salutation</td>
		<td><select name="name.salutation">
			<option value="Dr." selected>Dr.</option>
			<option value="Mr.">Mr.</option>
			<option value="Mrs.">Mrs.</option>
		</select></td>
	</tr>
	<tr>
		<td class="thinfield">First Name</td>
		<td><input type="text" size="30" maxlength="32"
			name="name.firstName" value="Bonzop" /></td>
	</tr>
	<tr>
		<td class="thinfield">Middle Name</td>
		<td><input type="text" size="30" maxlength="32"
			name="name.middleName" value="Simore" /></td>
	</tr>
	<tr>
		<td class="thinfield">Last Name</td>
		<td><input type="text" size="30" maxlength="32"
			name="name.lastName" value="Zaius" /></td>
	</tr>
	
	<tr>
		<td class="thinfield">DOB</td>
		<td><input type="text" size="30" maxlength="32"
			name="dateOfBirth" value="1968-01-01" /></td>
	</tr>
	
	
	<tr>
		<td class="thinfield">Address 1</td>
		<td><input type="text" size="25" maxlength="100" name="address.line1"
			value="1968 Ape Way" /></td>
	</tr>
	<tr>
		<td class="thinfield">Address 2</td>
		<td><input type="text" size="25" maxlength="100" name="address.line2" value="Apt 123"/></td>
	</tr>
	<tr>
		<td class="thinfield">City</td>
		<td><input type="text" size="25" maxlength="40" name="address.city"
			value="Austin" /></td>
	</tr>
	<tr>
		<td class="thinfield">State</td>
		<td><select name="address.state">
			<option></option>
			<option value="AK">AK</option>
			<option value="AL">AL</option>
			<option value="AR">AR</option>
			<option value="AZ">AZ</option>
			<option value="CA">CA</option>
			<option value="CO">CO</option>
			<option value="CT">CT</option>
			<option value="DC">DC</option>
			<option value="DE">DE</option>
			<option value="FL">FL</option>
			<option value="GA">GA</option>
			<option value="HI">HI</option>
			<option value="IA">IA</option>
			<option value="ID">ID</option>
			<option value="IL">IL</option>
			<option value="IN">IN</option>
			<option value="KS">KS</option>
			<option value="KY">KY</option>
			<option value="LA">LA</option>
			<option value="MA">MA</option>
			<option value="MD">MD</option>
			<option value="ME">ME</option>
			<option value="MI">MI</option>
			<option value="MN">MN</option>
			<option value="MO">MO</option>
			<option value="MS">MS</option>
			<option value="MT">MT</option>
			<option value="NC">NC</option>
			<option value="ND">ND</option>
			<option value="NE">NE</option>
			<option value="NH">NH</option>
			<option value="NJ">NJ</option>
			<option value="NM">NM</option>
			<option value="NV">NV</option>
			<option value="NY">NY</option>
			<option value="OH">OH</option>
			<option value="OK">OK</option>
			<option value="OR">OR</option>
			<option value="PA">PA</option>
			<option value="RI">RI</option>
			<option value="SC">SC</option>
			<option value="SD">SD</option>
			<option value="TN">TN</option>
			<option value="TX" selected>TX</option>
			<option value="UT">UT</option>
			<option value="VA">VA</option>
			<option value="VT">VT</option>
			<option value="WA">WA</option>
			<option value="WI">WI</option>
			<option value="WV">WV</option>
			<option value="WY">WY</option>
			<option value="AA">AA</option>
			<option value="AE">AE</option>
			<option value="AP">AP</option>
			<option value="AS">AS</option>
			<option value="FM">FM</option>
			<option value="GU">GU</option>
			<option value="MH">MH</option>
			<option value="MP">MP</option>
			<option value="PR">PR</option>
			<option value="PW">PW</option>
			<option value="VI">VI</option>
		</select></td>
	</tr>
	<tr>
		<td class="thinfield2">ZIP Code</td>
		<td class="thinfield3"><input type="text" size="30" maxlength="10" name="address.postalCode"
			value="78750" /> (5 or 9 digits)</td>
	</tr>
   <tr>
		<td class="thinfield2">Country</td>
		<td class="thinfield3"><input type="text" size="30" maxlength="10" name="address.countryCode"
			value="US" /></td>
	</tr>	
	 <tr>
		<td class="thinfield2">Citizenship Country Code</td>
		<td class="thinfield3"><input type="text" size="30" maxlength="10" name="citizenshipCountryCode"
			value="US" /></td>
	</tr>	
  <tr>
		<td class="thinfield2">Contact Phone Number</td>
		<td class="thinfield3"><input type="text" size="30" maxlength="12" name="contactPhoneNumber"
			value="512-691-4160" /></td>
	</tr>	
	<tr>
		<td class="thinfield2">Notification URL</td>
		<td class="thinfield3"><input type="text" size="30" maxlength="10" name="notificationURL"
			value="http://stranger.paypal.com/cgi-bin/ipntest.cgi" /></td>
	</tr>	
	<tr>
		<td class="thinfield2">Partnerfield1</td>
		<td class="thinfield3"><input type="text" size="30" maxlength="10" name="partnerField1"
			value="p1" /></td>
	</tr>	
	<tr>
		<td class="thinfield2">PartnerField2</td>
		<td class="thinfield3"><input type="text" size="30" maxlength="10" name="partnerField2"
			value="p2" /></td>
	</tr>	
	<tr>
		<td class="thinfield2">PartnerField3</td>
		<td class="thinfield3"><input type="text" size="30" maxlength="10" name="partnerField3"
			value="p3" /></td>
	</tr>	
	<tr>
		<td class="thinfield2">PartnerField4</td>
		<td class="thinfield3"><input type="text" size="30" maxlength="10" name="partnerField4"
			value="p4" /></td>
	</tr>	
	
	<tr>
		<td class="thinfield2">PartnerField5</td>
		<td class="thinfield3"><input type="text" size="30" maxlength="10" name="partnerField5"
			value="p5" /></td>
	</tr>	
	
	<tr>
		<td class="thinfield2" >Currency Code</td>
		<td class="thinfield3"><select name="currencyCode">
			<option value="USD" selected>USD</option>
			<option value="GBP">GBP</option>
			<option value="EUR">EUR</option>
			<option value="JPY">JPY</option>
			<option value="CAD">CAD</option>
			<option value="AUD">AUD</option>
		</select></td>
	</tr>
    <tr>
		<td class="thinfield2">Email</td>
		<td class="thinfield3"><input type="text" size="30" maxlength="32"
			name="email" value="youremail@yourdomain.com" /></td>
	</tr>
	<tr>
	    <td></td>
	    <td class="thinfield3" colspan="3">Sandbox Developer Central Email has specified in Client property file</td>
	</tr>
	<tr>
		<td class="thinfield2" width="52"></td>
	<td class="pop-button primary" onclick="Form1.submit();" id="Submit"><span>Submit</span></td>
	</tr>
</table>
</div>
</div>
</div>
</body>
</html>
