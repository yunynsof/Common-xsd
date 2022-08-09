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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promotionLNType" type="{http://www.tigo.com.hn/PromotionResponse}PromotionLNType"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="responseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseDescriptionDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionResponse", namespace = "http://www.tigo.com.hn/PromotionResponse", propOrder = {
    "promotionLNType",
    "responseCode",
    "responseDescription",
    "responseDescriptionDetail",
    "responseId"
})
@XmlSeeAlso({
    ActionGroupResponse.class,
    PromotionLType.class,
    ActionParamResponse.class,
    ParamTypeResponse.class,
    ActionResponse.class,
    CategoryResponseType.class,
    CategoryTypeResponseType.class,
    CounterEventResponse.class,
    EventGroupDetailResponse.class,
    EventGroupResponse.class,
    EventResponse.class,
    HistoryEfectiveResponse.class,
    PromotionActionParamResponse.class,
    PromotionCrudResponse.class,
    PromotionDetailCrudResponse.class,
    PromotionLogResponse.class,
    PromotionMetricsDataResponse.class,
    PromotionMetricsLoadSubscriberResponse.class,
    AssociatePromResponse.class,
    QuantityPurchasesResponse.class,
    PromotionMetricsRedeemedResponse.class,
    PromotionProgressBarResponse.class,
    PromotionSType.class,
    PromotionType.class,
    SubscriberPromotionResponse.class,
    TotalCounterEventResponse.class
})
public class PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected PromotionLNType promotionLNType;
    protected int responseCode;
    @XmlElement(required = true)
    protected String responseDescription;
    protected String responseDescriptionDetail;
    protected String responseId;

    /**
     * Obtiene el valor de la propiedad promotionLNType.
     * 
     * @return
     *     possible object is
     *     {@link PromotionLNType }
     *     
     */
    public PromotionLNType getPromotionLNType() {
        return promotionLNType;
    }

    /**
     * Define el valor de la propiedad promotionLNType.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionLNType }
     *     
     */
    public void setPromotionLNType(PromotionLNType value) {
        this.promotionLNType = value;
    }

    public boolean isSetPromotionLNType() {
        return (this.promotionLNType!= null);
    }

    /**
     * Obtiene el valor de la propiedad responseCode.
     * 
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * Define el valor de la propiedad responseCode.
     * 
     */
    public void setResponseCode(int value) {
        this.responseCode = value;
    }

    public boolean isSetResponseCode() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad responseDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDescription() {
        return responseDescription;
    }

    /**
     * Define el valor de la propiedad responseDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDescription(String value) {
        this.responseDescription = value;
    }

    public boolean isSetResponseDescription() {
        return (this.responseDescription!= null);
    }

    /**
     * Obtiene el valor de la propiedad responseDescriptionDetail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDescriptionDetail() {
        return responseDescriptionDetail;
    }

    /**
     * Define el valor de la propiedad responseDescriptionDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDescriptionDetail(String value) {
        this.responseDescriptionDetail = value;
    }

    public boolean isSetResponseDescriptionDetail() {
        return (this.responseDescriptionDetail!= null);
    }

    /**
     * Obtiene el valor de la propiedad responseId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseId() {
        return responseId;
    }

    /**
     * Define el valor de la propiedad responseId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseId(String value) {
        this.responseId = value;
    }

    public boolean isSetResponseId() {
        return (this.responseId!= null);
    }

}
