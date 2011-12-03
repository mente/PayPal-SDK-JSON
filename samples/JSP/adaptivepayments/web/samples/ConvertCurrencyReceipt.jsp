<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="adaptivepayments.AdaptivePayments"%>
<%@ page import="com.paypal.svcs.types.ap.*"%>
<%@ page import="com.paypal.svcs.types.common.*"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.io.IOException"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.*"%>
<%@ page import="common.com.paypal.platform.sdk.exceptions.*"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ page import="src.paypalsamples.utils.*"%>
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
<h3>AdaptivePayments</h3>

<%
	ConvertCurrencyResponse resp = null;
	try {
		String[] fromcodes = request.getParameterValues("fromcode");
		String[] tocodes = request.getParameterValues("tocode");
		String[] amountItems = request.getParameterValues("baseamount");
		CurrencyList list = new CurrencyList();
	
		CurrencyCodeList cclist = new CurrencyCodeList();
		for (int i = 0; i < amountItems.length; i++) {
			CurrencyType ct = new CurrencyType();
			ct.setAmount(new BigDecimal(amountItems[i]));
			ct.setCode(fromcodes[i]);
			list.getCurrency().add(ct);

		}
		for (int i = 0; i < tocodes.length; i++) {
			cclist.getCurrencyCode().add(tocodes[i]);

		}
		ConvertCurrencyRequest req = new ConvertCurrencyRequest();
		req.setBaseAmountList(list);
		req.setConvertToCurrencyList(cclist);
		req
				.setRequestEnvelope(ClientInfoUtil
						.getMyAppRequestEnvelope());
		AdaptivePayments ap = new AdaptivePayments();
		resp = ap.convertCurrency(req);
%>

<table width=600>
<tr>

<h3>Convert Currency</h3></font> <br>
</tr>
	<%
		for (Iterator<CurrencyConversionList> iterator = resp
					.getEstimatedAmountTable().getCurrencyConversionList()
					.iterator(); iterator.hasNext();) {
				CurrencyConversionList ccclist = iterator.next();
	%>
	<tr>
		<td class="thinfield"><%=ccclist.getBaseAmount().getCode()%> <%=ccclist.getBaseAmount().getAmount()%>
		</td>
		<%
			List l = ccclist.getCurrencyList().getCurrency();
					for (int i = 0; i < l.size(); i++) {
						CurrencyType ct = (CurrencyType) l.get(i);
		%>
		<td class="thinfield"><%=ct.getCode()%> <%=ct.getAmount()%></td>

		<%
			}
		%>
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