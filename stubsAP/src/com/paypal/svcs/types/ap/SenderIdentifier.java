
package com.paypal.svcs.types.ap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.paypal.svcs.types.common.AccountIdentifier;


/**
 * 
 * 						The sender identifier type contains information
 * 						to identify a PayPal account.
 * 					
 * 
 * <p>Java class for SenderIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderIdentifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://svcs.paypal.com/types/common}AccountIdentifier">
 *       &lt;sequence>
 *         &lt;element name="useCredentials" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderIdentifier", propOrder = {
    "useCredentials"
})
public class SenderIdentifier
    extends AccountIdentifier
{

    protected Boolean useCredentials;

    /**
     * Gets the value of the useCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCredentials() {
        return useCredentials;
    }

    /**
     * Sets the value of the useCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCredentials(Boolean value) {
        this.useCredentials = value;
    }

}
