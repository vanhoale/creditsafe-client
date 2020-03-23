
package com.creditsafe.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MainServiceBasic", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://webservices.creditsafe.com/GlobalData/1.3/MainServiceBasic.svc/meta?wsdl")
public class MainServiceBasic
    extends Service
{

    private final static URL MAINSERVICEBASIC_WSDL_LOCATION;
    private final static WebServiceException MAINSERVICEBASIC_EXCEPTION;
    private final static QName MAINSERVICEBASIC_QNAME = new QName("http://tempuri.org/", "MainServiceBasic");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://webservices.creditsafe.com/GlobalData/1.3/MainServiceBasic.svc/meta?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MAINSERVICEBASIC_WSDL_LOCATION = url;
        MAINSERVICEBASIC_EXCEPTION = e;
    }

    public MainServiceBasic() {
        super(__getWsdlLocation(), MAINSERVICEBASIC_QNAME);
    }

    public MainServiceBasic(WebServiceFeature... features) {
        super(__getWsdlLocation(), MAINSERVICEBASIC_QNAME, features);
    }

    public MainServiceBasic(URL wsdlLocation) {
        super(wsdlLocation, MAINSERVICEBASIC_QNAME);
    }

    public MainServiceBasic(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MAINSERVICEBASIC_QNAME, features);
    }

    public MainServiceBasic(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MainServiceBasic(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GlobalDataService
     */
    @WebEndpoint(name = "BasicHttpBinding_GlobalDataService")
    public GlobalDataService getBasicHttpBindingGlobalDataService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_GlobalDataService"), GlobalDataService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GlobalDataService
     */
    @WebEndpoint(name = "BasicHttpBinding_GlobalDataService")
    public GlobalDataService getBasicHttpBindingGlobalDataService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_GlobalDataService"), GlobalDataService.class, features);
    }

    /**
     * 
     * @return
     *     returns DataInputService
     */
    @WebEndpoint(name = "BasicHttpBinding_DataInputService")
    public DataInputService getBasicHttpBindingDataInputService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_DataInputService"), DataInputService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DataInputService
     */
    @WebEndpoint(name = "BasicHttpBinding_DataInputService")
    public DataInputService getBasicHttpBindingDataInputService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_DataInputService"), DataInputService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MAINSERVICEBASIC_EXCEPTION!= null) {
            throw MAINSERVICEBASIC_EXCEPTION;
        }
        return MAINSERVICEBASIC_WSDL_LOCATION;
    }

}
