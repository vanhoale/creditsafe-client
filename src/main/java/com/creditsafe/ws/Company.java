
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Company complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Company">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}CompanyData">
 *       &lt;sequence>
 *         &lt;element name="AvailableReportTypes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AvailableReportType" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AvailableLanguages">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AvailableLanguage" type="{http://www.creditsafe.com/globaldata/datatypes}Language" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalDataItem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *       &lt;attribute name="DateOfLatestAccounts" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="OnlineReports" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Monitoring" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "availableReportTypes",
    "availableLanguages",
    "additionalData"
})
public class Company
    extends CompanyData
{

    @XmlElement(name = "AvailableReportTypes", required = true)
    protected Company.AvailableReportTypes availableReportTypes;
    @XmlElement(name = "AvailableLanguages", required = true)
    protected Company.AvailableLanguages availableLanguages;
    @XmlElement(name = "AdditionalData")
    protected Company.AdditionalData additionalData;
    @XmlAttribute(name = "DateOfLatestAccounts")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfLatestAccounts;
    @XmlAttribute(name = "OnlineReports", required = true)
    protected boolean onlineReports;
    @XmlAttribute(name = "Monitoring", required = true)
    protected boolean monitoring;

    /**
     * Gets the value of the availableReportTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Company.AvailableReportTypes }
     *     
     */
    public Company.AvailableReportTypes getAvailableReportTypes() {
        return availableReportTypes;
    }

    /**
     * Sets the value of the availableReportTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company.AvailableReportTypes }
     *     
     */
    public void setAvailableReportTypes(Company.AvailableReportTypes value) {
        this.availableReportTypes = value;
    }

    /**
     * Gets the value of the availableLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link Company.AvailableLanguages }
     *     
     */
    public Company.AvailableLanguages getAvailableLanguages() {
        return availableLanguages;
    }

    /**
     * Sets the value of the availableLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company.AvailableLanguages }
     *     
     */
    public void setAvailableLanguages(Company.AvailableLanguages value) {
        this.availableLanguages = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link Company.AdditionalData }
     *     
     */
    public Company.AdditionalData getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company.AdditionalData }
     *     
     */
    public void setAdditionalData(Company.AdditionalData value) {
        this.additionalData = value;
    }

    /**
     * Gets the value of the dateOfLatestAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfLatestAccounts() {
        return dateOfLatestAccounts;
    }

    /**
     * Sets the value of the dateOfLatestAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfLatestAccounts(XMLGregorianCalendar value) {
        this.dateOfLatestAccounts = value;
    }

    /**
     * Gets the value of the onlineReports property.
     * 
     */
    public boolean isOnlineReports() {
        return onlineReports;
    }

    /**
     * Sets the value of the onlineReports property.
     * 
     */
    public void setOnlineReports(boolean value) {
        this.onlineReports = value;
    }

    /**
     * Gets the value of the monitoring property.
     * 
     */
    public boolean isMonitoring() {
        return monitoring;
    }

    /**
     * Sets the value of the monitoring property.
     * 
     */
    public void setMonitoring(boolean value) {
        this.monitoring = value;
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
     *         &lt;element name="AdditionalDataItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "additionalDataItem"
    })
    public static class AdditionalData {

        @XmlElement(name = "AdditionalDataItem", namespace = "http://www.creditsafe.com/globaldata/datatypes")
        protected List<Company.AdditionalData.AdditionalDataItem> additionalDataItem;

        /**
         * Gets the value of the additionalDataItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalDataItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalDataItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Company.AdditionalData.AdditionalDataItem }
         * 
         * 
         */
        public List<Company.AdditionalData.AdditionalDataItem> getAdditionalDataItem() {
            if (additionalDataItem == null) {
                additionalDataItem = new ArrayList<Company.AdditionalData.AdditionalDataItem>();
            }
            return this.additionalDataItem;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class AdditionalDataItem {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "key", required = true)
            protected String key;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

        }

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
     *         &lt;element name="AvailableLanguage" type="{http://www.creditsafe.com/globaldata/datatypes}Language" maxOccurs="unbounded"/>
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
        "availableLanguage"
    })
    public static class AvailableLanguages {

        @XmlElement(name = "AvailableLanguage", namespace = "http://www.creditsafe.com/globaldata/datatypes", required = true)
        @XmlSchemaType(name = "string")
        protected List<Language> availableLanguage;

        /**
         * Gets the value of the availableLanguage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availableLanguage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailableLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Language }
         * 
         * 
         */
        public List<Language> getAvailableLanguage() {
            if (availableLanguage == null) {
                availableLanguage = new ArrayList<Language>();
            }
            return this.availableLanguage;
        }

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
     *         &lt;element name="AvailableReportType" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" maxOccurs="unbounded"/>
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
        "availableReportType"
    })
    public static class AvailableReportTypes {

        @XmlElement(name = "AvailableReportType", namespace = "http://www.creditsafe.com/globaldata/datatypes", required = true)
        @XmlSchemaType(name = "string")
        protected List<CompanyReportType> availableReportType;

        /**
         * Gets the value of the availableReportType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availableReportType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailableReportType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompanyReportType }
         * 
         * 
         */
        public List<CompanyReportType> getAvailableReportType() {
            if (availableReportType == null) {
                availableReportType = new ArrayList<CompanyReportType>();
            }
            return this.availableReportType;
        }

    }

}
