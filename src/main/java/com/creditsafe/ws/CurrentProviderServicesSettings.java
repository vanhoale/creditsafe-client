
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentProviderServicesSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentProviderServicesSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="Settings" type="{http://www.creditsafe.com/globaldata/datatypes/administration}ProviderServicesSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentProviderServicesSettings", propOrder = {
    "settings"
})
public class CurrentProviderServicesSettings
    extends ServiceResponse
{

    @XmlElement(name = "Settings")
    protected ProviderServicesSettings settings;

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderServicesSettings }
     *     
     */
    public ProviderServicesSettings getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderServicesSettings }
     *     
     */
    public void setSettings(ProviderServicesSettings value) {
        this.settings = value;
    }

}
