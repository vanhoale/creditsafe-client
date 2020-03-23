
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonitoredCompaniesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoredCompaniesList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="Portfolios" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Portfolio" type="{http://www.creditsafe.com/globaldata/datatypes}PortfolioCompanies" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Results" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="FirstPosition" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="TotalResults" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="PageSize" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredCompaniesList", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "portfolios"
})
public class MonitoredCompaniesList
    extends ServiceResponse
{

    @XmlElement(name = "Portfolios")
    protected MonitoredCompaniesList.Portfolios portfolios;
    @XmlAttribute(name = "Results", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long results;
    @XmlAttribute(name = "FirstPosition", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long firstPosition;
    @XmlAttribute(name = "TotalResults", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long totalResults;
    @XmlAttribute(name = "PageSize", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long pageSize;

    /**
     * Gets the value of the portfolios property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredCompaniesList.Portfolios }
     *     
     */
    public MonitoredCompaniesList.Portfolios getPortfolios() {
        return portfolios;
    }

    /**
     * Sets the value of the portfolios property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredCompaniesList.Portfolios }
     *     
     */
    public void setPortfolios(MonitoredCompaniesList.Portfolios value) {
        this.portfolios = value;
    }

    /**
     * Gets the value of the results property.
     * 
     */
    public long getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     */
    public void setResults(long value) {
        this.results = value;
    }

    /**
     * Gets the value of the firstPosition property.
     * 
     */
    public long getFirstPosition() {
        return firstPosition;
    }

    /**
     * Sets the value of the firstPosition property.
     * 
     */
    public void setFirstPosition(long value) {
        this.firstPosition = value;
    }

    /**
     * Gets the value of the totalResults property.
     * 
     */
    public long getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     * 
     */
    public void setTotalResults(long value) {
        this.totalResults = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public long getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(long value) {
        this.pageSize = value;
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
     *         &lt;element name="Portfolio" type="{http://www.creditsafe.com/globaldata/datatypes}PortfolioCompanies" maxOccurs="unbounded" minOccurs="0"/>
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
        "portfolio"
    })
    public static class Portfolios {

        @XmlElement(name = "Portfolio", namespace = "http://www.creditsafe.com/globaldata/datatypes")
        protected List<PortfolioCompanies> portfolio;

        /**
         * Gets the value of the portfolio property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the portfolio property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPortfolio().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PortfolioCompanies }
         * 
         * 
         */
        public List<PortfolioCompanies> getPortfolio() {
            if (portfolio == null) {
                portfolio = new ArrayList<PortfolioCompanies>();
            }
            return this.portfolio;
        }

    }

}
