
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
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportType" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.creditsafe.com/globaldata/datatypes}Language" minOccurs="0"/>
 *         &lt;element name="customData" type="{http://www.creditsafe.com/globaldata/datatypes}CustomData" minOccurs="0"/>
 *         &lt;element name="chargeReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeInReportbox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="portfolioIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfunsignedInt" minOccurs="0"/>
 *         &lt;element name="monitoringReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "companyId",
    "reportType",
    "language",
    "customData",
    "chargeReference",
    "storeInReportbox",
    "portfolioIds",
    "monitoringReference"
})
@XmlRootElement(name = "RetrieveCompanyOnlineReport", namespace = "http://www.creditsafe.com/globaldata/operations")
public class RetrieveCompanyOnlineReport {

    @XmlElementRef(name = "companyId", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyId;
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
    @XmlElement(namespace = "http://www.creditsafe.com/globaldata/operations")
    protected Boolean storeInReportbox;
    @XmlElementRef(name = "portfolioIds", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfunsignedInt> portfolioIds;
    @XmlElementRef(name = "monitoringReference", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitoringReference;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyId(JAXBElement<String> value) {
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

    /**
     * Gets the value of the storeInReportbox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreInReportbox() {
        return storeInReportbox;
    }

    /**
     * Sets the value of the storeInReportbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreInReportbox(Boolean value) {
        this.storeInReportbox = value;
    }

    /**
     * Gets the value of the portfolioIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}
     *     
     */
    public JAXBElement<ArrayOfunsignedInt> getPortfolioIds() {
        return portfolioIds;
    }

    /**
     * Sets the value of the portfolioIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}
     *     
     */
    public void setPortfolioIds(JAXBElement<ArrayOfunsignedInt> value) {
        this.portfolioIds = value;
    }

    /**
     * Gets the value of the monitoringReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonitoringReference() {
        return monitoringReference;
    }

    /**
     * Sets the value of the monitoringReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonitoringReference(JAXBElement<String> value) {
        this.monitoringReference = value;
    }

}
