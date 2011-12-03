
package com.paypal.svcs.types.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AckCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AckCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Failure"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="SuccessWithWarning"/>
 *     &lt;enumeration value="FailureWithWarning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AckCode")
@XmlEnum
public enum AckCode {


    /**
     * 
     * 								Request processing succeeded.
     * 							
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success"),

    /**
     * 
     * 								Request processing failed.
     * 							
     * 
     */
    @XmlEnumValue("Failure")
    FAILURE("Failure"),

    /**
     * 
     * 								Request processing completed with
     * 								warning information being included in
     * 								the response message.
     * 							
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * 
     * 								Request processing completed successful
     * 								with some with some warning information
     * 								that could be useful for the requesting
     * 								application to process and/or record.
     * 							
     * 
     */
    @XmlEnumValue("SuccessWithWarning")
    SUCCESS_WITH_WARNING("SuccessWithWarning"),

    /**
     * 
     * 								Request processing failed with some
     * 								error and warning information that
     * 								requesting application should process to
     * 								determine cause(s) of failure.
     * 							
     * 
     */
    @XmlEnumValue("FailureWithWarning")
    FAILURE_WITH_WARNING("FailureWithWarning");
    private final String value;

    AckCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AckCode fromValue(String v) {
        for (AckCode c: AckCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
