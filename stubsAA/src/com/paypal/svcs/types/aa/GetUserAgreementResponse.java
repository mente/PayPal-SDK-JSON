
package com.paypal.svcs.types.aa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.paypal.svcs.types.common.ResponseEnvelope;
import org.w3c.dom.Element;


/**
 * <p>Java class for GetUserAgreementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserAgreementResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseEnvelope" type="{http://svcs.paypal.com/types/common}ResponseEnvelope"/>
 *         &lt;element name="agreement" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "GetUserAgreementResponse", propOrder = {
    "responseEnvelope",
    "agreement",
    "any"
})
public class GetUserAgreementResponse {

    @XmlElement(required = true)
    protected ResponseEnvelope responseEnvelope;
    @XmlElement(required = true)
    protected String agreement;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the agreement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreement() {
        return agreement;
    }

    /**
     * Sets the value of the agreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreement(String value) {
        this.agreement = value;
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
