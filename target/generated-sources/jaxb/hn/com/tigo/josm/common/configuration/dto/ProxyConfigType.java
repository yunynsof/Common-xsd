//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProxyConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProxyConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jndiGatewayRemote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jndiPlatformMappingAdapterRemote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProxyConfigType", namespace = "http://tigo.com.hn/ProxyConfigType/V1", propOrder = {
    "jndiGatewayRemote",
    "jndiPlatformMappingAdapterRemote"
})
@XmlSeeAlso({
    ProxyAS400ConfigType.class,
    ProxyKannelConfigType.class,
    ProxyMobiquityConfigType.class,
    ProxyUSSDConfigType.class
})
public class ProxyConfigType implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String jndiGatewayRemote;
    @XmlElement(required = true)
    protected String jndiPlatformMappingAdapterRemote;

    /**
     * Obtiene el valor de la propiedad jndiGatewayRemote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiGatewayRemote() {
        return jndiGatewayRemote;
    }

    /**
     * Define el valor de la propiedad jndiGatewayRemote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiGatewayRemote(String value) {
        this.jndiGatewayRemote = value;
    }

    public boolean isSetJndiGatewayRemote() {
        return (this.jndiGatewayRemote!= null);
    }

    /**
     * Obtiene el valor de la propiedad jndiPlatformMappingAdapterRemote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiPlatformMappingAdapterRemote() {
        return jndiPlatformMappingAdapterRemote;
    }

    /**
     * Define el valor de la propiedad jndiPlatformMappingAdapterRemote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiPlatformMappingAdapterRemote(String value) {
        this.jndiPlatformMappingAdapterRemote = value;
    }

    public boolean isSetJndiPlatformMappingAdapterRemote() {
        return (this.jndiPlatformMappingAdapterRemote!= null);
    }

}
