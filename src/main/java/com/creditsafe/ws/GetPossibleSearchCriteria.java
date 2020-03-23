
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
 *         &lt;element name="countries" type="{http://schemas.datacontract.org/2004/07/Creditsafe.GlobalData}ArrayOfCountryCode" minOccurs="0"/>
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
    "countries"
})
@XmlRootElement(name = "GetPossibleSearchCriteria", namespace = "http://www.creditsafe.com/globaldata/operations")
public class GetPossibleSearchCriteria {

    @XmlElementRef(name = "countries", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCountryCode> countries;

    /**
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCountryCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCountryCode> getCountries() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCountryCode }{@code >}
     *     
     */
    public void setCountries(JAXBElement<ArrayOfCountryCode> value) {
        this.countries = value;
    }

}
