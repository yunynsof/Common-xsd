//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:08 PM CST 
//


package hn.com.tigo.josm.proxy.configuration.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="headerResponse" type="{http://tigo.com.hn/ProxyConfiguration/V1}headerResponse"/>
 *         &lt;element name="proxyResponseElement" type="{http://tigo.com.hn/ProxyConfiguration/V1}ProxyElementResponse" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "headerResponse",
    "proxyResponseElement"
})
@XmlRootElement(name = "proxyConfigurationResponse")
public class ProxyConfigurationResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected HeaderResponse headerResponse;
    @XmlElement(required = true)
    protected List<ProxyElementResponse> proxyResponseElement;

    /**
     * Obtiene el valor de la propiedad headerResponse.
     * 
     * @return
     *     possible object is
     *     {@link HeaderResponse }
     *     
     */
    public HeaderResponse getHeaderResponse() {
        return headerResponse;
    }

    /**
     * Define el valor de la propiedad headerResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderResponse }
     *     
     */
    public void setHeaderResponse(HeaderResponse value) {
        this.headerResponse = value;
    }

    public boolean isSetHeaderResponse() {
        return (this.headerResponse!= null);
    }

    /**
     * Gets the value of the proxyResponseElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proxyResponseElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProxyResponseElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProxyElementResponse }
     * 
     * 
     */
    public List<ProxyElementResponse> getProxyResponseElement() {
        if (proxyResponseElement == null) {
            proxyResponseElement = new ArrayList<ProxyElementResponse>();
        }
        return this.proxyResponseElement;
    }

    public boolean isSetProxyResponseElement() {
        return ((this.proxyResponseElement!= null)&&(!this.proxyResponseElement.isEmpty()));
    }

    public void unsetProxyResponseElement() {
        this.proxyResponseElement = null;
    }

}
