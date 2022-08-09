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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para productPolicyInstaceDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productPolicyInstaceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProductPolicyInstance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameProduct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idPolicyInstance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="namePolicyInstance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productPolicyInstaceDetail", namespace = "http://tigo.com.hn/component/productPolicyInstacePagedResponse/V1", propOrder = {
    "idProductPolicyInstance",
    "idProduct",
    "nameProduct",
    "idPolicyInstance",
    "namePolicyInstance",
    "startDate",
    "endDate",
    "priority",
    "orderType"
})
public class ProductPolicyInstaceDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idProductPolicyInstance;
    protected long idProduct;
    @XmlElement(required = true)
    protected String nameProduct;
    protected long idPolicyInstance;
    @XmlElement(required = true)
    protected String namePolicyInstance;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String priority;
    protected String orderType;

    /**
     * Obtiene el valor de la propiedad idProductPolicyInstance.
     * 
     */
    public long getIdProductPolicyInstance() {
        return idProductPolicyInstance;
    }

    /**
     * Define el valor de la propiedad idProductPolicyInstance.
     * 
     */
    public void setIdProductPolicyInstance(long value) {
        this.idProductPolicyInstance = value;
    }

    public boolean isSetIdProductPolicyInstance() {
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
     * Obtiene el valor de la propiedad idPolicyInstance.
     * 
     */
    public long getIdPolicyInstance() {
        return idPolicyInstance;
    }

    /**
     * Define el valor de la propiedad idPolicyInstance.
     * 
     */
    public void setIdPolicyInstance(long value) {
        this.idPolicyInstance = value;
    }

    public boolean isSetIdPolicyInstance() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad namePolicyInstance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePolicyInstance() {
        return namePolicyInstance;
    }

    /**
     * Define el valor de la propiedad namePolicyInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePolicyInstance(String value) {
        this.namePolicyInstance = value;
    }

    public boolean isSetNamePolicyInstance() {
        return (this.namePolicyInstance!= null);
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    public boolean isSetStartDate() {
        return (this.startDate!= null);
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    public boolean isSetEndDate() {
        return (this.endDate!= null);
    }

    /**
     * Obtiene el valor de la propiedad priority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Define el valor de la propiedad priority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    public boolean isSetPriority() {
        return (this.priority!= null);
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

}
