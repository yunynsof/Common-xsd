//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.common.proxy.as400.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Keys complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Keys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="new_imsi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="new_msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Keys", namespace = "http://tigo.com.hn/ProxyRequest/V1", propOrder = {
    "imsi",
    "msisdn",
    "newImsi",
    "newMsisdn"
})
public class Keys
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String imsi;
    @XmlElement(required = true)
    protected String msisdn;
    @XmlElement(name = "new_imsi", required = true)
    protected String newImsi;
    @XmlElement(name = "new_msisdn", required = true)
    protected String newMsisdn;

    /**
     * Obtiene el valor de la propiedad imsi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Define el valor de la propiedad imsi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    public boolean isSetImsi() {
        return (this.imsi!= null);
    }

    /**
     * Obtiene el valor de la propiedad msisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Define el valor de la propiedad msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    public boolean isSetMsisdn() {
        return (this.msisdn!= null);
    }

    /**
     * Obtiene el valor de la propiedad newImsi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewImsi() {
        return newImsi;
    }

    /**
     * Define el valor de la propiedad newImsi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewImsi(String value) {
        this.newImsi = value;
    }

    public boolean isSetNewImsi() {
        return (this.newImsi!= null);
    }

    /**
     * Obtiene el valor de la propiedad newMsisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMsisdn() {
        return newMsisdn;
    }

    /**
     * Define el valor de la propiedad newMsisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMsisdn(String value) {
        this.newMsisdn = value;
    }

    public boolean isSetNewMsisdn() {
        return (this.newMsisdn!= null);
    }

}
