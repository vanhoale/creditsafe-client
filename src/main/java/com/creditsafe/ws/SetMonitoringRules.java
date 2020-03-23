
package com.creditsafe.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="portfolioId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="newRules" type="{http://www.creditsafe.com/globaldata/datatypes}MonitoringRules" minOccurs="0"/>
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
    "portfolioId",
    "newRules"
})
@XmlRootElement(name = "SetMonitoringRules", namespace = "http://www.creditsafe.com/globaldata/operations")
public class SetMonitoringRules {

    @XmlElement(namespace = "http://www.creditsafe.com/globaldata/operations")
    @XmlSchemaType(name = "unsignedInt")
    protected Long portfolioId;
    @XmlElementRef(name = "newRules", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<MonitoringRules> newRules;

    /**
     * Gets the value of the portfolioId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortfolioId() {
        return portfolioId;
    }

    /**
     * Sets the value of the portfolioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortfolioId(Long value) {
        this.portfolioId = value;
    }

    /**
     * Gets the value of the newRules property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonitoringRules }{@code >}
     *     
     */
    public JAXBElement<MonitoringRules> getNewRules() {
        return newRules;
    }

    /**
     * Sets the value of the newRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonitoringRules }{@code >}
     *     
     */
    public void setNewRules(JAXBElement<MonitoringRules> value) {
        this.newRules = value;
    }

}
