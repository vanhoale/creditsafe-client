
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfitAndLossFigures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfitAndLossFigures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Revenue" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="OperatingCosts" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="OperatingProfit" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="WagesAndSalaries" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="PensionCosts" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="Depreciation" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="Amortisation" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="FinancialIncome" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="FinancialExpenses" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="ExtraordinaryIncome" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="ExtraordinaryCosts" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="ProfitBeforeTax" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="ProfitAfterTax" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="Dividends" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="MinorityInterests" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="OtherAppropriations" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="RetainedProfit" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfitAndLossFigures", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "revenue",
    "operatingCosts",
    "operatingProfit",
    "wagesAndSalaries",
    "pensionCosts",
    "depreciation",
    "amortisation",
    "financialIncome",
    "financialExpenses",
    "extraordinaryIncome",
    "extraordinaryCosts",
    "profitBeforeTax",
    "tax",
    "profitAfterTax",
    "dividends",
    "minorityInterests",
    "otherAppropriations",
    "retainedProfit"
})
public class ProfitAndLossFigures {

    @XmlElement(name = "Revenue")
    protected FinancialValueDecimal revenue;
    @XmlElement(name = "OperatingCosts")
    protected FinancialValueDecimal operatingCosts;
    @XmlElement(name = "OperatingProfit")
    protected FinancialValueDecimal operatingProfit;
    @XmlElement(name = "WagesAndSalaries")
    protected FinancialValueDecimal wagesAndSalaries;
    @XmlElement(name = "PensionCosts")
    protected FinancialValueDecimal pensionCosts;
    @XmlElement(name = "Depreciation")
    protected FinancialValueDecimal depreciation;
    @XmlElement(name = "Amortisation")
    protected FinancialValueDecimal amortisation;
    @XmlElement(name = "FinancialIncome")
    protected FinancialValueDecimal financialIncome;
    @XmlElement(name = "FinancialExpenses")
    protected FinancialValueDecimal financialExpenses;
    @XmlElement(name = "ExtraordinaryIncome")
    protected FinancialValueDecimal extraordinaryIncome;
    @XmlElement(name = "ExtraordinaryCosts")
    protected FinancialValueDecimal extraordinaryCosts;
    @XmlElement(name = "ProfitBeforeTax")
    protected FinancialValueDecimal profitBeforeTax;
    @XmlElement(name = "Tax")
    protected FinancialValueDecimal tax;
    @XmlElement(name = "ProfitAfterTax")
    protected FinancialValueDecimal profitAfterTax;
    @XmlElement(name = "Dividends")
    protected FinancialValueDecimal dividends;
    @XmlElement(name = "MinorityInterests")
    protected FinancialValueDecimal minorityInterests;
    @XmlElement(name = "OtherAppropriations")
    protected FinancialValueDecimal otherAppropriations;
    @XmlElement(name = "RetainedProfit")
    protected FinancialValueDecimal retainedProfit;

    /**
     * Gets the value of the revenue property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setRevenue(FinancialValueDecimal value) {
        this.revenue = value;
    }

    /**
     * Gets the value of the operatingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getOperatingCosts() {
        return operatingCosts;
    }

    /**
     * Sets the value of the operatingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setOperatingCosts(FinancialValueDecimal value) {
        this.operatingCosts = value;
    }

    /**
     * Gets the value of the operatingProfit property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getOperatingProfit() {
        return operatingProfit;
    }

    /**
     * Sets the value of the operatingProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setOperatingProfit(FinancialValueDecimal value) {
        this.operatingProfit = value;
    }

    /**
     * Gets the value of the wagesAndSalaries property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getWagesAndSalaries() {
        return wagesAndSalaries;
    }

    /**
     * Sets the value of the wagesAndSalaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setWagesAndSalaries(FinancialValueDecimal value) {
        this.wagesAndSalaries = value;
    }

    /**
     * Gets the value of the pensionCosts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getPensionCosts() {
        return pensionCosts;
    }

    /**
     * Sets the value of the pensionCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setPensionCosts(FinancialValueDecimal value) {
        this.pensionCosts = value;
    }

    /**
     * Gets the value of the depreciation property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getDepreciation() {
        return depreciation;
    }

    /**
     * Sets the value of the depreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setDepreciation(FinancialValueDecimal value) {
        this.depreciation = value;
    }

    /**
     * Gets the value of the amortisation property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getAmortisation() {
        return amortisation;
    }

    /**
     * Sets the value of the amortisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setAmortisation(FinancialValueDecimal value) {
        this.amortisation = value;
    }

    /**
     * Gets the value of the financialIncome property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getFinancialIncome() {
        return financialIncome;
    }

    /**
     * Sets the value of the financialIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setFinancialIncome(FinancialValueDecimal value) {
        this.financialIncome = value;
    }

    /**
     * Gets the value of the financialExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getFinancialExpenses() {
        return financialExpenses;
    }

    /**
     * Sets the value of the financialExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setFinancialExpenses(FinancialValueDecimal value) {
        this.financialExpenses = value;
    }

    /**
     * Gets the value of the extraordinaryIncome property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getExtraordinaryIncome() {
        return extraordinaryIncome;
    }

    /**
     * Sets the value of the extraordinaryIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setExtraordinaryIncome(FinancialValueDecimal value) {
        this.extraordinaryIncome = value;
    }

    /**
     * Gets the value of the extraordinaryCosts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getExtraordinaryCosts() {
        return extraordinaryCosts;
    }

    /**
     * Sets the value of the extraordinaryCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setExtraordinaryCosts(FinancialValueDecimal value) {
        this.extraordinaryCosts = value;
    }

    /**
     * Gets the value of the profitBeforeTax property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getProfitBeforeTax() {
        return profitBeforeTax;
    }

    /**
     * Sets the value of the profitBeforeTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setProfitBeforeTax(FinancialValueDecimal value) {
        this.profitBeforeTax = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTax(FinancialValueDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the profitAfterTax property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getProfitAfterTax() {
        return profitAfterTax;
    }

    /**
     * Sets the value of the profitAfterTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setProfitAfterTax(FinancialValueDecimal value) {
        this.profitAfterTax = value;
    }

    /**
     * Gets the value of the dividends property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getDividends() {
        return dividends;
    }

    /**
     * Sets the value of the dividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setDividends(FinancialValueDecimal value) {
        this.dividends = value;
    }

    /**
     * Gets the value of the minorityInterests property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getMinorityInterests() {
        return minorityInterests;
    }

    /**
     * Sets the value of the minorityInterests property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setMinorityInterests(FinancialValueDecimal value) {
        this.minorityInterests = value;
    }

    /**
     * Gets the value of the otherAppropriations property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getOtherAppropriations() {
        return otherAppropriations;
    }

    /**
     * Sets the value of the otherAppropriations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setOtherAppropriations(FinancialValueDecimal value) {
        this.otherAppropriations = value;
    }

    /**
     * Gets the value of the retainedProfit property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getRetainedProfit() {
        return retainedProfit;
    }

    /**
     * Sets the value of the retainedProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setRetainedProfit(FinancialValueDecimal value) {
        this.retainedProfit = value;
    }

}
