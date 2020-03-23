
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonRatingValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommonRatingValue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommonRatingValue", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
@XmlEnum
public enum CommonRatingValue {

    A,
    B,
    C,
    D,
    E;

    public String value() {
        return name();
    }

    public static CommonRatingValue fromValue(String v) {
        return valueOf(v);
    }

}
