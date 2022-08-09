//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.promotion.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionSType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/PromotionResponse}PromotionResponse">
 *       &lt;sequence>
 *         &lt;element name="promotionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionSType", namespace = "http://www.example.org/PromotionSType", propOrder = {
    "promotionId",
    "subscriberId",
    "transactionId"
})
public class PromotionSType
    extends PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long promotionId;
    protected long subscriberId;
    @XmlElement(required = true)
    protected String transactionId;

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

}
