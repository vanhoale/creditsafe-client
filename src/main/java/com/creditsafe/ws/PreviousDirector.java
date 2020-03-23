
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PreviousDirector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviousDirector">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes/reports}Director">
 *       &lt;sequence>
 *         &lt;element name="ResignationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousDirector", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "resignationDate"
})
public class PreviousDirector
    extends Director
{

    @XmlElement(name = "ResignationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resignationDate;

    /**
     * Gets the value of the resignationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResignationDate() {
        return resignationDate;
    }

    /**
     * Sets the value of the resignationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResignationDate(XMLGregorianCalendar value) {
        this.resignationDate = value;
    }

}
