
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LtdOtherInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtdOtherInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bankers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Banker" type="{http://www.creditsafe.com/globaldata/datatypes/reports}Banker" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Advisors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Advisor" type="{http://www.creditsafe.com/globaldata/datatypes/reports}Advisor" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmployeesInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EmployeeInformation" type="{http://www.creditsafe.com/globaldata/datatypes/reports}EmployeeInformation" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LtdOtherInformation", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "bankers",
    "advisors",
    "employeesInformation"
})
public class LtdOtherInformation {

    @XmlElement(name = "Bankers")
    protected LtdOtherInformation.Bankers bankers;
    @XmlElement(name = "Advisors")
    protected LtdOtherInformation.Advisors advisors;
    @XmlElement(name = "EmployeesInformation")
    protected LtdOtherInformation.EmployeesInformation employeesInformation;

    /**
     * Gets the value of the bankers property.
     * 
     * @return
     *     possible object is
     *     {@link LtdOtherInformation.Bankers }
     *     
     */
    public LtdOtherInformation.Bankers getBankers() {
        return bankers;
    }

    /**
     * Sets the value of the bankers property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdOtherInformation.Bankers }
     *     
     */
    public void setBankers(LtdOtherInformation.Bankers value) {
        this.bankers = value;
    }

    /**
     * Gets the value of the advisors property.
     * 
     * @return
     *     possible object is
     *     {@link LtdOtherInformation.Advisors }
     *     
     */
    public LtdOtherInformation.Advisors getAdvisors() {
        return advisors;
    }

    /**
     * Sets the value of the advisors property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdOtherInformation.Advisors }
     *     
     */
    public void setAdvisors(LtdOtherInformation.Advisors value) {
        this.advisors = value;
    }

    /**
     * Gets the value of the employeesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LtdOtherInformation.EmployeesInformation }
     *     
     */
    public LtdOtherInformation.EmployeesInformation getEmployeesInformation() {
        return employeesInformation;
    }

    /**
     * Sets the value of the employeesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdOtherInformation.EmployeesInformation }
     *     
     */
    public void setEmployeesInformation(LtdOtherInformation.EmployeesInformation value) {
        this.employeesInformation = value;
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
     *         &lt;element name="Advisor" type="{http://www.creditsafe.com/globaldata/datatypes/reports}Advisor" maxOccurs="unbounded" minOccurs="0"/>
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
        "advisor"
    })
    public static class Advisors {

        @XmlElement(name = "Advisor", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<Advisor> advisor;

        /**
         * Gets the value of the advisor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the advisor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdvisor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Advisor }
         * 
         * 
         */
        public List<Advisor> getAdvisor() {
            if (advisor == null) {
                advisor = new ArrayList<Advisor>();
            }
            return this.advisor;
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
     *         &lt;element name="Banker" type="{http://www.creditsafe.com/globaldata/datatypes/reports}Banker" maxOccurs="unbounded" minOccurs="0"/>
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
        "banker"
    })
    public static class Bankers {

        @XmlElement(name = "Banker", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<Banker> banker;

        /**
         * Gets the value of the banker property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the banker property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBanker().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Banker }
         * 
         * 
         */
        public List<Banker> getBanker() {
            if (banker == null) {
                banker = new ArrayList<Banker>();
            }
            return this.banker;
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
     *         &lt;element name="EmployeeInformation" type="{http://www.creditsafe.com/globaldata/datatypes/reports}EmployeeInformation" maxOccurs="unbounded" minOccurs="0"/>
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
        "employeeInformation"
    })
    public static class EmployeesInformation {

        @XmlElement(name = "EmployeeInformation", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<EmployeeInformation> employeeInformation;

        /**
         * Gets the value of the employeeInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employeeInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployeeInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmployeeInformation }
         * 
         * 
         */
        public List<EmployeeInformation> getEmployeeInformation() {
            if (employeeInformation == null) {
                employeeInformation = new ArrayList<EmployeeInformation>();
            }
            return this.employeeInformation;
        }

    }

}
