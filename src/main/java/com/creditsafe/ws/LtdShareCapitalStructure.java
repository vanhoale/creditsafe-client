
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LtdShareCapitalStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtdShareCapitalStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NominalShareCapital" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="IssuedShareCapital" type="{http://www.creditsafe.com/globaldata/datatypes/reports}FinancialValue_Decimal" minOccurs="0"/>
 *         &lt;element name="ShareHolders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShareHolder" type="{http://www.creditsafe.com/globaldata/datatypes/reports}ShareHolder" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LtdShareCapitalStructure", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "nominalShareCapital",
    "issuedShareCapital",
    "shareHolders"
})
public class LtdShareCapitalStructure {

    @XmlElement(name = "NominalShareCapital")
    protected FinancialValueDecimal nominalShareCapital;
    @XmlElement(name = "IssuedShareCapital")
    protected FinancialValueDecimal issuedShareCapital;
    @XmlElement(name = "ShareHolders")
    protected LtdShareCapitalStructure.ShareHolders shareHolders;

    /**
     * Gets the value of the nominalShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getNominalShareCapital() {
        return nominalShareCapital;
    }

    /**
     * Sets the value of the nominalShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setNominalShareCapital(FinancialValueDecimal value) {
        this.nominalShareCapital = value;
    }

    /**
     * Gets the value of the issuedShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public FinancialValueDecimal getIssuedShareCapital() {
        return issuedShareCapital;
    }

    /**
     * Sets the value of the issuedShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialValueDecimal }
     *     
     */
    public void setIssuedShareCapital(FinancialValueDecimal value) {
        this.issuedShareCapital = value;
    }

    /**
     * Gets the value of the shareHolders property.
     * 
     * @return
     *     possible object is
     *     {@link LtdShareCapitalStructure.ShareHolders }
     *     
     */
    public LtdShareCapitalStructure.ShareHolders getShareHolders() {
        return shareHolders;
    }

    /**
     * Sets the value of the shareHolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdShareCapitalStructure.ShareHolders }
     *     
     */
    public void setShareHolders(LtdShareCapitalStructure.ShareHolders value) {
        this.shareHolders = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ShareHolder" type="{http://www.creditsafe.com/globaldata/datatypes/reports}ShareHolder" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "shareHolder"
    })
    public static class ShareHolders {

        @XmlElement(name = "ShareHolder", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports")
        protected List<ShareHolder> shareHolder;

        /**
         * Gets the value of the shareHolder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shareHolder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShareHolder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ShareHolder }
         * 
         * 
         */
        public List<ShareHolder> getShareHolder() {
            if (shareHolder == null) {
                shareHolder = new ArrayList<ShareHolder>();
            }
            return this.shareHolder;
        }

    }

}
