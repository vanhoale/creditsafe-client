
package com.creditsafe.ws;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.creditsafe.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReportOrder_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "ReportOrder");
    private final static QName _CustomDataSchema_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "CustomDataSchema");
    private final static QName _CountriesListingFilter_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "CountriesListingFilter");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ReportboxListingFilter_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "ReportboxListingFilter");
    private final static QName _PortfolioSettings_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "PortfolioSettings");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _PortfoliosList_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "PortfoliosList");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _SimpleResult_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "SimpleResult");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _SupportedChangeEventsList_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "SupportedChangeEventsList");
    private final static QName _CountriesList_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "CountriesList");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _CompaniesList_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "CompaniesList");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ArrayOfunsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfunsignedInt");
    private final static QName _PortfolioRemovalResult_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "PortfolioRemovalResult");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _ReportboxContents_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "ReportboxContents");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ChangeEventsBasicParamsList_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "ChangeEventsBasicParamsList");
    private final static QName _PortfolioCompanyRemovalResult_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "PortfolioCompanyRemovalResult");
    private final static QName _PortfolioCompanyAdditionResult_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "PortfolioCompanyAdditionResult");
    private final static QName _CompanyReferences_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "CompanyReferences");
    private final static QName _ArrayOfCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Creditsafe.GlobalData", "ArrayOfCountryCode");
    private final static QName _CurrentPortfolioMonitoringRules_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "CurrentPortfolioMonitoringRules");
    private final static QName _CustomData_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "CustomData");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _SearchCriteriaSchemaSet_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "SearchCriteriaSchemaSet");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _ServiceResponse_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "ServiceResponse");
    private final static QName _SearchCriteria_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "SearchCriteria");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _MonitoringRules_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "MonitoringRules");
    private final static QName _MonitoredCompaniesList_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "MonitoredCompaniesList");
    private final static QName _CurrentPortfolioSettings_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "CurrentPortfolioSettings");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _CompanyChangesList_QNAME = new QName("http://www.creditsafe.com/globaldata/datatypes", "CompanyChangesList");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _RetrieveCompanyOnlineReportResponseRetrieveCompanyOnlineReportResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "RetrieveCompanyOnlineReportResult");
    private final static QName _DeliverOfflineCompanyReportReport_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "report");
    private final static QName _DeliverOfflineCompanyReportAdditionalRetrievalData_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "additionalRetrievalData");
    private final static QName _DeliverOfflineCompanyReportOnlineRetrievalCriteria_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "onlineRetrievalCriteria");
    private final static QName _ListRealisedOrdersResponseListRealisedOrdersResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "ListRealisedOrdersResult");
    private final static QName _GetPossibleSearchCriteriaCountries_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "countries");
    private final static QName _RemovePortfoliosResponseRemovePortfoliosResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "RemovePortfoliosResult");
    private final static QName _FindCompaniesChargeReference_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "chargeReference");
    private final static QName _FindCompaniesSearchCriteria_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "searchCriteria");
    private final static QName _FindCompaniesCustomData_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "customData");
    private final static QName _GetSupportedChangeEventsCountry_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "country");
    private final static QName _ChangeCompaniesReferenceStringsCompanies_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "companies");
    private final static QName _ChangeCompaniesReferenceStringsPortfolioIds_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "portfolioIds");
    private final static QName _ImportCompaniesToPortfolioImportFile_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "importFile");
    private final static QName _CreatePortfolioResponseCreatePortfolioResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "CreatePortfolioResult");
    private final static QName _FindCompaniesResponseFindCompaniesResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "FindCompaniesResult");
    private final static QName _GetCountriesResponseGetCountriesResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "GetCountriesResult");
    private final static QName _ListOfflineOrdersResponseListOfflineOrdersResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "ListOfflineOrdersResult");
    private final static QName _GetReportboxContentsFilter_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "filter");
    private final static QName _ChangeCompaniesReferenceStringsResponseChangeCompaniesReferenceStringsResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "ChangeCompaniesReferenceStringsResult");
    private final static QName _GetReportboxReportsIds_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "ids");
    private final static QName _GetReportboxReportsResponseGetReportboxReportsResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "GetReportboxReportsResult");
    private final static QName _RemoveCompaniesFromPortfoliosResponseRemoveCompaniesFromPortfoliosResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "RemoveCompaniesFromPortfoliosResult");
    private final static QName _GetPossibleSearchCriteriaResponseGetPossibleSearchCriteriaResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "GetPossibleSearchCriteriaResult");
    private final static QName _RemoveReportboxReportsResponseRemoveReportboxReportsResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "RemoveReportboxReportsResult");
    private final static QName _SetMonitoringRulesNewRules_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "newRules");
    private final static QName _ListMonitoredCompaniesChangedSince_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "changedSince");
    private final static QName _SetDefaultChangesCheckPeriodResponseSetDefaultChangesCheckPeriodResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "SetDefaultChangesCheckPeriodResult");
    private final static QName _SetMonitoringRulesResponseSetMonitoringRulesResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "SetMonitoringRulesResult");
    private final static QName _GetMonitoringRulesResponseGetMonitoringRulesResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "GetMonitoringRulesResult");
    private final static QName _MarkFailedOfflineOrderResponseMarkFailedOfflineOrderResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "MarkFailedOfflineOrderResult");
    private final static QName _DeliverOfflineCompanyReportResponseDeliverOfflineCompanyReportResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "DeliverOfflineCompanyReportResult");
    private final static QName _AddCompaniesToPortfoliosResponseAddCompaniesToPortfoliosResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "AddCompaniesToPortfoliosResult");
    private final static QName _SetPortfolioSettingsResponseSetPortfolioSettingsResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "SetPortfolioSettingsResult");
    private final static QName _SetPortfolioSettingsNewSettings_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "newSettings");
    private final static QName _TryRetrieveCompanyOnlineReportResponseTryRetrieveCompanyOnlineReportResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "TryRetrieveCompanyOnlineReportResult");
    private final static QName _ListRealisedOrdersOrderNumber_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "orderNumber");
    private final static QName _ListRealisedOrdersCountryCode_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "countryCode");
    private final static QName _ListRealisedOrdersNewerThan_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "newerThan");
    private final static QName _ListRealisedOrdersOlderThan_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "olderThan");
    private final static QName _ListRealisedOrdersSuccessfulDelivery_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "successfulDelivery");
    private final static QName _ListRealisedOrdersUserId_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "userId");
    private final static QName _UpdateStoredReportResponseUpdateStoredReportResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "UpdateStoredReportResult");
    private final static QName _GetSupportedChangeEventsResponseGetSupportedChangeEventsResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "GetSupportedChangeEventsResult");
    private final static QName _ListMonitoredCompaniesResponseListMonitoredCompaniesResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "ListMonitoredCompaniesResult");
    private final static QName _GetReportCustomDataSchemaResponseGetReportCustomDataSchemaResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "GetReportCustomDataSchemaResult");
    private final static QName _OrderCompanyOfflineReportResponseOrderCompanyOfflineReportResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "OrderCompanyOfflineReportResult");
    private final static QName _RemoveCompaniesFromPortfoliosCompanyIds_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "companyIds");
    private final static QName _GetStoredReportResponseGetStoredReportResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "GetStoredReportResult");
    private final static QName _GetReportboxContentsResponseGetReportboxContentsResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "GetReportboxContentsResult");
    private final static QName _CreatePortfolioSettings_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "settings");
    private final static QName _GetPortfoliosResponseGetPortfoliosResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "GetPortfoliosResult");
    private final static QName _MarkFailedOfflineOrderAdditionalData_QNAME = new QName("http://www.creditsafe.com/globaldata/operations/administration", "additionalData");
    private final static QName _RetrieveCompanyOnlineReportCompanyId_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "companyId");
    private final static QName _RetrieveCompanyOnlineReportMonitoringReference_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "monitoringReference");
    private final static QName _GetPortfolioSettingsResponseGetPortfolioSettingsResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "GetPortfolioSettingsResult");
    private final static QName _SetDefaultChangesCheckPeriodDays_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "days");
    private final static QName _ImportCompaniesToPortfolioResponseImportCompaniesToPortfolioResult_QNAME = new QName("http://www.creditsafe.com/globaldata/operations", "ImportCompaniesToPortfolioResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.creditsafe.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LtdOtherInformation }
     * 
     */
    public LtdOtherInformation createLtdOtherInformation() {
        return new LtdOtherInformation();
    }

    /**
     * Create an instance of {@link LtdCompanyIdentification }
     * 
     */
    public LtdCompanyIdentification createLtdCompanyIdentification() {
        return new LtdCompanyIdentification();
    }

    /**
     * Create an instance of {@link LtdDirectors }
     * 
     */
    public LtdDirectors createLtdDirectors() {
        return new LtdDirectors();
    }

    /**
     * Create an instance of {@link LtdContactInformation }
     * 
     */
    public LtdContactInformation createLtdContactInformation() {
        return new LtdContactInformation();
    }

    /**
     * Create an instance of {@link LtdShareCapitalStructure }
     * 
     */
    public LtdShareCapitalStructure createLtdShareCapitalStructure() {
        return new LtdShareCapitalStructure();
    }

    /**
     * Create an instance of {@link CompanyReportSet }
     * 
     */
    public CompanyReportSet createCompanyReportSet() {
        return new CompanyReportSet();
    }

    /**
     * Create an instance of {@link LtdGroupStructure }
     * 
     */
    public LtdGroupStructure createLtdGroupStructure() {
        return new LtdGroupStructure();
    }

    /**
     * Create an instance of {@link LtdCompanyFullReport }
     * 
     */
    public LtdCompanyFullReport createLtdCompanyFullReport() {
        return new LtdCompanyFullReport();
    }

    /**
     * Create an instance of {@link AccessControlEntry }
     * 
     */
    public AccessControlEntry createAccessControlEntry() {
        return new AccessControlEntry();
    }

    /**
     * Create an instance of {@link DataSourcesReport }
     * 
     */
    public DataSourcesReport createDataSourcesReport() {
        return new DataSourcesReport();
    }

    /**
     * Create an instance of {@link SystemStatusSummary }
     * 
     */
    public SystemStatusSummary createSystemStatusSummary() {
        return new SystemStatusSummary();
    }

    /**
     * Create an instance of {@link FullSystemReport }
     * 
     */
    public FullSystemReport createFullSystemReport() {
        return new FullSystemReport();
    }

    /**
     * Create an instance of {@link UserAccountAccessRights }
     * 
     */
    public UserAccountAccessRights createUserAccountAccessRights() {
        return new UserAccountAccessRights();
    }

    /**
     * Create an instance of {@link ActivityLogEntry }
     * 
     */
    public ActivityLogEntry createActivityLogEntry() {
        return new ActivityLogEntry();
    }

    /**
     * Create an instance of {@link ActivityLogReportboxEntry }
     * 
     */
    public ActivityLogReportboxEntry createActivityLogReportboxEntry() {
        return new ActivityLogReportboxEntry();
    }

    /**
     * Create an instance of {@link ActivityLogEntry.CustomData }
     * 
     */
    public ActivityLogEntry.CustomData createActivityLogEntryCustomData() {
        return new ActivityLogEntry.CustomData();
    }

    /**
     * Create an instance of {@link UserPreferences }
     * 
     */
    public UserPreferences createUserPreferences() {
        return new UserPreferences();
    }

    /**
     * Create an instance of {@link ActivityLogBrowsingEntry }
     * 
     */
    public ActivityLogBrowsingEntry createActivityLogBrowsingEntry() {
        return new ActivityLogBrowsingEntry();
    }

    /**
     * Create an instance of {@link ReportPricing }
     * 
     */
    public ReportPricing createReportPricing() {
        return new ReportPricing();
    }

    /**
     * Create an instance of {@link ReportPricing.Offline }
     * 
     */
    public ReportPricing.Offline createReportPricingOffline() {
        return new ReportPricing.Offline();
    }

    /**
     * Create an instance of {@link ReportPricing.Online }
     * 
     */
    public ReportPricing.Online createReportPricingOnline() {
        return new ReportPricing.Online();
    }

    /**
     * Create an instance of {@link ActivityLogMiscellaneousEntry }
     * 
     */
    public ActivityLogMiscellaneousEntry createActivityLogMiscellaneousEntry() {
        return new ActivityLogMiscellaneousEntry();
    }

    /**
     * Create an instance of {@link DataSource }
     * 
     */
    public DataSource createDataSource() {
        return new DataSource();
    }

    /**
     * Create an instance of {@link DataSource.CountriesEnabled }
     * 
     */
    public DataSource.CountriesEnabled createDataSourceCountriesEnabled() {
        return new DataSource.CountriesEnabled();
    }

    /**
     * Create an instance of {@link ActivityLogMonitoringEntry }
     * 
     */
    public ActivityLogMonitoringEntry createActivityLogMonitoringEntry() {
        return new ActivityLogMonitoringEntry();
    }

    /**
     * Create an instance of {@link ActivityLogMonitoringEntry.Portfolios }
     * 
     */
    public ActivityLogMonitoringEntry.Portfolios createActivityLogMonitoringEntryPortfolios() {
        return new ActivityLogMonitoringEntry.Portfolios();
    }

    /**
     * Create an instance of {@link UserAccountLoginDetails }
     * 
     */
    public UserAccountLoginDetails createUserAccountLoginDetails() {
        return new UserAccountLoginDetails();
    }

    /**
     * Create an instance of {@link Log }
     * 
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link Log.Overloads }
     * 
     */
    public Log.Overloads createLogOverloads() {
        return new Log.Overloads();
    }

    /**
     * Create an instance of {@link DataSourceSettings }
     * 
     */
    public DataSourceSettings createDataSourceSettings() {
        return new DataSourceSettings();
    }

    /**
     * Create an instance of {@link UserAccountActivityLog }
     * 
     */
    public UserAccountActivityLog createUserAccountActivityLog() {
        return new UserAccountActivityLog();
    }

    /**
     * Create an instance of {@link CrmSettings }
     * 
     */
    public CrmSettings createCrmSettings() {
        return new CrmSettings();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaValueSchemaString }
     * 
     */
    public SearchCriteriaSchemaValueSchemaString createSearchCriteriaSchemaValueSchemaString() {
        return new SearchCriteriaSchemaValueSchemaString();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaValueSchemaOfficeType }
     * 
     */
    public SearchCriteriaSchemaValueSchemaOfficeType createSearchCriteriaSchemaValueSchemaOfficeType() {
        return new SearchCriteriaSchemaValueSchemaOfficeType();
    }

    /**
     * Create an instance of {@link MonitoredCompany }
     * 
     */
    public MonitoredCompany createMonitoredCompany() {
        return new MonitoredCompany();
    }

    /**
     * Create an instance of {@link ChangeEventBasicParams }
     * 
     */
    public ChangeEventBasicParams createChangeEventBasicParams() {
        return new ChangeEventBasicParams();
    }

    /**
     * Create an instance of {@link MonitoringRule }
     * 
     */
    public MonitoringRule createMonitoringRule() {
        return new MonitoringRule();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaValueSchemaCompanyStatus }
     * 
     */
    public SearchCriteriaSchemaValueSchemaCompanyStatus createSearchCriteriaSchemaValueSchemaCompanyStatus() {
        return new SearchCriteriaSchemaValueSchemaCompanyStatus();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaValueSchemaCompanyType }
     * 
     */
    public SearchCriteriaSchemaValueSchemaCompanyType createSearchCriteriaSchemaValueSchemaCompanyType() {
        return new SearchCriteriaSchemaValueSchemaCompanyType();
    }

    /**
     * Create an instance of {@link PortfolioCompanies }
     * 
     */
    public PortfolioCompanies createPortfolioCompanies() {
        return new PortfolioCompanies();
    }

    /**
     * Create an instance of {@link PortfolioCompanyIds }
     * 
     */
    public PortfolioCompanyIds createPortfolioCompanyIds() {
        return new PortfolioCompanyIds();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaQueryStringSchema }
     * 
     */
    public SearchCriteriaSchemaQueryStringSchema createSearchCriteriaSchemaQueryStringSchema() {
        return new SearchCriteriaSchemaQueryStringSchema();
    }

    /**
     * Create an instance of {@link CustomDataEntrySchema }
     * 
     */
    public CustomDataEntrySchema createCustomDataEntrySchema() {
        return new CustomDataEntrySchema();
    }

    /**
     * Create an instance of {@link EmailNotificationSettings }
     * 
     */
    public EmailNotificationSettings createEmailNotificationSettings() {
        return new EmailNotificationSettings();
    }

    /**
     * Create an instance of {@link com.creditsafe.ws.Company }
     * 
     */
    public com.creditsafe.ws.Company createCompany() {
        return new com.creditsafe.ws.Company();
    }

    /**
     * Create an instance of {@link com.creditsafe.ws.Company.AdditionalData }
     * 
     */
    public com.creditsafe.ws.Company.AdditionalData createCompanyAdditionalData() {
        return new com.creditsafe.ws.Company.AdditionalData();
    }

    /**
     * Create an instance of {@link CountriesList }
     * 
     */
    public CountriesList createCountriesList() {
        return new CountriesList();
    }

    /**
     * Create an instance of {@link CompaniesList }
     * 
     */
    public CompaniesList createCompaniesList() {
        return new CompaniesList();
    }

    /**
     * Create an instance of {@link CompanyChangesList }
     * 
     */
    public CompanyChangesList createCompanyChangesList() {
        return new CompanyChangesList();
    }

    /**
     * Create an instance of {@link PortfolioRemovalResult }
     * 
     */
    public PortfolioRemovalResult createPortfolioRemovalResult() {
        return new PortfolioRemovalResult();
    }

    /**
     * Create an instance of {@link MonitoredCompaniesList }
     * 
     */
    public MonitoredCompaniesList createMonitoredCompaniesList() {
        return new MonitoredCompaniesList();
    }

    /**
     * Create an instance of {@link SupportedChangeEventsList }
     * 
     */
    public SupportedChangeEventsList createSupportedChangeEventsList() {
        return new SupportedChangeEventsList();
    }

    /**
     * Create an instance of {@link CompanyReferences }
     * 
     */
    public CompanyReferences createCompanyReferences() {
        return new CompanyReferences();
    }

    /**
     * Create an instance of {@link CompanyReferences.Companies }
     * 
     */
    public CompanyReferences.Companies createCompanyReferencesCompanies() {
        return new CompanyReferences.Companies();
    }

    /**
     * Create an instance of {@link CurrentPortfolioMonitoringRules }
     * 
     */
    public CurrentPortfolioMonitoringRules createCurrentPortfolioMonitoringRules() {
        return new CurrentPortfolioMonitoringRules();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaSet }
     * 
     */
    public SearchCriteriaSchemaSet createSearchCriteriaSchemaSet() {
        return new SearchCriteriaSchemaSet();
    }

    /**
     * Create an instance of {@link PortfoliosList }
     * 
     */
    public PortfoliosList createPortfoliosList() {
        return new PortfoliosList();
    }

    /**
     * Create an instance of {@link CustomDataSchema }
     * 
     */
    public CustomDataSchema createCustomDataSchema() {
        return new CustomDataSchema();
    }

    /**
     * Create an instance of {@link ReportboxContents }
     * 
     */
    public ReportboxContents createReportboxContents() {
        return new ReportboxContents();
    }

    /**
     * Create an instance of {@link PortfolioCompanyRemovalResult }
     * 
     */
    public PortfolioCompanyRemovalResult createPortfolioCompanyRemovalResult() {
        return new PortfolioCompanyRemovalResult();
    }

    /**
     * Create an instance of {@link CountriesListingFilter }
     * 
     */
    public CountriesListingFilter createCountriesListingFilter() {
        return new CountriesListingFilter();
    }

    /**
     * Create an instance of {@link ChangeEventsBasicParamsList }
     * 
     */
    public ChangeEventsBasicParamsList createChangeEventsBasicParamsList() {
        return new ChangeEventsBasicParamsList();
    }

    /**
     * Create an instance of {@link PortfolioSettings }
     * 
     */
    public PortfolioSettings createPortfolioSettings() {
        return new PortfolioSettings();
    }

    /**
     * Create an instance of {@link com.creditsafe.ws.CustomData }
     * 
     */
    public com.creditsafe.ws.CustomData createCustomData() {
        return new com.creditsafe.ws.CustomData();
    }

    /**
     * Create an instance of {@link com.creditsafe.ws.CustomData.Entries }
     * 
     */
    public com.creditsafe.ws.CustomData.Entries createCustomDataEntries() {
        return new com.creditsafe.ws.CustomData.Entries();
    }

    /**
     * Create an instance of {@link ReportSnapshot }
     * 
     */
    public ReportSnapshot createReportSnapshot() {
        return new ReportSnapshot();
    }

    /**
     * Create an instance of {@link GetStoredReportResponse }
     * 
     */
    public GetStoredReportResponse createGetStoredReportResponse() {
        return new GetStoredReportResponse();
    }

    /**
     * Create an instance of {@link GetStoredReport }
     * 
     */
    public GetStoredReport createGetStoredReport() {
        return new GetStoredReport();
    }

    /**
     * Create an instance of {@link UpdateStoredReport }
     * 
     */
    public UpdateStoredReport createUpdateStoredReport() {
        return new UpdateStoredReport();
    }

    /**
     * Create an instance of {@link SearchCriteria }
     * 
     */
    public SearchCriteria createSearchCriteria() {
        return new SearchCriteria();
    }

    /**
     * Create an instance of {@link ListOfflineOrdersResponse }
     * 
     */
    public ListOfflineOrdersResponse createListOfflineOrdersResponse() {
        return new ListOfflineOrdersResponse();
    }

    /**
     * Create an instance of {@link OfflineReportOrdersList }
     * 
     */
    public OfflineReportOrdersList createOfflineReportOrdersList() {
        return new OfflineReportOrdersList();
    }

    /**
     * Create an instance of {@link DeliverOfflineCompanyReport }
     * 
     */
    public DeliverOfflineCompanyReport createDeliverOfflineCompanyReport() {
        return new DeliverOfflineCompanyReport();
    }

    /**
     * Create an instance of {@link ListRealisedOrders }
     * 
     */
    public ListRealisedOrders createListRealisedOrders() {
        return new ListRealisedOrders();
    }

    /**
     * Create an instance of {@link DeliverOfflineCompanyReportResponse }
     * 
     */
    public DeliverOfflineCompanyReportResponse createDeliverOfflineCompanyReportResponse() {
        return new DeliverOfflineCompanyReportResponse();
    }

    /**
     * Create an instance of {@link SimpleResult }
     * 
     */
    public SimpleResult createSimpleResult() {
        return new SimpleResult();
    }

    /**
     * Create an instance of {@link MarkFailedOfflineOrder }
     * 
     */
    public MarkFailedOfflineOrder createMarkFailedOfflineOrder() {
        return new MarkFailedOfflineOrder();
    }

    /**
     * Create an instance of {@link ListOfflineOrders }
     * 
     */
    public ListOfflineOrders createListOfflineOrders() {
        return new ListOfflineOrders();
    }

    /**
     * Create an instance of {@link UpdateStoredReportResponse }
     * 
     */
    public UpdateStoredReportResponse createUpdateStoredReportResponse() {
        return new UpdateStoredReportResponse();
    }

    /**
     * Create an instance of {@link ListRealisedOrdersResponse }
     * 
     */
    public ListRealisedOrdersResponse createListRealisedOrdersResponse() {
        return new ListRealisedOrdersResponse();
    }

    /**
     * Create an instance of {@link ReportSnapshotsList }
     * 
     */
    public ReportSnapshotsList createReportSnapshotsList() {
        return new ReportSnapshotsList();
    }

    /**
     * Create an instance of {@link MarkFailedOfflineOrderResponse }
     * 
     */
    public MarkFailedOfflineOrderResponse createMarkFailedOfflineOrderResponse() {
        return new MarkFailedOfflineOrderResponse();
    }

    /**
     * Create an instance of {@link ReportboxListingFilter }
     * 
     */
    public ReportboxListingFilter createReportboxListingFilter() {
        return new ReportboxListingFilter();
    }

    /**
     * Create an instance of {@link PortfolioCompanyAdditionResult }
     * 
     */
    public PortfolioCompanyAdditionResult createPortfolioCompanyAdditionResult() {
        return new PortfolioCompanyAdditionResult();
    }

    /**
     * Create an instance of {@link ReportOrder }
     * 
     */
    public ReportOrder createReportOrder() {
        return new ReportOrder();
    }

    /**
     * Create an instance of {@link CurrentPortfolioSettings }
     * 
     */
    public CurrentPortfolioSettings createCurrentPortfolioSettings() {
        return new CurrentPortfolioSettings();
    }

    /**
     * Create an instance of {@link MonitoringRules }
     * 
     */
    public MonitoringRules createMonitoringRules() {
        return new MonitoringRules();
    }

    /**
     * Create an instance of {@link NumericValueChangeEvent }
     * 
     */
    public NumericValueChangeEvent createNumericValueChangeEvent() {
        return new NumericValueChangeEvent();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchema }
     * 
     */
    public SearchCriteriaSchema createSearchCriteriaSchema() {
        return new SearchCriteriaSchema();
    }

    /**
     * Create an instance of {@link ReportboxEntry }
     * 
     */
    public ReportboxEntry createReportboxEntry() {
        return new ReportboxEntry();
    }

    /**
     * Create an instance of {@link AddressCriteria }
     * 
     */
    public AddressCriteria createAddressCriteria() {
        return new AddressCriteria();
    }

    /**
     * Create an instance of {@link HttpNotificationSettings }
     * 
     */
    public HttpNotificationSettings createHttpNotificationSettings() {
        return new HttpNotificationSettings();
    }

    /**
     * Create an instance of {@link ChangeEventDescription }
     * 
     */
    public ChangeEventDescription createChangeEventDescription() {
        return new ChangeEventDescription();
    }

    /**
     * Create an instance of {@link CompanyData }
     * 
     */
    public CompanyData createCompanyData() {
        return new CompanyData();
    }

    /**
     * Create an instance of {@link TextValueRangeCondition }
     * 
     */
    public TextValueRangeCondition createTextValueRangeCondition() {
        return new TextValueRangeCondition();
    }

    /**
     * Create an instance of {@link AddressCriteriaSchema }
     * 
     */
    public AddressCriteriaSchema createAddressCriteriaSchema() {
        return new AddressCriteriaSchema();
    }

    /**
     * Create an instance of {@link TextValueChangeEvent }
     * 
     */
    public TextValueChangeEvent createTextValueChangeEvent() {
        return new TextValueChangeEvent();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link AddressData }
     * 
     */
    public AddressData createAddressData() {
        return new AddressData();
    }

    /**
     * Create an instance of {@link PortfolioActionResult }
     * 
     */
    public PortfolioActionResult createPortfolioActionResult() {
        return new PortfolioActionResult();
    }

    /**
     * Create an instance of {@link QueryString }
     * 
     */
    public QueryString createQueryString() {
        return new QueryString();
    }

    /**
     * Create an instance of {@link com.creditsafe.ws.Portfolio }
     * 
     */
    public com.creditsafe.ws.Portfolio createPortfolio() {
        return new com.creditsafe.ws.Portfolio();
    }

    /**
     * Create an instance of {@link FtpNotificationSettings }
     * 
     */
    public FtpNotificationSettings createFtpNotificationSettings() {
        return new FtpNotificationSettings();
    }

    /**
     * Create an instance of {@link NumericValueRangeCondition }
     * 
     */
    public NumericValueRangeCondition createNumericValueRangeCondition() {
        return new NumericValueRangeCondition();
    }

    /**
     * Create an instance of {@link ChangeEvent }
     * 
     */
    public ChangeEvent createChangeEvent() {
        return new ChangeEvent();
    }

    /**
     * Create an instance of {@link ChangeRangeCondition }
     * 
     */
    public ChangeRangeCondition createChangeRangeCondition() {
        return new ChangeRangeCondition();
    }

    /**
     * Create an instance of {@link ArrayOfCountryCode }
     * 
     */
    public ArrayOfCountryCode createArrayOfCountryCode() {
        return new ArrayOfCountryCode();
    }

    /**
     * Create an instance of {@link AccountManagerData }
     * 
     */
    public AccountManagerData createAccountManagerData() {
        return new AccountManagerData();
    }

    /**
     * Create an instance of {@link CustomScoreStrategiesList }
     * 
     */
    public CustomScoreStrategiesList createCustomScoreStrategiesList() {
        return new CustomScoreStrategiesList();
    }

    /**
     * Create an instance of {@link DataSourcePriorities }
     * 
     */
    public DataSourcePriorities createDataSourcePriorities() {
        return new DataSourcePriorities();
    }

    /**
     * Create an instance of {@link FullSystemReportSubsystemReport }
     * 
     */
    public FullSystemReportSubsystemReport createFullSystemReportSubsystemReport() {
        return new FullSystemReportSubsystemReport();
    }

    /**
     * Create an instance of {@link UserAccountOverview }
     * 
     */
    public UserAccountOverview createUserAccountOverview() {
        return new UserAccountOverview();
    }

    /**
     * Create an instance of {@link ReportSnapshotData }
     * 
     */
    public ReportSnapshotData createReportSnapshotData() {
        return new ReportSnapshotData();
    }

    /**
     * Create an instance of {@link CustomersList }
     * 
     */
    public CustomersList createCustomersList() {
        return new CustomersList();
    }

    /**
     * Create an instance of {@link CurrentDataSourceSettings }
     * 
     */
    public CurrentDataSourceSettings createCurrentDataSourceSettings() {
        return new CurrentDataSourceSettings();
    }

    /**
     * Create an instance of {@link Endpoint }
     * 
     */
    public Endpoint createEndpoint() {
        return new Endpoint();
    }

    /**
     * Create an instance of {@link UserAccountsList }
     * 
     */
    public UserAccountsList createUserAccountsList() {
        return new UserAccountsList();
    }

    /**
     * Create an instance of {@link TextLogEntry }
     * 
     */
    public TextLogEntry createTextLogEntry() {
        return new TextLogEntry();
    }

    /**
     * Create an instance of {@link NamedPipeBinding }
     * 
     */
    public NamedPipeBinding createNamedPipeBinding() {
        return new NamedPipeBinding();
    }

    /**
     * Create an instance of {@link CrmSettingsList }
     * 
     */
    public CrmSettingsList createCrmSettingsList() {
        return new CrmSettingsList();
    }

    /**
     * Create an instance of {@link CustomScoreStrategy }
     * 
     */
    public CustomScoreStrategy createCustomScoreStrategy() {
        return new CustomScoreStrategy();
    }

    /**
     * Create an instance of {@link CustomerData }
     * 
     */
    public CustomerData createCustomerData() {
        return new CustomerData();
    }

    /**
     * Create an instance of {@link MonitoringListingSearchCriteria }
     * 
     */
    public MonitoringListingSearchCriteria createMonitoringListingSearchCriteria() {
        return new MonitoringListingSearchCriteria();
    }

    /**
     * Create an instance of {@link LoginDetail }
     * 
     */
    public LoginDetail createLoginDetail() {
        return new LoginDetail();
    }

    /**
     * Create an instance of {@link ExtendedOfflineReportOrderData }
     * 
     */
    public ExtendedOfflineReportOrderData createExtendedOfflineReportOrderData() {
        return new ExtendedOfflineReportOrderData();
    }

    /**
     * Create an instance of {@link UserAccountSettings }
     * 
     */
    public UserAccountSettings createUserAccountSettings() {
        return new UserAccountSettings();
    }

    /**
     * Create an instance of {@link CountryStatus }
     * 
     */
    public CountryStatus createCountryStatus() {
        return new CountryStatus();
    }

    /**
     * Create an instance of {@link ActivityLogReportsEntry }
     * 
     */
    public ActivityLogReportsEntry createActivityLogReportsEntry() {
        return new ActivityLogReportsEntry();
    }

    /**
     * Create an instance of {@link NetTcpBinding }
     * 
     */
    public NetTcpBinding createNetTcpBinding() {
        return new NetTcpBinding();
    }

    /**
     * Create an instance of {@link AccountManagersList }
     * 
     */
    public AccountManagersList createAccountManagersList() {
        return new AccountManagersList();
    }

    /**
     * Create an instance of {@link OfflineReportOrderData }
     * 
     */
    public OfflineReportOrderData createOfflineReportOrderData() {
        return new OfflineReportOrderData();
    }

    /**
     * Create an instance of {@link ProviderServicesSettings }
     * 
     */
    public ProviderServicesSettings createProviderServicesSettings() {
        return new ProviderServicesSettings();
    }

    /**
     * Create an instance of {@link CurrentUserAccountAccessRights }
     * 
     */
    public CurrentUserAccountAccessRights createCurrentUserAccountAccessRights() {
        return new CurrentUserAccountAccessRights();
    }

    /**
     * Create an instance of {@link CurrentCustomerSettings }
     * 
     */
    public CurrentCustomerSettings createCurrentCustomerSettings() {
        return new CurrentCustomerSettings();
    }

    /**
     * Create an instance of {@link CurrentUserAccountSettings }
     * 
     */
    public CurrentUserAccountSettings createCurrentUserAccountSettings() {
        return new CurrentUserAccountSettings();
    }

    /**
     * Create an instance of {@link ServiceAccessInfo }
     * 
     */
    public ServiceAccessInfo createServiceAccessInfo() {
        return new ServiceAccessInfo();
    }

    /**
     * Create an instance of {@link StatusOverview }
     * 
     */
    public StatusOverview createStatusOverview() {
        return new StatusOverview();
    }

    /**
     * Create an instance of {@link LoadLogEntry }
     * 
     */
    public LoadLogEntry createLoadLogEntry() {
        return new LoadLogEntry();
    }

    /**
     * Create an instance of {@link BasicHttpBinding }
     * 
     */
    public BasicHttpBinding createBasicHttpBinding() {
        return new BasicHttpBinding();
    }

    /**
     * Create an instance of {@link SystemStatusSummarySubsystemReport }
     * 
     */
    public SystemStatusSummarySubsystemReport createSystemStatusSummarySubsystemReport() {
        return new SystemStatusSummarySubsystemReport();
    }

    /**
     * Create an instance of {@link CurrentUserPreferences }
     * 
     */
    public CurrentUserPreferences createCurrentUserPreferences() {
        return new CurrentUserPreferences();
    }

    /**
     * Create an instance of {@link CountrySettings }
     * 
     */
    public CountrySettings createCountrySettings() {
        return new CountrySettings();
    }

    /**
     * Create an instance of {@link ServiceCredentials }
     * 
     */
    public ServiceCredentials createServiceCredentials() {
        return new ServiceCredentials();
    }

    /**
     * Create an instance of {@link ProviderServiceSettings }
     * 
     */
    public ProviderServiceSettings createProviderServiceSettings() {
        return new ProviderServiceSettings();
    }

    /**
     * Create an instance of {@link EndpointDetails }
     * 
     */
    public EndpointDetails createEndpointDetails() {
        return new EndpointDetails();
    }

    /**
     * Create an instance of {@link CurrentAccountManagerSettings }
     * 
     */
    public CurrentAccountManagerSettings createCurrentAccountManagerSettings() {
        return new CurrentAccountManagerSettings();
    }

    /**
     * Create an instance of {@link CustomerSettings }
     * 
     */
    public CustomerSettings createCustomerSettings() {
        return new CustomerSettings();
    }

    /**
     * Create an instance of {@link AccountManagerSettings }
     * 
     */
    public AccountManagerSettings createAccountManagerSettings() {
        return new AccountManagerSettings();
    }

    /**
     * Create an instance of {@link CurrentProviderServicesSettings }
     * 
     */
    public CurrentProviderServicesSettings createCurrentProviderServicesSettings() {
        return new CurrentProviderServicesSettings();
    }

    /**
     * Create an instance of {@link WsHttpBinding }
     * 
     */
    public WsHttpBinding createWsHttpBinding() {
        return new WsHttpBinding();
    }

    /**
     * Create an instance of {@link OtherFinancials }
     * 
     */
    public OtherFinancials createOtherFinancials() {
        return new OtherFinancials();
    }

    /**
     * Create an instance of {@link RangeDescribedValueString }
     * 
     */
    public RangeDescribedValueString createRangeDescribedValueString() {
        return new RangeDescribedValueString();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link CompanyActivity }
     * 
     */
    public CompanyActivity createCompanyActivity() {
        return new CompanyActivity();
    }

    /**
     * Create an instance of {@link PreviousLegalForm }
     * 
     */
    public PreviousLegalForm createPreviousLegalForm() {
        return new PreviousLegalForm();
    }

    /**
     * Create an instance of {@link BalanceSheet }
     * 
     */
    public BalanceSheet createBalanceSheet() {
        return new BalanceSheet();
    }

    /**
     * Create an instance of {@link PreviousDirector }
     * 
     */
    public PreviousDirector createPreviousDirector() {
        return new PreviousDirector();
    }

    /**
     * Create an instance of {@link LtdFinancialStatement }
     * 
     */
    public LtdFinancialStatement createLtdFinancialStatement() {
        return new LtdFinancialStatement();
    }

    /**
     * Create an instance of {@link FinancialYearReport }
     * 
     */
    public FinancialYearReport createFinancialYearReport() {
        return new FinancialYearReport();
    }

    /**
     * Create an instance of {@link ProfitAndLossFigures }
     * 
     */
    public ProfitAndLossFigures createProfitAndLossFigures() {
        return new ProfitAndLossFigures();
    }

    /**
     * Create an instance of {@link CompanyStatusDescription }
     * 
     */
    public CompanyStatusDescription createCompanyStatusDescription() {
        return new CompanyStatusDescription();
    }

    /**
     * Create an instance of {@link EmployeeInformation }
     * 
     */
    public EmployeeInformation createEmployeeInformation() {
        return new EmployeeInformation();
    }

    /**
     * Create an instance of {@link FinancialValueDecimal }
     * 
     */
    public FinancialValueDecimal createFinancialValueDecimal() {
        return new FinancialValueDecimal();
    }

    /**
     * Create an instance of {@link LtdCompanyBasicInformation }
     * 
     */
    public LtdCompanyBasicInformation createLtdCompanyBasicInformation() {
        return new LtdCompanyBasicInformation();
    }

    /**
     * Create an instance of {@link LegalForm }
     * 
     */
    public LegalForm createLegalForm() {
        return new LegalForm();
    }

    /**
     * Create an instance of {@link StreetAddressWithTelephone }
     * 
     */
    public StreetAddressWithTelephone createStreetAddressWithTelephone() {
        return new StreetAddressWithTelephone();
    }

    /**
     * Create an instance of {@link Banker }
     * 
     */
    public Banker createBanker() {
        return new Banker();
    }

    /**
     * Create an instance of {@link CreditRating }
     * 
     */
    public CreditRating createCreditRating() {
        return new CreditRating();
    }

    /**
     * Create an instance of {@link Director }
     * 
     */
    public Director createDirector() {
        return new Director();
    }

    /**
     * Create an instance of {@link Advisor }
     * 
     */
    public Advisor createAdvisor() {
        return new Advisor();
    }

    /**
     * Create an instance of {@link FinancialRatios }
     * 
     */
    public FinancialRatios createFinancialRatios() {
        return new FinancialRatios();
    }

    /**
     * Create an instance of {@link PreviousName }
     * 
     */
    public PreviousName createPreviousName() {
        return new PreviousName();
    }

    /**
     * Create an instance of {@link StreetAddress }
     * 
     */
    public StreetAddress createStreetAddress() {
        return new StreetAddress();
    }

    /**
     * Create an instance of {@link FinancialValueString }
     * 
     */
    public FinancialValueString createFinancialValueString() {
        return new FinancialValueString();
    }

    /**
     * Create an instance of {@link LtdCompanySummary }
     * 
     */
    public LtdCompanySummary createLtdCompanySummary() {
        return new LtdCompanySummary();
    }

    /**
     * Create an instance of {@link CorporatePosition }
     * 
     */
    public CorporatePosition createCorporatePosition() {
        return new CorporatePosition();
    }

    /**
     * Create an instance of {@link ShareHolder }
     * 
     */
    public ShareHolder createShareHolder() {
        return new ShareHolder();
    }

    /**
     * Create an instance of {@link LtdCreditScore }
     * 
     */
    public LtdCreditScore createLtdCreditScore() {
        return new LtdCreditScore();
    }

    /**
     * Create an instance of {@link GetPortfolioSettingsResponse }
     * 
     */
    public GetPortfolioSettingsResponse createGetPortfolioSettingsResponse() {
        return new GetPortfolioSettingsResponse();
    }

    /**
     * Create an instance of {@link AddCompaniesToPortfolios }
     * 
     */
    public AddCompaniesToPortfolios createAddCompaniesToPortfolios() {
        return new AddCompaniesToPortfolios();
    }

    /**
     * Create an instance of {@link ArrayOfunsignedInt }
     * 
     */
    public ArrayOfunsignedInt createArrayOfunsignedInt() {
        return new ArrayOfunsignedInt();
    }

    /**
     * Create an instance of {@link TryRetrieveCompanyOnlineReport }
     * 
     */
    public TryRetrieveCompanyOnlineReport createTryRetrieveCompanyOnlineReport() {
        return new TryRetrieveCompanyOnlineReport();
    }

    /**
     * Create an instance of {@link GetSupportedChangeEventsResponse }
     * 
     */
    public GetSupportedChangeEventsResponse createGetSupportedChangeEventsResponse() {
        return new GetSupportedChangeEventsResponse();
    }

    /**
     * Create an instance of {@link ListMonitoredCompaniesResponse }
     * 
     */
    public ListMonitoredCompaniesResponse createListMonitoredCompaniesResponse() {
        return new ListMonitoredCompaniesResponse();
    }

    /**
     * Create an instance of {@link GetCountries }
     * 
     */
    public GetCountries createGetCountries() {
        return new GetCountries();
    }

    /**
     * Create an instance of {@link OrderCompanyOfflineReport }
     * 
     */
    public OrderCompanyOfflineReport createOrderCompanyOfflineReport() {
        return new OrderCompanyOfflineReport();
    }

    /**
     * Create an instance of {@link RemovePortfoliosResponse }
     * 
     */
    public RemovePortfoliosResponse createRemovePortfoliosResponse() {
        return new RemovePortfoliosResponse();
    }

    /**
     * Create an instance of {@link RemoveReportboxReports }
     * 
     */
    public RemoveReportboxReports createRemoveReportboxReports() {
        return new RemoveReportboxReports();
    }

    /**
     * Create an instance of {@link ChangeCompaniesReferenceStrings }
     * 
     */
    public ChangeCompaniesReferenceStrings createChangeCompaniesReferenceStrings() {
        return new ChangeCompaniesReferenceStrings();
    }

    /**
     * Create an instance of {@link GetReportboxReports }
     * 
     */
    public GetReportboxReports createGetReportboxReports() {
        return new GetReportboxReports();
    }

    /**
     * Create an instance of {@link RetrieveCompanyOnlineReport }
     * 
     */
    public RetrieveCompanyOnlineReport createRetrieveCompanyOnlineReport() {
        return new RetrieveCompanyOnlineReport();
    }

    /**
     * Create an instance of {@link GetPortfoliosResponse }
     * 
     */
    public GetPortfoliosResponse createGetPortfoliosResponse() {
        return new GetPortfoliosResponse();
    }

    /**
     * Create an instance of {@link RemovePortfolios }
     * 
     */
    public RemovePortfolios createRemovePortfolios() {
        return new RemovePortfolios();
    }

    /**
     * Create an instance of {@link GetReportboxContents }
     * 
     */
    public GetReportboxContents createGetReportboxContents() {
        return new GetReportboxContents();
    }

    /**
     * Create an instance of {@link CreatePortfolio }
     * 
     */
    public CreatePortfolio createCreatePortfolio() {
        return new CreatePortfolio();
    }

    /**
     * Create an instance of {@link SetMonitoringRulesResponse }
     * 
     */
    public SetMonitoringRulesResponse createSetMonitoringRulesResponse() {
        return new SetMonitoringRulesResponse();
    }

    /**
     * Create an instance of {@link GetSupportedChangeEvents }
     * 
     */
    public GetSupportedChangeEvents createGetSupportedChangeEvents() {
        return new GetSupportedChangeEvents();
    }

    /**
     * Create an instance of {@link SetMonitoringRules }
     * 
     */
    public SetMonitoringRules createSetMonitoringRules() {
        return new SetMonitoringRules();
    }

    /**
     * Create an instance of {@link GetPossibleSearchCriteriaResponse }
     * 
     */
    public GetPossibleSearchCriteriaResponse createGetPossibleSearchCriteriaResponse() {
        return new GetPossibleSearchCriteriaResponse();
    }

    /**
     * Create an instance of {@link SetDefaultChangesCheckPeriod }
     * 
     */
    public SetDefaultChangesCheckPeriod createSetDefaultChangesCheckPeriod() {
        return new SetDefaultChangesCheckPeriod();
    }

    /**
     * Create an instance of {@link ImportCompaniesToPortfolioResponse }
     * 
     */
    public ImportCompaniesToPortfolioResponse createImportCompaniesToPortfolioResponse() {
        return new ImportCompaniesToPortfolioResponse();
    }

    /**
     * Create an instance of {@link ListMonitoredCompanies }
     * 
     */
    public ListMonitoredCompanies createListMonitoredCompanies() {
        return new ListMonitoredCompanies();
    }

    /**
     * Create an instance of {@link SetPortfolioSettings }
     * 
     */
    public SetPortfolioSettings createSetPortfolioSettings() {
        return new SetPortfolioSettings();
    }

    /**
     * Create an instance of {@link AddCompaniesToPortfoliosResponse }
     * 
     */
    public AddCompaniesToPortfoliosResponse createAddCompaniesToPortfoliosResponse() {
        return new AddCompaniesToPortfoliosResponse();
    }

    /**
     * Create an instance of {@link RemoveReportboxReportsResponse }
     * 
     */
    public RemoveReportboxReportsResponse createRemoveReportboxReportsResponse() {
        return new RemoveReportboxReportsResponse();
    }

    /**
     * Create an instance of {@link ChangeCompaniesReferenceStringsResponse }
     * 
     */
    public ChangeCompaniesReferenceStringsResponse createChangeCompaniesReferenceStringsResponse() {
        return new ChangeCompaniesReferenceStringsResponse();
    }

    /**
     * Create an instance of {@link SetDefaultChangesCheckPeriodResponse }
     * 
     */
    public SetDefaultChangesCheckPeriodResponse createSetDefaultChangesCheckPeriodResponse() {
        return new SetDefaultChangesCheckPeriodResponse();
    }

    /**
     * Create an instance of {@link GetPortfolios }
     * 
     */
    public GetPortfolios createGetPortfolios() {
        return new GetPortfolios();
    }

    /**
     * Create an instance of {@link ImportCompaniesToPortfolio }
     * 
     */
    public ImportCompaniesToPortfolio createImportCompaniesToPortfolio() {
        return new ImportCompaniesToPortfolio();
    }

    /**
     * Create an instance of {@link FindCompanies }
     * 
     */
    public FindCompanies createFindCompanies() {
        return new FindCompanies();
    }

    /**
     * Create an instance of {@link GetMonitoringRules }
     * 
     */
    public GetMonitoringRules createGetMonitoringRules() {
        return new GetMonitoringRules();
    }

    /**
     * Create an instance of {@link SetPortfolioSettingsResponse }
     * 
     */
    public SetPortfolioSettingsResponse createSetPortfolioSettingsResponse() {
        return new SetPortfolioSettingsResponse();
    }

    /**
     * Create an instance of {@link GetReportboxReportsResponse }
     * 
     */
    public GetReportboxReportsResponse createGetReportboxReportsResponse() {
        return new GetReportboxReportsResponse();
    }

    /**
     * Create an instance of {@link OrderCompanyOfflineReportResponse }
     * 
     */
    public OrderCompanyOfflineReportResponse createOrderCompanyOfflineReportResponse() {
        return new OrderCompanyOfflineReportResponse();
    }

    /**
     * Create an instance of {@link GetPortfolioSettings }
     * 
     */
    public GetPortfolioSettings createGetPortfolioSettings() {
        return new GetPortfolioSettings();
    }

    /**
     * Create an instance of {@link RemoveCompaniesFromPortfoliosResponse }
     * 
     */
    public RemoveCompaniesFromPortfoliosResponse createRemoveCompaniesFromPortfoliosResponse() {
        return new RemoveCompaniesFromPortfoliosResponse();
    }

    /**
     * Create an instance of {@link GetReportboxContentsResponse }
     * 
     */
    public GetReportboxContentsResponse createGetReportboxContentsResponse() {
        return new GetReportboxContentsResponse();
    }

    /**
     * Create an instance of {@link GetCountriesResponse }
     * 
     */
    public GetCountriesResponse createGetCountriesResponse() {
        return new GetCountriesResponse();
    }

    /**
     * Create an instance of {@link GetMonitoringRulesResponse }
     * 
     */
    public GetMonitoringRulesResponse createGetMonitoringRulesResponse() {
        return new GetMonitoringRulesResponse();
    }

    /**
     * Create an instance of {@link RetrieveCompanyOnlineReportResponse }
     * 
     */
    public RetrieveCompanyOnlineReportResponse createRetrieveCompanyOnlineReportResponse() {
        return new RetrieveCompanyOnlineReportResponse();
    }

    /**
     * Create an instance of {@link GetReportCustomDataSchemaResponse }
     * 
     */
    public GetReportCustomDataSchemaResponse createGetReportCustomDataSchemaResponse() {
        return new GetReportCustomDataSchemaResponse();
    }

    /**
     * Create an instance of {@link GetPossibleSearchCriteria }
     * 
     */
    public GetPossibleSearchCriteria createGetPossibleSearchCriteria() {
        return new GetPossibleSearchCriteria();
    }

    /**
     * Create an instance of {@link GetReportCustomDataSchema }
     * 
     */
    public GetReportCustomDataSchema createGetReportCustomDataSchema() {
        return new GetReportCustomDataSchema();
    }

    /**
     * Create an instance of {@link RemoveCompaniesFromPortfolios }
     * 
     */
    public RemoveCompaniesFromPortfolios createRemoveCompaniesFromPortfolios() {
        return new RemoveCompaniesFromPortfolios();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link FindCompaniesResponse }
     * 
     */
    public FindCompaniesResponse createFindCompaniesResponse() {
        return new FindCompaniesResponse();
    }

    /**
     * Create an instance of {@link TryRetrieveCompanyOnlineReportResponse }
     * 
     */
    public TryRetrieveCompanyOnlineReportResponse createTryRetrieveCompanyOnlineReportResponse() {
        return new TryRetrieveCompanyOnlineReportResponse();
    }

    /**
     * Create an instance of {@link CreatePortfolioResponse }
     * 
     */
    public CreatePortfolioResponse createCreatePortfolioResponse() {
        return new CreatePortfolioResponse();
    }

    /**
     * Create an instance of {@link LtdOtherInformation.Bankers }
     * 
     */
    public LtdOtherInformation.Bankers createLtdOtherInformationBankers() {
        return new LtdOtherInformation.Bankers();
    }

    /**
     * Create an instance of {@link LtdOtherInformation.Advisors }
     * 
     */
    public LtdOtherInformation.Advisors createLtdOtherInformationAdvisors() {
        return new LtdOtherInformation.Advisors();
    }

    /**
     * Create an instance of {@link LtdOtherInformation.EmployeesInformation }
     * 
     */
    public LtdOtherInformation.EmployeesInformation createLtdOtherInformationEmployeesInformation() {
        return new LtdOtherInformation.EmployeesInformation();
    }

    /**
     * Create an instance of {@link LtdCompanyIdentification.Activities }
     * 
     */
    public LtdCompanyIdentification.Activities createLtdCompanyIdentificationActivities() {
        return new LtdCompanyIdentification.Activities();
    }

    /**
     * Create an instance of {@link LtdCompanyIdentification.PreviousNames }
     * 
     */
    public LtdCompanyIdentification.PreviousNames createLtdCompanyIdentificationPreviousNames() {
        return new LtdCompanyIdentification.PreviousNames();
    }

    /**
     * Create an instance of {@link LtdCompanyIdentification.PreviousLegalForms }
     * 
     */
    public LtdCompanyIdentification.PreviousLegalForms createLtdCompanyIdentificationPreviousLegalForms() {
        return new LtdCompanyIdentification.PreviousLegalForms();
    }

    /**
     * Create an instance of {@link LtdDirectors.CurrentDirectors }
     * 
     */
    public LtdDirectors.CurrentDirectors createLtdDirectorsCurrentDirectors() {
        return new LtdDirectors.CurrentDirectors();
    }

    /**
     * Create an instance of {@link LtdDirectors.PreviousDirectors }
     * 
     */
    public LtdDirectors.PreviousDirectors createLtdDirectorsPreviousDirectors() {
        return new LtdDirectors.PreviousDirectors();
    }

    /**
     * Create an instance of {@link LtdContactInformation.OtherAddresses }
     * 
     */
    public LtdContactInformation.OtherAddresses createLtdContactInformationOtherAddresses() {
        return new LtdContactInformation.OtherAddresses();
    }

    /**
     * Create an instance of {@link LtdContactInformation.PreviousAddresses }
     * 
     */
    public LtdContactInformation.PreviousAddresses createLtdContactInformationPreviousAddresses() {
        return new LtdContactInformation.PreviousAddresses();
    }

    /**
     * Create an instance of {@link LtdContactInformation.EmailAddresses }
     * 
     */
    public LtdContactInformation.EmailAddresses createLtdContactInformationEmailAddresses() {
        return new LtdContactInformation.EmailAddresses();
    }

    /**
     * Create an instance of {@link LtdContactInformation.Websites }
     * 
     */
    public LtdContactInformation.Websites createLtdContactInformationWebsites() {
        return new LtdContactInformation.Websites();
    }

    /**
     * Create an instance of {@link LtdShareCapitalStructure.ShareHolders }
     * 
     */
    public LtdShareCapitalStructure.ShareHolders createLtdShareCapitalStructureShareHolders() {
        return new LtdShareCapitalStructure.ShareHolders();
    }

    /**
     * Create an instance of {@link ServiceResponse.Messages }
     * 
     */
    public ServiceResponse.Messages createServiceResponseMessages() {
        return new ServiceResponse.Messages();
    }

    /**
     * Create an instance of {@link CompanyReportSet.Reports }
     * 
     */
    public CompanyReportSet.Reports createCompanyReportSetReports() {
        return new CompanyReportSet.Reports();
    }

    /**
     * Create an instance of {@link LtdGroupStructure.SubsidiaryCompanies }
     * 
     */
    public LtdGroupStructure.SubsidiaryCompanies createLtdGroupStructureSubsidiaryCompanies() {
        return new LtdGroupStructure.SubsidiaryCompanies();
    }

    /**
     * Create an instance of {@link LtdGroupStructure.AffiliatedCompanies }
     * 
     */
    public LtdGroupStructure.AffiliatedCompanies createLtdGroupStructureAffiliatedCompanies() {
        return new LtdGroupStructure.AffiliatedCompanies();
    }

    /**
     * Create an instance of {@link LtdCompanyFullReport.FinancialStatements }
     * 
     */
    public LtdCompanyFullReport.FinancialStatements createLtdCompanyFullReportFinancialStatements() {
        return new LtdCompanyFullReport.FinancialStatements();
    }

    /**
     * Create an instance of {@link LtdCompanyFullReport.AdditionalInformation }
     * 
     */
    public LtdCompanyFullReport.AdditionalInformation createLtdCompanyFullReportAdditionalInformation() {
        return new LtdCompanyFullReport.AdditionalInformation();
    }

    /**
     * Create an instance of {@link AccessControlEntry.Countries }
     * 
     */
    public AccessControlEntry.Countries createAccessControlEntryCountries() {
        return new AccessControlEntry.Countries();
    }

    /**
     * Create an instance of {@link DataSourcesReport.DataSources }
     * 
     */
    public DataSourcesReport.DataSources createDataSourcesReportDataSources() {
        return new DataSourcesReport.DataSources();
    }

    /**
     * Create an instance of {@link DataSourcesReport.Priorities }
     * 
     */
    public DataSourcesReport.Priorities createDataSourcesReportPriorities() {
        return new DataSourcesReport.Priorities();
    }

    /**
     * Create an instance of {@link SystemStatusSummary.Subsystems }
     * 
     */
    public SystemStatusSummary.Subsystems createSystemStatusSummarySubsystems() {
        return new SystemStatusSummary.Subsystems();
    }

    /**
     * Create an instance of {@link FullSystemReport.Subsystems }
     * 
     */
    public FullSystemReport.Subsystems createFullSystemReportSubsystems() {
        return new FullSystemReport.Subsystems();
    }

    /**
     * Create an instance of {@link UserAccountAccessRights.Browsing }
     * 
     */
    public UserAccountAccessRights.Browsing createUserAccountAccessRightsBrowsing() {
        return new UserAccountAccessRights.Browsing();
    }

    /**
     * Create an instance of {@link UserAccountAccessRights.OnlineReports }
     * 
     */
    public UserAccountAccessRights.OnlineReports createUserAccountAccessRightsOnlineReports() {
        return new UserAccountAccessRights.OnlineReports();
    }

    /**
     * Create an instance of {@link UserAccountAccessRights.OfflineReports }
     * 
     */
    public UserAccountAccessRights.OfflineReports createUserAccountAccessRightsOfflineReports() {
        return new UserAccountAccessRights.OfflineReports();
    }

    /**
     * Create an instance of {@link UserAccountAccessRights.Monitoring }
     * 
     */
    public UserAccountAccessRights.Monitoring createUserAccountAccessRightsMonitoring() {
        return new UserAccountAccessRights.Monitoring();
    }

    /**
     * Create an instance of {@link UserAccountAccessRights.CustomScores }
     * 
     */
    public UserAccountAccessRights.CustomScores createUserAccountAccessRightsCustomScores() {
        return new UserAccountAccessRights.CustomScores();
    }

    /**
     * Create an instance of {@link ActivityLogReportboxEntry.ReportboxIds }
     * 
     */
    public ActivityLogReportboxEntry.ReportboxIds createActivityLogReportboxEntryReportboxIds() {
        return new ActivityLogReportboxEntry.ReportboxIds();
    }

    /**
     * Create an instance of {@link ActivityLogReportboxEntry.Data }
     * 
     */
    public ActivityLogReportboxEntry.Data createActivityLogReportboxEntryData() {
        return new ActivityLogReportboxEntry.Data();
    }

    /**
     * Create an instance of {@link ActivityLogEntry.CustomData.Entry }
     * 
     */
    public ActivityLogEntry.CustomData.Entry createActivityLogEntryCustomDataEntry() {
        return new ActivityLogEntry.CustomData.Entry();
    }

    /**
     * Create an instance of {@link UserPreferences.ReportBinaryFormats }
     * 
     */
    public UserPreferences.ReportBinaryFormats createUserPreferencesReportBinaryFormats() {
        return new UserPreferences.ReportBinaryFormats();
    }

    /**
     * Create an instance of {@link UserPreferences.SpecialFlags }
     * 
     */
    public UserPreferences.SpecialFlags createUserPreferencesSpecialFlags() {
        return new UserPreferences.SpecialFlags();
    }

    /**
     * Create an instance of {@link ActivityLogBrowsingEntry.Countries }
     * 
     */
    public ActivityLogBrowsingEntry.Countries createActivityLogBrowsingEntryCountries() {
        return new ActivityLogBrowsingEntry.Countries();
    }

    /**
     * Create an instance of {@link ReportPricing.Offline.OfflineItem }
     * 
     */
    public ReportPricing.Offline.OfflineItem createReportPricingOfflineOfflineItem() {
        return new ReportPricing.Offline.OfflineItem();
    }

    /**
     * Create an instance of {@link ReportPricing.Online.OnlineItem }
     * 
     */
    public ReportPricing.Online.OnlineItem createReportPricingOnlineOnlineItem() {
        return new ReportPricing.Online.OnlineItem();
    }

    /**
     * Create an instance of {@link ActivityLogMiscellaneousEntry.Data }
     * 
     */
    public ActivityLogMiscellaneousEntry.Data createActivityLogMiscellaneousEntryData() {
        return new ActivityLogMiscellaneousEntry.Data();
    }

    /**
     * Create an instance of {@link DataSource.CountriesEnabled.EnabledCountry }
     * 
     */
    public DataSource.CountriesEnabled.EnabledCountry createDataSourceCountriesEnabledEnabledCountry() {
        return new DataSource.CountriesEnabled.EnabledCountry();
    }

    /**
     * Create an instance of {@link ActivityLogMonitoringEntry.Data }
     * 
     */
    public ActivityLogMonitoringEntry.Data createActivityLogMonitoringEntryData() {
        return new ActivityLogMonitoringEntry.Data();
    }

    /**
     * Create an instance of {@link ActivityLogMonitoringEntry.Portfolios.Portfolio }
     * 
     */
    public ActivityLogMonitoringEntry.Portfolios.Portfolio createActivityLogMonitoringEntryPortfoliosPortfolio() {
        return new ActivityLogMonitoringEntry.Portfolios.Portfolio();
    }

    /**
     * Create an instance of {@link UserAccountLoginDetails.Details }
     * 
     */
    public UserAccountLoginDetails.Details createUserAccountLoginDetailsDetails() {
        return new UserAccountLoginDetails.Details();
    }

    /**
     * Create an instance of {@link Log.Messages }
     * 
     */
    public Log.Messages createLogMessages() {
        return new Log.Messages();
    }

    /**
     * Create an instance of {@link Log.LoadHistory }
     * 
     */
    public Log.LoadHistory createLogLoadHistory() {
        return new Log.LoadHistory();
    }

    /**
     * Create an instance of {@link Log.Overloads.Overload }
     * 
     */
    public Log.Overloads.Overload createLogOverloadsOverload() {
        return new Log.Overloads.Overload();
    }

    /**
     * Create an instance of {@link DataSourceSettings.Countries }
     * 
     */
    public DataSourceSettings.Countries createDataSourceSettingsCountries() {
        return new DataSourceSettings.Countries();
    }

    /**
     * Create an instance of {@link UserAccountActivityLog.Browsing }
     * 
     */
    public UserAccountActivityLog.Browsing createUserAccountActivityLogBrowsing() {
        return new UserAccountActivityLog.Browsing();
    }

    /**
     * Create an instance of {@link UserAccountActivityLog.Reports }
     * 
     */
    public UserAccountActivityLog.Reports createUserAccountActivityLogReports() {
        return new UserAccountActivityLog.Reports();
    }

    /**
     * Create an instance of {@link UserAccountActivityLog.Monitoring }
     * 
     */
    public UserAccountActivityLog.Monitoring createUserAccountActivityLogMonitoring() {
        return new UserAccountActivityLog.Monitoring();
    }

    /**
     * Create an instance of {@link UserAccountActivityLog.Reportbox }
     * 
     */
    public UserAccountActivityLog.Reportbox createUserAccountActivityLogReportbox() {
        return new UserAccountActivityLog.Reportbox();
    }

    /**
     * Create an instance of {@link UserAccountActivityLog.Miscellaneous }
     * 
     */
    public UserAccountActivityLog.Miscellaneous createUserAccountActivityLogMiscellaneous() {
        return new UserAccountActivityLog.Miscellaneous();
    }

    /**
     * Create an instance of {@link CrmSettings.OfflineReportsEmailAddresses }
     * 
     */
    public CrmSettings.OfflineReportsEmailAddresses createCrmSettingsOfflineReportsEmailAddresses() {
        return new CrmSettings.OfflineReportsEmailAddresses();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaValueSchemaString.AllowedValues }
     * 
     */
    public SearchCriteriaSchemaValueSchemaString.AllowedValues createSearchCriteriaSchemaValueSchemaStringAllowedValues() {
        return new SearchCriteriaSchemaValueSchemaString.AllowedValues();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaValueSchemaOfficeType.AllowedValues }
     * 
     */
    public SearchCriteriaSchemaValueSchemaOfficeType.AllowedValues createSearchCriteriaSchemaValueSchemaOfficeTypeAllowedValues() {
        return new SearchCriteriaSchemaValueSchemaOfficeType.AllowedValues();
    }

    /**
     * Create an instance of {@link MonitoredCompany.Changes }
     * 
     */
    public MonitoredCompany.Changes createMonitoredCompanyChanges() {
        return new MonitoredCompany.Changes();
    }

    /**
     * Create an instance of {@link ChangeEventBasicParams.PossibleValues }
     * 
     */
    public ChangeEventBasicParams.PossibleValues createChangeEventBasicParamsPossibleValues() {
        return new ChangeEventBasicParams.PossibleValues();
    }

    /**
     * Create an instance of {@link MonitoringRule.Conditions }
     * 
     */
    public MonitoringRule.Conditions createMonitoringRuleConditions() {
        return new MonitoringRule.Conditions();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaValueSchemaCompanyStatus.AllowedValues }
     * 
     */
    public SearchCriteriaSchemaValueSchemaCompanyStatus.AllowedValues createSearchCriteriaSchemaValueSchemaCompanyStatusAllowedValues() {
        return new SearchCriteriaSchemaValueSchemaCompanyStatus.AllowedValues();
    }

    /**
     * Create an instance of {@link Country.AvailableReportTypes }
     * 
     */
    public Country.AvailableReportTypes createCountryAvailableReportTypes() {
        return new Country.AvailableReportTypes();
    }

    /**
     * Create an instance of {@link Country.AvailableLanguages }
     * 
     */
    public Country.AvailableLanguages createCountryAvailableLanguages() {
        return new Country.AvailableLanguages();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaValueSchemaCompanyType.AllowedValues }
     * 
     */
    public SearchCriteriaSchemaValueSchemaCompanyType.AllowedValues createSearchCriteriaSchemaValueSchemaCompanyTypeAllowedValues() {
        return new SearchCriteriaSchemaValueSchemaCompanyType.AllowedValues();
    }

    /**
     * Create an instance of {@link PortfolioCompanies.Companies }
     * 
     */
    public PortfolioCompanies.Companies createPortfolioCompaniesCompanies() {
        return new PortfolioCompanies.Companies();
    }

    /**
     * Create an instance of {@link PortfolioCompanyIds.CompanyIds }
     * 
     */
    public PortfolioCompanyIds.CompanyIds createPortfolioCompanyIdsCompanyIds() {
        return new PortfolioCompanyIds.CompanyIds();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaQueryStringSchema.AllowedMatchTypes }
     * 
     */
    public SearchCriteriaSchemaQueryStringSchema.AllowedMatchTypes createSearchCriteriaSchemaQueryStringSchemaAllowedMatchTypes() {
        return new SearchCriteriaSchemaQueryStringSchema.AllowedMatchTypes();
    }

    /**
     * Create an instance of {@link CustomDataEntrySchema.AllowedValues }
     * 
     */
    public CustomDataEntrySchema.AllowedValues createCustomDataEntrySchemaAllowedValues() {
        return new CustomDataEntrySchema.AllowedValues();
    }

    /**
     * Create an instance of {@link EmailNotificationSettings.AddressesMain }
     * 
     */
    public EmailNotificationSettings.AddressesMain createEmailNotificationSettingsAddressesMain() {
        return new EmailNotificationSettings.AddressesMain();
    }

    /**
     * Create an instance of {@link EmailNotificationSettings.AddressesCopy }
     * 
     */
    public EmailNotificationSettings.AddressesCopy createEmailNotificationSettingsAddressesCopy() {
        return new EmailNotificationSettings.AddressesCopy();
    }

    /**
     * Create an instance of {@link com.creditsafe.ws.Company.AvailableReportTypes }
     * 
     */
    public com.creditsafe.ws.Company.AvailableReportTypes createCompanyAvailableReportTypes() {
        return new com.creditsafe.ws.Company.AvailableReportTypes();
    }

    /**
     * Create an instance of {@link com.creditsafe.ws.Company.AvailableLanguages }
     * 
     */
    public com.creditsafe.ws.Company.AvailableLanguages createCompanyAvailableLanguages() {
        return new com.creditsafe.ws.Company.AvailableLanguages();
    }

    /**
     * Create an instance of {@link com.creditsafe.ws.Company.AdditionalData.AdditionalDataItem }
     * 
     */
    public com.creditsafe.ws.Company.AdditionalData.AdditionalDataItem createCompanyAdditionalDataAdditionalDataItem() {
        return new com.creditsafe.ws.Company.AdditionalData.AdditionalDataItem();
    }

    /**
     * Create an instance of {@link CountriesList.Countries }
     * 
     */
    public CountriesList.Countries createCountriesListCountries() {
        return new CountriesList.Countries();
    }

    /**
     * Create an instance of {@link CompaniesList.Companies }
     * 
     */
    public CompaniesList.Companies createCompaniesListCompanies() {
        return new CompaniesList.Companies();
    }

    /**
     * Create an instance of {@link CompanyChangesList.Companies }
     * 
     */
    public CompanyChangesList.Companies createCompanyChangesListCompanies() {
        return new CompanyChangesList.Companies();
    }

    /**
     * Create an instance of {@link PortfolioRemovalResult.Portfolios }
     * 
     */
    public PortfolioRemovalResult.Portfolios createPortfolioRemovalResultPortfolios() {
        return new PortfolioRemovalResult.Portfolios();
    }

    /**
     * Create an instance of {@link MonitoredCompaniesList.Portfolios }
     * 
     */
    public MonitoredCompaniesList.Portfolios createMonitoredCompaniesListPortfolios() {
        return new MonitoredCompaniesList.Portfolios();
    }

    /**
     * Create an instance of {@link SupportedChangeEventsList.Events }
     * 
     */
    public SupportedChangeEventsList.Events createSupportedChangeEventsListEvents() {
        return new SupportedChangeEventsList.Events();
    }

    /**
     * Create an instance of {@link CompanyReferences.Companies.Company }
     * 
     */
    public CompanyReferences.Companies.Company createCompanyReferencesCompaniesCompany() {
        return new CompanyReferences.Companies.Company();
    }

    /**
     * Create an instance of {@link CurrentPortfolioMonitoringRules.Rules }
     * 
     */
    public CurrentPortfolioMonitoringRules.Rules createCurrentPortfolioMonitoringRulesRules() {
        return new CurrentPortfolioMonitoringRules.Rules();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaSet.Schemas }
     * 
     */
    public SearchCriteriaSchemaSet.Schemas createSearchCriteriaSchemaSetSchemas() {
        return new SearchCriteriaSchemaSet.Schemas();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaSet.CustomData }
     * 
     */
    public SearchCriteriaSchemaSet.CustomData createSearchCriteriaSchemaSetCustomData() {
        return new SearchCriteriaSchemaSet.CustomData();
    }

    /**
     * Create an instance of {@link SearchCriteriaSchemaSet.Countries }
     * 
     */
    public SearchCriteriaSchemaSet.Countries createSearchCriteriaSchemaSetCountries() {
        return new SearchCriteriaSchemaSet.Countries();
    }

    /**
     * Create an instance of {@link PortfoliosList.Portfolios }
     * 
     */
    public PortfoliosList.Portfolios createPortfoliosListPortfolios() {
        return new PortfoliosList.Portfolios();
    }

    /**
     * Create an instance of {@link CustomDataSchema.CustomData }
     * 
     */
    public CustomDataSchema.CustomData createCustomDataSchemaCustomData() {
        return new CustomDataSchema.CustomData();
    }

    /**
     * Create an instance of {@link ReportboxContents.Entries }
     * 
     */
    public ReportboxContents.Entries createReportboxContentsEntries() {
        return new ReportboxContents.Entries();
    }

    /**
     * Create an instance of {@link PortfolioCompanyRemovalResult.Portfolios }
     * 
     */
    public PortfolioCompanyRemovalResult.Portfolios createPortfolioCompanyRemovalResultPortfolios() {
        return new PortfolioCompanyRemovalResult.Portfolios();
    }

    /**
     * Create an instance of {@link CountriesListingFilter.Codes }
     * 
     */
    public CountriesListingFilter.Codes createCountriesListingFilterCodes() {
        return new CountriesListingFilter.Codes();
    }

    /**
     * Create an instance of {@link ChangeEventsBasicParamsList.Events }
     * 
     */
    public ChangeEventsBasicParamsList.Events createChangeEventsBasicParamsListEvents() {
        return new ChangeEventsBasicParamsList.Events();
    }

    /**
     * Create an instance of {@link PortfolioSettings.NotificationSettings }
     * 
     */
    public PortfolioSettings.NotificationSettings createPortfolioSettingsNotificationSettings() {
        return new PortfolioSettings.NotificationSettings();
    }

    /**
     * Create an instance of {@link com.creditsafe.ws.CustomData.Entries.Entry }
     * 
     */
    public com.creditsafe.ws.CustomData.Entries.Entry createCustomDataEntriesEntry() {
        return new com.creditsafe.ws.CustomData.Entries.Entry();
    }

    /**
     * Create an instance of {@link ReportSnapshot.Report }
     * 
     */
    public ReportSnapshot.Report createReportSnapshotReport() {
        return new ReportSnapshot.Report();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "ReportOrder")
    public JAXBElement<ReportOrder> createReportOrder(ReportOrder value) {
        return new JAXBElement<ReportOrder>(_ReportOrder_QNAME, ReportOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomDataSchema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "CustomDataSchema")
    public JAXBElement<CustomDataSchema> createCustomDataSchema(CustomDataSchema value) {
        return new JAXBElement<CustomDataSchema>(_CustomDataSchema_QNAME, CustomDataSchema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountriesListingFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "CountriesListingFilter")
    public JAXBElement<CountriesListingFilter> createCountriesListingFilter(CountriesListingFilter value) {
        return new JAXBElement<CountriesListingFilter>(_CountriesListingFilter_QNAME, CountriesListingFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportboxListingFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "ReportboxListingFilter")
    public JAXBElement<ReportboxListingFilter> createReportboxListingFilter(ReportboxListingFilter value) {
        return new JAXBElement<ReportboxListingFilter>(_ReportboxListingFilter_QNAME, ReportboxListingFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfolioSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "PortfolioSettings")
    public JAXBElement<PortfolioSettings> createPortfolioSettings(PortfolioSettings value) {
        return new JAXBElement<PortfolioSettings>(_PortfolioSettings_QNAME, PortfolioSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfoliosList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "PortfoliosList")
    public JAXBElement<PortfoliosList> createPortfoliosList(PortfoliosList value) {
        return new JAXBElement<PortfoliosList>(_PortfoliosList_QNAME, PortfoliosList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "SimpleResult")
    public JAXBElement<SimpleResult> createSimpleResult(SimpleResult value) {
        return new JAXBElement<SimpleResult>(_SimpleResult_QNAME, SimpleResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupportedChangeEventsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "SupportedChangeEventsList")
    public JAXBElement<SupportedChangeEventsList> createSupportedChangeEventsList(SupportedChangeEventsList value) {
        return new JAXBElement<SupportedChangeEventsList>(_SupportedChangeEventsList_QNAME, SupportedChangeEventsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountriesList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "CountriesList")
    public JAXBElement<CountriesList> createCountriesList(CountriesList value) {
        return new JAXBElement<CountriesList>(_CountriesList_QNAME, CountriesList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompaniesList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "CompaniesList")
    public JAXBElement<CompaniesList> createCompaniesList(CompaniesList value) {
        return new JAXBElement<CompaniesList>(_CompaniesList_QNAME, CompaniesList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfunsignedInt")
    public JAXBElement<ArrayOfunsignedInt> createArrayOfunsignedInt(ArrayOfunsignedInt value) {
        return new JAXBElement<ArrayOfunsignedInt>(_ArrayOfunsignedInt_QNAME, ArrayOfunsignedInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfolioRemovalResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "PortfolioRemovalResult")
    public JAXBElement<PortfolioRemovalResult> createPortfolioRemovalResult(PortfolioRemovalResult value) {
        return new JAXBElement<PortfolioRemovalResult>(_PortfolioRemovalResult_QNAME, PortfolioRemovalResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportboxContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "ReportboxContents")
    public JAXBElement<ReportboxContents> createReportboxContents(ReportboxContents value) {
        return new JAXBElement<ReportboxContents>(_ReportboxContents_QNAME, ReportboxContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeEventsBasicParamsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "ChangeEventsBasicParamsList")
    public JAXBElement<ChangeEventsBasicParamsList> createChangeEventsBasicParamsList(ChangeEventsBasicParamsList value) {
        return new JAXBElement<ChangeEventsBasicParamsList>(_ChangeEventsBasicParamsList_QNAME, ChangeEventsBasicParamsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfolioCompanyRemovalResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "PortfolioCompanyRemovalResult")
    public JAXBElement<PortfolioCompanyRemovalResult> createPortfolioCompanyRemovalResult(PortfolioCompanyRemovalResult value) {
        return new JAXBElement<PortfolioCompanyRemovalResult>(_PortfolioCompanyRemovalResult_QNAME, PortfolioCompanyRemovalResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfolioCompanyAdditionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "PortfolioCompanyAdditionResult")
    public JAXBElement<PortfolioCompanyAdditionResult> createPortfolioCompanyAdditionResult(PortfolioCompanyAdditionResult value) {
        return new JAXBElement<PortfolioCompanyAdditionResult>(_PortfolioCompanyAdditionResult_QNAME, PortfolioCompanyAdditionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyReferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "CompanyReferences")
    public JAXBElement<CompanyReferences> createCompanyReferences(CompanyReferences value) {
        return new JAXBElement<CompanyReferences>(_CompanyReferences_QNAME, CompanyReferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Creditsafe.GlobalData", name = "ArrayOfCountryCode")
    public JAXBElement<ArrayOfCountryCode> createArrayOfCountryCode(ArrayOfCountryCode value) {
        return new JAXBElement<ArrayOfCountryCode>(_ArrayOfCountryCode_QNAME, ArrayOfCountryCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentPortfolioMonitoringRules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "CurrentPortfolioMonitoringRules")
    public JAXBElement<CurrentPortfolioMonitoringRules> createCurrentPortfolioMonitoringRules(CurrentPortfolioMonitoringRules value) {
        return new JAXBElement<CurrentPortfolioMonitoringRules>(_CurrentPortfolioMonitoringRules_QNAME, CurrentPortfolioMonitoringRules.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.creditsafe.ws.CustomData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "CustomData")
    public JAXBElement<com.creditsafe.ws.CustomData> createCustomData(com.creditsafe.ws.CustomData value) {
        return new JAXBElement<com.creditsafe.ws.CustomData>(_CustomData_QNAME, com.creditsafe.ws.CustomData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteriaSchemaSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "SearchCriteriaSchemaSet")
    public JAXBElement<SearchCriteriaSchemaSet> createSearchCriteriaSchemaSet(SearchCriteriaSchemaSet value) {
        return new JAXBElement<SearchCriteriaSchemaSet>(_SearchCriteriaSchemaSet_QNAME, SearchCriteriaSchemaSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "ServiceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "SearchCriteria")
    public JAXBElement<SearchCriteria> createSearchCriteria(SearchCriteria value) {
        return new JAXBElement<SearchCriteria>(_SearchCriteria_QNAME, SearchCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitoringRules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "MonitoringRules")
    public JAXBElement<MonitoringRules> createMonitoringRules(MonitoringRules value) {
        return new JAXBElement<MonitoringRules>(_MonitoringRules_QNAME, MonitoringRules.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitoredCompaniesList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "MonitoredCompaniesList")
    public JAXBElement<MonitoredCompaniesList> createMonitoredCompaniesList(MonitoredCompaniesList value) {
        return new JAXBElement<MonitoredCompaniesList>(_MonitoredCompaniesList_QNAME, MonitoredCompaniesList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentPortfolioSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "CurrentPortfolioSettings")
    public JAXBElement<CurrentPortfolioSettings> createCurrentPortfolioSettings(CurrentPortfolioSettings value) {
        return new JAXBElement<CurrentPortfolioSettings>(_CurrentPortfolioSettings_QNAME, CurrentPortfolioSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyChangesList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/datatypes", name = "CompanyChangesList")
    public JAXBElement<CompanyChangesList> createCompanyChangesList(CompanyChangesList value) {
        return new JAXBElement<CompanyChangesList>(_CompanyChangesList_QNAME, CompanyChangesList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyReportSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "RetrieveCompanyOnlineReportResult", scope = RetrieveCompanyOnlineReportResponse.class)
    public JAXBElement<CompanyReportSet> createRetrieveCompanyOnlineReportResponseRetrieveCompanyOnlineReportResult(CompanyReportSet value) {
        return new JAXBElement<CompanyReportSet>(_RetrieveCompanyOnlineReportResponseRetrieveCompanyOnlineReportResult_QNAME, CompanyReportSet.class, RetrieveCompanyOnlineReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "report", scope = DeliverOfflineCompanyReport.class)
    public JAXBElement<String> createDeliverOfflineCompanyReportReport(String value) {
        return new JAXBElement<String>(_DeliverOfflineCompanyReportReport_QNAME, String.class, DeliverOfflineCompanyReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.creditsafe.ws.CustomData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "additionalRetrievalData", scope = DeliverOfflineCompanyReport.class)
    public JAXBElement<com.creditsafe.ws.CustomData> createDeliverOfflineCompanyReportAdditionalRetrievalData(com.creditsafe.ws.CustomData value) {
        return new JAXBElement<com.creditsafe.ws.CustomData>(_DeliverOfflineCompanyReportAdditionalRetrievalData_QNAME, com.creditsafe.ws.CustomData.class, DeliverOfflineCompanyReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "onlineRetrievalCriteria", scope = DeliverOfflineCompanyReport.class)
    public JAXBElement<SearchCriteria> createDeliverOfflineCompanyReportOnlineRetrievalCriteria(SearchCriteria value) {
        return new JAXBElement<SearchCriteria>(_DeliverOfflineCompanyReportOnlineRetrievalCriteria_QNAME, SearchCriteria.class, DeliverOfflineCompanyReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportSnapshotsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "ListRealisedOrdersResult", scope = ListRealisedOrdersResponse.class)
    public JAXBElement<ReportSnapshotsList> createListRealisedOrdersResponseListRealisedOrdersResult(ReportSnapshotsList value) {
        return new JAXBElement<ReportSnapshotsList>(_ListRealisedOrdersResponseListRealisedOrdersResult_QNAME, ReportSnapshotsList.class, ListRealisedOrdersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "countries", scope = GetPossibleSearchCriteria.class)
    public JAXBElement<ArrayOfCountryCode> createGetPossibleSearchCriteriaCountries(ArrayOfCountryCode value) {
        return new JAXBElement<ArrayOfCountryCode>(_GetPossibleSearchCriteriaCountries_QNAME, ArrayOfCountryCode.class, GetPossibleSearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "RemovePortfoliosResult", scope = RemovePortfoliosResponse.class)
    public JAXBElement<SimpleResult> createRemovePortfoliosResponseRemovePortfoliosResult(SimpleResult value) {
        return new JAXBElement<SimpleResult>(_RemovePortfoliosResponseRemovePortfoliosResult_QNAME, SimpleResult.class, RemovePortfoliosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "chargeReference", scope = FindCompanies.class)
    public JAXBElement<String> createFindCompaniesChargeReference(String value) {
        return new JAXBElement<String>(_FindCompaniesChargeReference_QNAME, String.class, FindCompanies.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "searchCriteria", scope = FindCompanies.class)
    public JAXBElement<SearchCriteria> createFindCompaniesSearchCriteria(SearchCriteria value) {
        return new JAXBElement<SearchCriteria>(_FindCompaniesSearchCriteria_QNAME, SearchCriteria.class, FindCompanies.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "countries", scope = FindCompanies.class)
    public JAXBElement<ArrayOfCountryCode> createFindCompaniesCountries(ArrayOfCountryCode value) {
        return new JAXBElement<ArrayOfCountryCode>(_GetPossibleSearchCriteriaCountries_QNAME, ArrayOfCountryCode.class, FindCompanies.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.creditsafe.ws.CustomData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "customData", scope = FindCompanies.class)
    public JAXBElement<com.creditsafe.ws.CustomData> createFindCompaniesCustomData(com.creditsafe.ws.CustomData value) {
        return new JAXBElement<com.creditsafe.ws.CustomData>(_FindCompaniesCustomData_QNAME, com.creditsafe.ws.CustomData.class, FindCompanies.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "country", scope = GetSupportedChangeEvents.class)
    public JAXBElement<CountryCode> createGetSupportedChangeEventsCountry(CountryCode value) {
        return new JAXBElement<CountryCode>(_GetSupportedChangeEventsCountry_QNAME, CountryCode.class, GetSupportedChangeEvents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyReferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "companies", scope = ChangeCompaniesReferenceStrings.class)
    public JAXBElement<CompanyReferences> createChangeCompaniesReferenceStringsCompanies(CompanyReferences value) {
        return new JAXBElement<CompanyReferences>(_ChangeCompaniesReferenceStringsCompanies_QNAME, CompanyReferences.class, ChangeCompaniesReferenceStrings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "portfolioIds", scope = ChangeCompaniesReferenceStrings.class)
    public JAXBElement<ArrayOfunsignedInt> createChangeCompaniesReferenceStringsPortfolioIds(ArrayOfunsignedInt value) {
        return new JAXBElement<ArrayOfunsignedInt>(_ChangeCompaniesReferenceStringsPortfolioIds_QNAME, ArrayOfunsignedInt.class, ChangeCompaniesReferenceStrings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "importFile", scope = ImportCompaniesToPortfolio.class)
    public JAXBElement<byte[]> createImportCompaniesToPortfolioImportFile(byte[] value) {
        return new JAXBElement<byte[]>(_ImportCompaniesToPortfolioImportFile_QNAME, byte[].class, ImportCompaniesToPortfolio.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfoliosList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "CreatePortfolioResult", scope = CreatePortfolioResponse.class)
    public JAXBElement<PortfoliosList> createCreatePortfolioResponseCreatePortfolioResult(PortfoliosList value) {
        return new JAXBElement<PortfoliosList>(_CreatePortfolioResponseCreatePortfolioResult_QNAME, PortfoliosList.class, CreatePortfolioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompaniesList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "FindCompaniesResult", scope = FindCompaniesResponse.class)
    public JAXBElement<CompaniesList> createFindCompaniesResponseFindCompaniesResult(CompaniesList value) {
        return new JAXBElement<CompaniesList>(_FindCompaniesResponseFindCompaniesResult_QNAME, CompaniesList.class, FindCompaniesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountriesList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "GetCountriesResult", scope = GetCountriesResponse.class)
    public JAXBElement<CountriesList> createGetCountriesResponseGetCountriesResult(CountriesList value) {
        return new JAXBElement<CountriesList>(_GetCountriesResponseGetCountriesResult_QNAME, CountriesList.class, GetCountriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfflineReportOrdersList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "ListOfflineOrdersResult", scope = ListOfflineOrdersResponse.class)
    public JAXBElement<OfflineReportOrdersList> createListOfflineOrdersResponseListOfflineOrdersResult(OfflineReportOrdersList value) {
        return new JAXBElement<OfflineReportOrdersList>(_ListOfflineOrdersResponseListOfflineOrdersResult_QNAME, OfflineReportOrdersList.class, ListOfflineOrdersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "report", scope = UpdateStoredReport.class)
    public JAXBElement<String> createUpdateStoredReportReport(String value) {
        return new JAXBElement<String>(_DeliverOfflineCompanyReportReport_QNAME, String.class, UpdateStoredReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.creditsafe.ws.CustomData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "additionalRetrievalData", scope = UpdateStoredReport.class)
    public JAXBElement<com.creditsafe.ws.CustomData> createUpdateStoredReportAdditionalRetrievalData(com.creditsafe.ws.CustomData value) {
        return new JAXBElement<com.creditsafe.ws.CustomData>(_DeliverOfflineCompanyReportAdditionalRetrievalData_QNAME, com.creditsafe.ws.CustomData.class, UpdateStoredReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "onlineRetrievalCriteria", scope = UpdateStoredReport.class)
    public JAXBElement<SearchCriteria> createUpdateStoredReportOnlineRetrievalCriteria(SearchCriteria value) {
        return new JAXBElement<SearchCriteria>(_DeliverOfflineCompanyReportOnlineRetrievalCriteria_QNAME, SearchCriteria.class, UpdateStoredReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportboxListingFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "filter", scope = GetReportboxContents.class)
    public JAXBElement<ReportboxListingFilter> createGetReportboxContentsFilter(ReportboxListingFilter value) {
        return new JAXBElement<ReportboxListingFilter>(_GetReportboxContentsFilter_QNAME, ReportboxListingFilter.class, GetReportboxContents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountriesListingFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "filter", scope = GetCountries.class)
    public JAXBElement<CountriesListingFilter> createGetCountriesFilter(CountriesListingFilter value) {
        return new JAXBElement<CountriesListingFilter>(_GetReportboxContentsFilter_QNAME, CountriesListingFilter.class, GetCountries.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "ChangeCompaniesReferenceStringsResult", scope = ChangeCompaniesReferenceStringsResponse.class)
    public JAXBElement<SimpleResult> createChangeCompaniesReferenceStringsResponseChangeCompaniesReferenceStringsResult(SimpleResult value) {
        return new JAXBElement<SimpleResult>(_ChangeCompaniesReferenceStringsResponseChangeCompaniesReferenceStringsResult_QNAME, SimpleResult.class, ChangeCompaniesReferenceStringsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "ids", scope = GetReportboxReports.class)
    public JAXBElement<ArrayOfunsignedInt> createGetReportboxReportsIds(ArrayOfunsignedInt value) {
        return new JAXBElement<ArrayOfunsignedInt>(_GetReportboxReportsIds_QNAME, ArrayOfunsignedInt.class, GetReportboxReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyReportSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "GetReportboxReportsResult", scope = GetReportboxReportsResponse.class)
    public JAXBElement<CompanyReportSet> createGetReportboxReportsResponseGetReportboxReportsResult(CompanyReportSet value) {
        return new JAXBElement<CompanyReportSet>(_GetReportboxReportsResponseGetReportboxReportsResult_QNAME, CompanyReportSet.class, GetReportboxReportsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfolioCompanyRemovalResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "RemoveCompaniesFromPortfoliosResult", scope = RemoveCompaniesFromPortfoliosResponse.class)
    public JAXBElement<PortfolioCompanyRemovalResult> createRemoveCompaniesFromPortfoliosResponseRemoveCompaniesFromPortfoliosResult(PortfolioCompanyRemovalResult value) {
        return new JAXBElement<PortfolioCompanyRemovalResult>(_RemoveCompaniesFromPortfoliosResponseRemoveCompaniesFromPortfoliosResult_QNAME, PortfolioCompanyRemovalResult.class, RemoveCompaniesFromPortfoliosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteriaSchemaSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "GetPossibleSearchCriteriaResult", scope = GetPossibleSearchCriteriaResponse.class)
    public JAXBElement<SearchCriteriaSchemaSet> createGetPossibleSearchCriteriaResponseGetPossibleSearchCriteriaResult(SearchCriteriaSchemaSet value) {
        return new JAXBElement<SearchCriteriaSchemaSet>(_GetPossibleSearchCriteriaResponseGetPossibleSearchCriteriaResult_QNAME, SearchCriteriaSchemaSet.class, GetPossibleSearchCriteriaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "RemoveReportboxReportsResult", scope = RemoveReportboxReportsResponse.class)
    public JAXBElement<SimpleResult> createRemoveReportboxReportsResponseRemoveReportboxReportsResult(SimpleResult value) {
        return new JAXBElement<SimpleResult>(_RemoveReportboxReportsResponseRemoveReportboxReportsResult_QNAME, SimpleResult.class, RemoveReportboxReportsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitoringRules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "newRules", scope = SetMonitoringRules.class)
    public JAXBElement<MonitoringRules> createSetMonitoringRulesNewRules(MonitoringRules value) {
        return new JAXBElement<MonitoringRules>(_SetMonitoringRulesNewRules_QNAME, MonitoringRules.class, SetMonitoringRules.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "changedSince", scope = ListMonitoredCompanies.class)
    public JAXBElement<XMLGregorianCalendar> createListMonitoredCompaniesChangedSince(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ListMonitoredCompaniesChangedSince_QNAME, XMLGregorianCalendar.class, ListMonitoredCompanies.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "portfolioIds", scope = ListMonitoredCompanies.class)
    public JAXBElement<ArrayOfunsignedInt> createListMonitoredCompaniesPortfolioIds(ArrayOfunsignedInt value) {
        return new JAXBElement<ArrayOfunsignedInt>(_ChangeCompaniesReferenceStringsPortfolioIds_QNAME, ArrayOfunsignedInt.class, ListMonitoredCompanies.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "SetDefaultChangesCheckPeriodResult", scope = SetDefaultChangesCheckPeriodResponse.class)
    public JAXBElement<SimpleResult> createSetDefaultChangesCheckPeriodResponseSetDefaultChangesCheckPeriodResult(SimpleResult value) {
        return new JAXBElement<SimpleResult>(_SetDefaultChangesCheckPeriodResponseSetDefaultChangesCheckPeriodResult_QNAME, SimpleResult.class, SetDefaultChangesCheckPeriodResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "chargeReference", scope = OrderCompanyOfflineReport.class)
    public JAXBElement<String> createOrderCompanyOfflineReportChargeReference(String value) {
        return new JAXBElement<String>(_FindCompaniesChargeReference_QNAME, String.class, OrderCompanyOfflineReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "searchCriteria", scope = OrderCompanyOfflineReport.class)
    public JAXBElement<SearchCriteria> createOrderCompanyOfflineReportSearchCriteria(SearchCriteria value) {
        return new JAXBElement<SearchCriteria>(_FindCompaniesSearchCriteria_QNAME, SearchCriteria.class, OrderCompanyOfflineReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.creditsafe.ws.CustomData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "customData", scope = OrderCompanyOfflineReport.class)
    public JAXBElement<com.creditsafe.ws.CustomData> createOrderCompanyOfflineReportCustomData(com.creditsafe.ws.CustomData value) {
        return new JAXBElement<com.creditsafe.ws.CustomData>(_FindCompaniesCustomData_QNAME, com.creditsafe.ws.CustomData.class, OrderCompanyOfflineReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "SetMonitoringRulesResult", scope = SetMonitoringRulesResponse.class)
    public JAXBElement<SimpleResult> createSetMonitoringRulesResponseSetMonitoringRulesResult(SimpleResult value) {
        return new JAXBElement<SimpleResult>(_SetMonitoringRulesResponseSetMonitoringRulesResult_QNAME, SimpleResult.class, SetMonitoringRulesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentPortfolioMonitoringRules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "GetMonitoringRulesResult", scope = GetMonitoringRulesResponse.class)
    public JAXBElement<CurrentPortfolioMonitoringRules> createGetMonitoringRulesResponseGetMonitoringRulesResult(CurrentPortfolioMonitoringRules value) {
        return new JAXBElement<CurrentPortfolioMonitoringRules>(_GetMonitoringRulesResponseGetMonitoringRulesResult_QNAME, CurrentPortfolioMonitoringRules.class, GetMonitoringRulesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "MarkFailedOfflineOrderResult", scope = MarkFailedOfflineOrderResponse.class)
    public JAXBElement<SimpleResult> createMarkFailedOfflineOrderResponseMarkFailedOfflineOrderResult(SimpleResult value) {
        return new JAXBElement<SimpleResult>(_MarkFailedOfflineOrderResponseMarkFailedOfflineOrderResult_QNAME, SimpleResult.class, MarkFailedOfflineOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "DeliverOfflineCompanyReportResult", scope = DeliverOfflineCompanyReportResponse.class)
    public JAXBElement<SimpleResult> createDeliverOfflineCompanyReportResponseDeliverOfflineCompanyReportResult(SimpleResult value) {
        return new JAXBElement<SimpleResult>(_DeliverOfflineCompanyReportResponseDeliverOfflineCompanyReportResult_QNAME, SimpleResult.class, DeliverOfflineCompanyReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfolioCompanyAdditionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "AddCompaniesToPortfoliosResult", scope = AddCompaniesToPortfoliosResponse.class)
    public JAXBElement<PortfolioCompanyAdditionResult> createAddCompaniesToPortfoliosResponseAddCompaniesToPortfoliosResult(PortfolioCompanyAdditionResult value) {
        return new JAXBElement<PortfolioCompanyAdditionResult>(_AddCompaniesToPortfoliosResponseAddCompaniesToPortfoliosResult_QNAME, PortfolioCompanyAdditionResult.class, AddCompaniesToPortfoliosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "SetPortfolioSettingsResult", scope = SetPortfolioSettingsResponse.class)
    public JAXBElement<SimpleResult> createSetPortfolioSettingsResponseSetPortfolioSettingsResult(SimpleResult value) {
        return new JAXBElement<SimpleResult>(_SetPortfolioSettingsResponseSetPortfolioSettingsResult_QNAME, SimpleResult.class, SetPortfolioSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfolioSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "newSettings", scope = SetPortfolioSettings.class)
    public JAXBElement<PortfolioSettings> createSetPortfolioSettingsNewSettings(PortfolioSettings value) {
        return new JAXBElement<PortfolioSettings>(_SetPortfolioSettingsNewSettings_QNAME, PortfolioSettings.class, SetPortfolioSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyReportSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "TryRetrieveCompanyOnlineReportResult", scope = TryRetrieveCompanyOnlineReportResponse.class)
    public JAXBElement<CompanyReportSet> createTryRetrieveCompanyOnlineReportResponseTryRetrieveCompanyOnlineReportResult(CompanyReportSet value) {
        return new JAXBElement<CompanyReportSet>(_TryRetrieveCompanyOnlineReportResponseTryRetrieveCompanyOnlineReportResult_QNAME, CompanyReportSet.class, TryRetrieveCompanyOnlineReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "orderNumber", scope = ListRealisedOrders.class)
    public JAXBElement<BigInteger> createListRealisedOrdersOrderNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_ListRealisedOrdersOrderNumber_QNAME, BigInteger.class, ListRealisedOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "countryCode", scope = ListRealisedOrders.class)
    public JAXBElement<CountryCode> createListRealisedOrdersCountryCode(CountryCode value) {
        return new JAXBElement<CountryCode>(_ListRealisedOrdersCountryCode_QNAME, CountryCode.class, ListRealisedOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "newerThan", scope = ListRealisedOrders.class)
    public JAXBElement<XMLGregorianCalendar> createListRealisedOrdersNewerThan(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ListRealisedOrdersNewerThan_QNAME, XMLGregorianCalendar.class, ListRealisedOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "olderThan", scope = ListRealisedOrders.class)
    public JAXBElement<XMLGregorianCalendar> createListRealisedOrdersOlderThan(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ListRealisedOrdersOlderThan_QNAME, XMLGregorianCalendar.class, ListRealisedOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "successfulDelivery", scope = ListRealisedOrders.class)
    public JAXBElement<Boolean> createListRealisedOrdersSuccessfulDelivery(Boolean value) {
        return new JAXBElement<Boolean>(_ListRealisedOrdersSuccessfulDelivery_QNAME, Boolean.class, ListRealisedOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "userId", scope = ListRealisedOrders.class)
    public JAXBElement<Long> createListRealisedOrdersUserId(Long value) {
        return new JAXBElement<Long>(_ListRealisedOrdersUserId_QNAME, Long.class, ListRealisedOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "UpdateStoredReportResult", scope = UpdateStoredReportResponse.class)
    public JAXBElement<SimpleResult> createUpdateStoredReportResponseUpdateStoredReportResult(SimpleResult value) {
        return new JAXBElement<SimpleResult>(_UpdateStoredReportResponseUpdateStoredReportResult_QNAME, SimpleResult.class, UpdateStoredReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "changedSince", scope = GetPortfolios.class)
    public JAXBElement<XMLGregorianCalendar> createGetPortfoliosChangedSince(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ListMonitoredCompaniesChangedSince_QNAME, XMLGregorianCalendar.class, GetPortfolios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "portfolioIds", scope = GetPortfolios.class)
    public JAXBElement<ArrayOfunsignedInt> createGetPortfoliosPortfolioIds(ArrayOfunsignedInt value) {
        return new JAXBElement<ArrayOfunsignedInt>(_ChangeCompaniesReferenceStringsPortfolioIds_QNAME, ArrayOfunsignedInt.class, GetPortfolios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupportedChangeEventsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "GetSupportedChangeEventsResult", scope = GetSupportedChangeEventsResponse.class)
    public JAXBElement<SupportedChangeEventsList> createGetSupportedChangeEventsResponseGetSupportedChangeEventsResult(SupportedChangeEventsList value) {
        return new JAXBElement<SupportedChangeEventsList>(_GetSupportedChangeEventsResponseGetSupportedChangeEventsResult_QNAME, SupportedChangeEventsList.class, GetSupportedChangeEventsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyReferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "companies", scope = AddCompaniesToPortfolios.class)
    public JAXBElement<CompanyReferences> createAddCompaniesToPortfoliosCompanies(CompanyReferences value) {
        return new JAXBElement<CompanyReferences>(_ChangeCompaniesReferenceStringsCompanies_QNAME, CompanyReferences.class, AddCompaniesToPortfolios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "portfolioIds", scope = AddCompaniesToPortfolios.class)
    public JAXBElement<ArrayOfunsignedInt> createAddCompaniesToPortfoliosPortfolioIds(ArrayOfunsignedInt value) {
        return new JAXBElement<ArrayOfunsignedInt>(_ChangeCompaniesReferenceStringsPortfolioIds_QNAME, ArrayOfunsignedInt.class, AddCompaniesToPortfolios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitoredCompaniesList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "ListMonitoredCompaniesResult", scope = ListMonitoredCompaniesResponse.class)
    public JAXBElement<MonitoredCompaniesList> createListMonitoredCompaniesResponseListMonitoredCompaniesResult(MonitoredCompaniesList value) {
        return new JAXBElement<MonitoredCompaniesList>(_ListMonitoredCompaniesResponseListMonitoredCompaniesResult_QNAME, MonitoredCompaniesList.class, ListMonitoredCompaniesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomDataSchema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "GetReportCustomDataSchemaResult", scope = GetReportCustomDataSchemaResponse.class)
    public JAXBElement<CustomDataSchema> createGetReportCustomDataSchemaResponseGetReportCustomDataSchemaResult(CustomDataSchema value) {
        return new JAXBElement<CustomDataSchema>(_GetReportCustomDataSchemaResponseGetReportCustomDataSchemaResult_QNAME, CustomDataSchema.class, GetReportCustomDataSchemaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "chargeReference", scope = TryRetrieveCompanyOnlineReport.class)
    public JAXBElement<String> createTryRetrieveCompanyOnlineReportChargeReference(String value) {
        return new JAXBElement<String>(_FindCompaniesChargeReference_QNAME, String.class, TryRetrieveCompanyOnlineReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "searchCriteria", scope = TryRetrieveCompanyOnlineReport.class)
    public JAXBElement<SearchCriteria> createTryRetrieveCompanyOnlineReportSearchCriteria(SearchCriteria value) {
        return new JAXBElement<SearchCriteria>(_FindCompaniesSearchCriteria_QNAME, SearchCriteria.class, TryRetrieveCompanyOnlineReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.creditsafe.ws.CustomData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "customData", scope = TryRetrieveCompanyOnlineReport.class)
    public JAXBElement<com.creditsafe.ws.CustomData> createTryRetrieveCompanyOnlineReportCustomData(com.creditsafe.ws.CustomData value) {
        return new JAXBElement<com.creditsafe.ws.CustomData>(_FindCompaniesCustomData_QNAME, com.creditsafe.ws.CustomData.class, TryRetrieveCompanyOnlineReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "portfolioIds", scope = TryRetrieveCompanyOnlineReport.class)
    public JAXBElement<ArrayOfunsignedInt> createTryRetrieveCompanyOnlineReportPortfolioIds(ArrayOfunsignedInt value) {
        return new JAXBElement<ArrayOfunsignedInt>(_ChangeCompaniesReferenceStringsPortfolioIds_QNAME, ArrayOfunsignedInt.class, TryRetrieveCompanyOnlineReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "OrderCompanyOfflineReportResult", scope = OrderCompanyOfflineReportResponse.class)
    public JAXBElement<ReportOrder> createOrderCompanyOfflineReportResponseOrderCompanyOfflineReportResult(ReportOrder value) {
        return new JAXBElement<ReportOrder>(_OrderCompanyOfflineReportResponseOrderCompanyOfflineReportResult_QNAME, ReportOrder.class, OrderCompanyOfflineReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "companyIds", scope = RemoveCompaniesFromPortfolios.class)
    public JAXBElement<ArrayOfstring> createRemoveCompaniesFromPortfoliosCompanyIds(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_RemoveCompaniesFromPortfoliosCompanyIds_QNAME, ArrayOfstring.class, RemoveCompaniesFromPortfolios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "portfolioIds", scope = RemoveCompaniesFromPortfolios.class)
    public JAXBElement<ArrayOfunsignedInt> createRemoveCompaniesFromPortfoliosPortfolioIds(ArrayOfunsignedInt value) {
        return new JAXBElement<ArrayOfunsignedInt>(_ChangeCompaniesReferenceStringsPortfolioIds_QNAME, ArrayOfunsignedInt.class, RemoveCompaniesFromPortfolios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportSnapshot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "GetStoredReportResult", scope = GetStoredReportResponse.class)
    public JAXBElement<ReportSnapshot> createGetStoredReportResponseGetStoredReportResult(ReportSnapshot value) {
        return new JAXBElement<ReportSnapshot>(_GetStoredReportResponseGetStoredReportResult_QNAME, ReportSnapshot.class, GetStoredReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "ids", scope = RemoveReportboxReports.class)
    public JAXBElement<ArrayOfunsignedInt> createRemoveReportboxReportsIds(ArrayOfunsignedInt value) {
        return new JAXBElement<ArrayOfunsignedInt>(_GetReportboxReportsIds_QNAME, ArrayOfunsignedInt.class, RemoveReportboxReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportboxContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "GetReportboxContentsResult", scope = GetReportboxContentsResponse.class)
    public JAXBElement<ReportboxContents> createGetReportboxContentsResponseGetReportboxContentsResult(ReportboxContents value) {
        return new JAXBElement<ReportboxContents>(_GetReportboxContentsResponseGetReportboxContentsResult_QNAME, ReportboxContents.class, GetReportboxContentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "portfolioIds", scope = RemovePortfolios.class)
    public JAXBElement<ArrayOfunsignedInt> createRemovePortfoliosPortfolioIds(ArrayOfunsignedInt value) {
        return new JAXBElement<ArrayOfunsignedInt>(_ChangeCompaniesReferenceStringsPortfolioIds_QNAME, ArrayOfunsignedInt.class, RemovePortfolios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfolioSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "settings", scope = CreatePortfolio.class)
    public JAXBElement<PortfolioSettings> createCreatePortfolioSettings(PortfolioSettings value) {
        return new JAXBElement<PortfolioSettings>(_CreatePortfolioSettings_QNAME, PortfolioSettings.class, CreatePortfolio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "orderNumber", scope = ListOfflineOrders.class)
    public JAXBElement<BigInteger> createListOfflineOrdersOrderNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_ListRealisedOrdersOrderNumber_QNAME, BigInteger.class, ListOfflineOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "countryCode", scope = ListOfflineOrders.class)
    public JAXBElement<CountryCode> createListOfflineOrdersCountryCode(CountryCode value) {
        return new JAXBElement<CountryCode>(_ListRealisedOrdersCountryCode_QNAME, CountryCode.class, ListOfflineOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfoliosList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "GetPortfoliosResult", scope = GetPortfoliosResponse.class)
    public JAXBElement<PortfoliosList> createGetPortfoliosResponseGetPortfoliosResult(PortfoliosList value) {
        return new JAXBElement<PortfoliosList>(_GetPortfoliosResponseGetPortfoliosResult_QNAME, PortfoliosList.class, GetPortfoliosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.creditsafe.ws.CustomData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations/administration", name = "additionalData", scope = MarkFailedOfflineOrder.class)
    public JAXBElement<com.creditsafe.ws.CustomData> createMarkFailedOfflineOrderAdditionalData(com.creditsafe.ws.CustomData value) {
        return new JAXBElement<com.creditsafe.ws.CustomData>(_MarkFailedOfflineOrderAdditionalData_QNAME, com.creditsafe.ws.CustomData.class, MarkFailedOfflineOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "companyId", scope = RetrieveCompanyOnlineReport.class)
    public JAXBElement<String> createRetrieveCompanyOnlineReportCompanyId(String value) {
        return new JAXBElement<String>(_RetrieveCompanyOnlineReportCompanyId_QNAME, String.class, RetrieveCompanyOnlineReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "chargeReference", scope = RetrieveCompanyOnlineReport.class)
    public JAXBElement<String> createRetrieveCompanyOnlineReportChargeReference(String value) {
        return new JAXBElement<String>(_FindCompaniesChargeReference_QNAME, String.class, RetrieveCompanyOnlineReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.creditsafe.ws.CustomData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "customData", scope = RetrieveCompanyOnlineReport.class)
    public JAXBElement<com.creditsafe.ws.CustomData> createRetrieveCompanyOnlineReportCustomData(com.creditsafe.ws.CustomData value) {
        return new JAXBElement<com.creditsafe.ws.CustomData>(_FindCompaniesCustomData_QNAME, com.creditsafe.ws.CustomData.class, RetrieveCompanyOnlineReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "portfolioIds", scope = RetrieveCompanyOnlineReport.class)
    public JAXBElement<ArrayOfunsignedInt> createRetrieveCompanyOnlineReportPortfolioIds(ArrayOfunsignedInt value) {
        return new JAXBElement<ArrayOfunsignedInt>(_ChangeCompaniesReferenceStringsPortfolioIds_QNAME, ArrayOfunsignedInt.class, RetrieveCompanyOnlineReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "monitoringReference", scope = RetrieveCompanyOnlineReport.class)
    public JAXBElement<String> createRetrieveCompanyOnlineReportMonitoringReference(String value) {
        return new JAXBElement<String>(_RetrieveCompanyOnlineReportMonitoringReference_QNAME, String.class, RetrieveCompanyOnlineReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentPortfolioSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "GetPortfolioSettingsResult", scope = GetPortfolioSettingsResponse.class)
    public JAXBElement<CurrentPortfolioSettings> createGetPortfolioSettingsResponseGetPortfolioSettingsResult(CurrentPortfolioSettings value) {
        return new JAXBElement<CurrentPortfolioSettings>(_GetPortfolioSettingsResponseGetPortfolioSettingsResult_QNAME, CurrentPortfolioSettings.class, GetPortfolioSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "days", scope = SetDefaultChangesCheckPeriod.class)
    public JAXBElement<Long> createSetDefaultChangesCheckPeriodDays(Long value) {
        return new JAXBElement<Long>(_SetDefaultChangesCheckPeriodDays_QNAME, Long.class, SetDefaultChangesCheckPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfolioCompanyAdditionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creditsafe.com/globaldata/operations", name = "ImportCompaniesToPortfolioResult", scope = ImportCompaniesToPortfolioResponse.class)
    public JAXBElement<PortfolioCompanyAdditionResult> createImportCompaniesToPortfolioResponseImportCompaniesToPortfolioResult(PortfolioCompanyAdditionResult value) {
        return new JAXBElement<PortfolioCompanyAdditionResult>(_ImportCompaniesToPortfolioResponseImportCompaniesToPortfolioResult_QNAME, PortfolioCompanyAdditionResult.class, ImportCompaniesToPortfolioResponse.class, value);
    }

}
