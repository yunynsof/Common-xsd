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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GatewayConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GatewayConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cacheParametersTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GatewayConfig", namespace = "http://tigo.com.hn/gatewayConfig/V1", propOrder = {
    "cacheParametersTime"
})
public class GatewayConfig
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int cacheParametersTime;

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

}
