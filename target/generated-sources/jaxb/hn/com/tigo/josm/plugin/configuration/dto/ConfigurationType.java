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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConfigurationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="instanceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationType", namespace = "http://tigo.com.hn/pluginconfiguration/V1")
@XmlSeeAlso({
    CalendarPolicy.class,
    AllowedChannel.class,
    AllowedCos.class,
    DosPolicyConfig.class,
    IpAclConfig.class,
    IpAclPolicy.class,
    AllowedMaster.class,
    ProductIncompatibility.class,
    SubscriberACLPolicyConfig.class,
    SubscriberNumberPolicyConfig.class,
    AllowedStype.class,
    TransactionAmount.class,
    TransactionLimit.class
})
public class ConfigurationType implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "instanceId", required = true)
    protected String instanceId;

    /**
     * Obtiene el valor de la propiedad instanceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Define el valor de la propiedad instanceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    public boolean isSetInstanceId() {
        return (this.instanceId!= null);
    }

}
