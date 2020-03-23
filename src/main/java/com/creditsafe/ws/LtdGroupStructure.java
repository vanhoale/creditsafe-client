
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LtdGroupStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtdGroupStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UltimateParent" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyData" minOccurs="0"/>
 *         &lt;element name="ImmediateParent" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyData" minOccurs="0"/>
 *         &lt;element name="SubsidiaryCompanies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Subsidiary" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyData" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AffiliatedCompanies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffiliatedCompany" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyData" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LtdGroupStructure", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "ultimateParent",
    "immediateParent",
    "subsidiaryCompanies",
    "affiliatedCompanies"
})
public class LtdGroupStructure {

    @XmlElement(name = "UltimateParent")
    protected CompanyData ultimateParent;
    @XmlElement(name = "ImmediateParent")
    protected CompanyData immediateParent;
    @XmlElement(name = "SubsidiaryCompanies")
    protected LtdGroupStructure.SubsidiaryCompanies subsidiaryCompanies;
    @XmlElement(name = "AffiliatedCompanies")
    protected LtdGroupStructure.AffiliatedCompanies affiliatedCompanies;

    /**
     * Gets the value of the ultimateParent property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyData }
     *     
     */
    public CompanyData getUltimateParent() {
        return ultimateParent;
    }

    /**
     * Sets the value of the ultimateParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyData }
     *     
     */
    public void setUltimateParent(CompanyData value) {
        this.ultimateParent = value;
    }

    /**
     * Gets the value of the immediateParent property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyData }
     *     
     */
    public CompanyData getImmediateParent() {
        return immediateParent;
    }

    /**
     * Sets the value of the immediateParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyData }
     *     
     */
    public void setImmediateParent(CompanyData value) {
        this.immediateParent = value;
    }

    /**
     * Gets the value of the subsidiaryCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link LtdGroupStructure.SubsidiaryCompanies }
     *     
     */
    public LtdGroupStructure.SubsidiaryCompanies getSubsidiaryCompanies() {
        return subsidiaryCompanies;
    }

    /**
     * Sets the value of the subsidiaryCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdGroupStructure.SubsidiaryCompanies }
     *     
     */
    public void setSubsidiaryCompanies(LtdGroupStructure.SubsidiaryCompanies value) {
        this.subsidiaryCompanies = value;
    }

    /**
     * Gets the value of the affiliatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link LtdGroupStructure.AffiliatedCompanies }
     *     
     */
    public LtdGroupStructure.AffiliatedCompanies getAffiliatedCompanies() {
        return affiliatedCompanies;
    }

    /**
     * Sets the value of the affiliatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdGroupStructure.AffiliatedCompanies }
     *     
     */
    public void setAffiliatedCompanies(LtdGroupStructure.AffiliatedCompanies value) {
        this.affiliatedCompanies = value;
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
     *         &lt;element name="AffiliatedCompany" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyData" maxOccurs="unbounded" minOccurs="0"/>
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
        "affiliatedCompany"
    })
    public static class AffiliatedCompanies {

        @XmlElement(name = "AffiliatedCompany", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<CompanyData> affiliatedCompany;

        /**
         * Gets the value of the affiliatedCompany property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affiliatedCompany property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffiliatedCompany().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompanyData }
         * 
         * 
         */
        public List<CompanyData> getAffiliatedCompany() {
            if (affiliatedCompany == null) {
                affiliatedCompany = new ArrayList<CompanyData>();
            }
            return this.affiliatedCompany;
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
     *         &lt;element name="Subsidiary" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyData" maxOccurs="unbounded" minOccurs="0"/>
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
        "subsidiary"
    })
    public static class SubsidiaryCompanies {

        @XmlElement(name = "Subsidiary", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<CompanyData> subsidiary;

        /**
         * Gets the value of the subsidiary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subsidiary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubsidiary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompanyData }
         * 
         * 
         */
        public List<CompanyData> getSubsidiary() {
            if (subsidiary == null) {
                subsidiary = new ArrayList<CompanyData>();
            }
            return this.subsidiary;
        }

    }

}
