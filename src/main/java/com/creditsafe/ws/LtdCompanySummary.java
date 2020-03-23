
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LtdCompanySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtdCompanySummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Country" type="{http://www.creditsafe.com/globaldata/datatypes}CountryCode"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainActivity" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CompanyActivity" minOccurs="0"/>
 *         &lt;element name="CompanyStatus" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CompanyStatusDescription" minOccurs="0"/>
 *         &lt;element name="LatestTurnoverFigure" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="LatestShareholdersEquityFigure" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="CreditRating" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CreditRating"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LtdCompanySummary", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "businessName",
    "country",
    "number",
    "companyRegistrationNumber",
    "mainActivity",
    "companyStatus",
    "latestTurnoverFigure",
    "latestShareholdersEquityFigure",
    "creditRating"
})
public class LtdCompanySummary {

    @XmlElement(name = "BusinessName", required = true)
    protected String businessName;
    @XmlElement(name = "Country", required = true)
    @XmlSchemaType(name = "string")
    protected CountryCode country;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "CompanyRegistrationNumber")
    protected String companyRegistrationNumber;
    @XmlElement(name = "MainActivity")
    protected CompanyActivity mainActivity;
    @XmlElement(name = "CompanyStatus")
    protected CompanyStatusDescription companyStatus;
    @XmlElement(name = "LatestTurnoverFigure")
    protected FinancialValueDecimal latestTurnoverFigure;
    @XmlElement(name = "LatestShareholdersEquityFigure")
    protected FinancialValueDecimal latestShareholdersEquityFigure;
    @XmlElement(name = "CreditRating", required = true)
    protected CreditRating creditRating;

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountry(CountryCode value) {
        this.country = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the companyRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    /**
     * Sets the value of the companyRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegistrationNumber(String value) {
        this.companyRegistrationNumber = value;
    }

    /**
     * Gets the value of the mainActivity property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyActivity }
     *     
     */
    public CompanyActivity getMainActivity() {
        return mainActivity;
    }

    /**
     * Sets the value of the mainActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyActivity }
     *     
     */
    public void setMainActivity(CompanyActivity value) {
        this.mainActivity = value;
    }

    /**
     * Gets the value of the companyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyStatusDescription }
     *     
     */
    public CompanyStatusDescription getCompanyStatus() {
        return companyStatus;
    }

    /**
     * Sets the value of the companyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyStatusDescription }
     *     
     */
    public void setCompanyStatus(CompanyStatusDescription value) {
        this.companyStatus = value;
    }

    /**
     * Gets the value of the latestTurnoverFigure property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getLatestTurnoverFigure() {
        return latestTurnoverFigure;
    }

    /**
     * Sets the value of the latestTurnoverFigure property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setLatestTurnoverFigure(FinancialValueDecimal value) {
        this.latestTurnoverFigure = value;
    }

    /**
     * Gets the value of the latestShareholdersEquityFigure property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getLatestShareholdersEquityFigure() {
        return latestShareholdersEquityFigure;
    }

    /**
     * Sets the value of the latestShareholdersEquityFigure property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setLatestShareholdersEquityFigure(FinancialValueDecimal value) {
        this.latestShareholdersEquityFigure = value;
    }

    /**
     * Gets the value of the creditRating property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRating }
     *     
     */
    public CreditRating getCreditRating() {
        return creditRating;
    }

    /**
     * Sets the value of the creditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRating }
     *     
     */
    public void setCreditRating(CreditRating value) {
        this.creditRating = value;
    }

}
