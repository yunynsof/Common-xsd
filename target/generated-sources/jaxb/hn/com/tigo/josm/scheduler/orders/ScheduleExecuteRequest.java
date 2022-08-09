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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ScheduleExecuteRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ScheduleExecuteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="scheduleType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleExecuteRequest", namespace = "http://tigo.com.hn/scheduler/orders/ScheduleExecuteRequest/V1", propOrder = {
    "subscriberId",
    "scheduleId",
    "scheduleType",
    "taskId"
})
public class ScheduleExecuteRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String subscriberId;
    protected long scheduleId;
    protected Long scheduleType;
    protected Long taskId;

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
     * Obtiene el valor de la propiedad scheduleId.
     * 
     */
    public long getScheduleId() {
        return scheduleId;
    }

    /**
     * Define el valor de la propiedad scheduleId.
     * 
     */
    public void setScheduleId(long value) {
        this.scheduleId = value;
    }

    public boolean isSetScheduleId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad scheduleType.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScheduleType() {
        return scheduleType;
    }

    /**
     * Define el valor de la propiedad scheduleType.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScheduleType(Long value) {
        this.scheduleType = value;
    }

    public boolean isSetScheduleType() {
        return (this.scheduleType!= null);
    }

    /**
     * Obtiene el valor de la propiedad taskId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * Define el valor de la propiedad taskId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaskId(Long value) {
        this.taskId = value;
    }

    public boolean isSetTaskId() {
        return (this.taskId!= null);
    }

}
