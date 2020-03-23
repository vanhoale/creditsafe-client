
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContractType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="PrePaid"/>
 *     &lt;enumeration value="PayAsYouGo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContractType")
@XmlEnum
public enum ContractType {

    @XmlEnumValue("PrePaid")
    PRE_PAID("PrePaid"),
    @XmlEnumValue("PayAsYouGo")
    PAY_AS_YOU_GO("PayAsYouGo");
    private final String value;

    ContractType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContractType fromValue(String v) {
        for (ContractType c: ContractType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
