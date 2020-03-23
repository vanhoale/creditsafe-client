
package com.creditsafe.ws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="CompanyId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OrderNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="Language" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}Language" />
 *       &lt;attribute name="ReportCurrency" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}Currency" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyReport", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
@XmlSeeAlso({
    LtdCompanyFullReport.class
})
public abstract class CompanyReport {

    @XmlAttribute(name = "CompanyId", required = true)
    protected String companyId;
    @XmlAttribute(name = "OrderNumber", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger orderNumber;
    @XmlAttribute(name = "Language", required = true)
    protected Language language;
    @XmlAttribute(name = "ReportCurrency", required = true)
    protected Currency reportCurrency;

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
     * Gets the value of the reportCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getReportCurrency() {
        return reportCurrency;
    }

    /**
     * Sets the value of the reportCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setReportCurrency(Currency value) {
        this.reportCurrency = value;
    }

}
