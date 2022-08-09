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
 * <p>Clase Java para PromotionDetailCrudDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionDetailCrudDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPromotionDetail" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idPromotion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idEventGroup" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="eventGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idActionGroup" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="actionGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionDetailCrudDetail", namespace = "http://www.example.org/PromotionDetailCrudResponse", propOrder = {
    "idPromotionDetail",
    "idPromotion",
    "idEventGroup",
    "eventGroupName",
    "idActionGroup",
    "actionGroupName"
})
public class PromotionDetailCrudDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idPromotionDetail;
    protected long idPromotion;
    protected long idEventGroup;
    @XmlElement(required = true)
    protected String eventGroupName;
    protected long idActionGroup;
    @XmlElement(required = true)
    protected String actionGroupName;

    /**
     * Obtiene el valor de la propiedad idPromotionDetail.
     * 
     */
    public long getIdPromotionDetail() {
        return idPromotionDetail;
    }

    /**
     * Define el valor de la propiedad idPromotionDetail.
     * 
     */
    public void setIdPromotionDetail(long value) {
        this.idPromotionDetail = value;
    }

    public boolean isSetIdPromotionDetail() {
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
     * Obtiene el valor de la propiedad eventGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventGroupName() {
        return eventGroupName;
    }

    /**
     * Define el valor de la propiedad eventGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventGroupName(String value) {
        this.eventGroupName = value;
    }

    public boolean isSetEventGroupName() {
        return (this.eventGroupName!= null);
    }

    /**
     * Obtiene el valor de la propiedad idActionGroup.
     * 
     */
    public long getIdActionGroup() {
        return idActionGroup;
    }

    /**
     * Define el valor de la propiedad idActionGroup.
     * 
     */
    public void setIdActionGroup(long value) {
        this.idActionGroup = value;
    }

    public boolean isSetIdActionGroup() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad actionGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionGroupName() {
        return actionGroupName;
    }

    /**
     * Define el valor de la propiedad actionGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionGroupName(String value) {
        this.actionGroupName = value;
    }

    public boolean isSetActionGroupName() {
        return (this.actionGroupName!= null);
    }

}
