
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
 * 						FundingPlan describes the funding sources to be
 * 						used for a specific payment.
 * 					
 * 
 * <p>Java class for FundingPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundingPlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fundingPlanId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fundingAmount" type="{http://svcs.paypal.com/types/common}CurrencyType"/>
 *         &lt;element name="backupFundingSource" type="{http://svcs.paypal.com/types/ap}FundingSource" minOccurs="0"/>
 *         &lt;element name="senderFees" type="{http://svcs.paypal.com/types/common}CurrencyType" minOccurs="0"/>
 *         &lt;element name="currencyConversion" type="{http://svcs.paypal.com/types/ap}CurrencyConversion" minOccurs="0"/>
 *         &lt;element name="charge" type="{http://svcs.paypal.com/types/ap}FundingPlanCharge" maxOccurs="unbounded"/>
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
@XmlType(name = "FundingPlan", propOrder = {
    "fundingPlanId",
    "fundingAmount",
    "backupFundingSource",
    "senderFees",
    "currencyConversion",
    "charge",
    "any"
})
public class FundingPlan {

    @XmlElement(required = true)
    protected String fundingPlanId;
    @XmlElement(required = true)
    protected CurrencyType fundingAmount;
    protected FundingSource backupFundingSource;
    protected CurrencyType senderFees;
    protected CurrencyConversion currencyConversion;
    @XmlElement(required = true)
    protected List<FundingPlanCharge> charge;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the fundingPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundingPlanId() {
        return fundingPlanId;
    }

    /**
     * Sets the value of the fundingPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundingPlanId(String value) {
        this.fundingPlanId = value;
    }

    /**
     * Gets the value of the fundingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getFundingAmount() {
        return fundingAmount;
    }

    /**
     * Sets the value of the fundingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setFundingAmount(CurrencyType value) {
        this.fundingAmount = value;
    }

    /**
     * Gets the value of the backupFundingSource property.
     * 
     * @return
     *     possible object is
     *     {@link FundingSource }
     *     
     */
    public FundingSource getBackupFundingSource() {
        return backupFundingSource;
    }

    /**
     * Sets the value of the backupFundingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingSource }
     *     
     */
    public void setBackupFundingSource(FundingSource value) {
        this.backupFundingSource = value;
    }

    /**
     * Gets the value of the senderFees property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getSenderFees() {
        return senderFees;
    }

    /**
     * Sets the value of the senderFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setSenderFees(CurrencyType value) {
        this.senderFees = value;
    }

    /**
     * Gets the value of the currencyConversion property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion }
     *     
     */
    public CurrencyConversion getCurrencyConversion() {
        return currencyConversion;
    }

    /**
     * Sets the value of the currencyConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion }
     *     
     */
    public void setCurrencyConversion(CurrencyConversion value) {
        this.currencyConversion = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingPlanCharge }
     * 
     * 
     */
    public List<FundingPlanCharge> getCharge() {
        if (charge == null) {
            charge = new ArrayList<FundingPlanCharge>();
        }
        return this.charge;
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
