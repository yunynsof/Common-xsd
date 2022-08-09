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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DriverType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DriverType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="request_timeOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conect_timeOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverType", namespace = "http://www.tigo.com.hn/configuration/AdapterConfigType/V1", propOrder = {
    "endPoint",
    "user",
    "password",
    "requestTimeOut",
    "conectTimeOut"
})
@XmlSeeAlso({
    AS400DriverType.class,
    AS400AdapterProgramType.class,
    KannelDriverType.class
})
public class DriverType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String endPoint;
    @XmlElement(required = true)
    protected String user;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(name = "request_timeOut")
    protected int requestTimeOut;
    @XmlElement(name = "conect_timeOut")
    protected int conectTimeOut;

    /**
     * Obtiene el valor de la propiedad endPoint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * Define el valor de la propiedad endPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPoint(String value) {
        this.endPoint = value;
    }

    public boolean isSetEndPoint() {
        return (this.endPoint!= null);
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    public boolean isSetUser() {
        return (this.user!= null);
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    public boolean isSetPassword() {
        return (this.password!= null);
    }

    /**
     * Obtiene el valor de la propiedad requestTimeOut.
     * 
     */
    public int getRequestTimeOut() {
        return requestTimeOut;
    }

    /**
     * Define el valor de la propiedad requestTimeOut.
     * 
     */
    public void setRequestTimeOut(int value) {
        this.requestTimeOut = value;
    }

    public boolean isSetRequestTimeOut() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad conectTimeOut.
     * 
     */
    public int getConectTimeOut() {
        return conectTimeOut;
    }

    /**
     * Define el valor de la propiedad conectTimeOut.
     * 
     */
    public void setConectTimeOut(int value) {
        this.conectTimeOut = value;
    }

    public boolean isSetConectTimeOut() {
        return true;
    }

}
