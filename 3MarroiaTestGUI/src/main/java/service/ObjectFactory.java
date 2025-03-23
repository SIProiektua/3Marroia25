
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _ChangeConcreteFlight_QNAME = new QName("http://businessLogic/", "changeConcreteFlight");
    private final static QName _ChangeConcreteFlightResponse_QNAME = new QName("http://businessLogic/", "changeConcreteFlightResponse");
    private final static QName _FindConcreteFlight_QNAME = new QName("http://businessLogic/", "findConcreteFlight");
    private final static QName _FindConcreteFlightResponse_QNAME = new QName("http://businessLogic/", "findConcreteFlightResponse");
    private final static QName _GetAllDepartingCities_QNAME = new QName("http://businessLogic/", "getAllDepartingCities");
    private final static QName _GetAllDepartingCitiesResponse_QNAME = new QName("http://businessLogic/", "getAllDepartingCitiesResponse");
    private final static QName _GetArrivalCitiesFrom_QNAME = new QName("http://businessLogic/", "getArrivalCitiesFrom");
    private final static QName _GetArrivalCitiesFromResponse_QNAME = new QName("http://businessLogic/", "getArrivalCitiesFromResponse");
    private final static QName _GetConcreteFlight_QNAME = new QName("http://businessLogic/", "getConcreteFlight");
    private final static QName _GetConcreteFlightContainer_QNAME = new QName("http://businessLogic/", "getConcreteFlightContainer");
    private final static QName _GetConcreteFlightContainerResponse_QNAME = new QName("http://businessLogic/", "getConcreteFlightContainerResponse");
    private final static QName _GetConcreteFlightContainers_QNAME = new QName("http://businessLogic/", "getConcreteFlightContainers");
    private final static QName _GetConcreteFlightContainersResponse_QNAME = new QName("http://businessLogic/", "getConcreteFlightContainersResponse");
    private final static QName _GetConcreteFlightResponse_QNAME = new QName("http://businessLogic/", "getConcreteFlightResponse");
    private final static QName _GetConcreteFlights_QNAME = new QName("http://businessLogic/", "getConcreteFlights");
    private final static QName _GetConcreteFlightsList_QNAME = new QName("http://businessLogic/", "getConcreteFlightsList");
    private final static QName _GetConcreteFlightsListResponse_QNAME = new QName("http://businessLogic/", "getConcreteFlightsListResponse");
    private final static QName _GetConcreteFlightsResponse_QNAME = new QName("http://businessLogic/", "getConcreteFlightsResponse");
    private final static QName _GetContainerConcreteFlights_QNAME = new QName("http://businessLogic/", "getContainerConcreteFlights");
    private final static QName _GetContainerConcreteFlightsResponse_QNAME = new QName("http://businessLogic/", "getContainerConcreteFlightsResponse");
    private final static QName _GetDateConcreteFlightContainers_QNAME = new QName("http://businessLogic/", "getDateConcreteFlightContainers");
    private final static QName _GetDateConcreteFlightContainersResponse_QNAME = new QName("http://businessLogic/", "getDateConcreteFlightContainersResponse");
    private final static QName _GetDateConcreteFlights_QNAME = new QName("http://businessLogic/", "getDateConcreteFlights");
    private final static QName _GetDateConcreteFlightsResponse_QNAME = new QName("http://businessLogic/", "getDateConcreteFlightsResponse");
    private final static QName _GetFlight_QNAME = new QName("http://businessLogic/", "getFlight");
    private final static QName _GetFlightResponse_QNAME = new QName("http://businessLogic/", "getFlightResponse");
    private final static QName _GetFlights_QNAME = new QName("http://businessLogic/", "getFlights");
    private final static QName _GetFlightsResponse_QNAME = new QName("http://businessLogic/", "getFlightsResponse");
    private final static QName _GordeHegaldia_QNAME = new QName("http://businessLogic/", "gordeHegaldia");
    private final static QName _GordeHegaldiaResponse_QNAME = new QName("http://businessLogic/", "gordeHegaldiaResponse");
    private final static QName _NewDate_QNAME = new QName("http://businessLogic/", "newDate");
    private final static QName _NewDateResponse_QNAME = new QName("http://businessLogic/", "newDateResponse");
    private final static QName _ToXMLGregorianCalendar_QNAME = new QName("http://businessLogic/", "toXMLGregorianCalendar");
    private final static QName _ToXMLGregorianCalendarResponse_QNAME = new QName("http://businessLogic/", "toXMLGregorianCalendarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeConcreteFlight }
     * 
     */
    public ChangeConcreteFlight createChangeConcreteFlight() {
        return new ChangeConcreteFlight();
    }

    /**
     * Create an instance of {@link ChangeConcreteFlightResponse }
     * 
     */
    public ChangeConcreteFlightResponse createChangeConcreteFlightResponse() {
        return new ChangeConcreteFlightResponse();
    }

    /**
     * Create an instance of {@link FindConcreteFlight }
     * 
     */
    public FindConcreteFlight createFindConcreteFlight() {
        return new FindConcreteFlight();
    }

    /**
     * Create an instance of {@link FindConcreteFlightResponse }
     * 
     */
    public FindConcreteFlightResponse createFindConcreteFlightResponse() {
        return new FindConcreteFlightResponse();
    }

    /**
     * Create an instance of {@link GetAllDepartingCities }
     * 
     */
    public GetAllDepartingCities createGetAllDepartingCities() {
        return new GetAllDepartingCities();
    }

    /**
     * Create an instance of {@link GetAllDepartingCitiesResponse }
     * 
     */
    public GetAllDepartingCitiesResponse createGetAllDepartingCitiesResponse() {
        return new GetAllDepartingCitiesResponse();
    }

    /**
     * Create an instance of {@link GetArrivalCitiesFrom }
     * 
     */
    public GetArrivalCitiesFrom createGetArrivalCitiesFrom() {
        return new GetArrivalCitiesFrom();
    }

    /**
     * Create an instance of {@link GetArrivalCitiesFromResponse }
     * 
     */
    public GetArrivalCitiesFromResponse createGetArrivalCitiesFromResponse() {
        return new GetArrivalCitiesFromResponse();
    }

    /**
     * Create an instance of {@link GetConcreteFlight }
     * 
     */
    public GetConcreteFlight createGetConcreteFlight() {
        return new GetConcreteFlight();
    }

    /**
     * Create an instance of {@link GetConcreteFlightContainer }
     * 
     */
    public GetConcreteFlightContainer createGetConcreteFlightContainer() {
        return new GetConcreteFlightContainer();
    }

    /**
     * Create an instance of {@link GetConcreteFlightContainerResponse }
     * 
     */
    public GetConcreteFlightContainerResponse createGetConcreteFlightContainerResponse() {
        return new GetConcreteFlightContainerResponse();
    }

    /**
     * Create an instance of {@link GetConcreteFlightContainers }
     * 
     */
    public GetConcreteFlightContainers createGetConcreteFlightContainers() {
        return new GetConcreteFlightContainers();
    }

    /**
     * Create an instance of {@link GetConcreteFlightContainersResponse }
     * 
     */
    public GetConcreteFlightContainersResponse createGetConcreteFlightContainersResponse() {
        return new GetConcreteFlightContainersResponse();
    }

    /**
     * Create an instance of {@link GetConcreteFlightResponse }
     * 
     */
    public GetConcreteFlightResponse createGetConcreteFlightResponse() {
        return new GetConcreteFlightResponse();
    }

    /**
     * Create an instance of {@link GetConcreteFlights }
     * 
     */
    public GetConcreteFlights createGetConcreteFlights() {
        return new GetConcreteFlights();
    }

    /**
     * Create an instance of {@link GetConcreteFlightsList }
     * 
     */
    public GetConcreteFlightsList createGetConcreteFlightsList() {
        return new GetConcreteFlightsList();
    }

    /**
     * Create an instance of {@link GetConcreteFlightsListResponse }
     * 
     */
    public GetConcreteFlightsListResponse createGetConcreteFlightsListResponse() {
        return new GetConcreteFlightsListResponse();
    }

    /**
     * Create an instance of {@link GetConcreteFlightsResponse }
     * 
     */
    public GetConcreteFlightsResponse createGetConcreteFlightsResponse() {
        return new GetConcreteFlightsResponse();
    }

    /**
     * Create an instance of {@link GetContainerConcreteFlights }
     * 
     */
    public GetContainerConcreteFlights createGetContainerConcreteFlights() {
        return new GetContainerConcreteFlights();
    }

    /**
     * Create an instance of {@link GetContainerConcreteFlightsResponse }
     * 
     */
    public GetContainerConcreteFlightsResponse createGetContainerConcreteFlightsResponse() {
        return new GetContainerConcreteFlightsResponse();
    }

    /**
     * Create an instance of {@link GetDateConcreteFlightContainers }
     * 
     */
    public GetDateConcreteFlightContainers createGetDateConcreteFlightContainers() {
        return new GetDateConcreteFlightContainers();
    }

    /**
     * Create an instance of {@link GetDateConcreteFlightContainersResponse }
     * 
     */
    public GetDateConcreteFlightContainersResponse createGetDateConcreteFlightContainersResponse() {
        return new GetDateConcreteFlightContainersResponse();
    }

    /**
     * Create an instance of {@link GetDateConcreteFlights }
     * 
     */
    public GetDateConcreteFlights createGetDateConcreteFlights() {
        return new GetDateConcreteFlights();
    }

    /**
     * Create an instance of {@link GetDateConcreteFlightsResponse }
     * 
     */
    public GetDateConcreteFlightsResponse createGetDateConcreteFlightsResponse() {
        return new GetDateConcreteFlightsResponse();
    }

    /**
     * Create an instance of {@link GetFlight }
     * 
     */
    public GetFlight createGetFlight() {
        return new GetFlight();
    }

    /**
     * Create an instance of {@link GetFlightResponse }
     * 
     */
    public GetFlightResponse createGetFlightResponse() {
        return new GetFlightResponse();
    }

    /**
     * Create an instance of {@link GetFlights }
     * 
     */
    public GetFlights createGetFlights() {
        return new GetFlights();
    }

    /**
     * Create an instance of {@link GetFlightsResponse }
     * 
     */
    public GetFlightsResponse createGetFlightsResponse() {
        return new GetFlightsResponse();
    }

    /**
     * Create an instance of {@link GordeHegaldia }
     * 
     */
    public GordeHegaldia createGordeHegaldia() {
        return new GordeHegaldia();
    }

    /**
     * Create an instance of {@link GordeHegaldiaResponse }
     * 
     */
    public GordeHegaldiaResponse createGordeHegaldiaResponse() {
        return new GordeHegaldiaResponse();
    }

    /**
     * Create an instance of {@link NewDate }
     * 
     */
    public NewDate createNewDate() {
        return new NewDate();
    }

    /**
     * Create an instance of {@link NewDateResponse }
     * 
     */
    public NewDateResponse createNewDateResponse() {
        return new NewDateResponse();
    }

    /**
     * Create an instance of {@link ToXMLGregorianCalendar }
     * 
     */
    public ToXMLGregorianCalendar createToXMLGregorianCalendar() {
        return new ToXMLGregorianCalendar();
    }

    /**
     * Create an instance of {@link ToXMLGregorianCalendarResponse }
     * 
     */
    public ToXMLGregorianCalendarResponse createToXMLGregorianCalendarResponse() {
        return new ToXMLGregorianCalendarResponse();
    }

    /**
     * Create an instance of {@link ConcreteFlight }
     * 
     */
    public ConcreteFlight createConcreteFlight() {
        return new ConcreteFlight();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link ConcreteFlightContainer }
     * 
     */
    public ConcreteFlightContainer createConcreteFlightContainer() {
        return new ConcreteFlightContainer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeConcreteFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeConcreteFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "changeConcreteFlight")
    public JAXBElement<ChangeConcreteFlight> createChangeConcreteFlight(ChangeConcreteFlight value) {
        return new JAXBElement<ChangeConcreteFlight>(_ChangeConcreteFlight_QNAME, ChangeConcreteFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeConcreteFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeConcreteFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "changeConcreteFlightResponse")
    public JAXBElement<ChangeConcreteFlightResponse> createChangeConcreteFlightResponse(ChangeConcreteFlightResponse value) {
        return new JAXBElement<ChangeConcreteFlightResponse>(_ChangeConcreteFlightResponse_QNAME, ChangeConcreteFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindConcreteFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindConcreteFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "findConcreteFlight")
    public JAXBElement<FindConcreteFlight> createFindConcreteFlight(FindConcreteFlight value) {
        return new JAXBElement<FindConcreteFlight>(_FindConcreteFlight_QNAME, FindConcreteFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindConcreteFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindConcreteFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "findConcreteFlightResponse")
    public JAXBElement<FindConcreteFlightResponse> createFindConcreteFlightResponse(FindConcreteFlightResponse value) {
        return new JAXBElement<FindConcreteFlightResponse>(_FindConcreteFlightResponse_QNAME, FindConcreteFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCities }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getAllDepartingCities")
    public JAXBElement<GetAllDepartingCities> createGetAllDepartingCities(GetAllDepartingCities value) {
        return new JAXBElement<GetAllDepartingCities>(_GetAllDepartingCities_QNAME, GetAllDepartingCities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCitiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCitiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getAllDepartingCitiesResponse")
    public JAXBElement<GetAllDepartingCitiesResponse> createGetAllDepartingCitiesResponse(GetAllDepartingCitiesResponse value) {
        return new JAXBElement<GetAllDepartingCitiesResponse>(_GetAllDepartingCitiesResponse_QNAME, GetAllDepartingCitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFrom }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFrom }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getArrivalCitiesFrom")
    public JAXBElement<GetArrivalCitiesFrom> createGetArrivalCitiesFrom(GetArrivalCitiesFrom value) {
        return new JAXBElement<GetArrivalCitiesFrom>(_GetArrivalCitiesFrom_QNAME, GetArrivalCitiesFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFromResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFromResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getArrivalCitiesFromResponse")
    public JAXBElement<GetArrivalCitiesFromResponse> createGetArrivalCitiesFromResponse(GetArrivalCitiesFromResponse value) {
        return new JAXBElement<GetArrivalCitiesFromResponse>(_GetArrivalCitiesFromResponse_QNAME, GetArrivalCitiesFromResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlight")
    public JAXBElement<GetConcreteFlight> createGetConcreteFlight(GetConcreteFlight value) {
        return new JAXBElement<GetConcreteFlight>(_GetConcreteFlight_QNAME, GetConcreteFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightContainer }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlightContainer")
    public JAXBElement<GetConcreteFlightContainer> createGetConcreteFlightContainer(GetConcreteFlightContainer value) {
        return new JAXBElement<GetConcreteFlightContainer>(_GetConcreteFlightContainer_QNAME, GetConcreteFlightContainer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightContainerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightContainerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlightContainerResponse")
    public JAXBElement<GetConcreteFlightContainerResponse> createGetConcreteFlightContainerResponse(GetConcreteFlightContainerResponse value) {
        return new JAXBElement<GetConcreteFlightContainerResponse>(_GetConcreteFlightContainerResponse_QNAME, GetConcreteFlightContainerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightContainers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightContainers }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlightContainers")
    public JAXBElement<GetConcreteFlightContainers> createGetConcreteFlightContainers(GetConcreteFlightContainers value) {
        return new JAXBElement<GetConcreteFlightContainers>(_GetConcreteFlightContainers_QNAME, GetConcreteFlightContainers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightContainersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightContainersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlightContainersResponse")
    public JAXBElement<GetConcreteFlightContainersResponse> createGetConcreteFlightContainersResponse(GetConcreteFlightContainersResponse value) {
        return new JAXBElement<GetConcreteFlightContainersResponse>(_GetConcreteFlightContainersResponse_QNAME, GetConcreteFlightContainersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlightResponse")
    public JAXBElement<GetConcreteFlightResponse> createGetConcreteFlightResponse(GetConcreteFlightResponse value) {
        return new JAXBElement<GetConcreteFlightResponse>(_GetConcreteFlightResponse_QNAME, GetConcreteFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlights }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlights")
    public JAXBElement<GetConcreteFlights> createGetConcreteFlights(GetConcreteFlights value) {
        return new JAXBElement<GetConcreteFlights>(_GetConcreteFlights_QNAME, GetConcreteFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightsList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightsList }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlightsList")
    public JAXBElement<GetConcreteFlightsList> createGetConcreteFlightsList(GetConcreteFlightsList value) {
        return new JAXBElement<GetConcreteFlightsList>(_GetConcreteFlightsList_QNAME, GetConcreteFlightsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightsListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightsListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlightsListResponse")
    public JAXBElement<GetConcreteFlightsListResponse> createGetConcreteFlightsListResponse(GetConcreteFlightsListResponse value) {
        return new JAXBElement<GetConcreteFlightsListResponse>(_GetConcreteFlightsListResponse_QNAME, GetConcreteFlightsListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlightsResponse")
    public JAXBElement<GetConcreteFlightsResponse> createGetConcreteFlightsResponse(GetConcreteFlightsResponse value) {
        return new JAXBElement<GetConcreteFlightsResponse>(_GetConcreteFlightsResponse_QNAME, GetConcreteFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContainerConcreteFlights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContainerConcreteFlights }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getContainerConcreteFlights")
    public JAXBElement<GetContainerConcreteFlights> createGetContainerConcreteFlights(GetContainerConcreteFlights value) {
        return new JAXBElement<GetContainerConcreteFlights>(_GetContainerConcreteFlights_QNAME, GetContainerConcreteFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContainerConcreteFlightsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContainerConcreteFlightsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getContainerConcreteFlightsResponse")
    public JAXBElement<GetContainerConcreteFlightsResponse> createGetContainerConcreteFlightsResponse(GetContainerConcreteFlightsResponse value) {
        return new JAXBElement<GetContainerConcreteFlightsResponse>(_GetContainerConcreteFlightsResponse_QNAME, GetContainerConcreteFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateConcreteFlightContainers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDateConcreteFlightContainers }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDateConcreteFlightContainers")
    public JAXBElement<GetDateConcreteFlightContainers> createGetDateConcreteFlightContainers(GetDateConcreteFlightContainers value) {
        return new JAXBElement<GetDateConcreteFlightContainers>(_GetDateConcreteFlightContainers_QNAME, GetDateConcreteFlightContainers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateConcreteFlightContainersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDateConcreteFlightContainersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDateConcreteFlightContainersResponse")
    public JAXBElement<GetDateConcreteFlightContainersResponse> createGetDateConcreteFlightContainersResponse(GetDateConcreteFlightContainersResponse value) {
        return new JAXBElement<GetDateConcreteFlightContainersResponse>(_GetDateConcreteFlightContainersResponse_QNAME, GetDateConcreteFlightContainersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateConcreteFlights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDateConcreteFlights }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDateConcreteFlights")
    public JAXBElement<GetDateConcreteFlights> createGetDateConcreteFlights(GetDateConcreteFlights value) {
        return new JAXBElement<GetDateConcreteFlights>(_GetDateConcreteFlights_QNAME, GetDateConcreteFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateConcreteFlightsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDateConcreteFlightsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDateConcreteFlightsResponse")
    public JAXBElement<GetDateConcreteFlightsResponse> createGetDateConcreteFlightsResponse(GetDateConcreteFlightsResponse value) {
        return new JAXBElement<GetDateConcreteFlightsResponse>(_GetDateConcreteFlightsResponse_QNAME, GetDateConcreteFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getFlight")
    public JAXBElement<GetFlight> createGetFlight(GetFlight value) {
        return new JAXBElement<GetFlight>(_GetFlight_QNAME, GetFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getFlightResponse")
    public JAXBElement<GetFlightResponse> createGetFlightResponse(GetFlightResponse value) {
        return new JAXBElement<GetFlightResponse>(_GetFlightResponse_QNAME, GetFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFlights }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getFlights")
    public JAXBElement<GetFlights> createGetFlights(GetFlights value) {
        return new JAXBElement<GetFlights>(_GetFlights_QNAME, GetFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFlightsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getFlightsResponse")
    public JAXBElement<GetFlightsResponse> createGetFlightsResponse(GetFlightsResponse value) {
        return new JAXBElement<GetFlightsResponse>(_GetFlightsResponse_QNAME, GetFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GordeHegaldia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GordeHegaldia }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "gordeHegaldia")
    public JAXBElement<GordeHegaldia> createGordeHegaldia(GordeHegaldia value) {
        return new JAXBElement<GordeHegaldia>(_GordeHegaldia_QNAME, GordeHegaldia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GordeHegaldiaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GordeHegaldiaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "gordeHegaldiaResponse")
    public JAXBElement<GordeHegaldiaResponse> createGordeHegaldiaResponse(GordeHegaldiaResponse value) {
        return new JAXBElement<GordeHegaldiaResponse>(_GordeHegaldiaResponse_QNAME, GordeHegaldiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NewDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "newDate")
    public JAXBElement<NewDate> createNewDate(NewDate value) {
        return new JAXBElement<NewDate>(_NewDate_QNAME, NewDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewDateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NewDateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "newDateResponse")
    public JAXBElement<NewDateResponse> createNewDateResponse(NewDateResponse value) {
        return new JAXBElement<NewDateResponse>(_NewDateResponse_QNAME, NewDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToXMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ToXMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "toXMLGregorianCalendar")
    public JAXBElement<ToXMLGregorianCalendar> createToXMLGregorianCalendar(ToXMLGregorianCalendar value) {
        return new JAXBElement<ToXMLGregorianCalendar>(_ToXMLGregorianCalendar_QNAME, ToXMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToXMLGregorianCalendarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ToXMLGregorianCalendarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "toXMLGregorianCalendarResponse")
    public JAXBElement<ToXMLGregorianCalendarResponse> createToXMLGregorianCalendarResponse(ToXMLGregorianCalendarResponse value) {
        return new JAXBElement<ToXMLGregorianCalendarResponse>(_ToXMLGregorianCalendarResponse_QNAME, ToXMLGregorianCalendarResponse.class, null, value);
    }

}
