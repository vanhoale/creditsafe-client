
package com.creditsafe.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="country" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" minOccurs="0"/>
 *         &lt;element name="searchCriteria" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteria" minOccurs="0"/>
 *         &lt;element name="reportType" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.creditsafe.com/globaldata/datatypes}Language" minOccurs="0"/>
 *         &lt;element name="customData" type="{http://www.creditsafe.com/globaldata/datatypes}CustomData" minOccurs="0"/>
 *         &lt;element name="chargeReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "country",
    "searchCriteria",
    "reportType",
    "language",
    "customData",
    "chargeReference"
})
@XmlRootElement(name = "OrderCompanyOfflineReport", namespace = "http://www.creditsafe.com/globaldata/operations")
public class OrderCompanyOfflineReport {

    @XmlElement(namespace = "http://www.creditsafe.com/globaldata/operations")
    @XmlSchemaType(name = "string")
    protected CountryCode country;
    @XmlElementRef(name = "searchCriteria", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchCriteria> searchCriteria;
    @XmlElement(namespace = "http://www.creditsafe.com/globaldata/operations")
    @XmlSchemaType(name = "string")
    protected CompanyReportType reportType;
    @XmlElement(namespace = "http://www.creditsafe.com/globaldata/operations")
    @XmlSchemaType(name = "string")
    protected Language language;
    @XmlElementRef(name = "customData", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomData> customData;
    @XmlElementRef(name = "chargeReference", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chargeReference;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountry(CountryCode value) {
        this.country = value;
    }

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchCriteria }{@code >}
     *     
     */
    public JAXBElement<SearchCriteria> getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchCriteria }{@code >}
     *     
     */
    public void setSearchCriteria(JAXBElement<SearchCriteria> value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyReportType }
     *     
     */
    public CompanyReportType getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyReportType }
     *     
     */
    public void setReportType(CompanyReportType value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomData }{@code >}
     *     
     */
    public JAXBElement<CustomData> getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomData }{@code >}
     *     
     */
    public void setCustomData(JAXBElement<CustomData> value) {
        this.customData = value;
    }

    /**
     * Gets the value of the chargeReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChargeReference() {
        return chargeReference;
    }

    /**
     * Sets the value of the chargeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChargeReference(JAXBElement<String> value) {
        this.chargeReference = value;
    }

}
