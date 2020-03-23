
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportSnapshotData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportSnapshotData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ReportboxEntry">
 *       &lt;sequence>
 *         &lt;element name="FailureDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UserId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="Language" type="{http://www.creditsafe.com/globaldata/datatypes}Language" />
 *       &lt;attribute name="FailureReasonCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="FailureReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportSnapshotData", propOrder = {
    "failureDetails"
})
public class ReportSnapshotData
    extends ReportboxEntry
{

    @XmlElement(name = "FailureDetails")
    protected String failureDetails;
    @XmlAttribute(name = "UserId", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long userId;
    @XmlAttribute(name = "Language")
    protected Language language;
    @XmlAttribute(name = "FailureReasonCode")
    @XmlSchemaType(name = "unsignedInt")
    protected Long failureReasonCode;
    @XmlAttribute(name = "FailureReason")
    protected String failureReason;

    /**
     * Gets the value of the failureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureDetails() {
        return failureDetails;
    }

    /**
     * Sets the value of the failureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureDetails(String value) {
        this.failureDetails = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * Gets the value of the failureReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFailureReasonCode() {
        return failureReasonCode;
    }

    /**
     * Sets the value of the failureReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFailureReasonCode(Long value) {
        this.failureReasonCode = value;
    }

    /**
     * Gets the value of the failureReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * Sets the value of the failureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureReason(String value) {
        this.failureReason = value;
    }

}
