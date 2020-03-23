
package com.creditsafe.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Messages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Message" type="{http://www.creditsafe.com/globaldata/datatypes}Message" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponse", namespace = "http://www.creditsafe.com/globaldata/datatypes", propOrder = {
    "messages"
})
@XmlSeeAlso({
    ReportSnapshot.class,
    OfflineReportOrdersList.class,
    SimpleResult.class,
    ReportSnapshotsList.class,
    PortfolioCompanyAdditionResult.class,
    ChangeEventsBasicParamsList.class,
    PortfolioCompanyRemovalResult.class,
    ReportboxContents.class,
    CustomDataSchema.class,
    ReportOrder.class,
    PortfoliosList.class,
    SearchCriteriaSchemaSet.class,
    CurrentPortfolioMonitoringRules.class,
    SupportedChangeEventsList.class,
    CurrentPortfolioSettings.class,
    MonitoredCompaniesList.class,
    PortfolioRemovalResult.class,
    CompanyChangesList.class,
    CompaniesList.class,
    CountriesList.class,
    CustomScoreStrategiesList.class,
    UserAccountActivityLog.class,
    CustomersList.class,
    CurrentDataSourceSettings.class,
    UserAccountsList.class,
    CrmSettingsList.class,
    UserAccountLoginDetails.class,
    AccountManagersList.class,
    CurrentUserAccountAccessRights.class,
    CurrentCustomerSettings.class,
    CurrentUserAccountSettings.class,
    FullSystemReport.class,
    SystemStatusSummary.class,
    CurrentUserPreferences.class,
    DataSourcesReport.class,
    CurrentAccountManagerSettings.class,
    CurrentProviderServicesSettings.class,
    CompanyReportSet.class
})
public abstract class ServiceResponse {

    @XmlElement(name = "Messages")
    protected ServiceResponse.Messages messages;

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResponse.Messages }
     *     
     */
    public ServiceResponse.Messages getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResponse.Messages }
     *     
     */
    public void setMessages(ServiceResponse.Messages value) {
        this.messages = value;
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
     *         &lt;element name="Message" type="{http://www.creditsafe.com/globaldata/datatypes}Message" maxOccurs="unbounded" minOccurs="0"/>
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
        "message"
    })
    public static class Messages {

        @XmlElement(name = "Message", namespace = "http://www.creditsafe.com/globaldata/datatypes")
        protected List<Message> message;

        /**
         * Gets the value of the message property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the message property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Message }
         * 
         * 
         */
        public List<Message> getMessage() {
            if (message == null) {
                message = new ArrayList<Message>();
            }
            return this.message;
        }

    }

}
