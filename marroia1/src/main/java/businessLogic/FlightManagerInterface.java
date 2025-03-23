package businessLogic;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import domain.*;
@WebService
public interface FlightManagerInterface{
	@WebMethod
	public Flight getFlight(String flightCode);
	@WebMethod
	public List<Flight> getFlights();
    @WebMethod
	public ConcreteFlight getConcreteFlight(String concreFlightCode);
	@WebMethod
	public List<ConcreteFlightContainer> getContainerConcreteFlights();
	@WebMethod
	public List<String> getAllDepartingCities();
	@WebMethod
	public List<String> getArrivalCitiesFrom(String departingCity);
	@WebMethod
	public List<ConcreteFlight> getConcreteFlights(String departingCity, String arrivingCity, XMLGregorianCalendar date);
	@WebMethod
	public List<ConcreteFlight> getConcreteFlightsList();
	@WebMethod
	public ConcreteFlight changeConcreteFlight(String code, String seatType, int value);
	@WebMethod
	public  ConcreteFlight findConcreteFlight(String code);
	@WebMethod
	public void gordeHegaldia(ConcreteFlight cf1);
	@WebMethod
	List<ConcreteFlight> getDateConcreteFlights(XMLGregorianCalendar d);
	@WebMethod
	XMLGregorianCalendar newDate(int year, int month, int day);
	@WebMethod
	XMLGregorianCalendar toXMLGregorianCalendar(java.util.Date date);
	@WebMethod
	ConcreteFlightContainer getConcreteFlightContainer(String concreteFlightCode);
	@WebMethod
	List<ConcreteFlightContainer> getDateConcreteFlightContainers(XMLGregorianCalendar date);
	@WebMethod
	List<ConcreteFlightContainer> getConcreteFlightContainers(String departingCity, String arrivingCity,
			XMLGregorianCalendar date);

}