//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:08 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PlatformMappingConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PlatformMappingConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="AdapterConfig" type="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType"/>
 *         &lt;element name="configTimeOutPlatformMappingCache" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="configTimeOutCommonConfiguration" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="jndiCrudService" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="platformShortCodeSpecifications" type="{http://tigo.com.hn/PlatformMappingConfigType/V1}PlatformShortCodeSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlatformMappingConfigType", propOrder = {
    "adapterConfig",
    "configTimeOutPlatformMappingCache",
    "configTimeOutCommonConfiguration",
    "jndiCrudService",
    "platformShortCodeSpecifications"
})
public class PlatformMappingConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AdapterConfig", required = true)
    protected AdapterConfigType adapterConfig;
    protected long configTimeOutPlatformMappingCache;
    protected long configTimeOutCommonConfiguration;
    @XmlElement(required = true)
    protected String jndiCrudService;
    @XmlElement(nillable = true)
    protected List<PlatformShortCodeSpecification> platformShortCodeSpecifications;

    /**
     * Obtiene el valor de la propiedad adapterConfig.
     * 
     * @return
     *     possible object is
     *     {@link AdapterConfigType }
     *     
     */
    public AdapterConfigType getAdapterConfig() {
        return adapterConfig;
    }

    /**
     * Define el valor de la propiedad adapterConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link AdapterConfigType }
     *     
     */
    public void setAdapterConfig(AdapterConfigType value) {
        this.adapterConfig = value;
    }

    public boolean isSetAdapterConfig() {
        return (this.adapterConfig!= null);
    }

    /**
     * Obtiene el valor de la propiedad configTimeOutPlatformMappingCache.
     * 
     */
    public long getConfigTimeOutPlatformMappingCache() {
        return configTimeOutPlatformMappingCache;
    }

    /**
     * Define el valor de la propiedad configTimeOutPlatformMappingCache.
     * 
     */
    public void setConfigTimeOutPlatformMappingCache(long value) {
        this.configTimeOutPlatformMappingCache = value;
    }

    public boolean isSetConfigTimeOutPlatformMappingCache() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad configTimeOutCommonConfiguration.
     * 
     */
    public long getConfigTimeOutCommonConfiguration() {
        return configTimeOutCommonConfiguration;
    }

    /**
     * Define el valor de la propiedad configTimeOutCommonConfiguration.
     * 
     */
    public void setConfigTimeOutCommonConfiguration(long value) {
        this.configTimeOutCommonConfiguration = value;
    }

    public boolean isSetConfigTimeOutCommonConfiguration() {
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

    /**
     * Gets the value of the platformShortCodeSpecifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the platformShortCodeSpecifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlatformShortCodeSpecifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlatformShortCodeSpecification }
     * 
     * 
     */
    public List<PlatformShortCodeSpecification> getPlatformShortCodeSpecifications() {
        if (platformShortCodeSpecifications == null) {
            platformShortCodeSpecifications = new ArrayList<PlatformShortCodeSpecification>();
        }
        return this.platformShortCodeSpecifications;
    }

    public boolean isSetPlatformShortCodeSpecifications() {
        return ((this.platformShortCodeSpecifications!= null)&&(!this.platformShortCodeSpecifications.isEmpty()));
    }

    public void unsetPlatformShortCodeSpecifications() {
        this.platformShortCodeSpecifications = null;
    }

}
