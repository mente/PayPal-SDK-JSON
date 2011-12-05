
package com.paypal.svcs.types.ap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundingTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundingTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fundingTypeInfo" type="{http://svcs.paypal.com/types/ap}FundingTypeInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundingTypeList", propOrder = {
    "fundingTypeInfo"
})
public class FundingTypeList {

    @XmlElement(required = true)
    protected List<FundingTypeInfo> fundingTypeInfo;

    /**
     * Gets the value of the fundingTypeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundingTypeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingTypeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingTypeInfo }
     * 
     * 
     */
    public List<FundingTypeInfo> getFundingTypeInfo() {
        if (fundingTypeInfo == null) {
            fundingTypeInfo = new ArrayList<FundingTypeInfo>();
        }
        return this.fundingTypeInfo;
    }


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("FundingTypeList");
		sb.append("{fundingTypeInfo=").append(fundingTypeInfo);
		sb.append('}');
		return sb.toString();
	}
}
