
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserAccountAccessRights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAccountAccessRights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Browsing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACE" type="{http://www.creditsafe.com/globaldata/datatypes/administration}AccessControlEntry" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OnlineReports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACE" type="{http://www.creditsafe.com/globaldata/datatypes/administration}AccessControlEntry" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OfflineReports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACE" type="{http://www.creditsafe.com/globaldata/datatypes/administration}AccessControlEntry" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="ACE" type="{http://www.creditsafe.com/globaldata/datatypes/administration}AccessControlEntry" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustomScores" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACE" type="{http://www.creditsafe.com/globaldata/datatypes/administration}AccessControlEntry" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "UserAccountAccessRights", propOrder = {
    "browsing",
    "onlineReports",
    "offlineReports",
    "monitoring",
    "customScores"
})
public class UserAccountAccessRights {

    @XmlElement(name = "Browsing")
    protected UserAccountAccessRights.Browsing browsing;
    @XmlElement(name = "OnlineReports")
    protected UserAccountAccessRights.OnlineReports onlineReports;
    @XmlElement(name = "OfflineReports")
    protected UserAccountAccessRights.OfflineReports offlineReports;
    @XmlElement(name = "Monitoring")
    protected UserAccountAccessRights.Monitoring monitoring;
    @XmlElement(name = "CustomScores")
    protected UserAccountAccessRights.CustomScores customScores;

    /**
     * Gets the value of the browsing property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountAccessRights.Browsing }
     *     
     */
    public UserAccountAccessRights.Browsing getBrowsing() {
        return browsing;
    }

    /**
     * Sets the value of the browsing property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountAccessRights.Browsing }
     *     
     */
    public void setBrowsing(UserAccountAccessRights.Browsing value) {
        this.browsing = value;
    }

    /**
     * Gets the value of the onlineReports property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountAccessRights.OnlineReports }
     *     
     */
    public UserAccountAccessRights.OnlineReports getOnlineReports() {
        return onlineReports;
    }

    /**
     * Sets the value of the onlineReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountAccessRights.OnlineReports }
     *     
     */
    public void setOnlineReports(UserAccountAccessRights.OnlineReports value) {
        this.onlineReports = value;
    }

    /**
     * Gets the value of the offlineReports property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountAccessRights.OfflineReports }
     *     
     */
    public UserAccountAccessRights.OfflineReports getOfflineReports() {
        return offlineReports;
    }

    /**
     * Sets the value of the offlineReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountAccessRights.OfflineReports }
     *     
     */
    public void setOfflineReports(UserAccountAccessRights.OfflineReports value) {
        this.offlineReports = value;
    }

    /**
     * Gets the value of the monitoring property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountAccessRights.Monitoring }
     *     
     */
    public UserAccountAccessRights.Monitoring getMonitoring() {
        return monitoring;
    }

    /**
     * Sets the value of the monitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountAccessRights.Monitoring }
     *     
     */
    public void setMonitoring(UserAccountAccessRights.Monitoring value) {
        this.monitoring = value;
    }

    /**
     * Gets the value of the customScores property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountAccessRights.CustomScores }
     *     
     */
    public UserAccountAccessRights.CustomScores getCustomScores() {
        return customScores;
    }

    /**
     * Sets the value of the customScores property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountAccessRights.CustomScores }
     *     
     */
    public void setCustomScores(UserAccountAccessRights.CustomScores value) {
        this.customScores = value;
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
     *         &lt;element name="ACE" type="{http://www.creditsafe.com/globaldata/datatypes/administration}AccessControlEntry" maxOccurs="unbounded" minOccurs="0"/>
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
        "ace"
    })
    public static class Browsing {

        @XmlElement(name = "ACE")
        protected List<AccessControlEntry> ace;

        /**
         * Gets the value of the ace property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ace property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccessControlEntry }
         * 
         * 
         */
        public List<AccessControlEntry> getACE() {
            if (ace == null) {
                ace = new ArrayList<AccessControlEntry>();
            }
            return this.ace;
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
     *         &lt;element name="ACE" type="{http://www.creditsafe.com/globaldata/datatypes/administration}AccessControlEntry" maxOccurs="unbounded" minOccurs="0"/>
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
        "ace"
    })
    public static class CustomScores {

        @XmlElement(name = "ACE")
        protected List<AccessControlEntry> ace;

        /**
         * Gets the value of the ace property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ace property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccessControlEntry }
         * 
         * 
         */
        public List<AccessControlEntry> getACE() {
            if (ace == null) {
                ace = new ArrayList<AccessControlEntry>();
            }
            return this.ace;
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
     *         &lt;element name="ACE" type="{http://www.creditsafe.com/globaldata/datatypes/administration}AccessControlEntry" maxOccurs="unbounded" minOccurs="0"/>
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
        "ace"
    })
    public static class Monitoring {

        @XmlElement(name = "ACE")
        protected List<AccessControlEntry> ace;

        /**
         * Gets the value of the ace property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ace property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccessControlEntry }
         * 
         * 
         */
        public List<AccessControlEntry> getACE() {
            if (ace == null) {
                ace = new ArrayList<AccessControlEntry>();
            }
            return this.ace;
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
     *         &lt;element name="ACE" type="{http://www.creditsafe.com/globaldata/datatypes/administration}AccessControlEntry" maxOccurs="unbounded" minOccurs="0"/>
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
        "ace"
    })
    public static class OfflineReports {

        @XmlElement(name = "ACE")
        protected List<AccessControlEntry> ace;

        /**
         * Gets the value of the ace property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ace property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccessControlEntry }
         * 
         * 
         */
        public List<AccessControlEntry> getACE() {
            if (ace == null) {
                ace = new ArrayList<AccessControlEntry>();
            }
            return this.ace;
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
     *         &lt;element name="ACE" type="{http://www.creditsafe.com/globaldata/datatypes/administration}AccessControlEntry" maxOccurs="unbounded" minOccurs="0"/>
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
        "ace"
    })
    public static class OnlineReports {

        @XmlElement(name = "ACE")
        protected List<AccessControlEntry> ace;

        /**
         * Gets the value of the ace property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ace property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccessControlEntry }
         * 
         * 
         */
        public List<AccessControlEntry> getACE() {
            if (ace == null) {
                ace = new ArrayList<AccessControlEntry>();
            }
            return this.ace;
        }

    }

}
