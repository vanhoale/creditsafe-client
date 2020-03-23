
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
 *         &lt;element name="GetReportCustomDataSchemaResult" type="{http://www.creditsafe.com/globaldata/datatypes}CustomDataSchema" minOccurs="0"/>
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
    "getReportCustomDataSchemaResult"
})
@XmlRootElement(name = "GetReportCustomDataSchemaResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class GetReportCustomDataSchemaResponse {

    @XmlElementRef(name = "GetReportCustomDataSchemaResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomDataSchema> getReportCustomDataSchemaResult;

    /**
     * Gets the value of the getReportCustomDataSchemaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomDataSchema }{@code >}
     *     
     */
    public JAXBElement<CustomDataSchema> getGetReportCustomDataSchemaResult() {
        return getReportCustomDataSchemaResult;
    }

    /**
     * Sets the value of the getReportCustomDataSchemaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomDataSchema }{@code >}
     *     
     */
    public void setGetReportCustomDataSchemaResult(JAXBElement<CustomDataSchema> value) {
        this.getReportCustomDataSchemaResult = value;
    }

}
