
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceCredentials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCredentials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientCertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceCertificateValidationMode" type="{systemtypes}System.ServiceModel.Security.X509CertificateValidationMode" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCredentials", propOrder = {
    "clientCertificate",
    "serviceCertificateValidationMode",
    "userName",
    "password"
})
public class ServiceCredentials {

    @XmlElement(name = "ClientCertificate")
    protected String clientCertificate;
    @XmlElement(name = "ServiceCertificateValidationMode")
    @XmlSchemaType(name = "string")
    protected SystemServiceModelSecurityX509CertificateValidationMode serviceCertificateValidationMode;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "Password")
    protected String password;

    /**
     * Gets the value of the clientCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCertificate() {
        return clientCertificate;
    }

    /**
     * Sets the value of the clientCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCertificate(String value) {
        this.clientCertificate = value;
    }

    /**
     * Gets the value of the serviceCertificateValidationMode property.
     * 
     * @return
     *     possible object is
     *     {@link SystemServiceModelSecurityX509CertificateValidationMode }
     *     
     */
    public SystemServiceModelSecurityX509CertificateValidationMode getServiceCertificateValidationMode() {
        return serviceCertificateValidationMode;
    }

    /**
     * Sets the value of the serviceCertificateValidationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemServiceModelSecurityX509CertificateValidationMode }
     *     
     */
    public void setServiceCertificateValidationMode(SystemServiceModelSecurityX509CertificateValidationMode value) {
        this.serviceCertificateValidationMode = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
