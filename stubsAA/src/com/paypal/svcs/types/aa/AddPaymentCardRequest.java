
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
import com.paypal.svcs.types.common.RequestEnvelope;
import org.w3c.dom.Element;


/**
 * <p>Java class for AddPaymentCardRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPaymentCardRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestEnvelope" type="{http://svcs.paypal.com/types/common}RequestEnvelope"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createAccountKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameOnCard" type="{http://svcs.paypal.com/types/aa}NameType"/>
 *         &lt;element name="billingAddress" type="{http://svcs.paypal.com/types/aa}AddressType"/>
 *         &lt;element name="cardOwnerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardType" type="{http://svcs.paypal.com/types/aa}CardTypeType"/>
 *         &lt;element name="expirationDate" type="{http://svcs.paypal.com/types/aa}CardDateType" minOccurs="0"/>
 *         &lt;element name="cardVerificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://svcs.paypal.com/types/aa}CardDateType" minOccurs="0"/>
 *         &lt;element name="issueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmationType" type="{http://svcs.paypal.com/types/aa}ConfirmationType"/>
 *         &lt;element name="webOptions" type="{http://svcs.paypal.com/types/aa}WebOptionsType" minOccurs="0"/>
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
@XmlType(name = "AddPaymentCardRequest", propOrder = {
    "requestEnvelope",
    "emailAddress",
    "accountId",
    "createAccountKey",
    "nameOnCard",
    "billingAddress",
    "cardOwnerDateOfBirth",
    "cardNumber",
    "cardType",
    "expirationDate",
    "cardVerificationNumber",
    "startDate",
    "issueNumber",
    "confirmationType",
    "webOptions",
    "any"
})
public class AddPaymentCardRequest {

    @XmlElement(required = true)
    protected RequestEnvelope requestEnvelope;
    protected String emailAddress;
    protected String accountId;
    protected String createAccountKey;
    @XmlElement(required = true)
    protected NameType nameOnCard;
    @XmlElement(required = true)
    protected AddressType billingAddress;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cardOwnerDateOfBirth;
    @XmlElement(required = true)
    protected String cardNumber;
    @XmlElement(required = true)
    protected String cardType;
    protected CardDateType expirationDate;
    protected String cardVerificationNumber;
    protected CardDateType startDate;
    protected String issueNumber;
    @XmlElement(required = true)
    protected ConfirmationType confirmationType;
    protected WebOptionsType webOptions;
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
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the createAccountKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateAccountKey() {
        return createAccountKey;
    }

    /**
     * Sets the value of the createAccountKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateAccountKey(String value) {
        this.createAccountKey = value;
    }

    /**
     * Gets the value of the nameOnCard property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Sets the value of the nameOnCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setNameOnCard(NameType value) {
        this.nameOnCard = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBillingAddress(AddressType value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the cardOwnerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardOwnerDateOfBirth() {
        return cardOwnerDateOfBirth;
    }

    /**
     * Sets the value of the cardOwnerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardOwnerDateOfBirth(XMLGregorianCalendar value) {
        this.cardOwnerDateOfBirth = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CardDateType }
     *     
     */
    public CardDateType getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDateType }
     *     
     */
    public void setExpirationDate(CardDateType value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the cardVerificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardVerificationNumber() {
        return cardVerificationNumber;
    }

    /**
     * Sets the value of the cardVerificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardVerificationNumber(String value) {
        this.cardVerificationNumber = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link CardDateType }
     *     
     */
    public CardDateType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDateType }
     *     
     */
    public void setStartDate(CardDateType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
    }

    /**
     * Gets the value of the confirmationType property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationType }
     *     
     */
    public ConfirmationType getConfirmationType() {
        return confirmationType;
    }

    /**
     * Sets the value of the confirmationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationType }
     *     
     */
    public void setConfirmationType(ConfirmationType value) {
        this.confirmationType = value;
    }

    /**
     * Gets the value of the webOptions property.
     * 
     * @return
     *     possible object is
     *     {@link WebOptionsType }
     *     
     */
    public WebOptionsType getWebOptions() {
        return webOptions;
    }

    /**
     * Sets the value of the webOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebOptionsType }
     *     
     */
    public void setWebOptions(WebOptionsType value) {
        this.webOptions = value;
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
