
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for System.ServiceModel.SecurityMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="System.ServiceModel.SecurityMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Transport"/>
 *     &lt;enumeration value="Message"/>
 *     &lt;enumeration value="TransportWithMessageCredential"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "System.ServiceModel.SecurityMode", namespace = "systemtypes")
@XmlEnum
public enum SystemServiceModelSecurityMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Transport")
    TRANSPORT("Transport"),
    @XmlEnumValue("Message")
    MESSAGE("Message"),
    @XmlEnumValue("TransportWithMessageCredential")
    TRANSPORT_WITH_MESSAGE_CREDENTIAL("TransportWithMessageCredential");
    private final String value;

    SystemServiceModelSecurityMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemServiceModelSecurityMode fromValue(String v) {
        for (SystemServiceModelSecurityMode c: SystemServiceModelSecurityMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
