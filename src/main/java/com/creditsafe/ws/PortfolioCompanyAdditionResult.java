
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortfolioCompanyAdditionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortfolioCompanyAdditionResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;attribute name="TotalCompanies" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="SuccessfullyAddedCompanies" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="NewCompanies" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioCompanyAdditionResult", namespace = "http://www.creditsafe.com/globaldata/datatypes")
public class PortfolioCompanyAdditionResult
    extends ServiceResponse
{

    @XmlAttribute(name = "TotalCompanies", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long totalCompanies;
    @XmlAttribute(name = "SuccessfullyAddedCompanies", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long successfullyAddedCompanies;
    @XmlAttribute(name = "NewCompanies", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long newCompanies;

    /**
     * Gets the value of the totalCompanies property.
     * 
     */
    public long getTotalCompanies() {
        return totalCompanies;
    }

    /**
     * Sets the value of the totalCompanies property.
     * 
     */
    public void setTotalCompanies(long value) {
        this.totalCompanies = value;
    }

    /**
     * Gets the value of the successfullyAddedCompanies property.
     * 
     */
    public long getSuccessfullyAddedCompanies() {
        return successfullyAddedCompanies;
    }

    /**
     * Sets the value of the successfullyAddedCompanies property.
     * 
     */
    public void setSuccessfullyAddedCompanies(long value) {
        this.successfullyAddedCompanies = value;
    }

    /**
     * Gets the value of the newCompanies property.
     * 
     */
    public long getNewCompanies() {
        return newCompanies;
    }

    /**
     * Sets the value of the newCompanies property.
     * 
     */
    public void setNewCompanies(long value) {
        this.newCompanies = value;
    }

}
