
package com.creditsafe.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumericValueChangeEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumericValueChangeEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ChangeEvent">
 *       &lt;attribute name="PreviousValue" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="NewValue" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumericValueChangeEvent", namespace = "http://www.creditsafe.com/globaldata/datatypes")
public class NumericValueChangeEvent
    extends ChangeEvent
{

    @XmlAttribute(name = "PreviousValue")
    protected BigDecimal previousValue;
    @XmlAttribute(name = "NewValue")
    protected BigDecimal newValue;

    /**
     * Gets the value of the previousValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreviousValue() {
        return previousValue;
    }

    /**
     * Sets the value of the previousValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreviousValue(BigDecimal value) {
        this.previousValue = value;
    }

    /**
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewValue(BigDecimal value) {
        this.newValue = value;
    }

}
