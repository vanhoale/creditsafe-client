
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserAccountOverview complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAccountOverview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfflineReportsEmailAddresses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractType" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ContractType" minOccurs="0"/>
 *         &lt;element name="ParentProduct" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ExternalProduct" minOccurs="0"/>
 *         &lt;element name="LastLogin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BannedTill" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="AllowOfflineServiceTypeOverride" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAccountOverview", propOrder = {
    "username",
    "email",
    "offlineReportsEmailAddresses",
    "contractType",
    "parentProduct",
    "lastLogin",
    "bannedTill",
    "notes"
})
public class UserAccountOverview {

    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "OfflineReportsEmailAddresses")
    protected String offlineReportsEmailAddresses;
    @XmlElement(name = "ContractType")
    @XmlSchemaType(name = "string")
    protected ContractType contractType;
    @XmlElement(name = "ParentProduct")
    @XmlSchemaType(name = "string")
    protected ExternalProduct parentProduct;
    @XmlElement(name = "LastLogin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLogin;
    @XmlElement(name = "BannedTill")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bannedTill;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlAttribute(name = "Id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    @XmlAttribute(name = "Enabled", required = true)
    protected boolean enabled;
    @XmlAttribute(name = "CustomerId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long customerId;
    @XmlAttribute(name = "AllowOfflineServiceTypeOverride", required = true)
    protected boolean allowOfflineServiceTypeOverride;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the offlineReportsEmailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfflineReportsEmailAddresses() {
        return offlineReportsEmailAddresses;
    }

    /**
     * Sets the value of the offlineReportsEmailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfflineReportsEmailAddresses(String value) {
        this.offlineReportsEmailAddresses = value;
    }

    /**
     * Gets the value of the contractType property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setContractType(ContractType value) {
        this.contractType = value;
    }

    /**
     * Gets the value of the parentProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalProduct }
     *     
     */
    public ExternalProduct getParentProduct() {
        return parentProduct;
    }

    /**
     * Sets the value of the parentProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalProduct }
     *     
     */
    public void setParentProduct(ExternalProduct value) {
        this.parentProduct = value;
    }

    /**
     * Gets the value of the lastLogin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLogin() {
        return lastLogin;
    }

    /**
     * Sets the value of the lastLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLogin(XMLGregorianCalendar value) {
        this.lastLogin = value;
    }

    /**
     * Gets the value of the bannedTill property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBannedTill() {
        return bannedTill;
    }

    /**
     * Sets the value of the bannedTill property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBannedTill(XMLGregorianCalendar value) {
        this.bannedTill = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the allowOfflineServiceTypeOverride property.
     * 
     */
    public boolean isAllowOfflineServiceTypeOverride() {
        return allowOfflineServiceTypeOverride;
    }

    /**
     * Sets the value of the allowOfflineServiceTypeOverride property.
     * 
     */
    public void setAllowOfflineServiceTypeOverride(boolean value) {
        this.allowOfflineServiceTypeOverride = value;
    }

}
