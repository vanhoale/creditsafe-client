
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriteriaSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteriaSchema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_String" minOccurs="0"/>
 *         &lt;element name="SafeNumber" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_String" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.QueryStringSchema" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_CompanyType" minOccurs="0"/>
 *         &lt;element name="OfficeType" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_OfficeType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_CompanyStatus" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_String" minOccurs="0"/>
 *         &lt;element name="VatNumber" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_String" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.creditsafe.com/globaldata/datatypes}AddressCriteriaSchema" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteriaSchema", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "id",
    "safeNumber",
    "name",
    "type",
    "officeType",
    "status",
    "registrationNumber",
    "vatNumber",
    "address",
    "phoneNumber"
})
public class SearchCriteriaSchema {

    @XmlElement(name = "Id")
    protected SearchCriteriaSchemaValueSchemaString id;
    @XmlElement(name = "SafeNumber")
    protected SearchCriteriaSchemaValueSchemaString safeNumber;
    @XmlElement(name = "Name")
    protected SearchCriteriaSchemaQueryStringSchema name;
    @XmlElement(name = "Type")
    protected SearchCriteriaSchemaValueSchemaCompanyType type;
    @XmlElement(name = "OfficeType")
    protected SearchCriteriaSchemaValueSchemaOfficeType officeType;
    @XmlElement(name = "Status")
    protected SearchCriteriaSchemaValueSchemaCompanyStatus status;
    @XmlElement(name = "RegistrationNumber")
    protected SearchCriteriaSchemaValueSchemaString registrationNumber;
    @XmlElement(name = "VatNumber")
    protected SearchCriteriaSchemaValueSchemaString vatNumber;
    @XmlElement(name = "Address")
    protected AddressCriteriaSchema address;
    @XmlElement(name = "PhoneNumber")
    protected SearchCriteriaSchemaValueSchemaString phoneNumber;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public SearchCriteriaSchemaValueSchemaString getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public void setId(SearchCriteriaSchemaValueSchemaString value) {
        this.id = value;
    }

    /**
     * Gets the value of the safeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public SearchCriteriaSchemaValueSchemaString getSafeNumber() {
        return safeNumber;
    }

    /**
     * Sets the value of the safeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public void setSafeNumber(SearchCriteriaSchemaValueSchemaString value) {
        this.safeNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaQueryStringSchema }
     *     
     */
    public SearchCriteriaSchemaQueryStringSchema getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaQueryStringSchema }
     *     
     */
    public void setName(SearchCriteriaSchemaQueryStringSchema value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaCompanyType }
     *     
     */
    public SearchCriteriaSchemaValueSchemaCompanyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaCompanyType }
     *     
     */
    public void setType(SearchCriteriaSchemaValueSchemaCompanyType value) {
        this.type = value;
    }

    /**
     * Gets the value of the officeType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaOfficeType }
     *     
     */
    public SearchCriteriaSchemaValueSchemaOfficeType getOfficeType() {
        return officeType;
    }

    /**
     * Sets the value of the officeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaOfficeType }
     *     
     */
    public void setOfficeType(SearchCriteriaSchemaValueSchemaOfficeType value) {
        this.officeType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaCompanyStatus }
     *     
     */
    public SearchCriteriaSchemaValueSchemaCompanyStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaCompanyStatus }
     *     
     */
    public void setStatus(SearchCriteriaSchemaValueSchemaCompanyStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public SearchCriteriaSchemaValueSchemaString getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public void setRegistrationNumber(SearchCriteriaSchemaValueSchemaString value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the vatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public SearchCriteriaSchemaValueSchemaString getVatNumber() {
        return vatNumber;
    }

    /**
     * Sets the value of the vatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public void setVatNumber(SearchCriteriaSchemaValueSchemaString value) {
        this.vatNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressCriteriaSchema }
     *     
     */
    public AddressCriteriaSchema getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressCriteriaSchema }
     *     
     */
    public void setAddress(AddressCriteriaSchema value) {
        this.address = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public SearchCriteriaSchemaValueSchemaString getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public void setPhoneNumber(SearchCriteriaSchemaValueSchemaString value) {
        this.phoneNumber = value;
    }

}
