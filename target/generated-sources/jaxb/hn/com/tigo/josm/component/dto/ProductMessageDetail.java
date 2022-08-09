//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:10 PM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productMessageDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productMessageDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProductMessage" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameProduct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idMessage" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="textMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startErrorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="endErrorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productMessageDetail", namespace = "http://tigo.com.hn/component/productMessagePageResponse/V1", propOrder = {
    "idProductMessage",
    "idProduct",
    "nameProduct",
    "idMessage",
    "textMessage",
    "startErrorCode",
    "endErrorCode"
})
public class ProductMessageDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idProductMessage;
    protected long idProduct;
    @XmlElement(required = true)
    protected String nameProduct;
    protected long idMessage;
    @XmlElement(required = true)
    protected String textMessage;
    protected long startErrorCode;
    protected long endErrorCode;

    /**
     * Obtiene el valor de la propiedad idProductMessage.
     * 
     */
    public long getIdProductMessage() {
        return idProductMessage;
    }

    /**
     * Define el valor de la propiedad idProductMessage.
     * 
     */
    public void setIdProductMessage(long value) {
        this.idProductMessage = value;
    }

    public boolean isSetIdProductMessage() {
        return true;
    }

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
     * Obtiene el valor de la propiedad idMessage.
     * 
     */
    public long getIdMessage() {
        return idMessage;
    }

    /**
     * Define el valor de la propiedad idMessage.
     * 
     */
    public void setIdMessage(long value) {
        this.idMessage = value;
    }

    public boolean isSetIdMessage() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad textMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextMessage() {
        return textMessage;
    }

    /**
     * Define el valor de la propiedad textMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextMessage(String value) {
        this.textMessage = value;
    }

    public boolean isSetTextMessage() {
        return (this.textMessage!= null);
    }

    /**
     * Obtiene el valor de la propiedad startErrorCode.
     * 
     */
    public long getStartErrorCode() {
        return startErrorCode;
    }

    /**
     * Define el valor de la propiedad startErrorCode.
     * 
     */
    public void setStartErrorCode(long value) {
        this.startErrorCode = value;
    }

    public boolean isSetStartErrorCode() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad endErrorCode.
     * 
     */
    public long getEndErrorCode() {
        return endErrorCode;
    }

    /**
     * Define el valor de la propiedad endErrorCode.
     * 
     */
    public void setEndErrorCode(long value) {
        this.endErrorCode = value;
    }

    public boolean isSetEndErrorCode() {
        return true;
    }

}
