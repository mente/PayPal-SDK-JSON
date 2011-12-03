<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>PayPal Platform SDK - Add Bank Accounts</title>
<link href="common/style.css" rel="stylesheet" type="text/css" />
<%@ include file='constants.jsp'%>

<script language="JavaScript">
	function generateCC(){
		var cc_number = new Array(16);
		var cc_len = 16;
		var start = 0;
		var rand_number = Math.random();

		switch(document.Form1.creditCardType.value)
        {
			case "Visa":
				cc_number[start++] = 4;
				break;
			case "Discover":
				cc_number[start++] = 6;
				cc_number[start++] = 0;
				cc_number[start++] = 1;
				cc_number[start++] = 1;
				break;
			case "MasterCard":
				cc_number[start++] = 5;
				cc_number[start++] = Math.floor(Math.random() * 5) + 1;
				break;
			case "Amex":
				cc_number[start++] = 3;
				cc_number[start++] = Math.round(Math.random()) ? 7 : 4 ;
				cc_len = 15;
				break;
        }

        for (var i = start; i < (cc_len - 1); i++) {
			cc_number[i] = Math.floor(Math.random() * 10);
        }

		var sum = 0;
		for (var j = 0; j < (cc_len - 1); j++) {
			var digit = cc_number[j];
			if ((j & 1) == (cc_len & 1)) digit *= 2;
			if (digit > 9) digit -= 9;
			sum += digit;
		}

		var check_digit = new Array(0, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		cc_number[cc_len - 1] = check_digit[sum % 10];

		document.Form1.cardNumber.value = "";
		for (var k = 0; k < cc_len; k++) {
			document.Form1.cardNumber.value += cc_number[k];
		}
	}
</script>
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

<form name="Form1" id="Form1" method="POST" action="AddPaymentCardReceipt.jsp">
<table class="api">
	<tr>
		<h3> Add payment card - Direct</h3>
	</tr>
	 
  <tr>
        <td class="thinfield">Email Id:</td>
        <td><input type="text" size="30" maxlength="50" name="emailID"
            value="" /></td>
    </tr>
     <tr>
		<td width="200" class="thinfield">Card Type</td>
		<td align=left>
			<select name="creditCardType" onChange="javascript:generateCC(); return false;">
				<option value=Visa selected>Visa</option>
				<option value=MasterCard>MasterCard</option>
				<option value=Discover>Discover</option>
				<option value=Amex>American Express</option>
			</select>
		</td>
	</tr>
     <tr>
        <td class="thinfield">Credit Card Number</td>
        <td><input type="text" size="30" maxlength="16" name="cardNumber"  value="" /></td>
    </tr>
   
    <tr>
        <td class="thinfield">First Name</td>
        <td><input type="text" size="30" maxlength="32"
            name="firstName" value="John" /></td>
    </tr>
    <tr>
        <td class="thinfield">Last Name</td>
        <td><input type="text" size="30" maxlength="32"
            name="lastName" value="Deo" /></td>
    </tr>
    <tr>
		<td class="thinfield">Expiration Date</td>
		<td align=left><p>
			<select  name="expDateMonth">
				<option value=1>01</option>
				<option value=2>02</option>
				<option value=3>03</option>
				<option value=4>04</option>
				<option value=5>05</option>
				<option value=6>06</option>
				<option value=7>07</option>
				<option value=8>08</option>
				<option value=9>09</option>
				<option value=10>10</option>
				<option value=11>11</option>
				<option value=12>12</option>
			</select>
			<select  name="expDateYear">
				<option value=2011>2011</option>
				<option value=2012>2012</option>
				<option value=2013>2013</option>
				<option value=2014>2014</option>
				<option value=2015>2015</option>
				<option value=2016 >2016</option>
				<option value=2017 >2017</option>
				<option value=2018 selected>2018</option>
				<option value=2019>2019</option>
				<option value=2020>2020</option>
				<option value=2021>2021</option>
			</select>
		</p></td>
	</tr>
	<tr>
        <td class="thinfield">Card Verification Number</td>
        <td><input type="text" size="10" maxlength="3" name="cardVerificationNumber" value="956" /></td>
    </tr>
    <tr>
        <td class="thinfield">Confirmation Type</td>
      <td> <select name="confirmationType">
      <option  value="NONE">NONE</option>
        <option  value="WEB">WEB</option>
         <option  value="MOBILE">MOBILE</option>
          
          </select></td> 
     </tr>
     <tr>
        <td class="thinfield">Create Account Key</td>
        <td><input type="text" size="30" maxlength="32"
            name="createAccountKey" value="" /></td>
    </tr>
  <tr>
		<td class="thinfield"><br><b>Billing Address</b></td>
	</tr>
	<tr>

		<td class="thinfield">Address 1</td>
		<td align=left><input type=text size=25 maxlength=100 name="address1" value="1 Main St"></td>
	</tr>
	<tr>
		<td class="thinfield">Address 2</td>
		<td align=left><input type=text  size=25 maxlength=100 name="address2" value="2nd cross"></td>
	</tr>

	<tr>
		<td class="thinfield">City</td>
		<td align=left><input type=text size=25 maxlength=40 name="city" value="San Jose"></td>
	</tr>
	<tr>
		<td class="thinfield">State</td>
		<td align=left>
			<select id="state" name="state">

				<option value=></option>
				<option value=AK>AK</option>
				<option value=AL>AL</option>
				<option value=AR>AR</option>
				<option value=AZ>AZ</option>
				<option value=CA selected>CA</option>

				<option value=CO>CO</option>
				<option value=CT>CT</option>
				<option value=DC>DC</option>
				<option value=DE>DE</option>
				<option value=FL>FL</option>
				<option value=GA>GA</option>

				<option value=HI>HI</option>
				<option value=IA>IA</option>
				<option value=ID>ID</option>
				<option value=IL>IL</option>
				<option value=IN>IN</option>
				<option value=KS>KS</option>

				<option value=KY>KY</option>
				<option value=LA>LA</option>
				<option value=MA>MA</option>
				<option value=MD>MD</option>
				<option value=ME>ME</option>
				<option value=MI>MI</option>

				<option value=MN>MN</option>
				<option value=MO>MO</option>
				<option value=MS>MS</option>
				<option value=MT>MT</option>
				<option value=NC>NC</option>
				<option value=ND>ND</option>

				<option value=NE>NE</option>
				<option value=NH>NH</option>
				<option value=NJ>NJ</option>
				<option value=NM>NM</option>
				<option value=NV>NV</option>
				<option value=NY>NY</option>

				<option value=OH>OH</option>
				<option value=OK>OK</option>
				<option value=OR>OR</option>
				<option value=PA>PA</option>
				<option value=RI>RI</option>
				<option value=SC>SC</option>

				<option value=SD>SD</option>
				<option value=TN>TN</option>
				<option value=TX>TX</option>
				<option value=UT>UT</option>
				<option value=VA>VA</option>
				<option value=VT>VT</option>

				<option value=WA>WA</option>
				<option value=WI>WI</option>
				<option value=WV>WV</option>
				<option value=WY>WY</option>
				<option value=AA>AA</option>
				<option value=AE>AE</option>

				<option value=AP>AP</option>
				<option value=AS>AS</option>
				<option value=FM>FM</option>
				<option value=GU>GU</option>
				<option value=MH>MH</option>
				<option value=MP>MP</option>

				<option value=PR>PR</option>
				<option value=PW>PW</option>
				<option value=VI>VI</option>
			</select>
		</td>
	</tr>
	<tr>

		<td class="thinfield">ZIP Code</td>
		<td class="thinfield3" align=left><input type=text size=10 maxlength=10 name="zip" value=95131>(5 or 9 digits)</td>
	</tr>
	<tr>
		<td class="thinfield">Country</td>
		<td align=left><input type="text" size="10" maxlength="10" name="countryCode" value="US"></td>
	
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

</center>
</form>
<script language="javascript">
	generateCC();
</script>
</div>
</div>
</div>
</body>
</html>

