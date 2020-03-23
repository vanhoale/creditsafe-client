
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherFinancials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherFinancials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContingentLiabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkingCapital" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="NetWorth" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherFinancials", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "contingentLiabilities",
    "workingCapital",
    "netWorth"
})
public class OtherFinancials {

    @XmlElement(name = "ContingentLiabilities")
    protected String contingentLiabilities;
    @XmlElement(name = "WorkingCapital")
    protected FinancialValueDecimal workingCapital;
    @XmlElement(name = "NetWorth")
    protected FinancialValueDecimal netWorth;

    /**
     * Gets the value of the contingentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContingentLiabilities() {
        return contingentLiabilities;
    }

    /**
     * Sets the value of the contingentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContingentLiabilities(String value) {
        this.contingentLiabilities = value;
    }

    /**
     * Gets the value of the workingCapital property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getWorkingCapital() {
        return workingCapital;
    }

    /**
     * Sets the value of the workingCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setWorkingCapital(FinancialValueDecimal value) {
        this.workingCapital = value;
    }

    /**
     * Gets the value of the netWorth property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getNetWorth() {
        return netWorth;
    }

    /**
     * Sets the value of the netWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setNetWorth(FinancialValueDecimal value) {
        this.netWorth = value;
    }

}
