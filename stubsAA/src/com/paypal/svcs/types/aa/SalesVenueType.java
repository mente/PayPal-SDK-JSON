
package com.paypal.svcs.types.aa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesVenueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalesVenueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="EBAY"/>
 *     &lt;enumeration value="OTHER_MARKETPLACE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SalesVenueType")
@XmlEnum
public enum SalesVenueType {

    WEB,
    EBAY,
    OTHER_MARKETPLACE,
    OTHER;

    public String value() {
        return name();
    }

    public static SalesVenueType fromValue(String v) {
        return valueOf(v);
    }

}
