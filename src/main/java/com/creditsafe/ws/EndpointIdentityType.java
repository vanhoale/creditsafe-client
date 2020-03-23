
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndpointIdentityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EndpointIdentityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Dns"/>
 *     &lt;enumeration value="Rsa"/>
 *     &lt;enumeration value="Spn"/>
 *     &lt;enumeration value="Upn"/>
 *     &lt;enumeration value="X509"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EndpointIdentityType")
@XmlEnum
public enum EndpointIdentityType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Dns")
    DNS("Dns"),
    @XmlEnumValue("Rsa")
    RSA("Rsa"),
    @XmlEnumValue("Spn")
    SPN("Spn"),
    @XmlEnumValue("Upn")
    UPN("Upn"),
    @XmlEnumValue("X509")
    X_509("X509");
    private final String value;

    EndpointIdentityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndpointIdentityType fromValue(String v) {
        for (EndpointIdentityType c: EndpointIdentityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
