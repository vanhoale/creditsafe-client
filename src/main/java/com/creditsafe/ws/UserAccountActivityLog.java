
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
 * <p>Java class for UserAccountActivityLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAccountActivityLog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="Browsing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LogEntry" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogBrowsingEntry" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Reports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LogEntry" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogReportsEntry" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Monitoring" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LogEntry" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogMonitoringEntry" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Reportbox" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LogEntry" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogReportboxEntry" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Miscellaneous" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LogEntry" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogMiscellaneousEntry" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="FirstRow" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="RowCount" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="TotalResults" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAccountActivityLog", propOrder = {
    "browsing",
    "reports",
    "monitoring",
    "reportbox",
    "miscellaneous"
})
public class UserAccountActivityLog
    extends ServiceResponse
{

    @XmlElement(name = "Browsing")
    protected UserAccountActivityLog.Browsing browsing;
    @XmlElement(name = "Reports")
    protected UserAccountActivityLog.Reports reports;
    @XmlElement(name = "Monitoring")
    protected UserAccountActivityLog.Monitoring monitoring;
    @XmlElement(name = "Reportbox")
    protected UserAccountActivityLog.Reportbox reportbox;
    @XmlElement(name = "Miscellaneous")
    protected UserAccountActivityLog.Miscellaneous miscellaneous;
    @XmlAttribute(name = "FirstRow", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long firstRow;
    @XmlAttribute(name = "RowCount", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long rowCount;
    @XmlAttribute(name = "TotalResults", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long totalResults;

    /**
     * Gets the value of the browsing property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountActivityLog.Browsing }
     *     
     */
    public UserAccountActivityLog.Browsing getBrowsing() {
        return browsing;
    }

    /**
     * Sets the value of the browsing property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountActivityLog.Browsing }
     *     
     */
    public void setBrowsing(UserAccountActivityLog.Browsing value) {
        this.browsing = value;
    }

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountActivityLog.Reports }
     *     
     */
    public UserAccountActivityLog.Reports getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountActivityLog.Reports }
     *     
     */
    public void setReports(UserAccountActivityLog.Reports value) {
        this.reports = value;
    }

    /**
     * Gets the value of the monitoring property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountActivityLog.Monitoring }
     *     
     */
    public UserAccountActivityLog.Monitoring getMonitoring() {
        return monitoring;
    }

    /**
     * Sets the value of the monitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountActivityLog.Monitoring }
     *     
     */
    public void setMonitoring(UserAccountActivityLog.Monitoring value) {
        this.monitoring = value;
    }

    /**
     * Gets the value of the reportbox property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountActivityLog.Reportbox }
     *     
     */
    public UserAccountActivityLog.Reportbox getReportbox() {
        return reportbox;
    }

    /**
     * Sets the value of the reportbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountActivityLog.Reportbox }
     *     
     */
    public void setReportbox(UserAccountActivityLog.Reportbox value) {
        this.reportbox = value;
    }

    /**
     * Gets the value of the miscellaneous property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountActivityLog.Miscellaneous }
     *     
     */
    public UserAccountActivityLog.Miscellaneous getMiscellaneous() {
        return miscellaneous;
    }

    /**
     * Sets the value of the miscellaneous property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountActivityLog.Miscellaneous }
     *     
     */
    public void setMiscellaneous(UserAccountActivityLog.Miscellaneous value) {
        this.miscellaneous = value;
    }

    /**
     * Gets the value of the firstRow property.
     * 
     */
    public long getFirstRow() {
        return firstRow;
    }

    /**
     * Sets the value of the firstRow property.
     * 
     */
    public void setFirstRow(long value) {
        this.firstRow = value;
    }

    /**
     * Gets the value of the rowCount property.
     * 
     */
    public long getRowCount() {
        return rowCount;
    }

    /**
     * Sets the value of the rowCount property.
     * 
     */
    public void setRowCount(long value) {
        this.rowCount = value;
    }

    /**
     * Gets the value of the totalResults property.
     * 
     */
    public long getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     * 
     */
    public void setTotalResults(long value) {
        this.totalResults = value;
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
     *         &lt;element name="LogEntry" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogBrowsingEntry" maxOccurs="unbounded" minOccurs="0"/>
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
        "logEntry"
    })
    public static class Browsing {

        @XmlElement(name = "LogEntry")
        protected List<ActivityLogBrowsingEntry> logEntry;

        /**
         * Gets the value of the logEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the logEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLogEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActivityLogBrowsingEntry }
         * 
         * 
         */
        public List<ActivityLogBrowsingEntry> getLogEntry() {
            if (logEntry == null) {
                logEntry = new ArrayList<ActivityLogBrowsingEntry>();
            }
            return this.logEntry;
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
     *         &lt;element name="LogEntry" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogMiscellaneousEntry" maxOccurs="unbounded" minOccurs="0"/>
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
        "logEntry"
    })
    public static class Miscellaneous {

        @XmlElement(name = "LogEntry")
        protected List<ActivityLogMiscellaneousEntry> logEntry;

        /**
         * Gets the value of the logEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the logEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLogEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActivityLogMiscellaneousEntry }
         * 
         * 
         */
        public List<ActivityLogMiscellaneousEntry> getLogEntry() {
            if (logEntry == null) {
                logEntry = new ArrayList<ActivityLogMiscellaneousEntry>();
            }
            return this.logEntry;
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
     *         &lt;element name="LogEntry" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogMonitoringEntry" maxOccurs="unbounded" minOccurs="0"/>
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
        "logEntry"
    })
    public static class Monitoring {

        @XmlElement(name = "LogEntry")
        protected List<ActivityLogMonitoringEntry> logEntry;

        /**
         * Gets the value of the logEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the logEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLogEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActivityLogMonitoringEntry }
         * 
         * 
         */
        public List<ActivityLogMonitoringEntry> getLogEntry() {
            if (logEntry == null) {
                logEntry = new ArrayList<ActivityLogMonitoringEntry>();
            }
            return this.logEntry;
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
     *         &lt;element name="LogEntry" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogReportboxEntry" maxOccurs="unbounded" minOccurs="0"/>
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
        "logEntry"
    })
    public static class Reportbox {

        @XmlElement(name = "LogEntry")
        protected List<ActivityLogReportboxEntry> logEntry;

        /**
         * Gets the value of the logEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the logEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLogEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActivityLogReportboxEntry }
         * 
         * 
         */
        public List<ActivityLogReportboxEntry> getLogEntry() {
            if (logEntry == null) {
                logEntry = new ArrayList<ActivityLogReportboxEntry>();
            }
            return this.logEntry;
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
     *         &lt;element name="LogEntry" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ActivityLogReportsEntry" maxOccurs="unbounded" minOccurs="0"/>
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
        "logEntry"
    })
    public static class Reports {

        @XmlElement(name = "LogEntry")
        protected List<ActivityLogReportsEntry> logEntry;

        /**
         * Gets the value of the logEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the logEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLogEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActivityLogReportsEntry }
         * 
         * 
         */
        public List<ActivityLogReportsEntry> getLogEntry() {
            if (logEntry == null) {
                logEntry = new ArrayList<ActivityLogReportsEntry>();
            }
            return this.logEntry;
        }

    }

}
