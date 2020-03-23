
package com.creditsafe.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ListMonitoredCompaniesResult" type="{http://www.creditsafe.com/globaldata/datatypes}MonitoredCompaniesList" minOccurs="0"/>
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
    "listMonitoredCompaniesResult"
})
@XmlRootElement(name = "ListMonitoredCompaniesResponse", namespace = "http://www.creditsafe.com/globaldata/operations")
public class ListMonitoredCompaniesResponse {

    @XmlElementRef(name = "ListMonitoredCompaniesResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<MonitoredCompaniesList> listMonitoredCompaniesResult;

    /**
     * Gets the value of the listMonitoredCompaniesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonitoredCompaniesList }{@code >}
     *     
     */
    public JAXBElement<MonitoredCompaniesList> getListMonitoredCompaniesResult() {
        return listMonitoredCompaniesResult;
    }

    /**
     * Sets the value of the listMonitoredCompaniesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonitoredCompaniesList }{@code >}
     *     
     */
    public void setListMonitoredCompaniesResult(JAXBElement<MonitoredCompaniesList> value) {
        this.listMonitoredCompaniesResult = value;
    }

}
