//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.common.profile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProfileTypeDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProfileTypeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProfileType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameProfileType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descriptionProfileType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileTypeDetail", namespace = "http://tigo.com.hn/profile/ProfileTypeDetail/V1", propOrder = {
    "idProfileType",
    "nameProfileType",
    "descriptionProfileType"
})
public class ProfileTypeDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idProfileType;
    @XmlElement(required = true)
    protected String nameProfileType;
    @XmlElement(required = true, nillable = true)
    protected String descriptionProfileType;

    /**
     * Obtiene el valor de la propiedad idProfileType.
     * 
     */
    public long getIdProfileType() {
        return idProfileType;
    }

    /**
     * Define el valor de la propiedad idProfileType.
     * 
     */
    public void setIdProfileType(long value) {
        this.idProfileType = value;
    }

    public boolean isSetIdProfileType() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad nameProfileType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameProfileType() {
        return nameProfileType;
    }

    /**
     * Define el valor de la propiedad nameProfileType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameProfileType(String value) {
        this.nameProfileType = value;
    }

    public boolean isSetNameProfileType() {
        return (this.nameProfileType!= null);
    }

    /**
     * Obtiene el valor de la propiedad descriptionProfileType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionProfileType() {
        return descriptionProfileType;
    }

    /**
     * Define el valor de la propiedad descriptionProfileType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionProfileType(String value) {
        this.descriptionProfileType = value;
    }

    public boolean isSetDescriptionProfileType() {
        return (this.descriptionProfileType!= null);
    }

}
