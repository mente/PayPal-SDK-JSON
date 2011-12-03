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

		<br><br>
		<center>
			<font size=2 color=black face=Verdana><b>Configuration error occured at the web site. Please visit the site later. </b></font>
		</center>
		<br>

		<table width="500" class="api" align="center">
		<%
			Exception obj = (Exception) session.getValue("exception");
		%>
			<tr>
				<td class="thinfield2 label">Error Message</td>
				<td class="thinfield3"><%= obj.getMessage() %></td>
			</tr>	
				
		</table>
		<br><br>

	</div>
</div>
</div>
</body>
</html>