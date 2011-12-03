<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="adaptiveaccounts.AdaptiveAccounts"%>
<%@ page import="com.paypal.svcs.types.aa.*"%>
<%@ page import="java.io.IOException"%>
<%@ page import="com.paypal.svcs.types.common.*"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ page import="javax.xml.datatype.XMLGregorianCalendar"%>
<%@ page import="javax.xml.datatype.DatatypeFactory"%>
<%@ page import="src.paypalsamples.utils.*"%>
<%@ page import="com.paypal.svcs.services.*"%>
<%@ page import="java.util.*"%>
<%@ include file='constants.jsp'%>

<%@ page language="java"%>

<%@page import="java.math.BigInteger"%>
<%@page import="java.util.ArrayList"%><html>
<head>
<title>PayPal Platform SDK - Adaptive Accounts</title>
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
<h3>Adaptive Accounts - CreateAccount(Business)</h3>
<%
CreateAccountResponse resp=null;
try {
	StringBuilder url = new StringBuilder();
	url.append("http://");
	url.append(request.getServerName());
	url.append(":");
	url.append(request.getServerPort());
	url.append(request.getContextPath());
	String returnURL = url.toString()+ "/samples/CreateAccountDetail.jsp";
	CreateAccountRequest accReq = new CreateAccountRequest();
	accReq.setRequestEnvelope(ClientInfoUtil.getMyAppRequestEnvelope());
	accReq.setAccountType((String)request.getParameter("accountType"));
	accReq.setRegistrationType("web");
	accReq.setEmailAddress((String)request.getParameter("email"));
	CreateAccountWebOptionsType webOptions = new CreateAccountWebOptionsType();
	webOptions.setReturnUrl(returnURL);	
	accReq.setCreateAccountWebOptions(webOptions);	
	AddressType address = new AddressType();
	address.setCity((String)request.getParameter("address.city"));
	address.setCountryCode((String)request.getParameter("address.countryCode"));
	address.setLine1((String)request.getParameter("address.line1"));
	address.setLine2((String)request.getParameter("address.line2"));
	address.setPostalCode((String)request.getParameter("address.postalCode"));
	address.setState((String)request.getParameter("address.state"));
	accReq.setAddress(address);
	accReq.setCitizenshipCountryCode((String)request.getParameter("citizenshipCountryCode"));
	accReq.setContactPhoneNumber((String)request.getParameter("contactPhoneNumber"));
	accReq.setCurrencyCode((String)request.getParameter("currencyCode"));
	accReq.setPreferredLanguageCode("en_US");
	XMLGregorianCalendar dob = DateUtil.getDate((String)request.getParameter("dateOfBirth"));
	accReq.setDateOfBirth(dob);
	NameType name = new NameType();
	name.setFirstName((String)request.getParameter("name.firstName"));
	name.setMiddleName((String)request.getParameter("name.middleName"));
	name.setLastName((String)request.getParameter("name.lastName"));
	name.setSalutation((String)request.getParameter("name.salutation"));
	accReq.setName(name);
	accReq.setNotificationURL((String)request.getParameter("notificationURL"));
	accReq.setPartnerField1((String)request.getParameter("partnerField1"));
	accReq.setPartnerField2((String)request.getParameter("partnerField2"));
	accReq.setPartnerField3((String)request.getParameter("partnerField3"));
	accReq.setPartnerField4((String)request.getParameter("partnerField4"));
	accReq.setPartnerField5((String)request.getParameter("partnerField5"));		
	
	BusinessInfoType bizInfo=new BusinessInfoType();
	bizInfo.setBusinessName((String)request.getParameter("biz_name"));
	AddressType addressType=new AddressType();
	addressType.setLine1((String)request.getParameter("biz_address_line1"));
	addressType.setLine1((String)request.getParameter("biz_address_line2"));
	addressType.setCity((String)request.getParameter("biz_address_city"));
	addressType.setState((String)request.getParameter("biz_address_state"));
	addressType.setPostalCode((String)request.getParameter("biz_address_postalCode"));
	addressType.setCountryCode((String)request.getParameter("biz_address_countryCode"));
	
	bizInfo.setBusinessAddress(addressType);
	
	bizInfo.setWorkPhone((String)request.getParameter("biz_contactPhoneNumber"));
	bizInfo.setCategory(new BigInteger((String)request.getParameter("biz_CategoryCode")));
	bizInfo.setSubCategory(new BigInteger((String)request.getParameter("biz_subCategoryCode")));
	bizInfo.setCustomerServicePhone((String)request.getParameter("biz_customerServicePhone"));
	bizInfo.setCustomerServiceEmail((String)request.getParameter("biz_customerServiceEmail"));
	bizInfo.setWebSite((String)request.getParameter("biz_webSite"));
	bizInfo.setDateOfEstablishment(DateUtil.getDate(request.getParameter("biz_dateOfEstablishment")));
	bizInfo.setBusinessType(BusinessType.fromValue((String)request.getParameter("businessType")));
	bizInfo.setAveragePrice(new BigDecimal((String)request.getParameter("biz_averagePrice")));
	bizInfo.setAverageMonthlyVolume(new BigDecimal((String)request.getParameter("biz_averageMonthlyVolume")));
	bizInfo.setPercentageRevenueFromOnline(new BigInteger((String)request.getParameter("biz_percentageRevenueFromOnline")));
	
    List<SalesVenueType> venues = (List<SalesVenueType>) bizInfo.getSalesVenue();
	venues.add(SalesVenueType.fromValue((String)request.getParameter("biz_salesVenue")));
	
	accReq.setBusinessInfo(bizInfo);
		
	AdaptiveAccounts aa = new AdaptiveAccounts();
	resp  = aa.createAccount(accReq);
	session.setAttribute("responseAA", resp);
	String  redirectUrl=resp.getRedirectURL();
	//redirectUrl+="?createAccountKey="+resp.getCreateAccountKey();
	application.setAttribute("execStatus",resp.getExecStatus());
	application.setAttribute("correlationId",resp.getResponseEnvelope().getCorrelationId());
	application.setAttribute("createAccountKey",resp.getCreateAccountKey());
	if (resp.getExecStatus().equalsIgnoreCase("COMPLETED") ) {
		response.sendRedirect(redirectUrl);
    }
} catch (PPFaultMessage e) {
	session.setAttribute("exception", e);
	response.sendRedirect("APIError.jsp"); 		
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