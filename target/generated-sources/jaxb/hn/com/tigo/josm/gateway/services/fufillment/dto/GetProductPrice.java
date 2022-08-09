//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:07 PM CST 
//


package hn.com.tigo.josm.gateway.services.fufillment.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para getProductPrice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getProductPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tagNameFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initValidateDateFilter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endValidateDateFilter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductPrice", propOrder = {
    "productId",
    "tagNameFilter",
    "initValidateDateFilter",
    "endValidateDateFilter"
})
public class GetProductPrice {

    protected Integer productId;
    protected String tagNameFilter;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initValidateDateFilter;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endValidateDateFilter;

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductId(Integer value) {
        this.productId = value;
    }

    /**
     * Obtiene el valor de la propiedad tagNameFilter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagNameFilter() {
        return tagNameFilter;
    }

    /**
     * Define el valor de la propiedad tagNameFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagNameFilter(String value) {
        this.tagNameFilter = value;
    }

    /**
     * Obtiene el valor de la propiedad initValidateDateFilter.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitValidateDateFilter() {
        return initValidateDateFilter;
    }

    /**
     * Define el valor de la propiedad initValidateDateFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitValidateDateFilter(XMLGregorianCalendar value) {
        this.initValidateDateFilter = value;
    }

    /**
     * Obtiene el valor de la propiedad endValidateDateFilter.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndValidateDateFilter() {
        return endValidateDateFilter;
    }

    /**
     * Define el valor de la propiedad endValidateDateFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndValidateDateFilter(XMLGregorianCalendar value) {
        this.endValidateDateFilter = value;
    }

}
