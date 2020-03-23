
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeEventDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeEventDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ChangeEventBasicParams">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Category" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}ChangeEventCategory" />
 *       &lt;attribute name="CanBeMonitored" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeEventDescription", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "description"
})
public class ChangeEventDescription
    extends ChangeEventBasicParams
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlAttribute(name = "Category", required = true)
    protected ChangeEventCategory category;
    @XmlAttribute(name = "CanBeMonitored", required = true)
    protected boolean canBeMonitored;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeEventCategory }
     *     
     */
    public ChangeEventCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeEventCategory }
     *     
     */
    public void setCategory(ChangeEventCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the canBeMonitored property.
     * 
     */
    public boolean isCanBeMonitored() {
        return canBeMonitored;
    }

    /**
     * Sets the value of the canBeMonitored property.
     * 
     */
    public void setCanBeMonitored(boolean value) {
        this.canBeMonitored = value;
    }

}
