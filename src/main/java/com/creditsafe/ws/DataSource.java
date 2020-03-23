
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for DataSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountriesEnabled" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EnabledCountry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>boolean">
 *                           &lt;attribute name="key" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSource", propOrder = {
    "countriesEnabled"
})
public class DataSource {

    @XmlElement(name = "CountriesEnabled")
    protected DataSource.CountriesEnabled countriesEnabled;
    @XmlAttribute(name = "Id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Enabled", required = true)
    protected boolean enabled;

    /**
     * Gets the value of the countriesEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link DataSource.CountriesEnabled }
     *     
     */
    public DataSource.CountriesEnabled getCountriesEnabled() {
        return countriesEnabled;
    }

    /**
     * Sets the value of the countriesEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSource.CountriesEnabled }
     *     
     */
    public void setCountriesEnabled(DataSource.CountriesEnabled value) {
        this.countriesEnabled = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EnabledCountry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>boolean">
     *                 &lt;attribute name="key" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "enabledCountry"
    })
    public static class CountriesEnabled {

        @XmlElement(name = "EnabledCountry")
        protected List<DataSource.CountriesEnabled.EnabledCountry> enabledCountry;

        /**
         * Gets the value of the enabledCountry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the enabledCountry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEnabledCountry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataSource.CountriesEnabled.EnabledCountry }
         * 
         * 
         */
        public List<DataSource.CountriesEnabled.EnabledCountry> getEnabledCountry() {
            if (enabledCountry == null) {
                enabledCountry = new ArrayList<DataSource.CountriesEnabled.EnabledCountry>();
            }
            return this.enabledCountry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>boolean">
         *       &lt;attribute name="key" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class EnabledCountry {

            @XmlValue
            protected boolean value;
            @XmlAttribute(name = "key", required = true)
            protected CountryCode key;

            /**
             * Gets the value of the value property.
             * 
             */
            public boolean isValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(boolean value) {
                this.value = value;
            }

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link CountryCode }
             *     
             */
            public CountryCode getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link CountryCode }
             *     
             */
            public void setKey(CountryCode value) {
                this.key = value;
            }

        }

    }

}
