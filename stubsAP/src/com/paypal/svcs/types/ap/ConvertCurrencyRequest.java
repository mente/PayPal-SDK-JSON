
package com.paypal.svcs.types.ap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.paypal.svcs.types.common.RequestEnvelope;


/**
 * 
 * 						A request to convert one or more currencies into
 * 						their estimated values in other currencies.
 * 					
 * 
 * <p>Java class for ConvertCurrencyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvertCurrencyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestEnvelope" type="{http://svcs.paypal.com/types/common}RequestEnvelope"/>
 *         &lt;element name="baseAmountList" type="{http://svcs.paypal.com/types/ap}CurrencyList"/>
 *         &lt;element name="convertToCurrencyList" type="{http://svcs.paypal.com/types/ap}CurrencyCodeList"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conversionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertCurrencyRequest", propOrder = {
    "requestEnvelope",
    "baseAmountList",
    "convertToCurrencyList",
    "countryCode",
    "conversionType"
})
public class ConvertCurrencyRequest {

    @XmlElement(required = true)
    protected RequestEnvelope requestEnvelope;
    @XmlElement(required = true)
    protected CurrencyList baseAmountList;
    @XmlElement(required = true)
    protected CurrencyCodeList convertToCurrencyList;
    protected String countryCode;
    protected String conversionType;

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
     * Gets the value of the baseAmountList property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyList }
     *     
     */
    public CurrencyList getBaseAmountList() {
        return baseAmountList;
    }

    /**
     * Sets the value of the baseAmountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyList }
     *     
     */
    public void setBaseAmountList(CurrencyList value) {
        this.baseAmountList = value;
    }

    /**
     * Gets the value of the convertToCurrencyList property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeList }
     *     
     */
    public CurrencyCodeList getConvertToCurrencyList() {
        return convertToCurrencyList;
    }

    /**
     * Sets the value of the convertToCurrencyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeList }
     *     
     */
    public void setConvertToCurrencyList(CurrencyCodeList value) {
        this.convertToCurrencyList = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the conversionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionType() {
        return conversionType;
    }

    /**
     * Sets the value of the conversionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionType(String value) {
        this.conversionType = value;
    }

}
