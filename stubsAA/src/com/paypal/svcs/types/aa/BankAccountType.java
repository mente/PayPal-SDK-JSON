
package com.paypal.svcs.types.aa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankAccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHECKING"/>
 *     &lt;enumeration value="SAVINGS"/>
 *     &lt;enumeration value="BUSINESS_CHECKING"/>
 *     &lt;enumeration value="BUSINESS_SAVINGS"/>
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BankAccountType")
@XmlEnum
public enum BankAccountType {

    CHECKING,
    SAVINGS,
    BUSINESS_CHECKING,
    BUSINESS_SAVINGS,
    NORMAL,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BankAccountType fromValue(String v) {
        return valueOf(v);
    }

}
