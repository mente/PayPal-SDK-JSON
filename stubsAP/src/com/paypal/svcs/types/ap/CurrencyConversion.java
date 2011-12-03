
package com.paypal.svcs.types.ap;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.paypal.svcs.types.common.CurrencyType;
import org.w3c.dom.Element;


/**
 * 
 * 						Describes the conversion between 2 currencies.
 * 					
 * 
 * <p>Java class for CurrencyConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyConversion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="from" type="{http://svcs.paypal.com/types/common}CurrencyType"/>
 *         &lt;element name="to" type="{http://svcs.paypal.com/types/common}CurrencyType"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "CurrencyConversion", propOrder = {
    "from",
    "to",
    "exchangeRate",
    "any"
})
public class CurrencyConversion {

    @XmlElement(required = true)
    protected CurrencyType from;
    @XmlElement(required = true)
    protected CurrencyType to;
    @XmlElement(required = true)
    protected BigDecimal exchangeRate;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setFrom(CurrencyType value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setTo(CurrencyType value) {
        this.to = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
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
		sb.append("CurrencyConversion");
		sb.append("{any=").append(any);
		sb.append(", exchangeRate=").append(exchangeRate);
		sb.append(", from=").append(from);
		sb.append(", to=").append(to);
		sb.append('}');
		return sb.toString();
	}
}
