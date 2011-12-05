
package com.paypal.svcs.types.aa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StakeholderRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StakeholderRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHAIRMAN"/>
 *     &lt;enumeration value="SECRETARY"/>
 *     &lt;enumeration value="TREASURER"/>
 *     &lt;enumeration value="BENEFICIAL_OWNER"/>
 *     &lt;enumeration value="PRIMARY_CONTACT"/>
 *     &lt;enumeration value="INDIVIDUAL_PARTNER"/>
 *     &lt;enumeration value="NON_INDIVIDUAL_PARTNER"/>
 *     &lt;enumeration value="PRIMARY_INDIVIDUAL_PARTNER"/>
 *     &lt;enumeration value="DIRECTOR"/>
 *     &lt;enumeration value="NO_BENEFICIAL_OWNER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StakeholderRoleType")
@XmlEnum
public enum StakeholderRoleType {

    CHAIRMAN,
    SECRETARY,
    TREASURER,
    BENEFICIAL_OWNER,
    PRIMARY_CONTACT,
    INDIVIDUAL_PARTNER,
    NON_INDIVIDUAL_PARTNER,
    PRIMARY_INDIVIDUAL_PARTNER,
    DIRECTOR,
    NO_BENEFICIAL_OWNER;

    public String value() {
        return name();
    }

    public static StakeholderRoleType fromValue(String v) {
        return valueOf(v);
    }

}
