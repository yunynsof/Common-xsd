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
 * <p>Clase Java para UpdateCronExpressionRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UpdateCronExpressionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scheduleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="cronExpr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCronExpressionRequest", namespace = "http://tigo.com.hn/scheduler/orders/UpdateCronExpressionRequest/V1", propOrder = {
    "scheduleId",
    "subscriberId",
    "scheduleDate",
    "cronExpr"
})
public class UpdateCronExpressionRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long scheduleId;
    @XmlElement(required = true)
    protected String subscriberId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleDate;
    @XmlElement(required = true)
    protected String cronExpr;

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

}
