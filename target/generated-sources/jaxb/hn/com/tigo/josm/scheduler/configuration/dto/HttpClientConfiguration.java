//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.scheduler.configuration.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HttpClientConfiguration complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HttpClientConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxTotal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="defaultMaxPerRoute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="socketTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="connectTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="connectionRequestTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpClientConfiguration", namespace = "http://tigo.com.hn/scheduler/configuration/V1", propOrder = {
    "maxTotal",
    "defaultMaxPerRoute",
    "socketTimeout",
    "connectTimeout",
    "connectionRequestTimeout"
})
public class HttpClientConfiguration {

    protected int maxTotal;
    protected int defaultMaxPerRoute;
    protected int socketTimeout;
    protected int connectTimeout;
    protected int connectionRequestTimeout;

    /**
     * Obtiene el valor de la propiedad maxTotal.
     * 
     */
    public int getMaxTotal() {
        return maxTotal;
    }

    /**
     * Define el valor de la propiedad maxTotal.
     * 
     */
    public void setMaxTotal(int value) {
        this.maxTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultMaxPerRoute.
     * 
     */
    public int getDefaultMaxPerRoute() {
        return defaultMaxPerRoute;
    }

    /**
     * Define el valor de la propiedad defaultMaxPerRoute.
     * 
     */
    public void setDefaultMaxPerRoute(int value) {
        this.defaultMaxPerRoute = value;
    }

    /**
     * Obtiene el valor de la propiedad socketTimeout.
     * 
     */
    public int getSocketTimeout() {
        return socketTimeout;
    }

    /**
     * Define el valor de la propiedad socketTimeout.
     * 
     */
    public void setSocketTimeout(int value) {
        this.socketTimeout = value;
    }

    /**
     * Obtiene el valor de la propiedad connectTimeout.
     * 
     */
    public int getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * Define el valor de la propiedad connectTimeout.
     * 
     */
    public void setConnectTimeout(int value) {
        this.connectTimeout = value;
    }

    /**
     * Obtiene el valor de la propiedad connectionRequestTimeout.
     * 
     */
    public int getConnectionRequestTimeout() {
        return connectionRequestTimeout;
    }

    /**
     * Define el valor de la propiedad connectionRequestTimeout.
     * 
     */
    public void setConnectionRequestTimeout(int value) {
        this.connectionRequestTimeout = value;
    }

}
