//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:30 AM CST 
//


package hn.com.tigo.josm.gateway.services.fufillment.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para productPriceDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productPriceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ammount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rtbEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rtbMinAmmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="validityInitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="validityEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productPriceDTO", propOrder = {
    "tagName",
    "ammount",
    "rtbEnabled",
    "rtbMinAmmount",
    "validityInitDate",
    "validityEndDate"
})
public class ProductPriceDTO {

    @XmlElement(required = true)
    protected String tagName;
    protected double ammount;
    protected boolean rtbEnabled;
    @XmlSchemaType(name = "anySimpleType")
    protected Object rtbMinAmmount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityInitDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityEndDate;

    /**
     * Obtiene el valor de la propiedad tagName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * Define el valor de la propiedad tagName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagName(String value) {
        this.tagName = value;
    }

    /**
     * Obtiene el valor de la propiedad ammount.
     * 
     */
    public double getAmmount() {
        return ammount;
    }

    /**
     * Define el valor de la propiedad ammount.
     * 
     */
    public void setAmmount(double value) {
        this.ammount = value;
    }

    /**
     * Obtiene el valor de la propiedad rtbEnabled.
     * 
     */
    public boolean isRtbEnabled() {
        return rtbEnabled;
    }

    /**
     * Define el valor de la propiedad rtbEnabled.
     * 
     */
    public void setRtbEnabled(boolean value) {
        this.rtbEnabled = value;
    }

    /**
     * Obtiene el valor de la propiedad rtbMinAmmount.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRtbMinAmmount() {
        return rtbMinAmmount;
    }

    /**
     * Define el valor de la propiedad rtbMinAmmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRtbMinAmmount(Object value) {
        this.rtbMinAmmount = value;
    }

    /**
     * Obtiene el valor de la propiedad validityInitDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityInitDate() {
        return validityInitDate;
    }

    /**
     * Define el valor de la propiedad validityInitDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityInitDate(XMLGregorianCalendar value) {
        this.validityInitDate = value;
    }

    /**
     * Obtiene el valor de la propiedad validityEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityEndDate() {
        return validityEndDate;
    }

    /**
     * Define el valor de la propiedad validityEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityEndDate(XMLGregorianCalendar value) {
        this.validityEndDate = value;
    }

}
