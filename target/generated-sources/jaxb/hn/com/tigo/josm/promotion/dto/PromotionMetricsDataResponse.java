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
 * <p>Clase Java para PromotionMetricsDataResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionMetricsDataResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/PromotionResponse}PromotionResponse">
 *       &lt;sequence>
 *         &lt;element name="promotionMetricsDetailServiceVar" type="{http://www.example.org/PromotionMetricsDataResponse}PromotionMetricsDetailService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionMetricsDataResponse", propOrder = {
    "promotionMetricsDetailServiceVar"
})
public class PromotionMetricsDataResponse
    extends PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PromotionMetricsDetailService promotionMetricsDetailServiceVar;

    /**
     * Obtiene el valor de la propiedad promotionMetricsDetailServiceVar.
     * 
     * @return
     *     possible object is
     *     {@link PromotionMetricsDetailService }
     *     
     */
    public PromotionMetricsDetailService getPromotionMetricsDetailServiceVar() {
        return promotionMetricsDetailServiceVar;
    }

    /**
     * Define el valor de la propiedad promotionMetricsDetailServiceVar.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionMetricsDetailService }
     *     
     */
    public void setPromotionMetricsDetailServiceVar(PromotionMetricsDetailService value) {
        this.promotionMetricsDetailServiceVar = value;
    }

    public boolean isSetPromotionMetricsDetailServiceVar() {
        return (this.promotionMetricsDetailServiceVar!= null);
    }

}
