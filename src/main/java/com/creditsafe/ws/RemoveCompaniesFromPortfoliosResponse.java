
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
 *         &lt;element name="RemoveCompaniesFromPortfoliosResult" type="{http://www.creditsafe.com/globaldata/datatypes}PortfolioCompanyRemovalResult" minOccurs="0"/>
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
    "removeCompaniesFromPortfoliosResult"
})
@XmlRootElement(name = "RemoveCompaniesFromPortfoliosResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class RemoveCompaniesFromPortfoliosResponse {

    @XmlElementRef(name = "RemoveCompaniesFromPortfoliosResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<PortfolioCompanyRemovalResult> removeCompaniesFromPortfoliosResult;

    /**
     * Gets the value of the removeCompaniesFromPortfoliosResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PortfolioCompanyRemovalResult }{@code >}
     *     
     */
    public JAXBElement<PortfolioCompanyRemovalResult> getRemoveCompaniesFromPortfoliosResult() {
        return removeCompaniesFromPortfoliosResult;
    }

    /**
     * Sets the value of the removeCompaniesFromPortfoliosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PortfolioCompanyRemovalResult }{@code >}
     *     
     */
    public void setRemoveCompaniesFromPortfoliosResult(JAXBElement<PortfolioCompanyRemovalResult> value) {
        this.removeCompaniesFromPortfoliosResult = value;
    }

}
