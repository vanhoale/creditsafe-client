
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for System.ServiceModel.BasicHttpMessageCredentialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="System.ServiceModel.BasicHttpMessageCredentialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="UserName"/>
 *     &lt;enumeration value="Certificate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "System.ServiceModel.BasicHttpMessageCredentialType", namespace = "systemtypes")
@XmlEnum
public enum SystemServiceModelBasicHttpMessageCredentialType {

    @XmlEnumValue("UserName")
    USER_NAME("UserName"),
    @XmlEnumValue("Certificate")
    CERTIFICATE("Certificate");
    private final String value;

    SystemServiceModelBasicHttpMessageCredentialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemServiceModelBasicHttpMessageCredentialType fromValue(String v) {
        for (SystemServiceModelBasicHttpMessageCredentialType c: SystemServiceModelBasicHttpMessageCredentialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
