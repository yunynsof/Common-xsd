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
 * <p>Clase Java para PromotionMetricsRedeemedDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionMetricsRedeemedDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEvent" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="eventName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="redeemed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="redeemedPercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="notRedeemed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="notRedeemedPercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionMetricsRedeemedDetail", namespace = "http://www.example.org/PromotionMetricsRedeemedResponse", propOrder = {
    "idEvent",
    "eventName",
    "redeemed",
    "redeemedPercent",
    "notRedeemed",
    "notRedeemedPercent",
    "description"
})
public class PromotionMetricsRedeemedDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idEvent;
    @XmlElement(required = true)
    protected String eventName;
    protected long redeemed;
    protected double redeemedPercent;
    protected long notRedeemed;
    protected double notRedeemedPercent;
    @XmlElement(required = true)
    protected String description;

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
     * Obtiene el valor de la propiedad redeemed.
     * 
     */
    public long getRedeemed() {
        return redeemed;
    }

    /**
     * Define el valor de la propiedad redeemed.
     * 
     */
    public void setRedeemed(long value) {
        this.redeemed = value;
    }

    public boolean isSetRedeemed() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad redeemedPercent.
     * 
     */
    public double getRedeemedPercent() {
        return redeemedPercent;
    }

    /**
     * Define el valor de la propiedad redeemedPercent.
     * 
     */
    public void setRedeemedPercent(double value) {
        this.redeemedPercent = value;
    }

    public boolean isSetRedeemedPercent() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad notRedeemed.
     * 
     */
    public long getNotRedeemed() {
        return notRedeemed;
    }

    /**
     * Define el valor de la propiedad notRedeemed.
     * 
     */
    public void setNotRedeemed(long value) {
        this.notRedeemed = value;
    }

    public boolean isSetNotRedeemed() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad notRedeemedPercent.
     * 
     */
    public double getNotRedeemedPercent() {
        return notRedeemedPercent;
    }

    /**
     * Define el valor de la propiedad notRedeemedPercent.
     * 
     */
    public void setNotRedeemedPercent(double value) {
        this.notRedeemedPercent = value;
    }

    public boolean isSetNotRedeemedPercent() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

}
