
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LtdCompanyIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtdCompanyIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BasicInformation" type="{http://www.creditsafe.com/globaldata/datatypes/reports}LtdCompanyBasicInformation"/>
 *         &lt;element name="Activities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Activity" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CompanyActivity" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreviousNames" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PreviousName" type="{http://www.creditsafe.com/globaldata/datatypes/reports}PreviousName" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreviousLegalForms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PreviousLegalForm" type="{http://www.creditsafe.com/globaldata/datatypes/reports}PreviousLegalForm" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LtdCompanyIdentification", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "basicInformation",
    "activities",
    "previousNames",
    "previousLegalForms"
})
public class LtdCompanyIdentification {

    @XmlElement(name = "BasicInformation", required = true)
    protected LtdCompanyBasicInformation basicInformation;
    @XmlElement(name = "Activities")
    protected LtdCompanyIdentification.Activities activities;
    @XmlElement(name = "PreviousNames")
    protected LtdCompanyIdentification.PreviousNames previousNames;
    @XmlElement(name = "PreviousLegalForms")
    protected LtdCompanyIdentification.PreviousLegalForms previousLegalForms;

    /**
     * Gets the value of the basicInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LtdCompanyBasicInformation }
     *     
     */
    public LtdCompanyBasicInformation getBasicInformation() {
        return basicInformation;
    }

    /**
     * Sets the value of the basicInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdCompanyBasicInformation }
     *     
     */
    public void setBasicInformation(LtdCompanyBasicInformation value) {
        this.basicInformation = value;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link LtdCompanyIdentification.Activities }
     *     
     */
    public LtdCompanyIdentification.Activities getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdCompanyIdentification.Activities }
     *     
     */
    public void setActivities(LtdCompanyIdentification.Activities value) {
        this.activities = value;
    }

    /**
     * Gets the value of the previousNames property.
     * 
     * @return
     *     possible object is
     *     {@link LtdCompanyIdentification.PreviousNames }
     *     
     */
    public LtdCompanyIdentification.PreviousNames getPreviousNames() {
        return previousNames;
    }

    /**
     * Sets the value of the previousNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdCompanyIdentification.PreviousNames }
     *     
     */
    public void setPreviousNames(LtdCompanyIdentification.PreviousNames value) {
        this.previousNames = value;
    }

    /**
     * Gets the value of the previousLegalForms property.
     * 
     * @return
     *     possible object is
     *     {@link LtdCompanyIdentification.PreviousLegalForms }
     *     
     */
    public LtdCompanyIdentification.PreviousLegalForms getPreviousLegalForms() {
        return previousLegalForms;
    }

    /**
     * Sets the value of the previousLegalForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdCompanyIdentification.PreviousLegalForms }
     *     
     */
    public void setPreviousLegalForms(LtdCompanyIdentification.PreviousLegalForms value) {
        this.previousLegalForms = value;
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
     *         &lt;element name="Activity" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CompanyActivity" maxOccurs="unbounded" minOccurs="0"/>
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
        "activity"
    })
    public static class Activities {

        @XmlElement(name = "Activity", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<CompanyActivity> activity;

        /**
         * Gets the value of the activity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActivity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompanyActivity }
         * 
         * 
         */
        public List<CompanyActivity> getActivity() {
            if (activity == null) {
                activity = new ArrayList<CompanyActivity>();
            }
            return this.activity;
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
     *         &lt;element name="PreviousLegalForm" type="{http://www.creditsafe.com/globaldata/datatypes/reports}PreviousLegalForm" maxOccurs="unbounded" minOccurs="0"/>
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
        "previousLegalForm"
    })
    public static class PreviousLegalForms {

        @XmlElement(name = "PreviousLegalForm", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<PreviousLegalForm> previousLegalForm;

        /**
         * Gets the value of the previousLegalForm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the previousLegalForm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreviousLegalForm().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PreviousLegalForm }
         * 
         * 
         */
        public List<PreviousLegalForm> getPreviousLegalForm() {
            if (previousLegalForm == null) {
                previousLegalForm = new ArrayList<PreviousLegalForm>();
            }
            return this.previousLegalForm;
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
     *         &lt;element name="PreviousName" type="{http://www.creditsafe.com/globaldata/datatypes/reports}PreviousName" maxOccurs="unbounded" minOccurs="0"/>
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
        "previousName"
    })
    public static class PreviousNames {

        @XmlElement(name = "PreviousName", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<PreviousName> previousName;

        /**
         * Gets the value of the previousName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the previousName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreviousName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PreviousName }
         * 
         * 
         */
        public List<PreviousName> getPreviousName() {
            if (previousName == null) {
                previousName = new ArrayList<PreviousName>();
            }
            return this.previousName;
        }

    }

}
