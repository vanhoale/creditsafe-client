
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
 *         &lt;element name="GetStoredReportResult" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ReportSnapshot" minOccurs="0"/>
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
    "getStoredReportResult"
})
@XmlRootElement(name = "GetStoredReportResponse", namespace = "http://www.creditsafe.com/globaldata/operations/administration")
public class GetStoredReportResponse {

    @XmlElementRef(name = "GetStoredReportResult", namespace = "http://www.creditsafe.com/globaldata/operations/administration", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportSnapshot> getStoredReportResult;

    /**
     * Gets the value of the getStoredReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReportSnapshot }{@code >}
     *     
     */
    public JAXBElement<ReportSnapshot> getGetStoredReportResult() {
        return getStoredReportResult;
    }

    /**
     * Sets the value of the getStoredReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReportSnapshot }{@code >}
     *     
     */
    public void setGetStoredReportResult(JAXBElement<ReportSnapshot> value) {
        this.getStoredReportResult = value;
    }

}
