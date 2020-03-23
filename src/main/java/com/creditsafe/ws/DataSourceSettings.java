
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSourceSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSourceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Countries">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Country" type="{http://www.creditsafe.com/globaldata/datatypes/administration}CountrySettings" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReportPricing" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ReportPricing" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSourceSettings", propOrder = {
    "countries",
    "reportPricing"
})
public class DataSourceSettings {

    @XmlElement(name = "Countries", required = true)
    protected DataSourceSettings.Countries countries;
    @XmlElement(name = "ReportPricing")
    protected ReportPricing reportPricing;
    @XmlAttribute(name = "Enabled", required = true)
    protected boolean enabled;

    /**
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceSettings.Countries }
     *     
     */
    public DataSourceSettings.Countries getCountries() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceSettings.Countries }
     *     
     */
    public void setCountries(DataSourceSettings.Countries value) {
        this.countries = value;
    }

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Country" type="{http://www.creditsafe.com/globaldata/datatypes/administration}CountrySettings" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "country"
    })
    public static class Countries {

        @XmlElement(name = "Country")
        protected List<CountrySettings> country;

        /**
         * Gets the value of the country property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the country property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountrySettings }
         * 
         * 
         */
        public List<CountrySettings> getCountry() {
            if (country == null) {
                country = new ArrayList<CountrySettings>();
            }
            return this.country;
        }

    }

}
