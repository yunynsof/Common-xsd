//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.promotion.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionDetailCrudDetailResponseService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionDetailCrudDetailResponseService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apromotionCrudDetail" type="{http://www.example.org/PromotionDetailCrudResponse}PromotionDetailCrudDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionDetailCrudDetailResponseService", namespace = "http://www.example.org/PromotionDetailCrudResponse", propOrder = {
    "apromotionCrudDetail"
})
public class PromotionDetailCrudDetailResponseService
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<PromotionDetailCrudDetail> apromotionCrudDetail;

    /**
     * Gets the value of the apromotionCrudDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apromotionCrudDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApromotionCrudDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionDetailCrudDetail }
     * 
     * 
     */
    public List<PromotionDetailCrudDetail> getApromotionCrudDetail() {
        if (apromotionCrudDetail == null) {
            apromotionCrudDetail = new ArrayList<PromotionDetailCrudDetail>();
        }
        return this.apromotionCrudDetail;
    }

    public boolean isSetApromotionCrudDetail() {
        return ((this.apromotionCrudDetail!= null)&&(!this.apromotionCrudDetail.isEmpty()));
    }

    public void unsetApromotionCrudDetail() {
        this.apromotionCrudDetail = null;
    }

}
