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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionMetricsLoadSubscriberDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionMetricsLoadSubscriberDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="successPercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="failed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="failedPercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionMetricsLoadSubscriberDetail", namespace = "http://www.example.org/PromotionMetricsLoadSubscriberResponse", propOrder = {
    "success",
    "successPercent",
    "failed",
    "failedPercent"
})
public class PromotionMetricsLoadSubscriberDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long success;
    protected double successPercent;
    protected long failed;
    protected double failedPercent;

    /**
     * Obtiene el valor de la propiedad success.
     * 
     */
    public long getSuccess() {
        return success;
    }

    /**
     * Define el valor de la propiedad success.
     * 
     */
    public void setSuccess(long value) {
        this.success = value;
    }

    public boolean isSetSuccess() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad successPercent.
     * 
     */
    public double getSuccessPercent() {
        return successPercent;
    }

    /**
     * Define el valor de la propiedad successPercent.
     * 
     */
    public void setSuccessPercent(double value) {
        this.successPercent = value;
    }

    public boolean isSetSuccessPercent() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad failed.
     * 
     */
    public long getFailed() {
        return failed;
    }

    /**
     * Define el valor de la propiedad failed.
     * 
     */
    public void setFailed(long value) {
        this.failed = value;
    }

    public boolean isSetFailed() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad failedPercent.
     * 
     */
    public double getFailedPercent() {
        return failedPercent;
    }

    /**
     * Define el valor de la propiedad failedPercent.
     * 
     */
    public void setFailedPercent(double value) {
        this.failedPercent = value;
    }

    public boolean isSetFailedPercent() {
        return true;
    }

}
