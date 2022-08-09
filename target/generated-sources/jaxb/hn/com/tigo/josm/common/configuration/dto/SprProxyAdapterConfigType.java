//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:07 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SprProxyAdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SprProxyAdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="driverRequestTimeOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="driverConnectTimeOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="connectionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="restUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SprProxyAdapterConfigType", namespace = "http://tigo.com.hn/SprProxyAdapterConfig/V1", propOrder = {
    "driverRequestTimeOut",
    "driverConnectTimeOut",
    "connectionType",
    "restUrl"
})
public class SprProxyAdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int driverRequestTimeOut;
    protected int driverConnectTimeOut;
    @XmlElement(required = true)
    protected String connectionType;
    @XmlElement(required = true)
    protected String restUrl;

    /**
     * Obtiene el valor de la propiedad driverRequestTimeOut.
     * 
     */
    public int getDriverRequestTimeOut() {
        return driverRequestTimeOut;
    }

    /**
     * Define el valor de la propiedad driverRequestTimeOut.
     * 
     */
    public void setDriverRequestTimeOut(int value) {
        this.driverRequestTimeOut = value;
    }

    public boolean isSetDriverRequestTimeOut() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad driverConnectTimeOut.
     * 
     */
    public int getDriverConnectTimeOut() {
        return driverConnectTimeOut;
    }

    /**
     * Define el valor de la propiedad driverConnectTimeOut.
     * 
     */
    public void setDriverConnectTimeOut(int value) {
        this.driverConnectTimeOut = value;
    }

    public boolean isSetDriverConnectTimeOut() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad connectionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * Define el valor de la propiedad connectionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionType(String value) {
        this.connectionType = value;
    }

    public boolean isSetConnectionType() {
        return (this.connectionType!= null);
    }

    /**
     * Obtiene el valor de la propiedad restUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestUrl() {
        return restUrl;
    }

    /**
     * Define el valor de la propiedad restUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestUrl(String value) {
        this.restUrl = value;
    }

    public boolean isSetRestUrl() {
        return (this.restUrl!= null);
    }

}
