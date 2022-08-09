//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:10 PM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productParamDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productParamDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productParam" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nameProduct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idParam" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isAdditional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productParamDetail", namespace = "http://tigo.com.hn/component/productParamPagedResponse/V1", propOrder = {
    "productParam",
    "idProduct",
    "nameProduct",
    "orderType",
    "idParam",
    "nameParam",
    "value",
    "isAdditional"
})
public class ProductParamDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long productParam;
    @XmlElement(required = true)
    protected BigDecimal idProduct;
    @XmlElement(required = true)
    protected String nameProduct;
    @XmlElement(required = true)
    protected String orderType;
    protected long idParam;
    @XmlElement(required = true)
    protected String nameParam;
    @XmlElement(required = true)
    protected String value;
    @XmlElement(required = true)
    protected String isAdditional;

    /**
     * Obtiene el valor de la propiedad productParam.
     * 
     */
    public long getProductParam() {
        return productParam;
    }

    /**
     * Define el valor de la propiedad productParam.
     * 
     */
    public void setProductParam(long value) {
        this.productParam = value;
    }

    public boolean isSetProductParam() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad idProduct.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdProduct() {
        return idProduct;
    }

    /**
     * Define el valor de la propiedad idProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdProduct(BigDecimal value) {
        this.idProduct = value;
    }

    public boolean isSetIdProduct() {
        return (this.idProduct!= null);
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
     * Obtiene el valor de la propiedad orderType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Define el valor de la propiedad orderType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    public boolean isSetOrderType() {
        return (this.orderType!= null);
    }

    /**
     * Obtiene el valor de la propiedad idParam.
     * 
     */
    public long getIdParam() {
        return idParam;
    }

    /**
     * Define el valor de la propiedad idParam.
     * 
     */
    public void setIdParam(long value) {
        this.idParam = value;
    }

    public boolean isSetIdParam() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad nameParam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameParam() {
        return nameParam;
    }

    /**
     * Define el valor de la propiedad nameParam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameParam(String value) {
        this.nameParam = value;
    }

    public boolean isSetNameParam() {
        return (this.nameParam!= null);
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Obtiene el valor de la propiedad isAdditional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAdditional() {
        return isAdditional;
    }

    /**
     * Define el valor de la propiedad isAdditional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAdditional(String value) {
        this.isAdditional = value;
    }

    public boolean isSetIsAdditional() {
        return (this.isAdditional!= null);
    }

}
