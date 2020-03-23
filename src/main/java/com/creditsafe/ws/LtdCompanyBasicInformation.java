
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LtdCompanyBasicInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtdCompanyBasicInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegisteredCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CompanyRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode"/>
 *         &lt;element name="VatRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VatRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DateofCompanyRegistration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DateofStartingOperations" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CommercialCourt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalForm" type="{http://www.creditsafe.com/globaldata/datatypes/reports}LegalForm" minOccurs="0"/>
 *         &lt;element name="TypeofOwnership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyStatus" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CompanyStatusDescription" minOccurs="0"/>
 *         &lt;element name="PrincipalActivity" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CompanyActivity" minOccurs="0"/>
 *         &lt;element name="ContactAddress" type="{http://www.creditsafe.com/globaldata/datatypes}AddressData" minOccurs="0"/>
 *         &lt;element name="ContactTelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LtdCompanyBasicInformation", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "businessName",
    "registeredCompanyName",
    "companyRegistrationNumber",
    "country",
    "vatRegistrationNumber",
    "vatRegistrationDate",
    "dateofCompanyRegistration",
    "dateofStartingOperations",
    "commercialCourt",
    "legalForm",
    "typeofOwnership",
    "companyStatus",
    "principalActivity",
    "contactAddress",
    "contactTelephoneNumber"
})
public class LtdCompanyBasicInformation {

    @XmlElement(name = "BusinessName", required = true)
    protected String businessName;
    @XmlElement(name = "RegisteredCompanyName", required = true)
    protected String registeredCompanyName;
    @XmlElement(name = "CompanyRegistrationNumber")
    protected String companyRegistrationNumber;
    @XmlElement(name = "Country", required = true)
    @XmlSchemaType(name = "string")
    protected CountryCode country;
    @XmlElement(name = "VatRegistrationNumber")
    protected String vatRegistrationNumber;
    @XmlElement(name = "VatRegistrationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vatRegistrationDate;
    @XmlElement(name = "DateofCompanyRegistration")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateofCompanyRegistration;
    @XmlElement(name = "DateofStartingOperations")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateofStartingOperations;
    @XmlElement(name = "CommercialCourt")
    protected String commercialCourt;
    @XmlElement(name = "LegalForm")
    protected LegalForm legalForm;
    @XmlElement(name = "TypeofOwnership")
    protected String typeofOwnership;
    @XmlElement(name = "CompanyStatus")
    protected CompanyStatusDescription companyStatus;
    @XmlElement(name = "PrincipalActivity")
    protected CompanyActivity principalActivity;
    @XmlElement(name = "ContactAddress")
    protected AddressData contactAddress;
    @XmlElement(name = "ContactTelephoneNumber")
    protected String contactTelephoneNumber;

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the registeredCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredCompanyName() {
        return registeredCompanyName;
    }

    /**
     * Sets the value of the registeredCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredCompanyName(String value) {
        this.registeredCompanyName = value;
    }

    /**
     * Gets the value of the companyRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    /**
     * Sets the value of the companyRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegistrationNumber(String value) {
        this.companyRegistrationNumber = value;
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
     * Gets the value of the vatRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatRegistrationNumber() {
        return vatRegistrationNumber;
    }

    /**
     * Sets the value of the vatRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatRegistrationNumber(String value) {
        this.vatRegistrationNumber = value;
    }

    /**
     * Gets the value of the vatRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVatRegistrationDate() {
        return vatRegistrationDate;
    }

    /**
     * Sets the value of the vatRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVatRegistrationDate(XMLGregorianCalendar value) {
        this.vatRegistrationDate = value;
    }

    /**
     * Gets the value of the dateofCompanyRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateofCompanyRegistration() {
        return dateofCompanyRegistration;
    }

    /**
     * Sets the value of the dateofCompanyRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateofCompanyRegistration(XMLGregorianCalendar value) {
        this.dateofCompanyRegistration = value;
    }

    /**
     * Gets the value of the dateofStartingOperations property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateofStartingOperations() {
        return dateofStartingOperations;
    }

    /**
     * Sets the value of the dateofStartingOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateofStartingOperations(XMLGregorianCalendar value) {
        this.dateofStartingOperations = value;
    }

    /**
     * Gets the value of the commercialCourt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialCourt() {
        return commercialCourt;
    }

    /**
     * Sets the value of the commercialCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialCourt(String value) {
        this.commercialCourt = value;
    }

    /**
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link LegalForm }
     *     
     */
    public LegalForm getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalForm }
     *     
     */
    public void setLegalForm(LegalForm value) {
        this.legalForm = value;
    }

    /**
     * Gets the value of the typeofOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeofOwnership() {
        return typeofOwnership;
    }

    /**
     * Sets the value of the typeofOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeofOwnership(String value) {
        this.typeofOwnership = value;
    }

    /**
     * Gets the value of the companyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyStatusDescription }
     *     
     */
    public CompanyStatusDescription getCompanyStatus() {
        return companyStatus;
    }

    /**
     * Sets the value of the companyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyStatusDescription }
     *     
     */
    public void setCompanyStatus(CompanyStatusDescription value) {
        this.companyStatus = value;
    }

    /**
     * Gets the value of the principalActivity property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyActivity }
     *     
     */
    public CompanyActivity getPrincipalActivity() {
        return principalActivity;
    }

    /**
     * Sets the value of the principalActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyActivity }
     *     
     */
    public void setPrincipalActivity(CompanyActivity value) {
        this.principalActivity = value;
    }

    /**
     * Gets the value of the contactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressData }
     *     
     */
    public AddressData getContactAddress() {
        return contactAddress;
    }

    /**
     * Sets the value of the contactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressData }
     *     
     */
    public void setContactAddress(AddressData value) {
        this.contactAddress = value;
    }

    /**
     * Gets the value of the contactTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTelephoneNumber() {
        return contactTelephoneNumber;
    }

    /**
     * Sets the value of the contactTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTelephoneNumber(String value) {
        this.contactTelephoneNumber = value;
    }

}
