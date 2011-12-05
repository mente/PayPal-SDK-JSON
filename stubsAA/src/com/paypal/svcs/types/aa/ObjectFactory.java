
package com.paypal.svcs.types.aa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.paypal.svcs.types.aa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUserAgreementResponse_QNAME = new QName("http://svcs.paypal.com/types/aa", "GetUserAgreementResponse");
    private final static QName _SetFundingSourceConfirmedResponse_QNAME = new QName("http://svcs.paypal.com/types/aa", "SetFundingSourceConfirmedResponse");
    private final static QName _AddBankAccountResponse_QNAME = new QName("http://svcs.paypal.com/types/aa", "AddBankAccountResponse");
    private final static QName _GetVerifiedStatusRequest_QNAME = new QName("http://svcs.paypal.com/types/aa", "GetVerifiedStatusRequest");
    private final static QName _CreateAccountResponse_QNAME = new QName("http://svcs.paypal.com/types/aa", "CreateAccountResponse");
    private final static QName _AddPaymentCardRequest_QNAME = new QName("http://svcs.paypal.com/types/aa", "AddPaymentCardRequest");
    private final static QName _CreateAccountRequest_QNAME = new QName("http://svcs.paypal.com/types/aa", "CreateAccountRequest");
    private final static QName _GetVerifiedStatusResponse_QNAME = new QName("http://svcs.paypal.com/types/aa", "GetVerifiedStatusResponse");
    private final static QName _AddBankAccountRequest_QNAME = new QName("http://svcs.paypal.com/types/aa", "AddBankAccountRequest");
    private final static QName _SetFundingSourceConfirmedRequest_QNAME = new QName("http://svcs.paypal.com/types/aa", "SetFundingSourceConfirmedRequest");
    private final static QName _GetUserAgreementRequest_QNAME = new QName("http://svcs.paypal.com/types/aa", "GetUserAgreementRequest");
    private final static QName _AddPaymentCardResponse_QNAME = new QName("http://svcs.paypal.com/types/aa", "AddPaymentCardResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.paypal.svcs.types.aa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserAgreementRequest }
     * 
     */
    public GetUserAgreementRequest createGetUserAgreementRequest() {
        return new GetUserAgreementRequest();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link BusinessInfoType }
     * 
     */
    public BusinessInfoType createBusinessInfoType() {
        return new BusinessInfoType();
    }

    /**
     * Create an instance of {@link CardDateType }
     * 
     */
    public CardDateType createCardDateType() {
        return new CardDateType();
    }

    /**
     * Create an instance of {@link CreateAccountWebOptionsType }
     * 
     */
    public CreateAccountWebOptionsType createCreateAccountWebOptionsType() {
        return new CreateAccountWebOptionsType();
    }

    /**
     * Create an instance of {@link SetFundingSourceConfirmedRequest }
     * 
     */
    public SetFundingSourceConfirmedRequest createSetFundingSourceConfirmedRequest() {
        return new SetFundingSourceConfirmedRequest();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link AddPaymentCardResponse }
     * 
     */
    public AddPaymentCardResponse createAddPaymentCardResponse() {
        return new AddPaymentCardResponse();
    }

    /**
     * Create an instance of {@link CreateAccountRequest }
     * 
     */
    public CreateAccountRequest createCreateAccountRequest() {
        return new CreateAccountRequest();
    }

    /**
     * Create an instance of {@link GetVerifiedStatusRequest }
     * 
     */
    public GetVerifiedStatusRequest createGetVerifiedStatusRequest() {
        return new GetVerifiedStatusRequest();
    }

    /**
     * Create an instance of {@link SetFundingSourceConfirmedResponse }
     * 
     */
    public SetFundingSourceConfirmedResponse createSetFundingSourceConfirmedResponse() {
        return new SetFundingSourceConfirmedResponse();
    }

    /**
     * Create an instance of {@link GetUserAgreementResponse }
     * 
     */
    public GetUserAgreementResponse createGetUserAgreementResponse() {
        return new GetUserAgreementResponse();
    }

    /**
     * Create an instance of {@link AccountValidationInfoType }
     * 
     */
    public AccountValidationInfoType createAccountValidationInfoType() {
        return new AccountValidationInfoType();
    }

    /**
     * Create an instance of {@link AddPaymentCardRequest }
     * 
     */
    public AddPaymentCardRequest createAddPaymentCardRequest() {
        return new AddPaymentCardRequest();
    }

    /**
     * Create an instance of {@link GetVerifiedStatusResponse }
     * 
     */
    public GetVerifiedStatusResponse createGetVerifiedStatusResponse() {
        return new GetVerifiedStatusResponse();
    }

    /**
     * Create an instance of {@link AddBankAccountResponse }
     * 
     */
    public AddBankAccountResponse createAddBankAccountResponse() {
        return new AddBankAccountResponse();
    }

    /**
     * Create an instance of {@link BusinessStakeholderType }
     * 
     */
    public BusinessStakeholderType createBusinessStakeholderType() {
        return new BusinessStakeholderType();
    }

    /**
     * Create an instance of {@link AddBankAccountRequest }
     * 
     */
    public AddBankAccountRequest createAddBankAccountRequest() {
        return new AddBankAccountRequest();
    }

    /**
     * Create an instance of {@link WebOptionsType }
     * 
     */
    public WebOptionsType createWebOptionsType() {
        return new WebOptionsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserAgreementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/aa", name = "GetUserAgreementResponse")
    public JAXBElement<GetUserAgreementResponse> createGetUserAgreementResponse(GetUserAgreementResponse value) {
        return new JAXBElement<GetUserAgreementResponse>(_GetUserAgreementResponse_QNAME, GetUserAgreementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFundingSourceConfirmedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/aa", name = "SetFundingSourceConfirmedResponse")
    public JAXBElement<SetFundingSourceConfirmedResponse> createSetFundingSourceConfirmedResponse(SetFundingSourceConfirmedResponse value) {
        return new JAXBElement<SetFundingSourceConfirmedResponse>(_SetFundingSourceConfirmedResponse_QNAME, SetFundingSourceConfirmedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBankAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/aa", name = "AddBankAccountResponse")
    public JAXBElement<AddBankAccountResponse> createAddBankAccountResponse(AddBankAccountResponse value) {
        return new JAXBElement<AddBankAccountResponse>(_AddBankAccountResponse_QNAME, AddBankAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVerifiedStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/aa", name = "GetVerifiedStatusRequest")
    public JAXBElement<GetVerifiedStatusRequest> createGetVerifiedStatusRequest(GetVerifiedStatusRequest value) {
        return new JAXBElement<GetVerifiedStatusRequest>(_GetVerifiedStatusRequest_QNAME, GetVerifiedStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/aa", name = "CreateAccountResponse")
    public JAXBElement<CreateAccountResponse> createCreateAccountResponse(CreateAccountResponse value) {
        return new JAXBElement<CreateAccountResponse>(_CreateAccountResponse_QNAME, CreateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPaymentCardRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/aa", name = "AddPaymentCardRequest")
    public JAXBElement<AddPaymentCardRequest> createAddPaymentCardRequest(AddPaymentCardRequest value) {
        return new JAXBElement<AddPaymentCardRequest>(_AddPaymentCardRequest_QNAME, AddPaymentCardRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/aa", name = "CreateAccountRequest")
    public JAXBElement<CreateAccountRequest> createCreateAccountRequest(CreateAccountRequest value) {
        return new JAXBElement<CreateAccountRequest>(_CreateAccountRequest_QNAME, CreateAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVerifiedStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/aa", name = "GetVerifiedStatusResponse")
    public JAXBElement<GetVerifiedStatusResponse> createGetVerifiedStatusResponse(GetVerifiedStatusResponse value) {
        return new JAXBElement<GetVerifiedStatusResponse>(_GetVerifiedStatusResponse_QNAME, GetVerifiedStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBankAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/aa", name = "AddBankAccountRequest")
    public JAXBElement<AddBankAccountRequest> createAddBankAccountRequest(AddBankAccountRequest value) {
        return new JAXBElement<AddBankAccountRequest>(_AddBankAccountRequest_QNAME, AddBankAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFundingSourceConfirmedRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/aa", name = "SetFundingSourceConfirmedRequest")
    public JAXBElement<SetFundingSourceConfirmedRequest> createSetFundingSourceConfirmedRequest(SetFundingSourceConfirmedRequest value) {
        return new JAXBElement<SetFundingSourceConfirmedRequest>(_SetFundingSourceConfirmedRequest_QNAME, SetFundingSourceConfirmedRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserAgreementRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/aa", name = "GetUserAgreementRequest")
    public JAXBElement<GetUserAgreementRequest> createGetUserAgreementRequest(GetUserAgreementRequest value) {
        return new JAXBElement<GetUserAgreementRequest>(_GetUserAgreementRequest_QNAME, GetUserAgreementRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPaymentCardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/aa", name = "AddPaymentCardResponse")
    public JAXBElement<AddPaymentCardResponse> createAddPaymentCardResponse(AddPaymentCardResponse value) {
        return new JAXBElement<AddPaymentCardResponse>(_AddPaymentCardResponse_QNAME, AddPaymentCardResponse.class, null, value);
    }

}
