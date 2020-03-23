
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountrySettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountrySettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportPricing" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ReportPricing" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CountryCode" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" />
 *       &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountrySettings", propOrder = {
    "reportPricing"
})
public class CountrySettings {

    @XmlElement(name = "ReportPricing")
    protected ReportPricing reportPricing;
    @XmlAttribute(name = "CountryCode", required = true)
    protected CountryCode countryCode;
    @XmlAttribute(name = "Enabled", required = true)
    protected boolean enabled;

    /**
     * Gets the value of the reportPricing property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPricing }
     *     
     */
    public ReportPricing getReportPricing() {
        return reportPricing;
    }

    /**
     * Sets the value of the reportPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPricing }
     *     
     */
    public void setReportPricing(ReportPricing value) {
        this.reportPricing = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountryCode(CountryCode value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

}
