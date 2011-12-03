<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>PayPal Platform SDK - Set Payment OPtion</title>
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
<center><h3>Pay - Create, Set, Execute API Flow</h3>
<p class="header2"><b>Adaptive Payments - Set Payment Options</b></p>
</center>

<form name="Form1" id="Form1"method="POST" action="SetPaymentOptionReceipt.jsp">

<table class="api">

	<tr>
	    <td class="thinfield">Pay Key</td>
		<td><input type="text" size="30" maxlength="32" name="payKey"
			value="<%=request.getParameter("payKey")==null?"":request.getParameter("payKey") %>" /></td>
	</tr>
	<tr/><tr/>
	<tr>
	   <td class="thinfield" height="14" colspan="4">
	      <P align="center">Financial Partner Detail (Optional)</P>
	   </td>
	</tr>
	<tr/>
	<tr>
		<td class="thinfield" colspan="1">Country Code</td>
		<td><input type="text" size="30" maxlength="32" name="countryCode"
			value="" /></td>
	</tr>
	<tr>
		<td class="thinfield" colspan="1">Name</td>
		<td><input type="text" size="30" maxlength="32" name="displayName"
			value="" /></td>
	</tr>
	<tr>
		<td class="thinfield" colspan="1">Email</td>
		<td><input type="text" size="30" maxlength="32" name="email"
			value="" /></td>
	</tr>
	
	<tr>
		<td class="thinfield" colspan="1">FirstName</td>
		<td><input type="text" size="30" maxlength="32" name="firstName"
			value="" /></td>
	</tr>
	<tr>
		<td class="thinfield" colspan="1">LastName</td>
		<td><input type="text" size="30" maxlength="32" name="lastName"
			value="" /></td>
	</tr>
	<tr>
		<td class="thinfield" colspan="1">Customer Id</td>
		<td><input type="text" size="30" maxlength="32" name="customerId"
			value="" /></td>
	</tr>
	<tr>
		<td class="thinfield" colspan="1">Institution Id</td>
		<td><input type="text" size="30" maxlength="32" name="institutionId"
			value="" /></td>
	</tr>
	<tr/><tr/>
	<tr>
	   <td class="thinfield" height="14" colspan="4">
	      <P align="center">Display Option:(Optional)</P>
	   </td>
	</tr>
	<tr/>
	<tr>
		<td class="thinfield" colspan="1">Email Header Image</td>
		<td><input type="text" size="60" maxlength="32" name="headerImage"
			value="http://bankone.com/images/emailHeaderImage.jpg" /></td>
	</tr>
	<tr>
		<td class="thinfield" colspan="1">Email Marketing Image</td>
		<td><input type="text" size="60" maxlength="32" name="marketingImage"
			value="http://bankone.com/images/emailMarketingImage.jpg" /></td>
	</tr>
	<tr/><tr/><tr/>
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
