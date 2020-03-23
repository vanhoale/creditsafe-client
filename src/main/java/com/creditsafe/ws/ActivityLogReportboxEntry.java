
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityLogReportboxEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityLogReportboxEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogEntry">
 *       &lt;sequence>
 *         &lt;element name="ReportboxIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReportboxId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *       &lt;attribute name="Action" use="required" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityReportboxAction" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityLogReportboxEntry", propOrder = {
    "reportboxIds",
    "data",
    "notes"
})
public class ActivityLogReportboxEntry
    extends ActivityLogEntry
{

    @XmlElement(name = "ReportboxIds")
    protected ActivityLogReportboxEntry.ReportboxIds reportboxIds;
    @XmlElement(name = "Data")
    protected ActivityLogReportboxEntry.Data data;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlAttribute(name = "Action", required = true)
    protected ActivityReportboxAction action;

    /**
     * Gets the value of the reportboxIds property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityLogReportboxEntry.ReportboxIds }
     *     
     */
    public ActivityLogReportboxEntry.ReportboxIds getReportboxIds() {
        return reportboxIds;
    }

    /**
     * Sets the value of the reportboxIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLogReportboxEntry.ReportboxIds }
     *     
     */
    public void setReportboxIds(ActivityLogReportboxEntry.ReportboxIds value) {
        this.reportboxIds = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityLogReportboxEntry.Data }
     *     
     */
    public ActivityLogReportboxEntry.Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLogReportboxEntry.Data }
     *     
     */
    public void setData(ActivityLogReportboxEntry.Data value) {
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
     *     {@link ActivityReportboxAction }
     *     
     */
    public ActivityReportboxAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityReportboxAction }
     *     
     */
    public void setAction(ActivityReportboxAction value) {
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
     *         &lt;element name="ReportboxId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
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
        "reportboxId"
    })
    public static class ReportboxIds {

        @XmlElement(name = "ReportboxId", type = Long.class)
        @XmlSchemaType(name = "unsignedInt")
        protected List<Long> reportboxId;

        /**
         * Gets the value of the reportboxId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportboxId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportboxId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getReportboxId() {
            if (reportboxId == null) {
                reportboxId = new ArrayList<Long>();
            }
            return this.reportboxId;
        }

    }

}
