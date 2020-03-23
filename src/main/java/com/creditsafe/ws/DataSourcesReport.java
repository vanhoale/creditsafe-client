
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSourcesReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSourcesReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="DataSources">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DataSource" type="{http://www.creditsafe.com/globaldata/datatypes/administration}DataSource" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Priorities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Priority" type="{http://www.creditsafe.com/globaldata/datatypes/administration}DataSourcePriorities" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSourcesReport", propOrder = {
    "dataSources",
    "priorities"
})
public class DataSourcesReport
    extends ServiceResponse
{

    @XmlElement(name = "DataSources", required = true)
    protected DataSourcesReport.DataSources dataSources;
    @XmlElement(name = "Priorities")
    protected DataSourcesReport.Priorities priorities;

    /**
     * Gets the value of the dataSources property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourcesReport.DataSources }
     *     
     */
    public DataSourcesReport.DataSources getDataSources() {
        return dataSources;
    }

    /**
     * Sets the value of the dataSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourcesReport.DataSources }
     *     
     */
    public void setDataSources(DataSourcesReport.DataSources value) {
        this.dataSources = value;
    }

    /**
     * Gets the value of the priorities property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourcesReport.Priorities }
     *     
     */
    public DataSourcesReport.Priorities getPriorities() {
        return priorities;
    }

    /**
     * Sets the value of the priorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourcesReport.Priorities }
     *     
     */
    public void setPriorities(DataSourcesReport.Priorities value) {
        this.priorities = value;
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
     *         &lt;element name="DataSource" type="{http://www.creditsafe.com/globaldata/datatypes/administration}DataSource" maxOccurs="unbounded" minOccurs="0"/>
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
        "dataSource"
    })
    public static class DataSources {

        @XmlElement(name = "DataSource")
        protected List<DataSource> dataSource;

        /**
         * Gets the value of the dataSource property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataSource property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataSource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataSource }
         * 
         * 
         */
        public List<DataSource> getDataSource() {
            if (dataSource == null) {
                dataSource = new ArrayList<DataSource>();
            }
            return this.dataSource;
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
     *         &lt;element name="Priority" type="{http://www.creditsafe.com/globaldata/datatypes/administration}DataSourcePriorities" maxOccurs="unbounded" minOccurs="0"/>
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
        "priority"
    })
    public static class Priorities {

        @XmlElement(name = "Priority")
        protected List<DataSourcePriorities> priority;

        /**
         * Gets the value of the priority property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriority().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataSourcePriorities }
         * 
         * 
         */
        public List<DataSourcePriorities> getPriority() {
            if (priority == null) {
                priority = new ArrayList<DataSourcePriorities>();
            }
            return this.priority;
        }

    }

}
