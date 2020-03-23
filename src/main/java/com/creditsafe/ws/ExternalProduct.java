
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalProduct.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExternalProduct">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="WhiteLabel"/>
 *     &lt;enumeration value="Mobile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExternalProduct")
@XmlEnum
public enum ExternalProduct {

    @XmlEnumValue("WhiteLabel")
    WHITE_LABEL("WhiteLabel"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile");
    private final String value;

    ExternalProduct(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalProduct fromValue(String v) {
        for (ExternalProduct c: ExternalProduct.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
