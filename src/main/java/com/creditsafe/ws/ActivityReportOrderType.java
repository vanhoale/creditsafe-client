
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityReportOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivityReportOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="StandardReport"/>
 *     &lt;enumeration value="DirectReport"/>
 *     &lt;enumeration value="OfflineReportOrder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivityReportOrderType")
@XmlEnum
public enum ActivityReportOrderType {

    @XmlEnumValue("StandardReport")
    STANDARD_REPORT("StandardReport"),
    @XmlEnumValue("DirectReport")
    DIRECT_REPORT("DirectReport"),
    @XmlEnumValue("OfflineReportOrder")
    OFFLINE_REPORT_ORDER("OfflineReportOrder");
    private final String value;

    ActivityReportOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivityReportOrderType fromValue(String v) {
        for (ActivityReportOrderType c: ActivityReportOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
