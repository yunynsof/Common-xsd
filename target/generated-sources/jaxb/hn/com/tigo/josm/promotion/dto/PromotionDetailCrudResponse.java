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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionDetailCrudResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionDetailCrudResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/PromotionResponse}PromotionResponse">
 *       &lt;sequence>
 *         &lt;element name="promotionDetailCrudList" type="{http://www.example.org/PromotionDetailCrudResponse}PromotionDetailCrudDetailResponseService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionDetailCrudResponse", namespace = "http://www.example.org/PromotionDetailCrudResponse", propOrder = {
    "promotionDetailCrudList"
})
public class PromotionDetailCrudResponse
    extends PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PromotionDetailCrudDetailResponseService promotionDetailCrudList;

    /**
     * Obtiene el valor de la propiedad promotionDetailCrudList.
     * 
     * @return
     *     possible object is
     *     {@link PromotionDetailCrudDetailResponseService }
     *     
     */
    public PromotionDetailCrudDetailResponseService getPromotionDetailCrudList() {
        return promotionDetailCrudList;
    }

    /**
     * Define el valor de la propiedad promotionDetailCrudList.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionDetailCrudDetailResponseService }
     *     
     */
    public void setPromotionDetailCrudList(PromotionDetailCrudDetailResponseService value) {
        this.promotionDetailCrudList = value;
    }

    public boolean isSetPromotionDetailCrudList() {
        return (this.promotionDetailCrudList!= null);
    }

}
