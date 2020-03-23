
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfficeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="Registered"/>
 *     &lt;enumeration value="Trading"/>
 *     &lt;enumeration value="HeadOffice"/>
 *     &lt;enumeration value="Branch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfficeType", namespace = "http://www.creditsafe.com/globaldata/datatypes")
@XmlEnum
public enum OfficeType {

    @XmlEnumValue("Registered")
    REGISTERED("Registered"),
    @XmlEnumValue("Trading")
    TRADING("Trading"),
    @XmlEnumValue("HeadOffice")
    HEAD_OFFICE("HeadOffice"),
    @XmlEnumValue("Branch")
    BRANCH("Branch");
    private final String value;

    OfficeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfficeType fromValue(String v) {
        for (OfficeType c: OfficeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
