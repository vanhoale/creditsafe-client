
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for System.ServiceModel.TcpClientCredentialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="System.ServiceModel.TcpClientCredentialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Windows"/>
 *     &lt;enumeration value="Certificate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "System.ServiceModel.TcpClientCredentialType", namespace = "systemtypes")
@XmlEnum
public enum SystemServiceModelTcpClientCredentialType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Windows")
    WINDOWS("Windows"),
    @XmlEnumValue("Certificate")
    CERTIFICATE("Certificate");
    private final String value;

    SystemServiceModelTcpClientCredentialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemServiceModelTcpClientCredentialType fromValue(String v) {
        for (SystemServiceModelTcpClientCredentialType c: SystemServiceModelTcpClientCredentialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
