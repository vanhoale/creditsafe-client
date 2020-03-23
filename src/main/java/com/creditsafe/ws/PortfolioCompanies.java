
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortfolioCompanies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortfolioCompanies">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}PortfolioRelatedData">
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioCompanies", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "companies"
})
public class PortfolioCompanies
    extends PortfolioRelatedData
{

    @XmlElement(name = "Companies")
    protected PortfolioCompanies.Companies companies;

    /**
     * Gets the value of the companies property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioCompanies.Companies }
     *     
     */
    public PortfolioCompanies.Companies getCompanies() {
        return companies;
    }

    /**
     * Sets the value of the companies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioCompanies.Companies }
     *     
     */
    public void setCompanies(PortfolioCompanies.Companies value) {
        this.companies = value;
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
