
package com.paypal.svcs.types.aa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateAccountWebOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateAccountWebOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showAddCreditCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showMobileConfirm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="returnUrlDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useMiniBrowser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateAccountWebOptionsType", propOrder = {
    "returnUrl",
    "showAddCreditCard",
    "showMobileConfirm",
    "returnUrlDescription",
    "useMiniBrowser"
})
public class CreateAccountWebOptionsType {

    protected String returnUrl;
    protected Boolean showAddCreditCard;
    protected Boolean showMobileConfirm;
    protected String returnUrlDescription;
    protected Boolean useMiniBrowser;

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
     * Gets the value of the showAddCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowAddCreditCard() {
        return showAddCreditCard;
    }

    /**
     * Sets the value of the showAddCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowAddCreditCard(Boolean value) {
        this.showAddCreditCard = value;
    }

    /**
     * Gets the value of the showMobileConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMobileConfirm() {
        return showMobileConfirm;
    }

    /**
     * Sets the value of the showMobileConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMobileConfirm(Boolean value) {
        this.showMobileConfirm = value;
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
     * Gets the value of the useMiniBrowser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseMiniBrowser() {
        return useMiniBrowser;
    }

    /**
     * Sets the value of the useMiniBrowser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseMiniBrowser(Boolean value) {
        this.useMiniBrowser = value;
    }

}
