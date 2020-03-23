
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for System.ServiceModel.HttpProxyCredentialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="System.ServiceModel.HttpProxyCredentialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Digest"/>
 *     &lt;enumeration value="Ntlm"/>
 *     &lt;enumeration value="Windows"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "System.ServiceModel.HttpProxyCredentialType", namespace = "systemtypes")
@XmlEnum
public enum SystemServiceModelHttpProxyCredentialType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Digest")
    DIGEST("Digest"),
    @XmlEnumValue("Ntlm")
    NTLM("Ntlm"),
    @XmlEnumValue("Windows")
    WINDOWS("Windows");
    private final String value;

    SystemServiceModelHttpProxyCredentialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemServiceModelHttpProxyCredentialType fromValue(String v) {
        for (SystemServiceModelHttpProxyCredentialType c: SystemServiceModelHttpProxyCredentialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
