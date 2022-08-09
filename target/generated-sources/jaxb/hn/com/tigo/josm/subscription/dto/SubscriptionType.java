//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.subscription.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para subscription_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="subscription_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberId" type="{http://tigo.com/josm/subscription/services/subscription/v1/schema}SubscriberId_Type"/>
 *         &lt;element name="productId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="recurrenceMinutes">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="attempts">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="renewals" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="warningMessage" type="{http://tigo.com/josm/subscription/services/subscription/v1/schema}warningMessage_Type" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscription_Type", propOrder = {
    "subscriberId",
    "productId",
    "startDate",
    "recurrenceMinutes",
    "attempts",
    "renewals",
    "warningMessage",
    "error"
})
public class SubscriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long subscriberId;
    protected long productId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected int recurrenceMinutes;
    protected int attempts;
    protected Integer renewals;
    protected WarningMessageType warningMessage;
    protected boolean error;

    /**
     * Obtiene el valor de la propiedad subscriberId.
     * 
     */
    public long getSubscriberId() {
        return subscriberId;
    }

    /**
     * Define el valor de la propiedad subscriberId.
     * 
     */
    public void setSubscriberId(long value) {
        this.subscriberId = value;
    }

    public boolean isSetSubscriberId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    public boolean isSetProductId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    public boolean isSetStartDate() {
        return (this.startDate!= null);
    }

    /**
     * Obtiene el valor de la propiedad recurrenceMinutes.
     * 
     */
    public int getRecurrenceMinutes() {
        return recurrenceMinutes;
    }

    /**
     * Define el valor de la propiedad recurrenceMinutes.
     * 
     */
    public void setRecurrenceMinutes(int value) {
        this.recurrenceMinutes = value;
    }

    public boolean isSetRecurrenceMinutes() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad attempts.
     * 
     */
    public int getAttempts() {
        return attempts;
    }

    /**
     * Define el valor de la propiedad attempts.
     * 
     */
    public void setAttempts(int value) {
        this.attempts = value;
    }

    public boolean isSetAttempts() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad renewals.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRenewals() {
        return renewals;
    }

    /**
     * Define el valor de la propiedad renewals.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRenewals(Integer value) {
        this.renewals = value;
    }

    public boolean isSetRenewals() {
        return (this.renewals!= null);
    }

    /**
     * Obtiene el valor de la propiedad warningMessage.
     * 
     * @return
     *     possible object is
     *     {@link WarningMessageType }
     *     
     */
    public WarningMessageType getWarningMessage() {
        return warningMessage;
    }

    /**
     * Define el valor de la propiedad warningMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningMessageType }
     *     
     */
    public void setWarningMessage(WarningMessageType value) {
        this.warningMessage = value;
    }

    public boolean isSetWarningMessage() {
        return (this.warningMessage!= null);
    }

    /**
     * Obtiene el valor de la propiedad error.
     * 
     */
    public boolean isError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     */
    public void setError(boolean value) {
        this.error = value;
    }

    public boolean isSetError() {
        return true;
    }

}
