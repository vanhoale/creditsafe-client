
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareHolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareHolder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes/reports}Entity">
 *       &lt;sequence>
 *         &lt;element name="SharePercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareHolder", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "sharePercent"
})
public class ShareHolder
    extends Entity
{

    @XmlElement(name = "SharePercent")
    protected Double sharePercent;

    /**
     * Gets the value of the sharePercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSharePercent() {
        return sharePercent;
    }

    /**
     * Sets the value of the sharePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSharePercent(Double value) {
        this.sharePercent = value;
    }

}
