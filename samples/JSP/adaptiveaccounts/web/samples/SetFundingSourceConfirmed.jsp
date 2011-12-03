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
<form name="Form1" id="Form1" method="POST" action="SetFundingSourceConfirmedReceipt.jsp">

<table class="api">
	<tr>
		<h3>Set Funding Source Confirmed</h3>
	</tr>
	
 
  <tr>
        <td class="thinfield">Email Id</td>
        <td><input type="text" size="30" maxlength="50" name="emailid"
            value="wchai-seller-usd1@paypal.com" /></td>
    </tr>
 
    
    
<tr>
        <td class="thinfield">Funding Source Key</td>
        <td><input type="text" size="30" maxlength="50" name="fundingSourceKey"
            value="" /></td>
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