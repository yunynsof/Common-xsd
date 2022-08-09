//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:30 AM CST 
//


package hn.com.tigo.josm.gateway.services.fufillment.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPaymentMethodsResponseDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPaymentMethodsResponseDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.business.api.fulfillmentengine.millicom.com/}responseDTO">
 *       &lt;sequence>
 *         &lt;element name="product" type="{http://ws.business.api.fulfillmentengine.millicom.com/}productDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPaymentMethodsResponseDTO", propOrder = {
    "product"
})
public class GetPaymentMethodsResponseDTO
    extends ResponseDTO
{

    protected ProductDTO product;

    /**
     * Obtiene el valor de la propiedad product.
     * 
     * @return
     *     possible object is
     *     {@link ProductDTO }
     *     
     */
    public ProductDTO getProduct() {
        return product;
    }

    /**
     * Define el valor de la propiedad product.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDTO }
     *     
     */
    public void setProduct(ProductDTO value) {
        this.product = value;
    }

}
