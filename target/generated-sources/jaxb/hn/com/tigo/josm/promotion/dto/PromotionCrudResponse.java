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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionCrudResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionCrudResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/PromotionResponse}PromotionResponse">
 *       &lt;sequence>
 *         &lt;element name="promotionCrudList" type="{http://www.example.org/PromotionCrudResponse}PromotionCrudDetailResponseService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionCrudResponse", namespace = "http://www.example.org/PromotionCrudResponse", propOrder = {
    "promotionCrudList"
})
public class PromotionCrudResponse
    extends PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PromotionCrudDetailResponseService promotionCrudList;

    /**
     * Obtiene el valor de la propiedad promotionCrudList.
     * 
     * @return
     *     possible object is
     *     {@link PromotionCrudDetailResponseService }
     *     
     */
    public PromotionCrudDetailResponseService getPromotionCrudList() {
        return promotionCrudList;
    }

    /**
     * Define el valor de la propiedad promotionCrudList.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCrudDetailResponseService }
     *     
     */
    public void setPromotionCrudList(PromotionCrudDetailResponseService value) {
        this.promotionCrudList = value;
    }

    public boolean isSetPromotionCrudList() {
        return (this.promotionCrudList!= null);
    }

}
