
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CurrentPortfolioSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentPortfolioSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="Settings" type="{http://www.creditsafe.com/globaldata/datatypes}PortfolioSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PortfolioId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="CreationDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="LastSettingsChangeDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentPortfolioSettings", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "settings"
})
public class CurrentPortfolioSettings
    extends ServiceResponse
{

    @XmlElement(name = "Settings")
    protected PortfolioSettings settings;
    @XmlAttribute(name = "PortfolioId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long portfolioId;
    @XmlAttribute(name = "CreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlAttribute(name = "LastSettingsChangeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSettingsChangeDate;

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioSettings }
     *     
     */
    public PortfolioSettings getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioSettings }
     *     
     */
    public void setSettings(PortfolioSettings value) {
        this.settings = value;
    }

    /**
     * Gets the value of the portfolioId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortfolioId() {
        return portfolioId;
    }

    /**
     * Sets the value of the portfolioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortfolioId(Long value) {
        this.portfolioId = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the lastSettingsChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSettingsChangeDate() {
        return lastSettingsChangeDate;
    }

    /**
     * Sets the value of the lastSettingsChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSettingsChangeDate(XMLGregorianCalendar value) {
        this.lastSettingsChangeDate = value;
    }

}
