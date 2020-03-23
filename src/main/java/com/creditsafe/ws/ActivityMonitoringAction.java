
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityMonitoringAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivityMonitoringAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="PortfolioCreation"/>
 *     &lt;enumeration value="PortfolioRemoval"/>
 *     &lt;enumeration value="PortfolioSettingsChange"/>
 *     &lt;enumeration value="MonitoringRulesChange"/>
 *     &lt;enumeration value="PortfolioListing"/>
 *     &lt;enumeration value="PortfolioCompaniesListing"/>
 *     &lt;enumeration value="CompaniesAddition"/>
 *     &lt;enumeration value="CompaniesRemoval"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivityMonitoringAction")
@XmlEnum
public enum ActivityMonitoringAction {

    @XmlEnumValue("PortfolioCreation")
    PORTFOLIO_CREATION("PortfolioCreation"),
    @XmlEnumValue("PortfolioRemoval")
    PORTFOLIO_REMOVAL("PortfolioRemoval"),
    @XmlEnumValue("PortfolioSettingsChange")
    PORTFOLIO_SETTINGS_CHANGE("PortfolioSettingsChange"),
    @XmlEnumValue("MonitoringRulesChange")
    MONITORING_RULES_CHANGE("MonitoringRulesChange"),
    @XmlEnumValue("PortfolioListing")
    PORTFOLIO_LISTING("PortfolioListing"),
    @XmlEnumValue("PortfolioCompaniesListing")
    PORTFOLIO_COMPANIES_LISTING("PortfolioCompaniesListing"),
    @XmlEnumValue("CompaniesAddition")
    COMPANIES_ADDITION("CompaniesAddition"),
    @XmlEnumValue("CompaniesRemoval")
    COMPANIES_REMOVAL("CompaniesRemoval");
    private final String value;

    ActivityMonitoringAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivityMonitoringAction fromValue(String v) {
        for (ActivityMonitoringAction c: ActivityMonitoringAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
