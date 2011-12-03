
package com.paypal.svcs.types.ap;

import java.math.BigDecimal;
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
import com.paypal.svcs.types.common.DayOfWeek;
import com.paypal.svcs.types.common.RequestEnvelope;
import org.w3c.dom.Element;


/**
 * 
 * 						A request to create a Preapproval. A Preapproval
 * 						is an agreement between a Paypal account holder
 * 						(the sender) and the API caller (the service
 * 						invoker) to make payment(s) on the the sender's
 * 						behalf with various limitations defined.
 * 					
 * 
 * <p>Java class for PreapprovalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreapprovalRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestEnvelope" type="{http://svcs.paypal.com/types/common}RequestEnvelope"/>
 *         &lt;element name="clientDetails" type="{http://svcs.paypal.com/types/common}ClientDetailsType" minOccurs="0"/>
 *         &lt;element name="cancelUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOfMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dayOfWeek" type="{http://svcs.paypal.com/types/common}DayOfWeek" minOccurs="0"/>
 *         &lt;element name="endingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="maxAmountPerPayment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maxNumberOfPayments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxNumberOfPaymentsPerPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxTotalAmountOfAllPayments" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="paymentPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipnNotificationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="pinType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feesPayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayMaxTotalAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "PreapprovalRequest", propOrder = {
    "requestEnvelope",
    "clientDetails",
    "cancelUrl",
    "currencyCode",
    "dateOfMonth",
    "dayOfWeek",
    "endingDate",
    "maxAmountPerPayment",
    "maxNumberOfPayments",
    "maxNumberOfPaymentsPerPeriod",
    "maxTotalAmountOfAllPayments",
    "paymentPeriod",
    "returnUrl",
    "memo",
    "ipnNotificationUrl",
    "senderEmail",
    "startingDate",
    "pinType",
    "feesPayer",
    "displayMaxTotalAmount",
    "any"
})
public class PreapprovalRequest {

    @XmlElement(required = true)
    protected RequestEnvelope requestEnvelope;
    protected ClientDetailsType clientDetails;
    @XmlElement(required = true)
    protected String cancelUrl;
    @XmlElement(required = true)
    protected String currencyCode;
    protected Integer dateOfMonth;
    protected DayOfWeek dayOfWeek;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endingDate;
    protected BigDecimal maxAmountPerPayment;
    protected Integer maxNumberOfPayments;
    protected Integer maxNumberOfPaymentsPerPeriod;
    protected BigDecimal maxTotalAmountOfAllPayments;
    protected String paymentPeriod;
    @XmlElement(required = true)
    protected String returnUrl;
    protected String memo;
    protected String ipnNotificationUrl;
    protected String senderEmail;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startingDate;
    protected String pinType;
    protected String feesPayer;
    protected Boolean displayMaxTotalAmount;
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
     * Gets the value of the cancelUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * Sets the value of the cancelUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelUrl(String value) {
        this.cancelUrl = value;
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
     * Gets the value of the dateOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDateOfMonth() {
        return dateOfMonth;
    }

    /**
     * Sets the value of the dateOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDateOfMonth(Integer value) {
        this.dateOfMonth = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeek }
     *     
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeek }
     *     
     */
    public void setDayOfWeek(DayOfWeek value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the endingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndingDate() {
        return endingDate;
    }

    /**
     * Sets the value of the endingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndingDate(XMLGregorianCalendar value) {
        this.endingDate = value;
    }

    /**
     * Gets the value of the maxAmountPerPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmountPerPayment() {
        return maxAmountPerPayment;
    }

    /**
     * Sets the value of the maxAmountPerPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmountPerPayment(BigDecimal value) {
        this.maxAmountPerPayment = value;
    }

    /**
     * Gets the value of the maxNumberOfPayments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfPayments() {
        return maxNumberOfPayments;
    }

    /**
     * Sets the value of the maxNumberOfPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfPayments(Integer value) {
        this.maxNumberOfPayments = value;
    }

    /**
     * Gets the value of the maxNumberOfPaymentsPerPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfPaymentsPerPeriod() {
        return maxNumberOfPaymentsPerPeriod;
    }

    /**
     * Sets the value of the maxNumberOfPaymentsPerPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfPaymentsPerPeriod(Integer value) {
        this.maxNumberOfPaymentsPerPeriod = value;
    }

    /**
     * Gets the value of the maxTotalAmountOfAllPayments property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxTotalAmountOfAllPayments() {
        return maxTotalAmountOfAllPayments;
    }

    /**
     * Sets the value of the maxTotalAmountOfAllPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxTotalAmountOfAllPayments(BigDecimal value) {
        this.maxTotalAmountOfAllPayments = value;
    }

    /**
     * Gets the value of the paymentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPeriod() {
        return paymentPeriod;
    }

    /**
     * Sets the value of the paymentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPeriod(String value) {
        this.paymentPeriod = value;
    }

    /**
     * Gets the value of the returnUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Sets the value of the returnUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnUrl(String value) {
        this.returnUrl = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the ipnNotificationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpnNotificationUrl() {
        return ipnNotificationUrl;
    }

    /**
     * Sets the value of the ipnNotificationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpnNotificationUrl(String value) {
        this.ipnNotificationUrl = value;
    }

    /**
     * Gets the value of the senderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderEmail() {
        return senderEmail;
    }

    /**
     * Sets the value of the senderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderEmail(String value) {
        this.senderEmail = value;
    }

    /**
     * Gets the value of the startingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartingDate() {
        return startingDate;
    }

    /**
     * Sets the value of the startingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartingDate(XMLGregorianCalendar value) {
        this.startingDate = value;
    }

    /**
     * Gets the value of the pinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinType() {
        return pinType;
    }

    /**
     * Sets the value of the pinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinType(String value) {
        this.pinType = value;
    }

    /**
     * Gets the value of the feesPayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeesPayer() {
        return feesPayer;
    }

    /**
     * Sets the value of the feesPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeesPayer(String value) {
        this.feesPayer = value;
    }

    /**
     * Gets the value of the displayMaxTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayMaxTotalAmount() {
        return displayMaxTotalAmount;
    }

    /**
     * Sets the value of the displayMaxTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayMaxTotalAmount(Boolean value) {
        this.displayMaxTotalAmount = value;
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
     * {@link Element }
     * {@link Object }
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
