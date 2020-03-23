
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
 *         &lt;element name="FindCompaniesResult" type="{http://www.creditsafe.com/globaldata/datatypes}CompaniesList" minOccurs="0"/>
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
    "findCompaniesResult"
})
@XmlRootElement(name = "FindCompaniesResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class FindCompaniesResponse {

    @XmlElementRef(name = "FindCompaniesResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<CompaniesList> findCompaniesResult;

    /**
     * Gets the value of the findCompaniesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompaniesList }{@code >}
     *     
     */
    public JAXBElement<CompaniesList> getFindCompaniesResult() {
        return findCompaniesResult;
    }

    /**
     * Sets the value of the findCompaniesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompaniesList }{@code >}
     *     
     */
    public void setFindCompaniesResult(JAXBElement<CompaniesList> value) {
        this.findCompaniesResult = value;
    }

}
