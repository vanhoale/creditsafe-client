
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NotificationSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="NotificationIntervalDays" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="LastNotificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationSettings", namespace = "http://www.creditsafe.com/globaldata/datatypes")
@XmlSeeAlso({
    EmailNotificationSettings.class,
    HttpNotificationSettings.class,
    FtpNotificationSettings.class
})
public abstract class NotificationSettings {

    @XmlAttribute(name = "NotificationIntervalDays")
    @XmlSchemaType(name = "unsignedInt")
    protected Long notificationIntervalDays;
    @XmlAttribute(name = "LastNotificationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastNotificationDate;

    /**
     * Gets the value of the notificationIntervalDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNotificationIntervalDays() {
        return notificationIntervalDays;
    }

    /**
     * Sets the value of the notificationIntervalDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNotificationIntervalDays(Long value) {
        this.notificationIntervalDays = value;
    }

    /**
     * Gets the value of the lastNotificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastNotificationDate() {
        return lastNotificationDate;
    }

    /**
     * Sets the value of the lastNotificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastNotificationDate(XMLGregorianCalendar value) {
        this.lastNotificationDate = value;
    }

}
