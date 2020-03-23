
package com.creditsafe.ws;

import java.math.BigInteger;
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
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="report" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onlineRetrievalCriteria" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteria" minOccurs="0"/>
 *         &lt;element name="additionalRetrievalData" type="{http://www.creditsafe.com/globaldata/datatypes}CustomData" minOccurs="0"/>
 *         &lt;element name="updateAllInstances" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "orderNumber",
    "report",
    "onlineRetrievalCriteria",
    "additionalRetrievalData",
    "updateAllInstances"
})
@XmlRootElement(name = "UpdateStoredReport", namespace = "http://www.creditsafe.com/globaldata/operations/administration")
public class UpdateStoredReport {

    @XmlElement(namespace = "http://www.creditsafe.com/globaldata/operations/administration")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger orderNumber;
    @XmlElementRef(name = "report", namespace = "http://www.creditsafe.com/globaldata/operations/administration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> report;
    @XmlElementRef(name = "onlineRetrievalCriteria", namespace = "http://www.creditsafe.com/globaldata/operations/administration", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchCriteria> onlineRetrievalCriteria;
    @XmlElementRef(name = "additionalRetrievalData", namespace = "http://www.creditsafe.com/globaldata/operations/administration", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomData> additionalRetrievalData;
    @XmlElement(namespace = "http://www.creditsafe.com/globaldata/operations/administration")
    protected Boolean updateAllInstances;

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderNumber(BigInteger value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReport(JAXBElement<String> value) {
        this.report = value;
    }

    /**
     * Gets the value of the onlineRetrievalCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchCriteria }{@code >}
     *     
     */
    public JAXBElement<SearchCriteria> getOnlineRetrievalCriteria() {
        return onlineRetrievalCriteria;
    }

    /**
     * Sets the value of the onlineRetrievalCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchCriteria }{@code >}
     *     
     */
    public void setOnlineRetrievalCriteria(JAXBElement<SearchCriteria> value) {
        this.onlineRetrievalCriteria = value;
    }

    /**
     * Gets the value of the additionalRetrievalData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomData }{@code >}
     *     
     */
    public JAXBElement<CustomData> getAdditionalRetrievalData() {
        return additionalRetrievalData;
    }

    /**
     * Sets the value of the additionalRetrievalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomData }{@code >}
     *     
     */
    public void setAdditionalRetrievalData(JAXBElement<CustomData> value) {
        this.additionalRetrievalData = value;
    }

    /**
     * Gets the value of the updateAllInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateAllInstances() {
        return updateAllInstances;
    }

    /**
     * Sets the value of the updateAllInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateAllInstances(Boolean value) {
        this.updateAllInstances = value;
    }

}
