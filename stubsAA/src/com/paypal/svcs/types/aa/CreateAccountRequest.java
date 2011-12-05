
package com.paypal.svcs.types.aa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.paypal.svcs.types.common.ClientDetailsType;
import com.paypal.svcs.types.common.RequestEnvelope;
import org.w3c.dom.Element;


/**
 * <p>Java class for CreateAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateAccountRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestEnvelope" type="{http://svcs.paypal.com/types/common}RequestEnvelope"/>
 *         &lt;element name="clientDetails" type="{http://svcs.paypal.com/types/common}ClientDetailsType" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://svcs.paypal.com/types/aa}NameType"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="address" type="{http://svcs.paypal.com/types/aa}AddressType"/>
 *         &lt;element name="contactPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="citizenshipCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferredLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notificationURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createAccountWebOptions" type="{http://svcs.paypal.com/types/aa}CreateAccountWebOptionsType" minOccurs="0"/>
 *         &lt;element name="suppressWelcomeEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="performExtraVettingOnThisAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerField5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessInfo" type="{http://svcs.paypal.com/types/aa}BusinessInfoType" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateAccountRequest", propOrder = {
    "requestEnvelope",
    "clientDetails",
    "accountType",
    "name",
    "dateOfBirth",
    "address",
    "contactPhoneNumber",
    "homePhoneNumber",
    "mobilePhoneNumber",
    "currencyCode",
    "citizenshipCountryCode",
    "preferredLanguageCode",
    "notificationURL",
    "emailAddress",
    "registrationType",
    "createAccountWebOptions",
    "suppressWelcomeEmail",
    "performExtraVettingOnThisAccount",
    "taxId",
    "partnerField1",
    "partnerField2",
    "partnerField3",
    "partnerField4",
    "partnerField5",
    "businessInfo",
    "any"
})
public class CreateAccountRequest {

    @XmlElement(required = true)
    protected RequestEnvelope requestEnvelope;
    protected ClientDetailsType clientDetails;
    protected String accountType;
    @XmlElement(required = true)
    protected NameType name;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(required = true)
    protected AddressType address;
    protected String contactPhoneNumber;
    protected String homePhoneNumber;
    protected String mobilePhoneNumber;
    protected String currencyCode;
    protected String citizenshipCountryCode;
    @XmlElement(required = true)
    protected String preferredLanguageCode;
    protected String notificationURL;
    protected String emailAddress;
    protected String registrationType;
    protected CreateAccountWebOptionsType createAccountWebOptions;
    protected Boolean suppressWelcomeEmail;
    protected Boolean performExtraVettingOnThisAccount;
    protected String taxId;
    protected String partnerField1;
    protected String partnerField2;
    protected String partnerField3;
    protected String partnerField4;
    protected String partnerField5;
    protected BusinessInfoType businessInfo;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the requestEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link RequestEnvelope }
     *     
     */
    public RequestEnvelope getRequestEnvelope() {
        return requestEnvelope;
    }

    /**
     * Sets the value of the requestEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestEnvelope }
     *     
     */
    public void setRequestEnvelope(RequestEnvelope value) {
        this.requestEnvelope = value;
    }

    /**
     * Gets the value of the clientDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ClientDetailsType }
     *     
     */
    public ClientDetailsType getClientDetails() {
        return clientDetails;
    }

    /**
     * Sets the value of the clientDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDetailsType }
     *     
     */
    public void setClientDetails(ClientDetailsType value) {
        this.clientDetails = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    /**
     * Sets the value of the contactPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhoneNumber(String value) {
        this.contactPhoneNumber = value;
    }

    /**
     * Gets the value of the homePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    /**
     * Sets the value of the homePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhoneNumber(String value) {
        this.homePhoneNumber = value;
    }

    /**
     * Gets the value of the mobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Sets the value of the mobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNumber(String value) {
        this.mobilePhoneNumber = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the citizenshipCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipCountryCode() {
        return citizenshipCountryCode;
    }

    /**
     * Sets the value of the citizenshipCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipCountryCode(String value) {
        this.citizenshipCountryCode = value;
    }

    /**
     * Gets the value of the preferredLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredLanguageCode() {
        return preferredLanguageCode;
    }

    /**
     * Sets the value of the preferredLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredLanguageCode(String value) {
        this.preferredLanguageCode = value;
    }

    /**
     * Gets the value of the notificationURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationURL() {
        return notificationURL;
    }

    /**
     * Sets the value of the notificationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationURL(String value) {
        this.notificationURL = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationType(String value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the createAccountWebOptions property.
     * 
     * @return
     *     possible object is
     *     {@link CreateAccountWebOptionsType }
     *     
     */
    public CreateAccountWebOptionsType getCreateAccountWebOptions() {
        return createAccountWebOptions;
    }

    /**
     * Sets the value of the createAccountWebOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateAccountWebOptionsType }
     *     
     */
    public void setCreateAccountWebOptions(CreateAccountWebOptionsType value) {
        this.createAccountWebOptions = value;
    }

    /**
     * Gets the value of the suppressWelcomeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressWelcomeEmail() {
        return suppressWelcomeEmail;
    }

    /**
     * Sets the value of the suppressWelcomeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressWelcomeEmail(Boolean value) {
        this.suppressWelcomeEmail = value;
    }

    /**
     * Gets the value of the performExtraVettingOnThisAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformExtraVettingOnThisAccount() {
        return performExtraVettingOnThisAccount;
    }

    /**
     * Sets the value of the performExtraVettingOnThisAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformExtraVettingOnThisAccount(Boolean value) {
        this.performExtraVettingOnThisAccount = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the partnerField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerField1() {
        return partnerField1;
    }

    /**
     * Sets the value of the partnerField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerField1(String value) {
        this.partnerField1 = value;
    }

    /**
     * Gets the value of the partnerField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerField2() {
        return partnerField2;
    }

    /**
     * Sets the value of the partnerField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerField2(String value) {
        this.partnerField2 = value;
    }

    /**
     * Gets the value of the partnerField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerField3() {
        return partnerField3;
    }

    /**
     * Sets the value of the partnerField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerField3(String value) {
        this.partnerField3 = value;
    }

    /**
     * Gets the value of the partnerField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerField4() {
        return partnerField4;
    }

    /**
     * Sets the value of the partnerField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerField4(String value) {
        this.partnerField4 = value;
    }

    /**
     * Gets the value of the partnerField5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerField5() {
        return partnerField5;
    }

    /**
     * Sets the value of the partnerField5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerField5(String value) {
        this.partnerField5 = value;
    }

    /**
     * Gets the value of the businessInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInfoType }
     *     
     */
    public BusinessInfoType getBusinessInfo() {
        return businessInfo;
    }

    /**
     * Sets the value of the businessInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInfoType }
     *     
     */
    public void setBusinessInfo(BusinessInfoType value) {
        this.businessInfo = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
