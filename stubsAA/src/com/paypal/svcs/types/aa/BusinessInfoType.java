
package com.paypal.svcs.types.aa;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BusinessInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="businessAddress" type="{http://svcs.paypal.com/types/aa}AddressType"/>
 *         &lt;element name="workPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="subCategory" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="merchantCategoryCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="doingBusinessAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerServicePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerServiceEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disputeEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfEstablishment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="businessType" type="{http://svcs.paypal.com/types/aa}BusinessType" minOccurs="0"/>
 *         &lt;element name="businessSubtype" type="{http://svcs.paypal.com/types/aa}BusinessSubtypeType" minOccurs="0"/>
 *         &lt;element name="incorporationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="averagePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="averageMonthlyVolume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="percentageRevenueFromOnline" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="salesVenue" type="{http://svcs.paypal.com/types/aa}SalesVenueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="salesVenueDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vatId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vatCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commercialRegistrationLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalPlaceOfBusinessAddress" type="{http://svcs.paypal.com/types/aa}AddressType" minOccurs="0"/>
 *         &lt;element name="registeredOfficeAddress" type="{http://svcs.paypal.com/types/aa}AddressType" minOccurs="0"/>
 *         &lt;element name="establishmentCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishmentState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessStakeholder" type="{http://svcs.paypal.com/types/aa}BusinessStakeholderType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessInfoType", propOrder = {
    "businessName",
    "businessAddress",
    "workPhone",
    "category",
    "subCategory",
    "merchantCategoryCode",
    "doingBusinessAs",
    "customerServicePhone",
    "customerServiceEmail",
    "disputeEmail",
    "webSite",
    "companyId",
    "dateOfEstablishment",
    "businessType",
    "businessSubtype",
    "incorporationId",
    "averagePrice",
    "averageMonthlyVolume",
    "percentageRevenueFromOnline",
    "salesVenue",
    "salesVenueDesc",
    "vatId",
    "vatCountryCode",
    "commercialRegistrationLocation",
    "principalPlaceOfBusinessAddress",
    "registeredOfficeAddress",
    "establishmentCountryCode",
    "establishmentState",
    "businessStakeholder"
})
public class BusinessInfoType {

    @XmlElement(required = true)
    protected String businessName;
    @XmlElement(required = true)
    protected AddressType businessAddress;
    @XmlElement(required = true)
    protected String workPhone;
    protected BigInteger category;
    protected BigInteger subCategory;
    protected BigInteger merchantCategoryCode;
    protected String doingBusinessAs;
    protected String customerServicePhone;
    protected String customerServiceEmail;
    protected String disputeEmail;
    protected String webSite;
    protected String companyId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfEstablishment;
    protected BusinessType businessType;
    protected BusinessSubtypeType businessSubtype;
    protected String incorporationId;
    protected BigDecimal averagePrice;
    protected BigDecimal averageMonthlyVolume;
    protected BigInteger percentageRevenueFromOnline;
    protected List<SalesVenueType> salesVenue;
    protected String salesVenueDesc;
    protected String vatId;
    protected String vatCountryCode;
    protected String commercialRegistrationLocation;
    protected AddressType principalPlaceOfBusinessAddress;
    protected AddressType registeredOfficeAddress;
    protected String establishmentCountryCode;
    protected String establishmentState;
    protected List<BusinessStakeholderType> businessStakeholder;

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBusinessAddress(AddressType value) {
        this.businessAddress = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategory(BigInteger value) {
        this.category = value;
    }

    /**
     * Gets the value of the subCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubCategory() {
        return subCategory;
    }

    /**
     * Sets the value of the subCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubCategory(BigInteger value) {
        this.subCategory = value;
    }

    /**
     * Gets the value of the merchantCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    /**
     * Sets the value of the merchantCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMerchantCategoryCode(BigInteger value) {
        this.merchantCategoryCode = value;
    }

    /**
     * Gets the value of the doingBusinessAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoingBusinessAs() {
        return doingBusinessAs;
    }

    /**
     * Sets the value of the doingBusinessAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoingBusinessAs(String value) {
        this.doingBusinessAs = value;
    }

    /**
     * Gets the value of the customerServicePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServicePhone() {
        return customerServicePhone;
    }

    /**
     * Sets the value of the customerServicePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServicePhone(String value) {
        this.customerServicePhone = value;
    }

    /**
     * Gets the value of the customerServiceEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceEmail() {
        return customerServiceEmail;
    }

    /**
     * Sets the value of the customerServiceEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceEmail(String value) {
        this.customerServiceEmail = value;
    }

    /**
     * Gets the value of the disputeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeEmail() {
        return disputeEmail;
    }

    /**
     * Sets the value of the disputeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeEmail(String value) {
        this.disputeEmail = value;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSite(String value) {
        this.webSite = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the dateOfEstablishment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    /**
     * Sets the value of the dateOfEstablishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfEstablishment(XMLGregorianCalendar value) {
        this.dateOfEstablishment = value;
    }

    /**
     * Gets the value of the businessType property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessType }
     *     
     */
    public BusinessType getBusinessType() {
        return businessType;
    }

    /**
     * Sets the value of the businessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessType }
     *     
     */
    public void setBusinessType(BusinessType value) {
        this.businessType = value;
    }

    /**
     * Gets the value of the businessSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSubtypeType }
     *     
     */
    public BusinessSubtypeType getBusinessSubtype() {
        return businessSubtype;
    }

    /**
     * Sets the value of the businessSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSubtypeType }
     *     
     */
    public void setBusinessSubtype(BusinessSubtypeType value) {
        this.businessSubtype = value;
    }

    /**
     * Gets the value of the incorporationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncorporationId() {
        return incorporationId;
    }

    /**
     * Sets the value of the incorporationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncorporationId(String value) {
        this.incorporationId = value;
    }

    /**
     * Gets the value of the averagePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAveragePrice() {
        return averagePrice;
    }

    /**
     * Sets the value of the averagePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAveragePrice(BigDecimal value) {
        this.averagePrice = value;
    }

    /**
     * Gets the value of the averageMonthlyVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageMonthlyVolume() {
        return averageMonthlyVolume;
    }

    /**
     * Sets the value of the averageMonthlyVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageMonthlyVolume(BigDecimal value) {
        this.averageMonthlyVolume = value;
    }

    /**
     * Gets the value of the percentageRevenueFromOnline property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPercentageRevenueFromOnline() {
        return percentageRevenueFromOnline;
    }

    /**
     * Sets the value of the percentageRevenueFromOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPercentageRevenueFromOnline(BigInteger value) {
        this.percentageRevenueFromOnline = value;
    }

    /**
     * Gets the value of the salesVenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesVenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesVenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesVenueType }
     * 
     * 
     */
    public List<SalesVenueType> getSalesVenue() {
        if (salesVenue == null) {
            salesVenue = new ArrayList<SalesVenueType>();
        }
        return this.salesVenue;
    }

    /**
     * Gets the value of the salesVenueDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesVenueDesc() {
        return salesVenueDesc;
    }

    /**
     * Sets the value of the salesVenueDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesVenueDesc(String value) {
        this.salesVenueDesc = value;
    }

    /**
     * Gets the value of the vatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatId() {
        return vatId;
    }

    /**
     * Sets the value of the vatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatId(String value) {
        this.vatId = value;
    }

    /**
     * Gets the value of the vatCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatCountryCode() {
        return vatCountryCode;
    }

    /**
     * Sets the value of the vatCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatCountryCode(String value) {
        this.vatCountryCode = value;
    }

    /**
     * Gets the value of the commercialRegistrationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialRegistrationLocation() {
        return commercialRegistrationLocation;
    }

    /**
     * Sets the value of the commercialRegistrationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialRegistrationLocation(String value) {
        this.commercialRegistrationLocation = value;
    }

    /**
     * Gets the value of the principalPlaceOfBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getPrincipalPlaceOfBusinessAddress() {
        return principalPlaceOfBusinessAddress;
    }

    /**
     * Sets the value of the principalPlaceOfBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setPrincipalPlaceOfBusinessAddress(AddressType value) {
        this.principalPlaceOfBusinessAddress = value;
    }

    /**
     * Gets the value of the registeredOfficeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getRegisteredOfficeAddress() {
        return registeredOfficeAddress;
    }

    /**
     * Sets the value of the registeredOfficeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setRegisteredOfficeAddress(AddressType value) {
        this.registeredOfficeAddress = value;
    }

    /**
     * Gets the value of the establishmentCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentCountryCode() {
        return establishmentCountryCode;
    }

    /**
     * Sets the value of the establishmentCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentCountryCode(String value) {
        this.establishmentCountryCode = value;
    }

    /**
     * Gets the value of the establishmentState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentState() {
        return establishmentState;
    }

    /**
     * Sets the value of the establishmentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentState(String value) {
        this.establishmentState = value;
    }

    /**
     * Gets the value of the businessStakeholder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessStakeholder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessStakeholder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessStakeholderType }
     * 
     * 
     */
    public List<BusinessStakeholderType> getBusinessStakeholder() {
        if (businessStakeholder == null) {
            businessStakeholder = new ArrayList<BusinessStakeholderType>();
        }
        return this.businessStakeholder;
    }

}
