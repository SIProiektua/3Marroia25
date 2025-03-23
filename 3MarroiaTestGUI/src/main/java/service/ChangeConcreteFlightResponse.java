
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para changeConcreteFlightResponse complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="changeConcreteFlightResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://businessLogic/}concreteFlight" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeConcreteFlightResponse", propOrder = {
    "_return"
})
public class ChangeConcreteFlightResponse {

    @Override
	public String toString() {
		return "ChangeConcreteFlightResponse [_return=" + _return + "]";
	}

	@XmlElement(name = "return")
    protected ConcreteFlight _return;

    /**
     * Obtiene el valor de la propiedad return.
     *
     * @return
     *     possible object is
     *     {@link ConcreteFlight }
     *
     */
    public ConcreteFlight getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     *
     * @param value
     *     allowed object is
     *     {@link ConcreteFlight }
     *
     */
    public void setReturn(ConcreteFlight value) {
        this._return = value;
    }

}
