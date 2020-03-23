
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MonitoredCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoredCompany">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}CompanyData">
 *       &lt;sequence>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Changes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Change" type="{http://www.creditsafe.com/globaldata/datatypes}ChangeEvent" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="HasChanged" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="LastChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredCompany", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "reference",
    "changes"
})
public class MonitoredCompany
    extends CompanyData
{

    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "Changes")
    protected MonitoredCompany.Changes changes;
    @XmlAttribute(name = "HasChanged", required = true)
    protected boolean hasChanged;
    @XmlAttribute(name = "LastChangeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChangeDate;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredCompany.Changes }
     *     
     */
    public MonitoredCompany.Changes getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredCompany.Changes }
     *     
     */
    public void setChanges(MonitoredCompany.Changes value) {
        this.changes = value;
    }

    /**
     * Gets the value of the hasChanged property.
     * 
     */
    public boolean isHasChanged() {
        return hasChanged;
    }

    /**
     * Sets the value of the hasChanged property.
     * 
     */
    public void setHasChanged(boolean value) {
        this.hasChanged = value;
    }

    /**
     * Gets the value of the lastChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * Sets the value of the lastChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangeDate(XMLGregorianCalendar value) {
        this.lastChangeDate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Change" type="{http://www.creditsafe.com/globaldata/datatypes}ChangeEvent" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "change"
    })
    public static class Changes {

        @XmlElement(name = "Change", namespace = "http://www.creditsafe.com/globaldata/datatypes")
        protected List<ChangeEvent> change;

        /**
         * Gets the value of the change property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the change property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeEvent }
         * 
         * 
         */
        public List<ChangeEvent> getChange() {
            if (change == null) {
                change = new ArrayList<ChangeEvent>();
            }
            return this.change;
        }

    }

}
