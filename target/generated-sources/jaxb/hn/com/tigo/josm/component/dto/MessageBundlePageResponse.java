//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para messageBundlePageResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="messageBundlePageResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/order/JOSMResponse/V1}JOSMResponse">
 *       &lt;sequence>
 *         &lt;element name="messageBundles" type="{http://tigo.com.hn/component/messageBundlePageResponse/V1}messageBundleDetailResponseService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageBundlePageResponse", namespace = "http://tigo.com.hn/component/messageBundlePageResponse/V1", propOrder = {
    "messageBundles"
})
public class MessageBundlePageResponse
    extends JOSMResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected MessageBundleDetailResponseService messageBundles;

    /**
     * Obtiene el valor de la propiedad messageBundles.
     * 
     * @return
     *     possible object is
     *     {@link MessageBundleDetailResponseService }
     *     
     */
    public MessageBundleDetailResponseService getMessageBundles() {
        return messageBundles;
    }

    /**
     * Define el valor de la propiedad messageBundles.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageBundleDetailResponseService }
     *     
     */
    public void setMessageBundles(MessageBundleDetailResponseService value) {
        this.messageBundles = value;
    }

    public boolean isSetMessageBundles() {
        return (this.messageBundles!= null);
    }

}
