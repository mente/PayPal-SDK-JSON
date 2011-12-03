<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="common.com.paypal.platform.sdk.*" %>
<%@ page import="common.com.paypal.platform.sdk.utils.*" %>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ page import="com.paypal.svcs.types.common.*" %>
<%@ page import="java.util.*" %>
<%@ page language="java" %>

<html>
<head>
<title>PayPal SDK - API Error</title>
<link href="common/style.css" rel="stylesheet" type="text/css" />
</head>
<body >
<br/>
<div id="jive-wrapper" >
    <div id="jive-header">
        <div id="logo">
           
            <a title="Paypal X Home" href="#"><div id="titlex"></div></a>
        </div>
    </div>

<div id="main" >

<%@ include file='menu.html'%>
<div id="request_form" >
<center><h3>PayPal has returned an API Error</h3>
<p class="header2"><b>Please check your input data and try again</b></p>
</center>

<%
    PPFaultMessage obj = (PPFaultMessage) session.getValue("exception");
     List<com.paypal.svcs.types.common.ErrorData> list=obj.getFaultInfo().getError();
        for(com.paypal.svcs.types.common.ErrorData err:list){    
 %>
 <br/>
 <table align="center" width="50%">

	<tr>
		<td class="thinfield2">Error Id:</td>
		<td class="thinfield3" ><%= err.getErrorId() %></td>
	</tr>	
	<tr>
		<td class="thinfield2">Domain:</td>
		<td class="thinfield3"><%= err.getDomain() %></td>
	</tr>
	<tr>
		<td class="thinfield2">Severity:</td>
		<td class="thinfield3"><%= err.getSeverity() %></td>
	</tr>
	<tr>
		<td class="thinfield2">Category:</td>
		<td class="thinfield3"><%= err.getCategory() %></td>
	</tr>
	<tr>
		<td class="thinfield2">Message:</td>
		<td class="thinfield3"><%= err.getMessage() %></td>
	</tr>
  <%if(err.getParameter() != null && err.getParameter().size()>0){ %>
	<tr>
		<td class="thinfield2">Parameter:</td>
		<% 
		  List<ErrorParameter> paramlist= err.getParameter();
		  for(ErrorParameter param:paramlist){ 
		%>
			<td class="thinfield3"><%= param.getValue()%></td>
		<% }%>
	</tr>
  <%} %>	
</table>
<br/>
<%
   }
%>
</div>
</div>
</div>
</body>
</html>