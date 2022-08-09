//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:08 PM CST 
//


package hn.com.tigo.josm.gateway.services.fufillment.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para acquiredProductDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="acquiredProductDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acquiredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="acquisitionEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="msisdnSubscriber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productDTO" type="{http://ws.business.api.fulfillmentengine.millicom.com/}productDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acquiredProductDTO", propOrder = {
    "acquiredDate",
    "acquisitionEndDate",
    "id",
    "msisdnSubscriber",
    "productDTO"
})
public class AcquiredProductDTO {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acquiredDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acquisitionEndDate;
    protected long id;
    protected String msisdnSubscriber;
    protected ProductDTO productDTO;

    /**
     * Obtiene el valor de la propiedad acquiredDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcquiredDate() {
        return acquiredDate;
    }

    /**
     * Define el valor de la propiedad acquiredDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcquiredDate(XMLGregorianCalendar value) {
        this.acquiredDate = value;
    }

    /**
     * Obtiene el valor de la propiedad acquisitionEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcquisitionEndDate() {
        return acquisitionEndDate;
    }

    /**
     * Define el valor de la propiedad acquisitionEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcquisitionEndDate(XMLGregorianCalendar value) {
        this.acquisitionEndDate = value;
    }

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

    /**
     * Obtiene el valor de la propiedad msisdnSubscriber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdnSubscriber() {
        return msisdnSubscriber;
    }

    /**
     * Define el valor de la propiedad msisdnSubscriber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdnSubscriber(String value) {
        this.msisdnSubscriber = value;
    }

    /**
     * Obtiene el valor de la propiedad productDTO.
     * 
     * @return
     *     possible object is
     *     {@link ProductDTO }
     *     
     */
    public ProductDTO getProductDTO() {
        return productDTO;
    }

    /**
     * Define el valor de la propiedad productDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDTO }
     *     
     */
    public void setProductDTO(ProductDTO value) {
        this.productDTO = value;
    }

}
