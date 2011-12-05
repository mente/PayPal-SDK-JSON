
package com.paypal.svcs.types.aa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSOCIATION"/>
 *     &lt;enumeration value="CORPORATION"/>
 *     &lt;enumeration value="GENERAL_PARTNERSHIP"/>
 *     &lt;enumeration value="GOVERNMENT"/>
 *     &lt;enumeration value="INDIVIDUAL"/>
 *     &lt;enumeration value="LIMITED_LIABILITY_PARTNERSHIP"/>
 *     &lt;enumeration value="LIMITED_LIABILITY_PRIVATE_CORPORATION"/>
 *     &lt;enumeration value="LIMITED_LIABILITY_PROPRIETORS"/>
 *     &lt;enumeration value="LIMITED_PARTNERSHIP"/>
 *     &lt;enumeration value="LIMITED_PARTNERSHIP_PRIVATE_CORPORATION"/>
 *     &lt;enumeration value="NONPROFIT"/>
 *     &lt;enumeration value="OTHER_CORPORATE_BODY"/>
 *     &lt;enumeration value="PARTNERSHIP"/>
 *     &lt;enumeration value="PRIVATE_CORPORATION"/>
 *     &lt;enumeration value="PRIVATE_PARTNERSHIP"/>
 *     &lt;enumeration value="PROPRIETORSHIP"/>
 *     &lt;enumeration value="PROPRIETORSHIP_CRAFTSMAN"/>
 *     &lt;enumeration value="PROPRIETARY_COMPANY"/>
 *     &lt;enumeration value="PUBLIC_COMPANY"/>
 *     &lt;enumeration value="PUBLIC_CORPORATION"/>
 *     &lt;enumeration value="PUBLIC_PARTNERSHIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessType")
@XmlEnum
public enum BusinessType {

    ASSOCIATION,
    CORPORATION,
    GENERAL_PARTNERSHIP,
    GOVERNMENT,
    INDIVIDUAL,
    LIMITED_LIABILITY_PARTNERSHIP,
    LIMITED_LIABILITY_PRIVATE_CORPORATION,
    LIMITED_LIABILITY_PROPRIETORS,
    LIMITED_PARTNERSHIP,
    LIMITED_PARTNERSHIP_PRIVATE_CORPORATION,
    NONPROFIT,
    OTHER_CORPORATE_BODY,
    PARTNERSHIP,
    PRIVATE_CORPORATION,
    PRIVATE_PARTNERSHIP,
    PROPRIETORSHIP,
    PROPRIETORSHIP_CRAFTSMAN,
    PROPRIETARY_COMPANY,
    PUBLIC_COMPANY,
    PUBLIC_CORPORATION,
    PUBLIC_PARTNERSHIP;

    public String value() {
        return name();
    }

    public static BusinessType fromValue(String v) {
        return valueOf(v);
    }

}
