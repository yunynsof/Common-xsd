//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.common.profile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para SubscriptionDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="effectiveDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastExecuteDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rentalPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subscriber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionDetail", namespace = "http://tigo.com.hn/profile/SubscriberResponse/V1", propOrder = {
    "effectiveDay",
    "expireDate",
    "lastExecuteDate",
    "status",
    "productId",
    "product",
    "rentalPeriod",
    "subscriber"
})
public class SubscriptionDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDay;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastExecuteDate;
    @XmlElement(required = true)
    protected String status;
    protected long productId;
    @XmlElement(required = true)
    protected String product;
    @XmlElement(required = true)
    protected String rentalPeriod;
    @XmlElement(required = true)
    protected String subscriber;

    /**
     * Obtiene el valor de la propiedad effectiveDay.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDay() {
        return effectiveDay;
    }

    /**
     * Define el valor de la propiedad effectiveDay.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDay(XMLGregorianCalendar value) {
        this.effectiveDay = value;
    }

    public boolean isSetEffectiveDay() {
        return (this.effectiveDay!= null);
    }

    /**
     * Obtiene el valor de la propiedad expireDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Define el valor de la propiedad expireDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    public boolean isSetExpireDate() {
        return (this.expireDate!= null);
    }

    /**
     * Obtiene el valor de la propiedad lastExecuteDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastExecuteDate() {
        return lastExecuteDate;
    }

    /**
     * Define el valor de la propiedad lastExecuteDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastExecuteDate(XMLGregorianCalendar value) {
        this.lastExecuteDate = value;
    }

    public boolean isSetLastExecuteDate() {
        return (this.lastExecuteDate!= null);
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    public boolean isSetProductId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad product.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Define el valor de la propiedad product.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    public boolean isSetProduct() {
        return (this.product!= null);
    }

    /**
     * Obtiene el valor de la propiedad rentalPeriod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalPeriod() {
        return rentalPeriod;
    }

    /**
     * Define el valor de la propiedad rentalPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalPeriod(String value) {
        this.rentalPeriod = value;
    }

    public boolean isSetRentalPeriod() {
        return (this.rentalPeriod!= null);
    }

    /**
     * Obtiene el valor de la propiedad subscriber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriber() {
        return subscriber;
    }

    /**
     * Define el valor de la propiedad subscriber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriber(String value) {
        this.subscriber = value;
    }

    public boolean isSetSubscriber() {
        return (this.subscriber!= null);
    }

}
