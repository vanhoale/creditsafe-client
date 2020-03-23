
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LtdDirectors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtdDirectors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentDirectors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Director" type="{http://www.creditsafe.com/globaldata/datatypes/reports}Director" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreviousDirectors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Director" type="{http://www.creditsafe.com/globaldata/datatypes/reports}PreviousDirector" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LtdDirectors", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "currentDirectors",
    "previousDirectors"
})
public class LtdDirectors {

    @XmlElement(name = "CurrentDirectors")
    protected LtdDirectors.CurrentDirectors currentDirectors;
    @XmlElement(name = "PreviousDirectors")
    protected LtdDirectors.PreviousDirectors previousDirectors;

    /**
     * Gets the value of the currentDirectors property.
     * 
     * @return
     *     possible object is
     *     {@link LtdDirectors.CurrentDirectors }
     *     
     */
    public LtdDirectors.CurrentDirectors getCurrentDirectors() {
        return currentDirectors;
    }

    /**
     * Sets the value of the currentDirectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdDirectors.CurrentDirectors }
     *     
     */
    public void setCurrentDirectors(LtdDirectors.CurrentDirectors value) {
        this.currentDirectors = value;
    }

    /**
     * Gets the value of the previousDirectors property.
     * 
     * @return
     *     possible object is
     *     {@link LtdDirectors.PreviousDirectors }
     *     
     */
    public LtdDirectors.PreviousDirectors getPreviousDirectors() {
        return previousDirectors;
    }

    /**
     * Sets the value of the previousDirectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdDirectors.PreviousDirectors }
     *     
     */
    public void setPreviousDirectors(LtdDirectors.PreviousDirectors value) {
        this.previousDirectors = value;
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
     *         &lt;element name="Director" type="{http://www.creditsafe.com/globaldata/datatypes/reports}Director" maxOccurs="unbounded" minOccurs="0"/>
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
        "director"
    })
    public static class CurrentDirectors {

        @XmlElement(name = "Director", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<Director> director;

        /**
         * Gets the value of the director property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the director property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDirector().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Director }
         * 
         * 
         */
        public List<Director> getDirector() {
            if (director == null) {
                director = new ArrayList<Director>();
            }
            return this.director;
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
     *         &lt;element name="Director" type="{http://www.creditsafe.com/globaldata/datatypes/reports}PreviousDirector" maxOccurs="unbounded" minOccurs="0"/>
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
        "director"
    })
    public static class PreviousDirectors {

        @XmlElement(name = "Director", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<PreviousDirector> director;

        /**
         * Gets the value of the director property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the director property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDirector().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PreviousDirector }
         * 
         * 
         */
        public List<PreviousDirector> getDirector() {
            if (director == null) {
                director = new ArrayList<PreviousDirector>();
            }
            return this.director;
        }

    }

}
