
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsHttpBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsHttpBinding">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes/administration}ServiceBinding">
 *       &lt;sequence>
 *         &lt;element name="MessageClientCredentialType" type="{systemtypes}System.ServiceModel.MessageCredentialType" minOccurs="0"/>
 *         &lt;element name="EstablishSecurityContext" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NegotiateServiceCredential" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TransportClientCredentialType" type="{systemtypes}System.ServiceModel.HttpClientCredentialType" minOccurs="0"/>
 *         &lt;element name="ProxyCredentialType" type="{systemtypes}System.ServiceModel.HttpProxyCredentialType" minOccurs="0"/>
 *         &lt;element name="Realm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "WsHttpBinding", propOrder = {
    "messageClientCredentialType",
    "establishSecurityContext",
    "negotiateServiceCredential",
    "transportClientCredentialType",
    "proxyCredentialType",
    "realm"
})
public class WsHttpBinding
    extends ServiceBinding
{

    @XmlElement(name = "MessageClientCredentialType")
    @XmlSchemaType(name = "string")
    protected SystemServiceModelMessageCredentialType messageClientCredentialType;
    @XmlElement(name = "EstablishSecurityContext")
    protected Boolean establishSecurityContext;
    @XmlElement(name = "NegotiateServiceCredential")
    protected Boolean negotiateServiceCredential;
    @XmlElement(name = "TransportClientCredentialType")
    @XmlSchemaType(name = "string")
    protected SystemServiceModelHttpClientCredentialType transportClientCredentialType;
    @XmlElement(name = "ProxyCredentialType")
    @XmlSchemaType(name = "string")
    protected SystemServiceModelHttpProxyCredentialType proxyCredentialType;
    @XmlElement(name = "Realm")
    protected String realm;
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
     * Gets the value of the establishSecurityContext property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstablishSecurityContext() {
        return establishSecurityContext;
    }

    /**
     * Sets the value of the establishSecurityContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstablishSecurityContext(Boolean value) {
        this.establishSecurityContext = value;
    }

    /**
     * Gets the value of the negotiateServiceCredential property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegotiateServiceCredential() {
        return negotiateServiceCredential;
    }

    /**
     * Sets the value of the negotiateServiceCredential property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiateServiceCredential(Boolean value) {
        this.negotiateServiceCredential = value;
    }

    /**
     * Gets the value of the transportClientCredentialType property.
     * 
     * @return
     *     possible object is
     *     {@link SystemServiceModelHttpClientCredentialType }
     *     
     */
    public SystemServiceModelHttpClientCredentialType getTransportClientCredentialType() {
        return transportClientCredentialType;
    }

    /**
     * Sets the value of the transportClientCredentialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemServiceModelHttpClientCredentialType }
     *     
     */
    public void setTransportClientCredentialType(SystemServiceModelHttpClientCredentialType value) {
        this.transportClientCredentialType = value;
    }

    /**
     * Gets the value of the proxyCredentialType property.
     * 
     * @return
     *     possible object is
     *     {@link SystemServiceModelHttpProxyCredentialType }
     *     
     */
    public SystemServiceModelHttpProxyCredentialType getProxyCredentialType() {
        return proxyCredentialType;
    }

    /**
     * Sets the value of the proxyCredentialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemServiceModelHttpProxyCredentialType }
     *     
     */
    public void setProxyCredentialType(SystemServiceModelHttpProxyCredentialType value) {
        this.proxyCredentialType = value;
    }

    /**
     * Gets the value of the realm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealm() {
        return realm;
    }

    /**
     * Sets the value of the realm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealm(String value) {
        this.realm = value;
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
