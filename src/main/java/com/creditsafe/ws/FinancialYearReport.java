
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FinancialYearReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialYearReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YearEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumberOfWeeks" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.creditsafe.com/globaldata/datatypes}Currency"/>
 *         &lt;element name="ConsolidatedAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialYearReport", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "yearEndDate",
    "numberOfWeeks",
    "currency",
    "consolidatedAccounts"
})
@XmlSeeAlso({
    LtdFinancialStatement.class
})
public class FinancialYearReport {

    @XmlElement(name = "YearEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar yearEndDate;
    @XmlElement(name = "NumberOfWeeks")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfWeeks;
    @XmlElement(name = "Currency", required = true)
    @XmlSchemaType(name = "string")
    protected Currency currency;
    @XmlElement(name = "ConsolidatedAccounts")
    protected Boolean consolidatedAccounts;

    /**
     * Gets the value of the yearEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearEndDate() {
        return yearEndDate;
    }

    /**
     * Sets the value of the yearEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearEndDate(XMLGregorianCalendar value) {
        this.yearEndDate = value;
    }

    /**
     * Gets the value of the numberOfWeeks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfWeeks() {
        return numberOfWeeks;
    }

    /**
     * Sets the value of the numberOfWeeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfWeeks(Long value) {
        this.numberOfWeeks = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the consolidatedAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsolidatedAccounts() {
        return consolidatedAccounts;
    }

    /**
     * Sets the value of the consolidatedAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidatedAccounts(Boolean value) {
        this.consolidatedAccounts = value;
    }

}
