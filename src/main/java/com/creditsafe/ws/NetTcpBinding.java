
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetTcpBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetTcpBinding">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes/administration}ServiceBinding">
 *       &lt;sequence>
 *         &lt;element name="MessageClientCredentialType" type="{systemtypes}System.ServiceModel.MessageCredentialType" minOccurs="0"/>
 *         &lt;element name="TransportClientCredentialType" type="{systemtypes}System.ServiceModel.TcpClientCredentialType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SecurityMode" use="required" type="{systemtypes}System.ServiceModel.SecurityMode" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetTcpBinding", propOrder = {
    "messageClientCredentialType",
    "transportClientCredentialType"
})
public class NetTcpBinding
    extends ServiceBinding
{

    @XmlElement(name = "MessageClientCredentialType")
    @XmlSchemaType(name = "string")
    protected SystemServiceModelMessageCredentialType messageClientCredentialType;
    @XmlElement(name = "TransportClientCredentialType")
    @XmlSchemaType(name = "string")
    protected SystemServiceModelTcpClientCredentialType transportClientCredentialType;
    @XmlAttribute(name = "SecurityMode", required = true)
    protected SystemServiceModelSecurityMode securityMode;

    /**
     * Gets the value of the messageClientCredentialType property.
     * 
     * @return
     *     possible object is
     *     {@link SystemServiceModelMessageCredentialType }
     *     
     */
    public SystemServiceModelMessageCredentialType getMessageClientCredentialType() {
        return messageClientCredentialType;
    }

    /**
     * Sets the value of the messageClientCredentialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemServiceModelMessageCredentialType }
     *     
     */
    public void setMessageClientCredentialType(SystemServiceModelMessageCredentialType value) {
        this.messageClientCredentialType = value;
    }

    /**
     * Gets the value of the transportClientCredentialType property.
     * 
     * @return
     *     possible object is
     *     {@link SystemServiceModelTcpClientCredentialType }
     *     
     */
    public SystemServiceModelTcpClientCredentialType getTransportClientCredentialType() {
        return transportClientCredentialType;
    }

    /**
     * Sets the value of the transportClientCredentialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemServiceModelTcpClientCredentialType }
     *     
     */
    public void setTransportClientCredentialType(SystemServiceModelTcpClientCredentialType value) {
        this.transportClientCredentialType = value;
    }

    /**
     * Gets the value of the securityMode property.
     * 
     * @return
     *     possible object is
     *     {@link SystemServiceModelSecurityMode }
     *     
     */
    public SystemServiceModelSecurityMode getSecurityMode() {
        return securityMode;
    }

    /**
     * Sets the value of the securityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemServiceModelSecurityMode }
     *     
     */
    public void setSecurityMode(SystemServiceModelSecurityMode value) {
        this.securityMode = value;
    }

}
