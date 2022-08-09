//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.common.proxy.as400.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Services complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Services">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gsmsub" type="{http://tigo.com.hn/ProxyRequest/V1}Keys"/>
 *         &lt;element name="serviceActions" type="{http://tigo.com.hn/ProxyServices/V1}proxyServiceArray"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Services", namespace = "http://tigo.com.hn/ProxyRequest/V1", propOrder = {
    "gsmsub",
    "serviceActions"
})
public class Services
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Keys gsmsub;
    @XmlElement(required = true)
    protected ProxyServiceArray serviceActions;

    /**
     * Obtiene el valor de la propiedad gsmsub.
     * 
     * @return
     *     possible object is
     *     {@link Keys }
     *     
     */
    public Keys getGsmsub() {
        return gsmsub;
    }

    /**
     * Define el valor de la propiedad gsmsub.
     * 
     * @param value
     *     allowed object is
     *     {@link Keys }
     *     
     */
    public void setGsmsub(Keys value) {
        this.gsmsub = value;
    }

    public boolean isSetGsmsub() {
        return (this.gsmsub!= null);
    }

    /**
     * Obtiene el valor de la propiedad serviceActions.
     * 
     * @return
     *     possible object is
     *     {@link ProxyServiceArray }
     *     
     */
    public ProxyServiceArray getServiceActions() {
        return serviceActions;
    }

    /**
     * Define el valor de la propiedad serviceActions.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyServiceArray }
     *     
     */
    public void setServiceActions(ProxyServiceArray value) {
        this.serviceActions = value;
    }

    public boolean isSetServiceActions() {
        return (this.serviceActions!= null);
    }

}
