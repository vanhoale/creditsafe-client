
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityReportboxAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivityReportboxAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="EntryAddition"/>
 *     &lt;enumeration value="EntryRemoval"/>
 *     &lt;enumeration value="EntriesListing"/>
 *     &lt;enumeration value="ReportRetrieval"/>
 *     &lt;enumeration value="OfflineOrderProcessingCompleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivityReportboxAction")
@XmlEnum
public enum ActivityReportboxAction {

    @XmlEnumValue("EntryAddition")
    ENTRY_ADDITION("EntryAddition"),
    @XmlEnumValue("EntryRemoval")
    ENTRY_REMOVAL("EntryRemoval"),
    @XmlEnumValue("EntriesListing")
    ENTRIES_LISTING("EntriesListing"),
    @XmlEnumValue("ReportRetrieval")
    REPORT_RETRIEVAL("ReportRetrieval"),
    @XmlEnumValue("OfflineOrderProcessingCompleted")
    OFFLINE_ORDER_PROCESSING_COMPLETED("OfflineOrderProcessingCompleted");
    private final String value;

    ActivityReportboxAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivityReportboxAction fromValue(String v) {
        for (ActivityReportboxAction c: ActivityReportboxAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
