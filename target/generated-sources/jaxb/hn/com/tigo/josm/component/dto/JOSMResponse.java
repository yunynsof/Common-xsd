//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para JOSMResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="JOSMResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JOSMResponse", namespace = "http://www.tigo.com.hn/order/JOSMResponse/V1", propOrder = {
    "responseCode",
    "responseMessage",
    "responseDescription",
    "responseId"
})
@XmlSeeAlso({
    BpmVersionDraftResponse.class,
    BpmVersionResponse.class,
    ChannelPageResponse.class,
    DataTransferCheckResponse.class,
    DataTransferResponse.class,
    JOSMResponseError.class,
    MessageBundlePageResponse.class,
    ParamPagedResponse.class,
    PolicyInstanceResponse.class,
    PolicyPageResponse.class,
    ProductBpmVersionPagedResponse.class,
    ProductFamilyPagedResponse.class,
    ProductMessagePageResponse.class,
    ProductPageResponse.class,
    ProductParamPagedResponse.class,
    ProductPolicyInstacePagedResponse.class
})
public class JOSMResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String responseCode;
    @XmlElement(required = true)
    protected String responseMessage;
    @XmlElement(required = true)
    protected String responseDescription;
    protected String responseId;

    /**
     * Obtiene el valor de la propiedad responseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Define el valor de la propiedad responseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    public boolean isSetResponseCode() {
        return (this.responseCode!= null);
    }

    /**
     * Obtiene el valor de la propiedad responseMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Define el valor de la propiedad responseMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

    public boolean isSetResponseMessage() {
        return (this.responseMessage!= null);
    }

    /**
     * Obtiene el valor de la propiedad responseDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDescription() {
        return responseDescription;
    }

    /**
     * Define el valor de la propiedad responseDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDescription(String value) {
        this.responseDescription = value;
    }

    public boolean isSetResponseDescription() {
        return (this.responseDescription!= null);
    }

    /**
     * Obtiene el valor de la propiedad responseId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseId() {
        return responseId;
    }

    /**
     * Define el valor de la propiedad responseId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseId(String value) {
        this.responseId = value;
    }

    public boolean isSetResponseId() {
        return (this.responseId!= null);
    }

}
