//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.persistence.configuration.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Configuration complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initialContextFactory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuration", namespace = "http://www.tigo.com.hn/persistence/Configuration/V1", propOrder = {
    "providerUrl",
    "initialContextFactory"
})
public class Configuration {

    @XmlElement(required = true)
    protected String providerUrl;
    @XmlElement(required = true)
    protected String initialContextFactory;

    /**
     * Obtiene el valor de la propiedad providerUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderUrl() {
        return providerUrl;
    }

    /**
     * Define el valor de la propiedad providerUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderUrl(String value) {
        this.providerUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad initialContextFactory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialContextFactory() {
        return initialContextFactory;
    }

    /**
     * Define el valor de la propiedad initialContextFactory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialContextFactory(String value) {
        this.initialContextFactory = value;
    }

}
