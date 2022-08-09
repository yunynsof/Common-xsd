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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QuantityPurchasesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QuantityPurchasesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/PromotionResponse}PromotionResponse">
 *       &lt;sequence>
 *         &lt;element name="quantityPurchaseList" type="{http://www.example.org/PromotionMetricsQuantityPurchasesResponse}QuantityPurchasesResponseService"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityPurchasesResponse", namespace = "http://www.example.org/PromotionMetricsQuantityPurchasesResponse", propOrder = {
    "quantityPurchaseList"
})
public class QuantityPurchasesResponse
    extends PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected QuantityPurchasesResponseService quantityPurchaseList;

    /**
     * Obtiene el valor de la propiedad quantityPurchaseList.
     * 
     * @return
     *     possible object is
     *     {@link QuantityPurchasesResponseService }
     *     
     */
    public QuantityPurchasesResponseService getQuantityPurchaseList() {
        return quantityPurchaseList;
    }

    /**
     * Define el valor de la propiedad quantityPurchaseList.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityPurchasesResponseService }
     *     
     */
    public void setQuantityPurchaseList(QuantityPurchasesResponseService value) {
        this.quantityPurchaseList = value;
    }

    public boolean isSetQuantityPurchaseList() {
        return (this.quantityPurchaseList!= null);
    }

}
