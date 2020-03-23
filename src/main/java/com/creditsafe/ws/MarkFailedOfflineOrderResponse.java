
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
 *         &lt;element name="MarkFailedOfflineOrderResult" type="{http://www.creditsafe.com/globaldata/datatypes}SimpleResult" minOccurs="0"/>
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
    "markFailedOfflineOrderResult"
})
@XmlRootElement(name = "MarkFailedOfflineOrderResponse", namespace = "http://www.creditsafe.com/globaldata/operations/administration")
public class MarkFailedOfflineOrderResponse {

    @XmlElementRef(name = "MarkFailedOfflineOrderResult", namespace = "http://www.creditsafe.com/globaldata/operations/administration", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleResult> markFailedOfflineOrderResult;

    /**
     * Gets the value of the markFailedOfflineOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}
     *     
     */
    public JAXBElement<SimpleResult> getMarkFailedOfflineOrderResult() {
        return markFailedOfflineOrderResult;
    }

    /**
     * Sets the value of the markFailedOfflineOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}
     *     
     */
    public void setMarkFailedOfflineOrderResult(JAXBElement<SimpleResult> value) {
        this.markFailedOfflineOrderResult = value;
    }

}
