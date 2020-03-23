
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMatchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryMatchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="MatchBeginning"/>
 *     &lt;enumeration value="MatchBlock"/>
 *     &lt;enumeration value="MatchAnyParts"/>
 *     &lt;enumeration value="MatchWords"/>
 *     &lt;enumeration value="MatchBlockOrWords"/>
 *     &lt;enumeration value="ExactValue"/>
 *     &lt;enumeration value="ClosestKeywords"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryMatchType", namespace = "http://www.creditsafe.com/globaldata/datatypes")
@XmlEnum
public enum QueryMatchType {

    @XmlEnumValue("MatchBeginning")
    MATCH_BEGINNING("MatchBeginning"),
    @XmlEnumValue("MatchBlock")
    MATCH_BLOCK("MatchBlock"),
    @XmlEnumValue("MatchAnyParts")
    MATCH_ANY_PARTS("MatchAnyParts"),
    @XmlEnumValue("MatchWords")
    MATCH_WORDS("MatchWords"),
    @XmlEnumValue("MatchBlockOrWords")
    MATCH_BLOCK_OR_WORDS("MatchBlockOrWords"),
    @XmlEnumValue("ExactValue")
    EXACT_VALUE("ExactValue"),
    @XmlEnumValue("ClosestKeywords")
    CLOSEST_KEYWORDS("ClosestKeywords");
    private final String value;

    QueryMatchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryMatchType fromValue(String v) {
        for (QueryMatchType c: QueryMatchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
