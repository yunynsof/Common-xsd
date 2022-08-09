//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:07 PM CST 
//


package hn.com.tigo.josm.gateway.services.fufillment.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productPriceListDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productPriceListDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.business.api.fulfillmentengine.millicom.com/}responseDTO">
 *       &lt;sequence>
 *         &lt;element name="productPrices" type="{http://ws.business.api.fulfillmentengine.millicom.com/}productPriceDTO" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productPriceListDTO", propOrder = {
    "productPrices"
})
public class ProductPriceListDTO
    extends ResponseDTO
{

    @XmlElement(required = true)
    protected List<ProductPriceDTO> productPrices;

    /**
     * Gets the value of the productPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPriceDTO }
     * 
     * 
     */
    public List<ProductPriceDTO> getProductPrices() {
        if (productPrices == null) {
            productPrices = new ArrayList<ProductPriceDTO>();
        }
        return this.productPrices;
    }

}
