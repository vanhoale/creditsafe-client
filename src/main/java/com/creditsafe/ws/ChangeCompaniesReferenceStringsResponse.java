
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
 *         &lt;element name="ChangeCompaniesReferenceStringsResult" type="{http://www.creditsafe.com/globaldata/datatypes}SimpleResult" minOccurs="0"/>
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
    "changeCompaniesReferenceStringsResult"
})
@XmlRootElement(name = "ChangeCompaniesReferenceStringsResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class ChangeCompaniesReferenceStringsResponse {

    @XmlElementRef(name = "ChangeCompaniesReferenceStringsResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleResult> changeCompaniesReferenceStringsResult;

    /**
     * Gets the value of the changeCompaniesReferenceStringsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}
     *     
     */
    public JAXBElement<SimpleResult> getChangeCompaniesReferenceStringsResult() {
        return changeCompaniesReferenceStringsResult;
    }

    /**
     * Sets the value of the changeCompaniesReferenceStringsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}
     *     
     */
    public void setChangeCompaniesReferenceStringsResult(JAXBElement<SimpleResult> value) {
        this.changeCompaniesReferenceStringsResult = value;
    }

}
