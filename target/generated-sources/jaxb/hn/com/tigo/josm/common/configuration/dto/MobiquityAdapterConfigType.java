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
 * <p>Clase Java para MobiquityAdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MobiquityAdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="language1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endpointMerchantPayment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobiquityAdapterConfigType", namespace = "http://tigo.com.hn/MobiquityAdapterConfigType/V1", propOrder = {
    "language1",
    "endpointMerchantPayment"
})
public class MobiquityAdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String language1;
    @XmlElement(required = true)
    protected String endpointMerchantPayment;

    /**
     * Obtiene el valor de la propiedad language1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage1() {
        return language1;
    }

    /**
     * Define el valor de la propiedad language1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage1(String value) {
        this.language1 = value;
    }

    public boolean isSetLanguage1() {
        return (this.language1 != null);
    }

    /**
     * Obtiene el valor de la propiedad endpointMerchantPayment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpointMerchantPayment() {
        return endpointMerchantPayment;
    }

    /**
     * Define el valor de la propiedad endpointMerchantPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpointMerchantPayment(String value) {
        this.endpointMerchantPayment = value;
    }

    public boolean isSetEndpointMerchantPayment() {
        return (this.endpointMerchantPayment!= null);
    }

}
