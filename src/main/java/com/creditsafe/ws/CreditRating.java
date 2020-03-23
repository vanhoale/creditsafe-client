
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditRating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditRating">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommonValue" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CommonRatingValue" minOccurs="0"/>
 *         &lt;element name="CommonDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditLimit" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_String" minOccurs="0"/>
 *         &lt;element name="ProviderValue" type="{http://www.creditsafe.com/globaldata/datatypes/reports}RangeDescribedValue_String" minOccurs="0"/>
 *         &lt;element name="ProviderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditRating", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "commonValue",
    "commonDescription",
    "creditLimit",
    "providerValue",
    "providerDescription"
})
public class CreditRating {

    @XmlElement(name = "CommonValue")
    @XmlSchemaType(name = "string")
    protected CommonRatingValue commonValue;
    @XmlElement(name = "CommonDescription")
    protected String commonDescription;
    @XmlElement(name = "CreditLimit")
    protected FinancialValueString creditLimit;
    @XmlElement(name = "ProviderValue")
    protected RangeDescribedValueString providerValue;
    @XmlElement(name = "ProviderDescription")
    protected String providerDescription;

    /**
     * Gets the value of the commonValue property.
     * 
     * @return
     *     possible object is
     *     {@link CommonRatingValue }
     *     
     */
    public CommonRatingValue getCommonValue() {
        return commonValue;
    }

    /**
     * Sets the value of the commonValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonRatingValue }
     *     
     */
    public void setCommonValue(CommonRatingValue value) {
        this.commonValue = value;
    }

    /**
     * Gets the value of the commonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonDescription() {
        return commonDescription;
    }

    /**
     * Sets the value of the commonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonDescription(String value) {
        this.commonDescription = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueString }
     *     
     */
    public FinancialValueString getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueString }
     *     
     */
    public void setCreditLimit(FinancialValueString value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the providerValue property.
     * 
     * @return
     *     possible object is
     *     {@link RangeDescribedValueString }
     *     
     */
    public RangeDescribedValueString getProviderValue() {
        return providerValue;
    }

    /**
     * Sets the value of the providerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeDescribedValueString }
     *     
     */
    public void setProviderValue(RangeDescribedValueString value) {
        this.providerValue = value;
    }

    /**
     * Gets the value of the providerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderDescription() {
        return providerDescription;
    }

    /**
     * Sets the value of the providerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderDescription(String value) {
        this.providerDescription = value;
    }

}
