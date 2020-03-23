
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonitoringRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoringRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Conditions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Condition" type="{http://www.creditsafe.com/globaldata/datatypes}ValueBasedCondition" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="EventCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MatchAllConditions" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringRule", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "conditions"
})
public class MonitoringRule {

    @XmlElement(name = "Conditions")
    protected MonitoringRule.Conditions conditions;
    @XmlAttribute(name = "Enabled", required = true)
    protected boolean enabled;
    @XmlAttribute(name = "EventCode", required = true)
    protected String eventCode;
    @XmlAttribute(name = "MatchAllConditions", required = true)
    protected boolean matchAllConditions;

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringRule.Conditions }
     *     
     */
    public MonitoringRule.Conditions getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringRule.Conditions }
     *     
     */
    public void setConditions(MonitoringRule.Conditions value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the eventCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCode() {
        return eventCode;
    }

    /**
     * Sets the value of the eventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCode(String value) {
        this.eventCode = value;
    }

    /**
     * Gets the value of the matchAllConditions property.
     * 
     */
    public boolean isMatchAllConditions() {
        return matchAllConditions;
    }

    /**
     * Sets the value of the matchAllConditions property.
     * 
     */
    public void setMatchAllConditions(boolean value) {
        this.matchAllConditions = value;
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
     *         &lt;element name="Condition" type="{http://www.creditsafe.com/globaldata/datatypes}ValueBasedCondition" maxOccurs="unbounded" minOccurs="0"/>
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
        "condition"
    })
    public static class Conditions {

        @XmlElement(name = "Condition", namespace = "http://www.creditsafe.com/globaldata/datatypes")
        protected List<ValueBasedCondition> condition;

        /**
         * Gets the value of the condition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the condition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCondition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ValueBasedCondition }
         * 
         * 
         */
        public List<ValueBasedCondition> getCondition() {
            if (condition == null) {
                condition = new ArrayList<ValueBasedCondition>();
            }
            return this.condition;
        }

    }

}
