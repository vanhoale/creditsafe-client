
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for System.ServiceModel.MessageCredentialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="System.ServiceModel.MessageCredentialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Windows"/>
 *     &lt;enumeration value="UserName"/>
 *     &lt;enumeration value="Certificate"/>
 *     &lt;enumeration value="IssuedToken"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "System.ServiceModel.MessageCredentialType", namespace = "systemtypes")
@XmlEnum
public enum SystemServiceModelMessageCredentialType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Windows")
    WINDOWS("Windows"),
    @XmlEnumValue("UserName")
    USER_NAME("UserName"),
    @XmlEnumValue("Certificate")
    CERTIFICATE("Certificate"),
    @XmlEnumValue("IssuedToken")
    ISSUED_TOKEN("IssuedToken");
    private final String value;

    SystemServiceModelMessageCredentialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemServiceModelMessageCredentialType fromValue(String v) {
        for (SystemServiceModelMessageCredentialType c: SystemServiceModelMessageCredentialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
