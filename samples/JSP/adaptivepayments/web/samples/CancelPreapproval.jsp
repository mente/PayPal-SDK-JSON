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
<form name="Form1" id="Form1" method="POST" action="CancelPreapprovalReceipt.jsp">
 <h3>Adaptive Payments - CancelPreapproval</h3>
<table class="api">
	
	<tr>
		<td class="thinfield">Preapproval Key</td>
		<td><input type="text" size="50" maxlength="32" name="preapprovalKey"			value="" /></td>
	</tr>
	<tr>
		<td class="field" width="52"></td>
		<td class="pop-button primary" onclick="Form1.submit();" id="Submit"><span>Submit</span></td>
	</tr>
</table>

</form>
</div>
</div>
</div>
</body>
</html>
