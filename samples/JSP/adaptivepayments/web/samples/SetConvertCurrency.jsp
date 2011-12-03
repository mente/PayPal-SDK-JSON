<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>PayPal Platform SDK - Pay Center - ConvertCurrency</title>
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
<form name="Form1" id="Form1" method="POST" action="ConvertCurrencyReceipt.jsp">

<table class="api">
	<tr>
		<h3>Adaptive Payments - ConvertCurrency</h3
	</tr>	
	<tr>
		<td class="thinfield" width="52">Conversion Details</td>
		<td class="thinfield">Amount**</td>
		<td class="thinfield">From Currency Code**</td>		
	</tr>
	<tr>
		<td class="thinfield" width="52">
		<P align="right">1</P>
		</td>
		<td class="thinfield"><input type="text" name="baseamount" 
			value="1.00"></td>
		<td class="thinfield"><input type="text" name="fromcode"  
			value="GBP"></td>
			
	</tr>		
	<tr>
		<td class="thinfield" width="52">
		<P align="right">2</P>
		</td>				
		<td class="thinfield"><input type="text" name="baseamount" 
			value="100.00"></td>
		<td class="thinfield"><input type="text" name="fromcode"  
			value="EUR"></td>				
	    </tr>
	<tr>
		<td class="thinfield" width="52">Convert To Currency List</td>		
		<td class="thinfield">To Currency Code**</td>		
	</tr>
	<tr>	
	<td class="thinfield" width="52">
		<P align="right">1</P>
		</td>	
		<td class="thinfield"><input type="text" name="tocode"  
			value="USD"></td>			
	</tr>
	<tr>	
	   <td class="thinfield" width="52">
		<P align="right">2</P>
		</td>	
		<td class="thinfield"><input type="text" name="tocode"  
			value="CAD"></td>			
	</tr>		
	<tr>	
	   <td class="thinfield" width="52">
		<P align="right">3</P>
		</td>	
		<td class="thinfield"><input type="text" name="tocode"  
				value="JPY"></td>			
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
