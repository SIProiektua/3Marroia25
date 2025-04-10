
package service;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FlightManagerService", targetNamespace = "http://businessLogic/", wsdlLocation = "http://localhost:9999/ws?wsdl")
public class FlightManagerService
    extends Service
{

    private final static URL FLIGHTMANAGERSERVICE_WSDL_LOCATION;
    private final static WebServiceException FLIGHTMANAGERSERVICE_EXCEPTION;
    private final static QName FLIGHTMANAGERSERVICE_QNAME = new QName("http://businessLogic/", "FlightManagerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/ws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FLIGHTMANAGERSERVICE_WSDL_LOCATION = url;
        FLIGHTMANAGERSERVICE_EXCEPTION = e;
    }

    public FlightManagerService() {
        super(__getWsdlLocation(), FLIGHTMANAGERSERVICE_QNAME);
    }

    public FlightManagerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FLIGHTMANAGERSERVICE_QNAME, features);
    }

    public FlightManagerService(URL wsdlLocation) {
        super(wsdlLocation, FLIGHTMANAGERSERVICE_QNAME);
    }

    public FlightManagerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FLIGHTMANAGERSERVICE_QNAME, features);
    }

    public FlightManagerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FlightManagerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FlightManagerInterface
     */
    @WebEndpoint(name = "FlightManagerPort")
    public FlightManagerInterface getFlightManagerPort() {
        return super.getPort(new QName("http://businessLogic/", "FlightManagerPort"), FlightManagerInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FlightManagerInterface
     */
    @WebEndpoint(name = "FlightManagerPort")
    public FlightManagerInterface getFlightManagerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://businessLogic/", "FlightManagerPort"), FlightManagerInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FLIGHTMANAGERSERVICE_EXCEPTION!= null) {
            throw FLIGHTMANAGERSERVICE_EXCEPTION;
        }
        return FLIGHTMANAGERSERVICE_WSDL_LOCATION;
    }

}
