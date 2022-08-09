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
 * <p>Clase Java para ResetSubscriberPromotionRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResetSubscriberPromotionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promotionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eventGroupType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ResetSubscriberPromotionRequest", namespace = "http://tigo.com.hn/promotion/resetSubscriberPromotionRequest/v1", propOrder = {
    "transactionId",
    "promotionId",
    "msisdn",
    "eventGroupType",
    "eventType",
    "counter"
})
public class ResetSubscriberPromotionRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String transactionId;
    protected long promotionId;
    protected int msisdn;
    @XmlElement(required = true)
    protected String eventGroupType;
    @XmlElement(required = true)
    protected String eventType;
    protected int counter;

    /**
     * Obtiene el valor de la propiedad transactionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Define el valor de la propiedad transactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    public boolean isSetTransactionId() {
        return (this.transactionId!= null);
    }

    /**
     * Obtiene el valor de la propiedad promotionId.
     * 
     */
    public long getPromotionId() {
        return promotionId;
    }

    /**
     * Define el valor de la propiedad promotionId.
     * 
     */
    public void setPromotionId(long value) {
        this.promotionId = value;
    }

    public boolean isSetPromotionId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad msisdn.
     * 
     */
    public int getMsisdn() {
        return msisdn;
    }

    /**
     * Define el valor de la propiedad msisdn.
     * 
     */
    public void setMsisdn(int value) {
        this.msisdn = value;
    }

    public boolean isSetMsisdn() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad eventGroupType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventGroupType() {
        return eventGroupType;
    }

    /**
     * Define el valor de la propiedad eventGroupType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventGroupType(String value) {
        this.eventGroupType = value;
    }

    public boolean isSetEventGroupType() {
        return (this.eventGroupType!= null);
    }

    /**
     * Obtiene el valor de la propiedad eventType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Define el valor de la propiedad eventType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    public boolean isSetEventType() {
        return (this.eventType!= null);
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
