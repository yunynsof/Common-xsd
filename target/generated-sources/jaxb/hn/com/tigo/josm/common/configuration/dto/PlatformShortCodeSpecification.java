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
 * <p>Clase Java para PlatformShortCodeSpecification complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PlatformShortCodeSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="platformShortCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="platformRegexList" type="{http://tigo.com.hn/PlatformMappingConfigType/V1}PlatformRegexList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlatformShortCodeSpecification", propOrder = {
    "platformShortCode",
    "platformRegexList"
})
public class PlatformShortCodeSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String platformShortCode;
    @XmlElement(required = true, nillable = true)
    protected PlatformRegexList platformRegexList;

    /**
     * Obtiene el valor de la propiedad platformShortCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformShortCode() {
        return platformShortCode;
    }

    /**
     * Define el valor de la propiedad platformShortCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformShortCode(String value) {
        this.platformShortCode = value;
    }

    public boolean isSetPlatformShortCode() {
        return (this.platformShortCode!= null);
    }

    /**
     * Obtiene el valor de la propiedad platformRegexList.
     * 
     * @return
     *     possible object is
     *     {@link PlatformRegexList }
     *     
     */
    public PlatformRegexList getPlatformRegexList() {
        return platformRegexList;
    }

    /**
     * Define el valor de la propiedad platformRegexList.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformRegexList }
     *     
     */
    public void setPlatformRegexList(PlatformRegexList value) {
        this.platformRegexList = value;
    }

    public boolean isSetPlatformRegexList() {
        return (this.platformRegexList!= null);
    }

}
