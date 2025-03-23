package businessLogic;

import java.util.ArrayList;

import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.Entity;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import dataBase.datuBasea;
import domain.ConcreteFlight;
import domain.ConcreteFlightContainer;
import domain.Flight;
@WebService(endpointInterface = "businessLogic.FlightManagerInterface")
public class FlightManager implements FlightManagerInterface{
	    static ArrayList<Flight> flightsDB= new ArrayList<Flight>();
	    ArrayList<ConcreteFlight> Clist = new ArrayList<ConcreteFlight>();
	    public static datuBasea db = new datuBasea();
	    ArrayList<ConcreteFlightContainer> listConcreteFlightContainer= new ArrayList<ConcreteFlightContainer>();
		public FlightManager () {

			Flight f1 = new Flight("F1","Donostia","Bilbo");
			f1.addConcreteFlight("CF1-1",newDate(2025,1,23),0,2,3,"12:00");
			f1.addConcreteFlight("CF1-2",newDate(2025,1,23),3,0,3,"12:30");
			f1.addConcreteFlight("CF1-3",newDate(2025,1,23),1,2,2,"13:00");
			f1.addConcreteFlight("CF1-4",newDate(2025,1,23),3,3,0,"14:00");
			f1.addConcreteFlight("CF1-5",newDate(2025,1,23),3,3,0,"15:00");
			f1.addConcreteFlight("CF1-6",newDate(2025,1,23),3,3,0,"16:00");
			f1.addConcreteFlight("CF1-7",newDate(2025,1,23),3,3,0,"17:00");
			Flight f2 = new Flight("F2","Donostia","Madrid");
			f2.addConcreteFlight("CF2-1",newDate(2025,1,23),1,2,3,"12:00");
			f2.addConcreteFlight("CF2-2",newDate(2025,1,23),3,0,3,"12:30");
			f2.addConcreteFlight("CF2-3",newDate(2025,1,23),1,2,2,"13:00");
			f2.addConcreteFlight("CF2-4",newDate(2025,1,23),3,3,0,"14:00");
			f2.addConcreteFlight("CF2-5",newDate(2025,1,23),3,3,0,"15:00");
			f2.addConcreteFlight("CF2-6",newDate(2025,1,23),3,3,0,"16:00");
			f2.addConcreteFlight("CF2-7",newDate(2025,1,23),3,3,0,"17:00");

			Flight f3 = new Flight("F3","Barcelona","Donostia");
			f3.addConcreteFlight("CF3-1",newDate(2025,1,23),1,2,3,"10:00");
			f3.addConcreteFlight("CF3-2",newDate(2025,1,23),3,0,3,"11:00");
			f3.addConcreteFlight("CF3-3",newDate(2025,1,23),1,2,2,"12:00");
			f3.addConcreteFlight("CF3-4",newDate(2025,1,23),3,3,0,"13:00");
			f3.addConcreteFlight("CF3-5",newDate(2025,1,23),3,3,0,"15:00");
			f3.addConcreteFlight("CF3-6",newDate(2025,1,23),3,3,0,"19:00");
			f3.addConcreteFlight("CF3-7",newDate(2025,1,23),3,3,0,"21:00");

			Flight f4 = new Flight("F4","Barcelona","Malaga");
			f4.addConcreteFlight("CF4-1",newDate(2025,1,22),1,2,3,"9:00");
			f4.addConcreteFlight("CF4-2",newDate(2025,1,23),3,0,3,"11:00");
			f4.addConcreteFlight("CF4-3",newDate(2025,1,23),1,2,2,"13:00");
			f4.addConcreteFlight("CF4-4",newDate(2025,1,23),3,3,0,"15:00");
			f4.addConcreteFlight("CF4-5",newDate(2025,1,23),3,3,0,"17:00");
			f4.addConcreteFlight("CF4-6",newDate(2025,1,23),3,3,0,"19:00");
			f4.addConcreteFlight("CF4-7",newDate(2025,1,23),3,3,0,"21:00");

			Flight f5 = new Flight("F5","Malaga","Madrid");
			f5.addConcreteFlight("CF5-1",newDate(2025,1,22),1,2,3,"8:00");
			f5.addConcreteFlight("CF5-2",newDate(2025,1,23),3,0,3,"10:00");
			f5.addConcreteFlight("CF5-3",newDate(2025,1,23),1,2,2,"12:00");
			f5.addConcreteFlight("CF5-4",newDate(2025,1,23),3,3,0,"14:00");
			f5.addConcreteFlight("CF5-5",newDate(2025,1,23),3,3,0,"16:00");
			f5.addConcreteFlight("CF5-6",newDate(2025,1,23),3,3,0,"18:00");
			f5.addConcreteFlight("CF5-7",newDate(2025,1,23),3,3,0,"20:00");


			Flight f6 = new Flight("F6","Malaga","Santander");
			f6.addConcreteFlight("CF6-1",newDate(2024,1,22),1,2,3,"8:30");
			f6.addConcreteFlight("CF6-2",newDate(2024,1,23),3,0,3,"10:30");
			f6.addConcreteFlight("CF6-3",newDate(2024,1,23),1,2,2,"12:30");
			f6.addConcreteFlight("CF6-4",newDate(2024,1,23),3,3,0,"14:30");
			f6.addConcreteFlight("CF6-5",newDate(2024,1,23),3,3,0,"16:30");
			f6.addConcreteFlight("CF6-6",newDate(2024,1,23),3,3,0,"18:30");
			f6.addConcreteFlight("CF6-7",newDate(2024,1,23),3,3,0,"20:30");

			Flight f7 = new Flight("F7","Malaga","Granada");

			Flight f8 = new Flight("F8","Sevilla", "Madrid");
			f8.addConcreteFlight("CF8-1",newDate(2024,1,22),1,2,3,"02:45");
			f8.addConcreteFlight("CF8-2",newDate(2024,1,23),3,3,3,"7:30");
			f8.addConcreteFlight("CF8-3",newDate(2024,1,23),0,2,2,"9:30");
			f8.addConcreteFlight("CF8-4",newDate(2024,1,24),3,1,2,"13:30");
			f8.addConcreteFlight("CF8-5",newDate(2024,1,24),3,0,0,"16:30");
			f8.addConcreteFlight("CF8-6",newDate(2024,1,24),3,4,0,"18:30");
			f8.addConcreteFlight("CF8-7",newDate(2024,1,25),0,3,4,"03:30");

			Flight f9 = new Flight ("F9", "Sevilla", "Bilbao");
			f9.addConcreteFlight("CF9-1",newDate(2024,1,22),1,2,3,"8:30");
			f9.addConcreteFlight("CF9-2",newDate(2024,1,23),3,0,3,"9:30");
			f9.addConcreteFlight("CF9-3",newDate(2024,1,23),1,2,2,"10:30");
			f9.addConcreteFlight("CF9-4",newDate(2024,1,23),3,3,0,"11:30");
			f9.addConcreteFlight("CF9-5",newDate(2024,1,23),3,3,0,"15:30");
			f9.addConcreteFlight("CF9-6",newDate(2024,1,23),3,3,0,"17:30");
			f9.addConcreteFlight("CF9-7",newDate(2024,1,24),3,3,0,"00:30");

			flightsDB.add(f1);
			flightsDB.add(f2);
			flightsDB.add(f3);
			flightsDB.add(f4);
			flightsDB.add(f5);
			flightsDB.add(f6);
			flightsDB.add(f7);
			flightsDB.add(f8);
			flightsDB.add(f9);

			Clist.addAll(f1.getConcreteFlights());
			Clist.addAll(f2.getConcreteFlights());
			Clist.addAll(f3.getConcreteFlights());
			Clist.addAll(f4.getConcreteFlights());
			Clist.addAll(f5.getConcreteFlights());
			Clist.addAll(f6.getConcreteFlights());
			Clist.addAll(f7.getConcreteFlights());
			Clist.addAll(f8.getConcreteFlights());
			Clist.addAll(f9.getConcreteFlights());
			db.gordeConcreteFlights(Clist);
			db.gordeFlights(flightsDB);


		}

		@WebMethod
		public List<ConcreteFlight> getConcreteFlightsList() {
			return db.getConcreteFlights();
	    }


		@WebMethod
		public List<String> getAllDepartingCities(){

			if (flightsDB.isEmpty()) return new ArrayList<String>();
			//A set is used to avoid duplicates
			SortedSet<String> setDepartingCities = new TreeSet<String>();
			Iterator<Flight> i=flightsDB.iterator();
			while (i.hasNext())
				setDepartingCities.add(i.next().getDepartingCity());
			return new ArrayList<String>(setDepartingCities);
		}

		@WebMethod
		public List<String> getArrivalCitiesFrom(String departingCity){

			List<String> arrivalCities = new ArrayList<String>();
			Iterator<Flight> i=flightsDB.iterator();
			Flight f;
			while (i.hasNext()) {
				f=i.next();
				if (f.getDepartingCity().compareTo(departingCity)==0)
					arrivalCities.add(f.getArrivingCity());
			}
			Collections.sort(arrivalCities);
			return arrivalCities;
		}
		@WebMethod
		public static ArrayList<Flight> getAllFlights(){
			return flightsDB;
		}

		@Override
		@WebMethod
		public Flight getFlight(String flightCode) {
			Iterator<Flight> it=flightsDB.iterator();
			while (it.hasNext()) {
				Flight ev=it.next();
				if (ev.getFlightCode().equals(flightCode))
					return ev; }
			return null;
		}

		@Override
		@WebMethod
		public List<Flight> getFlights() {
			return flightsDB;
		}

		@Override
		@WebMethod
		public ConcreteFlight getConcreteFlight(String concreFlightCode) {
			// TODO Auto-generated method stub
			Iterator<ConcreteFlight> it=Clist.iterator();
			while (it.hasNext()) {
				ConcreteFlight q=it.next();
				if (q.getConcreteFlightCode().equals(concreFlightCode))
					return q; }
			return null;
		}

		@Override
		@WebMethod
		public ConcreteFlightContainer getConcreteFlightContainer(String concreteFlightCode) {
		    for (ConcreteFlightContainer container : listConcreteFlightContainer) {
		        if (container.getConcreteFlight().getConcreteFlightCode().equals(concreteFlightCode)) {
		            return container;
		        }
		    }
		    return null;
		}

		@Override
		@WebMethod
		public List<ConcreteFlightContainer> getDateConcreteFlightContainers(XMLGregorianCalendar date) {
		    List<ConcreteFlightContainer> concreteFlightContainers = new ArrayList<>();
		    for (ConcreteFlightContainer container : listConcreteFlightContainer) {
		        if (container.getConcreteFlight().getDate().equals(date)) {
		            concreteFlightContainers.add(container);
		        }
		    }
		    return concreteFlightContainers;
		}

		@Override
		@WebMethod
		public List<ConcreteFlightContainer> getConcreteFlightContainers(String departingCity, String arrivingCity, XMLGregorianCalendar date) {
		    List<ConcreteFlightContainer> res = new ArrayList<>();
		    for (Flight flight : flightsDB) {
		        if (flight.getArrivingCity().equals(arrivingCity) && flight.getDepartingCity().equals(departingCity)) {
		            for (ConcreteFlight concreteFlight : flight.getConcreteFlights()) {
		                if (concreteFlight.getDate().equals(date)) {
		                	res.add(new ConcreteFlightContainer(concreteFlight));
		                }
		            }
		        }
		    }
		    return res;
		}

		@Override
		@WebMethod
	public List<ConcreteFlightContainer> getContainerConcreteFlights(){
	 List<ConcreteFlightContainer> listConcreteFlightContainer= new ArrayList<ConcreteFlightContainer>();
	 for (ConcreteFlight concreteFlight:Clist)
		 listConcreteFlightContainer.add(new ConcreteFlightContainer(concreteFlight));
	 return listConcreteFlightContainer;
	}

		@Override
		@WebMethod
	public List<ConcreteFlight> getDateConcreteFlights(XMLGregorianCalendar d){

		List<ConcreteFlight> concreteFlights= new ArrayList<ConcreteFlight>();
		 for (ConcreteFlight concreteFlight:Clist)
			 if (concreteFlight.getDate().equals(d))
					 concreteFlights.add(concreteFlight);
		 return concreteFlights;
	}

		@Override
		@WebMethod
		public List<ConcreteFlight> getConcreteFlights(String departingCity, String arrivingCity, XMLGregorianCalendar date) {
		ArrayList<ConcreteFlight> res = new ArrayList<ConcreteFlight>();
		for (Flight a : flightsDB) {
			if ((a.getArrivingCity().equals(arrivingCity))&&(a.getDepartingCity().equals(departingCity)))
				for (ConcreteFlight c : a.getConcreteFlights())
					if ((c.getDate()).equals(date)) res.add(c);

		}

		return res;
	}

		public  ConcreteFlight changeConcreteFlight(String code, String seatType, int value) {
	        return db.changeConcreteFlight(code, seatType, value);
	    }

		 public  ConcreteFlight findConcreteFlight(String code) {
			 return db.findConcreteFlight(code);
		 }

		 public void gordeHegaldia(ConcreteFlight cf1) {
			 db.gordeHegaldia(cf1);
		 }

		 @Override
		 public XMLGregorianCalendar newDate(int year, int month, int day) {

				Calendar calendar = Calendar.getInstance();
				calendar.set(year, month, day, 0, 0, 0);
				calendar.set(Calendar.MILLISECOND, 0);
				return toXMLGregorianCalendar(calendar.getTime());
		}

		@Override
		public XMLGregorianCalendar toXMLGregorianCalendar(java.util.Date date) {
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

}
