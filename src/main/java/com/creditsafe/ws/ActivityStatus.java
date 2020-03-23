
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivityStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="Successful"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="InvalidRequest"/>
 *     &lt;enumeration value="TooManyOrNoResults"/>
 *     &lt;enumeration value="ReportStructureError"/>
 *     &lt;enumeration value="OtherError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivityStatus")
@XmlEnum
public enum ActivityStatus {

    @XmlEnumValue("Successful")
    SUCCESSFUL("Successful"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("InvalidRequest")
    INVALID_REQUEST("InvalidRequest"),
    @XmlEnumValue("TooManyOrNoResults")
    TOO_MANY_OR_NO_RESULTS("TooManyOrNoResults"),
    @XmlEnumValue("ReportStructureError")
    REPORT_STRUCTURE_ERROR("ReportStructureError"),
    @XmlEnumValue("OtherError")
    OTHER_ERROR("OtherError");
    private final String value;

    ActivityStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivityStatus fromValue(String v) {
        for (ActivityStatus c: ActivityStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
