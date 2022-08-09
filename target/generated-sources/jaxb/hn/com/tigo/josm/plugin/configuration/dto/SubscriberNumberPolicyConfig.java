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
 * <p>Clase Java para SubscriberNumberPolicyConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubscriberNumberPolicyConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tigo.com.hn/pluginconfiguration/V1}ConfigurationType">
 *       &lt;sequence>
 *         &lt;element name="JndiSubsriberNumberValidation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberNumberPolicyConfig", namespace = "http://tigo.com.hn/SubscriberNumberPolicyConfig/V1", propOrder = {
    "jndiSubsriberNumberValidation"
})
public class SubscriberNumberPolicyConfig
    extends ConfigurationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "JndiSubsriberNumberValidation", required = true)
    protected String jndiSubsriberNumberValidation;

    /**
     * Obtiene el valor de la propiedad jndiSubsriberNumberValidation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiSubsriberNumberValidation() {
        return jndiSubsriberNumberValidation;
    }

    /**
     * Define el valor de la propiedad jndiSubsriberNumberValidation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiSubsriberNumberValidation(String value) {
        this.jndiSubsriberNumberValidation = value;
    }

    public boolean isSetJndiSubsriberNumberValidation() {
        return (this.jndiSubsriberNumberValidation!= null);
    }

}
