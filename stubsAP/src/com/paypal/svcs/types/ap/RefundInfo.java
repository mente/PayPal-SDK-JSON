
package com.paypal.svcs.types.ap;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 						RefundInfo represents the refund attempt made to
 * 						a Receiver of a PayRequest.
 * 					
 * 
 * <p>Java class for RefundInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="receiver" type="{http://svcs.paypal.com/types/ap}Receiver"/>
 *         &lt;element name="refundStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundNetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="refundFeeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="refundGrossAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalOfAllRefunds" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="refundHasBecomeFull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="encryptedRefundTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundTransactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorList" type="{http://svcs.paypal.com/types/ap}ErrorList" minOccurs="0"/>
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
@XmlType(name = "RefundInfo", propOrder = {
    "receiver",
    "refundStatus",
    "refundNetAmount",
    "refundFeeAmount",
    "refundGrossAmount",
    "totalOfAllRefunds",
    "refundHasBecomeFull",
    "encryptedRefundTransactionId",
    "refundTransactionStatus",
    "errorList",
    "any"
})
public class RefundInfo {

    @XmlElement(required = true)
    protected Receiver receiver;
    protected String refundStatus;
    protected BigDecimal refundNetAmount;
    protected BigDecimal refundFeeAmount;
    protected BigDecimal refundGrossAmount;
    protected BigDecimal totalOfAllRefunds;
    protected Boolean refundHasBecomeFull;
    protected String encryptedRefundTransactionId;
    protected String refundTransactionStatus;
    protected ErrorList errorList;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link Receiver }
     *     
     */
    public Receiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receiver }
     *     
     */
    public void setReceiver(Receiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the refundStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * Sets the value of the refundStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundStatus(String value) {
        this.refundStatus = value;
    }

    /**
     * Gets the value of the refundNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundNetAmount() {
        return refundNetAmount;
    }

    /**
     * Sets the value of the refundNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundNetAmount(BigDecimal value) {
        this.refundNetAmount = value;
    }

    /**
     * Gets the value of the refundFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundFeeAmount() {
        return refundFeeAmount;
    }

    /**
     * Sets the value of the refundFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundFeeAmount(BigDecimal value) {
        this.refundFeeAmount = value;
    }

    /**
     * Gets the value of the refundGrossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundGrossAmount() {
        return refundGrossAmount;
    }

    /**
     * Sets the value of the refundGrossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundGrossAmount(BigDecimal value) {
        this.refundGrossAmount = value;
    }

    /**
     * Gets the value of the totalOfAllRefunds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalOfAllRefunds() {
        return totalOfAllRefunds;
    }

    /**
     * Sets the value of the totalOfAllRefunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalOfAllRefunds(BigDecimal value) {
        this.totalOfAllRefunds = value;
    }

    /**
     * Gets the value of the refundHasBecomeFull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundHasBecomeFull() {
        return refundHasBecomeFull;
    }

    /**
     * Sets the value of the refundHasBecomeFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundHasBecomeFull(Boolean value) {
        this.refundHasBecomeFull = value;
    }

    /**
     * Gets the value of the encryptedRefundTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedRefundTransactionId() {
        return encryptedRefundTransactionId;
    }

    /**
     * Sets the value of the encryptedRefundTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedRefundTransactionId(String value) {
        this.encryptedRefundTransactionId = value;
    }

    /**
     * Gets the value of the refundTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundTransactionStatus() {
        return refundTransactionStatus;
    }

    /**
     * Sets the value of the refundTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundTransactionStatus(String value) {
        this.refundTransactionStatus = value;
    }

    /**
     * Gets the value of the errorList property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorList }
     *     
     */
    public ErrorList getErrorList() {
        return errorList;
    }

    /**
     * Sets the value of the errorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorList }
     *     
     */
    public void setErrorList(ErrorList value) {
        this.errorList = value;
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
