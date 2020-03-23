
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressCriteriaSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressCriteriaSchema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SimpleValue" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.QueryStringSchema" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_String" minOccurs="0"/>
 *         &lt;element name="HouseNumber" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_String" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_String" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_String" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://www.creditsafe.com/globaldata/datatypes}SearchCriteriaSchema.ValueSchema_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressCriteriaSchema", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "simpleValue",
    "street",
    "houseNumber",
    "city",
    "postalCode",
    "province"
})
public class AddressCriteriaSchema {

    @XmlElement(name = "SimpleValue")
    protected SearchCriteriaSchemaQueryStringSchema simpleValue;
    @XmlElement(name = "Street")
    protected SearchCriteriaSchemaValueSchemaString street;
    @XmlElement(name = "HouseNumber")
    protected SearchCriteriaSchemaValueSchemaString houseNumber;
    @XmlElement(name = "City")
    protected SearchCriteriaSchemaValueSchemaString city;
    @XmlElement(name = "PostalCode")
    protected SearchCriteriaSchemaValueSchemaString postalCode;
    @XmlElement(name = "Province")
    protected SearchCriteriaSchemaValueSchemaString province;

    /**
     * Gets the value of the simpleValue property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaQueryStringSchema }
     *     
     */
    public SearchCriteriaSchemaQueryStringSchema getSimpleValue() {
        return simpleValue;
    }

    /**
     * Sets the value of the simpleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaQueryStringSchema }
     *     
     */
    public void setSimpleValue(SearchCriteriaSchemaQueryStringSchema value) {
        this.simpleValue = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public SearchCriteriaSchemaValueSchemaString getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public void setStreet(SearchCriteriaSchemaValueSchemaString value) {
        this.street = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public SearchCriteriaSchemaValueSchemaString getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public void setHouseNumber(SearchCriteriaSchemaValueSchemaString value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public SearchCriteriaSchemaValueSchemaString getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public void setCity(SearchCriteriaSchemaValueSchemaString value) {
        this.city = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public SearchCriteriaSchemaValueSchemaString getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public void setPostalCode(SearchCriteriaSchemaValueSchemaString value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public SearchCriteriaSchemaValueSchemaString getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaString }
     *     
     */
    public void setProvince(SearchCriteriaSchemaValueSchemaString value) {
        this.province = value;
    }

}
