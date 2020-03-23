
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortfolioSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortfolioSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationSettings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Setting" type="{http://www.creditsafe.com/globaldata/datatypes}NotificationSettings" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioSettings", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "notificationSettings"
})
public class PortfolioSettings {

    @XmlElement(name = "NotificationSettings")
    protected PortfolioSettings.NotificationSettings notificationSettings;
    @XmlAttribute(name = "Enabled", required = true)
    protected boolean enabled;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * Gets the value of the notificationSettings property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioSettings.NotificationSettings }
     *     
     */
    public PortfolioSettings.NotificationSettings getNotificationSettings() {
        return notificationSettings;
    }

    /**
     * Sets the value of the notificationSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioSettings.NotificationSettings }
     *     
     */
    public void setNotificationSettings(PortfolioSettings.NotificationSettings value) {
        this.notificationSettings = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Setting" type="{http://www.creditsafe.com/globaldata/datatypes}NotificationSettings" maxOccurs="unbounded" minOccurs="0"/>
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
        "setting"
    })
    public static class NotificationSettings {

        @XmlElement(name = "Setting", namespace = "http://www.creditsafe.com/globaldata/datatypes")
        protected List<com.creditsafe.ws.NotificationSettings> setting;

        /**
         * Gets the value of the setting property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the setting property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSetting().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.creditsafe.ws.NotificationSettings }
         * 
         * 
         */
        public List<com.creditsafe.ws.NotificationSettings> getSetting() {
            if (setting == null) {
                setting = new ArrayList<com.creditsafe.ws.NotificationSettings>();
            }
            return this.setting;
        }

    }

}
