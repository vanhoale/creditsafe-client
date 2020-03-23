
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrmSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrmSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfflineReportsEmailAddresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OfflineReportsEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Entity" type="{http://www.creditsafe.com/globaldata/datatypes/administration}CreditsafeEntity" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmSettings", propOrder = {
    "offlineReportsEmailAddresses"
})
public class CrmSettings {

    @XmlElement(name = "OfflineReportsEmailAddresses")
    protected CrmSettings.OfflineReportsEmailAddresses offlineReportsEmailAddresses;
    @XmlAttribute(name = "Entity")
    protected CreditsafeEntity entity;

    /**
     * Gets the value of the offlineReportsEmailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link CrmSettings.OfflineReportsEmailAddresses }
     *     
     */
    public CrmSettings.OfflineReportsEmailAddresses getOfflineReportsEmailAddresses() {
        return offlineReportsEmailAddresses;
    }

    /**
     * Sets the value of the offlineReportsEmailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrmSettings.OfflineReportsEmailAddresses }
     *     
     */
    public void setOfflineReportsEmailAddresses(CrmSettings.OfflineReportsEmailAddresses value) {
        this.offlineReportsEmailAddresses = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeEntity }
     *     
     */
    public CreditsafeEntity getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeEntity }
     *     
     */
    public void setEntity(CreditsafeEntity value) {
        this.entity = value;
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
     *         &lt;element name="OfflineReportsEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "offlineReportsEmailAddress"
    })
    public static class OfflineReportsEmailAddresses {

        @XmlElement(name = "OfflineReportsEmailAddress")
        protected List<String> offlineReportsEmailAddress;

        /**
         * Gets the value of the offlineReportsEmailAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offlineReportsEmailAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfflineReportsEmailAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOfflineReportsEmailAddress() {
            if (offlineReportsEmailAddress == null) {
                offlineReportsEmailAddress = new ArrayList<String>();
            }
            return this.offlineReportsEmailAddress;
        }

    }

}
