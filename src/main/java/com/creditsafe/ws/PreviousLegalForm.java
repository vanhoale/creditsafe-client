
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviousLegalForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviousLegalForm">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes/reports}PreviousValue">
 *       &lt;sequence>
 *         &lt;element name="LegalForm" type="{http://www.creditsafe.com/globaldata/datatypes/reports}LegalForm"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousLegalForm", namespace = "http://www.creditsafe.com/globaldata/datatypes/reports", propOrder = {
    "legalForm"
})
public class PreviousLegalForm
    extends PreviousValue
{

    @XmlElement(name = "LegalForm", required = true)
    protected LegalForm legalForm;

    /**
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link LegalForm }
     *     
     */
    public LegalForm getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalForm }
     *     
     */
    public void setLegalForm(LegalForm value) {
        this.legalForm = value;
    }

}
