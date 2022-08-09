//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:08 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProxyAS400ConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProxyAS400ConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tigo.com.hn/ProxyConfigType/V1}ProxyConfigType">
 *       &lt;sequence>
 *         &lt;element name="jndiProxyConfigurationRemote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProxyAS400ConfigType", namespace = "http://tigo.com.hn/ProxyAS400Config/V1", propOrder = {
    "jndiProxyConfigurationRemote"
})
public class ProxyAS400ConfigType
    extends ProxyConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String jndiProxyConfigurationRemote;

    /**
     * Obtiene el valor de la propiedad jndiProxyConfigurationRemote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiProxyConfigurationRemote() {
        return jndiProxyConfigurationRemote;
    }

    /**
     * Define el valor de la propiedad jndiProxyConfigurationRemote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiProxyConfigurationRemote(String value) {
        this.jndiProxyConfigurationRemote = value;
    }

    public boolean isSetJndiProxyConfigurationRemote() {
        return (this.jndiProxyConfigurationRemote!= null);
    }

}
