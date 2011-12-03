<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" %>
<html>
<head>
<title>PayPal SDK - Java Exception</title>
<link href="common/style.css" rel="stylesheet" type="text/css" />
<%@ include file='constants.jsp'%>
</head>
<body >
<br/>
        <div id="jive-wrapper">
            <div id="jive-header">
                <div id="logo">
                   <span >You must be Logged in to <a href="https://<%=devCentral%>.paypal.com" target="_blank">PayPal sandbox</a></span>	
                   <a title="Paypal X Home" href="#"><div id="titlex"></div></a>
                </div>
            </div>
        
<br>
<div id="main">
<%@ include file='menu.html'%>

<div id="request_form">

<table class="api">
<tr>
<h3>Some problem encountered. </h3>
</tr>
<%
	Exception obj = (Exception) session.getValue("exception");
%>
	<tr>
		<td class="thinfield">Error Message:</td>
		<td class="thinfield"><%= obj.getMessage() %></td>
	</tr>	
		
</table>
<b>Please check your input parameters. Perhaps session object is lost. Try it again with correct values</b>
<br><br>
</div>
</div>
</div>
</body>
</html>