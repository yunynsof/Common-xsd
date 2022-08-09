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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para promotionEngineConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="promotionEngineConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cacheExpiration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="executionTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loadBlockSubscriberDelay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="blockSubscriberSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="initialNotificationDelay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultEventType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotionEngineConfig", namespace = "http://tigo.com.hn/PromotionEngine/PromotionEngineConfig/V1", propOrder = {
    "cacheExpiration",
    "executionTimeout",
    "loadBlockSubscriberDelay",
    "blockSubscriberSize",
    "initialNotificationDelay",
    "url",
    "defaultEventType"
})
public class PromotionEngineConfig
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int cacheExpiration;
    protected int executionTimeout;
    protected int loadBlockSubscriberDelay;
    protected int blockSubscriberSize;
    protected int initialNotificationDelay;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected String defaultEventType;

    /**
     * Obtiene el valor de la propiedad cacheExpiration.
     * 
     */
    public int getCacheExpiration() {
        return cacheExpiration;
    }

    /**
     * Define el valor de la propiedad cacheExpiration.
     * 
     */
    public void setCacheExpiration(int value) {
        this.cacheExpiration = value;
    }

    public boolean isSetCacheExpiration() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad executionTimeout.
     * 
     */
    public int getExecutionTimeout() {
        return executionTimeout;
    }

    /**
     * Define el valor de la propiedad executionTimeout.
     * 
     */
    public void setExecutionTimeout(int value) {
        this.executionTimeout = value;
    }

    public boolean isSetExecutionTimeout() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad loadBlockSubscriberDelay.
     * 
     */
    public int getLoadBlockSubscriberDelay() {
        return loadBlockSubscriberDelay;
    }

    /**
     * Define el valor de la propiedad loadBlockSubscriberDelay.
     * 
     */
    public void setLoadBlockSubscriberDelay(int value) {
        this.loadBlockSubscriberDelay = value;
    }

    public boolean isSetLoadBlockSubscriberDelay() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad blockSubscriberSize.
     * 
     */
    public int getBlockSubscriberSize() {
        return blockSubscriberSize;
    }

    /**
     * Define el valor de la propiedad blockSubscriberSize.
     * 
     */
    public void setBlockSubscriberSize(int value) {
        this.blockSubscriberSize = value;
    }

    public boolean isSetBlockSubscriberSize() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad initialNotificationDelay.
     * 
     */
    public int getInitialNotificationDelay() {
        return initialNotificationDelay;
    }

    /**
     * Define el valor de la propiedad initialNotificationDelay.
     * 
     */
    public void setInitialNotificationDelay(int value) {
        this.initialNotificationDelay = value;
    }

    public boolean isSetInitialNotificationDelay() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public boolean isSetUrl() {
        return (this.url!= null);
    }

    /**
     * Obtiene el valor de la propiedad defaultEventType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultEventType() {
        return defaultEventType;
    }

    /**
     * Define el valor de la propiedad defaultEventType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultEventType(String value) {
        this.defaultEventType = value;
    }

    public boolean isSetDefaultEventType() {
        return (this.defaultEventType!= null);
    }

}
