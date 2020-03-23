
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemStatusSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemStatusSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="Overview" type="{http://www.creditsafe.com/globaldata/datatypes/administration}StatusOverview" minOccurs="0"/>
 *         &lt;element name="Subsystems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Subsystem" type="{http://www.creditsafe.com/globaldata/datatypes/administration}SystemStatusSummary.SubsystemReport" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SystemStatusSummary", propOrder = {
    "overview",
    "subsystems"
})
@XmlSeeAlso({
    SystemStatusSummarySubsystemReport.class
})
public class SystemStatusSummary
    extends ServiceResponse
{

    @XmlElement(name = "Overview")
    protected StatusOverview overview;
    @XmlElement(name = "Subsystems")
    protected SystemStatusSummary.Subsystems subsystems;

    /**
     * Gets the value of the overview property.
     * 
     * @return
     *     possible object is
     *     {@link StatusOverview }
     *     
     */
    public StatusOverview getOverview() {
        return overview;
    }

    /**
     * Sets the value of the overview property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusOverview }
     *     
     */
    public void setOverview(StatusOverview value) {
        this.overview = value;
    }

    /**
     * Gets the value of the subsystems property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatusSummary.Subsystems }
     *     
     */
    public SystemStatusSummary.Subsystems getSubsystems() {
        return subsystems;
    }

    /**
     * Sets the value of the subsystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatusSummary.Subsystems }
     *     
     */
    public void setSubsystems(SystemStatusSummary.Subsystems value) {
        this.subsystems = value;
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
     *         &lt;element name="Subsystem" type="{http://www.creditsafe.com/globaldata/datatypes/administration}SystemStatusSummary.SubsystemReport" maxOccurs="unbounded" minOccurs="0"/>
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
        "subsystem"
    })
    public static class Subsystems {

        @XmlElement(name = "Subsystem")
        protected List<SystemStatusSummarySubsystemReport> subsystem;

        /**
         * Gets the value of the subsystem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subsystem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubsystem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SystemStatusSummarySubsystemReport }
         * 
         * 
         */
        public List<SystemStatusSummarySubsystemReport> getSubsystem() {
            if (subsystem == null) {
                subsystem = new ArrayList<SystemStatusSummarySubsystemReport>();
            }
            return this.subsystem;
        }

    }

}
