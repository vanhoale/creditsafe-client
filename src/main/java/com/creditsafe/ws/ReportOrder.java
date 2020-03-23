
package com.creditsafe.ws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReportOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="CompanyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportType" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.creditsafe.com/globaldata/datatypes}Language" minOccurs="0"/>
 *         &lt;element name="PlacementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ApproxWaitingTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="ChargeReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportOrder", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "companyId",
    "reportType",
    "language",
    "placementDate",
    "approxWaitingTime"
})
public class ReportOrder
    extends ServiceResponse
{

    @XmlElement(name = "CompanyId")
    protected String companyId;
    @XmlElement(name = "ReportType")
    @XmlSchemaType(name = "string")
    protected CompanyReportType reportType;
    @XmlElement(name = "Language")
    @XmlSchemaType(name = "string")
    protected Language language;
    @XmlElement(name = "PlacementDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar placementDate;
    @XmlElement(name = "ApproxWaitingTime")
    protected Duration approxWaitingTime;
    @XmlAttribute(name = "OrderNumber")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger orderNumber;
    @XmlAttribute(name = "ChargeReference")
    protected String chargeReference;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
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
     * Gets the value of the placementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlacementDate() {
        return placementDate;
    }

    /**
     * Sets the value of the placementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlacementDate(XMLGregorianCalendar value) {
        this.placementDate = value;
    }

    /**
     * Gets the value of the approxWaitingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getApproxWaitingTime() {
        return approxWaitingTime;
    }

    /**
     * Sets the value of the approxWaitingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setApproxWaitingTime(Duration value) {
        this.approxWaitingTime = value;
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
     * Gets the value of the chargeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeReference() {
        return chargeReference;
    }

    /**
     * Sets the value of the chargeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeReference(String value) {
        this.chargeReference = value;
    }

}
