
package com.paypal.svcs.types.ap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.paypal.svcs.types.ap package. 
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

    private final static QName _CancelPreapprovalRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "CancelPreapprovalRequest");
    private final static QName _GetShippingAddressesResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "GetShippingAddressesResponse");
    private final static QName _PreapprovalDetailsRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "PreapprovalDetailsRequest");
    private final static QName _GetPaymentOptionsRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "GetPaymentOptionsRequest");
    private final static QName _CancelPreapprovalResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "CancelPreapprovalResponse");
    private final static QName _ConvertCurrencyResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "ConvertCurrencyResponse");
    private final static QName _SetPaymentOptionsResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "SetPaymentOptionsResponse");
    private final static QName _PreapprovalResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "PreapprovalResponse");
    private final static QName _GetPaymentOptionsResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "GetPaymentOptionsResponse");
    private final static QName _RefundResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "RefundResponse");
    private final static QName _PaymentDetailsRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "PaymentDetailsRequest");
    private final static QName _PayRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "PayRequest");
    private final static QName _PreapprovalDetailsResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "PreapprovalDetailsResponse");
    private final static QName _ConfirmPreapprovalRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "ConfirmPreapprovalRequest");
    private final static QName _GetFundingPlansRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "GetFundingPlansRequest");
    private final static QName _GetAvailableShippingAddressesRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "GetAvailableShippingAddressesRequest");
    private final static QName _PreapprovalRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "PreapprovalRequest");
    private final static QName _GetUserLimitsRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "GetUserLimitsRequest");
    private final static QName _GetAllowedFundingSourcesResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "GetAllowedFundingSourcesResponse");
    private final static QName _PayResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "PayResponse");
    private final static QName _GetFundingPlansResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "GetFundingPlansResponse");
    private final static QName _PaymentDetailsResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "PaymentDetailsResponse");
    private final static QName _ExecutePaymentResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "ExecutePaymentResponse");
    private final static QName _RefundRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "RefundRequest");
    private final static QName _ConfirmPreapprovalResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "ConfirmPreapprovalResponse");
    private final static QName _SetPaymentOptionsRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "SetPaymentOptionsRequest");
    private final static QName _GetAllowedFundingSourcesRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "GetAllowedFundingSourcesRequest");
    private final static QName _GetShippingAddressesRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "GetShippingAddressesRequest");
    private final static QName _GetAvailableShippingAddressesResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "GetAvailableShippingAddressesResponse");
    private final static QName _ExecutePaymentRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "ExecutePaymentRequest");
    private final static QName _ConvertCurrencyRequest_QNAME = new QName("http://svcs.paypal.com/types/ap", "ConvertCurrencyRequest");
    private final static QName _GetUserLimitsResponse_QNAME = new QName("http://svcs.paypal.com/types/ap", "GetUserLimitsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.paypal.svcs.types.ap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserLimit }
     * 
     */
    public UserLimit createUserLimit() {
        return new UserLimit();
    }

    /**
     * Create an instance of {@link GetPaymentOptionsRequest }
     * 
     */
    public GetPaymentOptionsRequest createGetPaymentOptionsRequest() {
        return new GetPaymentOptionsRequest();
    }

    /**
     * Create an instance of {@link ReceiverOptions }
     * 
     */
    public ReceiverOptions createReceiverOptions() {
        return new ReceiverOptions();
    }

    /**
     * Create an instance of {@link GetUserLimitsResponse }
     * 
     */
    public GetUserLimitsResponse createGetUserLimitsResponse() {
        return new GetUserLimitsResponse();
    }

    /**
     * Create an instance of {@link GetFundingPlansResponse }
     * 
     */
    public GetFundingPlansResponse createGetFundingPlansResponse() {
        return new GetFundingPlansResponse();
    }

    /**
     * Create an instance of {@link WarningData }
     * 
     */
    public WarningData createWarningData() {
        return new WarningData();
    }

    /**
     * Create an instance of {@link PayResponse }
     * 
     */
    public PayResponse createPayResponse() {
        return new PayResponse();
    }

    /**
     * Create an instance of {@link ConfirmPreapprovalRequest }
     * 
     */
    public ConfirmPreapprovalRequest createConfirmPreapprovalRequest() {
        return new ConfirmPreapprovalRequest();
    }

    /**
     * Create an instance of {@link InitiatingEntity }
     * 
     */
    public InitiatingEntity createInitiatingEntity() {
        return new InitiatingEntity();
    }

    /**
     * Create an instance of {@link FundingConstraint }
     * 
     */
    public FundingConstraint createFundingConstraint() {
        return new FundingConstraint();
    }

    /**
     * Create an instance of {@link CurrencyCodeList }
     * 
     */
    public CurrencyCodeList createCurrencyCodeList() {
        return new CurrencyCodeList();
    }

    /**
     * Create an instance of {@link CancelPreapprovalResponse }
     * 
     */
    public CancelPreapprovalResponse createCancelPreapprovalResponse() {
        return new CancelPreapprovalResponse();
    }

    /**
     * Create an instance of {@link ConfirmPreapprovalResponse }
     * 
     */
    public ConfirmPreapprovalResponse createConfirmPreapprovalResponse() {
        return new ConfirmPreapprovalResponse();
    }

    /**
     * Create an instance of {@link Receiver }
     * 
     */
    public Receiver createReceiver() {
        return new Receiver();
    }

    /**
     * Create an instance of {@link InvoiceData }
     * 
     */
    public InvoiceData createInvoiceData() {
        return new InvoiceData();
    }

    /**
     * Create an instance of {@link GetShippingAddressesResponse }
     * 
     */
    public GetShippingAddressesResponse createGetShippingAddressesResponse() {
        return new GetShippingAddressesResponse();
    }

    /**
     * Create an instance of {@link GetShippingAddressesRequest }
     * 
     */
    public GetShippingAddressesRequest createGetShippingAddressesRequest() {
        return new GetShippingAddressesRequest();
    }

    /**
     * Create an instance of {@link FundingPlanCharge }
     * 
     */
    public FundingPlanCharge createFundingPlanCharge() {
        return new FundingPlanCharge();
    }

    /**
     * Create an instance of {@link ReceiverIdentifier }
     * 
     */
    public ReceiverIdentifier createReceiverIdentifier() {
        return new ReceiverIdentifier();
    }

    /**
     * Create an instance of {@link RefundInfoList }
     * 
     */
    public RefundInfoList createRefundInfoList() {
        return new RefundInfoList();
    }

    /**
     * Create an instance of {@link SenderOptions }
     * 
     */
    public SenderOptions createSenderOptions() {
        return new SenderOptions();
    }

    /**
     * Create an instance of {@link ReceiverList }
     * 
     */
    public ReceiverList createReceiverList() {
        return new ReceiverList();
    }

    /**
     * Create an instance of {@link PaymentDetailsResponse }
     * 
     */
    public PaymentDetailsResponse createPaymentDetailsResponse() {
        return new PaymentDetailsResponse();
    }

    /**
     * Create an instance of {@link GetPaymentOptionsResponse }
     * 
     */
    public GetPaymentOptionsResponse createGetPaymentOptionsResponse() {
        return new GetPaymentOptionsResponse();
    }

    /**
     * Create an instance of {@link WarningDataList }
     * 
     */
    public WarningDataList createWarningDataList() {
        return new WarningDataList();
    }

    /**
     * Create an instance of {@link GetAllowedFundingSourcesRequest }
     * 
     */
    public GetAllowedFundingSourcesRequest createGetAllowedFundingSourcesRequest() {
        return new GetAllowedFundingSourcesRequest();
    }

    /**
     * Create an instance of {@link SenderIdentifier }
     * 
     */
    public SenderIdentifier createSenderIdentifier() {
        return new SenderIdentifier();
    }

    /**
     * Create an instance of {@link GetAvailableShippingAddressesResponse }
     * 
     */
    public GetAvailableShippingAddressesResponse createGetAvailableShippingAddressesResponse() {
        return new GetAvailableShippingAddressesResponse();
    }

    /**
     * Create an instance of {@link FundingTypeInfo }
     * 
     */
    public FundingTypeInfo createFundingTypeInfo() {
        return new FundingTypeInfo();
    }

    /**
     * Create an instance of {@link GetAllowedFundingSourcesResponse }
     * 
     */
    public GetAllowedFundingSourcesResponse createGetAllowedFundingSourcesResponse() {
        return new GetAllowedFundingSourcesResponse();
    }

    /**
     * Create an instance of {@link SetPaymentOptionsRequest }
     * 
     */
    public SetPaymentOptionsRequest createSetPaymentOptionsRequest() {
        return new SetPaymentOptionsRequest();
    }

    /**
     * Create an instance of {@link ConvertCurrencyRequest }
     * 
     */
    public ConvertCurrencyRequest createConvertCurrencyRequest() {
        return new ConvertCurrencyRequest();
    }

    /**
     * Create an instance of {@link RefundRequest }
     * 
     */
    public RefundRequest createRefundRequest() {
        return new RefundRequest();
    }

    /**
     * Create an instance of {@link PreapprovalResponse }
     * 
     */
    public PreapprovalResponse createPreapprovalResponse() {
        return new PreapprovalResponse();
    }

    /**
     * Create an instance of {@link GetAvailableShippingAddressesRequest }
     * 
     */
    public GetAvailableShippingAddressesRequest createGetAvailableShippingAddressesRequest() {
        return new GetAvailableShippingAddressesRequest();
    }

    /**
     * Create an instance of {@link InvoiceItem }
     * 
     */
    public InvoiceItem createInvoiceItem() {
        return new InvoiceItem();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link PaymentInfo }
     * 
     */
    public PaymentInfo createPaymentInfo() {
        return new PaymentInfo();
    }

    /**
     * Create an instance of {@link PayRequest }
     * 
     */
    public PayRequest createPayRequest() {
        return new PayRequest();
    }

    /**
     * Create an instance of {@link PayErrorList }
     * 
     */
    public PayErrorList createPayErrorList() {
        return new PayErrorList();
    }

    /**
     * Create an instance of {@link RefundInfo }
     * 
     */
    public RefundInfo createRefundInfo() {
        return new RefundInfo();
    }

    /**
     * Create an instance of {@link PreapprovalDetailsResponse }
     * 
     */
    public PreapprovalDetailsResponse createPreapprovalDetailsResponse() {
        return new PreapprovalDetailsResponse();
    }

    /**
     * Create an instance of {@link PaymentDetailsRequest }
     * 
     */
    public PaymentDetailsRequest createPaymentDetailsRequest() {
        return new PaymentDetailsRequest();
    }

    /**
     * Create an instance of {@link FundingSource }
     * 
     */
    public FundingSource createFundingSource() {
        return new FundingSource();
    }

    /**
     * Create an instance of {@link FundingPlan }
     * 
     */
    public FundingPlan createFundingPlan() {
        return new FundingPlan();
    }

    /**
     * Create an instance of {@link CurrencyList }
     * 
     */
    public CurrencyList createCurrencyList() {
        return new CurrencyList();
    }

    /**
     * Create an instance of {@link ExecutePaymentRequest }
     * 
     */
    public ExecutePaymentRequest createExecutePaymentRequest() {
        return new ExecutePaymentRequest();
    }

    /**
     * Create an instance of {@link CurrencyConversionTable }
     * 
     */
    public CurrencyConversionTable createCurrencyConversionTable() {
        return new CurrencyConversionTable();
    }

    /**
     * Create an instance of {@link CurrencyConversion }
     * 
     */
    public CurrencyConversion createCurrencyConversion() {
        return new CurrencyConversion();
    }

    /**
     * Create an instance of {@link ErrorList }
     * 
     */
    public ErrorList createErrorList() {
        return new ErrorList();
    }

    /**
     * Create an instance of {@link PaymentInfoList }
     * 
     */
    public PaymentInfoList createPaymentInfoList() {
        return new PaymentInfoList();
    }

    /**
     * Create an instance of {@link FundingTypeList }
     * 
     */
    public FundingTypeList createFundingTypeList() {
        return new FundingTypeList();
    }

    /**
     * Create an instance of {@link InstitutionCustomer }
     * 
     */
    public InstitutionCustomer createInstitutionCustomer() {
        return new InstitutionCustomer();
    }

    /**
     * Create an instance of {@link AddressList }
     * 
     */
    public AddressList createAddressList() {
        return new AddressList();
    }

    /**
     * Create an instance of {@link CurrencyConversionList }
     * 
     */
    public CurrencyConversionList createCurrencyConversionList() {
        return new CurrencyConversionList();
    }

    /**
     * Create an instance of {@link ConvertCurrencyResponse }
     * 
     */
    public ConvertCurrencyResponse createConvertCurrencyResponse() {
        return new ConvertCurrencyResponse();
    }

    /**
     * Create an instance of {@link ExecutePaymentResponse }
     * 
     */
    public ExecutePaymentResponse createExecutePaymentResponse() {
        return new ExecutePaymentResponse();
    }

    /**
     * Create an instance of {@link CancelPreapprovalRequest }
     * 
     */
    public CancelPreapprovalRequest createCancelPreapprovalRequest() {
        return new CancelPreapprovalRequest();
    }

    /**
     * Create an instance of {@link GetUserLimitsRequest }
     * 
     */
    public GetUserLimitsRequest createGetUserLimitsRequest() {
        return new GetUserLimitsRequest();
    }

    /**
     * Create an instance of {@link RefundResponse }
     * 
     */
    public RefundResponse createRefundResponse() {
        return new RefundResponse();
    }

    /**
     * Create an instance of {@link SetPaymentOptionsResponse }
     * 
     */
    public SetPaymentOptionsResponse createSetPaymentOptionsResponse() {
        return new SetPaymentOptionsResponse();
    }

    /**
     * Create an instance of {@link PreapprovalDetailsRequest }
     * 
     */
    public PreapprovalDetailsRequest createPreapprovalDetailsRequest() {
        return new PreapprovalDetailsRequest();
    }

    /**
     * Create an instance of {@link DisplayOptions }
     * 
     */
    public DisplayOptions createDisplayOptions() {
        return new DisplayOptions();
    }

    /**
     * Create an instance of {@link PreapprovalRequest }
     * 
     */
    public PreapprovalRequest createPreapprovalRequest() {
        return new PreapprovalRequest();
    }

    /**
     * Create an instance of {@link PayError }
     * 
     */
    public PayError createPayError() {
        return new PayError();
    }

    /**
     * Create an instance of {@link GetFundingPlansRequest }
     * 
     */
    public GetFundingPlansRequest createGetFundingPlansRequest() {
        return new GetFundingPlansRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPreapprovalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "CancelPreapprovalRequest")
    public JAXBElement<CancelPreapprovalRequest> createCancelPreapprovalRequest(CancelPreapprovalRequest value) {
        return new JAXBElement<CancelPreapprovalRequest>(_CancelPreapprovalRequest_QNAME, CancelPreapprovalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShippingAddressesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "GetShippingAddressesResponse")
    public JAXBElement<GetShippingAddressesResponse> createGetShippingAddressesResponse(GetShippingAddressesResponse value) {
        return new JAXBElement<GetShippingAddressesResponse>(_GetShippingAddressesResponse_QNAME, GetShippingAddressesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreapprovalDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "PreapprovalDetailsRequest")
    public JAXBElement<PreapprovalDetailsRequest> createPreapprovalDetailsRequest(PreapprovalDetailsRequest value) {
        return new JAXBElement<PreapprovalDetailsRequest>(_PreapprovalDetailsRequest_QNAME, PreapprovalDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentOptionsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "GetPaymentOptionsRequest")
    public JAXBElement<GetPaymentOptionsRequest> createGetPaymentOptionsRequest(GetPaymentOptionsRequest value) {
        return new JAXBElement<GetPaymentOptionsRequest>(_GetPaymentOptionsRequest_QNAME, GetPaymentOptionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPreapprovalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "CancelPreapprovalResponse")
    public JAXBElement<CancelPreapprovalResponse> createCancelPreapprovalResponse(CancelPreapprovalResponse value) {
        return new JAXBElement<CancelPreapprovalResponse>(_CancelPreapprovalResponse_QNAME, CancelPreapprovalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertCurrencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "ConvertCurrencyResponse")
    public JAXBElement<ConvertCurrencyResponse> createConvertCurrencyResponse(ConvertCurrencyResponse value) {
        return new JAXBElement<ConvertCurrencyResponse>(_ConvertCurrencyResponse_QNAME, ConvertCurrencyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPaymentOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "SetPaymentOptionsResponse")
    public JAXBElement<SetPaymentOptionsResponse> createSetPaymentOptionsResponse(SetPaymentOptionsResponse value) {
        return new JAXBElement<SetPaymentOptionsResponse>(_SetPaymentOptionsResponse_QNAME, SetPaymentOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreapprovalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "PreapprovalResponse")
    public JAXBElement<PreapprovalResponse> createPreapprovalResponse(PreapprovalResponse value) {
        return new JAXBElement<PreapprovalResponse>(_PreapprovalResponse_QNAME, PreapprovalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "GetPaymentOptionsResponse")
    public JAXBElement<GetPaymentOptionsResponse> createGetPaymentOptionsResponse(GetPaymentOptionsResponse value) {
        return new JAXBElement<GetPaymentOptionsResponse>(_GetPaymentOptionsResponse_QNAME, GetPaymentOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "RefundResponse")
    public JAXBElement<RefundResponse> createRefundResponse(RefundResponse value) {
        return new JAXBElement<RefundResponse>(_RefundResponse_QNAME, RefundResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "PaymentDetailsRequest")
    public JAXBElement<PaymentDetailsRequest> createPaymentDetailsRequest(PaymentDetailsRequest value) {
        return new JAXBElement<PaymentDetailsRequest>(_PaymentDetailsRequest_QNAME, PaymentDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "PayRequest")
    public JAXBElement<PayRequest> createPayRequest(PayRequest value) {
        return new JAXBElement<PayRequest>(_PayRequest_QNAME, PayRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreapprovalDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "PreapprovalDetailsResponse")
    public JAXBElement<PreapprovalDetailsResponse> createPreapprovalDetailsResponse(PreapprovalDetailsResponse value) {
        return new JAXBElement<PreapprovalDetailsResponse>(_PreapprovalDetailsResponse_QNAME, PreapprovalDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmPreapprovalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "ConfirmPreapprovalRequest")
    public JAXBElement<ConfirmPreapprovalRequest> createConfirmPreapprovalRequest(ConfirmPreapprovalRequest value) {
        return new JAXBElement<ConfirmPreapprovalRequest>(_ConfirmPreapprovalRequest_QNAME, ConfirmPreapprovalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFundingPlansRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "GetFundingPlansRequest")
    public JAXBElement<GetFundingPlansRequest> createGetFundingPlansRequest(GetFundingPlansRequest value) {
        return new JAXBElement<GetFundingPlansRequest>(_GetFundingPlansRequest_QNAME, GetFundingPlansRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableShippingAddressesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "GetAvailableShippingAddressesRequest")
    public JAXBElement<GetAvailableShippingAddressesRequest> createGetAvailableShippingAddressesRequest(GetAvailableShippingAddressesRequest value) {
        return new JAXBElement<GetAvailableShippingAddressesRequest>(_GetAvailableShippingAddressesRequest_QNAME, GetAvailableShippingAddressesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreapprovalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "PreapprovalRequest")
    public JAXBElement<PreapprovalRequest> createPreapprovalRequest(PreapprovalRequest value) {
        return new JAXBElement<PreapprovalRequest>(_PreapprovalRequest_QNAME, PreapprovalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserLimitsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "GetUserLimitsRequest")
    public JAXBElement<GetUserLimitsRequest> createGetUserLimitsRequest(GetUserLimitsRequest value) {
        return new JAXBElement<GetUserLimitsRequest>(_GetUserLimitsRequest_QNAME, GetUserLimitsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllowedFundingSourcesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "GetAllowedFundingSourcesResponse")
    public JAXBElement<GetAllowedFundingSourcesResponse> createGetAllowedFundingSourcesResponse(GetAllowedFundingSourcesResponse value) {
        return new JAXBElement<GetAllowedFundingSourcesResponse>(_GetAllowedFundingSourcesResponse_QNAME, GetAllowedFundingSourcesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "PayResponse")
    public JAXBElement<PayResponse> createPayResponse(PayResponse value) {
        return new JAXBElement<PayResponse>(_PayResponse_QNAME, PayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFundingPlansResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "GetFundingPlansResponse")
    public JAXBElement<GetFundingPlansResponse> createGetFundingPlansResponse(GetFundingPlansResponse value) {
        return new JAXBElement<GetFundingPlansResponse>(_GetFundingPlansResponse_QNAME, GetFundingPlansResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "PaymentDetailsResponse")
    public JAXBElement<PaymentDetailsResponse> createPaymentDetailsResponse(PaymentDetailsResponse value) {
        return new JAXBElement<PaymentDetailsResponse>(_PaymentDetailsResponse_QNAME, PaymentDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutePaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "ExecutePaymentResponse")
    public JAXBElement<ExecutePaymentResponse> createExecutePaymentResponse(ExecutePaymentResponse value) {
        return new JAXBElement<ExecutePaymentResponse>(_ExecutePaymentResponse_QNAME, ExecutePaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "RefundRequest")
    public JAXBElement<RefundRequest> createRefundRequest(RefundRequest value) {
        return new JAXBElement<RefundRequest>(_RefundRequest_QNAME, RefundRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmPreapprovalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "ConfirmPreapprovalResponse")
    public JAXBElement<ConfirmPreapprovalResponse> createConfirmPreapprovalResponse(ConfirmPreapprovalResponse value) {
        return new JAXBElement<ConfirmPreapprovalResponse>(_ConfirmPreapprovalResponse_QNAME, ConfirmPreapprovalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPaymentOptionsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "SetPaymentOptionsRequest")
    public JAXBElement<SetPaymentOptionsRequest> createSetPaymentOptionsRequest(SetPaymentOptionsRequest value) {
        return new JAXBElement<SetPaymentOptionsRequest>(_SetPaymentOptionsRequest_QNAME, SetPaymentOptionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllowedFundingSourcesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "GetAllowedFundingSourcesRequest")
    public JAXBElement<GetAllowedFundingSourcesRequest> createGetAllowedFundingSourcesRequest(GetAllowedFundingSourcesRequest value) {
        return new JAXBElement<GetAllowedFundingSourcesRequest>(_GetAllowedFundingSourcesRequest_QNAME, GetAllowedFundingSourcesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShippingAddressesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "GetShippingAddressesRequest")
    public JAXBElement<GetShippingAddressesRequest> createGetShippingAddressesRequest(GetShippingAddressesRequest value) {
        return new JAXBElement<GetShippingAddressesRequest>(_GetShippingAddressesRequest_QNAME, GetShippingAddressesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableShippingAddressesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "GetAvailableShippingAddressesResponse")
    public JAXBElement<GetAvailableShippingAddressesResponse> createGetAvailableShippingAddressesResponse(GetAvailableShippingAddressesResponse value) {
        return new JAXBElement<GetAvailableShippingAddressesResponse>(_GetAvailableShippingAddressesResponse_QNAME, GetAvailableShippingAddressesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutePaymentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "ExecutePaymentRequest")
    public JAXBElement<ExecutePaymentRequest> createExecutePaymentRequest(ExecutePaymentRequest value) {
        return new JAXBElement<ExecutePaymentRequest>(_ExecutePaymentRequest_QNAME, ExecutePaymentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertCurrencyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "ConvertCurrencyRequest")
    public JAXBElement<ConvertCurrencyRequest> createConvertCurrencyRequest(ConvertCurrencyRequest value) {
        return new JAXBElement<ConvertCurrencyRequest>(_ConvertCurrencyRequest_QNAME, ConvertCurrencyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserLimitsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/ap", name = "GetUserLimitsResponse")
    public JAXBElement<GetUserLimitsResponse> createGetUserLimitsResponse(GetUserLimitsResponse value) {
        return new JAXBElement<GetUserLimitsResponse>(_GetUserLimitsResponse_QNAME, GetUserLimitsResponse.class, null, value);
    }

}
