
package com.paypal.svcs.types.ap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.paypal.svcs.types.common.ClientDetailsType;
import com.paypal.svcs.types.common.RequestEnvelope;
import org.w3c.dom.Element;


/**
 * 
 * 						The PayRequest contains the payment instructions
 * 						to make from sender to receivers.
 * 					
 * 
 * <p>Java class for PayRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestEnvelope" type="{http://svcs.paypal.com/types/common}RequestEnvelope"/>
 *         &lt;element name="clientDetails" type="{http://svcs.paypal.com/types/common}ClientDetailsType" minOccurs="0"/>
 *         &lt;element name="actionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancelUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="feesPayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipnNotificationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preapprovalKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverList" type="{http://svcs.paypal.com/types/ap}ReceiverList"/>
 *         &lt;element name="reverseAllParallelPaymentsOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="senderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trackingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PayRequest", propOrder = {
    "requestEnvelope",
    "clientDetails",
    "actionType",
    "cancelUrl",
    "currencyCode",
    "feesPayer",
    "ipnNotificationUrl",
    "memo",
    "pin",
    "preapprovalKey",
    "receiverList",
    "reverseAllParallelPaymentsOnError",
    "senderEmail",
    "returnUrl",
    "trackingId",
    "fundingConstraint",
    "sender",
    "any"
})
public class PayRequest {

    @XmlElement(required = true)
    protected RequestEnvelope requestEnvelope;
    protected ClientDetailsType clientDetails;
    @XmlElement(required = true)
    protected String actionType;
    @XmlElement(required = true)
    protected String cancelUrl;
    @XmlElement(required = true)
    protected String currencyCode;
    protected String feesPayer;
    protected String ipnNotificationUrl;
    protected String memo;
    protected String pin;
    protected String preapprovalKey;
    @XmlElement(required = true)
    protected ReceiverList receiverList;
    protected Boolean reverseAllParallelPaymentsOnError;
    protected String senderEmail;
    @XmlElement(required = true)
    protected String returnUrl;
    protected String trackingId;
    protected FundingConstraint fundingConstraint;
    protected SenderIdentifier sender;
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
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
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
     * Gets the value of the receiverList property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverList }
     *     
     */
    public ReceiverList getReceiverList() {
        return receiverList;
    }

    /**
     * Sets the value of the receiverList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverList }
     *     
     */
    public void setReceiverList(ReceiverList value) {
        this.receiverList = value;
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


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("PayRequest");
		sb.append("{actionType='").append(actionType).append('\'');
		sb.append(", any=").append(any);
		sb.append(", cancelUrl='").append(cancelUrl).append('\'');
		sb.append(", clientDetails=").append(clientDetails);
		sb.append(", currencyCode='").append(currencyCode).append('\'');
		sb.append(", feesPayer='").append(feesPayer).append('\'');
		sb.append(", fundingConstraint=").append(fundingConstraint);
		sb.append(", ipnNotificationUrl='").append(ipnNotificationUrl).append('\'');
		sb.append(", memo='").append(memo).append('\'');
		sb.append(", pin='").append(pin).append('\'');
		sb.append(", preapprovalKey='").append(preapprovalKey).append('\'');
		sb.append(", receiverList=").append(receiverList);
		sb.append(", requestEnvelope=").append(requestEnvelope);
		sb.append(", returnUrl='").append(returnUrl).append('\'');
		sb.append(", reverseAllParallelPaymentsOnError=").append(reverseAllParallelPaymentsOnError);
		sb.append(", sender=").append(sender);
		sb.append(", senderEmail='").append(senderEmail).append('\'');
		sb.append(", trackingId='").append(trackingId).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
