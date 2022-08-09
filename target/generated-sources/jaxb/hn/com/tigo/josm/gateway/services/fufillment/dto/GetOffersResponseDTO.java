//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:30 AM CST 
//


package hn.com.tigo.josm.gateway.services.fufillment.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getOffersResponseDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getOffersResponseDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.business.api.fulfillmentengine.millicom.com/}responseDTO">
 *       &lt;sequence>
 *         &lt;element name="products" type="{http://ws.business.api.fulfillmentengine.millicom.com/}productDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOffersResponseDTO", propOrder = {
    "products"
})
public class GetOffersResponseDTO
    extends ResponseDTO
{

    @XmlElement(nillable = true)
    protected List<ProductDTO> products;

    /**
     * Gets the value of the products property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the products property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDTO }
     * 
     * 
     */
    public List<ProductDTO> getProducts() {
        if (products == null) {
            products = new ArrayList<ProductDTO>();
        }
        return this.products;
    }

}
