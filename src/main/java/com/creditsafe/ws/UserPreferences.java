
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportboxNotificationsEmailAddresses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportBinaryFormats" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReportBinaryFormat" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialFlags" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SpecialFlag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ChangesCheckDays" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="MaxPortfolios" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="MaxPortfolioCompanies" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="ReportboxRemovalDays" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ContractEndNotification" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="OfflineServiceType" type="{http://www.creditsafe.com/globaldata/datatypes/administration}OrderUrgency" />
 *       &lt;attribute name="ReportBinaryQuota" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPreferences", propOrder = {
    "reportboxNotificationsEmailAddresses",
    "reportBinaryFormats",
    "specialFlags"
})
public class UserPreferences {

    @XmlElement(name = "ReportboxNotificationsEmailAddresses")
    protected String reportboxNotificationsEmailAddresses;
    @XmlElement(name = "ReportBinaryFormats")
    protected UserPreferences.ReportBinaryFormats reportBinaryFormats;
    @XmlElement(name = "SpecialFlags")
    protected UserPreferences.SpecialFlags specialFlags;
    @XmlAttribute(name = "ChangesCheckDays")
    @XmlSchemaType(name = "unsignedInt")
    protected Long changesCheckDays;
    @XmlAttribute(name = "MaxPortfolios")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxPortfolios;
    @XmlAttribute(name = "MaxPortfolioCompanies")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxPortfolioCompanies;
    @XmlAttribute(name = "ReportboxRemovalDays")
    protected Integer reportboxRemovalDays;
    @XmlAttribute(name = "ContractEndNotification")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractEndNotification;
    @XmlAttribute(name = "OfflineServiceType")
    protected OrderUrgency offlineServiceType;
    @XmlAttribute(name = "ReportBinaryQuota")
    @XmlSchemaType(name = "unsignedInt")
    protected Long reportBinaryQuota;

    /**
     * Gets the value of the reportboxNotificationsEmailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportboxNotificationsEmailAddresses() {
        return reportboxNotificationsEmailAddresses;
    }

    /**
     * Sets the value of the reportboxNotificationsEmailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportboxNotificationsEmailAddresses(String value) {
        this.reportboxNotificationsEmailAddresses = value;
    }

    /**
     * Gets the value of the reportBinaryFormats property.
     * 
     * @return
     *     possible object is
     *     {@link UserPreferences.ReportBinaryFormats }
     *     
     */
    public UserPreferences.ReportBinaryFormats getReportBinaryFormats() {
        return reportBinaryFormats;
    }

    /**
     * Sets the value of the reportBinaryFormats property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPreferences.ReportBinaryFormats }
     *     
     */
    public void setReportBinaryFormats(UserPreferences.ReportBinaryFormats value) {
        this.reportBinaryFormats = value;
    }

    /**
     * Gets the value of the specialFlags property.
     * 
     * @return
     *     possible object is
     *     {@link UserPreferences.SpecialFlags }
     *     
     */
    public UserPreferences.SpecialFlags getSpecialFlags() {
        return specialFlags;
    }

    /**
     * Sets the value of the specialFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPreferences.SpecialFlags }
     *     
     */
    public void setSpecialFlags(UserPreferences.SpecialFlags value) {
        this.specialFlags = value;
    }

    /**
     * Gets the value of the changesCheckDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChangesCheckDays() {
        return changesCheckDays;
    }

    /**
     * Sets the value of the changesCheckDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChangesCheckDays(Long value) {
        this.changesCheckDays = value;
    }

    /**
     * Gets the value of the maxPortfolios property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxPortfolios() {
        return maxPortfolios;
    }

    /**
     * Sets the value of the maxPortfolios property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxPortfolios(Long value) {
        this.maxPortfolios = value;
    }

    /**
     * Gets the value of the maxPortfolioCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxPortfolioCompanies() {
        return maxPortfolioCompanies;
    }

    /**
     * Sets the value of the maxPortfolioCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxPortfolioCompanies(Long value) {
        this.maxPortfolioCompanies = value;
    }

    /**
     * Gets the value of the reportboxRemovalDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportboxRemovalDays() {
        return reportboxRemovalDays;
    }

    /**
     * Sets the value of the reportboxRemovalDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportboxRemovalDays(Integer value) {
        this.reportboxRemovalDays = value;
    }

    /**
     * Gets the value of the contractEndNotification property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndNotification() {
        return contractEndNotification;
    }

    /**
     * Sets the value of the contractEndNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEndNotification(XMLGregorianCalendar value) {
        this.contractEndNotification = value;
    }

    /**
     * Gets the value of the offlineServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderUrgency }
     *     
     */
    public OrderUrgency getOfflineServiceType() {
        return offlineServiceType;
    }

    /**
     * Sets the value of the offlineServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderUrgency }
     *     
     */
    public void setOfflineServiceType(OrderUrgency value) {
        this.offlineServiceType = value;
    }

    /**
     * Gets the value of the reportBinaryQuota property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReportBinaryQuota() {
        return reportBinaryQuota;
    }

    /**
     * Sets the value of the reportBinaryQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReportBinaryQuota(Long value) {
        this.reportBinaryQuota = value;
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
     *         &lt;element name="ReportBinaryFormat" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "reportBinaryFormat"
    })
    public static class ReportBinaryFormats {

        @XmlElement(name = "ReportBinaryFormat")
        protected List<String> reportBinaryFormat;

        /**
         * Gets the value of the reportBinaryFormat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportBinaryFormat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportBinaryFormat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getReportBinaryFormat() {
            if (reportBinaryFormat == null) {
                reportBinaryFormat = new ArrayList<String>();
            }
            return this.reportBinaryFormat;
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
     *         &lt;element name="SpecialFlag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "specialFlag"
    })
    public static class SpecialFlags {

        @XmlElement(name = "SpecialFlag")
        protected List<String> specialFlag;

        /**
         * Gets the value of the specialFlag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialFlag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialFlag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSpecialFlag() {
            if (specialFlag == null) {
                specialFlag = new ArrayList<String>();
            }
            return this.specialFlag;
        }

    }

}
