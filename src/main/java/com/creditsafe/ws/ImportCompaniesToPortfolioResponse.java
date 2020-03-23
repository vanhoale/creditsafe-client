
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
 *         &lt;element name="ImportCompaniesToPortfolioResult" type="{http://www.creditsafe.com/globaldata/datatypes}PortfolioCompanyAdditionResult" minOccurs="0"/>
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
    "importCompaniesToPortfolioResult"
})
@XmlRootElement(name = "ImportCompaniesToPortfolioResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class ImportCompaniesToPortfolioResponse {

    @XmlElementRef(name = "ImportCompaniesToPortfolioResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<PortfolioCompanyAdditionResult> importCompaniesToPortfolioResult;

    /**
     * Gets the value of the importCompaniesToPortfolioResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PortfolioCompanyAdditionResult }{@code >}
     *     
     */
    public JAXBElement<PortfolioCompanyAdditionResult> getImportCompaniesToPortfolioResult() {
        return importCompaniesToPortfolioResult;
    }

    /**
     * Sets the value of the importCompaniesToPortfolioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PortfolioCompanyAdditionResult }{@code >}
     *     
     */
    public void setImportCompaniesToPortfolioResult(JAXBElement<PortfolioCompanyAdditionResult> value) {
        this.importCompaniesToPortfolioResult = value;
    }

}
