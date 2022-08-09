//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:07 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SprSubscriberTypeFields complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SprSubscriberTypeFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="planCodeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entitlement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SprSubscriberTypeFields", namespace = "http://tigo.com.hn/SprAdapterConfig/V1", propOrder = {
    "planCodeType",
    "prefix",
    "entitlement",
    "fechaInicio",
    "fechaFin"
})
public class SprSubscriberTypeFields
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String planCodeType;
    @XmlElement(required = true)
    protected String prefix;
    @XmlElement(required = true)
    protected String entitlement;
    @XmlElement(required = true)
    protected String fechaInicio;
    @XmlElement(required = true)
    protected String fechaFin;

    /**
     * Obtiene el valor de la propiedad planCodeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanCodeType() {
        return planCodeType;
    }

    /**
     * Define el valor de la propiedad planCodeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanCodeType(String value) {
        this.planCodeType = value;
    }

    public boolean isSetPlanCodeType() {
        return (this.planCodeType!= null);
    }

    /**
     * Obtiene el valor de la propiedad prefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Define el valor de la propiedad prefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    public boolean isSetPrefix() {
        return (this.prefix!= null);
    }

    /**
     * Obtiene el valor de la propiedad entitlement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlement() {
        return entitlement;
    }

    /**
     * Define el valor de la propiedad entitlement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlement(String value) {
        this.entitlement = value;
    }

    public boolean isSetEntitlement() {
        return (this.entitlement!= null);
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicio(String value) {
        this.fechaInicio = value;
    }

    public boolean isSetFechaInicio() {
        return (this.fechaInicio!= null);
    }

    /**
     * Obtiene el valor de la propiedad fechaFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * Define el valor de la propiedad fechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFin(String value) {
        this.fechaFin = value;
    }

    public boolean isSetFechaFin() {
        return (this.fechaFin!= null);
    }

}
