//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.plugin.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubscriberACLPolicyConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubscriberACLPolicyConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tigo.com.hn/pluginconfiguration/V1}ConfigurationType">
 *       &lt;sequence>
 *         &lt;element name="subscribersArray" type="{http://tigo.com.hn/SubscriberACLPolicyConfig/V1}SubscriberArray"/>
 *         &lt;element name="listType" type="{http://tigo.com.hn/SubscriberACLPolicyConfig/V1}ListTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberACLPolicyConfig", namespace = "http://tigo.com.hn/SubscriberACLPolicyConfig/V1", propOrder = {
    "subscribersArray",
    "listType"
})
public class SubscriberACLPolicyConfig
    extends ConfigurationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected SubscriberArray subscribersArray;
    @XmlElement(required = true)
    protected ListTypeEnum listType;

    /**
     * Obtiene el valor de la propiedad subscribersArray.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberArray }
     *     
     */
    public SubscriberArray getSubscribersArray() {
        return subscribersArray;
    }

    /**
     * Define el valor de la propiedad subscribersArray.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberArray }
     *     
     */
    public void setSubscribersArray(SubscriberArray value) {
        this.subscribersArray = value;
    }

    public boolean isSetSubscribersArray() {
        return (this.subscribersArray!= null);
    }

    /**
     * Obtiene el valor de la propiedad listType.
     * 
     * @return
     *     possible object is
     *     {@link ListTypeEnum }
     *     
     */
    public ListTypeEnum getListType() {
        return listType;
    }

    /**
     * Define el valor de la propiedad listType.
     * 
     * @param value
     *     allowed object is
     *     {@link ListTypeEnum }
     *     
     */
    public void setListType(ListTypeEnum value) {
        this.listType = value;
    }

    public boolean isSetListType() {
        return (this.listType!= null);
    }

}
