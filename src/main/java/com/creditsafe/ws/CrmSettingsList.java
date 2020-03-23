
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrmSettingsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrmSettingsList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="CrmSetting" type="{http://www.creditsafe.com/globaldata/datatypes/administration}CrmSettings" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmSettingsList", propOrder = {
    "crmSetting"
})
public class CrmSettingsList
    extends ServiceResponse
{

    @XmlElement(name = "CrmSetting")
    protected List<CrmSettings> crmSetting;

    /**
     * Gets the value of the crmSetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmSetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrmSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrmSettings }
     * 
     * 
     */
    public List<CrmSettings> getCrmSetting() {
        if (crmSetting == null) {
            crmSetting = new ArrayList<CrmSettings>();
        }
        return this.crmSetting;
    }

}
