
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextValueChangeEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextValueChangeEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ChangeEvent">
 *       &lt;attribute name="PreviousValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NewValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextValueChangeEvent", namespace = "http://www.creditsafe.com/globaldata/datatypes")
public class TextValueChangeEvent
    extends ChangeEvent
{

    @XmlAttribute(name = "PreviousValue")
    protected String previousValue;
    @XmlAttribute(name = "NewValue")
    protected String newValue;

    /**
     * Gets the value of the previousValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousValue() {
        return previousValue;
    }

    /**
     * Sets the value of the previousValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousValue(String value) {
        this.previousValue = value;
    }

    /**
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewValue(String value) {
        this.newValue = value;
    }

}
