//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
//


package hn.com.tigo.josm.plugin.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delayCache" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="policyXsdArray" type="{http://tigo.com.hn/pluginConfigurationProperties/V1}PolicyXsdArray"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "delayCache",
    "policyXsdArray"
})
@XmlRootElement(name = "PluginConfigurationType", namespace = "http://tigo.com.hn/pluginConfigurationProperties/V1")
public class PluginConfigurationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://tigo.com.hn/pluginConfigurationProperties/V1", required = true)
    protected String delayCache;
    @XmlElement(namespace = "http://tigo.com.hn/pluginConfigurationProperties/V1", required = true)
    protected PolicyXsdArray policyXsdArray;

    /**
     * Obtiene el valor de la propiedad delayCache.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayCache() {
        return delayCache;
    }

    /**
     * Define el valor de la propiedad delayCache.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayCache(String value) {
        this.delayCache = value;
    }

    public boolean isSetDelayCache() {
        return (this.delayCache!= null);
    }

    /**
     * Obtiene el valor de la propiedad policyXsdArray.
     * 
     * @return
     *     possible object is
     *     {@link PolicyXsdArray }
     *     
     */
    public PolicyXsdArray getPolicyXsdArray() {
        return policyXsdArray;
    }

    /**
     * Define el valor de la propiedad policyXsdArray.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyXsdArray }
     *     
     */
    public void setPolicyXsdArray(PolicyXsdArray value) {
        this.policyXsdArray = value;
    }

    public boolean isSetPolicyXsdArray() {
        return (this.policyXsdArray!= null);
    }

}
