//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.subscription.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para deactivateSubscriptionsAll_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deactivateSubscriptionsAll_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="subscriberId" type="{http://tigo.com/josm/subscription/services/subscription/v1/schema}SubscriberId_Type"/>
 *         &lt;element name="cancellationReason">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deactivateSubscriptionsAll_Type", propOrder = {
    "transactionId",
    "subscriberId",
    "cancellationReason"
})
public class DeactivateSubscriptionsAllType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String transactionId;
    protected long subscriberId;
    protected int cancellationReason;

    /**
     * Obtiene el valor de la propiedad transactionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Define el valor de la propiedad transactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    public boolean isSetTransactionId() {
        return (this.transactionId!= null);
    }

    /**
     * Obtiene el valor de la propiedad subscriberId.
     * 
     */
    public long getSubscriberId() {
        return subscriberId;
    }

    /**
     * Define el valor de la propiedad subscriberId.
     * 
     */
    public void setSubscriberId(long value) {
        this.subscriberId = value;
    }

    public boolean isSetSubscriberId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad cancellationReason.
     * 
     */
    public int getCancellationReason() {
        return cancellationReason;
    }

    /**
     * Define el valor de la propiedad cancellationReason.
     * 
     */
    public void setCancellationReason(int value) {
        this.cancellationReason = value;
    }

    public boolean isSetCancellationReason() {
        return true;
    }

}
