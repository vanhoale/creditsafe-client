
package com.creditsafe.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GlobalDataService", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GlobalDataService {


    /**
     * 
     * @param portfolioIds
     * @param changedSince
     * @return
     *     returns com.creditsafe.ws.PortfoliosList
     */
    @WebMethod(operationName = "GetPortfolios", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/GetPortfolios")
    @WebResult(name = "GetPortfoliosResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "GetPortfolios", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetPortfolios")
    @ResponseWrapper(localName = "GetPortfoliosResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetPortfoliosResponse")
    public PortfoliosList getPortfolios(
        @WebParam(name = "portfolioIds", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ArrayOfunsignedInt portfolioIds,
        @WebParam(name = "changedSince", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        XMLGregorianCalendar changedSince);

    /**
     * 
     * @param changedOnly
     * @param pageSize
     * @param portfolioIds
     * @param changedSince
     * @param firstPosition
     * @return
     *     returns com.creditsafe.ws.MonitoredCompaniesList
     */
    @WebMethod(operationName = "ListMonitoredCompanies", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/ListMonitoredCompanies")
    @WebResult(name = "ListMonitoredCompaniesResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "ListMonitoredCompanies", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.ListMonitoredCompanies")
    @ResponseWrapper(localName = "ListMonitoredCompaniesResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.ListMonitoredCompaniesResponse")
    public MonitoredCompaniesList listMonitoredCompanies(
        @WebParam(name = "portfolioIds", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ArrayOfunsignedInt portfolioIds,
        @WebParam(name = "changedOnly", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Boolean changedOnly,
        @WebParam(name = "changedSince", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        XMLGregorianCalendar changedSince,
        @WebParam(name = "firstPosition", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Long firstPosition,
        @WebParam(name = "pageSize", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Long pageSize);

    /**
     * 
     * @param settings
     * @return
     *     returns com.creditsafe.ws.PortfoliosList
     */
    @WebMethod(operationName = "CreatePortfolio", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/CreatePortfolio")
    @WebResult(name = "CreatePortfolioResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "CreatePortfolio", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.CreatePortfolio")
    @ResponseWrapper(localName = "CreatePortfolioResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.CreatePortfolioResponse")
    public PortfoliosList createPortfolio(
        @WebParam(name = "settings", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        PortfolioSettings settings);

    /**
     * 
     * @param portfolioIds
     * @return
     *     returns com.creditsafe.ws.SimpleResult
     */
    @WebMethod(operationName = "RemovePortfolios", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/RemovePortfolios")
    @WebResult(name = "RemovePortfoliosResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "RemovePortfolios", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.RemovePortfolios")
    @ResponseWrapper(localName = "RemovePortfoliosResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.RemovePortfoliosResponse")
    public SimpleResult removePortfolios(
        @WebParam(name = "portfolioIds", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ArrayOfunsignedInt portfolioIds);

    /**
     * 
     * @param portfolioId
     * @return
     *     returns com.creditsafe.ws.CurrentPortfolioSettings
     */
    @WebMethod(operationName = "GetPortfolioSettings", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/GetPortfolioSettings")
    @WebResult(name = "GetPortfolioSettingsResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "GetPortfolioSettings", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetPortfolioSettings")
    @ResponseWrapper(localName = "GetPortfolioSettingsResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetPortfolioSettingsResponse")
    public CurrentPortfolioSettings getPortfolioSettings(
        @WebParam(name = "portfolioId", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Long portfolioId);

    /**
     * 
     * @param portfolioId
     * @param newSettings
     * @return
     *     returns com.creditsafe.ws.SimpleResult
     */
    @WebMethod(operationName = "SetPortfolioSettings", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/SetPortfolioSettings")
    @WebResult(name = "SetPortfolioSettingsResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "SetPortfolioSettings", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.SetPortfolioSettings")
    @ResponseWrapper(localName = "SetPortfolioSettingsResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.SetPortfolioSettingsResponse")
    public SimpleResult setPortfolioSettings(
        @WebParam(name = "portfolioId", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Long portfolioId,
        @WebParam(name = "newSettings", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        PortfolioSettings newSettings);

    /**
     * 
     * @param companies
     * @param portfolioIds
     * @return
     *     returns com.creditsafe.ws.PortfolioCompanyAdditionResult
     */
    @WebMethod(operationName = "AddCompaniesToPortfolios", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/AddCompaniesToPortfolios")
    @WebResult(name = "AddCompaniesToPortfoliosResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "AddCompaniesToPortfolios", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.AddCompaniesToPortfolios")
    @ResponseWrapper(localName = "AddCompaniesToPortfoliosResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.AddCompaniesToPortfoliosResponse")
    public PortfolioCompanyAdditionResult addCompaniesToPortfolios(
        @WebParam(name = "portfolioIds", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ArrayOfunsignedInt portfolioIds,
        @WebParam(name = "companies", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CompanyReferences companies);

    /**
     * 
     * @param portfolioId
     * @param importFile
     * @param fileFormat
     * @return
     *     returns com.creditsafe.ws.PortfolioCompanyAdditionResult
     */
    @WebMethod(operationName = "ImportCompaniesToPortfolio", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/ImportCompaniesToPortfolio")
    @WebResult(name = "ImportCompaniesToPortfolioResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "ImportCompaniesToPortfolio", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.ImportCompaniesToPortfolio")
    @ResponseWrapper(localName = "ImportCompaniesToPortfolioResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.ImportCompaniesToPortfolioResponse")
    public PortfolioCompanyAdditionResult importCompaniesToPortfolio(
        @WebParam(name = "portfolioId", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Long portfolioId,
        @WebParam(name = "fileFormat", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        FileFormat fileFormat,
        @WebParam(name = "importFile", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        byte[] importFile);

    /**
     * 
     * @param companyIds
     * @param portfolioIds
     * @return
     *     returns com.creditsafe.ws.PortfolioCompanyRemovalResult
     */
    @WebMethod(operationName = "RemoveCompaniesFromPortfolios", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/RemoveCompaniesFromPortfolios")
    @WebResult(name = "RemoveCompaniesFromPortfoliosResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "RemoveCompaniesFromPortfolios", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.RemoveCompaniesFromPortfolios")
    @ResponseWrapper(localName = "RemoveCompaniesFromPortfoliosResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.RemoveCompaniesFromPortfoliosResponse")
    public PortfolioCompanyRemovalResult removeCompaniesFromPortfolios(
        @WebParam(name = "portfolioIds", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ArrayOfunsignedInt portfolioIds,
        @WebParam(name = "companyIds", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ArrayOfstring companyIds);

    /**
     * 
     * @param companies
     * @param portfolioIds
     * @return
     *     returns com.creditsafe.ws.SimpleResult
     */
    @WebMethod(operationName = "ChangeCompaniesReferenceStrings", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/ChangeCompaniesReferenceStrings")
    @WebResult(name = "ChangeCompaniesReferenceStringsResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "ChangeCompaniesReferenceStrings", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.ChangeCompaniesReferenceStrings")
    @ResponseWrapper(localName = "ChangeCompaniesReferenceStringsResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.ChangeCompaniesReferenceStringsResponse")
    public SimpleResult changeCompaniesReferenceStrings(
        @WebParam(name = "portfolioIds", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ArrayOfunsignedInt portfolioIds,
        @WebParam(name = "companies", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CompanyReferences companies);

    /**
     * 
     * @param country
     * @param language
     * @return
     *     returns com.creditsafe.ws.SupportedChangeEventsList
     */
    @WebMethod(operationName = "GetSupportedChangeEvents", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/GetSupportedChangeEvents")
    @WebResult(name = "GetSupportedChangeEventsResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "GetSupportedChangeEvents", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetSupportedChangeEvents")
    @ResponseWrapper(localName = "GetSupportedChangeEventsResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetSupportedChangeEventsResponse")
    public SupportedChangeEventsList getSupportedChangeEvents(
        @WebParam(name = "country", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CountryCode country,
        @WebParam(name = "language", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Language language);

    /**
     * 
     * @param portfolioId
     * @return
     *     returns com.creditsafe.ws.CurrentPortfolioMonitoringRules
     */
    @WebMethod(operationName = "GetMonitoringRules", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/GetMonitoringRules")
    @WebResult(name = "GetMonitoringRulesResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "GetMonitoringRules", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetMonitoringRules")
    @ResponseWrapper(localName = "GetMonitoringRulesResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetMonitoringRulesResponse")
    public CurrentPortfolioMonitoringRules getMonitoringRules(
        @WebParam(name = "portfolioId", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Long portfolioId);

    /**
     * 
     * @param portfolioId
     * @param newRules
     * @return
     *     returns com.creditsafe.ws.SimpleResult
     */
    @WebMethod(operationName = "SetMonitoringRules", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/SetMonitoringRules")
    @WebResult(name = "SetMonitoringRulesResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "SetMonitoringRules", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.SetMonitoringRules")
    @ResponseWrapper(localName = "SetMonitoringRulesResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.SetMonitoringRulesResponse")
    public SimpleResult setMonitoringRules(
        @WebParam(name = "portfolioId", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Long portfolioId,
        @WebParam(name = "newRules", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        MonitoringRules newRules);

    /**
     * 
     * @param days
     * @return
     *     returns com.creditsafe.ws.SimpleResult
     */
    @WebMethod(operationName = "SetDefaultChangesCheckPeriod", action = "http://www.creditsafe.com/globaldata/operations/CompanyMonitoringService/SetDefaultChangesCheckPeriod")
    @WebResult(name = "SetDefaultChangesCheckPeriodResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "SetDefaultChangesCheckPeriod", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.SetDefaultChangesCheckPeriod")
    @ResponseWrapper(localName = "SetDefaultChangesCheckPeriodResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.SetDefaultChangesCheckPeriodResponse")
    public SimpleResult setDefaultChangesCheckPeriod(
        @WebParam(name = "days", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Long days);

    /**
     * 
     * @param reportType
     * @param companyId
     * @param storeInReportbox
     * @param chargeReference
     * @param language
     * @param customData
     * @param portfolioIds
     * @param monitoringReference
     * @return
     *     returns com.creditsafe.ws.CompanyReportSet
     */
    @WebMethod(operationName = "RetrieveCompanyOnlineReport", action = "http://www.creditsafe.com/globaldata/operations/CompanyDataAccessService/RetrieveCompanyOnlineReport")
    @WebResult(name = "RetrieveCompanyOnlineReportResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "RetrieveCompanyOnlineReport", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.RetrieveCompanyOnlineReport")
    @ResponseWrapper(localName = "RetrieveCompanyOnlineReportResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.RetrieveCompanyOnlineReportResponse")
    public CompanyReportSet retrieveCompanyOnlineReport(
        @WebParam(name = "companyId", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        String companyId,
        @WebParam(name = "reportType", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CompanyReportType reportType,
        @WebParam(name = "language", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Language language,
        @WebParam(name = "customData", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CustomData customData,
        @WebParam(name = "chargeReference", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        String chargeReference,
        @WebParam(name = "storeInReportbox", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Boolean storeInReportbox,
        @WebParam(name = "portfolioIds", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ArrayOfunsignedInt portfolioIds,
        @WebParam(name = "monitoringReference", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        String monitoringReference);

    /**
     * 
     * @param reportType
     * @param country
     * @param searchCriteria
     * @param storeInReportbox
     * @param chargeReference
     * @param language
     * @param customData
     * @param portfolioIds
     * @return
     *     returns com.creditsafe.ws.CompanyReportSet
     */
    @WebMethod(operationName = "TryRetrieveCompanyOnlineReport", action = "http://www.creditsafe.com/globaldata/operations/CompanyDataAccessService/TryRetrieveCompanyOnlineReport")
    @WebResult(name = "TryRetrieveCompanyOnlineReportResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "TryRetrieveCompanyOnlineReport", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.TryRetrieveCompanyOnlineReport")
    @ResponseWrapper(localName = "TryRetrieveCompanyOnlineReportResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.TryRetrieveCompanyOnlineReportResponse")
    public CompanyReportSet tryRetrieveCompanyOnlineReport(
        @WebParam(name = "country", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CountryCode country,
        @WebParam(name = "searchCriteria", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        SearchCriteria searchCriteria,
        @WebParam(name = "reportType", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CompanyReportType reportType,
        @WebParam(name = "language", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Language language,
        @WebParam(name = "customData", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CustomData customData,
        @WebParam(name = "chargeReference", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        String chargeReference,
        @WebParam(name = "storeInReportbox", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Boolean storeInReportbox,
        @WebParam(name = "portfolioIds", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ArrayOfunsignedInt portfolioIds);

    /**
     * 
     * @param reportType
     * @param country
     * @param searchCriteria
     * @param chargeReference
     * @param language
     * @param customData
     * @return
     *     returns com.creditsafe.ws.ReportOrder
     */
    @WebMethod(operationName = "OrderCompanyOfflineReport", action = "http://www.creditsafe.com/globaldata/operations/CompanyDataAccessService/OrderCompanyOfflineReport")
    @WebResult(name = "OrderCompanyOfflineReportResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "OrderCompanyOfflineReport", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.OrderCompanyOfflineReport")
    @ResponseWrapper(localName = "OrderCompanyOfflineReportResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.OrderCompanyOfflineReportResponse")
    public ReportOrder orderCompanyOfflineReport(
        @WebParam(name = "country", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CountryCode country,
        @WebParam(name = "searchCriteria", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        SearchCriteria searchCriteria,
        @WebParam(name = "reportType", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CompanyReportType reportType,
        @WebParam(name = "language", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        Language language,
        @WebParam(name = "customData", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CustomData customData,
        @WebParam(name = "chargeReference", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        String chargeReference);

    /**
     * 
     * @param filter
     * @return
     *     returns com.creditsafe.ws.ReportboxContents
     */
    @WebMethod(operationName = "GetReportboxContents", action = "http://www.creditsafe.com/globaldata/operations/CompanyDataAccessService/GetReportboxContents")
    @WebResult(name = "GetReportboxContentsResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "GetReportboxContents", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetReportboxContents")
    @ResponseWrapper(localName = "GetReportboxContentsResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetReportboxContentsResponse")
    public ReportboxContents getReportboxContents(
        @WebParam(name = "filter", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ReportboxListingFilter filter);

    /**
     * 
     * @param ids
     * @return
     *     returns com.creditsafe.ws.CompanyReportSet
     */
    @WebMethod(operationName = "GetReportboxReports", action = "http://www.creditsafe.com/globaldata/operations/CompanyDataAccessService/GetReportboxReports")
    @WebResult(name = "GetReportboxReportsResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "GetReportboxReports", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetReportboxReports")
    @ResponseWrapper(localName = "GetReportboxReportsResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetReportboxReportsResponse")
    public CompanyReportSet getReportboxReports(
        @WebParam(name = "ids", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ArrayOfunsignedInt ids);

    /**
     * 
     * @param ids
     * @return
     *     returns com.creditsafe.ws.SimpleResult
     */
    @WebMethod(operationName = "RemoveReportboxReports", action = "http://www.creditsafe.com/globaldata/operations/CompanyDataAccessService/RemoveReportboxReports")
    @WebResult(name = "RemoveReportboxReportsResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "RemoveReportboxReports", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.RemoveReportboxReports")
    @ResponseWrapper(localName = "RemoveReportboxReportsResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.RemoveReportboxReportsResponse")
    public SimpleResult removeReportboxReports(
        @WebParam(name = "ids", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ArrayOfunsignedInt ids);

    /**
     * 
     * @param filter
     * @return
     *     returns com.creditsafe.ws.CountriesList
     */
    @WebMethod(operationName = "GetCountries", action = "http://www.creditsafe.com/globaldata/operations/DataBrowsingService/GetCountries")
    @WebResult(name = "GetCountriesResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "GetCountries", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetCountries")
    @ResponseWrapper(localName = "GetCountriesResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetCountriesResponse")
    public CountriesList getCountries(
        @WebParam(name = "filter", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CountriesListingFilter filter);

    /**
     * 
     * @param countries
     * @return
     *     returns com.creditsafe.ws.SearchCriteriaSchemaSet
     */
    @WebMethod(operationName = "GetPossibleSearchCriteria", action = "http://www.creditsafe.com/globaldata/operations/DataBrowsingService/GetPossibleSearchCriteria")
    @WebResult(name = "GetPossibleSearchCriteriaResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "GetPossibleSearchCriteria", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetPossibleSearchCriteria")
    @ResponseWrapper(localName = "GetPossibleSearchCriteriaResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetPossibleSearchCriteriaResponse")
    public SearchCriteriaSchemaSet getPossibleSearchCriteria(
        @WebParam(name = "countries", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ArrayOfCountryCode countries);

    /**
     * 
     * @param searchCriteria
     * @param chargeReference
     * @param customData
     * @param countries
     * @return
     *     returns com.creditsafe.ws.CompaniesList
     */
    @WebMethod(operationName = "FindCompanies", action = "http://www.creditsafe.com/globaldata/operations/DataBrowsingService/FindCompanies")
    @WebResult(name = "FindCompaniesResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "FindCompanies", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.FindCompanies")
    @ResponseWrapper(localName = "FindCompaniesResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.FindCompaniesResponse")
    public CompaniesList findCompanies(
        @WebParam(name = "countries", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        ArrayOfCountryCode countries,
        @WebParam(name = "searchCriteria", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        SearchCriteria searchCriteria,
        @WebParam(name = "customData", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CustomData customData,
        @WebParam(name = "chargeReference", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        String chargeReference);

    /**
     * 
     * @param country
     * @return
     *     returns com.creditsafe.ws.CustomDataSchema
     */
    @WebMethod(operationName = "GetReportCustomDataSchema", action = "http://www.creditsafe.com/globaldata/operations/DataBrowsingService/GetReportCustomDataSchema")
    @WebResult(name = "GetReportCustomDataSchemaResult", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
    @RequestWrapper(localName = "GetReportCustomDataSchema", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetReportCustomDataSchema")
    @ResponseWrapper(localName = "GetReportCustomDataSchemaResponse", targetNamespace = "http://www.creditsafe.com/globaldata/operations", className = "com.creditsafe.ws.GetReportCustomDataSchemaResponse")
    public CustomDataSchema getReportCustomDataSchema(
        @WebParam(name = "country", targetNamespace = "http://www.creditsafe.com/globaldata/operations")
        CountryCode country);

}
