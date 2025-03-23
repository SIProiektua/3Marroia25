package client;

import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import service.*;

public class Main {

    public static void main(String[] args) {
        FlightManagerService wsls = new FlightManagerService();
        FlightManagerInterface facade = wsls.getFlightManagerPort();
        System.out.println("FLIGHT-AK BILATU ETA INPRIMATU");
        List<Flight> listFlights = facade.getFlights();
        List<ConcreteFlightContainer> cfc = facade.getContainerConcreteFlights();
        Iterator<ConcreteFlightContainer> it = cfc.iterator();
        while (it.hasNext()) {
			ConcreteFlightContainer c = it.next();
			ConcreteFlight f = (ConcreteFlight)c.getConcreteFlight();
			Flight f1 = c.getFlight();
			System.out.println("Departing City: " + f1.getDepartingCity());
			System.out.println("Arriving City: " + f1.getArrivingCity());
			System.out.println("Code: " + f1.getFlightCode());
			System.out.println("concreteFlightCode: " + f.getConcreteFlightCode());
			System.out.println("Date: " + f.getDate());
			System.out.println("Time: " + f.getTime());
			System.out.println("Seats: " + f.getTouristNumber());
		}

        for (Flight f : listFlights) {
            System.out.println("Flight: " + f.getFlightCode() + " " + f.getDepartingCity() + " " + f.getArrivingCity());
            System.out.println("Flight: " + f.toString() + " eta bere ConcreteFlights:");
            if (f.getConcreteFlights() != null && !f.getConcreteFlights().isEmpty()) {
                for (ConcreteFlight cfElement : f.getConcreteFlights()) {
                    System.out.println(cfElement.toString());

                        if (cfElement != null) {
                            System.out.println("ConcreteFlight: " + cfElement.toString());
                            System.out.println("Departing City: " + cfElement.getConcreteFlightCode());
                            System.out.println("Arriving City: " + cfElement.getDate());
                        } else {
                            System.out.println("ConcreteFlight is null");
                        }

                }
            } else {
                System.out.println("No ConcreteFlights available for this flight.");
            }
        }

        System.out.println("CONCRETEFLIGHT-AK BILATU ETA INPRIMATU");
        List<ConcreteFlight> listConcreteFlight = facade.getConcreteFlightsList();
        for (ConcreteFlight cf : listConcreteFlight) {
            System.out.println("ConcreteFlight: " + cf.toString() + " eta bere Flight" + cf.getFlight());
        }

        System.out.println("ConcreteFlights on " + newDate(2023, 1, 23).toString());
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(2023, 1, 23);
        try {
            XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
            List<ConcreteFlight> l = facade.getDateConcreteFlights(xmlDate);
            for (ConcreteFlight cf : l) {
                System.out.println(cf.toString());
            }
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

    	System.out.println("CONCRETEFLIGHT-AK BILATU ETA INPRIMATU");
   	  List<ConcreteFlightContainer> listConcreteFlightContainer=facade.getContainerConcreteFlights();
   	  for(ConcreteFlightContainer concreteFlightContainer:listConcreteFlightContainer)
   		  System.out.println("ConcreteFlight: "+ concreteFlightContainer.getConcreteFlight()+
   	                      " eta bere Flight: "+concreteFlightContainer.getFlight().toString());

    }

    private static XMLGregorianCalendar toXMLGregorianCalendar(java.util.Date date) {
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) {
            System.out.println(ex);
        }
        return xmlCalendar;
    }

    private static XMLGregorianCalendar newDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return toXMLGregorianCalendar(calendar.getTime());
    }
}
