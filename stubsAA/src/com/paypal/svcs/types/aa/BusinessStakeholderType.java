
package com.paypal.svcs.types.aa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                         Info about Stakeholders such as partner,
 * 						beneficial, owner, director etc. 
 * 					
 * 
 * <p>Java class for BusinessStakeholderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessStakeholderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://svcs.paypal.com/types/aa}StakeholderRoleType"/>
 *         &lt;element name="name" type="{http://svcs.paypal.com/types/aa}NameType" minOccurs="0"/>
 *         &lt;element name="fullLegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://svcs.paypal.com/types/aa}AddressType" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessStakeholderType", propOrder = {
    "role",
    "name",
    "fullLegalName",
    "address",
    "dateOfBirth"
})
public class BusinessStakeholderType {

    @XmlElement(required = true)
    protected StakeholderRoleType role;
    protected NameType name;
    protected String fullLegalName;
    protected AddressType address;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link StakeholderRoleType }
     *     
     */
    public StakeholderRoleType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link StakeholderRoleType }
     *     
     */
    public void setRole(StakeholderRoleType value) {
        this.role = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the fullLegalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullLegalName() {
        return fullLegalName;
    }

    /**
     * Sets the value of the fullLegalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullLegalName(String value) {
        this.fullLegalName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

}
