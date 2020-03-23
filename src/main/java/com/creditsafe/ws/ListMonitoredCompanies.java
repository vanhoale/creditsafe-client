
package com.creditsafe.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="changedOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="changedSince" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstPosition" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
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
    "changedOnly",
    "changedSince",
    "firstPosition",
    "pageSize"
})
@XmlRootElement(name = "ListMonitoredCompanies", namespace = "http://www.creditsafe.com/globaldata/operations")
public class ListMonitoredCompanies {

    @XmlElementRef(name = "portfolioIds", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfunsignedInt> portfolioIds;
    @XmlElement(namespace = "http://www.creditsafe.com/globaldata/operations")
    protected Boolean changedOnly;
    @XmlElementRef(name = "changedSince", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> changedSince;
    @XmlElement(namespace = "http://www.creditsafe.com/globaldata/operations")
    @XmlSchemaType(name = "unsignedInt")
    protected Long firstPosition;
    @XmlElement(namespace = "http://www.creditsafe.com/globaldata/operations")
    @XmlSchemaType(name = "unsignedInt")
    protected Long pageSize;

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
     * Gets the value of the changedOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangedOnly() {
        return changedOnly;
    }

    /**
     * Sets the value of the changedOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangedOnly(Boolean value) {
        this.changedOnly = value;
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

    /**
     * Gets the value of the firstPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFirstPosition() {
        return firstPosition;
    }

    /**
     * Sets the value of the firstPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFirstPosition(Long value) {
        this.firstPosition = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPageSize(Long value) {
        this.pageSize = value;
    }

}
