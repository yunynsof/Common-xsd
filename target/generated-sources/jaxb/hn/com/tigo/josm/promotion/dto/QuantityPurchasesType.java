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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para QuantityPurchasesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QuantityPurchasesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productPurchases" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="productDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalSubscribers" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="executionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityPurchasesType", namespace = "http://www.example.org/PromotionMetricsQuantityPurchasesResponse", propOrder = {
    "eventName",
    "productPurchases",
    "productDescription",
    "totalSubscribers",
    "percent",
    "executionDate"
})
public class QuantityPurchasesType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String eventName;
    protected long productPurchases;
    @XmlElement(required = true)
    protected String productDescription;
    protected long totalSubscribers;
    protected double percent;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar executionDate;

    /**
     * Obtiene el valor de la propiedad eventName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Define el valor de la propiedad eventName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    public boolean isSetEventName() {
        return (this.eventName!= null);
    }

    /**
     * Obtiene el valor de la propiedad productPurchases.
     * 
     */
    public long getProductPurchases() {
        return productPurchases;
    }

    /**
     * Define el valor de la propiedad productPurchases.
     * 
     */
    public void setProductPurchases(long value) {
        this.productPurchases = value;
    }

    public boolean isSetProductPurchases() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad productDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Define el valor de la propiedad productDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    public boolean isSetProductDescription() {
        return (this.productDescription!= null);
    }

    /**
     * Obtiene el valor de la propiedad totalSubscribers.
     * 
     */
    public long getTotalSubscribers() {
        return totalSubscribers;
    }

    /**
     * Define el valor de la propiedad totalSubscribers.
     * 
     */
    public void setTotalSubscribers(long value) {
        this.totalSubscribers = value;
    }

    public boolean isSetTotalSubscribers() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad percent.
     * 
     */
    public double getPercent() {
        return percent;
    }

    /**
     * Define el valor de la propiedad percent.
     * 
     */
    public void setPercent(double value) {
        this.percent = value;
    }

    public boolean isSetPercent() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad executionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecutionDate() {
        return executionDate;
    }

    /**
     * Define el valor de la propiedad executionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecutionDate(XMLGregorianCalendar value) {
        this.executionDate = value;
    }

    public boolean isSetExecutionDate() {
        return (this.executionDate!= null);
    }

}
