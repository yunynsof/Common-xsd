//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameProduct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descriptionProduct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idProductFamily" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameProductFamily" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productDetail", namespace = "http://tigo.com.hn/component/productPageResponse/V1", propOrder = {
    "idProduct",
    "nameProduct",
    "descriptionProduct",
    "idProductFamily",
    "nameProductFamily"
})
public class ProductDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idProduct;
    @XmlElement(required = true)
    protected String nameProduct;
    @XmlElement(required = true)
    protected String descriptionProduct;
    protected long idProductFamily;
    @XmlElement(required = true)
    protected String nameProductFamily;

    /**
     * Obtiene el valor de la propiedad idProduct.
     * 
     */
    public long getIdProduct() {
        return idProduct;
    }

    /**
     * Define el valor de la propiedad idProduct.
     * 
     */
    public void setIdProduct(long value) {
        this.idProduct = value;
    }

    public boolean isSetIdProduct() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad nameProduct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameProduct() {
        return nameProduct;
    }

    /**
     * Define el valor de la propiedad nameProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameProduct(String value) {
        this.nameProduct = value;
    }

    public boolean isSetNameProduct() {
        return (this.nameProduct!= null);
    }

    /**
     * Obtiene el valor de la propiedad descriptionProduct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    /**
     * Define el valor de la propiedad descriptionProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionProduct(String value) {
        this.descriptionProduct = value;
    }

    public boolean isSetDescriptionProduct() {
        return (this.descriptionProduct!= null);
    }

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

}
