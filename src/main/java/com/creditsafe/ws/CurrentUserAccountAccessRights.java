
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentUserAccountAccessRights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentUserAccountAccessRights">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="AccessRights" type="{http://www.creditsafe.com/globaldata/datatypes/administration}UserAccountAccessRights" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentUserAccountAccessRights", propOrder = {
    "accessRights"
})
public class CurrentUserAccountAccessRights
    extends ServiceResponse
{

    @XmlElement(name = "AccessRights")
    protected UserAccountAccessRights accessRights;
    @XmlAttribute(name = "Id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long id;

    /**
     * Gets the value of the accessRights property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountAccessRights }
     *     
     */
    public UserAccountAccessRights getAccessRights() {
        return accessRights;
    }

    /**
     * Sets the value of the accessRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountAccessRights }
     *     
     */
    public void setAccessRights(UserAccountAccessRights value) {
        this.accessRights = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

}
