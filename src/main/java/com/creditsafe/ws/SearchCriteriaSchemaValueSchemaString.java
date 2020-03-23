
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriteriaSchema.ValueSchema_String complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteriaSchema.ValueSchema_String">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowedValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AllowedValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ValidationRegExp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Optional" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MinLength" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteriaSchema.ValueSchema_String", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "allowedValues",
    "validationRegExp"
})
@XmlSeeAlso({
    SearchCriteriaSchemaQueryStringSchema.class
})
public class SearchCriteriaSchemaValueSchemaString {

    @XmlElement(name = "AllowedValues")
    protected SearchCriteriaSchemaValueSchemaString.AllowedValues allowedValues;
    @XmlElement(name = "ValidationRegExp")
    protected String validationRegExp;
    @XmlAttribute(name = "Optional", required = true)
    protected boolean optional;
    @XmlAttribute(name = "MinLength")
    protected Integer minLength;
    @XmlAttribute(name = "MaxLength")
    protected Integer maxLength;

    /**
     * Gets the value of the allowedValues property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSchemaValueSchemaString.AllowedValues }
     *     
     */
    public SearchCriteriaSchemaValueSchemaString.AllowedValues getAllowedValues() {
        return allowedValues;
    }

    /**
     * Sets the value of the allowedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSchemaValueSchemaString.AllowedValues }
     *     
     */
    public void setAllowedValues(SearchCriteriaSchemaValueSchemaString.AllowedValues value) {
        this.allowedValues = value;
    }

    /**
     * Gets the value of the validationRegExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationRegExp() {
        return validationRegExp;
    }

    /**
     * Sets the value of the validationRegExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationRegExp(String value) {
        this.validationRegExp = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     */
    public boolean isOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     */
    public void setOptional(boolean value) {
        this.optional = value;
    }

    /**
     * Gets the value of the minLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinLength(Integer value) {
        this.minLength = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
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
     *         &lt;element name="AllowedValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "allowedValue"
    })
    public static class AllowedValues {

        @XmlElement(name = "AllowedValue", namespace = "http://www.creditsafe.com/globaldata/datatypes")
        protected List<String> allowedValue;

        /**
         * Gets the value of the allowedValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allowedValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllowedValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAllowedValue() {
            if (allowedValue == null) {
                allowedValue = new ArrayList<String>();
            }
            return this.allowedValue;
        }

    }

}
