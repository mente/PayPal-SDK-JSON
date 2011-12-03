
package com.paypal.svcs.types.ap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.paypal.svcs.types.common.CurrencyType;


/**
 * 
 * 						A list of estimated currency conversions for a
 * 						base currency.
 * 					
 * 
 * <p>Java class for CurrencyConversionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyConversionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseAmount" type="{http://svcs.paypal.com/types/common}CurrencyType"/>
 *         &lt;element name="currencyList" type="{http://svcs.paypal.com/types/ap}CurrencyList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversionList", propOrder = {
    "baseAmount",
    "currencyList"
})
public class CurrencyConversionList {

    @XmlElement(required = true)
    protected CurrencyType baseAmount;
    @XmlElement(required = true)
    protected CurrencyList currencyList;

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setBaseAmount(CurrencyType value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the currencyList property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyList }
     *     
     */
    public CurrencyList getCurrencyList() {
        return currencyList;
    }

    /**
     * Sets the value of the currencyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyList }
     *     
     */
    public void setCurrencyList(CurrencyList value) {
        this.currencyList = value;
    }

}
