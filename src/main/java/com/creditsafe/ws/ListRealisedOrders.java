
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
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="newerThan" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="olderThan" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="successfulDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="firstRow" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="rowCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
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
    "countryCode",
    "userId",
    "newerThan",
    "olderThan",
    "successfulDelivery",
    "firstRow",
    "rowCount"
})
@XmlRootElement(name = "ListRealisedOrders", namespace = "http://www.creditsafe.com/globaldata/operations/administration")
public class ListRealisedOrders {

    @XmlElementRef(name = "orderNumber", namespace = "http://www.creditsafe.com/globaldata/operations/administration", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> orderNumber;
    @XmlElementRef(name = "countryCode", namespace = "http://www.creditsafe.com/globaldata/operations/administration", type = JAXBElement.class, required = false)
    protected JAXBElement<CountryCode> countryCode;
    @XmlElementRef(name = "userId", namespace = "http://www.creditsafe.com/globaldata/operations/administration", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> userId;
    @XmlElementRef(name = "newerThan", namespace = "http://www.creditsafe.com/globaldata/operations/administration", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> newerThan;
    @XmlElementRef(name = "olderThan", namespace = "http://www.creditsafe.com/globaldata/operations/administration", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> olderThan;
    @XmlElementRef(name = "successfulDelivery", namespace = "http://www.creditsafe.com/globaldata/operations/administration", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> successfulDelivery;
    @XmlElement(namespace = "http://www.creditsafe.com/globaldata/operations/administration")
    @XmlSchemaType(name = "unsignedInt")
    protected Long firstRow;
    @XmlElement(namespace = "http://www.creditsafe.com/globaldata/operations/administration")
    @XmlSchemaType(name = "unsignedInt")
    protected Long rowCount;

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<BigInteger> value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CountryCode }{@code >}
     *     
     */
    public JAXBElement<CountryCode> getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CountryCode }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<CountryCode> value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUserId(JAXBElement<Long> value) {
        this.userId = value;
    }

    /**
     * Gets the value of the newerThan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNewerThan() {
        return newerThan;
    }

    /**
     * Sets the value of the newerThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNewerThan(JAXBElement<XMLGregorianCalendar> value) {
        this.newerThan = value;
    }

    /**
     * Gets the value of the olderThan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOlderThan() {
        return olderThan;
    }

    /**
     * Sets the value of the olderThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOlderThan(JAXBElement<XMLGregorianCalendar> value) {
        this.olderThan = value;
    }

    /**
     * Gets the value of the successfulDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSuccessfulDelivery() {
        return successfulDelivery;
    }

    /**
     * Sets the value of the successfulDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSuccessfulDelivery(JAXBElement<Boolean> value) {
        this.successfulDelivery = value;
    }

    /**
     * Gets the value of the firstRow property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFirstRow() {
        return firstRow;
    }

    /**
     * Sets the value of the firstRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFirstRow(Long value) {
        this.firstRow = value;
    }

    /**
     * Gets the value of the rowCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRowCount() {
        return rowCount;
    }

    /**
     * Sets the value of the rowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRowCount(Long value) {
        this.rowCount = value;
    }

}
