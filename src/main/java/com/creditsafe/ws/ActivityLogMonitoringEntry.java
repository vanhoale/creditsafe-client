
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
 * <p>Java class for ActivityLogMonitoringEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityLogMonitoringEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogEntry">
 *       &lt;sequence>
 *         &lt;element name="Portfolios" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Portfolio" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SearchCriteria" type="{http://www.creditsafe.com/globaldata/datatypes/administration}MonitoringActivitySearchCriteria" minOccurs="0"/>
 *         &lt;element name="Data" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DataItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Action" use="required" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityMonitoringAction" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityLogMonitoringEntry", propOrder = {
    "portfolios",
    "searchCriteria",
    "data",
    "notes"
})
public class ActivityLogMonitoringEntry
    extends ActivityLogEntry
{

    @XmlElement(name = "Portfolios")
    protected ActivityLogMonitoringEntry.Portfolios portfolios;
    @XmlElement(name = "SearchCriteria")
    protected MonitoringActivitySearchCriteria searchCriteria;
    @XmlElement(name = "Data")
    protected ActivityLogMonitoringEntry.Data data;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlAttribute(name = "Action", required = true)
    protected ActivityMonitoringAction action;

    /**
     * Gets the value of the portfolios property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityLogMonitoringEntry.Portfolios }
     *     
     */
    public ActivityLogMonitoringEntry.Portfolios getPortfolios() {
        return portfolios;
    }

    /**
     * Sets the value of the portfolios property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLogMonitoringEntry.Portfolios }
     *     
     */
    public void setPortfolios(ActivityLogMonitoringEntry.Portfolios value) {
        this.portfolios = value;
    }

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringActivitySearchCriteria }
     *     
     */
    public MonitoringActivitySearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringActivitySearchCriteria }
     *     
     */
    public void setSearchCriteria(MonitoringActivitySearchCriteria value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityLogMonitoringEntry.Data }
     *     
     */
    public ActivityLogMonitoringEntry.Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLogMonitoringEntry.Data }
     *     
     */
    public void setData(ActivityLogMonitoringEntry.Data value) {
        this.data = value;
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
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityMonitoringAction }
     *     
     */
    public ActivityMonitoringAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityMonitoringAction }
     *     
     */
    public void setAction(ActivityMonitoringAction value) {
        this.action = value;
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
     *         &lt;element name="DataItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "dataItem"
    })
    public static class Data {

        @XmlElement(name = "DataItem")
        protected List<String> dataItem;

        /**
         * Gets the value of the dataItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDataItem() {
            if (dataItem == null) {
                dataItem = new ArrayList<String>();
            }
            return this.dataItem;
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
     *         &lt;element name="Portfolio" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
        "portfolio"
    })
    public static class Portfolios {

        @XmlElement(name = "Portfolio")
        protected List<ActivityLogMonitoringEntry.Portfolios.Portfolio> portfolio;

        /**
         * Gets the value of the portfolio property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the portfolio property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPortfolio().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActivityLogMonitoringEntry.Portfolios.Portfolio }
         * 
         * 
         */
        public List<ActivityLogMonitoringEntry.Portfolios.Portfolio> getPortfolio() {
            if (portfolio == null) {
                portfolio = new ArrayList<ActivityLogMonitoringEntry.Portfolios.Portfolio>();
            }
            return this.portfolio;
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
         *       &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
        public static class Portfolio {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "key", required = true)
            @XmlSchemaType(name = "unsignedInt")
            protected long key;

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
             */
            public long getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             */
            public void setKey(long value) {
                this.key = value;
            }

        }

    }

}
