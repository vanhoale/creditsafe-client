
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for System.ServiceModel.Security.X509CertificateValidationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="System.ServiceModel.Security.X509CertificateValidationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="PeerTrust"/>
 *     &lt;enumeration value="ChainTrust"/>
 *     &lt;enumeration value="PeerOrChainTrust"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "System.ServiceModel.Security.X509CertificateValidationMode", namespace = "systemtypes")
@XmlEnum
public enum SystemServiceModelSecurityX509CertificateValidationMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("PeerTrust")
    PEER_TRUST("PeerTrust"),
    @XmlEnumValue("ChainTrust")
    CHAIN_TRUST("ChainTrust"),
    @XmlEnumValue("PeerOrChainTrust")
    PEER_OR_CHAIN_TRUST("PeerOrChainTrust"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    SystemServiceModelSecurityX509CertificateValidationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemServiceModelSecurityX509CertificateValidationMode fromValue(String v) {
        for (SystemServiceModelSecurityX509CertificateValidationMode c: SystemServiceModelSecurityX509CertificateValidationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
