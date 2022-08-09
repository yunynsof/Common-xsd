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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para PromotionLogDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionLogDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idLog" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idPromotion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="promotionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idEvent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eventName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idTransaction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idAction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionLogDetail", namespace = "http://www.example.org/PromotionLogResponse", propOrder = {
    "idLog",
    "idPromotion",
    "promotionName",
    "msisdn",
    "logDate",
    "description",
    "idEvent",
    "eventName",
    "idTransaction",
    "idAction",
    "actionName"
})
public class PromotionLogDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int idLog;
    protected int idPromotion;
    @XmlElement(required = true)
    protected String promotionName;
    @XmlElement(required = true)
    protected String msisdn;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar logDate;
    @XmlElement(required = true)
    protected String description;
    protected int idEvent;
    @XmlElement(required = true)
    protected String eventName;
    @XmlElement(required = true)
    protected String idTransaction;
    protected int idAction;
    @XmlElement(required = true)
    protected String actionName;

    /**
     * Obtiene el valor de la propiedad idLog.
     * 
     */
    public int getIdLog() {
        return idLog;
    }

    /**
     * Define el valor de la propiedad idLog.
     * 
     */
    public void setIdLog(int value) {
        this.idLog = value;
    }

    public boolean isSetIdLog() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad idPromotion.
     * 
     */
    public int getIdPromotion() {
        return idPromotion;
    }

    /**
     * Define el valor de la propiedad idPromotion.
     * 
     */
    public void setIdPromotion(int value) {
        this.idPromotion = value;
    }

    public boolean isSetIdPromotion() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad promotionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * Define el valor de la propiedad promotionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionName(String value) {
        this.promotionName = value;
    }

    public boolean isSetPromotionName() {
        return (this.promotionName!= null);
    }

    /**
     * Obtiene el valor de la propiedad msisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Define el valor de la propiedad msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    public boolean isSetMsisdn() {
        return (this.msisdn!= null);
    }

    /**
     * Obtiene el valor de la propiedad logDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLogDate() {
        return logDate;
    }

    /**
     * Define el valor de la propiedad logDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLogDate(XMLGregorianCalendar value) {
        this.logDate = value;
    }

    public boolean isSetLogDate() {
        return (this.logDate!= null);
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

    /**
     * Obtiene el valor de la propiedad idEvent.
     * 
     */
    public int getIdEvent() {
        return idEvent;
    }

    /**
     * Define el valor de la propiedad idEvent.
     * 
     */
    public void setIdEvent(int value) {
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
     * Obtiene el valor de la propiedad idTransaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransaction() {
        return idTransaction;
    }

    /**
     * Define el valor de la propiedad idTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransaction(String value) {
        this.idTransaction = value;
    }

    public boolean isSetIdTransaction() {
        return (this.idTransaction!= null);
    }

    /**
     * Obtiene el valor de la propiedad idAction.
     * 
     */
    public int getIdAction() {
        return idAction;
    }

    /**
     * Define el valor de la propiedad idAction.
     * 
     */
    public void setIdAction(int value) {
        this.idAction = value;
    }

    public boolean isSetIdAction() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad actionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Define el valor de la propiedad actionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

    public boolean isSetActionName() {
        return (this.actionName!= null);
    }

}
