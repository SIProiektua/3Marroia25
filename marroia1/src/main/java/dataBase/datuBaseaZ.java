package dataBase;

import java.util.*;

import javax.persistence.*;
import domain.ConcreteFlight;
import domain.Flight;
import businessLogic.*;

public class datuBaseaZ {
	private EntityManager db;
	private EntityManagerFactory emf;
	String fileName = "erreserba_data.odb";
	private ConcreteFlight g1;

	public datuBaseaZ() {
		emf = Persistence.createEntityManagerFactory("objectdb:" + fileName);
		db = emf.createEntityManager();
		System.out.println("DatuBasea irekia");
	}

	public void sortu() {
		db.getTransaction();
		db.persist(db);
		db.getTransaction().commit();
		System.out.println("OK");
	}

	public void gordeHegaldia(ConcreteFlight cf1) {
		db.getTransaction().begin();
		db.persist(cf1);
		g1 = cf1;
		db.getTransaction().commit();
		System.out.println("Gordeta " + cf1.toString());
	}

	public void eraberritu(ConcreteFlight f1,ConcreteFlight t2) {
		db.remove(f1);
		db.persist(t2);
		db.getTransaction().commit();
	}

	public void ezabatu() {
		db.remove(db);
		db.getTransaction().commit();
	}

	public boolean hasinfo() {
		return db.toString() == "";
	}

	public void close() {
		db.close();
		System.out.println("DatuBasea Itxi da");
	}

	public void startDataBase() {
		for (Flight flight : FlightManager.getAllFlights()) {
			for (ConcreteFlight cflight : flight.getConcreteFlights()) {
				if (!db.contains(cflight)) {
					gordeHegaldia(cflight);
				}
			}
		}
	}

	public ConcreteFlight findConcreteFlight(ConcreteFlight a) {
		List<ConcreteFlight> results;
		ConcreteFlight cf = null;
		try {
			TypedQuery<ConcreteFlight> query = db.createQuery(
					"SELECT p FROM ConcreteFlight p WHERE p.concreteFlightCode = :concreteFlightCode AND p.date = :date AND p.flight = :flight ",
					ConcreteFlight.class);
			query.setParameter("concreteFlightCode", a.concreteFlightCode);
			query.setParameter("date", a.getDate());
			query.setParameter("flight", a.getFlight());
			results = query.getResultList();
			if (!results.isEmpty()) {
				cf = results.get(0);
				System.out.println("Aurkituta " + cf.toString() + " Eta beste " + (results.size() - 1));
			} else {
				System.out.println("Ez da aurkitu");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return cf;
	}

	public ConcreteFlight changeConcreteFlight(ConcreteFlight a, String seatType, int value){
		ConcreteFlight cf = null;
		try { 
            TypedQuery<ConcreteFlight> query = db.createQuery(
                "SELECT p FROM ConcreteFlight p WHERE p.concreteFlightCode = :concreteFlightCode AND p.date = :date AND p.flight = :flight ", ConcreteFlight.class);
            query.setParameter("concreteFlightCode", a.concreteFlightCode);
            query.setParameter("date", a.getDate());
			query.setParameter("flight", a.getFlight());
			System.out.print("S");
            cf =  query.getResultList().stream().findFirst().orElse(null);
			if(cf != null){
				db.remove(cf);
				db.getTransaction().begin();
				if(seatType == "bussiness"){
					cf.setBusinessNumber(value);
				} else if(seatType =="first"){
					cf.setFirstNumber(value);
				} else {
					cf.setTouristNumber(value);
				}
				
				db.getTransaction().commit();
			}
		} catch(Exception e) {
            e.printStackTrace();
        }
		return cf;
	}
}