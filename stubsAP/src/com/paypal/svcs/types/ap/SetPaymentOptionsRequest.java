
package com.paypal.svcs.types.ap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.paypal.svcs.types.common.RequestEnvelope;
import org.w3c.dom.Element;


/**
 * 
 * 						The request to set the options of a payment
 * 						request.
 * 					
 * 
 * <p>Java class for SetPaymentOptionsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetPaymentOptionsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestEnvelope" type="{http://svcs.paypal.com/types/common}RequestEnvelope"/>
 *         &lt;element name="payKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initiatingEntity" type="{http://svcs.paypal.com/types/ap}InitiatingEntity" minOccurs="0"/>
 *         &lt;element name="displayOptions" type="{http://svcs.paypal.com/types/ap}DisplayOptions" minOccurs="0"/>
 *         &lt;element name="shippingAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderOptions" type="{http://svcs.paypal.com/types/ap}SenderOptions" minOccurs="0"/>
 *         &lt;element name="receiverOptions" type="{http://svcs.paypal.com/types/ap}ReceiverOptions" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SetPaymentOptionsRequest", propOrder = {
    "requestEnvelope",
    "payKey",
    "initiatingEntity",
    "displayOptions",
    "shippingAddressId",
    "senderOptions",
    "receiverOptions",
    "any"
})
public class SetPaymentOptionsRequest {

    @XmlElement(required = true)
    protected RequestEnvelope requestEnvelope;
    @XmlElement(required = true)
    protected String payKey;
    protected InitiatingEntity initiatingEntity;
    protected DisplayOptions displayOptions;
    protected String shippingAddressId;
    protected SenderOptions senderOptions;
    protected List<ReceiverOptions> receiverOptions;
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
     * Gets the value of the initiatingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link InitiatingEntity }
     *     
     */
    public InitiatingEntity getInitiatingEntity() {
        return initiatingEntity;
    }

    /**
     * Sets the value of the initiatingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitiatingEntity }
     *     
     */
    public void setInitiatingEntity(InitiatingEntity value) {
        this.initiatingEntity = value;
    }

    /**
     * Gets the value of the displayOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayOptions }
     *     
     */
    public DisplayOptions getDisplayOptions() {
        return displayOptions;
    }

    /**
     * Sets the value of the displayOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayOptions }
     *     
     */
    public void setDisplayOptions(DisplayOptions value) {
        this.displayOptions = value;
    }

    /**
     * Gets the value of the shippingAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressId() {
        return shippingAddressId;
    }

    /**
     * Sets the value of the shippingAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressId(String value) {
        this.shippingAddressId = value;
    }

    /**
     * Gets the value of the senderOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SenderOptions }
     *     
     */
    public SenderOptions getSenderOptions() {
        return senderOptions;
    }

    /**
     * Sets the value of the senderOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderOptions }
     *     
     */
    public void setSenderOptions(SenderOptions value) {
        this.senderOptions = value;
    }

    /**
     * Gets the value of the receiverOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiverOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiverOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiverOptions }
     * 
     * 
     */
    public List<ReceiverOptions> getReceiverOptions() {
        if (receiverOptions == null) {
            receiverOptions = new ArrayList<ReceiverOptions>();
        }
        return this.receiverOptions;
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
