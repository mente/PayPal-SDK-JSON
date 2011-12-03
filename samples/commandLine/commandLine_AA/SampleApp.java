
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import src.paypalsamples.utils.ClientInfoUtil;
import src.paypalsamples.utils.DateUtil;
import adaptiveaccounts.AdaptiveAccounts;

import com.paypal.svcs.services.PPFaultMessage;
import com.paypal.svcs.types.aa.AddBankAccountRequest;
import com.paypal.svcs.types.aa.AddBankAccountResponse;
import com.paypal.svcs.types.aa.AddPaymentCardRequest;
import com.paypal.svcs.types.aa.AddPaymentCardResponse;
import com.paypal.svcs.types.aa.AddressType;
import com.paypal.svcs.types.aa.BankAccountType;
import com.paypal.svcs.types.aa.BusinessInfoType;
import com.paypal.svcs.types.aa.BusinessType;
import com.paypal.svcs.types.aa.CardDateType;
import com.paypal.svcs.types.aa.ConfirmationType;
import com.paypal.svcs.types.aa.CreateAccountRequest;
import com.paypal.svcs.types.aa.CreateAccountResponse;
import com.paypal.svcs.types.aa.CreateAccountWebOptionsType;
import com.paypal.svcs.types.aa.GetVerifiedStatusRequest;
import com.paypal.svcs.types.aa.GetVerifiedStatusResponse;
import com.paypal.svcs.types.aa.NameType;
import com.paypal.svcs.types.aa.SalesVenueType;
import com.paypal.svcs.types.aa.WebOptionsType;
import com.paypal.svcs.types.common.ClientDetailsType;
import com.paypal.svcs.types.common.ErrorParameter;
import com.paypal.svcs.types.common.RequestEnvelope;

public class SampleApp  {
	ClientDetailsType cl = new ClientDetailsType();
	ClientDetailsType acl = new ClientDetailsType();
	RequestEnvelope en = new RequestEnvelope();
	adaptiveaccounts.AdaptiveAccounts aa = null;

	public static int getRandomNo(){
			int five_digit = new Double( Math.random() * 100000 ).intValue();
			return five_digit;
	}

	public static void main(String[] args) {
		Map<String,String> createAccountData=new HashMap<String,String>();
		Map<String,String> bizAccountData=new HashMap<String,String>();
		try {
			int random=getRandomNo();
			SampleApp app =	new SampleApp();
			app.createAccount(random,createAccountData);        //random value is required to create unique email
			app.createBusinessAccount(random+1,bizAccountData); 
			app.addBankAccount(createAccountData); 						
			app.addBankAccountDirect(createAccountData);
			app.addPaymentCard(bizAccountData);
			app.addPaymentCardDirect(bizAccountData);
			app.setFundingSourceConfirmed();
			app.getVerifiedStatus(createAccountData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    public void createAccount(int random,Map<String,String> accountData) {
    	try {
				CreateAccountRequest accReq = new CreateAccountRequest();
				accReq.setRequestEnvelope(en);
				acl.setDeviceId("SDK");
				acl.setIpAddress("127.0.0.1");
				acl.setApplicationId("APP-1JE4291016473214C");
				accReq.setClientDetails(acl);
				accReq.setAccountType("PERSONAL");
				AddressType address = new AddressType();
				address.setCity("Austin");
				address.setCountryCode("US");
				address.setLine1("1968 Ape Way");
				address.setLine2("Apt 123");
				address.setPostalCode("78750");
				address.setState("TX");
				accReq.setAddress(address);
				accReq.setCitizenshipCountryCode("US");
				accReq.setContactPhoneNumber("512-691-4160");
				accReq.setCurrencyCode("USD");
				accReq.setPreferredLanguageCode("en_US");
				XMLGregorianCalendar dob = DateUtil.getDate("1958-02-18");
				accReq.setDateOfBirth(dob);
				NameType name = new NameType();
				name.setFirstName("John");
				name.setMiddleName("S.");
				name.setLastName("Donahoe");
				name.setSalutation("Mr.");
				accReq.setName(name);
				accReq.setNotificationURL("http://stranger.paypal.com/cgi-bin/ipntest.cgi");
				accReq.setPartnerField1("partnerField1");
				accReq.setPartnerField2("partnerField2");
				accReq.setPartnerField3("partnerField3");
				accReq.setPartnerField4("partnerField4");
				accReq.setPartnerField5("partnerField5");
				accReq.setRegistrationType("WEB");
				
				String emailAddress="platfo-email"+random+"@paypal.com";
				accReq.setEmailAddress(emailAddress);
				aa = new adaptiveaccounts.AdaptiveAccounts();
				CreateAccountResponse resp  = aa.createAccount(accReq);
				System.out.println( "********** CreateAccount: Account Key: " + resp.getCreateAccountKey() );
				
				accountData.put("accountKey", resp.getCreateAccountKey());
	   			accountData.put("emailAddress", emailAddress);
			} catch (PPFaultMessage ppf) {
				System.out.println( "********** CreateAccount: Failed due to invalid data!"+ ppf.getMessage());
				System.out.println("Error Detail :");
	       		showDetail(ppf);	 
		    } catch (Exception e) {
				e.printStackTrace();
			}
		}

        public Map<String,String> createBusinessAccount(int random,Map<String,String> accountData){
        	try {

	       		CreateAccountRequest accReq = new CreateAccountRequest();
	   			accReq.setRequestEnvelope(ClientInfoUtil.getMyAppRequestEnvelope());
	   			accReq.setAccountType("BUSINESS");
	   			accReq.setRegistrationType("web");
	   			
	   			String  emailAddress="platfo-email"+random+"@paypal.com";
	   			accReq.setEmailAddress(emailAddress);
	   			CreateAccountWebOptionsType webOptions = new CreateAccountWebOptionsType();
	   			webOptions.setReturnUrl("http://google.com");
	   			accReq.setCreateAccountWebOptions(webOptions);
	   			AddressType address = new AddressType();
	   			address.setCity("Austin");
	   			address.setCountryCode("US");
	   			address.setLine1("1968 Ape Way");
	   			address.setLine2("Apt 123");
	   			address.setPostalCode("78750");
	   			address.setState("TX");
	   			accReq.setAddress(address);
	   			accReq.setCitizenshipCountryCode("US");
	   			accReq.setContactPhoneNumber("512-691-4160");
	   			accReq.setCurrencyCode("USD");
	   			accReq.setPreferredLanguageCode("en_US");
	   			XMLGregorianCalendar dob = DateUtil.getDate("1968-01-01");
	   			accReq.setDateOfBirth(dob);
	   			NameType name = new NameType();
	   			name.setFirstName("Bonzop");
	   			name.setMiddleName("Simore");
	   			name.setLastName("Zaius");
	   			name.setSalutation("Dr.");
	   			accReq.setName(name);
	   			accReq.setNotificationURL("http://stranger.paypal.com/cgi-bin/ipntest.cgi");
	   			accReq.setPartnerField1("p1");
	   			accReq.setPartnerField2("p2");
	   			accReq.setPartnerField3("p3");
	   			accReq.setPartnerField4("p4");
	   			accReq.setPartnerField5("p5");

	   			BusinessInfoType bizInfo=new BusinessInfoType();
	   			bizInfo.setBusinessName("Bonzop");
	   			AddressType addressType=new AddressType();
	   			addressType.setLine1("1968 Ape Way");
	   			addressType.setLine2("Apt 123");
	   			addressType.setCity("Austin");
	   			addressType.setState("TX");
	   			addressType.setPostalCode("78750");
	   			addressType.setCountryCode("US");

	   			bizInfo.setBusinessAddress(addressType);

	   			bizInfo.setWorkPhone("5126914160");
	   			bizInfo.setCategory(new BigInteger("1001"));
	   			bizInfo.setSubCategory(new BigInteger("2001"));
	   			bizInfo.setCustomerServicePhone("5126914160");
	   			bizInfo.setCustomerServiceEmail("platfo_1255076101_per@gmail.com");
	   			bizInfo.setWebSite("https://www.x.com");
	   			bizInfo.setDateOfEstablishment(DateUtil.getDate("2000-01-01"));
	   			bizInfo.setBusinessType(BusinessType.fromValue("INDIVIDUAL"));
	   			bizInfo.setAveragePrice(new BigDecimal("1.00"));
	   			bizInfo.setAverageMonthlyVolume(new BigDecimal("100"));
	   			bizInfo.setPercentageRevenueFromOnline(new BigInteger("60"));

	   		    List<SalesVenueType> venues = (List<SalesVenueType>) bizInfo.getSalesVenue();
	   			venues.add(SalesVenueType.fromValue("WEB"));
	   			accReq.setBusinessInfo(bizInfo);

	   			AdaptiveAccounts aa = new AdaptiveAccounts();
	   			CreateAccountResponse  resp  = aa.createAccount(accReq);
	   			System.out.println( "********** CreateBusinessAccount: Account Key: " + resp.getCreateAccountKey());
	   			
	   			accountData.put("accountKey", resp.getCreateAccountKey());
	   			accountData.put("emailAddress", emailAddress);
	   		} catch (PPFaultMessage ppf) {
	   			System.out.println( "********** CreateBusinessAccount: Failed due to invalid data!"+ ppf.getMessage());
	   			System.out.println("Error Detail :");
	       		showDetail(ppf);	 
	   	    } catch (Exception e) {
	   			e.printStackTrace();
	   		}
	   	        return accountData;
	       }
	       public void addBankAccount(Map<String,String> createAccountData){
	       	AddBankAccountResponse addBankAccountResponse=null;
	       	try{
	       		  AddBankAccountRequest addBankAccountRequest= new AddBankAccountRequest();
	       		  addBankAccountRequest.setRequestEnvelope(ClientInfoUtil.getMyAppRequestEnvelope());
	       		  addBankAccountRequest.setEmailAddress(createAccountData.get("emailAddress"));
	       		  addBankAccountRequest.setBankCountryCode("US");
	       		  addBankAccountRequest.setBankName("Huntington Bank");
	       		  addBankAccountRequest.setRoutingNumber("021473030");
	       		  addBankAccountRequest.setBankAccountNumber(String.valueOf(getRandomNo()));
	       		  addBankAccountRequest.setBankAccountType(BankAccountType.fromValue("CHECKING"));
	       		  addBankAccountRequest.setConfirmationType(ConfirmationType.fromValue("WEB"));

	       		  WebOptionsType webOptionsType=new WebOptionsType();
	       		  webOptionsType.setCancelUrl("http://www.google.com"); //Example 
	       		  webOptionsType.setCancelUrlDescription("Cancel URL");
	       		  webOptionsType.setReturnUrl( "http://www.yahoo.com"); //Example 
	       		  webOptionsType.setReturnUrlDescription("Return URL");
	       		  addBankAccountRequest.setWebOptions(webOptionsType);

	       		  AdaptiveAccounts aa = new AdaptiveAccounts();
	       		  addBankAccountResponse  = aa.addBankAccount(addBankAccountRequest);
	       		  System.out.println("********** AddBankAccount Redirect:  FundingSourceKey "+addBankAccountResponse.getFundingSourceKey());
	       	}catch (PPFaultMessage ppf) {
	   			System.out.println( "********** AddBankAccount Redirect: Failed due to invalid data!"+ ppf.getMessage());
	   			System.out.println("Error Detail :");
	       		showDetail(ppf);	 
	   	    } catch (Exception e) {
	   			e.printStackTrace();
	   		}
	       }
	       
	       public void addBankAccountDirect(Map<String,String> createAccountData){
		    	  AddBankAccountResponse addBankAccountResponse=null;
		    	  try{
		    		  AddBankAccountRequest addBankAccountRequest= new AddBankAccountRequest();
		    		  addBankAccountRequest.setBankCountryCode("US");
		       		  addBankAccountRequest.setBankName("Huntington Bank");
		       		  addBankAccountRequest.setRoutingNumber("021473030");
		       		  addBankAccountRequest.setBankAccountNumber(String.valueOf(getRandomNo()));
		       		  addBankAccountRequest.setBankAccountType(BankAccountType.fromValue("CHECKING"));
		       		  addBankAccountRequest.setCreateAccountKey(createAccountData.get("accountKey"));
		       		  addBankAccountRequest.setEmailAddress(createAccountData.get("emailAddress"));
		       		  
		       		  RequestEnvelope requestEnvelope=new RequestEnvelope();
		       		  requestEnvelope.setErrorLanguage("en_US");
		       		  addBankAccountRequest.setRequestEnvelope(requestEnvelope);
		       		  addBankAccountRequest.setConfirmationType(ConfirmationType.fromValue("NONE"));
		       		  
		       		  AdaptiveAccounts aa = new AdaptiveAccounts();
		       		  addBankAccountResponse  = aa.addBankAccount(addBankAccountRequest);
		       		  System.out.println("********** AddBankAccount Direct :  FundingSourceKey "+addBankAccountResponse.getFundingSourceKey());
		       		  
		       		  
		    	  }catch (PPFaultMessage ppf) {
			   			System.out.println( "********** AddBankAccount Direct: Failed due to invalid data!"+ ppf.getMessage());
			   			System.out.println("Error Detail :");
			   			showDetail(ppf);
			   	    } catch (Exception e) {
			   			e.printStackTrace();
			   		}
		      }
	       
	       
	      public void addPaymentCard(Map<String,String> bizAccountData){
	    	  AddPaymentCardResponse addCardResponse=null;
	    	  try{
	    		  AddPaymentCardRequest addCardRequest=new AddPaymentCardRequest();
	    		  
	    		  addCardRequest.setEmailAddress(bizAccountData.get("emailAddress"));
	    		  addCardRequest.setCardType("Visa");
	    		  addCardRequest.setCardNumber(generateCC("Visa"));
	    		  addCardRequest.setConfirmationType(ConfirmationType.fromValue("WEB"));
	    		  
	    		  NameType cardOwner=new NameType();
	    		  cardOwner.setFirstName("John");
	    		  cardOwner.setLastName("Deo");
	    		  addCardRequest.setNameOnCard(cardOwner);
	    		  
	    		  
	    		  CardDateType expireDate=new CardDateType();
	    		  expireDate.setMonth(new BigInteger("01"));
	    		  expireDate.setYear(new BigInteger("2014"));
	    		  addCardRequest.setExpirationDate(expireDate);
	    		  
	    		  AddressType billingAddress=new AddressType();
	    		  billingAddress.setLine1("1 Main St");
	    		  billingAddress.setLine2("2nd cross");
	    		  billingAddress.setCity("San Jose");
	    		  billingAddress.setState("CA");
	    		  billingAddress.setPostalCode("95131");
	    		  billingAddress.setCountryCode("US");
	    		  addCardRequest.setBillingAddress(billingAddress);
	    		  
	    		  WebOptionsType webOptions=new WebOptionsType();
	    		  webOptions.setCancelUrl("http://www.paypal.com"); //Example 
	    		  webOptions.setCancelUrlDescription("Cancel URL");
	    		  webOptions.setReturnUrl("http://www.paypal.com"); //Example
	    		  webOptions.setReturnUrlDescription("Return URL");
	    		  addCardRequest.setWebOptions(webOptions);
	    		  
	    		  RequestEnvelope requestEnvelope=new RequestEnvelope();
	    		  requestEnvelope.setErrorLanguage("en_US");
	    		  addCardRequest.setRequestEnvelope(requestEnvelope);
	    		  
	    		  AdaptiveAccounts adaptiveAccounts=new AdaptiveAccounts();
	    		  addCardResponse=adaptiveAccounts.addPaymentCard(addCardRequest);
	    		  
	    		  System.out.println("********** Add Payment Card Redirect:  Status "+ addCardResponse.getExecStatus());
	    		  
	    	  }catch (PPFaultMessage ppf) {
	       		   System.out.println( "********** Add Payment Card Redirect: Failed due to invalid data!"+ ppf.getMessage());
	       		   System.out.println("Error Detail :");
	       		   showDetail(ppf);	 
	       		}  catch (Exception e) {
	       			e.printStackTrace();
	       		}
	      }
	      
	      public void addPaymentCardDirect(Map<String,String> bizAccountData){
	    	  AddPaymentCardResponse addCardResponse=null;
	    	  try{
	    		  AddPaymentCardRequest addCardRequest=new AddPaymentCardRequest();
	    		  addCardRequest.setEmailAddress(bizAccountData.get("emailAddress"));
	    		  addCardRequest.setCreateAccountKey(bizAccountData.get("accountKey"));
	    		  addCardRequest.setCardVerificationNumber("956");
	    		  addCardRequest.setCardType("Visa");
	    		  addCardRequest.setCardNumber(generateCC("Visa"));
	    		  addCardRequest.setConfirmationType(ConfirmationType.fromValue("NONE"));
	    		  
	    		  CardDateType expireDate=new CardDateType();
	    		  expireDate.setMonth(new BigInteger("01"));
	    		  expireDate.setYear(new BigInteger("2014"));
	    		  addCardRequest.setExpirationDate(expireDate);
	    		  
	    		  NameType cardOwner=new NameType();
	    		  cardOwner.setFirstName("John");
	    		  cardOwner.setLastName("Deo");
	    		  addCardRequest.setNameOnCard(cardOwner);
	    		  
	    		  AddressType billingAddress=new AddressType();
	    		  billingAddress.setLine1("1 Main St");
	    		  billingAddress.setLine2("2nd cross");
	    		  billingAddress.setCity("San Jose");
	    		  billingAddress.setState("CA");
	    		  billingAddress.setPostalCode("95131");
	    		  billingAddress.setCountryCode("US");
	    		  addCardRequest.setBillingAddress(billingAddress);
	    		  
	    		  RequestEnvelope requestEnvelope=new RequestEnvelope();
	    		  requestEnvelope.setErrorLanguage("en_US");
	    		  addCardRequest.setRequestEnvelope(requestEnvelope);
	    		  
	    		  AdaptiveAccounts adaptiveAccounts=new AdaptiveAccounts();
	    		  addCardResponse=adaptiveAccounts.addPaymentCard(addCardRequest);
	    		  
	    		  System.out.println("********** Add Payment Card Direct:  Status "+ addCardResponse.getExecStatus());
	    		  
	    	  }catch (PPFaultMessage ppf) {
	       		   System.out.println( "********** Add Payment Card Direct: Failed due to invalid data!"+ ppf.getMessage());
	       		   System.out.println("Error Detail :");
	       		   showDetail(ppf);	 
	       		}  catch (Exception e) {
	       			e.printStackTrace();
	       		}
	      }
	      
	     public void setFundingSourceConfirmed(){
	    	System.out.println("********** SetFundingSourceConfirmed - one of the input parameters require web flow");
	     }
	     
	     public void getVerifiedStatus(Map<String,String> createAccountData) {
		       	GetVerifiedStatusResponse getVerifiedStatusResponse=null;
		       	 try{
		       		   GetVerifiedStatusRequest getStatusRequest=new GetVerifiedStatusRequest();
		       		   getStatusRequest.setRequestEnvelope(ClientInfoUtil.getMyAppRequestEnvelope());
		       		   getStatusRequest.setEmailAddress("platfo@paypal.com");
		       		   getStatusRequest.setFirstName("Bonzop");
		       		   getStatusRequest.setLastName("Zaius");
		       		   getStatusRequest.setMatchCriteria("NAME");

		       		   AdaptiveAccounts aa = new AdaptiveAccounts();
		       		   getVerifiedStatusResponse  = aa.getVerifiedStatus(getStatusRequest);
		       		   String status=getVerifiedStatusResponse.getAccountStatus();
		       		   System.out.println("********** GetVerifiedStatus:  Status "+ status);
		       	   }catch (PPFaultMessage ppf) {
		       		   System.out.println( "********** GetVerifiedStatus: Failed due to invalid data!"+ppf.getMessage());
		       		   System.out.println("Error Detail :");
		       		   showDetail(ppf);	 
		       		}  catch (Exception e) {
		       			e.printStackTrace();
		       		}
		       }
		    
	     public void showDetail(PPFaultMessage ppf){
	    	 List<com.paypal.svcs.types.common.ErrorData> list=ppf.getFaultInfo().getError();
             for(com.paypal.svcs.types.common.ErrorData err:list){ 
            	 System.out.println(err.getMessage());
            	 for(ErrorParameter param:err.getParameter()){ 
            		 System.out.println(param.getName());
            		 System.out.println(param.getValue());
            	 }
             }
	     }
	     public String generateCC(String cardType){
	    	int[] cc_number = new int[16];
	 		int cc_len = 16;
	 		int start = 0;
	 		if("Visa".equalsIgnoreCase(cardType)){
	 			cc_number[start++] = 4;
	 		}else if("Discover".equalsIgnoreCase(cardType)){
	 			cc_number[start++] = 6;
 				cc_number[start++] = 0;
 				cc_number[start++] = 1;
 				cc_number[start++] = 1;
	 		}else if("MasterCard".equalsIgnoreCase(cardType)){
	 			cc_number[start++] = 5;
 				cc_number[start++] = new Double(Math.floor(Math.random() * 5) + 1).intValue();
	 		}
	 		
	         for (int i = start; i < (cc_len - 1); i++) {
	 			cc_number[i] = new Double(Math.floor(Math.random() * 10)).intValue();
	         }
	 		
	 		int sum = 0;
	 		for (int j = 0; j < (cc_len - 1); j++) {
	 			int digit = cc_number[j];
	 			if ((j & 1) == (cc_len & 1)) digit *= 2;
	 			if (digit > 9) digit -= 9;
	 			sum += digit;
	 		}
	 		
	 		int[] check_digit = new int[]{0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
	 		cc_number[cc_len - 1] = check_digit[sum % 10];
	 		
	 		StringBuffer cardNo = new StringBuffer();
	 		for (int k = 0; k < cc_len; k++) {
	 			cardNo.append(cc_number[k]);
	 		}
	    	return cardNo.toString(); 
	     }
}



