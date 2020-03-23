
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountriesListingFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountriesListingFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Code" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OnlineReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Monitoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountriesListingFilter", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "codes",
    "onlineReports",
    "monitoring"
})
public class CountriesListingFilter {

    @XmlElement(name = "Codes")
    protected CountriesListingFilter.Codes codes;
    @XmlElement(name = "OnlineReports")
    protected Boolean onlineReports;
    @XmlElement(name = "Monitoring")
    protected Boolean monitoring;

    /**
     * Gets the value of the codes property.
     * 
     * @return
     *     possible object is
     *     {@link CountriesListingFilter.Codes }
     *     
     */
    public CountriesListingFilter.Codes getCodes() {
        return codes;
    }

    /**
     * Sets the value of the codes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountriesListingFilter.Codes }
     *     
     */
    public void setCodes(CountriesListingFilter.Codes value) {
        this.codes = value;
    }

    /**
     * Gets the value of the onlineReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlineReports() {
        return onlineReports;
    }

    /**
     * Sets the value of the onlineReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlineReports(Boolean value) {
        this.onlineReports = value;
    }

    /**
     * Gets the value of the monitoring property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitoring() {
        return monitoring;
    }

    /**
     * Sets the value of the monitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitoring(Boolean value) {
        this.monitoring = value;
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
     *         &lt;element name="Code" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
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
        "code"
    })
    public static class Codes {

        @XmlElement(name = "Code", namespace = "http://www.creditsafe.com/globaldata/datatypes")
        @XmlSchemaType(name = "string")
        protected List<CountryCode> code;

        /**
         * Gets the value of the code property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the code property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryCode }
         * 
         * 
         */
        public List<CountryCode> getCode() {
            if (code == null) {
                code = new ArrayList<CountryCode>();
            }
            return this.code;
        }

    }

}
