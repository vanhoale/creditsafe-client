
package com.creditsafe.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="RetrieveCompanyOnlineReportResult" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CompanyReportSet" minOccurs="0"/>
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
    "retrieveCompanyOnlineReportResult"
})
@XmlRootElement(name = "RetrieveCompanyOnlineReportResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class RetrieveCompanyOnlineReportResponse {

    @XmlElementRef(name = "RetrieveCompanyOnlineReportResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<CompanyReportSet> retrieveCompanyOnlineReportResult;

    /**
     * Gets the value of the retrieveCompanyOnlineReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompanyReportSet }{@code >}
     *     
     */
    public JAXBElement<CompanyReportSet> getRetrieveCompanyOnlineReportResult() {
        return retrieveCompanyOnlineReportResult;
    }

    /**
     * Sets the value of the retrieveCompanyOnlineReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompanyReportSet }{@code >}
     *     
     */
    public void setRetrieveCompanyOnlineReportResult(JAXBElement<CompanyReportSet> value) {
        this.retrieveCompanyOnlineReportResult = value;
    }

}
