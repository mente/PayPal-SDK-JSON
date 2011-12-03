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

<%
SetFundingSourceConfirmedResponse setConfirmedResponse=(SetFundingSourceConfirmedResponse)session.getValue("setConfirmedResponse");
	 			
%>
<body>
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

    

    <table width="400">
	<tr>
	<h3>SetFundingSourceConfirmed
    Details</h3><br>

	</tr>
		<tr>
        <td class="thinfield">Status:</td>
        <td class="thinfield"><%=setConfirmedResponse.getResponseEnvelope().getAck() %></td>
    </tr>   
		<tr>
        <td class="thinfield">timestamp:</td>
        <td class="thinfield"><%=setConfirmedResponse.getResponseEnvelope().getTimestamp() %></td>
    </tr>
   
		<tr>
        <td class="thinfield">correlationId:</td>
        <td class="thinfield"><%=setConfirmedResponse.getResponseEnvelope().getCorrelationId() %></td>
    </tr>   
 
		<tr>
        <td class="thinfield">build:</td>
        <td class="thinfield"><%=setConfirmedResponse.getResponseEnvelope().getBuild() %></td>
    </tr>   
		  
    
     </table>
 </div>
</div>
</div>
</body>
</html>
