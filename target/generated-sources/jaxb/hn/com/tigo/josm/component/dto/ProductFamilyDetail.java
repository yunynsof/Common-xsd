//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productFamilyDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productFamilyDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProductFamily" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameProductFamily" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descriptionProductFamily" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productFamilyDetail", namespace = "http://tigo.com.hn/component/productFamilyPagedResponse", propOrder = {
    "idProductFamily",
    "nameProductFamily",
    "descriptionProductFamily"
})
public class ProductFamilyDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idProductFamily;
    @XmlElement(required = true)
    protected String nameProductFamily;
    @XmlElement(required = true)
    protected String descriptionProductFamily;

    /**
     * Obtiene el valor de la propiedad idProductFamily.
     * 
     */
    public long getIdProductFamily() {
        return idProductFamily;
    }

    /**
     * Define el valor de la propiedad idProductFamily.
     * 
     */
    public void setIdProductFamily(long value) {
        this.idProductFamily = value;
    }

    public boolean isSetIdProductFamily() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad nameProductFamily.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameProductFamily() {
        return nameProductFamily;
    }

    /**
     * Define el valor de la propiedad nameProductFamily.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameProductFamily(String value) {
        this.nameProductFamily = value;
    }

    public boolean isSetNameProductFamily() {
        return (this.nameProductFamily!= null);
    }

    /**
     * Obtiene el valor de la propiedad descriptionProductFamily.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionProductFamily() {
        return descriptionProductFamily;
    }

    /**
     * Define el valor de la propiedad descriptionProductFamily.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionProductFamily(String value) {
        this.descriptionProductFamily = value;
    }

    public boolean isSetDescriptionProductFamily() {
        return (this.descriptionProductFamily!= null);
    }

}
