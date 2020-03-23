
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceSheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceSheet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LandAndBuildings" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="PlantAndMachinery" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="OtherTangibleAssets" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TotalTangibleAssets" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="Goodwill" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="OtherIntangibleAssets" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TotalIntangibleAssets" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="Investments" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="LoansToGroup" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="OtherLoans" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="MiscellaneousFixedAssets" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TotalOtherFixedAssets" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TotalFixedAssets" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="RawMaterials" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="WorkInProgress" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="FinishedGoods" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="OtherInventories" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TotalInventories" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TradeReceivables" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="GroupReceivables" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="ReceivablesDueAfter1Year" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="MiscellaneousReceivables" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TotalReceivables" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="Cash" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="OtherCurrentAssets" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TotalCurrentAssets" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TotalAssets" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TradePayables" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="BankLiabilities" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="OtherLoansOrFinance" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="GroupPayables" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="MiscellaneousLiabilities" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TotalCurrentLiabilities" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TradePayablesDueAfter1Year" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="BankLiabilitiesDueAfter1Year" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="OtherLoansOrFinanceDueAfter1Year" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="GroupPayablesDueAfter1Year" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="MiscellaneousLiabilitiesDueAfter1Year" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TotalLongTermLiabilities" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TotalLiabilities" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="CalledUpShareCapital" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="SharePremium" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="RevenueReserves" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="OtherReserves" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="TotalShareholdersEquity" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceSheet", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "landAndBuildings",
    "plantAndMachinery",
    "otherTangibleAssets",
    "totalTangibleAssets",
    "goodwill",
    "otherIntangibleAssets",
    "totalIntangibleAssets",
    "investments",
    "loansToGroup",
    "otherLoans",
    "miscellaneousFixedAssets",
    "totalOtherFixedAssets",
    "totalFixedAssets",
    "rawMaterials",
    "workInProgress",
    "finishedGoods",
    "otherInventories",
    "totalInventories",
    "tradeReceivables",
    "groupReceivables",
    "receivablesDueAfter1Year",
    "miscellaneousReceivables",
    "totalReceivables",
    "cash",
    "otherCurrentAssets",
    "totalCurrentAssets",
    "totalAssets",
    "tradePayables",
    "bankLiabilities",
    "otherLoansOrFinance",
    "groupPayables",
    "miscellaneousLiabilities",
    "totalCurrentLiabilities",
    "tradePayablesDueAfter1Year",
    "bankLiabilitiesDueAfter1Year",
    "otherLoansOrFinanceDueAfter1Year",
    "groupPayablesDueAfter1Year",
    "miscellaneousLiabilitiesDueAfter1Year",
    "totalLongTermLiabilities",
    "totalLiabilities",
    "calledUpShareCapital",
    "sharePremium",
    "revenueReserves",
    "otherReserves",
    "totalShareholdersEquity"
})
public class BalanceSheet {

    @XmlElement(name = "LandAndBuildings")
    protected FinancialValueDecimal landAndBuildings;
    @XmlElement(name = "PlantAndMachinery")
    protected FinancialValueDecimal plantAndMachinery;
    @XmlElement(name = "OtherTangibleAssets")
    protected FinancialValueDecimal otherTangibleAssets;
    @XmlElement(name = "TotalTangibleAssets")
    protected FinancialValueDecimal totalTangibleAssets;
    @XmlElement(name = "Goodwill")
    protected FinancialValueDecimal goodwill;
    @XmlElement(name = "OtherIntangibleAssets")
    protected FinancialValueDecimal otherIntangibleAssets;
    @XmlElement(name = "TotalIntangibleAssets")
    protected FinancialValueDecimal totalIntangibleAssets;
    @XmlElement(name = "Investments")
    protected FinancialValueDecimal investments;
    @XmlElement(name = "LoansToGroup")
    protected FinancialValueDecimal loansToGroup;
    @XmlElement(name = "OtherLoans")
    protected FinancialValueDecimal otherLoans;
    @XmlElement(name = "MiscellaneousFixedAssets")
    protected FinancialValueDecimal miscellaneousFixedAssets;
    @XmlElement(name = "TotalOtherFixedAssets")
    protected FinancialValueDecimal totalOtherFixedAssets;
    @XmlElement(name = "TotalFixedAssets")
    protected FinancialValueDecimal totalFixedAssets;
    @XmlElement(name = "RawMaterials")
    protected FinancialValueDecimal rawMaterials;
    @XmlElement(name = "WorkInProgress")
    protected FinancialValueDecimal workInProgress;
    @XmlElement(name = "FinishedGoods")
    protected FinancialValueDecimal finishedGoods;
    @XmlElement(name = "OtherInventories")
    protected FinancialValueDecimal otherInventories;
    @XmlElement(name = "TotalInventories")
    protected FinancialValueDecimal totalInventories;
    @XmlElement(name = "TradeReceivables")
    protected FinancialValueDecimal tradeReceivables;
    @XmlElement(name = "GroupReceivables")
    protected FinancialValueDecimal groupReceivables;
    @XmlElement(name = "ReceivablesDueAfter1Year")
    protected FinancialValueDecimal receivablesDueAfter1Year;
    @XmlElement(name = "MiscellaneousReceivables")
    protected FinancialValueDecimal miscellaneousReceivables;
    @XmlElement(name = "TotalReceivables")
    protected FinancialValueDecimal totalReceivables;
    @XmlElement(name = "Cash")
    protected FinancialValueDecimal cash;
    @XmlElement(name = "OtherCurrentAssets")
    protected FinancialValueDecimal otherCurrentAssets;
    @XmlElement(name = "TotalCurrentAssets")
    protected FinancialValueDecimal totalCurrentAssets;
    @XmlElement(name = "TotalAssets")
    protected FinancialValueDecimal totalAssets;
    @XmlElement(name = "TradePayables")
    protected FinancialValueDecimal tradePayables;
    @XmlElement(name = "BankLiabilities")
    protected FinancialValueDecimal bankLiabilities;
    @XmlElement(name = "OtherLoansOrFinance")
    protected FinancialValueDecimal otherLoansOrFinance;
    @XmlElement(name = "GroupPayables")
    protected FinancialValueDecimal groupPayables;
    @XmlElement(name = "MiscellaneousLiabilities")
    protected FinancialValueDecimal miscellaneousLiabilities;
    @XmlElement(name = "TotalCurrentLiabilities")
    protected FinancialValueDecimal totalCurrentLiabilities;
    @XmlElement(name = "TradePayablesDueAfter1Year")
    protected FinancialValueDecimal tradePayablesDueAfter1Year;
    @XmlElement(name = "BankLiabilitiesDueAfter1Year")
    protected FinancialValueDecimal bankLiabilitiesDueAfter1Year;
    @XmlElement(name = "OtherLoansOrFinanceDueAfter1Year")
    protected FinancialValueDecimal otherLoansOrFinanceDueAfter1Year;
    @XmlElement(name = "GroupPayablesDueAfter1Year")
    protected FinancialValueDecimal groupPayablesDueAfter1Year;
    @XmlElement(name = "MiscellaneousLiabilitiesDueAfter1Year")
    protected FinancialValueDecimal miscellaneousLiabilitiesDueAfter1Year;
    @XmlElement(name = "TotalLongTermLiabilities")
    protected FinancialValueDecimal totalLongTermLiabilities;
    @XmlElement(name = "TotalLiabilities")
    protected FinancialValueDecimal totalLiabilities;
    @XmlElement(name = "CalledUpShareCapital")
    protected FinancialValueDecimal calledUpShareCapital;
    @XmlElement(name = "SharePremium")
    protected FinancialValueDecimal sharePremium;
    @XmlElement(name = "RevenueReserves")
    protected FinancialValueDecimal revenueReserves;
    @XmlElement(name = "OtherReserves")
    protected FinancialValueDecimal otherReserves;
    @XmlElement(name = "TotalShareholdersEquity")
    protected FinancialValueDecimal totalShareholdersEquity;

    /**
     * Gets the value of the landAndBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getLandAndBuildings() {
        return landAndBuildings;
    }

    /**
     * Sets the value of the landAndBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setLandAndBuildings(FinancialValueDecimal value) {
        this.landAndBuildings = value;
    }

    /**
     * Gets the value of the plantAndMachinery property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getPlantAndMachinery() {
        return plantAndMachinery;
    }

    /**
     * Sets the value of the plantAndMachinery property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setPlantAndMachinery(FinancialValueDecimal value) {
        this.plantAndMachinery = value;
    }

    /**
     * Gets the value of the otherTangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getOtherTangibleAssets() {
        return otherTangibleAssets;
    }

    /**
     * Sets the value of the otherTangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setOtherTangibleAssets(FinancialValueDecimal value) {
        this.otherTangibleAssets = value;
    }

    /**
     * Gets the value of the totalTangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTotalTangibleAssets() {
        return totalTangibleAssets;
    }

    /**
     * Sets the value of the totalTangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTotalTangibleAssets(FinancialValueDecimal value) {
        this.totalTangibleAssets = value;
    }

    /**
     * Gets the value of the goodwill property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getGoodwill() {
        return goodwill;
    }

    /**
     * Sets the value of the goodwill property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setGoodwill(FinancialValueDecimal value) {
        this.goodwill = value;
    }

    /**
     * Gets the value of the otherIntangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getOtherIntangibleAssets() {
        return otherIntangibleAssets;
    }

    /**
     * Sets the value of the otherIntangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setOtherIntangibleAssets(FinancialValueDecimal value) {
        this.otherIntangibleAssets = value;
    }

    /**
     * Gets the value of the totalIntangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTotalIntangibleAssets() {
        return totalIntangibleAssets;
    }

    /**
     * Sets the value of the totalIntangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTotalIntangibleAssets(FinancialValueDecimal value) {
        this.totalIntangibleAssets = value;
    }

    /**
     * Gets the value of the investments property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getInvestments() {
        return investments;
    }

    /**
     * Sets the value of the investments property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setInvestments(FinancialValueDecimal value) {
        this.investments = value;
    }

    /**
     * Gets the value of the loansToGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getLoansToGroup() {
        return loansToGroup;
    }

    /**
     * Sets the value of the loansToGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setLoansToGroup(FinancialValueDecimal value) {
        this.loansToGroup = value;
    }

    /**
     * Gets the value of the otherLoans property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getOtherLoans() {
        return otherLoans;
    }

    /**
     * Sets the value of the otherLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setOtherLoans(FinancialValueDecimal value) {
        this.otherLoans = value;
    }

    /**
     * Gets the value of the miscellaneousFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getMiscellaneousFixedAssets() {
        return miscellaneousFixedAssets;
    }

    /**
     * Sets the value of the miscellaneousFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setMiscellaneousFixedAssets(FinancialValueDecimal value) {
        this.miscellaneousFixedAssets = value;
    }

    /**
     * Gets the value of the totalOtherFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTotalOtherFixedAssets() {
        return totalOtherFixedAssets;
    }

    /**
     * Sets the value of the totalOtherFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTotalOtherFixedAssets(FinancialValueDecimal value) {
        this.totalOtherFixedAssets = value;
    }

    /**
     * Gets the value of the totalFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTotalFixedAssets() {
        return totalFixedAssets;
    }

    /**
     * Sets the value of the totalFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTotalFixedAssets(FinancialValueDecimal value) {
        this.totalFixedAssets = value;
    }

    /**
     * Gets the value of the rawMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getRawMaterials() {
        return rawMaterials;
    }

    /**
     * Sets the value of the rawMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setRawMaterials(FinancialValueDecimal value) {
        this.rawMaterials = value;
    }

    /**
     * Gets the value of the workInProgress property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getWorkInProgress() {
        return workInProgress;
    }

    /**
     * Sets the value of the workInProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setWorkInProgress(FinancialValueDecimal value) {
        this.workInProgress = value;
    }

    /**
     * Gets the value of the finishedGoods property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getFinishedGoods() {
        return finishedGoods;
    }

    /**
     * Sets the value of the finishedGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setFinishedGoods(FinancialValueDecimal value) {
        this.finishedGoods = value;
    }

    /**
     * Gets the value of the otherInventories property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getOtherInventories() {
        return otherInventories;
    }

    /**
     * Sets the value of the otherInventories property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setOtherInventories(FinancialValueDecimal value) {
        this.otherInventories = value;
    }

    /**
     * Gets the value of the totalInventories property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTotalInventories() {
        return totalInventories;
    }

    /**
     * Sets the value of the totalInventories property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTotalInventories(FinancialValueDecimal value) {
        this.totalInventories = value;
    }

    /**
     * Gets the value of the tradeReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTradeReceivables() {
        return tradeReceivables;
    }

    /**
     * Sets the value of the tradeReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTradeReceivables(FinancialValueDecimal value) {
        this.tradeReceivables = value;
    }

    /**
     * Gets the value of the groupReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getGroupReceivables() {
        return groupReceivables;
    }

    /**
     * Sets the value of the groupReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setGroupReceivables(FinancialValueDecimal value) {
        this.groupReceivables = value;
    }

    /**
     * Gets the value of the receivablesDueAfter1Year property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getReceivablesDueAfter1Year() {
        return receivablesDueAfter1Year;
    }

    /**
     * Sets the value of the receivablesDueAfter1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setReceivablesDueAfter1Year(FinancialValueDecimal value) {
        this.receivablesDueAfter1Year = value;
    }

    /**
     * Gets the value of the miscellaneousReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getMiscellaneousReceivables() {
        return miscellaneousReceivables;
    }

    /**
     * Sets the value of the miscellaneousReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setMiscellaneousReceivables(FinancialValueDecimal value) {
        this.miscellaneousReceivables = value;
    }

    /**
     * Gets the value of the totalReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTotalReceivables() {
        return totalReceivables;
    }

    /**
     * Sets the value of the totalReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTotalReceivables(FinancialValueDecimal value) {
        this.totalReceivables = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setCash(FinancialValueDecimal value) {
        this.cash = value;
    }

    /**
     * Gets the value of the otherCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getOtherCurrentAssets() {
        return otherCurrentAssets;
    }

    /**
     * Sets the value of the otherCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setOtherCurrentAssets(FinancialValueDecimal value) {
        this.otherCurrentAssets = value;
    }

    /**
     * Gets the value of the totalCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    /**
     * Sets the value of the totalCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTotalCurrentAssets(FinancialValueDecimal value) {
        this.totalCurrentAssets = value;
    }

    /**
     * Gets the value of the totalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTotalAssets() {
        return totalAssets;
    }

    /**
     * Sets the value of the totalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTotalAssets(FinancialValueDecimal value) {
        this.totalAssets = value;
    }

    /**
     * Gets the value of the tradePayables property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTradePayables() {
        return tradePayables;
    }

    /**
     * Sets the value of the tradePayables property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTradePayables(FinancialValueDecimal value) {
        this.tradePayables = value;
    }

    /**
     * Gets the value of the bankLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getBankLiabilities() {
        return bankLiabilities;
    }

    /**
     * Sets the value of the bankLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setBankLiabilities(FinancialValueDecimal value) {
        this.bankLiabilities = value;
    }

    /**
     * Gets the value of the otherLoansOrFinance property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getOtherLoansOrFinance() {
        return otherLoansOrFinance;
    }

    /**
     * Sets the value of the otherLoansOrFinance property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setOtherLoansOrFinance(FinancialValueDecimal value) {
        this.otherLoansOrFinance = value;
    }

    /**
     * Gets the value of the groupPayables property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getGroupPayables() {
        return groupPayables;
    }

    /**
     * Sets the value of the groupPayables property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setGroupPayables(FinancialValueDecimal value) {
        this.groupPayables = value;
    }

    /**
     * Gets the value of the miscellaneousLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getMiscellaneousLiabilities() {
        return miscellaneousLiabilities;
    }

    /**
     * Sets the value of the miscellaneousLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setMiscellaneousLiabilities(FinancialValueDecimal value) {
        this.miscellaneousLiabilities = value;
    }

    /**
     * Gets the value of the totalCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTotalCurrentLiabilities() {
        return totalCurrentLiabilities;
    }

    /**
     * Sets the value of the totalCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTotalCurrentLiabilities(FinancialValueDecimal value) {
        this.totalCurrentLiabilities = value;
    }

    /**
     * Gets the value of the tradePayablesDueAfter1Year property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTradePayablesDueAfter1Year() {
        return tradePayablesDueAfter1Year;
    }

    /**
     * Sets the value of the tradePayablesDueAfter1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTradePayablesDueAfter1Year(FinancialValueDecimal value) {
        this.tradePayablesDueAfter1Year = value;
    }

    /**
     * Gets the value of the bankLiabilitiesDueAfter1Year property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getBankLiabilitiesDueAfter1Year() {
        return bankLiabilitiesDueAfter1Year;
    }

    /**
     * Sets the value of the bankLiabilitiesDueAfter1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setBankLiabilitiesDueAfter1Year(FinancialValueDecimal value) {
        this.bankLiabilitiesDueAfter1Year = value;
    }

    /**
     * Gets the value of the otherLoansOrFinanceDueAfter1Year property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getOtherLoansOrFinanceDueAfter1Year() {
        return otherLoansOrFinanceDueAfter1Year;
    }

    /**
     * Sets the value of the otherLoansOrFinanceDueAfter1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setOtherLoansOrFinanceDueAfter1Year(FinancialValueDecimal value) {
        this.otherLoansOrFinanceDueAfter1Year = value;
    }

    /**
     * Gets the value of the groupPayablesDueAfter1Year property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getGroupPayablesDueAfter1Year() {
        return groupPayablesDueAfter1Year;
    }

    /**
     * Sets the value of the groupPayablesDueAfter1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setGroupPayablesDueAfter1Year(FinancialValueDecimal value) {
        this.groupPayablesDueAfter1Year = value;
    }

    /**
     * Gets the value of the miscellaneousLiabilitiesDueAfter1Year property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getMiscellaneousLiabilitiesDueAfter1Year() {
        return miscellaneousLiabilitiesDueAfter1Year;
    }

    /**
     * Sets the value of the miscellaneousLiabilitiesDueAfter1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setMiscellaneousLiabilitiesDueAfter1Year(FinancialValueDecimal value) {
        this.miscellaneousLiabilitiesDueAfter1Year = value;
    }

    /**
     * Gets the value of the totalLongTermLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTotalLongTermLiabilities() {
        return totalLongTermLiabilities;
    }

    /**
     * Sets the value of the totalLongTermLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTotalLongTermLiabilities(FinancialValueDecimal value) {
        this.totalLongTermLiabilities = value;
    }

    /**
     * Gets the value of the totalLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTotalLiabilities() {
        return totalLiabilities;
    }

    /**
     * Sets the value of the totalLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTotalLiabilities(FinancialValueDecimal value) {
        this.totalLiabilities = value;
    }

    /**
     * Gets the value of the calledUpShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getCalledUpShareCapital() {
        return calledUpShareCapital;
    }

    /**
     * Sets the value of the calledUpShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setCalledUpShareCapital(FinancialValueDecimal value) {
        this.calledUpShareCapital = value;
    }

    /**
     * Gets the value of the sharePremium property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getSharePremium() {
        return sharePremium;
    }

    /**
     * Sets the value of the sharePremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setSharePremium(FinancialValueDecimal value) {
        this.sharePremium = value;
    }

    /**
     * Gets the value of the revenueReserves property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getRevenueReserves() {
        return revenueReserves;
    }

    /**
     * Sets the value of the revenueReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setRevenueReserves(FinancialValueDecimal value) {
        this.revenueReserves = value;
    }

    /**
     * Gets the value of the otherReserves property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getOtherReserves() {
        return otherReserves;
    }

    /**
     * Sets the value of the otherReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setOtherReserves(FinancialValueDecimal value) {
        this.otherReserves = value;
    }

    /**
     * Gets the value of the totalShareholdersEquity property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getTotalShareholdersEquity() {
        return totalShareholdersEquity;
    }

    /**
     * Sets the value of the totalShareholdersEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setTotalShareholdersEquity(FinancialValueDecimal value) {
        this.totalShareholdersEquity = value;
    }

}
