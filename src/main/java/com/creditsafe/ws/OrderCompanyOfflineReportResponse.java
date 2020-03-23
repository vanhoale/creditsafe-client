
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
 *         &lt;element name="OrderCompanyOfflineReportResult" type="{http://www.creditsafe.com/globaldata/datatypes}ReportOrder" minOccurs="0"/>
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
    "orderCompanyOfflineReportResult"
})
@XmlRootElement(name = "OrderCompanyOfflineReportResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class OrderCompanyOfflineReportResponse {

    @XmlElementRef(name = "OrderCompanyOfflineReportResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportOrder> orderCompanyOfflineReportResult;

    /**
     * Gets the value of the orderCompanyOfflineReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReportOrder }{@code >}
     *     
     */
    public JAXBElement<ReportOrder> getOrderCompanyOfflineReportResult() {
        return orderCompanyOfflineReportResult;
    }

    /**
     * Sets the value of the orderCompanyOfflineReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReportOrder }{@code >}
     *     
     */
    public void setOrderCompanyOfflineReportResult(JAXBElement<ReportOrder> value) {
        this.orderCompanyOfflineReportResult = value;
    }

}
