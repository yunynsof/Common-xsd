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
 * <p>Clase Java para AssociatePromResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AssociatePromResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/PromotionResponse}PromotionResponse">
 *       &lt;sequence>
 *         &lt;element name="associatePromoList" type="{http://www.example.org/PromotionMetricsProductResponse}AssociatePromDetailResponseService"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatePromResponse", namespace = "http://www.example.org/PromotionMetricsProductResponse", propOrder = {
    "associatePromoList"
})
public class AssociatePromResponse
    extends PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AssociatePromDetailResponseService associatePromoList;

    /**
     * Obtiene el valor de la propiedad associatePromoList.
     * 
     * @return
     *     possible object is
     *     {@link AssociatePromDetailResponseService }
     *     
     */
    public AssociatePromDetailResponseService getAssociatePromoList() {
        return associatePromoList;
    }

    /**
     * Define el valor de la propiedad associatePromoList.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatePromDetailResponseService }
     *     
     */
    public void setAssociatePromoList(AssociatePromDetailResponseService value) {
        this.associatePromoList = value;
    }

    public boolean isSetAssociatePromoList() {
        return (this.associatePromoList!= null);
    }

}
