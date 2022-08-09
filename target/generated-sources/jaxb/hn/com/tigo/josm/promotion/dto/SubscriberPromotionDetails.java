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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para SubscriberPromotionDetails complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubscriberPromotionDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSubscriberPromotion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idPromotion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="giftCounter" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberPromotionDetails", namespace = "http://www.example.org/SubscriberPromotionResponse", propOrder = {
    "idSubscriberPromotion",
    "msisdn",
    "state",
    "idPromotion",
    "giftCounter",
    "createDate"
})
public class SubscriberPromotionDetails
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idSubscriberPromotion;
    protected long msisdn;
    protected long state;
    protected long idPromotion;
    protected long giftCounter;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;

    /**
     * Obtiene el valor de la propiedad idSubscriberPromotion.
     * 
     */
    public long getIdSubscriberPromotion() {
        return idSubscriberPromotion;
    }

    /**
     * Define el valor de la propiedad idSubscriberPromotion.
     * 
     */
    public void setIdSubscriberPromotion(long value) {
        this.idSubscriberPromotion = value;
    }

    public boolean isSetIdSubscriberPromotion() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad msisdn.
     * 
     */
    public long getMsisdn() {
        return msisdn;
    }

    /**
     * Define el valor de la propiedad msisdn.
     * 
     */
    public void setMsisdn(long value) {
        this.msisdn = value;
    }

    public boolean isSetMsisdn() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     */
    public long getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     */
    public void setState(long value) {
        this.state = value;
    }

    public boolean isSetState() {
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
     * Obtiene el valor de la propiedad giftCounter.
     * 
     */
    public long getGiftCounter() {
        return giftCounter;
    }

    /**
     * Define el valor de la propiedad giftCounter.
     * 
     */
    public void setGiftCounter(long value) {
        this.giftCounter = value;
    }

    public boolean isSetGiftCounter() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad createDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Define el valor de la propiedad createDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    public boolean isSetCreateDate() {
        return (this.createDate!= null);
    }

}
