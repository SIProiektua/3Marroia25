package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.XMLGregorianCalendar;
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Flight implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@XmlID
	public String flightCode;
	public String departingCity;
	public String arrivingCity;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	public List<ConcreteFlight> concreteFlights;

	public Flight(String flightCode, String departingCity, String arrivingCity) {
		super();

		this.flightCode = flightCode;
		this.departingCity = departingCity;
		this.arrivingCity = arrivingCity;
		concreteFlights = new ArrayList<ConcreteFlight>();
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getDepartingCity() {
		return departingCity;
	}

	public void setDepartingCity(String departingCity) {
		this.departingCity = departingCity;
	}

	public String getArrivingCity() {
		return arrivingCity;
	}

	public void setArrivingCity(String arrivingCity) {
		this.arrivingCity = arrivingCity;
	}

	public void addConcreteFlight(String concreteFlighCode, XMLGregorianCalendar xmlGregorianCalendar, int businessNumber, int firstNumber,
			int touristNumber, String time) {
		ConcreteFlight cf = new ConcreteFlight(concreteFlighCode, xmlGregorianCalendar, businessNumber, firstNumber, touristNumber,
				time, this);
		concreteFlights.add(cf);
	}

	public List<ConcreteFlight> getConcreteFlights() {
		return concreteFlights;
	}

	public void setConcreteFlights(List<ConcreteFlight> concreteFlights) {
		this.concreteFlights = concreteFlights;
	}

	@Override
	public String toString() {
		return flightCode + "/" + departingCity + "/" + arrivingCity;
	}
}
