//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:07 PM CST 
//


package hn.com.tigo.josm.common.order;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PluginResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PluginResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PluginResponse", namespace = "http://tigo.com.hn/PluginResponse", propOrder = {
    "code",
    "result",
    "message",
    "messageDetail"
})
public class PluginResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://tigo.com.hn/PluginResponse")
    protected int code;
    @XmlElement(namespace = "http://tigo.com.hn/PluginResponse")
    protected boolean result;
    @XmlElement(namespace = "http://tigo.com.hn/PluginResponse", required = true)
    protected String message;
    @XmlElement(namespace = "http://tigo.com.hn/PluginResponse", required = true)
    protected String messageDetail;

    /**
     * Obtiene el valor de la propiedad code.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    public boolean isSetCode() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad result.
     * 
     */
    public boolean isResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     * 
     */
    public void setResult(boolean value) {
        this.result = value;
    }

    public boolean isSetResult() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    public boolean isSetMessage() {
        return (this.message!= null);
    }

    /**
     * Obtiene el valor de la propiedad messageDetail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDetail() {
        return messageDetail;
    }

    /**
     * Define el valor de la propiedad messageDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDetail(String value) {
        this.messageDetail = value;
    }

    public boolean isSetMessageDetail() {
        return (this.messageDetail!= null);
    }

}
