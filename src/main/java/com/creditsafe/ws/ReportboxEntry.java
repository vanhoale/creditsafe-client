
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
 * <p>Java class for ReportboxEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportboxEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportType" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType"/>
 *         &lt;element name="OrderedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Company" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyData"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="OrderNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="Realised" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportboxEntry", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "reportType",
    "orderedOn",
    "company"
})
@XmlSeeAlso({
    ReportSnapshotData.class
})
public class ReportboxEntry {

    @XmlElement(name = "ReportType", required = true)
    @XmlSchemaType(name = "string")
    protected CompanyReportType reportType;
    @XmlElement(name = "OrderedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderedOn;
    @XmlElement(name = "Company", required = true)
    protected CompanyData company;
    @XmlAttribute(name = "Id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    @XmlAttribute(name = "OrderNumber", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger orderNumber;
    @XmlAttribute(name = "Realised", required = true)
    protected boolean realised;

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
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyData }
     *     
     */
    public CompanyData getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyData }
     *     
     */
    public void setCompany(CompanyData value) {
        this.company = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
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
     * Gets the value of the realised property.
     * 
     */
    public boolean isRealised() {
        return realised;
    }

    /**
     * Sets the value of the realised property.
     * 
     */
    public void setRealised(boolean value) {
        this.realised = value;
    }

}
