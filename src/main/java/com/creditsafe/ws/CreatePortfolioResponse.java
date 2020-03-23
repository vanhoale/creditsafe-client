
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
 *         &lt;element name="CreatePortfolioResult" type="{http://www.creditsafe.com/globaldata/datatypes}PortfoliosList" minOccurs="0"/>
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
    "createPortfolioResult"
})
@XmlRootElement(name = "CreatePortfolioResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class CreatePortfolioResponse {

    @XmlElementRef(name = "CreatePortfolioResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<PortfoliosList> createPortfolioResult;

    /**
     * Gets the value of the createPortfolioResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PortfoliosList }{@code >}
     *     
     */
    public JAXBElement<PortfoliosList> getCreatePortfolioResult() {
        return createPortfolioResult;
    }

    /**
     * Sets the value of the createPortfolioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PortfoliosList }{@code >}
     *     
     */
    public void setCreatePortfolioResult(JAXBElement<PortfoliosList> value) {
        this.createPortfolioResult = value;
    }

}
