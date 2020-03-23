
package com.creditsafe.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MonitoringListingSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoringListingSearchCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes/administration}MonitoringActivitySearchCriteria">
 *       &lt;attribute name="ChangedOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ChangedSince" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FirstPosition" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="PageSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringListingSearchCriteria")
public class MonitoringListingSearchCriteria
    extends MonitoringActivitySearchCriteria
{

    @XmlAttribute(name = "ChangedOnly")
    protected Boolean changedOnly;
    @XmlAttribute(name = "ChangedSince")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedSince;
    @XmlAttribute(name = "FirstPosition")
    @XmlSchemaType(name = "unsignedInt")
    protected Long firstPosition;
    @XmlAttribute(name = "PageSize")
    @XmlSchemaType(name = "unsignedInt")
    protected Long pageSize;

    /**
     * Gets the value of the changedOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangedOnly() {
        return changedOnly;
    }

    /**
     * Sets the value of the changedOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangedOnly(Boolean value) {
        this.changedOnly = value;
    }

    /**
     * Gets the value of the changedSince property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedSince() {
        return changedSince;
    }

    /**
     * Sets the value of the changedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedSince(XMLGregorianCalendar value) {
        this.changedSince = value;
    }

    /**
     * Gets the value of the firstPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFirstPosition() {
        return firstPosition;
    }

    /**
     * Sets the value of the firstPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFirstPosition(Long value) {
        this.firstPosition = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPageSize(Long value) {
        this.pageSize = value;
    }

}
