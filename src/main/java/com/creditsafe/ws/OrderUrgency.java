
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderUrgency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderUrgency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Express"/>
 *     &lt;enumeration value="Urgent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderUrgency")
@XmlEnum
public enum OrderUrgency {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Express")
    EXPRESS("Express"),
    @XmlEnumValue("Urgent")
    URGENT("Urgent");
    private final String value;

    OrderUrgency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderUrgency fromValue(String v) {
        for (OrderUrgency c: OrderUrgency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
