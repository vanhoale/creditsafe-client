
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomScoreStrategiesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomScoreStrategiesList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="Strategy" type="{http://www.creditsafe.com/globaldata/datatypes/administration}CustomScoreStrategy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomScoreStrategiesList", propOrder = {
    "strategy"
})
public class CustomScoreStrategiesList
    extends ServiceResponse
{

    @XmlElement(name = "Strategy")
    protected List<CustomScoreStrategy> strategy;

    /**
     * Gets the value of the strategy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomScoreStrategy }
     * 
     * 
     */
    public List<CustomScoreStrategy> getStrategy() {
        if (strategy == null) {
            strategy = new ArrayList<CustomScoreStrategy>();
        }
        return this.strategy;
    }

}
