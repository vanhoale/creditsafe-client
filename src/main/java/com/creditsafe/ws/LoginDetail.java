
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LoginDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessInfo" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ServiceAccessInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginDetail", propOrder = {
    "accessInfo"
})
public class LoginDetail {

    @XmlElement(name = "AccessInfo")
    protected ServiceAccessInfo accessInfo;
    @XmlAttribute(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the accessInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAccessInfo }
     *     
     */
    public ServiceAccessInfo getAccessInfo() {
        return accessInfo;
    }

    /**
     * Sets the value of the accessInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAccessInfo }
     *     
     */
    public void setAccessInfo(ServiceAccessInfo value) {
        this.accessInfo = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
