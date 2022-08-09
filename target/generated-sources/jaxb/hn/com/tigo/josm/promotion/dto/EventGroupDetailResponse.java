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
 * <p>Clase Java para EventGroupDetailResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EventGroupDetailResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/PromotionResponse}PromotionResponse">
 *       &lt;sequence>
 *         &lt;element name="eventDtoList" type="{http://www.example.org/EventGroupDetail}EventDtoService"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventGroupDetailResponse", namespace = "http://www.example.org/EventGroupDetail", propOrder = {
    "eventDtoList"
})
public class EventGroupDetailResponse
    extends PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected EventDtoService eventDtoList;

    /**
     * Obtiene el valor de la propiedad eventDtoList.
     * 
     * @return
     *     possible object is
     *     {@link EventDtoService }
     *     
     */
    public EventDtoService getEventDtoList() {
        return eventDtoList;
    }

    /**
     * Define el valor de la propiedad eventDtoList.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDtoService }
     *     
     */
    public void setEventDtoList(EventDtoService value) {
        this.eventDtoList = value;
    }

    public boolean isSetEventDtoList() {
        return (this.eventDtoList!= null);
    }

}
