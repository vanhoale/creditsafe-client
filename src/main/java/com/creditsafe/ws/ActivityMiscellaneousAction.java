
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityMiscellaneousAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivityMiscellaneousAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="CountriesListing"/>
 *     &lt;enumeration value="SearchCriteriaDiscovery"/>
 *     &lt;enumeration value="ReportCustomDataDiscovery"/>
 *     &lt;enumeration value="CustomScoreCustomDataDiscovery"/>
 *     &lt;enumeration value="PortfolioSettingsRetrieval"/>
 *     &lt;enumeration value="MonitoringRulesRetrieval"/>
 *     &lt;enumeration value="PortfolioCompaniesReferenceStringsUpdate"/>
 *     &lt;enumeration value="SupportedChangeEventsListing"/>
 *     &lt;enumeration value="MonitoringDefaultChangesCheckPeriodChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivityMiscellaneousAction")
@XmlEnum
public enum ActivityMiscellaneousAction {

    @XmlEnumValue("CountriesListing")
    COUNTRIES_LISTING("CountriesListing"),
    @XmlEnumValue("SearchCriteriaDiscovery")
    SEARCH_CRITERIA_DISCOVERY("SearchCriteriaDiscovery"),
    @XmlEnumValue("ReportCustomDataDiscovery")
    REPORT_CUSTOM_DATA_DISCOVERY("ReportCustomDataDiscovery"),
    @XmlEnumValue("CustomScoreCustomDataDiscovery")
    CUSTOM_SCORE_CUSTOM_DATA_DISCOVERY("CustomScoreCustomDataDiscovery"),
    @XmlEnumValue("PortfolioSettingsRetrieval")
    PORTFOLIO_SETTINGS_RETRIEVAL("PortfolioSettingsRetrieval"),
    @XmlEnumValue("MonitoringRulesRetrieval")
    MONITORING_RULES_RETRIEVAL("MonitoringRulesRetrieval"),
    @XmlEnumValue("PortfolioCompaniesReferenceStringsUpdate")
    PORTFOLIO_COMPANIES_REFERENCE_STRINGS_UPDATE("PortfolioCompaniesReferenceStringsUpdate"),
    @XmlEnumValue("SupportedChangeEventsListing")
    SUPPORTED_CHANGE_EVENTS_LISTING("SupportedChangeEventsListing"),
    @XmlEnumValue("MonitoringDefaultChangesCheckPeriodChange")
    MONITORING_DEFAULT_CHANGES_CHECK_PERIOD_CHANGE("MonitoringDefaultChangesCheckPeriodChange");
    private final String value;

    ActivityMiscellaneousAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivityMiscellaneousAction fromValue(String v) {
        for (ActivityMiscellaneousAction c: ActivityMiscellaneousAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
