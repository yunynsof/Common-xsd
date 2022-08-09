//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.common.profile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubscriberProfileDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubscriberProfileDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="attributes" type="{http://tigo.com.hn/profile/SubscriberProfileResponse/V1}AttributesResponse" minOccurs="0"/>
 *         &lt;element name="transactionResponse" type="{http://tigo.com.hn/profile/SubscriberProfileResponse/V1}TransactionsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberProfileDetail", propOrder = {
    "subscriber",
    "profileId",
    "attributes",
    "transactionResponse"
})
public class SubscriberProfileDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String subscriber;
    protected int profileId;
    protected AttributesResponse attributes;
    protected TransactionsResponse transactionResponse;

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

    /**
     * Obtiene el valor de la propiedad profileId.
     * 
     */
    public int getProfileId() {
        return profileId;
    }

    /**
     * Define el valor de la propiedad profileId.
     * 
     */
    public void setProfileId(int value) {
        this.profileId = value;
    }

    public boolean isSetProfileId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad attributes.
     * 
     * @return
     *     possible object is
     *     {@link AttributesResponse }
     *     
     */
    public AttributesResponse getAttributes() {
        return attributes;
    }

    /**
     * Define el valor de la propiedad attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesResponse }
     *     
     */
    public void setAttributes(AttributesResponse value) {
        this.attributes = value;
    }

    public boolean isSetAttributes() {
        return (this.attributes!= null);
    }

    /**
     * Obtiene el valor de la propiedad transactionResponse.
     * 
     * @return
     *     possible object is
     *     {@link TransactionsResponse }
     *     
     */
    public TransactionsResponse getTransactionResponse() {
        return transactionResponse;
    }

    /**
     * Define el valor de la propiedad transactionResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionsResponse }
     *     
     */
    public void setTransactionResponse(TransactionsResponse value) {
        this.transactionResponse = value;
    }

    public boolean isSetTransactionResponse() {
        return (this.transactionResponse!= null);
    }

}
