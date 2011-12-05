
package com.paypal.svcs.types.aa;

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
 * <p>Java class for GetUserAgreementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserAgreementRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestEnvelope" type="{http://svcs.paypal.com/types/common}RequestEnvelope"/>
 *         &lt;element name="createAccountKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "GetUserAgreementRequest", propOrder = {
    "requestEnvelope",
    "createAccountKey",
    "countryCode",
    "languageCode",
    "any"
})
public class GetUserAgreementRequest {

    @XmlElement(required = true)
    protected RequestEnvelope requestEnvelope;
    protected String createAccountKey;
    protected String countryCode;
    protected String languageCode;
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
     * Gets the value of the createAccountKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateAccountKey() {
        return createAccountKey;
    }

    /**
     * Sets the value of the createAccountKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateAccountKey(String value) {
        this.createAccountKey = value;
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
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
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
     * {@link Object }
     * {@link Element }
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
