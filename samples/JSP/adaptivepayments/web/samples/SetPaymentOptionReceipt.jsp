<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="adaptivepayments.AdaptivePayments"%>
<%@ page import="com.paypal.svcs.types.ap.*"%>
<%@ page import="com.paypal.svcs.types.common.*"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page import="java.io.IOException"%>
<%@ page import="common.com.paypal.platform.sdk.exceptions.*"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ page import="src.paypalsamples.utils.*"%>
<%@ include file='constants.jsp'%>
<%@ page language="java"%>


<html>
<head>
<title>PayPal Platform SDK - Set Payment Option</title>
<link href="common/style.css" rel="stylesheet" type="text/css" />
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

<div id="main">
<%@ include file='menu.html'%>

<div id="request_form">
  <%
    try{
    	boolean flag=false;
    	String payKey=(String)request.getParameter("payKey");
    	AdaptivePayments ap = new AdaptivePayments();
    	SetPaymentOptionsRequest setOptionsRequest=new SetPaymentOptionsRequest();
    	
    	setOptionsRequest.setPayKey(payKey);
    	
    	DisplayOptions displayOptions = new DisplayOptions();
    	if(request.getParameter("headerImage")!=""){
    	   displayOptions.setEmailHeaderImageUrl(request.getParameter("headerImage"));
    	   flag=true;
    	}
    	if(request.getParameter("marketingImage")!=""){
    	   displayOptions.setEmailMarketingImageUrl(request.getParameter("marketingImage"));
    	   flag=true;
    	}
    	if(flag){
    	    setOptionsRequest.setDisplayOptions(displayOptions);
    	}
    	
    	//Reset Flag
    	flag=false;
    	
    	InitiatingEntity initiatingEntity = new InitiatingEntity();
    	InstitutionCustomer institutionCustomer = new InstitutionCustomer();
    	
    	if(request.getParameter("countryCode")!=""){
    		institutionCustomer.setCountryCode((String)request.getParameter("countryCode"));
    		flag=true;
    	}
    	if(request.getParameter("displayName")!=""){
    		institutionCustomer.setDisplayName((String)request.getParameter("displayName"));
    		flag=true;
    	}
    	if(request.getParameter("email")!=""){
    		institutionCustomer.setEmail((String)request.getParameter("email"));
    		flag=true;
    	}
    	if(request.getParameter("firstName")!=""){
    		institutionCustomer.setFirstName((String)request.getParameter("firstName"));
    		flag=true;
    	}
    	if(request.getParameter("lastName")!=""){
    		institutionCustomer.setLastName((String)request.getParameter("lastName"));
    		flag=true;
    	}
    	if(request.getParameter("customerId")!=""){
    		institutionCustomer.setInstitutionCustomerId((String)request.getParameter("customerId"));
    		flag=true;
    	}
    	if(request.getParameter("institutionId")!=""){
    		institutionCustomer.setInstitutionId((String)request.getParameter("institutionId"));
    		flag=true;
    	}
    	if(flag){
    		initiatingEntity.setInstitutionCustomer(institutionCustomer);
    		setOptionsRequest.setInitiatingEntity(initiatingEntity);
    	}
    	
    	RequestEnvelope en = new RequestEnvelope();
    	en.setErrorLanguage("en_US");
    	
    	setOptionsRequest.setRequestEnvelope(en);
    	SetPaymentOptionsResponse setOptionsResponse=ap.setPaymentOption(setOptionsRequest);
    	
    	//session.setAttribute("payKey",payKey);
    	//response.sendRedirect("ExecutePayment.jsp?payKey="+payKey);
    
    	
   %>
<center><h3>Pay - Create, Set, Execute API Flow</h3>
<p class="header2"><b>Set Payment Options -  Response</b></p>
</center>
	<br>
   <table align="center" width="50%">
   
	<tr >
	   <td class="thinfield">Ack:</td>
	   <td class="thinfield"><%=setOptionsResponse!=null?setOptionsResponse.getResponseEnvelope().getAck():"" %></td>
	</tr>
	<tr>
	   <td class="thinfield">CorrelationId:</td>
	   <td class="thinfield"><%=setOptionsResponse!=null?setOptionsResponse.getResponseEnvelope().getCorrelationId():"" %></td>
	</tr>
	<tr>
	   <td class="thinfield">TimeStamp:</td>
	   <td class="thinfield"><%=setOptionsResponse!=null?setOptionsResponse.getResponseEnvelope().getTimestamp():"" %></td>
	</tr>
	<tr>
	   <td class="thinfield">Build:</td>
	   <td class="thinfield"><%=setOptionsResponse!=null?setOptionsResponse.getResponseEnvelope().getBuild():"" %></td>
	</tr>
 </table>
 <br/>
 <table align="center" width="50%">
   <tr>
    
      <td class="thinfield"><a href="ExecutePayment.jsp?payKey=<%=payKey%>">* Execute Payment</a></td>
    </tr>
 </table>		
</div>
</div>
  <%  	
    } catch (PPFaultMessage e) {
		session.setAttribute("exception", e);
		response.sendRedirect("APIError.jsp"); 	
	} catch (SSLConnectionException e) {
		session.setAttribute("exception", e);
		response.sendRedirect("ConfigError.jsp"); 		
	} catch (IOException e) {
		session.setAttribute("exception", e);
		response.sendRedirect("ConfigError.jsp"); 		
	} catch (Exception e) {
		session.setAttribute("exception", e);
		response.sendRedirect("Error.jsp"); 		
	}
  
  %>
</body>
</html>