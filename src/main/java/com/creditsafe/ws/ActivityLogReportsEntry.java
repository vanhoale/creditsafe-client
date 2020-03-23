
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityLogReportsEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityLogReportsEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogEntry">
 *       &lt;sequence>
 *         &lt;element name="SearchCriteria" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteria" minOccurs="0"/>
 *         &lt;element name="RetrievedCompanyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetrievedCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OrderType" use="required" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityReportOrderType" />
 *       &lt;attribute name="Country" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" />
 *       &lt;attribute name="ReportType" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" />
 *       &lt;attribute name="Language" type="{http://www.creditsafe.com/globaldata/datatypes}Language" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityLogReportsEntry", propOrder = {
    "searchCriteria",
    "retrievedCompanyId",
    "retrievedCompanyName",
    "notes"
})
public class ActivityLogReportsEntry
    extends ActivityLogEntry
{

    @XmlElement(name = "SearchCriteria")
    protected SearchCriteria searchCriteria;
    @XmlElement(name = "RetrievedCompanyId")
    protected String retrievedCompanyId;
    @XmlElement(name = "RetrievedCompanyName")
    protected String retrievedCompanyName;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlAttribute(name = "OrderType", required = true)
    protected ActivityReportOrderType orderType;
    @XmlAttribute(name = "Country")
    protected CountryCode country;
    @XmlAttribute(name = "ReportType")
    protected CompanyReportType reportType;
    @XmlAttribute(name = "Language")
    protected Language language;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteria }
     *     
     */
    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteria }
     *     
     */
    public void setSearchCriteria(SearchCriteria value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the retrievedCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievedCompanyId() {
        return retrievedCompanyId;
    }

    /**
     * Sets the value of the retrievedCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrievedCompanyId(String value) {
        this.retrievedCompanyId = value;
    }

    /**
     * Gets the value of the retrievedCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievedCompanyName() {
        return retrievedCompanyName;
    }

    /**
     * Sets the value of the retrievedCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrievedCompanyName(String value) {
        this.retrievedCompanyName = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityReportOrderType }
     *     
     */
    public ActivityReportOrderType getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityReportOrderType }
     *     
     */
    public void setOrderType(ActivityReportOrderType value) {
        this.orderType = value;
    }

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

}
