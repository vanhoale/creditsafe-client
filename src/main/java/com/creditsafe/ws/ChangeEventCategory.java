
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeEventCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeEventCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="SimpleEvent"/>
 *     &lt;enumeration value="TextValueChangeEvent"/>
 *     &lt;enumeration value="NumericValueChangeEvent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeEventCategory", namespace = "http://www.creditsafe.com/globaldata/datatypes")
@XmlEnum
public enum ChangeEventCategory {

    @XmlEnumValue("SimpleEvent")
    SIMPLE_EVENT("SimpleEvent"),
    @XmlEnumValue("TextValueChangeEvent")
    TEXT_VALUE_CHANGE_EVENT("TextValueChangeEvent"),
    @XmlEnumValue("NumericValueChangeEvent")
    NUMERIC_VALUE_CHANGE_EVENT("NumericValueChangeEvent");
    private final String value;

    ChangeEventCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeEventCategory fromValue(String v) {
        for (ChangeEventCategory c: ChangeEventCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
