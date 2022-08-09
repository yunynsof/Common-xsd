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
 * <p>Clase Java para getAcquiredProductDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAcquiredProductDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.business.api.fulfillmentengine.millicom.com/}responseDTO">
 *       &lt;sequence>
 *         &lt;element name="listAcquiredProduct" type="{http://ws.business.api.fulfillmentengine.millicom.com/}acquiredProductDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAcquiredProductDTO", propOrder = {
    "listAcquiredProduct"
})
public class GetAcquiredProductDTO
    extends ResponseDTO
{

    @XmlElement(nillable = true)
    protected List<AcquiredProductDTO> listAcquiredProduct;

    /**
     * Gets the value of the listAcquiredProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listAcquiredProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListAcquiredProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcquiredProductDTO }
     * 
     * 
     */
    public List<AcquiredProductDTO> getListAcquiredProduct() {
        if (listAcquiredProduct == null) {
            listAcquiredProduct = new ArrayList<AcquiredProductDTO>();
        }
        return this.listAcquiredProduct;
    }

}
