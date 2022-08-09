//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:10 PM CST 
//


package hn.com.tigo.josm.promotion.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EventGroupDetailRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EventGroupDetailRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEvent" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventGroupDetailRequestType", namespace = "http://www.tigo.com.hn/EventGroupDetailRequest/V1", propOrder = {
    "idEvent",
    "threshold"
})
public class EventGroupDetailRequestType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idEvent;
    protected long threshold;

    /**
     * Obtiene el valor de la propiedad idEvent.
     * 
     */
    public long getIdEvent() {
        return idEvent;
    }

    /**
     * Define el valor de la propiedad idEvent.
     * 
     */
    public void setIdEvent(long value) {
        this.idEvent = value;
    }

    public boolean isSetIdEvent() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad threshold.
     * 
     */
    public long getThreshold() {
        return threshold;
    }

    /**
     * Define el valor de la propiedad threshold.
     * 
     */
    public void setThreshold(long value) {
        this.threshold = value;
    }

    public boolean isSetThreshold() {
        return true;
    }

}
