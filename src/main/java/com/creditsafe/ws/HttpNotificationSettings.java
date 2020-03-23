
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HttpNotificationSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HttpNotificationSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}NotificationSettings">
 *       &lt;sequence>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Url" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PostDataFormat" use="required" type="{http://www.creditsafe.com/globaldata/datatypes}FileFormat" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNotificationSettings", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "login",
    "password"
})
public class HttpNotificationSettings
    extends NotificationSettings
{

    @XmlElement(name = "Login")
    protected String login;
    @XmlElement(name = "Password")
    protected String password;
    @XmlAttribute(name = "Url", required = true)
    protected String url;
    @XmlAttribute(name = "PostDataFormat", required = true)
    protected FileFormat postDataFormat;

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
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

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the postDataFormat property.
     * 
     * @return
     *     possible object is
     *     {@link FileFormat }
     *     
     */
    public FileFormat getPostDataFormat() {
        return postDataFormat;
    }

    /**
     * Sets the value of the postDataFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileFormat }
     *     
     */
    public void setPostDataFormat(FileFormat value) {
        this.postDataFormat = value;
    }

}
