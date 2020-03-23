
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LtdContactInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtdContactInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MainAddress" type="{http://www.creditsafe.com/globaldata/datatypes/reports}StreetAddressWithTelephone"/>
 *         &lt;element name="OtherAddresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherAddress" type="{http://www.creditsafe.com/globaldata/datatypes/reports}StreetAddressWithTelephone" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreviousAddresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PreviousAddress" type="{http://www.creditsafe.com/globaldata/datatypes/reports}StreetAddress" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmailAddresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Websites" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LtdContactInformation", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "mainAddress",
    "otherAddresses",
    "previousAddresses",
    "emailAddresses",
    "websites"
})
public class LtdContactInformation {

    @XmlElement(name = "MainAddress", required = true)
    protected StreetAddressWithTelephone mainAddress;
    @XmlElement(name = "OtherAddresses")
    protected LtdContactInformation.OtherAddresses otherAddresses;
    @XmlElement(name = "PreviousAddresses")
    protected LtdContactInformation.PreviousAddresses previousAddresses;
    @XmlElement(name = "EmailAddresses")
    protected LtdContactInformation.EmailAddresses emailAddresses;
    @XmlElement(name = "Websites")
    protected LtdContactInformation.Websites websites;

    /**
     * Gets the value of the mainAddress property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddressWithTelephone }
     *     
     */
    public StreetAddressWithTelephone getMainAddress() {
        return mainAddress;
    }

    /**
     * Sets the value of the mainAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddressWithTelephone }
     *     
     */
    public void setMainAddress(StreetAddressWithTelephone value) {
        this.mainAddress = value;
    }

    /**
     * Gets the value of the otherAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link LtdContactInformation.OtherAddresses }
     *     
     */
    public LtdContactInformation.OtherAddresses getOtherAddresses() {
        return otherAddresses;
    }

    /**
     * Sets the value of the otherAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdContactInformation.OtherAddresses }
     *     
     */
    public void setOtherAddresses(LtdContactInformation.OtherAddresses value) {
        this.otherAddresses = value;
    }

    /**
     * Gets the value of the previousAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link LtdContactInformation.PreviousAddresses }
     *     
     */
    public LtdContactInformation.PreviousAddresses getPreviousAddresses() {
        return previousAddresses;
    }

    /**
     * Sets the value of the previousAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdContactInformation.PreviousAddresses }
     *     
     */
    public void setPreviousAddresses(LtdContactInformation.PreviousAddresses value) {
        this.previousAddresses = value;
    }

    /**
     * Gets the value of the emailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link LtdContactInformation.EmailAddresses }
     *     
     */
    public LtdContactInformation.EmailAddresses getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Sets the value of the emailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdContactInformation.EmailAddresses }
     *     
     */
    public void setEmailAddresses(LtdContactInformation.EmailAddresses value) {
        this.emailAddresses = value;
    }

    /**
     * Gets the value of the websites property.
     * 
     * @return
     *     possible object is
     *     {@link LtdContactInformation.Websites }
     *     
     */
    public LtdContactInformation.Websites getWebsites() {
        return websites;
    }

    /**
     * Sets the value of the websites property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdContactInformation.Websites }
     *     
     */
    public void setWebsites(LtdContactInformation.Websites value) {
        this.websites = value;
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
     *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "emailAddress"
    })
    public static class EmailAddresses {

        @XmlElement(name = "EmailAddress", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<String> emailAddress;

        /**
         * Gets the value of the emailAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmailAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEmailAddress() {
            if (emailAddress == null) {
                emailAddress = new ArrayList<String>();
            }
            return this.emailAddress;
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
     *         &lt;element name="OtherAddress" type="{http://www.creditsafe.com/globaldata/datatypes/reports}StreetAddressWithTelephone" maxOccurs="unbounded" minOccurs="0"/>
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
        "otherAddress"
    })
    public static class OtherAddresses {

        @XmlElement(name = "OtherAddress", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<StreetAddressWithTelephone> otherAddress;

        /**
         * Gets the value of the otherAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StreetAddressWithTelephone }
         * 
         * 
         */
        public List<StreetAddressWithTelephone> getOtherAddress() {
            if (otherAddress == null) {
                otherAddress = new ArrayList<StreetAddressWithTelephone>();
            }
            return this.otherAddress;
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
     *         &lt;element name="PreviousAddress" type="{http://www.creditsafe.com/globaldata/datatypes/reports}StreetAddress" maxOccurs="unbounded" minOccurs="0"/>
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
        "previousAddress"
    })
    public static class PreviousAddresses {

        @XmlElement(name = "PreviousAddress", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<StreetAddress> previousAddress;

        /**
         * Gets the value of the previousAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the previousAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreviousAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StreetAddress }
         * 
         * 
         */
        public List<StreetAddress> getPreviousAddress() {
            if (previousAddress == null) {
                previousAddress = new ArrayList<StreetAddress>();
            }
            return this.previousAddress;
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
     *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "website"
    })
    public static class Websites {

        @XmlElement(name = "Website", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<String> website;

        /**
         * Gets the value of the website property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the website property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWebsite().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getWebsite() {
            if (website == null) {
                website = new ArrayList<String>();
            }
            return this.website;
        }

    }

}
