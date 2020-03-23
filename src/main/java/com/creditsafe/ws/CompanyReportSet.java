
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyReportSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyReportSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="Reports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Report" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CompanyReport" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ChargeReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyReportSet", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "reports"
})
public class CompanyReportSet
    extends ServiceResponse
{

    @XmlElement(name = "Reports")
    protected CompanyReportSet.Reports reports;
    @XmlAttribute(name = "ChargeReference")
    protected String chargeReference;

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyReportSet.Reports }
     *     
     */
    public CompanyReportSet.Reports getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyReportSet.Reports }
     *     
     */
    public void setReports(CompanyReportSet.Reports value) {
        this.reports = value;
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
     *         &lt;element name="Report" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CompanyReport" maxOccurs="unbounded" minOccurs="0"/>
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
        "report"
    })
    public static class Reports {

        @XmlElement(name = "Report", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<CompanyReport> report;

        /**
         * Gets the value of the report property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the report property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReport().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompanyReport }
         * 
         * 
         */
        public List<CompanyReport> getReport() {
            if (report == null) {
                report = new ArrayList<CompanyReport>();
            }
            return this.report;
        }

    }

}
