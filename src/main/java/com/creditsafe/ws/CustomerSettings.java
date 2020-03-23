
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountManager" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.creditsafe.com/globaldata/datatypes/administration}CustomerStatus"/>
 *         &lt;element name="Country" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.creditsafe.com/globaldata/datatypes}AddressData" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrontSystemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackOfficeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsReseller" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ContractStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ContractEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSettings", propOrder = {
    "name",
    "accountManager",
    "status",
    "country",
    "address",
    "phoneNumber",
    "frontSystemNumber",
    "backOfficeId",
    "isReseller",
    "contractStartDate",
    "contractEndDate"
})
@XmlSeeAlso({
    CustomerData.class
})
public class CustomerSettings {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "AccountManager")
    @XmlSchemaType(name = "unsignedInt")
    protected Long accountManager;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected CustomerStatus status;
    @XmlElement(name = "Country")
    @XmlSchemaType(name = "string")
    protected CountryCode country;
    @XmlElement(name = "Address")
    protected AddressData address;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "FrontSystemNumber")
    protected String frontSystemNumber;
    @XmlElement(name = "BackOfficeId")
    protected String backOfficeId;
    @XmlElement(name = "IsReseller")
    protected boolean isReseller;
    @XmlElement(name = "ContractStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractStartDate;
    @XmlElement(name = "ContractEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractEndDate;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the accountManager property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountManager() {
        return accountManager;
    }

    /**
     * Sets the value of the accountManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountManager(Long value) {
        this.accountManager = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerStatus }
     *     
     */
    public CustomerStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerStatus }
     *     
     */
    public void setStatus(CustomerStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountry(CountryCode value) {
        this.country = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressData }
     *     
     */
    public AddressData getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressData }
     *     
     */
    public void setAddress(AddressData value) {
        this.address = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the frontSystemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontSystemNumber() {
        return frontSystemNumber;
    }

    /**
     * Sets the value of the frontSystemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontSystemNumber(String value) {
        this.frontSystemNumber = value;
    }

    /**
     * Gets the value of the backOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackOfficeId() {
        return backOfficeId;
    }

    /**
     * Sets the value of the backOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackOfficeId(String value) {
        this.backOfficeId = value;
    }

    /**
     * Gets the value of the isReseller property.
     * 
     */
    public boolean isIsReseller() {
        return isReseller;
    }

    /**
     * Sets the value of the isReseller property.
     * 
     */
    public void setIsReseller(boolean value) {
        this.isReseller = value;
    }

    /**
     * Gets the value of the contractStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractStartDate() {
        return contractStartDate;
    }

    /**
     * Sets the value of the contractStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractStartDate(XMLGregorianCalendar value) {
        this.contractStartDate = value;
    }

    /**
     * Gets the value of the contractEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Sets the value of the contractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEndDate(XMLGregorianCalendar value) {
        this.contractEndDate = value;
    }

}
