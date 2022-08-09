//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
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
 * <p>Clase Java para SubscriberResponseService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubscriberResponseService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/profile/MasterStatusResponse/V1}MasterStatusResponse">
 *       &lt;sequence>
 *         &lt;element ref="{http://tigo.com.hn/profile/SubscriberResponse/V1}subscriberResponse" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberResponseService", namespace = "http://tigo.com.hn/profile/SubscriberResponse/V1", propOrder = {
    "subscriberResponse"
})
public class SubscriberResponseService
    extends MasterStatusResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<SubscriberResponse> subscriberResponse;

    /**
     * Gets the value of the subscriberResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberResponse }
     * 
     * 
     */
    public List<SubscriberResponse> getSubscriberResponse() {
        if (subscriberResponse == null) {
            subscriberResponse = new ArrayList<SubscriberResponse>();
        }
        return this.subscriberResponse;
    }

    public boolean isSetSubscriberResponse() {
        return ((this.subscriberResponse!= null)&&(!this.subscriberResponse.isEmpty()));
    }

    public void unsetSubscriberResponse() {
        this.subscriberResponse = null;
    }

}
