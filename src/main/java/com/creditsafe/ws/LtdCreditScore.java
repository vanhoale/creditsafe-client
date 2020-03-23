
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LtdCreditScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtdCreditScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentCreditRating" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CreditRating"/>
 *         &lt;element name="CurrentContractLimit" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="PreviousCreditRating" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CreditRating" minOccurs="0"/>
 *         &lt;element name="DateOfLatestRatingChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LtdCreditScore", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "currentCreditRating",
    "currentContractLimit",
    "previousCreditRating",
    "dateOfLatestRatingChange"
})
public class LtdCreditScore {

    @XmlElement(name = "CurrentCreditRating", required = true)
    protected CreditRating currentCreditRating;
    @XmlElement(name = "CurrentContractLimit")
    protected FinancialValueDecimal currentContractLimit;
    @XmlElement(name = "PreviousCreditRating")
    protected CreditRating previousCreditRating;
    @XmlElement(name = "DateOfLatestRatingChange")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfLatestRatingChange;

    /**
     * Gets the value of the currentCreditRating property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRating }
     *     
     */
    public CreditRating getCurrentCreditRating() {
        return currentCreditRating;
    }

    /**
     * Sets the value of the currentCreditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRating }
     *     
     */
    public void setCurrentCreditRating(CreditRating value) {
        this.currentCreditRating = value;
    }

    /**
     * Gets the value of the currentContractLimit property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getCurrentContractLimit() {
        return currentContractLimit;
    }

    /**
     * Sets the value of the currentContractLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setCurrentContractLimit(FinancialValueDecimal value) {
        this.currentContractLimit = value;
    }

    /**
     * Gets the value of the previousCreditRating property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRating }
     *     
     */
    public CreditRating getPreviousCreditRating() {
        return previousCreditRating;
    }

    /**
     * Sets the value of the previousCreditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRating }
     *     
     */
    public void setPreviousCreditRating(CreditRating value) {
        this.previousCreditRating = value;
    }

    /**
     * Gets the value of the dateOfLatestRatingChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfLatestRatingChange() {
        return dateOfLatestRatingChange;
    }

    /**
     * Sets the value of the dateOfLatestRatingChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfLatestRatingChange(XMLGregorianCalendar value) {
        this.dateOfLatestRatingChange = value;
    }

}
