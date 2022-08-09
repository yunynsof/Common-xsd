//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productMessageDetailResponseService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productMessageDetailResponseService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productMessageDetails" type="{http://tigo.com.hn/component/productMessagePageResponse/V1}productMessageDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productMessageDetailResponseService", namespace = "http://tigo.com.hn/component/productMessagePageResponse/V1", propOrder = {
    "productMessageDetails"
})
public class ProductMessageDetailResponseService
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<ProductMessageDetail> productMessageDetails;

    /**
     * Gets the value of the productMessageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productMessageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductMessageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMessageDetail }
     * 
     * 
     */
    public List<ProductMessageDetail> getProductMessageDetails() {
        if (productMessageDetails == null) {
            productMessageDetails = new ArrayList<ProductMessageDetail>();
        }
        return this.productMessageDetails;
    }

    public boolean isSetProductMessageDetails() {
        return ((this.productMessageDetails!= null)&&(!this.productMessageDetails.isEmpty()));
    }

    public void unsetProductMessageDetails() {
        this.productMessageDetails = null;
    }

}
