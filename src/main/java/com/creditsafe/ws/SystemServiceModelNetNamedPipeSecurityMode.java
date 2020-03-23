
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for System.ServiceModel.NetNamedPipeSecurityMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="System.ServiceModel.NetNamedPipeSecurityMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Transport"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "System.ServiceModel.NetNamedPipeSecurityMode", namespace = "systemtypes")
@XmlEnum
public enum SystemServiceModelNetNamedPipeSecurityMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Transport")
    TRANSPORT("Transport");
    private final String value;

    SystemServiceModelNetNamedPipeSecurityMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemServiceModelNetNamedPipeSecurityMode fromValue(String v) {
        for (SystemServiceModelNetNamedPipeSecurityMode c: SystemServiceModelNetNamedPipeSecurityMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
