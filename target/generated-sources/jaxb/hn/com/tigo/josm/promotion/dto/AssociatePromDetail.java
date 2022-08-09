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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AssociatePromDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AssociatePromDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="eventName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventTheshold" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatePromDetail", namespace = "http://www.example.org/PromotionMetricsProductResponse", propOrder = {
    "eventId",
    "eventName",
    "eventDescription",
    "eventTheshold"
})
public class AssociatePromDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long eventId;
    @XmlElement(required = true)
    protected String eventName;
    @XmlElement(required = true)
    protected String eventDescription;
    protected long eventTheshold;

    /**
     * Obtiene el valor de la propiedad eventId.
     * 
     */
    public long getEventId() {
        return eventId;
    }

    /**
     * Define el valor de la propiedad eventId.
     * 
     */
    public void setEventId(long value) {
        this.eventId = value;
    }

    public boolean isSetEventId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad eventName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Define el valor de la propiedad eventName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    public boolean isSetEventName() {
        return (this.eventName!= null);
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
     * Obtiene el valor de la propiedad eventTheshold.
     * 
     */
    public long getEventTheshold() {
        return eventTheshold;
    }

    /**
     * Define el valor de la propiedad eventTheshold.
     * 
     */
    public void setEventTheshold(long value) {
        this.eventTheshold = value;
    }

    public boolean isSetEventTheshold() {
        return true;
    }

}
