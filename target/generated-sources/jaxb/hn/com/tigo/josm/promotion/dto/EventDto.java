//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.promotion.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EventDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EventDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEvent" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idEventGroup" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idEventGroupDetail" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameEvent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDto", namespace = "http://www.example.org/EventGroupDetail", propOrder = {
    "idEvent",
    "idEventGroup",
    "idEventGroupDetail",
    "threshold",
    "nameEvent",
    "eventDescription",
    "eventGroupName"
})
public class EventDto
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idEvent;
    protected long idEventGroup;
    protected long idEventGroupDetail;
    protected long threshold;
    @XmlElement(required = true)
    protected String nameEvent;
    @XmlElement(required = true)
    protected String eventDescription;
    @XmlElement(required = true)
    protected String eventGroupName;

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
     * Obtiene el valor de la propiedad idEventGroupDetail.
     * 
     */
    public long getIdEventGroupDetail() {
        return idEventGroupDetail;
    }

    /**
     * Define el valor de la propiedad idEventGroupDetail.
     * 
     */
    public void setIdEventGroupDetail(long value) {
        this.idEventGroupDetail = value;
    }

    public boolean isSetIdEventGroupDetail() {
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

    /**
     * Obtiene el valor de la propiedad nameEvent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEvent() {
        return nameEvent;
    }

    /**
     * Define el valor de la propiedad nameEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEvent(String value) {
        this.nameEvent = value;
    }

    public boolean isSetNameEvent() {
        return (this.nameEvent!= null);
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
     * Obtiene el valor de la propiedad eventGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventGroupName() {
        return eventGroupName;
    }

    /**
     * Define el valor de la propiedad eventGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventGroupName(String value) {
        this.eventGroupName = value;
    }

    public boolean isSetEventGroupName() {
        return (this.eventGroupName!= null);
    }

}
