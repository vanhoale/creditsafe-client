
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortfolioRemovalResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortfolioRemovalResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="Portfolios" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Portfolio" type="{http://www.creditsafe.com/globaldata/datatypes}PortfolioActionResult" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PortfolioRemovalResult", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "portfolios"
})
public class PortfolioRemovalResult
    extends ServiceResponse
{

    @XmlElement(name = "Portfolios")
    protected PortfolioRemovalResult.Portfolios portfolios;

    /**
     * Gets the value of the portfolios property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioRemovalResult.Portfolios }
     *     
     */
    public PortfolioRemovalResult.Portfolios getPortfolios() {
        return portfolios;
    }

    /**
     * Sets the value of the portfolios property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioRemovalResult.Portfolios }
     *     
     */
    public void setPortfolios(PortfolioRemovalResult.Portfolios value) {
        this.portfolios = value;
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
     *         &lt;element name="Portfolio" type="{http://www.creditsafe.com/globaldata/datatypes}PortfolioActionResult" maxOccurs="unbounded" minOccurs="0"/>
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
        protected List<PortfolioActionResult> portfolio;

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
         * {@link PortfolioActionResult }
         * 
         * 
         */
        public List<PortfolioActionResult> getPortfolio() {
            if (portfolio == null) {
                portfolio = new ArrayList<PortfolioActionResult>();
            }
            return this.portfolio;
        }

    }

}
