
package com.paypal.svcs.types.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayOfWeek.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeek">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_DAY_SPECIFIED"/>
 *     &lt;enumeration value="SUNDAY"/>
 *     &lt;enumeration value="MONDAY"/>
 *     &lt;enumeration value="TUESDAY"/>
 *     &lt;enumeration value="WEDNESDAY"/>
 *     &lt;enumeration value="THURSDAY"/>
 *     &lt;enumeration value="FRIDAY"/>
 *     &lt;enumeration value="SATURDAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayOfWeek")
@XmlEnum
public enum DayOfWeek {

    NO_DAY_SPECIFIED,
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public String value() {
        return name();
    }

    public static DayOfWeek fromValue(String v) {
        return valueOf(v);
    }

}
