
package com.paypal.svcs.types.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 						This specifies the list of parameters with every
 * 						request to the service.
 * 					
 * 
 * <p>Java class for RequestEnvelope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestEnvelope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detailLevel" type="{http://svcs.paypal.com/types/common}DetailLevelCode" minOccurs="0"/>
 *         &lt;element name="errorLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RequestEnvelope", propOrder = {
    "detailLevel",
    "errorLanguage",
    "any"
})
public class RequestEnvelope {

    @XmlElement(defaultValue = "ReturnAll")
    protected DetailLevelCode detailLevel;
    protected String errorLanguage;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the detailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DetailLevelCode }
     *     
     */
    public DetailLevelCode getDetailLevel() {
        return detailLevel;
    }

    /**
     * Sets the value of the detailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailLevelCode }
     *     
     */
    public void setDetailLevel(DetailLevelCode value) {
        this.detailLevel = value;
    }

    /**
     * Gets the value of the errorLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLanguage() {
        return errorLanguage;
    }

    /**
     * Sets the value of the errorLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLanguage(String value) {
        this.errorLanguage = value;
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
		sb.append("RequestEnvelope");
		sb.append("{any=").append(any);
		sb.append(", detailLevel=").append(detailLevel);
		sb.append(", errorLanguage='").append(errorLanguage).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
