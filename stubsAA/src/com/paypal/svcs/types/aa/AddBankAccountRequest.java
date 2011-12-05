
package com.paypal.svcs.types.aa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.paypal.svcs.types.common.RequestEnvelope;
import org.w3c.dom.Element;


/**
 * <p>Java class for AddBankAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddBankAccountRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestEnvelope" type="{http://svcs.paypal.com/types/common}RequestEnvelope"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createAccountKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAccountType" type="{http://svcs.paypal.com/types/aa}BankAccountType" minOccurs="0"/>
 *         &lt;element name="bankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clabe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bsbNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankTransitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="institutionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ribKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controlDigit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountHolderDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="confirmationType" type="{http://svcs.paypal.com/types/aa}ConfirmationType"/>
 *         &lt;element name="webOptions" type="{http://svcs.paypal.com/types/aa}WebOptionsType" minOccurs="0"/>
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
@XmlType(name = "AddBankAccountRequest", propOrder = {
    "requestEnvelope",
    "emailAddress",
    "accountId",
    "createAccountKey",
    "bankCountryCode",
    "bankName",
    "routingNumber",
    "bankAccountType",
    "bankAccountNumber",
    "iban",
    "clabe",
    "bsbNumber",
    "branchLocation",
    "sortCode",
    "bankTransitNumber",
    "institutionNumber",
    "branchCode",
    "agencyNumber",
    "bankCode",
    "ribKey",
    "controlDigit",
    "taxIdType",
    "taxIdNumber",
    "accountHolderDateOfBirth",
    "confirmationType",
    "webOptions",
    "any"
})
public class AddBankAccountRequest {

    @XmlElement(required = true)
    protected RequestEnvelope requestEnvelope;
    protected String emailAddress;
    protected String accountId;
    protected String createAccountKey;
    @XmlElement(required = true)
    protected String bankCountryCode;
    protected String bankName;
    protected String routingNumber;
    protected BankAccountType bankAccountType;
    protected String bankAccountNumber;
    protected String iban;
    protected String clabe;
    protected String bsbNumber;
    protected String branchLocation;
    protected String sortCode;
    protected String bankTransitNumber;
    protected String institutionNumber;
    protected String branchCode;
    protected String agencyNumber;
    protected String bankCode;
    protected String ribKey;
    protected String controlDigit;
    protected String taxIdType;
    protected String taxIdNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar accountHolderDateOfBirth;
    @XmlElement(required = true)
    protected ConfirmationType confirmationType;
    protected WebOptionsType webOptions;
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
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
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
     * Gets the value of the bankCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCountryCode() {
        return bankCountryCode;
    }

    /**
     * Sets the value of the bankCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCountryCode(String value) {
        this.bankCountryCode = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the routingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the value of the routingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNumber(String value) {
        this.routingNumber = value;
    }

    /**
     * Gets the value of the bankAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountType }
     *     
     */
    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Sets the value of the bankAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountType }
     *     
     */
    public void setBankAccountType(BankAccountType value) {
        this.bankAccountType = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIban(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the clabe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClabe() {
        return clabe;
    }

    /**
     * Sets the value of the clabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClabe(String value) {
        this.clabe = value;
    }

    /**
     * Gets the value of the bsbNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsbNumber() {
        return bsbNumber;
    }

    /**
     * Sets the value of the bsbNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsbNumber(String value) {
        this.bsbNumber = value;
    }

    /**
     * Gets the value of the branchLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchLocation() {
        return branchLocation;
    }

    /**
     * Sets the value of the branchLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchLocation(String value) {
        this.branchLocation = value;
    }

    /**
     * Gets the value of the sortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortCode() {
        return sortCode;
    }

    /**
     * Sets the value of the sortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortCode(String value) {
        this.sortCode = value;
    }

    /**
     * Gets the value of the bankTransitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransitNumber() {
        return bankTransitNumber;
    }

    /**
     * Sets the value of the bankTransitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransitNumber(String value) {
        this.bankTransitNumber = value;
    }

    /**
     * Gets the value of the institutionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionNumber() {
        return institutionNumber;
    }

    /**
     * Sets the value of the institutionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionNumber(String value) {
        this.institutionNumber = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the agencyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyNumber() {
        return agencyNumber;
    }

    /**
     * Sets the value of the agencyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyNumber(String value) {
        this.agencyNumber = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the ribKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRibKey() {
        return ribKey;
    }

    /**
     * Sets the value of the ribKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRibKey(String value) {
        this.ribKey = value;
    }

    /**
     * Gets the value of the controlDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlDigit() {
        return controlDigit;
    }

    /**
     * Sets the value of the controlDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlDigit(String value) {
        this.controlDigit = value;
    }

    /**
     * Gets the value of the taxIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdType() {
        return taxIdType;
    }

    /**
     * Sets the value of the taxIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdType(String value) {
        this.taxIdType = value;
    }

    /**
     * Gets the value of the taxIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    /**
     * Sets the value of the taxIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdNumber(String value) {
        this.taxIdNumber = value;
    }

    /**
     * Gets the value of the accountHolderDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccountHolderDateOfBirth() {
        return accountHolderDateOfBirth;
    }

    /**
     * Sets the value of the accountHolderDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccountHolderDateOfBirth(XMLGregorianCalendar value) {
        this.accountHolderDateOfBirth = value;
    }

    /**
     * Gets the value of the confirmationType property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationType }
     *     
     */
    public ConfirmationType getConfirmationType() {
        return confirmationType;
    }

    /**
     * Sets the value of the confirmationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationType }
     *     
     */
    public void setConfirmationType(ConfirmationType value) {
        this.confirmationType = value;
    }

    /**
     * Gets the value of the webOptions property.
     * 
     * @return
     *     possible object is
     *     {@link WebOptionsType }
     *     
     */
    public WebOptionsType getWebOptions() {
        return webOptions;
    }

    /**
     * Sets the value of the webOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebOptionsType }
     *     
     */
    public void setWebOptions(WebOptionsType value) {
        this.webOptions = value;
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
