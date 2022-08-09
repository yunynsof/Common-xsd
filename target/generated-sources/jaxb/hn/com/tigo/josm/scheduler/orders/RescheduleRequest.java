//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.scheduler.orders;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para RescheduleRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RescheduleRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newScheduleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="scheduleType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RescheduleRequest", namespace = "http://tigo.com.hn/scheduler/orders/RescheduleRequest/V1", propOrder = {
    "subscriberId",
    "newScheduleDate",
    "scheduleType"
})
public class RescheduleRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String subscriberId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar newScheduleDate;
    protected long scheduleType;

    /**
     * Obtiene el valor de la propiedad subscriberId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Define el valor de la propiedad subscriberId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    public boolean isSetSubscriberId() {
        return (this.subscriberId!= null);
    }

    /**
     * Obtiene el valor de la propiedad newScheduleDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewScheduleDate() {
        return newScheduleDate;
    }

    /**
     * Define el valor de la propiedad newScheduleDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewScheduleDate(XMLGregorianCalendar value) {
        this.newScheduleDate = value;
    }

    public boolean isSetNewScheduleDate() {
        return (this.newScheduleDate!= null);
    }

    /**
     * Obtiene el valor de la propiedad scheduleType.
     * 
     */
    public long getScheduleType() {
        return scheduleType;
    }

    /**
     * Define el valor de la propiedad scheduleType.
     * 
     */
    public void setScheduleType(long value) {
        this.scheduleType = value;
    }

    public boolean isSetScheduleType() {
        return true;
    }

}
