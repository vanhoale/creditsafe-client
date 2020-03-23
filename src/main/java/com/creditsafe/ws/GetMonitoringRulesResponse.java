
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
 *         &lt;element name="GetMonitoringRulesResult" type="{http://www.creditsafe.com/globaldata/datatypes}CurrentPortfolioMonitoringRules" minOccurs="0"/>
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
    "getMonitoringRulesResult"
})
@XmlRootElement(name = "GetMonitoringRulesResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class GetMonitoringRulesResponse {

    @XmlElementRef(name = "GetMonitoringRulesResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<CurrentPortfolioMonitoringRules> getMonitoringRulesResult;

    /**
     * Gets the value of the getMonitoringRulesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurrentPortfolioMonitoringRules }{@code >}
     *     
     */
    public JAXBElement<CurrentPortfolioMonitoringRules> getGetMonitoringRulesResult() {
        return getMonitoringRulesResult;
    }

    /**
     * Sets the value of the getMonitoringRulesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurrentPortfolioMonitoringRules }{@code >}
     *     
     */
    public void setGetMonitoringRulesResult(JAXBElement<CurrentPortfolioMonitoringRules> value) {
        this.getMonitoringRulesResult = value;
    }

}
