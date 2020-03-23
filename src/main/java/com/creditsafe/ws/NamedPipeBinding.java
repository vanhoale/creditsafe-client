
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamedPipeBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamedPipeBinding">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes/administration}ServiceBinding">
 *       &lt;attribute name="SecurityMode" use="required" type="{systemtypes}System.ServiceModel.NetNamedPipeSecurityMode" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedPipeBinding")
public class NamedPipeBinding
    extends ServiceBinding
{

    @XmlAttribute(name = "SecurityMode", required = true)
    protected SystemServiceModelNetNamedPipeSecurityMode securityMode;

    /**
     * Gets the value of the securityMode property.
     * 
     * @return
     *     possible object is
     *     {@link SystemServiceModelNetNamedPipeSecurityMode }
     *     
     */
    public SystemServiceModelNetNamedPipeSecurityMode getSecurityMode() {
        return securityMode;
    }

    /**
     * Sets the value of the securityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemServiceModelNetNamedPipeSecurityMode }
     *     
     */
    public void setSecurityMode(SystemServiceModelNetNamedPipeSecurityMode value) {
        this.securityMode = value;
    }

}
