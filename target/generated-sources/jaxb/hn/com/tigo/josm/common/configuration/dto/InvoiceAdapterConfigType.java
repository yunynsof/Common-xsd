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
 * <p>Clase Java para InvoiceAdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceAdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="vouchersAS400Endpoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceAdapterConfigType", namespace = "http://tigo.com.hn/InvoiceAdapterConfigType/V1", propOrder = {
    "vouchersAS400Endpoint"
})
public class InvoiceAdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String vouchersAS400Endpoint;

    /**
     * Obtiene el valor de la propiedad vouchersAS400Endpoint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVouchersAS400Endpoint() {
        return vouchersAS400Endpoint;
    }

    /**
     * Define el valor de la propiedad vouchersAS400Endpoint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVouchersAS400Endpoint(String value) {
        this.vouchersAS400Endpoint = value;
    }

    public boolean isSetVouchersAS400Endpoint() {
        return (this.vouchersAS400Endpoint!= null);
    }

}
