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
 * <p>Clase Java para CallLockingAdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CallLockingAdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userM2000" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passM2000" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portM2000" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallLockingAdapterConfigType", namespace = "http://tigo.com.hn/CallLockingAdapterConfigType/V1", propOrder = {
    "port",
    "userM2000",
    "passM2000",
    "portM2000"
})
public class CallLockingAdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int port;
    @XmlElement(required = true)
    protected String userM2000;
    @XmlElement(required = true)
    protected String passM2000;
    protected int portM2000;

    /**
     * Obtiene el valor de la propiedad port.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Define el valor de la propiedad port.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    public boolean isSetPort() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad userM2000.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserM2000() {
        return userM2000;
    }

    /**
     * Define el valor de la propiedad userM2000.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserM2000(String value) {
        this.userM2000 = value;
    }

    public boolean isSetUserM2000() {
        return (this.userM2000 != null);
    }

    /**
     * Obtiene el valor de la propiedad passM2000.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassM2000() {
        return passM2000;
    }

    /**
     * Define el valor de la propiedad passM2000.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassM2000(String value) {
        this.passM2000 = value;
    }

    public boolean isSetPassM2000() {
        return (this.passM2000 != null);
    }

    /**
     * Obtiene el valor de la propiedad portM2000.
     * 
     */
    public int getPortM2000() {
        return portM2000;
    }

    /**
     * Define el valor de la propiedad portM2000.
     * 
     */
    public void setPortM2000(int value) {
        this.portM2000 = value;
    }

    public boolean isSetPortM2000() {
        return true;
    }

}
