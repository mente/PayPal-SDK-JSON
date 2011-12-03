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
</head>
<body alink=#0000FF vlink=#0000FF>
<center><font size=2 color=black face=Verdana><b>AdaptivePayments</b></font>

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

<center><font size=2 color=black face=Verdana><b>Currency
Conversion Details</b></font> <br>
<table width=600>
	<%
		for (Iterator<CurrencyConversionList> iterator = resp
					.getEstimatedAmountTable().getCurrencyConversionList()
					.iterator(); iterator.hasNext();) {
				CurrencyConversionList ccclist = iterator.next();
	%>
	<tr>
		<td><%=ccclist.getBaseAmount().getCode()%> <%=ccclist.getBaseAmount().getAmount()%>
		</td>
		<%
			List l = ccclist.getCurrencyList().getCurrency();
					for (int i = 0; i < l.size(); i++) {
						CurrencyType ct = (CurrencyType) l.get(i);
		%>
		<td><%=ct.getCode()%> <%=ct.getAmount()%></td>

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
</center>
<a id="CallsLink" href="Calls.jsp">Home</a>
</body>
</html>