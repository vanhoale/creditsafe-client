
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
 *         &lt;element name="TryRetrieveCompanyOnlineReportResult" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CompanyReportSet" minOccurs="0"/>
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
    "tryRetrieveCompanyOnlineReportResult"
})
@XmlRootElement(name = "TryRetrieveCompanyOnlineReportResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class TryRetrieveCompanyOnlineReportResponse {

    @XmlElementRef(name = "TryRetrieveCompanyOnlineReportResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<CompanyReportSet> tryRetrieveCompanyOnlineReportResult;

    /**
     * Gets the value of the tryRetrieveCompanyOnlineReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompanyReportSet }{@code >}
     *     
     */
    public JAXBElement<CompanyReportSet> getTryRetrieveCompanyOnlineReportResult() {
        return tryRetrieveCompanyOnlineReportResult;
    }

    /**
     * Sets the value of the tryRetrieveCompanyOnlineReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompanyReportSet }{@code >}
     *     
     */
    public void setTryRetrieveCompanyOnlineReportResult(JAXBElement<CompanyReportSet> value) {
        this.tryRetrieveCompanyOnlineReportResult = value;
    }

}
