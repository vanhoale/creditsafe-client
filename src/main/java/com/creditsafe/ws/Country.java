
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Country complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Country">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailableReportTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AvailableReportType" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AvailableLanguages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AvailableLanguage" type="{http://www.creditsafe.com/globaldata/datatypes}Language" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Code" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" />
 *       &lt;attribute name="OnlineReports" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Monitoring" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Country", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "availableReportTypes",
    "availableLanguages"
})
public class Country {

    @XmlElement(name = "AvailableReportTypes")
    protected Country.AvailableReportTypes availableReportTypes;
    @XmlElement(name = "AvailableLanguages")
    protected Country.AvailableLanguages availableLanguages;
    @XmlAttribute(name = "Code", required = true)
    protected CountryCode code;
    @XmlAttribute(name = "OnlineReports", required = true)
    protected boolean onlineReports;
    @XmlAttribute(name = "Monitoring", required = true)
    protected boolean monitoring;

    /**
     * Gets the value of the availableReportTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Country.AvailableReportTypes }
     *     
     */
    public Country.AvailableReportTypes getAvailableReportTypes() {
        return availableReportTypes;
    }

    /**
     * Sets the value of the availableReportTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country.AvailableReportTypes }
     *     
     */
    public void setAvailableReportTypes(Country.AvailableReportTypes value) {
        this.availableReportTypes = value;
    }

    /**
     * Gets the value of the availableLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link Country.AvailableLanguages }
     *     
     */
    public Country.AvailableLanguages getAvailableLanguages() {
        return availableLanguages;
    }

    /**
     * Sets the value of the availableLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country.AvailableLanguages }
     *     
     */
    public void setAvailableLanguages(Country.AvailableLanguages value) {
        this.availableLanguages = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCode(CountryCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the onlineReports property.
     * 
     */
    public boolean isOnlineReports() {
        return onlineReports;
    }

    /**
     * Sets the value of the onlineReports property.
     * 
     */
    public void setOnlineReports(boolean value) {
        this.onlineReports = value;
    }

    /**
     * Gets the value of the monitoring property.
     * 
     */
    public boolean isMonitoring() {
        return monitoring;
    }

    /**
     * Sets the value of the monitoring property.
     * 
     */
    public void setMonitoring(boolean value) {
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
     *         &lt;element name="AvailableLanguage" type="{http://www.creditsafe.com/globaldata/datatypes}Language" maxOccurs="unbounded" minOccurs="0"/>
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
        "availableLanguage"
    })
    public static class AvailableLanguages {

        @XmlElement(name = "AvailableLanguage", namespace = "http://www.creditsafe.com/globaldata/datatypes")
        @XmlSchemaType(name = "string")
        protected List<Language> availableLanguage;

        /**
         * Gets the value of the availableLanguage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availableLanguage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailableLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Language }
         * 
         * 
         */
        public List<Language> getAvailableLanguage() {
            if (availableLanguage == null) {
                availableLanguage = new ArrayList<Language>();
            }
            return this.availableLanguage;
        }

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
     *         &lt;element name="AvailableReportType" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" maxOccurs="unbounded" minOccurs="0"/>
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
        "availableReportType"
    })
    public static class AvailableReportTypes {

        @XmlElement(name = "AvailableReportType", namespace = "http://www.creditsafe.com/globaldata/datatypes")
        @XmlSchemaType(name = "string")
        protected List<CompanyReportType> availableReportType;

        /**
         * Gets the value of the availableReportType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availableReportType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailableReportType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompanyReportType }
         * 
         * 
         */
        public List<CompanyReportType> getAvailableReportType() {
            if (availableReportType == null) {
                availableReportType = new ArrayList<CompanyReportType>();
            }
            return this.availableReportType;
        }

    }

}
