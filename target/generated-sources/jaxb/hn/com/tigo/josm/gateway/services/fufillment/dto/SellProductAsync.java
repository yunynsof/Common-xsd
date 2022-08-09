//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:30 AM CST 
//


package hn.com.tigo.josm.gateway.services.fufillment.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sellProductAsync complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sellProductAsync">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ePINAgentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="externalTransacionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalParameters" type="{http://ws.business.api.fulfillmentengine.millicom.com/}additionalParameterDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sellProductAsync", propOrder = {
    "channelId",
    "customerId",
    "productId",
    "epinAgentId",
    "externalTransacionId",
    "comment",
    "additionalParameters"
})
public class SellProductAsync {

    protected Integer channelId;
    protected String customerId;
    protected Integer productId;
    @XmlElement(name = "ePINAgentId")
    protected Integer epinAgentId;
    protected String externalTransacionId;
    protected String comment;
    @XmlElement(nillable = true)
    protected List<AdditionalParameterDTO> additionalParameters;

    /**
     * Obtiene el valor de la propiedad channelId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * Define el valor de la propiedad channelId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChannelId(Integer value) {
        this.channelId = value;
    }

    /**
     * Obtiene el valor de la propiedad customerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Define el valor de la propiedad customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

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
     * Obtiene el valor de la propiedad epinAgentId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEPINAgentId() {
        return epinAgentId;
    }

    /**
     * Define el valor de la propiedad epinAgentId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEPINAgentId(Integer value) {
        this.epinAgentId = value;
    }

    /**
     * Obtiene el valor de la propiedad externalTransacionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTransacionId() {
        return externalTransacionId;
    }

    /**
     * Define el valor de la propiedad externalTransacionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTransacionId(String value) {
        this.externalTransacionId = value;
    }

    /**
     * Obtiene el valor de la propiedad comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Define el valor de la propiedad comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the additionalParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalParameterDTO }
     * 
     * 
     */
    public List<AdditionalParameterDTO> getAdditionalParameters() {
        if (additionalParameters == null) {
            additionalParameters = new ArrayList<AdditionalParameterDTO>();
        }
        return this.additionalParameters;
    }

}
