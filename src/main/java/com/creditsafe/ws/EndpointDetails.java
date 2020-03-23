
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndpointDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndpointDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentityType" type="{http://www.creditsafe.com/globaldata/datatypes/administration}EndpointIdentityType"/>
 *         &lt;element name="IdentityValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Address" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointDetails", propOrder = {
    "identityType",
    "identityValue"
})
public class EndpointDetails {

    @XmlElement(name = "IdentityType", required = true)
    @XmlSchemaType(name = "string")
    protected EndpointIdentityType identityType;
    @XmlElement(name = "IdentityValue")
    protected String identityValue;
    @XmlAttribute(name = "Address", required = true)
    protected String address;

    /**
     * Gets the value of the identityType property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointIdentityType }
     *     
     */
    public EndpointIdentityType getIdentityType() {
        return identityType;
    }

    /**
     * Sets the value of the identityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointIdentityType }
     *     
     */
    public void setIdentityType(EndpointIdentityType value) {
        this.identityType = value;
    }

    /**
     * Gets the value of the identityValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityValue() {
        return identityValue;
    }

    /**
     * Sets the value of the identityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityValue(String value) {
        this.identityValue = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

}
