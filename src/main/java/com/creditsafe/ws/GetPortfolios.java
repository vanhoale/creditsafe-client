
package com.creditsafe.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="portfolioIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfunsignedInt" minOccurs="0"/>
 *         &lt;element name="changedSince" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "portfolioIds",
    "changedSince"
})
@XmlRootElement(name = "GetPortfolios", namespace = "http://www.creditsafe.com/globaldata/operations")
public class GetPortfolios {

    @XmlElementRef(name = "portfolioIds", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfunsignedInt> portfolioIds;
    @XmlElementRef(name = "changedSince", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> changedSince;

    /**
     * Gets the value of the portfolioIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}
     *     
     */
    public JAXBElement<ArrayOfunsignedInt> getPortfolioIds() {
        return portfolioIds;
    }

    /**
     * Sets the value of the portfolioIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}
     *     
     */
    public void setPortfolioIds(JAXBElement<ArrayOfunsignedInt> value) {
        this.portfolioIds = value;
    }

    /**
     * Gets the value of the changedSince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getChangedSince() {
        return changedSince;
    }

    /**
     * Sets the value of the changedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setChangedSince(JAXBElement<XMLGregorianCalendar> value) {
        this.changedSince = value;
    }

}
