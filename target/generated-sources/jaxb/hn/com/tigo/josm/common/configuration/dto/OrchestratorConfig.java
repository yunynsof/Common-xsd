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
 * <p>Clase Java para OrchestratorConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrchestratorConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="througput" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timeConfig" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeOutRetryPolicyCache" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="jndiCrudService" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrchestratorConfig", namespace = "http://tigo.com.hn/OrchestratorConfig/V1", propOrder = {
    "througput",
    "timeConfig",
    "timeOutRetryPolicyCache",
    "jndiCrudService"
})
public class OrchestratorConfig
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int througput;
    protected long timeConfig;
    protected long timeOutRetryPolicyCache;
    @XmlElement(required = true)
    protected String jndiCrudService;

    /**
     * Obtiene el valor de la propiedad througput.
     * 
     */
    public int getThrougput() {
        return througput;
    }

    /**
     * Define el valor de la propiedad througput.
     * 
     */
    public void setThrougput(int value) {
        this.througput = value;
    }

    public boolean isSetThrougput() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad timeConfig.
     * 
     */
    public long getTimeConfig() {
        return timeConfig;
    }

    /**
     * Define el valor de la propiedad timeConfig.
     * 
     */
    public void setTimeConfig(long value) {
        this.timeConfig = value;
    }

    public boolean isSetTimeConfig() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad timeOutRetryPolicyCache.
     * 
     */
    public long getTimeOutRetryPolicyCache() {
        return timeOutRetryPolicyCache;
    }

    /**
     * Define el valor de la propiedad timeOutRetryPolicyCache.
     * 
     */
    public void setTimeOutRetryPolicyCache(long value) {
        this.timeOutRetryPolicyCache = value;
    }

    public boolean isSetTimeOutRetryPolicyCache() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad jndiCrudService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiCrudService() {
        return jndiCrudService;
    }

    /**
     * Define el valor de la propiedad jndiCrudService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiCrudService(String value) {
        this.jndiCrudService = value;
    }

    public boolean isSetJndiCrudService() {
        return (this.jndiCrudService!= null);
    }

}
