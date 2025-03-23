
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para concreteFlight complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="concreteFlight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="concreteFlightCode" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="bussinesNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="touristNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="firstNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flight" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concreteFlight", propOrder = {
    "concreteFlightCode",
    "date",
    "bussinesNumber",
    "touristNumber",
    "firstNumber",
    "time",
    "flight"
})
public class ConcreteFlight {

    @Override
	public String toString() {
    	return flight.getFlightCode() + " " +flight.getDepartingCity() + " " +flight.getArrivingCity() + " " + date.getYear() + "/" + date.getMonth() + "/" + date.getDay() + "/" + date.getHour()+":"+date.getMinute()+":"+date.getSecond() + "-->" + bussinesNumber + "/"
                + firstNumber + "/" + touristNumber;
	}

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String concreteFlightCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected int bussinesNumber;
    protected int touristNumber;
    protected int firstNumber;
    protected String time;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Flight flight;

    /**
     * Obtiene el valor de la propiedad concreteFlightCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConcreteFlightCode() {
        return concreteFlightCode;
    }

    /**
     * Define el valor de la propiedad concreteFlightCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConcreteFlightCode(String value) {
        this.concreteFlightCode = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Obtiene el valor de la propiedad bussinesNumber.
     *
     */
    public int getBussinesNumber() {
        return bussinesNumber;
    }

    /**
     * Define el valor de la propiedad bussinesNumber.
     *
     */
    public void setBussinesNumber(int value) {
        this.bussinesNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad touristNumber.
     *
     */
    public int getTouristNumber() {
        return touristNumber;
    }

    /**
     * Define el valor de la propiedad touristNumber.
     *
     */
    public void setTouristNumber(int value) {
        this.touristNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad firstNumber.
     *
     */
    public int getFirstNumber() {
        return firstNumber;
    }

    /**
     * Define el valor de la propiedad firstNumber.
     *
     */
    public void setFirstNumber(int value) {
        this.firstNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad time.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTime() {
        return time;
    }

    /**
     * Define el valor de la propiedad time.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Obtiene el valor de la propiedad flight.
     *
     * @return
     *     possible object is
     *     {@link Object }
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
     *     {@link Object }
     *
     */
    public void setFlight(Flight value) {
        this.flight = value;
    }

}
