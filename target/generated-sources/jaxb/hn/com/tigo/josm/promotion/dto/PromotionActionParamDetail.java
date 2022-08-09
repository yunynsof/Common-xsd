//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.promotion.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionActionParamDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionActionParamDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idPromotion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idEventGroup" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idAction" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idActionGroupDetail" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valueParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionActionParamDetail", namespace = "http://www.example.org/PromotionActionParamResponse", propOrder = {
    "id",
    "idPromotion",
    "idEventGroup",
    "idAction",
    "idActionGroupDetail",
    "nameParam",
    "valueParam"
})
public class PromotionActionParamDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long id;
    protected long idPromotion;
    protected long idEventGroup;
    protected long idAction;
    protected long idActionGroupDetail;
    @XmlElement(required = true)
    protected String nameParam;
    @XmlElement(required = true)
    protected String valueParam;

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

    public boolean isSetId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad idPromotion.
     * 
     */
    public long getIdPromotion() {
        return idPromotion;
    }

    /**
     * Define el valor de la propiedad idPromotion.
     * 
     */
    public void setIdPromotion(long value) {
        this.idPromotion = value;
    }

    public boolean isSetIdPromotion() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad idEventGroup.
     * 
     */
    public long getIdEventGroup() {
        return idEventGroup;
    }

    /**
     * Define el valor de la propiedad idEventGroup.
     * 
     */
    public void setIdEventGroup(long value) {
        this.idEventGroup = value;
    }

    public boolean isSetIdEventGroup() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad idAction.
     * 
     */
    public long getIdAction() {
        return idAction;
    }

    /**
     * Define el valor de la propiedad idAction.
     * 
     */
    public void setIdAction(long value) {
        this.idAction = value;
    }

    public boolean isSetIdAction() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad idActionGroupDetail.
     * 
     */
    public long getIdActionGroupDetail() {
        return idActionGroupDetail;
    }

    /**
     * Define el valor de la propiedad idActionGroupDetail.
     * 
     */
    public void setIdActionGroupDetail(long value) {
        this.idActionGroupDetail = value;
    }

    public boolean isSetIdActionGroupDetail() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad nameParam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameParam() {
        return nameParam;
    }

    /**
     * Define el valor de la propiedad nameParam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameParam(String value) {
        this.nameParam = value;
    }

    public boolean isSetNameParam() {
        return (this.nameParam!= null);
    }

    /**
     * Obtiene el valor de la propiedad valueParam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueParam() {
        return valueParam;
    }

    /**
     * Define el valor de la propiedad valueParam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueParam(String value) {
        this.valueParam = value;
    }

    public boolean isSetValueParam() {
        return (this.valueParam!= null);
    }

}
