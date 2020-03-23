
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccessControlEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessControlEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Countries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Country" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CompanyType" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyType" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AllowAccess" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Starts" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Expires" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Limit" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="CurrentCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessControlEntry", propOrder = {
    "countries",
    "companyType",
    "message"
})
public class AccessControlEntry {

    @XmlElement(name = "Countries")
    protected AccessControlEntry.Countries countries;
    @XmlElement(name = "CompanyType")
    @XmlSchemaType(name = "string")
    protected CompanyType companyType;
    @XmlElement(name = "Message")
    protected String message;
    @XmlAttribute(name = "AllowAccess", required = true)
    protected boolean allowAccess;
    @XmlAttribute(name = "Starts")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar starts;
    @XmlAttribute(name = "Expires")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expires;
    @XmlAttribute(name = "Limit")
    @XmlSchemaType(name = "unsignedInt")
    protected Long limit;
    @XmlAttribute(name = "CurrentCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentCount;

    /**
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link AccessControlEntry.Countries }
     *     
     */
    public AccessControlEntry.Countries getCountries() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessControlEntry.Countries }
     *     
     */
    public void setCountries(AccessControlEntry.Countries value) {
        this.countries = value;
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setCompanyType(CompanyType value) {
        this.companyType = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the allowAccess property.
     * 
     */
    public boolean isAllowAccess() {
        return allowAccess;
    }

    /**
     * Sets the value of the allowAccess property.
     * 
     */
    public void setAllowAccess(boolean value) {
        this.allowAccess = value;
    }

    /**
     * Gets the value of the starts property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStarts() {
        return starts;
    }

    /**
     * Sets the value of the starts property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStarts(XMLGregorianCalendar value) {
        this.starts = value;
    }

    /**
     * Gets the value of the expires property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpires(XMLGregorianCalendar value) {
        this.expires = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLimit(Long value) {
        this.limit = value;
    }

    /**
     * Gets the value of the currentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentCount() {
        return currentCount;
    }

    /**
     * Sets the value of the currentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentCount(Long value) {
        this.currentCount = value;
    }


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
     *         &lt;element name="Country" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
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
        "country"
    })
    public static class Countries {

        @XmlElement(name = "Country")
        @XmlSchemaType(name = "string")
        protected List<CountryCode> country;

        /**
         * Gets the value of the country property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the country property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryCode }
         * 
         * 
         */
        public List<CountryCode> getCountry() {
            if (country == null) {
                country = new ArrayList<CountryCode>();
            }
            return this.country;
        }

    }

}
