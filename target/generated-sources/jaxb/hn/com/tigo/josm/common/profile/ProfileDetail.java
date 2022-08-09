//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.common.profile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProfileDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProfileDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProfile" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idProfileType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descriptionProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameProfileType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileDetail", namespace = "http://www.example.org/Profile", propOrder = {
    "idProfile",
    "idProfileType",
    "nameProfile",
    "descriptionProfile",
    "nameProfileType"
})
public class ProfileDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idProfile;
    protected long idProfileType;
    @XmlElement(required = true)
    protected String nameProfile;
    @XmlElement(required = true)
    protected String descriptionProfile;
    @XmlElement(required = true)
    protected String nameProfileType;

    /**
     * Obtiene el valor de la propiedad idProfile.
     * 
     */
    public long getIdProfile() {
        return idProfile;
    }

    /**
     * Define el valor de la propiedad idProfile.
     * 
     */
    public void setIdProfile(long value) {
        this.idProfile = value;
    }

    public boolean isSetIdProfile() {
        return true;
    }

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
     * Obtiene el valor de la propiedad nameProfile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameProfile() {
        return nameProfile;
    }

    /**
     * Define el valor de la propiedad nameProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameProfile(String value) {
        this.nameProfile = value;
    }

    public boolean isSetNameProfile() {
        return (this.nameProfile!= null);
    }

    /**
     * Obtiene el valor de la propiedad descriptionProfile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionProfile() {
        return descriptionProfile;
    }

    /**
     * Define el valor de la propiedad descriptionProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionProfile(String value) {
        this.descriptionProfile = value;
    }

    public boolean isSetDescriptionProfile() {
        return (this.descriptionProfile!= null);
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

}
