
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanyReportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanyReportType", namespace = "http://www.creditsafe.com/globaldata/datatypes")
@XmlEnum
public enum CompanyReportType {

    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Full")
    FULL("Full");
    private final String value;

    CompanyReportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanyReportType fromValue(String v) {
        for (CompanyReportType c: CompanyReportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
