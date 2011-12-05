
package com.paypal.svcs.types.aa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnUrlDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelUrlDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebOptionsType", propOrder = {
    "returnUrl",
    "cancelUrl",
    "returnUrlDescription",
    "cancelUrlDescription"
})
public class WebOptionsType {

    protected String returnUrl;
    protected String cancelUrl;
    protected String returnUrlDescription;
    protected String cancelUrlDescription;

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
     * Gets the value of the returnUrlDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnUrlDescription() {
        return returnUrlDescription;
    }

    /**
     * Sets the value of the returnUrlDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnUrlDescription(String value) {
        this.returnUrlDescription = value;
    }

    /**
     * Gets the value of the cancelUrlDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelUrlDescription() {
        return cancelUrlDescription;
    }

    /**
     * Sets the value of the cancelUrlDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelUrlDescription(String value) {
        this.cancelUrlDescription = value;
    }

}
