
package com.paypal.svcs.types.ap;

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
 * 
 * 						The PayResponse contains the result of the Pay
 * 						operation. The payKey and execution status of
 * 						the request should always be provided.
 * 					
 * 
 * <p>Java class for PayResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseEnvelope" type="{http://svcs.paypal.com/types/common}ResponseEnvelope"/>
 *         &lt;element name="payKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentExecStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payErrorList" type="{http://svcs.paypal.com/types/ap}PayErrorList" minOccurs="0"/>
 *         &lt;element name="defaultFundingPlan" type="{http://svcs.paypal.com/types/ap}FundingPlan" minOccurs="0"/>
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
@XmlType(name = "PayResponse", propOrder = {
    "responseEnvelope",
    "payKey",
    "paymentExecStatus",
    "payErrorList",
    "defaultFundingPlan",
    "any"
})
public class PayResponse {

    @XmlElement(required = true)
    protected ResponseEnvelope responseEnvelope;
    @XmlElement(required = true)
    protected String payKey;
    @XmlElement(required = true)
    protected String paymentExecStatus;
    protected PayErrorList payErrorList;
    protected FundingPlan defaultFundingPlan;
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
     * Gets the value of the payKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayKey() {
        return payKey;
    }

    /**
     * Sets the value of the payKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayKey(String value) {
        this.payKey = value;
    }

    /**
     * Gets the value of the paymentExecStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentExecStatus() {
        return paymentExecStatus;
    }

    /**
     * Sets the value of the paymentExecStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentExecStatus(String value) {
        this.paymentExecStatus = value;
    }

    /**
     * Gets the value of the payErrorList property.
     * 
     * @return
     *     possible object is
     *     {@link PayErrorList }
     *     
     */
    public PayErrorList getPayErrorList() {
        return payErrorList;
    }

    /**
     * Sets the value of the payErrorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayErrorList }
     *     
     */
    public void setPayErrorList(PayErrorList value) {
        this.payErrorList = value;
    }

    /**
     * Gets the value of the defaultFundingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link FundingPlan }
     *     
     */
    public FundingPlan getDefaultFundingPlan() {
        return defaultFundingPlan;
    }

    /**
     * Sets the value of the defaultFundingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingPlan }
     *     
     */
    public void setDefaultFundingPlan(FundingPlan value) {
        this.defaultFundingPlan = value;
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

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("PayResponse");
		sb.append("{any=").append(any);
		sb.append(", defaultFundingPlan=").append(defaultFundingPlan);
		sb.append(", payErrorList=").append(payErrorList);
		sb.append(", payKey='").append(payKey).append('\'');
		sb.append(", paymentExecStatus='").append(paymentExecStatus).append('\'');
		sb.append(", responseEnvelope=").append(responseEnvelope);
		sb.append('}');
		return sb.toString();
	}
}
