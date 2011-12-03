
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
 * <p>Java class for ReceiverIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiverIdentifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://svcs.paypal.com/types/common}AccountIdentifier">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiverIdentifier")
public class ReceiverIdentifier
    extends AccountIdentifier
{


}
