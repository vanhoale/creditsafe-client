
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
 *         &lt;element name="GetPortfoliosResult" type="{http://www.creditsafe.com/globaldata/datatypes}PortfoliosList" minOccurs="0"/>
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
    "getPortfoliosResult"
})
@XmlRootElement(name = "GetPortfoliosResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class GetPortfoliosResponse {

    @XmlElementRef(name = "GetPortfoliosResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<PortfoliosList> getPortfoliosResult;

    /**
     * Gets the value of the getPortfoliosResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PortfoliosList }{@code >}
     *     
     */
    public JAXBElement<PortfoliosList> getGetPortfoliosResult() {
        return getPortfoliosResult;
    }

    /**
     * Sets the value of the getPortfoliosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PortfoliosList }{@code >}
     *     
     */
    public void setGetPortfoliosResult(JAXBElement<PortfoliosList> value) {
        this.getPortfoliosResult = value;
    }

}
