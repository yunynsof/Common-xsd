//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.common.profile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubscriptionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/profile/MasterStatusResponse/V1}MasterStatusResponse">
 *       &lt;sequence>
 *         &lt;element name="subscriptionDetail" type="{http://tigo.com.hn/profile/SubscriberResponse/V1}SubscriptionDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionResponse", namespace = "http://tigo.com.hn/profile/SubscriberResponse/V1", propOrder = {
    "subscriptionDetail"
})
public class SubscriptionResponse
    extends MasterStatusResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected SubscriptionDetail subscriptionDetail;

    /**
     * Obtiene el valor de la propiedad subscriptionDetail.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionDetail }
     *     
     */
    public SubscriptionDetail getSubscriptionDetail() {
        return subscriptionDetail;
    }

    /**
     * Define el valor de la propiedad subscriptionDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionDetail }
     *     
     */
    public void setSubscriptionDetail(SubscriptionDetail value) {
        this.subscriptionDetail = value;
    }

    public boolean isSetSubscriptionDetail() {
        return (this.subscriptionDetail!= null);
    }

}
