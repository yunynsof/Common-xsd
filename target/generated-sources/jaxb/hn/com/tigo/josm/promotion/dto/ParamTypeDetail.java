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
 * <p>Clase Java para ParamTypeDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParamTypeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="formatType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="formatExample" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamTypeDetail", namespace = "http://www.example.org/ParamTypeResponse", propOrder = {
    "idType",
    "nameType",
    "formatType",
    "formatExample"
})
public class ParamTypeDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idType;
    @XmlElement(required = true)
    protected String nameType;
    @XmlElement(required = true)
    protected String formatType;
    @XmlElement(required = true)
    protected String formatExample;

    /**
     * Obtiene el valor de la propiedad idType.
     * 
     */
    public long getIdType() {
        return idType;
    }

    /**
     * Define el valor de la propiedad idType.
     * 
     */
    public void setIdType(long value) {
        this.idType = value;
    }

    public boolean isSetIdType() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad nameType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * Define el valor de la propiedad nameType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameType(String value) {
        this.nameType = value;
    }

    public boolean isSetNameType() {
        return (this.nameType!= null);
    }

    /**
     * Obtiene el valor de la propiedad formatType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatType() {
        return formatType;
    }

    /**
     * Define el valor de la propiedad formatType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatType(String value) {
        this.formatType = value;
    }

    public boolean isSetFormatType() {
        return (this.formatType!= null);
    }

    /**
     * Obtiene el valor de la propiedad formatExample.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatExample() {
        return formatExample;
    }

    /**
     * Define el valor de la propiedad formatExample.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatExample(String value) {
        this.formatExample = value;
    }

    public boolean isSetFormatExample() {
        return (this.formatExample!= null);
    }

}
