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
 * <p>Clase Java para CounterEventDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CounterEventDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCounterEvent" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idEventGroup" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idPromotion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idSubscriber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="promotion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="event" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="counter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterEventDetail", namespace = "http://www.example.org/CounterEventResponse", propOrder = {
    "idCounterEvent",
    "idEventGroup",
    "idPromotion",
    "idSubscriber",
    "promotion",
    "eventGroup",
    "event",
    "eventDescription",
    "threshold",
    "counter"
})
public class CounterEventDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idCounterEvent;
    protected long idEventGroup;
    protected long idPromotion;
    protected long idSubscriber;
    @XmlElement(required = true)
    protected String promotion;
    @XmlElement(required = true)
    protected String eventGroup;
    @XmlElement(required = true)
    protected String event;
    @XmlElement(required = true)
    protected String eventDescription;
    protected int threshold;
    protected int counter;

    /**
     * Obtiene el valor de la propiedad idCounterEvent.
     * 
     */
    public long getIdCounterEvent() {
        return idCounterEvent;
    }

    /**
     * Define el valor de la propiedad idCounterEvent.
     * 
     */
    public void setIdCounterEvent(long value) {
        this.idCounterEvent = value;
    }

    public boolean isSetIdCounterEvent() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad idEventGroup.
     * 
     */
    public long getIdEventGroup() {
        return idEventGroup;
    }

    /**
     * Define el valor de la propiedad idEventGroup.
     * 
     */
    public void setIdEventGroup(long value) {
        this.idEventGroup = value;
    }

    public boolean isSetIdEventGroup() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad idPromotion.
     * 
     */
    public long getIdPromotion() {
        return idPromotion;
    }

    /**
     * Define el valor de la propiedad idPromotion.
     * 
     */
    public void setIdPromotion(long value) {
        this.idPromotion = value;
    }

    public boolean isSetIdPromotion() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad idSubscriber.
     * 
     */
    public long getIdSubscriber() {
        return idSubscriber;
    }

    /**
     * Define el valor de la propiedad idSubscriber.
     * 
     */
    public void setIdSubscriber(long value) {
        this.idSubscriber = value;
    }

    public boolean isSetIdSubscriber() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad promotion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * Define el valor de la propiedad promotion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotion(String value) {
        this.promotion = value;
    }

    public boolean isSetPromotion() {
        return (this.promotion!= null);
    }

    /**
     * Obtiene el valor de la propiedad eventGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventGroup() {
        return eventGroup;
    }

    /**
     * Define el valor de la propiedad eventGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventGroup(String value) {
        this.eventGroup = value;
    }

    public boolean isSetEventGroup() {
        return (this.eventGroup!= null);
    }

    /**
     * Obtiene el valor de la propiedad event.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent() {
        return event;
    }

    /**
     * Define el valor de la propiedad event.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent(String value) {
        this.event = value;
    }

    public boolean isSetEvent() {
        return (this.event!= null);
    }

    /**
     * Obtiene el valor de la propiedad eventDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * Define el valor de la propiedad eventDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDescription(String value) {
        this.eventDescription = value;
    }

    public boolean isSetEventDescription() {
        return (this.eventDescription!= null);
    }

    /**
     * Obtiene el valor de la propiedad threshold.
     * 
     */
    public int getThreshold() {
        return threshold;
    }

    /**
     * Define el valor de la propiedad threshold.
     * 
     */
    public void setThreshold(int value) {
        this.threshold = value;
    }

    public boolean isSetThreshold() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad counter.
     * 
     */
    public int getCounter() {
        return counter;
    }

    /**
     * Define el valor de la propiedad counter.
     * 
     */
    public void setCounter(int value) {
        this.counter = value;
    }

    public boolean isSetCounter() {
        return true;
    }

}
