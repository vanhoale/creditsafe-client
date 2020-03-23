
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeEntity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditsafeEntity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="CSUK"/>
 *     &lt;enumeration value="CSDE"/>
 *     &lt;enumeration value="CSFR"/>
 *     &lt;enumeration value="CSNL"/>
 *     &lt;enumeration value="CSBE"/>
 *     &lt;enumeration value="CSIE"/>
 *     &lt;enumeration value="CSSE"/>
 *     &lt;enumeration value="CSUS"/>
 *     &lt;enumeration value="CSIT"/>
 *     &lt;enumeration value="CSNO"/>
 *     &lt;enumeration value="CSJP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditsafeEntity")
@XmlEnum
public enum CreditsafeEntity {

    INT,
    CSUK,
    CSDE,
    CSFR,
    CSNL,
    CSBE,
    CSIE,
    CSSE,
    CSUS,
    CSIT,
    CSNO,
    CSJP;

    public String value() {
        return name();
    }

    public static CreditsafeEntity fromValue(String v) {
        return valueOf(v);
    }

}
