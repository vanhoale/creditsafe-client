
package com.creditsafe.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ReportPricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportPricing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Online" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OnlineItem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="key" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Offline" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OfflineItem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="key" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" />
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportPricing", propOrder = {
    "online",
    "offline"
})
public class ReportPricing {

    @XmlElement(name = "Online")
    protected ReportPricing.Online online;
    @XmlElement(name = "Offline")
    protected ReportPricing.Offline offline;

    /**
     * Gets the value of the online property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPricing.Online }
     *     
     */
    public ReportPricing.Online getOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPricing.Online }
     *     
     */
    public void setOnline(ReportPricing.Online value) {
        this.online = value;
    }

    /**
     * Gets the value of the offline property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPricing.Offline }
     *     
     */
    public ReportPricing.Offline getOffline() {
        return offline;
    }

    /**
     * Sets the value of the offline property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPricing.Offline }
     *     
     */
    public void setOffline(ReportPricing.Offline value) {
        this.offline = value;
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
     *         &lt;element name="OfflineItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="key" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" />
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
        "offlineItem"
    })
    public static class Offline {

        @XmlElement(name = "OfflineItem")
        protected List<ReportPricing.Offline.OfflineItem> offlineItem;

        /**
         * Gets the value of the offlineItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offlineItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfflineItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReportPricing.Offline.OfflineItem }
         * 
         * 
         */
        public List<ReportPricing.Offline.OfflineItem> getOfflineItem() {
            if (offlineItem == null) {
                offlineItem = new ArrayList<ReportPricing.Offline.OfflineItem>();
            }
            return this.offlineItem;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="key" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" />
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
        public static class OfflineItem {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "key", required = true)
            protected CompanyReportType key;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link CompanyReportType }
             *     
             */
            public CompanyReportType getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyReportType }
             *     
             */
            public void setKey(CompanyReportType value) {
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
     *         &lt;element name="OnlineItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="key" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" />
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
        "onlineItem"
    })
    public static class Online {

        @XmlElement(name = "OnlineItem")
        protected List<ReportPricing.Online.OnlineItem> onlineItem;

        /**
         * Gets the value of the onlineItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the onlineItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnlineItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReportPricing.Online.OnlineItem }
         * 
         * 
         */
        public List<ReportPricing.Online.OnlineItem> getOnlineItem() {
            if (onlineItem == null) {
                onlineItem = new ArrayList<ReportPricing.Online.OnlineItem>();
            }
            return this.onlineItem;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="key" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyReportType" />
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
        public static class OnlineItem {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "key", required = true)
            protected CompanyReportType key;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link CompanyReportType }
             *     
             */
            public CompanyReportType getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyReportType }
             *     
             */
            public void setKey(CompanyReportType value) {
                this.key = value;
            }

        }

    }

}
