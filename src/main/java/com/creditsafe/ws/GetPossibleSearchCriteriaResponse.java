
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
 *         &lt;element name="GetPossibleSearchCriteriaResult" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchemaSet" minOccurs="0"/>
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
    "getPossibleSearchCriteriaResult"
})
@XmlRootElement(name = "GetPossibleSearchCriteriaResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class GetPossibleSearchCriteriaResponse {

    @XmlElementRef(name = "GetPossibleSearchCriteriaResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchCriteriaSchemaSet> getPossibleSearchCriteriaResult;

    /**
     * Gets the value of the getPossibleSearchCriteriaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchCriteriaSchemaSet }{@code >}
     *     
     */
    public JAXBElement<SearchCriteriaSchemaSet> getGetPossibleSearchCriteriaResult() {
        return getPossibleSearchCriteriaResult;
    }

    /**
     * Sets the value of the getPossibleSearchCriteriaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchCriteriaSchemaSet }{@code >}
     *     
     */
    public void setGetPossibleSearchCriteriaResult(JAXBElement<SearchCriteriaSchemaSet> value) {
        this.getPossibleSearchCriteriaResult = value;
    }

}
