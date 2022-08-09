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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IpAclConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IpAclConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tigo.com.hn/pluginconfiguration/V1}ConfigurationType">
 *       &lt;sequence>
 *         &lt;element name="cacheExpiration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpAclConfig", namespace = "http://www.tigo.com.hn/policy/ipAclConfig/V1", propOrder = {
    "cacheExpiration"
})
public class IpAclConfig
    extends ConfigurationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int cacheExpiration;

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

}
