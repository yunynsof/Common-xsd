//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:10 PM CST 
//


package hn.com.tigo.josm.promotion.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubscriberPromotionDetailResponseService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubscriberPromotionDetailResponseService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberPromotionDetails" type="{http://www.example.org/SubscriberPromotionResponse}SubscriberPromotionDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberPromotionDetailResponseService", namespace = "http://www.example.org/SubscriberPromotionResponse", propOrder = {
    "subscriberPromotionDetails"
})
public class SubscriberPromotionDetailResponseService
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SubscriberPromotionDetails")
    protected List<SubscriberPromotionDetails> subscriberPromotionDetails;

    /**
     * Gets the value of the subscriberPromotionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberPromotionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberPromotionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberPromotionDetails }
     * 
     * 
     */
    public List<SubscriberPromotionDetails> getSubscriberPromotionDetails() {
        if (subscriberPromotionDetails == null) {
            subscriberPromotionDetails = new ArrayList<SubscriberPromotionDetails>();
        }
        return this.subscriberPromotionDetails;
    }

    public boolean isSetSubscriberPromotionDetails() {
        return ((this.subscriberPromotionDetails!= null)&&(!this.subscriberPromotionDetails.isEmpty()));
    }

    public void unsetSubscriberPromotionDetails() {
        this.subscriberPromotionDetails = null;
    }

}
