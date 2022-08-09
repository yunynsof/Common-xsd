//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:08 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PlatformSeparatorList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PlatformSeparatorList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="separatorCharacter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameterNameList" type="{http://tigo.com.hn/PlatformMappingConfigType/V1}ParameterNameList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlatformSeparatorList", propOrder = {
    "separatorCharacter",
    "parameterNameList"
})
public class PlatformSeparatorList
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "separatorCharacter", namespace = "http://tigo.com.hn/PlatformMappingConfigType/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> separatorCharacter;
    @XmlElementRef(name = "parameterNameList", namespace = "http://tigo.com.hn/PlatformMappingConfigType/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<ParameterNameList> parameterNameList;

    /**
     * Obtiene el valor de la propiedad separatorCharacter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeparatorCharacter() {
        return separatorCharacter;
    }

    /**
     * Define el valor de la propiedad separatorCharacter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeparatorCharacter(JAXBElement<String> value) {
        this.separatorCharacter = value;
    }

    public boolean isSetSeparatorCharacter() {
        return (this.separatorCharacter!= null);
    }

    /**
     * Obtiene el valor de la propiedad parameterNameList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParameterNameList }{@code >}
     *     
     */
    public JAXBElement<ParameterNameList> getParameterNameList() {
        return parameterNameList;
    }

    /**
     * Define el valor de la propiedad parameterNameList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParameterNameList }{@code >}
     *     
     */
    public void setParameterNameList(JAXBElement<ParameterNameList> value) {
        this.parameterNameList = value;
    }

    public boolean isSetParameterNameList() {
        return (this.parameterNameList!= null);
    }

}
