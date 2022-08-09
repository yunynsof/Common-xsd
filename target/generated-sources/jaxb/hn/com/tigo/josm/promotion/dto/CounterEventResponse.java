//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.promotion.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CounterEventResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CounterEventResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/PromotionResponse}PromotionResponse">
 *       &lt;sequence>
 *         &lt;element name="CounterEventList" type="{http://www.example.org/CounterEventResponse}CounterEventResponseService"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterEventResponse", namespace = "http://www.example.org/CounterEventResponse", propOrder = {
    "counterEventList"
})
public class CounterEventResponse
    extends PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CounterEventList", required = true)
    protected CounterEventResponseService counterEventList;

    /**
     * Obtiene el valor de la propiedad counterEventList.
     * 
     * @return
     *     possible object is
     *     {@link CounterEventResponseService }
     *     
     */
    public CounterEventResponseService getCounterEventList() {
        return counterEventList;
    }

    /**
     * Define el valor de la propiedad counterEventList.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterEventResponseService }
     *     
     */
    public void setCounterEventList(CounterEventResponseService value) {
        this.counterEventList = value;
    }

    public boolean isSetCounterEventList() {
        return (this.counterEventList!= null);
    }

}
