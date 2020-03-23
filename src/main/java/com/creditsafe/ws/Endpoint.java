
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for Endpoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Endpoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Binding" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ServiceBinding"/>
 *         &lt;element name="Details" type="{http://www.creditsafe.com/globaldata/datatypes/administration}EndpointDetails"/>
 *         &lt;element name="ClientCredentials" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ServiceCredentials"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://www.creditsafe.com/globaldata/datatypes/administration}EndpointType" />
 *       &lt;attribute name="Timeout" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Endpoint", propOrder = {
    "binding",
    "details",
    "clientCredentials"
})
public class Endpoint {

    @XmlElement(name = "Binding", required = true)
    protected ServiceBinding binding;
    @XmlElement(name = "Details", required = true)
    protected EndpointDetails details;
    @XmlElement(name = "ClientCredentials", required = true)
    protected ServiceCredentials clientCredentials;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Timeout", required = true)
    protected Duration timeout;

    /**
     * Gets the value of the binding property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBinding }
     *     
     */
    public ServiceBinding getBinding() {
        return binding;
    }

    /**
     * Sets the value of the binding property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBinding }
     *     
     */
    public void setBinding(ServiceBinding value) {
        this.binding = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointDetails }
     *     
     */
    public EndpointDetails getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointDetails }
     *     
     */
    public void setDetails(EndpointDetails value) {
        this.details = value;
    }

    /**
     * Gets the value of the clientCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCredentials }
     *     
     */
    public ServiceCredentials getClientCredentials() {
        return clientCredentials;
    }

    /**
     * Sets the value of the clientCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCredentials }
     *     
     */
    public void setClientCredentials(ServiceCredentials value) {
        this.clientCredentials = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeout(Duration value) {
        this.timeout = value;
    }

}
