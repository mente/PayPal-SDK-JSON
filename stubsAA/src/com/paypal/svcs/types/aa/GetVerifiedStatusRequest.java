
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
 * <p>Java class for GetVerifiedStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVerifiedStatusRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestEnvelope" type="{http://svcs.paypal.com/types/common}RequestEnvelope"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="matchCriteria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "GetVerifiedStatusRequest", propOrder = {
    "requestEnvelope",
    "emailAddress",
    "matchCriteria",
    "firstName",
    "lastName",
    "any"
})
public class GetVerifiedStatusRequest {

    @XmlElement(required = true)
    protected RequestEnvelope requestEnvelope;
    @XmlElement(required = true)
    protected String emailAddress;
    @XmlElement(required = true)
    protected String matchCriteria;
    protected String firstName;
    protected String lastName;
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
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the matchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchCriteria() {
        return matchCriteria;
    }

    /**
     * Sets the value of the matchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchCriteria(String value) {
        this.matchCriteria = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
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


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("GetVerifiedStatusRequest");
		sb.append("{any=").append(any);
		sb.append(", emailAddress='").append(emailAddress).append('\'');
		sb.append(", firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", matchCriteria='").append(matchCriteria).append('\'');
		sb.append(", requestEnvelope=").append(requestEnvelope);
		sb.append('}');
		return sb.toString();
	}
}
