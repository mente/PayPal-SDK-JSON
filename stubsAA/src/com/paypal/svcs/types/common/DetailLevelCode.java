
package com.paypal.svcs.types.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailLevelCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DetailLevelCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ReturnAll"/>
 *     &lt;enumeration value="ReturnAttributes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DetailLevelCode")
@XmlEnum
public enum DetailLevelCode {


    /**
     * 
     * 								Return in response message all detail
     * 								levels.
     * 							
     * 
     */
    @XmlEnumValue("ReturnAll")
    RETURN_ALL("ReturnAll"),

    /**
     * 
     * 								Return in response message all detail
     * 								levels.
     * 							
     * 
     */
    @XmlEnumValue("ReturnAttributes")
    RETURN_ATTRIBUTES("ReturnAttributes");
    private final String value;

    DetailLevelCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DetailLevelCode fromValue(String v) {
        for (DetailLevelCode c: DetailLevelCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
