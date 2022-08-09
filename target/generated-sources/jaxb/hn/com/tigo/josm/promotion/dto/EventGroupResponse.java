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
 * <p>Clase Java para EventGroupResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EventGroupResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/PromotionResponse}PromotionResponse">
 *       &lt;sequence>
 *         &lt;element name="eventGroupList" type="{http://www.example.org/EventGroupResponse}EventGroupResponseService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventGroupResponse", namespace = "http://www.example.org/EventGroupResponse", propOrder = {
    "eventGroupList"
})
public class EventGroupResponse
    extends PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected EventGroupResponseService eventGroupList;

    /**
     * Obtiene el valor de la propiedad eventGroupList.
     * 
     * @return
     *     possible object is
     *     {@link EventGroupResponseService }
     *     
     */
    public EventGroupResponseService getEventGroupList() {
        return eventGroupList;
    }

    /**
     * Define el valor de la propiedad eventGroupList.
     * 
     * @param value
     *     allowed object is
     *     {@link EventGroupResponseService }
     *     
     */
    public void setEventGroupList(EventGroupResponseService value) {
        this.eventGroupList = value;
    }

    public boolean isSetEventGroupList() {
        return (this.eventGroupList!= null);
    }

}
