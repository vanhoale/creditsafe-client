
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
 *         &lt;element name="GetPortfolioSettingsResult" type="{http://www.creditsafe.com/globaldata/datatypes}CurrentPortfolioSettings" minOccurs="0"/>
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
    "getPortfolioSettingsResult"
})
@XmlRootElement(name = "GetPortfolioSettingsResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class GetPortfolioSettingsResponse {

    @XmlElementRef(name = "GetPortfolioSettingsResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<CurrentPortfolioSettings> getPortfolioSettingsResult;

    /**
     * Gets the value of the getPortfolioSettingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurrentPortfolioSettings }{@code >}
     *     
     */
    public JAXBElement<CurrentPortfolioSettings> getGetPortfolioSettingsResult() {
        return getPortfolioSettingsResult;
    }

    /**
     * Sets the value of the getPortfolioSettingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurrentPortfolioSettings }{@code >}
     *     
     */
    public void setGetPortfolioSettingsResult(JAXBElement<CurrentPortfolioSettings> value) {
        this.getPortfolioSettingsResult = value;
    }

}
