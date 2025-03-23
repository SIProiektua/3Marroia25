
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para concreteFlightContainer complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="concreteFlightContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="concreteFlight" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="flight" type="{http://businessLogic/}flight" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concreteFlightContainer", propOrder = {
    "concreteFlight",
    "flight"
})
public class ConcreteFlightContainer {

    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected ConcreteFlight concreteFlight;
    protected Flight flight;

    /**
     * Obtiene el valor de la propiedad concreteFlight.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public ConcreteFlight getConcreteFlight() {
        return  concreteFlight;
    }

    /**
     * Define el valor de la propiedad concreteFlight.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setConcreteFlight(ConcreteFlight value) {
        this.concreteFlight = value;
    }

    @Override
	public String toString() {
		return  concreteFlight.toString()  + flight.getArrivingCity() +  flight.getDepartingCity() + flight.getFlightCode();
	}

	/**
     * Obtiene el valor de la propiedad flight.
     *
     * @return
     *     possible object is
     *     {@link Flight }
     *
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * Define el valor de la propiedad flight.
     *
     * @param value
     *     allowed object is
     *     {@link Flight }
     *
     */
    public void setFlight(Flight value) {
        this.flight = value;
    }

}
