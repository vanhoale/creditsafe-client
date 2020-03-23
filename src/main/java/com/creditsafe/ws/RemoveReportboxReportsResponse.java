
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
 *         &lt;element name="RemoveReportboxReportsResult" type="{http://www.creditsafe.com/globaldata/datatypes}SimpleResult" minOccurs="0"/>
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
    "removeReportboxReportsResult"
})
@XmlRootElement(name = "RemoveReportboxReportsResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class RemoveReportboxReportsResponse {

    @XmlElementRef(name = "RemoveReportboxReportsResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleResult> removeReportboxReportsResult;

    /**
     * Gets the value of the removeReportboxReportsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}
     *     
     */
    public JAXBElement<SimpleResult> getRemoveReportboxReportsResult() {
        return removeReportboxReportsResult;
    }

    /**
     * Sets the value of the removeReportboxReportsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}
     *     
     */
    public void setRemoveReportboxReportsResult(JAXBElement<SimpleResult> value) {
        this.removeReportboxReportsResult = value;
    }

}
