
package com.paypal.svcs.types.aa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfirmationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConfirmationType")
@XmlEnum
public enum ConfirmationType {

    WEB,
    MOBILE,
    NONE;

    public String value() {
        return name();
    }

    public static ConfirmationType fromValue(String v) {
        return valueOf(v);
    }

}
