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
 * <p>Clase Java para BrokerConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BrokerConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brokerElement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cacheBpmTimeCompile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cacheParametersTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cacheTaskFactory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrokerConfig", namespace = "http://tigo.com.hn/BrokerConfig/V1", propOrder = {
    "brokerElement",
    "cacheBpmTimeCompile",
    "cacheParametersTime",
    "cacheTaskFactory"
})
public class BrokerConfig
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String brokerElement;
    protected int cacheBpmTimeCompile;
    protected int cacheParametersTime;
    protected int cacheTaskFactory;

    /**
     * Obtiene el valor de la propiedad brokerElement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerElement() {
        return brokerElement;
    }

    /**
     * Define el valor de la propiedad brokerElement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerElement(String value) {
        this.brokerElement = value;
    }

    public boolean isSetBrokerElement() {
        return (this.brokerElement!= null);
    }

    /**
     * Obtiene el valor de la propiedad cacheBpmTimeCompile.
     * 
     */
    public int getCacheBpmTimeCompile() {
        return cacheBpmTimeCompile;
    }

    /**
     * Define el valor de la propiedad cacheBpmTimeCompile.
     * 
     */
    public void setCacheBpmTimeCompile(int value) {
        this.cacheBpmTimeCompile = value;
    }

    public boolean isSetCacheBpmTimeCompile() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad cacheParametersTime.
     * 
     */
    public int getCacheParametersTime() {
        return cacheParametersTime;
    }

    /**
     * Define el valor de la propiedad cacheParametersTime.
     * 
     */
    public void setCacheParametersTime(int value) {
        this.cacheParametersTime = value;
    }

    public boolean isSetCacheParametersTime() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad cacheTaskFactory.
     * 
     */
    public int getCacheTaskFactory() {
        return cacheTaskFactory;
    }

    /**
     * Define el valor de la propiedad cacheTaskFactory.
     * 
     */
    public void setCacheTaskFactory(int value) {
        this.cacheTaskFactory = value;
    }

    public boolean isSetCacheTaskFactory() {
        return true;
    }

}
