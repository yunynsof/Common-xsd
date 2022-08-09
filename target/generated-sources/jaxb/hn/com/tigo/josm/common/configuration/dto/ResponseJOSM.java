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
 *         &lt;element ref="{http://www.tigo.com.hn/ResponseJOSM}Configurations" minOccurs="0"/>
 *         &lt;element ref="{http://www.tigo.com.hn/ResponseJOSM}status" minOccurs="0"/>
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
    "configurations",
    "status"
})
@XmlRootElement(name = "ResponseJOSM", namespace = "http://www.tigo.com.hn/ResponseJOSM")
public class ResponseJOSM
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Configurations", namespace = "http://www.tigo.com.hn/ResponseJOSM")
    protected ConfigurationType configurations;
    @XmlElement(namespace = "http://www.tigo.com.hn/ResponseJOSM")
    protected StatusType status;

    /**
     * Obtiene el valor de la propiedad configurations.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationType }
     *     
     */
    public ConfigurationType getConfigurations() {
        return configurations;
    }

    /**
     * Define el valor de la propiedad configurations.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationType }
     *     
     */
    public void setConfigurations(ConfigurationType value) {
        this.configurations = value;
    }

    public boolean isSetConfigurations() {
        return (this.configurations!= null);
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

}
