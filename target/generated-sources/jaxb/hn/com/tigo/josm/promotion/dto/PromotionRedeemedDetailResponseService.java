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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionRedeemedDetailResponseService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionRedeemedDetailResponseService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promotionMetricsRedeemed" type="{http://www.example.org/PromotionMetricsRedeemedResponse}PromotionMetricsRedeemedDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionRedeemedDetailResponseService", namespace = "http://www.example.org/PromotionMetricsRedeemedResponse", propOrder = {
    "promotionMetricsRedeemed"
})
public class PromotionRedeemedDetailResponseService
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<PromotionMetricsRedeemedDetail> promotionMetricsRedeemed;

    /**
     * Gets the value of the promotionMetricsRedeemed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionMetricsRedeemed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionMetricsRedeemed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionMetricsRedeemedDetail }
     * 
     * 
     */
    public List<PromotionMetricsRedeemedDetail> getPromotionMetricsRedeemed() {
        if (promotionMetricsRedeemed == null) {
            promotionMetricsRedeemed = new ArrayList<PromotionMetricsRedeemedDetail>();
        }
        return this.promotionMetricsRedeemed;
    }

    public boolean isSetPromotionMetricsRedeemed() {
        return ((this.promotionMetricsRedeemed!= null)&&(!this.promotionMetricsRedeemed.isEmpty()));
    }

    public void unsetPromotionMetricsRedeemed() {
        this.promotionMetricsRedeemed = null;
    }

}
