
package com.paypal.svcs.types.ap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						A table that contains a list of estimated
 * 						currency conversions for a base currency in each
 * 						row.
 * 					
 * 
 * <p>Java class for CurrencyConversionTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyConversionTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyConversionList" type="{http://svcs.paypal.com/types/ap}CurrencyConversionList" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversionTable", propOrder = {
    "currencyConversionList"
})
public class CurrencyConversionTable {

    @XmlElement(required = true)
    protected List<CurrencyConversionList> currencyConversionList;

    /**
     * Gets the value of the currencyConversionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyConversionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyConversionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyConversionList }
     * 
     * 
     */
    public List<CurrencyConversionList> getCurrencyConversionList() {
        if (currencyConversionList == null) {
            currencyConversionList = new ArrayList<CurrencyConversionList>();
        }
        return this.currencyConversionList;
    }

}
