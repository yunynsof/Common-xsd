//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:10 PM CST 
//


package hn.com.tigo.josm.promotion.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Category complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Category">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="behavior" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", namespace = "http://www.tigo.com.hn/CategoryResponse/v1", propOrder = {
    "id",
    "name",
    "categoryTypeId",
    "behavior"
})
public class Category
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long id;
    @XmlElement(required = true)
    protected String name;
    protected int categoryTypeId;
    protected int behavior;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    public boolean isSetId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Obtiene el valor de la propiedad categoryTypeId.
     * 
     */
    public int getCategoryTypeId() {
        return categoryTypeId;
    }

    /**
     * Define el valor de la propiedad categoryTypeId.
     * 
     */
    public void setCategoryTypeId(int value) {
        this.categoryTypeId = value;
    }

    public boolean isSetCategoryTypeId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad behavior.
     * 
     */
    public int getBehavior() {
        return behavior;
    }

    /**
     * Define el valor de la propiedad behavior.
     * 
     */
    public void setBehavior(int value) {
        this.behavior = value;
    }

    public boolean isSetBehavior() {
        return true;
    }

}
