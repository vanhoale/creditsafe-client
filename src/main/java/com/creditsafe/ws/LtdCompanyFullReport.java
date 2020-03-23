
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for LtdCompanyFullReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtdCompanyFullReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes/reports}CompanyReport">
 *       &lt;sequence>
 *         &lt;element name="CompanySummary" type="{http://www.creditsafe.com/globaldata/datatypes/reports}LtdCompanySummary"/>
 *         &lt;element name="CompanyIdentification" type="{http://www.creditsafe.com/globaldata/datatypes/reports}LtdCompanyIdentification"/>
 *         &lt;element name="CreditScore" type="{http://www.creditsafe.com/globaldata/datatypes/reports}LtdCreditScore"/>
 *         &lt;element name="ContactInformation" type="{http://www.creditsafe.com/globaldata/datatypes/reports}LtdContactInformation"/>
 *         &lt;element name="ShareCapitalStructure" type="{http://www.creditsafe.com/globaldata/datatypes/reports}LtdShareCapitalStructure" minOccurs="0"/>
 *         &lt;element name="Directors" type="{http://www.creditsafe.com/globaldata/datatypes/reports}LtdDirectors" minOccurs="0"/>
 *         &lt;element name="OtherInformation" type="{http://www.creditsafe.com/globaldata/datatypes/reports}LtdOtherInformation" minOccurs="0"/>
 *         &lt;element name="GroupStructure" type="{http://www.creditsafe.com/globaldata/datatypes/reports}LtdGroupStructure" minOccurs="0"/>
 *         &lt;element name="FinancialStatements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FinancialStatement" type="{http://www.creditsafe.com/globaldata/datatypes/reports}LtdFinancialStatement" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;anyAttribute processContents='skip'/>
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
@XmlType(name = "LtdCompanyFullReport", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "companySummary",
    "companyIdentification",
    "creditScore",
    "contactInformation",
    "shareCapitalStructure",
    "directors",
    "otherInformation",
    "groupStructure",
    "financialStatements",
    "additionalInformation"
})
public class LtdCompanyFullReport
    extends CompanyReport
{

    @XmlElement(name = "CompanySummary", required = true)
    protected LtdCompanySummary companySummary;
    @XmlElement(name = "CompanyIdentification", required = true)
    protected LtdCompanyIdentification companyIdentification;
    @XmlElement(name = "CreditScore", required = true)
    protected LtdCreditScore creditScore;
    @XmlElement(name = "ContactInformation", required = true)
    protected LtdContactInformation contactInformation;
    @XmlElement(name = "ShareCapitalStructure")
    protected LtdShareCapitalStructure shareCapitalStructure;
    @XmlElement(name = "Directors")
    protected LtdDirectors directors;
    @XmlElement(name = "OtherInformation")
    protected LtdOtherInformation otherInformation;
    @XmlElement(name = "GroupStructure")
    protected LtdGroupStructure groupStructure;
    @XmlElement(name = "FinancialStatements")
    protected LtdCompanyFullReport.FinancialStatements financialStatements;
    @XmlElement(name = "AdditionalInformation")
    protected LtdCompanyFullReport.AdditionalInformation additionalInformation;

    /**
     * Gets the value of the companySummary property.
     * 
     * @return
     *     possible object is
     *     {@link LtdCompanySummary }
     *     
     */
    public LtdCompanySummary getCompanySummary() {
        return companySummary;
    }

    /**
     * Sets the value of the companySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdCompanySummary }
     *     
     */
    public void setCompanySummary(LtdCompanySummary value) {
        this.companySummary = value;
    }

    /**
     * Gets the value of the companyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LtdCompanyIdentification }
     *     
     */
    public LtdCompanyIdentification getCompanyIdentification() {
        return companyIdentification;
    }

    /**
     * Sets the value of the companyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdCompanyIdentification }
     *     
     */
    public void setCompanyIdentification(LtdCompanyIdentification value) {
        this.companyIdentification = value;
    }

    /**
     * Gets the value of the creditScore property.
     * 
     * @return
     *     possible object is
     *     {@link LtdCreditScore }
     *     
     */
    public LtdCreditScore getCreditScore() {
        return creditScore;
    }

    /**
     * Sets the value of the creditScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdCreditScore }
     *     
     */
    public void setCreditScore(LtdCreditScore value) {
        this.creditScore = value;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LtdContactInformation }
     *     
     */
    public LtdContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdContactInformation }
     *     
     */
    public void setContactInformation(LtdContactInformation value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the shareCapitalStructure property.
     * 
     * @return
     *     possible object is
     *     {@link LtdShareCapitalStructure }
     *     
     */
    public LtdShareCapitalStructure getShareCapitalStructure() {
        return shareCapitalStructure;
    }

    /**
     * Sets the value of the shareCapitalStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdShareCapitalStructure }
     *     
     */
    public void setShareCapitalStructure(LtdShareCapitalStructure value) {
        this.shareCapitalStructure = value;
    }

    /**
     * Gets the value of the directors property.
     * 
     * @return
     *     possible object is
     *     {@link LtdDirectors }
     *     
     */
    public LtdDirectors getDirectors() {
        return directors;
    }

    /**
     * Sets the value of the directors property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdDirectors }
     *     
     */
    public void setDirectors(LtdDirectors value) {
        this.directors = value;
    }

    /**
     * Gets the value of the otherInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LtdOtherInformation }
     *     
     */
    public LtdOtherInformation getOtherInformation() {
        return otherInformation;
    }

    /**
     * Sets the value of the otherInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdOtherInformation }
     *     
     */
    public void setOtherInformation(LtdOtherInformation value) {
        this.otherInformation = value;
    }

    /**
     * Gets the value of the groupStructure property.
     * 
     * @return
     *     possible object is
     *     {@link LtdGroupStructure }
     *     
     */
    public LtdGroupStructure getGroupStructure() {
        return groupStructure;
    }

    /**
     * Sets the value of the groupStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdGroupStructure }
     *     
     */
    public void setGroupStructure(LtdGroupStructure value) {
        this.groupStructure = value;
    }

    /**
     * Gets the value of the financialStatements property.
     * 
     * @return
     *     possible object is
     *     {@link LtdCompanyFullReport.FinancialStatements }
     *     
     */
    public LtdCompanyFullReport.FinancialStatements getFinancialStatements() {
        return financialStatements;
    }

    /**
     * Sets the value of the financialStatements property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdCompanyFullReport.FinancialStatements }
     *     
     */
    public void setFinancialStatements(LtdCompanyFullReport.FinancialStatements value) {
        this.financialStatements = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LtdCompanyFullReport.AdditionalInformation }
     *     
     */
    public LtdCompanyFullReport.AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdCompanyFullReport.AdditionalInformation }
     *     
     */
    public void setAdditionalInformation(LtdCompanyFullReport.AdditionalInformation value) {
        this.additionalInformation = value;
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
     *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;anyAttribute processContents='skip'/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class AdditionalInformation {

        @XmlAnyElement
        protected List<Element> any;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        public List<Element> getAny() {
            if (any == null) {
                any = new ArrayList<Element>();
            }
            return this.any;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
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
     *         &lt;element name="FinancialStatement" type="{http://www.creditsafe.com/globaldata/datatypes/reports}LtdFinancialStatement" maxOccurs="unbounded" minOccurs="0"/>
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
        "financialStatement"
    })
    public static class FinancialStatements {

        @XmlElement(name = "FinancialStatement", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<LtdFinancialStatement> financialStatement;

        /**
         * Gets the value of the financialStatement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the financialStatement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFinancialStatement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LtdFinancialStatement }
         * 
         * 
         */
        public List<LtdFinancialStatement> getFinancialStatement() {
            if (financialStatement == null) {
                financialStatement = new ArrayList<LtdFinancialStatement>();
            }
            return this.financialStatement;
        }

    }

}
