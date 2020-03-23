
package com.creditsafe.ws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OfflineReportOrderData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineReportOrderData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchCriteria" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteria" minOccurs="0"/>
 *         &lt;element name="CustomData" type="{http://www.creditsafe.com/globaldata/datatypes}CustomData" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReportboxId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="OrderNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="UserId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="OrderedOn" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Country" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" />
 *       &lt;attribute name="ReportType" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" />
 *       &lt;attribute name="Language" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}Language" />
 *       &lt;attribute name="ServiceType" use="required" type="{http://www.creditsafe.com/globaldata/datatypes/administration}OrderUrgency" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineReportOrderData", propOrder = {
    "searchCriteria",
    "customData"
})
@XmlSeeAlso({
    ExtendedOfflineReportOrderData.class
})
public class OfflineReportOrderData {

    @XmlElement(name = "SearchCriteria")
    protected SearchCriteria searchCriteria;
    @XmlElement(name = "CustomData")
    protected CustomData customData;
    @XmlAttribute(name = "ReportboxId", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long reportboxId;
    @XmlAttribute(name = "OrderNumber", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger orderNumber;
    @XmlAttribute(name = "UserId", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long userId;
    @XmlAttribute(name = "OrderedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderedOn;
    @XmlAttribute(name = "Country", required = true)
    protected CountryCode country;
    @XmlAttribute(name = "ReportType", required = true)
    protected CompanyReportType reportType;
    @XmlAttribute(name = "Language", required = true)
    protected Language language;
    @XmlAttribute(name = "ServiceType", required = true)
    protected OrderUrgency serviceType;

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
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomData }
     *     
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomData }
     *     
     */
    public void setCustomData(CustomData value) {
        this.customData = value;
    }

    /**
     * Gets the value of the reportboxId property.
     * 
     */
    public long getReportboxId() {
        return reportboxId;
    }

    /**
     * Sets the value of the reportboxId property.
     * 
     */
    public void setReportboxId(long value) {
        this.reportboxId = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderNumber(BigInteger value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the orderedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderedOn() {
        return orderedOn;
    }

    /**
     * Sets the value of the orderedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderedOn(XMLGregorianCalendar value) {
        this.orderedOn = value;
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

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderUrgency }
     *     
     */
    public OrderUrgency getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderUrgency }
     *     
     */
    public void setServiceType(OrderUrgency value) {
        this.serviceType = value;
    }

}
