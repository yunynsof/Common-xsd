//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:07 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UrlDetailService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UrlDetailService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cacheExpiration" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="urlDetail" type="{http://tigo.com.hn/configuration/JOSMServiceConfiguration/V1}UrlDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrlDetailService", namespace = "http://tigo.com.hn/configuration/JOSMServiceConfiguration/V1", propOrder = {
    "cacheExpiration",
    "urlDetail"
})
public class UrlDetailService
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long cacheExpiration;
    protected List<UrlDetails> urlDetail;

    /**
     * Obtiene el valor de la propiedad cacheExpiration.
     * 
     */
    public long getCacheExpiration() {
        return cacheExpiration;
    }

    /**
     * Define el valor de la propiedad cacheExpiration.
     * 
     */
    public void setCacheExpiration(long value) {
        this.cacheExpiration = value;
    }

    public boolean isSetCacheExpiration() {
        return true;
    }

    /**
     * Gets the value of the urlDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlDetails }
     * 
     * 
     */
    public List<UrlDetails> getUrlDetail() {
        if (urlDetail == null) {
            urlDetail = new ArrayList<UrlDetails>();
        }
        return this.urlDetail;
    }

    public boolean isSetUrlDetail() {
        return ((this.urlDetail!= null)&&(!this.urlDetail.isEmpty()));
    }

    public void unsetUrlDetail() {
        this.urlDetail = null;
    }

}
