
package com.paypal.svcs.types.aa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessSubtypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessSubtypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENTITY"/>
 *     &lt;enumeration value="EMANATION"/>
 *     &lt;enumeration value="ESTD_COMMONWEALTH"/>
 *     &lt;enumeration value="ESTD_UNDER_STATE_TERRITORY"/>
 *     &lt;enumeration value="ESTD_UNDER_FOREIGN_COUNTRY"/>
 *     &lt;enumeration value="INCORPORATED"/>
 *     &lt;enumeration value="NON_INCORPORATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessSubtypeType")
@XmlEnum
public enum BusinessSubtypeType {

    ENTITY,
    EMANATION,
    ESTD_COMMONWEALTH,
    ESTD_UNDER_STATE_TERRITORY,
    ESTD_UNDER_FOREIGN_COUNTRY,
    INCORPORATED,
    NON_INCORPORATED;

    public String value() {
        return name();
    }

    public static BusinessSubtypeType fromValue(String v) {
        return valueOf(v);
    }

}
