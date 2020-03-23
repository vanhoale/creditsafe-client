package com.c2fo.wsclient;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;

import com.creditsafe.ws.ArrayOfCountryCode;
import com.creditsafe.ws.CompaniesList;
import com.creditsafe.ws.Company;
import com.creditsafe.ws.CompanyReportSet;
import com.creditsafe.ws.CompanyReportType;
import com.creditsafe.ws.CountryCode;
import com.creditsafe.ws.GlobalDataService;
import com.creditsafe.ws.Language;
import com.creditsafe.ws.MainServiceBasic;
import com.creditsafe.ws.QueryMatchType;
import com.creditsafe.ws.QueryString;
import com.creditsafe.ws.SearchCriteria;
import com.google.gson.Gson;

public class CreditsafeWSClient {
	private static GlobalDataService iService;
	static {
        java.net.Authenticator.setDefault(new java.net.Authenticator() {
            protected java.net.PasswordAuthentication getPasswordAuthentication() {
                return new java.net.PasswordAuthentication("C2FOLive2", "C2FO05122".toCharArray());
            }
        });
        MainServiceBasic service = new MainServiceBasic();
        iService = service.getBasicHttpBindingGlobalDataService();
	}

	/**
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		CompaniesList ls = findCompanies();
		for (Company company : ls.getCompanies().getCompany()) {
			CompanyReportSet companyReportSet = getCompanyReport(company.getId());
			jaxbObjectToJSON(companyReportSet);
		}
	}

	private static CompaniesList findCompanies() throws Exception {
		ArrayOfCountryCode countries = new ArrayOfCountryCode();
		countries.getCountryCode().add(CountryCode.US);
		SearchCriteria searchCriteria = new SearchCriteria();
		QueryString queryString = new QueryString();
		queryString.setMatchType(QueryMatchType.MATCH_BEGINNING);
		queryString.setValue("HD VAPOR ABRASIVE BLASTING INC");
		searchCriteria.setName(queryString);
		CompaniesList ls = iService.
				findCompanies(countries, searchCriteria, null, null);
				return ls;
	}
	
	private static CompanyReportSet getCompanyReport(String companyId) throws Exception {
		CompanyReportSet companyReportSet = iService.retrieveCompanyOnlineReport(companyId, CompanyReportType.FULL, Language.EN, null, null, true, null, null);
				return companyReportSet;
	}	
	
    private static void jaxbObjectToJSON(CompanyReportSet companyReportSet)
    {
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance(CompanyReportSet.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
            // To format JSON
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
             
            //Set JSON type
            jaxbMarshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
            jaxbMarshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, true);
 
            //Print JSON String to Console
            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(companyReportSet, sw);
            System.out.println(sw.toString());
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }	
}
