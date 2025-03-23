package domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
@XmlAccessorType(XmlAccessType.FIELD)
public class ConcreteFlightContainer implements Serializable{
	private static final long serialVersionUID = 1L;
	@XmlIDREF
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private ConcreteFlight concreteFlight;
	private Flight flight;
	public ConcreteFlightContainer(ConcreteFlight cf) {
		this.concreteFlight = cf;
		this.flight=cf.getFlight(); }
	public ConcreteFlightContainer() {
		concreteFlight = null;
		flight = null;  }
	public ConcreteFlight getConcreteFlight(){
		return concreteFlight; }
	public Flight getFlight(){
		return flight; }
	public String toString(){
		return concreteFlight+"/"+flight;
	}
}
