
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LtdFinancialStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtdFinancialStatement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialYearReport">
 *       &lt;sequence>
 *         &lt;element name="ProfitAndLoss" type="{http://www.creditsafe.com/globaldata/datatypes/reports}ProfitAndLossFigures" minOccurs="0"/>
 *         &lt;element name="BalanceSheet" type="{http://www.creditsafe.com/globaldata/datatypes/reports}BalanceSheet" minOccurs="0"/>
 *         &lt;element name="OtherFinancials" type="{http://www.creditsafe.com/globaldata/datatypes/reports}OtherFinancials" minOccurs="0"/>
 *         &lt;element name="Ratios" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialRatios" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LtdFinancialStatement", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "profitAndLoss",
    "balanceSheet",
    "otherFinancials",
    "ratios"
})
public class LtdFinancialStatement
    extends FinancialYearReport
{

    @XmlElement(name = "ProfitAndLoss")
    protected ProfitAndLossFigures profitAndLoss;
    @XmlElement(name = "BalanceSheet")
    protected BalanceSheet balanceSheet;
    @XmlElement(name = "OtherFinancials")
    protected OtherFinancials otherFinancials;
    @XmlElement(name = "Ratios")
    protected FinancialRatios ratios;

    /**
     * Gets the value of the profitAndLoss property.
     * 
     * @return
     *     possible object is
     *     {@link ProfitAndLossFigures }
     *     
     */
    public ProfitAndLossFigures getProfitAndLoss() {
        return profitAndLoss;
    }

    /**
     * Sets the value of the profitAndLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfitAndLossFigures }
     *     
     */
    public void setProfitAndLoss(ProfitAndLossFigures value) {
        this.profitAndLoss = value;
    }

    /**
     * Gets the value of the balanceSheet property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheet }
     *     
     */
    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    /**
     * Sets the value of the balanceSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheet }
     *     
     */
    public void setBalanceSheet(BalanceSheet value) {
        this.balanceSheet = value;
    }

    /**
     * Gets the value of the otherFinancials property.
     * 
     * @return
     *     possible object is
     *     {@link OtherFinancials }
     *     
     */
    public OtherFinancials getOtherFinancials() {
        return otherFinancials;
    }

    /**
     * Sets the value of the otherFinancials property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFinancials }
     *     
     */
    public void setOtherFinancials(OtherFinancials value) {
        this.otherFinancials = value;
    }

    /**
     * Gets the value of the ratios property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatios }
     *     
     */
    public FinancialRatios getRatios() {
        return ratios;
    }

    /**
     * Sets the value of the ratios property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatios }
     *     
     */
    public void setRatios(FinancialRatios value) {
        this.ratios = value;
    }

}
