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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LoadSubscriberPromotionRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoadSubscriberPromotionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promotionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subscriberList" type="{http://tigo.com.hn/promotion/loadSubscriberPromotionRequest/v1}subscriberList"/>
 *         &lt;element name="additionalParameters" type="{http://tigo.com/josm/gateway/services/order/AdditionalParameterDTO/V1}AdditionalParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadSubscriberPromotionRequest", namespace = "http://tigo.com.hn/promotion/loadSubscriberPromotionRequest/v1", propOrder = {
    "transactionId",
    "promotionId",
    "eventType",
    "subscriberList",
    "additionalParameters"
})
public class LoadSubscriberPromotionRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String transactionId;
    protected long promotionId;
    @XmlElement(required = true)
    protected String eventType;
    @XmlElement(required = true)
    protected SubscriberList subscriberList;
    protected AdditionalParameters additionalParameters;

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
     * Obtiene el valor de la propiedad promotionId.
     * 
     */
    public long getPromotionId() {
        return promotionId;
    }

    /**
     * Define el valor de la propiedad promotionId.
     * 
     */
    public void setPromotionId(long value) {
        this.promotionId = value;
    }

    public boolean isSetPromotionId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad eventType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Define el valor de la propiedad eventType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    public boolean isSetEventType() {
        return (this.eventType!= null);
    }

    /**
     * Obtiene el valor de la propiedad subscriberList.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberList }
     *     
     */
    public SubscriberList getSubscriberList() {
        return subscriberList;
    }

    /**
     * Define el valor de la propiedad subscriberList.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberList }
     *     
     */
    public void setSubscriberList(SubscriberList value) {
        this.subscriberList = value;
    }

    public boolean isSetSubscriberList() {
        return (this.subscriberList!= null);
    }

    /**
     * Obtiene el valor de la propiedad additionalParameters.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalParameters }
     *     
     */
    public AdditionalParameters getAdditionalParameters() {
        return additionalParameters;
    }

    /**
     * Define el valor de la propiedad additionalParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalParameters }
     *     
     */
    public void setAdditionalParameters(AdditionalParameters value) {
        this.additionalParameters = value;
    }

    public boolean isSetAdditionalParameters() {
        return (this.additionalParameters!= null);
    }

}
