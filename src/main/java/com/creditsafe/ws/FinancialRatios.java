
package com.creditsafe.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialRatios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialRatios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreTaxProfitMargin" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnCapitalEmployed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnTotalAssetsEmployed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnNetAssetsEmployed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesOrNetWorkingCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StockTurnoverRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebtorDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditorDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LiquidityRatioOrAcidTest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentDebtRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Gearing" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EquityInPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalDebtRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialRatios", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "preTaxProfitMargin",
    "returnOnCapitalEmployed",
    "returnOnTotalAssetsEmployed",
    "returnOnNetAssetsEmployed",
    "salesOrNetWorkingCapital",
    "stockTurnoverRatio",
    "debtorDays",
    "creditorDays",
    "currentRatio",
    "liquidityRatioOrAcidTest",
    "currentDebtRatio",
    "gearing",
    "equityInPercentage",
    "totalDebtRatio"
})
public class FinancialRatios {

    @XmlElement(name = "PreTaxProfitMargin")
    protected BigDecimal preTaxProfitMargin;
    @XmlElement(name = "ReturnOnCapitalEmployed")
    protected BigDecimal returnOnCapitalEmployed;
    @XmlElement(name = "ReturnOnTotalAssetsEmployed")
    protected BigDecimal returnOnTotalAssetsEmployed;
    @XmlElement(name = "ReturnOnNetAssetsEmployed")
    protected BigDecimal returnOnNetAssetsEmployed;
    @XmlElement(name = "SalesOrNetWorkingCapital")
    protected BigDecimal salesOrNetWorkingCapital;
    @XmlElement(name = "StockTurnoverRatio")
    protected BigDecimal stockTurnoverRatio;
    @XmlElement(name = "DebtorDays")
    protected BigDecimal debtorDays;
    @XmlElement(name = "CreditorDays")
    protected BigDecimal creditorDays;
    @XmlElement(name = "CurrentRatio")
    protected BigDecimal currentRatio;
    @XmlElement(name = "LiquidityRatioOrAcidTest")
    protected BigDecimal liquidityRatioOrAcidTest;
    @XmlElement(name = "CurrentDebtRatio")
    protected BigDecimal currentDebtRatio;
    @XmlElement(name = "Gearing")
    protected BigDecimal gearing;
    @XmlElement(name = "EquityInPercentage")
    protected BigDecimal equityInPercentage;
    @XmlElement(name = "TotalDebtRatio")
    protected BigDecimal totalDebtRatio;

    /**
     * Gets the value of the preTaxProfitMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreTaxProfitMargin() {
        return preTaxProfitMargin;
    }

    /**
     * Sets the value of the preTaxProfitMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreTaxProfitMargin(BigDecimal value) {
        this.preTaxProfitMargin = value;
    }

    /**
     * Gets the value of the returnOnCapitalEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnCapitalEmployed() {
        return returnOnCapitalEmployed;
    }

    /**
     * Sets the value of the returnOnCapitalEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnCapitalEmployed(BigDecimal value) {
        this.returnOnCapitalEmployed = value;
    }

    /**
     * Gets the value of the returnOnTotalAssetsEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnTotalAssetsEmployed() {
        return returnOnTotalAssetsEmployed;
    }

    /**
     * Sets the value of the returnOnTotalAssetsEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnTotalAssetsEmployed(BigDecimal value) {
        this.returnOnTotalAssetsEmployed = value;
    }

    /**
     * Gets the value of the returnOnNetAssetsEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnNetAssetsEmployed() {
        return returnOnNetAssetsEmployed;
    }

    /**
     * Sets the value of the returnOnNetAssetsEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnNetAssetsEmployed(BigDecimal value) {
        this.returnOnNetAssetsEmployed = value;
    }

    /**
     * Gets the value of the salesOrNetWorkingCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesOrNetWorkingCapital() {
        return salesOrNetWorkingCapital;
    }

    /**
     * Sets the value of the salesOrNetWorkingCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesOrNetWorkingCapital(BigDecimal value) {
        this.salesOrNetWorkingCapital = value;
    }

    /**
     * Gets the value of the stockTurnoverRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStockTurnoverRatio() {
        return stockTurnoverRatio;
    }

    /**
     * Sets the value of the stockTurnoverRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStockTurnoverRatio(BigDecimal value) {
        this.stockTurnoverRatio = value;
    }

    /**
     * Gets the value of the debtorDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtorDays() {
        return debtorDays;
    }

    /**
     * Sets the value of the debtorDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebtorDays(BigDecimal value) {
        this.debtorDays = value;
    }

    /**
     * Gets the value of the creditorDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditorDays() {
        return creditorDays;
    }

    /**
     * Sets the value of the creditorDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditorDays(BigDecimal value) {
        this.creditorDays = value;
    }

    /**
     * Gets the value of the currentRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentRatio() {
        return currentRatio;
    }

    /**
     * Sets the value of the currentRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentRatio(BigDecimal value) {
        this.currentRatio = value;
    }

    /**
     * Gets the value of the liquidityRatioOrAcidTest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLiquidityRatioOrAcidTest() {
        return liquidityRatioOrAcidTest;
    }

    /**
     * Sets the value of the liquidityRatioOrAcidTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLiquidityRatioOrAcidTest(BigDecimal value) {
        this.liquidityRatioOrAcidTest = value;
    }

    /**
     * Gets the value of the currentDebtRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentDebtRatio() {
        return currentDebtRatio;
    }

    /**
     * Sets the value of the currentDebtRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentDebtRatio(BigDecimal value) {
        this.currentDebtRatio = value;
    }

    /**
     * Gets the value of the gearing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGearing() {
        return gearing;
    }

    /**
     * Sets the value of the gearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGearing(BigDecimal value) {
        this.gearing = value;
    }

    /**
     * Gets the value of the equityInPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquityInPercentage() {
        return equityInPercentage;
    }

    /**
     * Sets the value of the equityInPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquityInPercentage(BigDecimal value) {
        this.equityInPercentage = value;
    }

    /**
     * Gets the value of the totalDebtRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDebtRatio() {
        return totalDebtRatio;
    }

    /**
     * Sets the value of the totalDebtRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDebtRatio(BigDecimal value) {
        this.totalDebtRatio = value;
    }

}
