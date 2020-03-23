
package com.creditsafe.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeRangeCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeRangeCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ValueBasedCondition">
 *       &lt;attribute name="MinChange" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MaxChange" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeRangeCondition", namespace = "http://www.creditsafe.com/globaldata/datatypes")
public class ChangeRangeCondition
    extends ValueBasedCondition
{

    @XmlAttribute(name = "MinChange")
    protected BigDecimal minChange;
    @XmlAttribute(name = "MaxChange")
    protected BigDecimal maxChange;

    /**
     * Gets the value of the minChange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinChange() {
        return minChange;
    }

    /**
     * Sets the value of the minChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinChange(BigDecimal value) {
        this.minChange = value;
    }

    /**
     * Gets the value of the maxChange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxChange() {
        return maxChange;
    }

    /**
     * Sets the value of the maxChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxChange(BigDecimal value) {
        this.maxChange = value;
    }

}
