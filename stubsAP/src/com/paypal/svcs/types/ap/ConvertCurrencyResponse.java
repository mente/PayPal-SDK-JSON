
package com.paypal.svcs.types.ap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.paypal.svcs.types.common.ResponseEnvelope;


/**
 * 
 * 						A response that contains a table of estimated
 * 						converted currencies based on the Convert
 * 						Currency Request.
 * 					
 * 
 * <p>Java class for ConvertCurrencyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvertCurrencyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseEnvelope" type="{http://svcs.paypal.com/types/common}ResponseEnvelope"/>
 *         &lt;element name="estimatedAmountTable" type="{http://svcs.paypal.com/types/ap}CurrencyConversionTable"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertCurrencyResponse", propOrder = {
    "responseEnvelope",
    "estimatedAmountTable"
})
public class ConvertCurrencyResponse {

    @XmlElement(required = true)
    protected ResponseEnvelope responseEnvelope;
    @XmlElement(required = true)
    protected CurrencyConversionTable estimatedAmountTable;

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
     * Gets the value of the estimatedAmountTable property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversionTable }
     *     
     */
    public CurrencyConversionTable getEstimatedAmountTable() {
        return estimatedAmountTable;
    }

    /**
     * Sets the value of the estimatedAmountTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversionTable }
     *     
     */
    public void setEstimatedAmountTable(CurrencyConversionTable value) {
        this.estimatedAmountTable = value;
    }

}
