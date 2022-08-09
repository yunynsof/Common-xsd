//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.promotion.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionLogDetailResponseService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionLogDetailResponseService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promotionLogDetail" type="{http://www.example.org/PromotionLogResponse}PromotionLogDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionLogDetailResponseService", namespace = "http://www.example.org/PromotionLogResponse", propOrder = {
    "promotionLogDetail"
})
public class PromotionLogDetailResponseService
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<PromotionLogDetail> promotionLogDetail;

    /**
     * Gets the value of the promotionLogDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionLogDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionLogDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionLogDetail }
     * 
     * 
     */
    public List<PromotionLogDetail> getPromotionLogDetail() {
        if (promotionLogDetail == null) {
            promotionLogDetail = new ArrayList<PromotionLogDetail>();
        }
        return this.promotionLogDetail;
    }

    public boolean isSetPromotionLogDetail() {
        return ((this.promotionLogDetail!= null)&&(!this.promotionLogDetail.isEmpty()));
    }

    public void unsetPromotionLogDetail() {
        this.promotionLogDetail = null;
    }

}
