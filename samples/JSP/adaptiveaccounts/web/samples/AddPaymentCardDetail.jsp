<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="common.com.paypal.platform.sdk.utils.*"%>
<%@ page import="com.paypal.svcs.types.aa.*"%>
<%@ page import="common.com.paypal.platform.sdk.exceptions.*"%>
<%@ page import="com.paypal.svcs.types.common.*"%>
<%@ page import="common.com.paypal.platform.sdk.utils.*"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ page import="java.util.HashMap;"%>
<%@ page language="java"%>
<html>
<head>
<title>Add Payment Card Details</title>
<link href="common/style.css" rel="stylesheet" type="text/css" />
</head>
<body >
<br/>
<div id="jive-wrapper">
    <div id="jive-header">
        <div id="logo">
           
            <a title="Paypal X Home" href="#"><div id="titlex"></div></a>
        </div>
    </div>

<div id="main">
<%@ include file='menu.html'%>
<div id="request_form">
<%
AddPaymentCardResponse addCardResponse=(AddPaymentCardResponse)session.getValue("addCardResponse");
	 			
%>

<table width="400">
<tr>
<h3>Add Payment Card Details</h3>
<br>
</tr>
		<tr>
        <td class="thinfield">Status:</td>
        <td class="thinfield"><%=addCardResponse.getExecStatus()%></td>

   
    </tr>   
		<tr>
        <td class="thinfield">Funding Source Key:</td>
        <td class="thinfield"><%=addCardResponse.getFundingSourceKey()%></td>
    </tr>
    
     </table>

</div>
</div>
</div>
</body>
</html>