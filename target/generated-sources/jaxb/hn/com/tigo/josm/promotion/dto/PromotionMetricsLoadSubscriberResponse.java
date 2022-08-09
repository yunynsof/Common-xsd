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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionMetricsLoadSubscriberResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionMetricsLoadSubscriberResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/PromotionResponse}PromotionResponse">
 *       &lt;sequence>
 *         &lt;element name="promotionMetricsLoadSubscriberResponseServiceVar" type="{http://www.example.org/PromotionMetricsLoadSubscriberResponse}PromotionMetricsLoadSubscriberResponseService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionMetricsLoadSubscriberResponse", namespace = "http://www.example.org/PromotionMetricsLoadSubscriberResponse", propOrder = {
    "promotionMetricsLoadSubscriberResponseServiceVar"
})
public class PromotionMetricsLoadSubscriberResponse
    extends PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PromotionMetricsLoadSubscriberResponseService promotionMetricsLoadSubscriberResponseServiceVar;

    /**
     * Obtiene el valor de la propiedad promotionMetricsLoadSubscriberResponseServiceVar.
     * 
     * @return
     *     possible object is
     *     {@link PromotionMetricsLoadSubscriberResponseService }
     *     
     */
    public PromotionMetricsLoadSubscriberResponseService getPromotionMetricsLoadSubscriberResponseServiceVar() {
        return promotionMetricsLoadSubscriberResponseServiceVar;
    }

    /**
     * Define el valor de la propiedad promotionMetricsLoadSubscriberResponseServiceVar.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionMetricsLoadSubscriberResponseService }
     *     
     */
    public void setPromotionMetricsLoadSubscriberResponseServiceVar(PromotionMetricsLoadSubscriberResponseService value) {
        this.promotionMetricsLoadSubscriberResponseServiceVar = value;
    }

    public boolean isSetPromotionMetricsLoadSubscriberResponseServiceVar() {
        return (this.promotionMetricsLoadSubscriberResponseServiceVar!= null);
    }

}
