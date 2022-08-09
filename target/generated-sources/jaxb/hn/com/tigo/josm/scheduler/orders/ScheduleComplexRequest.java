//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
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
 * <p>Clase Java para ScheduleComplexRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ScheduleComplexRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="scheduleType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="scheduleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="recurrent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cronExpr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complexOrderRequest" type="{http://tigo.com/josm/gateway/services/order/ComplexOrderRequest/V1}ComplexOrderRequest"/>
 *         &lt;element name="metaParameters" type="{http://tigo.com/josm/gateway/services/order/MetaParametersDTO/V1}MetaParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleComplexRequest", namespace = "http://tigo.com.hn/scheduler/orders/ScheduleSimpleRequest/V1", propOrder = {
    "subscriberId",
    "taskId",
    "scheduleType",
    "scheduleDate",
    "recurrent",
    "cronExpr",
    "threshold",
    "description",
    "complexOrderRequest",
    "metaParameters"
})
public class ScheduleComplexRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String subscriberId;
    protected long taskId;
    protected long scheduleType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleDate;
    protected boolean recurrent;
    protected String cronExpr;
    protected Long threshold;
    protected String description;
    @XmlElement(required = true)
    protected ComplexOrderRequest complexOrderRequest;
    protected MetaParameters metaParameters;

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
     * Obtiene el valor de la propiedad taskId.
     * 
     */
    public long getTaskId() {
        return taskId;
    }

    /**
     * Define el valor de la propiedad taskId.
     * 
     */
    public void setTaskId(long value) {
        this.taskId = value;
    }

    public boolean isSetTaskId() {
        return true;
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

    /**
     * Obtiene el valor de la propiedad scheduleDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Define el valor de la propiedad scheduleDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleDate(XMLGregorianCalendar value) {
        this.scheduleDate = value;
    }

    public boolean isSetScheduleDate() {
        return (this.scheduleDate!= null);
    }

    /**
     * Obtiene el valor de la propiedad recurrent.
     * 
     */
    public boolean isRecurrent() {
        return recurrent;
    }

    /**
     * Define el valor de la propiedad recurrent.
     * 
     */
    public void setRecurrent(boolean value) {
        this.recurrent = value;
    }

    public boolean isSetRecurrent() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad cronExpr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCronExpr() {
        return cronExpr;
    }

    /**
     * Define el valor de la propiedad cronExpr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCronExpr(String value) {
        this.cronExpr = value;
    }

    public boolean isSetCronExpr() {
        return (this.cronExpr!= null);
    }

    /**
     * Obtiene el valor de la propiedad threshold.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThreshold() {
        return threshold;
    }

    /**
     * Define el valor de la propiedad threshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThreshold(Long value) {
        this.threshold = value;
    }

    public boolean isSetThreshold() {
        return (this.threshold!= null);
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
     * Obtiene el valor de la propiedad complexOrderRequest.
     * 
     * @return
     *     possible object is
     *     {@link ComplexOrderRequest }
     *     
     */
    public ComplexOrderRequest getComplexOrderRequest() {
        return complexOrderRequest;
    }

    /**
     * Define el valor de la propiedad complexOrderRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexOrderRequest }
     *     
     */
    public void setComplexOrderRequest(ComplexOrderRequest value) {
        this.complexOrderRequest = value;
    }

    public boolean isSetComplexOrderRequest() {
        return (this.complexOrderRequest!= null);
    }

    /**
     * Obtiene el valor de la propiedad metaParameters.
     * 
     * @return
     *     possible object is
     *     {@link MetaParameters }
     *     
     */
    public MetaParameters getMetaParameters() {
        return metaParameters;
    }

    /**
     * Define el valor de la propiedad metaParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaParameters }
     *     
     */
    public void setMetaParameters(MetaParameters value) {
        this.metaParameters = value;
    }

    public boolean isSetMetaParameters() {
        return (this.metaParameters!= null);
    }

}
