<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="adaptivepayments.AdaptivePayments"%>
<%@ page import="src.paypalsamples.utils.*"%>
<%@ page import="common.com.paypal.platform.sdk.exceptions.*"%>
<%@ page import="com.paypal.svcs.types.ap.*"%>
<%@ page import="com.paypal.svcs.types.common.*"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page import="java.io.IOException"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ page import="javax.xml.datatype.XMLGregorianCalendar"%>
<%@ page import="javax.xml.datatype.DatatypeFactory"%>
<%@ include file='constants.jsp'%>
<%@ page language="java"%>
<html>
<head>
<title>PayPal Platform SDK - Adaptive Payments</title>
</head>
<body alink=#0000FF vlink=#0000FF>
<center><font size=2 color=black face=Verdana><b>Pay</b></font>
<%    
try {
		StringBuilder url = new StringBuilder();
		url.append("http://");
		url.append(request.getServerName());			
		url.append(":");
		url.append(request.getServerPort());
		url.append(request.getContextPath());		
		String returnURL = url.toString() + "/samples/PreapprovalDetails.jsp?preapprovalKey=${preapprovalKey}";
		String cancelURL = url.toString() + "/samples/SetPreapproval.jsp";		  			
		PreapprovalRequest approvalReq   = new PreapprovalRequest();
		approvalReq.setCancelUrl(cancelURL);
		approvalReq.setReturnUrl(returnURL);
		approvalReq.setSenderEmail((String)request.getParameter("senderEmail"));
		approvalReq.setCurrencyCode((String)request.getParameter("currencyCode"));
		
		approvalReq.setClientDetails(ClientInfoUtil.getMyAppDetails());		
		approvalReq.setRequestEnvelope(ClientInfoUtil.getMyAppRequestEnvelope());		
		String startDate = (String)request.getParameter("startingDate");	
		String endDate   = (String)request.getParameter("endingDate");		
		approvalReq.setEndingDate(DateUtil.getDate(endDate));
		approvalReq.setMaxAmountPerPayment(new BigDecimal((String)request.getParameter("maxAmountPerPayment")));
		approvalReq.setStartingDate(DateUtil.getDate(startDate));
		approvalReq.setMaxNumberOfPayments(new Integer((String)request.getParameter("maxNumberOfPayments")));
		approvalReq.setMaxTotalAmountOfAllPayments(new BigDecimal((String)request.getParameter("maxTotalAmountOfAllPayments")));		
		AdaptivePayments ap = new AdaptivePayments();
		PreapprovalResponse approvalresponse  = ap.preapproval(approvalReq);
		session.setAttribute("appRespRef", approvalresponse);			    
		String nextUrl="https://www."+testEnv+".paypal.com/cgi-bin/webscr?cmd=_ap-preapproval&preapprovalkey="+approvalresponse.getPreapprovalKey();
		response.sendRedirect(nextUrl);  
       
%> <%
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
</center>
<a id="CallsLink" href="Calls.jsp">Home</a>
</body>
</html>