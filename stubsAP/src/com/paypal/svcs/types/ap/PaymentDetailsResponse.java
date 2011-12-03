
package com.paypal.svcs.types.ap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.paypal.svcs.types.common.ResponseEnvelope;
import org.w3c.dom.Element;


/**
 * 
 * 						The details of the PayRequest as specified in
 * 						the Pay operation.
 * 					
 * 
 * <p>Java class for PaymentDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseEnvelope" type="{http://svcs.paypal.com/types/common}ResponseEnvelope"/>
 *         &lt;element name="cancelUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipnNotificationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentInfoList" type="{http://svcs.paypal.com/types/ap}PaymentInfoList"/>
 *         &lt;element name="returnUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="senderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trackingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="feesPayer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reverseAllParallelPaymentsOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="preapprovalKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundingConstraint" type="{http://svcs.paypal.com/types/ap}FundingConstraint" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://svcs.paypal.com/types/ap}SenderIdentifier" minOccurs="0"/>
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
@XmlType(name = "PaymentDetailsResponse", propOrder = {
    "responseEnvelope",
    "cancelUrl",
    "currencyCode",
    "ipnNotificationUrl",
    "memo",
    "paymentInfoList",
    "returnUrl",
    "senderEmail",
    "status",
    "trackingId",
    "payKey",
    "actionType",
    "feesPayer",
    "reverseAllParallelPaymentsOnError",
    "preapprovalKey",
    "fundingConstraint",
    "sender",
    "any"
})
public class PaymentDetailsResponse {

    @XmlElement(required = true)
    protected ResponseEnvelope responseEnvelope;
    @XmlElement(required = true)
    protected String cancelUrl;
    @XmlElement(required = true)
    protected String currencyCode;
    protected String ipnNotificationUrl;
    protected String memo;
    @XmlElement(required = true)
    protected PaymentInfoList paymentInfoList;
    @XmlElement(required = true)
    protected String returnUrl;
    protected String senderEmail;
    @XmlElement(required = true)
    protected String status;
    protected String trackingId;
    @XmlElement(required = true)
    protected String payKey;
    @XmlElement(required = true)
    protected String actionType;
    @XmlElement(required = true)
    protected String feesPayer;
    protected Boolean reverseAllParallelPaymentsOnError;
    protected String preapprovalKey;
    protected FundingConstraint fundingConstraint;
    protected SenderIdentifier sender;
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
     * Gets the value of the paymentInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoList }
     *     
     */
    public PaymentInfoList getPaymentInfoList() {
        return paymentInfoList;
    }

    /**
     * Sets the value of the paymentInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoList }
     *     
     */
    public void setPaymentInfoList(PaymentInfoList value) {
        this.paymentInfoList = value;
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
     * Gets the value of the trackingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * Sets the value of the trackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingId(String value) {
        this.trackingId = value;
    }

    /**
     * Gets the value of the payKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayKey() {
        return payKey;
    }

    /**
     * Sets the value of the payKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayKey(String value) {
        this.payKey = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
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
     * Gets the value of the reverseAllParallelPaymentsOnError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverseAllParallelPaymentsOnError() {
        return reverseAllParallelPaymentsOnError;
    }

    /**
     * Sets the value of the reverseAllParallelPaymentsOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseAllParallelPaymentsOnError(Boolean value) {
        this.reverseAllParallelPaymentsOnError = value;
    }

    /**
     * Gets the value of the preapprovalKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreapprovalKey() {
        return preapprovalKey;
    }

    /**
     * Sets the value of the preapprovalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreapprovalKey(String value) {
        this.preapprovalKey = value;
    }

    /**
     * Gets the value of the fundingConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link FundingConstraint }
     *     
     */
    public FundingConstraint getFundingConstraint() {
        return fundingConstraint;
    }

    /**
     * Sets the value of the fundingConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingConstraint }
     *     
     */
    public void setFundingConstraint(FundingConstraint value) {
        this.fundingConstraint = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link SenderIdentifier }
     *     
     */
    public SenderIdentifier getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderIdentifier }
     *     
     */
    public void setSender(SenderIdentifier value) {
        this.sender = value;
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
