//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:10 PM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para messageBundleDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="messageBundleDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMessage" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="messageText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageBundleDetail", namespace = "http://tigo.com.hn/component/messageBundlePageResponse/V1", propOrder = {
    "idMessage",
    "messageText",
    "messageFrom"
})
public class MessageBundleDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idMessage;
    @XmlElement(required = true)
    protected String messageText;
    @XmlElement(required = true)
    protected String messageFrom;

    /**
     * Obtiene el valor de la propiedad idMessage.
     * 
     */
    public long getIdMessage() {
        return idMessage;
    }

    /**
     * Define el valor de la propiedad idMessage.
     * 
     */
    public void setIdMessage(long value) {
        this.idMessage = value;
    }

    public boolean isSetIdMessage() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad messageText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * Define el valor de la propiedad messageText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

    public boolean isSetMessageText() {
        return (this.messageText!= null);
    }

    /**
     * Obtiene el valor de la propiedad messageFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageFrom() {
        return messageFrom;
    }

    /**
     * Define el valor de la propiedad messageFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageFrom(String value) {
        this.messageFrom = value;
    }

    public boolean isSetMessageFrom() {
        return (this.messageFrom!= null);
    }

}
