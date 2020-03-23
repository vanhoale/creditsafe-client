
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
 * <p>Java class for CurrentPortfolioMonitoringRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentPortfolioMonitoringRules">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="Rules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Rule" type="{http://www.creditsafe.com/globaldata/datatypes}MonitoringRule" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PortfolioId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentPortfolioMonitoringRules", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "rules"
})
public class CurrentPortfolioMonitoringRules
    extends ServiceResponse
{

    @XmlElement(name = "Rules")
    protected CurrentPortfolioMonitoringRules.Rules rules;
    @XmlAttribute(name = "PortfolioId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long portfolioId;

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentPortfolioMonitoringRules.Rules }
     *     
     */
    public CurrentPortfolioMonitoringRules.Rules getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentPortfolioMonitoringRules.Rules }
     *     
     */
    public void setRules(CurrentPortfolioMonitoringRules.Rules value) {
        this.rules = value;
    }

    /**
     * Gets the value of the portfolioId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortfolioId() {
        return portfolioId;
    }

    /**
     * Sets the value of the portfolioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortfolioId(Long value) {
        this.portfolioId = value;
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
     *         &lt;element name="Rule" type="{http://www.creditsafe.com/globaldata/datatypes}MonitoringRule" maxOccurs="unbounded" minOccurs="0"/>
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
        "rule"
    })
    public static class Rules {

        @XmlElement(name = "Rule", namespace = "http://www.creditsafe.com/globaldata/datatypes")
        protected List<MonitoringRule> rule;

        /**
         * Gets the value of the rule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MonitoringRule }
         * 
         * 
         */
        public List<MonitoringRule> getRule() {
            if (rule == null) {
                rule = new ArrayList<MonitoringRule>();
            }
            return this.rule;
        }

    }

}
