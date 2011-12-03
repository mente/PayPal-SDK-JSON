<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="adaptivepayments.AdaptivePayments"%>
<%@ page import="src.paypalsamples.utils.*"%>
<%@ page import="com.paypal.svcs.types.ap.*"%>
<%@ page import="common.com.paypal.platform.sdk.exceptions.*"%>
<%@ page import="com.paypal.svcs.types.common.*"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page import="java.io.IOException"%>
<%@ page import="java.util.*"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ include file='constants.jsp'%>
<%@ page language="java"%>
<html>
<head>
<title>PayPal Platform SDK - Adaptive Payments</title>
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
	RefundResponse refundResp = null;
	RefundInfoList list = null;
	List<RefundInfo> infoList = null;
	try {
		AdaptivePayments ap = new AdaptivePayments();
		String[] receiverEmailItems = request
				.getParameterValues("receiveremail");
		String[] amountItems = request.getParameterValues("amount");
		ReceiverList refundlist = new ReceiverList();
		for (int i = 0, j = 0; i < receiverEmailItems.length; i++) {
			String recreceiverEmail = receiverEmailItems[i];
			if (recreceiverEmail != null
					&& recreceiverEmail.length() != 0) {

				Receiver refundrec = new Receiver();
				refundrec.setAmount(new BigDecimal(amountItems[i]));
				refundrec.setEmail(receiverEmailItems[i]);
				refundlist.getReceiver().add(refundrec);
				j++;
			}
		}
		RefundRequest refundReq = new RefundRequest();
		refundReq.setPayKey((String) request.getParameter("payKey"));
		refundReq.setCurrencyCode((String) request
				.getParameter("currencyCode"));
		refundReq.setReceiverList(refundlist);
		refundReq.setRequestEnvelope(ClientInfoUtil
				.getMyAppRequestEnvelope());
		refundResp = ap.refund(refundReq);
		list = refundResp.getRefundInfoList();
		infoList = list.getRefundInfo();
%>

<table width="600">
<tr>
<h3>AP
- Refund transaction Details</h3>
<br>

<br>
</tr>
	<tr>

		<td class="thinfield"><b>Refund Transaction Status</b></td>
		<td class="thinfield"><b>Refund Status</b></td>
		<td class="thinfield"><b>Net Refund Amount</b></td>
	</tr>

	<%
		for (int i = 0; i < infoList.size(); i++) {
	%>
	<tr>
		<td class="thinfield"><%=infoList.get(i)
											.getRefundTransactionStatus()%></td>
		<td class="thinfield"><%=infoList.get(i).getRefundStatus()%></td>
		<td class="thinfield"><%=infoList.get(i).getRefundNetAmount()%></td>
	</tr>

	<%
		}
	%>
</table>

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
</div>
</div>
</div>
</body>
</html>