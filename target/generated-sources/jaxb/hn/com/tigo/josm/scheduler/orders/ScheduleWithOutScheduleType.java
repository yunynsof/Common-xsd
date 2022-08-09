//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.scheduler.orders;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ScheduleWithOutScheduleType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ScheduleWithOutScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="scheduleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="recurrent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cronExpr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="metaParameters" type="{http://tigo.com/josm/gateway/services/order/MetaParametersDTO/V1}MetaParameters" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleWithOutScheduleType", propOrder = {
    "scheduleId",
    "taskId",
    "scheduleDate",
    "recurrent",
    "cronExpr",
    "state",
    "creationDate",
    "description",
    "threshold",
    "request",
    "retry",
    "metaParameters"
})
public class ScheduleWithOutScheduleType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long scheduleId;
    protected long taskId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleDate;
    @XmlElement(required = true)
    protected String recurrent;
    protected String cronExpr;
    protected String state;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected String description;
    protected Long threshold;
    protected String request;
    protected Integer retry;
    @XmlElement(nillable = true)
    protected List<MetaParameters> metaParameters;

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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrent() {
        return recurrent;
    }

    /**
     * Define el valor de la propiedad recurrent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrent(String value) {
        this.recurrent = value;
    }

    public boolean isSetRecurrent() {
        return (this.recurrent!= null);
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
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    public boolean isSetState() {
        return (this.state!= null);
    }

    /**
     * Obtiene el valor de la propiedad creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define el valor de la propiedad creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    public boolean isSetCreationDate() {
        return (this.creationDate!= null);
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
     * Obtiene el valor de la propiedad request.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequest() {
        return request;
    }

    /**
     * Define el valor de la propiedad request.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequest(String value) {
        this.request = value;
    }

    public boolean isSetRequest() {
        return (this.request!= null);
    }

    /**
     * Obtiene el valor de la propiedad retry.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetry() {
        return retry;
    }

    /**
     * Define el valor de la propiedad retry.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetry(Integer value) {
        this.retry = value;
    }

    public boolean isSetRetry() {
        return (this.retry!= null);
    }

    /**
     * Gets the value of the metaParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaParameters }
     * 
     * 
     */
    public List<MetaParameters> getMetaParameters() {
        if (metaParameters == null) {
            metaParameters = new ArrayList<MetaParameters>();
        }
        return this.metaParameters;
    }

    public boolean isSetMetaParameters() {
        return ((this.metaParameters!= null)&&(!this.metaParameters.isEmpty()));
    }

    public void unsetMetaParameters() {
        this.metaParameters = null;
    }

}
