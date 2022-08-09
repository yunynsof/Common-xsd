//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:10 PM CST 
//


package hn.com.tigo.josm.promotion.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionMetricsDetailResponseService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionMetricsDetailResponseService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPromotion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="namePromotion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transaction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promotionMetricsData" type="{http://www.example.org/PromotionMetricsDataResponse}PromotionMetricsDataDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionMetricsDetailResponseService", propOrder = {
    "idPromotion",
    "namePromotion",
    "transaction",
    "promotionMetricsData"
})
public class PromotionMetricsDetailResponseService
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idPromotion;
    @XmlElement(required = true)
    protected String namePromotion;
    @XmlElement(required = true)
    protected String transaction;
    protected List<PromotionMetricsDataDetail> promotionMetricsData;

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
     * Obtiene el valor de la propiedad namePromotion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePromotion() {
        return namePromotion;
    }

    /**
     * Define el valor de la propiedad namePromotion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePromotion(String value) {
        this.namePromotion = value;
    }

    public boolean isSetNamePromotion() {
        return (this.namePromotion!= null);
    }

    /**
     * Obtiene el valor de la propiedad transaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaction() {
        return transaction;
    }

    /**
     * Define el valor de la propiedad transaction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaction(String value) {
        this.transaction = value;
    }

    public boolean isSetTransaction() {
        return (this.transaction!= null);
    }

    /**
     * Gets the value of the promotionMetricsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionMetricsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionMetricsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionMetricsDataDetail }
     * 
     * 
     */
    public List<PromotionMetricsDataDetail> getPromotionMetricsData() {
        if (promotionMetricsData == null) {
            promotionMetricsData = new ArrayList<PromotionMetricsDataDetail>();
        }
        return this.promotionMetricsData;
    }

    public boolean isSetPromotionMetricsData() {
        return ((this.promotionMetricsData!= null)&&(!this.promotionMetricsData.isEmpty()));
    }

    public void unsetPromotionMetricsData() {
        this.promotionMetricsData = null;
    }

}
