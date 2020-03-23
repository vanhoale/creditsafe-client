
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyChangesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyChangesList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="Companies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Company" type="{http://www.creditsafe.com/globaldata/datatypes}MonitoredCompany" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MoreResults" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NextIterationToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyChangesList", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "companies"
})
public class CompanyChangesList
    extends ServiceResponse
{

    @XmlElement(name = "Companies")
    protected CompanyChangesList.Companies companies;
    @XmlAttribute(name = "MoreResults", required = true)
    protected boolean moreResults;
    @XmlAttribute(name = "NextIterationToken")
    protected String nextIterationToken;

    /**
     * Gets the value of the companies property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyChangesList.Companies }
     *     
     */
    public CompanyChangesList.Companies getCompanies() {
        return companies;
    }

    /**
     * Sets the value of the companies property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyChangesList.Companies }
     *     
     */
    public void setCompanies(CompanyChangesList.Companies value) {
        this.companies = value;
    }

    /**
     * Gets the value of the moreResults property.
     * 
     */
    public boolean isMoreResults() {
        return moreResults;
    }

    /**
     * Sets the value of the moreResults property.
     * 
     */
    public void setMoreResults(boolean value) {
        this.moreResults = value;
    }

    /**
     * Gets the value of the nextIterationToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextIterationToken() {
        return nextIterationToken;
    }

    /**
     * Sets the value of the nextIterationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextIterationToken(String value) {
        this.nextIterationToken = value;
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
     *         &lt;element name="Company" type="{http://www.creditsafe.com/globaldata/datatypes}MonitoredCompany" maxOccurs="unbounded" minOccurs="0"/>
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
        "company"
    })
    public static class Companies {

        @XmlElement(name = "Company", namespace = "http://www.creditsafe.com/globaldata/datatypes")
        protected List<MonitoredCompany> company;

        /**
         * Gets the value of the company property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the company property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCompany().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MonitoredCompany }
         * 
         * 
         */
        public List<MonitoredCompany> getCompany() {
            if (company == null) {
                company = new ArrayList<MonitoredCompany>();
            }
            return this.company;
        }

    }

}
