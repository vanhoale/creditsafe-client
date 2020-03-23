
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountManagersList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountManagersList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="AccountManager" type="{http://www.creditsafe.com/globaldata/datatypes/administration}AccountManagerData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagersList", propOrder = {
    "accountManager"
})
public class AccountManagersList
    extends ServiceResponse
{

    @XmlElement(name = "AccountManager")
    protected List<AccountManagerData> accountManager;

    /**
     * Gets the value of the accountManager property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountManager property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountManager().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountManagerData }
     * 
     * 
     */
    public List<AccountManagerData> getAccountManager() {
        if (accountManager == null) {
            accountManager = new ArrayList<AccountManagerData>();
        }
        return this.accountManager;
    }

}
