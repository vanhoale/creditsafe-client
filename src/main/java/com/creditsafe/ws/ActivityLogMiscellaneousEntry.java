
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityLogMiscellaneousEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityLogMiscellaneousEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogEntry">
 *       &lt;sequence>
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
 *       &lt;/sequence>
 *       &lt;attribute name="Action" use="required" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityMiscellaneousAction" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityLogMiscellaneousEntry", propOrder = {
    "data"
})
public class ActivityLogMiscellaneousEntry
    extends ActivityLogEntry
{

    @XmlElement(name = "Data")
    protected ActivityLogMiscellaneousEntry.Data data;
    @XmlAttribute(name = "Action", required = true)
    protected ActivityMiscellaneousAction action;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityLogMiscellaneousEntry.Data }
     *     
     */
    public ActivityLogMiscellaneousEntry.Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLogMiscellaneousEntry.Data }
     *     
     */
    public void setData(ActivityLogMiscellaneousEntry.Data value) {
        this.data = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityMiscellaneousAction }
     *     
     */
    public ActivityMiscellaneousAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityMiscellaneousAction }
     *     
     */
    public void setAction(ActivityMiscellaneousAction value) {
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

}
