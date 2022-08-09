//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:08 PM CST 
//


package hn.com.tigo.josm.gateway.services.fufillment.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para priceDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="priceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ammount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rtbEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rtbMinAmmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceDTO", propOrder = {
    "ammount",
    "rtbEnabled",
    "rtbMinAmmount",
    "tagName"
})
public class PriceDTO {

    protected Double ammount;
    protected Boolean rtbEnabled;
    protected Double rtbMinAmmount;
    protected String tagName;

    /**
     * Obtiene el valor de la propiedad ammount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmmount() {
        return ammount;
    }

    /**
     * Define el valor de la propiedad ammount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmmount(Double value) {
        this.ammount = value;
    }

    /**
     * Obtiene el valor de la propiedad rtbEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtbEnabled() {
        return rtbEnabled;
    }

    /**
     * Define el valor de la propiedad rtbEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtbEnabled(Boolean value) {
        this.rtbEnabled = value;
    }

    /**
     * Obtiene el valor de la propiedad rtbMinAmmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRtbMinAmmount() {
        return rtbMinAmmount;
    }

    /**
     * Define el valor de la propiedad rtbMinAmmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRtbMinAmmount(Double value) {
        this.rtbMinAmmount = value;
    }

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

}
