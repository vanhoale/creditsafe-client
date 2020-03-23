
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserAccountsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAccountsList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.creditsafe.com/globaldata/datatypes}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="UserAccount" type="{http://www.creditsafe.com/globaldata/datatypes/administration}UserAccountOverview" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAccountsList", propOrder = {
    "userAccount"
})
public class UserAccountsList
    extends ServiceResponse
{

    @XmlElement(name = "UserAccount")
    protected List<UserAccountOverview> userAccount;

    /**
     * Gets the value of the userAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAccountOverview }
     * 
     * 
     */
    public List<UserAccountOverview> getUserAccount() {
        if (userAccount == null) {
            userAccount = new ArrayList<UserAccountOverview>();
        }
        return this.userAccount;
    }

}
