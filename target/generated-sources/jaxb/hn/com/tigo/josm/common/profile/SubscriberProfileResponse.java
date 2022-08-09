//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.common.profile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubscriberProfileResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubscriberProfileResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/profile/MasterStatusResponse/V1}MasterStatusResponse">
 *       &lt;sequence>
 *         &lt;element ref="{http://tigo.com.hn/profile/SubscriberProfileResponse/V1}subscriberProfileDetail" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberProfileResponse", propOrder = {
    "subscriberProfileDetail"
})
public class SubscriberProfileResponse
    extends MasterStatusResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<SubscriberProfileDetail> subscriberProfileDetail;

    /**
     * Gets the value of the subscriberProfileDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberProfileDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberProfileDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberProfileDetail }
     * 
     * 
     */
    public List<SubscriberProfileDetail> getSubscriberProfileDetail() {
        if (subscriberProfileDetail == null) {
            subscriberProfileDetail = new ArrayList<SubscriberProfileDetail>();
        }
        return this.subscriberProfileDetail;
    }

    public boolean isSetSubscriberProfileDetail() {
        return ((this.subscriberProfileDetail!= null)&&(!this.subscriberProfileDetail.isEmpty()));
    }

    public void unsetSubscriberProfileDetail() {
        this.subscriberProfileDetail = null;
    }

}
