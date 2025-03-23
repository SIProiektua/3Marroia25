package domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class ConcreteFlight implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlID
    @Id
    public String concreteFlightCode;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    int bussinesNumber;
    int touristNumber;
    int firstNumber;
    String time;

	@XmlIDREF
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    public Flight flight;

    public ConcreteFlight(String concreteFlightCode, XMLGregorianCalendar xmlGregorianCalendar, int businessNumber, int firstNumber, int touristNumber,
                          String time, Flight flight) {
        this.concreteFlightCode = concreteFlightCode;
        this.date = convertToDate(xmlGregorianCalendar);
        this.bussinesNumber = businessNumber;
        this.firstNumber = firstNumber;
        this.touristNumber = touristNumber;
        this.flight = flight;
        this.time = time;
    }

    public String getConcreteFlightCode() {
        return concreteFlightCode;
    }

    public void setConcreteFlightCode(String concreteFlightCode) {
        this.concreteFlightCode = concreteFlightCode;
    }


    public XMLGregorianCalendar getDate() {
        return convertToXMLGregorianCalendar(this.date);
    }


    public void setDate(XMLGregorianCalendar date) {
        this.date = convertToDate(date);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getBussinesNumber() {
        return bussinesNumber;
    }

    public void setBusinessNumber(int businessNumber) {
        this.bussinesNumber = businessNumber;
    }

    public int getTouristNumber() {
        return touristNumber;
    }

    public void setTouristNumber(int touristNumber) {
        this.touristNumber = touristNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    @Override
    public String toString() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Add one to month since Calendar.MONTH is 0-based
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        return flight.toString() +  "-" + year + "/" + month + "/" + day + "/" + time + "-->" + bussinesNumber + "/"
                + firstNumber + "/" + touristNumber;
    }
 
   

    
    
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }


    private XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) {
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
            return null;
        }
    }


    private Date convertToDate(XMLGregorianCalendar xmlGregorianCalendar) {
        if (xmlGregorianCalendar != null) {
            return xmlGregorianCalendar.toGregorianCalendar().getTime();
        }
        return null;
    }
}
