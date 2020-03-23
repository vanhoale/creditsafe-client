
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceAccessInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAccessInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ContractVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Binding" type="{http://www.creditsafe.com/globaldata/datatypes/administration}BindingType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAccessInfo")
public class ServiceAccessInfo {

    @XmlAttribute(name = "ContractVersion")
    protected String contractVersion;
    @XmlAttribute(name = "Binding")
    protected BindingType binding;

    /**
     * Gets the value of the contractVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractVersion() {
        return contractVersion;
    }

    /**
     * Sets the value of the contractVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractVersion(String value) {
        this.contractVersion = value;
    }

    /**
     * Gets the value of the binding property.
     * 
     * @return
     *     possible object is
     *     {@link BindingType }
     *     
     */
    public BindingType getBinding() {
        return binding;
    }

    /**
     * Sets the value of the binding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingType }
     *     
     */
    public void setBinding(BindingType value) {
        this.binding = value;
    }

}
