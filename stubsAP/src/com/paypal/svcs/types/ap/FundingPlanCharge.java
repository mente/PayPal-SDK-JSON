
package com.paypal.svcs.types.ap;

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
 * 						Amount to be charged to a particular funding
 * 						source.
 * 					
 * 
 * <p>Java class for FundingPlanCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundingPlanCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="charge" type="{http://svcs.paypal.com/types/common}CurrencyType"/>
 *         &lt;element name="fundingSource" type="{http://svcs.paypal.com/types/ap}FundingSource"/>
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
@XmlType(name = "FundingPlanCharge", propOrder = {
    "charge",
    "fundingSource",
    "any"
})
public class FundingPlanCharge {

    @XmlElement(required = true)
    protected CurrencyType charge;
    @XmlElement(required = true)
    protected FundingSource fundingSource;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCharge(CurrencyType value) {
        this.charge = value;
    }

    /**
     * Gets the value of the fundingSource property.
     * 
     * @return
     *     possible object is
     *     {@link FundingSource }
     *     
     */
    public FundingSource getFundingSource() {
        return fundingSource;
    }

    /**
     * Sets the value of the fundingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingSource }
     *     
     */
    public void setFundingSource(FundingSource value) {
        this.fundingSource = value;
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
