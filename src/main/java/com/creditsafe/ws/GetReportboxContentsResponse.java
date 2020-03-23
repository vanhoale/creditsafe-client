
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
 *         &lt;element name="GetReportboxContentsResult" type="{http://www.creditsafe.com/globaldata/datatypes}ReportboxContents" minOccurs="0"/>
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
    "getReportboxContentsResult"
})
@XmlRootElement(name = "GetReportboxContentsResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class GetReportboxContentsResponse {

    @XmlElementRef(name = "GetReportboxContentsResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportboxContents> getReportboxContentsResult;

    /**
     * Gets the value of the getReportboxContentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReportboxContents }{@code >}
     *     
     */
    public JAXBElement<ReportboxContents> getGetReportboxContentsResult() {
        return getReportboxContentsResult;
    }

    /**
     * Sets the value of the getReportboxContentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReportboxContents }{@code >}
     *     
     */
    public void setGetReportboxContentsResult(JAXBElement<ReportboxContents> value) {
        this.getReportboxContentsResult = value;
    }

}
