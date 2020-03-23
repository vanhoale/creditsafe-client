
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Advisor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Advisor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuditorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SolicitorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Advisor", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "auditorName",
    "solicitorName"
})
public class Advisor {

    @XmlElement(name = "AuditorName")
    protected String auditorName;
    @XmlElement(name = "SolicitorName")
    protected String solicitorName;

    /**
     * Gets the value of the auditorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditorName() {
        return auditorName;
    }

    /**
     * Sets the value of the auditorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditorName(String value) {
        this.auditorName = value;
    }

    /**
     * Gets the value of the solicitorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolicitorName() {
        return solicitorName;
    }

    /**
     * Sets the value of the solicitorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolicitorName(String value) {
        this.solicitorName = value;
    }

}
