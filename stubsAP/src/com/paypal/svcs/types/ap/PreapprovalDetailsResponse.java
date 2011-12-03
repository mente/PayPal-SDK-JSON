
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
import com.paypal.svcs.types.common.DayOfWeek;
import com.paypal.svcs.types.common.ResponseEnvelope;
import org.w3c.dom.Element;


/**
 * 
 * 						The details of the Preapproval as specified in
 * 						the Preapproval operation.
 * 					
 * 
 * <p>Java class for PreapprovalDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreapprovalDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseEnvelope" type="{http://svcs.paypal.com/types/common}ResponseEnvelope"/>
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cancelUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="curPayments" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="curPaymentsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="curPeriodAttempts" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="curPeriodEndingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOfMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dayOfWeek" type="{http://svcs.paypal.com/types/common}DayOfWeek" minOccurs="0"/>
 *         &lt;element name="endingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="maxAmountPerPayment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maxNumberOfPayments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxNumberOfPaymentsPerPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxTotalAmountOfAllPayments" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="paymentPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="senderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipnNotificationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressList" type="{http://svcs.paypal.com/types/ap}AddressList" minOccurs="0"/>
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
@XmlType(name = "PreapprovalDetailsResponse", propOrder = {
    "responseEnvelope",
    "approved",
    "cancelUrl",
    "curPayments",
    "curPaymentsAmount",
    "curPeriodAttempts",
    "curPeriodEndingDate",
    "currencyCode",
    "dateOfMonth",
    "dayOfWeek",
    "endingDate",
    "maxAmountPerPayment",
    "maxNumberOfPayments",
    "maxNumberOfPaymentsPerPeriod",
    "maxTotalAmountOfAllPayments",
    "paymentPeriod",
    "pinType",
    "returnUrl",
    "senderEmail",
    "memo",
    "startingDate",
    "status",
    "ipnNotificationUrl",
    "addressList",
    "feesPayer",
    "displayMaxTotalAmount",
    "any"
})
public class PreapprovalDetailsResponse {

    @XmlElement(required = true)
    protected ResponseEnvelope responseEnvelope;
    protected boolean approved;
    @XmlElement(required = true)
    protected String cancelUrl;
    protected long curPayments;
    @XmlElement(required = true)
    protected BigDecimal curPaymentsAmount;
    protected Long curPeriodAttempts;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar curPeriodEndingDate;
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
    protected String pinType;
    @XmlElement(required = true)
    protected String returnUrl;
    protected String senderEmail;
    protected String memo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startingDate;
    @XmlElement(required = true)
    protected String status;
    protected String ipnNotificationUrl;
    protected AddressList addressList;
    protected String feesPayer;
    protected Boolean displayMaxTotalAmount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the responseEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseEnvelope }
     *     
     */
    public ResponseEnvelope getResponseEnvelope() {
        return responseEnvelope;
    }

    /**
     * Sets the value of the responseEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseEnvelope }
     *     
     */
    public void setResponseEnvelope(ResponseEnvelope value) {
        this.responseEnvelope = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     */
    public boolean isApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     */
    public void setApproved(boolean value) {
        this.approved = value;
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
     * Gets the value of the curPayments property.
     * 
     */
    public long getCurPayments() {
        return curPayments;
    }

    /**
     * Sets the value of the curPayments property.
     * 
     */
    public void setCurPayments(long value) {
        this.curPayments = value;
    }

    /**
     * Gets the value of the curPaymentsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurPaymentsAmount() {
        return curPaymentsAmount;
    }

    /**
     * Sets the value of the curPaymentsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurPaymentsAmount(BigDecimal value) {
        this.curPaymentsAmount = value;
    }

    /**
     * Gets the value of the curPeriodAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurPeriodAttempts() {
        return curPeriodAttempts;
    }

    /**
     * Sets the value of the curPeriodAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurPeriodAttempts(Long value) {
        this.curPeriodAttempts = value;
    }

    /**
     * Gets the value of the curPeriodEndingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurPeriodEndingDate() {
        return curPeriodEndingDate;
    }

    /**
     * Sets the value of the curPeriodEndingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurPeriodEndingDate(XMLGregorianCalendar value) {
        this.curPeriodEndingDate = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link AddressList }
     *     
     */
    public AddressList getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressList }
     *     
     */
    public void setAddressList(AddressList value) {
        this.addressList = value;
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
