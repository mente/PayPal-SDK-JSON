
package com.paypal.svcs.types.ap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 						Details about the party that initiated this
 * 						payment. The API user is making this payment on
 * 						behalf of the initiator. The initiator can
 * 						simply be an institution or a customer of the
 * 						institution.
 * 					
 * 
 * <p>Java class for InitiatingEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitiatingEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="institutionCustomer" type="{http://svcs.paypal.com/types/ap}InstitutionCustomer" minOccurs="0"/>
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
@XmlType(name = "InitiatingEntity", propOrder = {
    "institutionCustomer",
    "any"
})
public class InitiatingEntity {

    protected InstitutionCustomer institutionCustomer;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the institutionCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link InstitutionCustomer }
     *     
     */
    public InstitutionCustomer getInstitutionCustomer() {
        return institutionCustomer;
    }

    /**
     * Sets the value of the institutionCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstitutionCustomer }
     *     
     */
    public void setInstitutionCustomer(InstitutionCustomer value) {
        this.institutionCustomer = value;
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
