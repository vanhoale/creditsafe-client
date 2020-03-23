
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="Xml"/>
 *     &lt;enumeration value="Csv"/>
 *     &lt;enumeration value="Json"/>
 *     &lt;enumeration value="Xls"/>
 *     &lt;enumeration value="Pdf"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileFormat", namespace = "http://www.creditsafe.com/globaldata/datatypes")
@XmlEnum
public enum FileFormat {

    @XmlEnumValue("Xml")
    XML("Xml"),
    @XmlEnumValue("Csv")
    CSV("Csv"),
    @XmlEnumValue("Json")
    JSON("Json"),
    @XmlEnumValue("Xls")
    XLS("Xls"),
    @XmlEnumValue("Pdf")
    PDF("Pdf");
    private final String value;

    FileFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileFormat fromValue(String v) {
        for (FileFormat c: FileFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
