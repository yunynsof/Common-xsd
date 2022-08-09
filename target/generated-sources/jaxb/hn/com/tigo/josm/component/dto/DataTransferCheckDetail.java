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
 * <p>Clase Java para dataTransferCheckDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dataTransferCheckDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idModule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataTransferCheckDetail", namespace = "http://tigo.com.hn/component/DataTransferCheckResponse/V1", propOrder = {
    "module",
    "idModule",
    "operationType"
})
public class DataTransferCheckDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String module;
    @XmlElement(required = true)
    protected String idModule;
    @XmlElement(required = true)
    protected String operationType;

    /**
     * Obtiene el valor de la propiedad module.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * Define el valor de la propiedad module.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
    }

    public boolean isSetModule() {
        return (this.module!= null);
    }

    /**
     * Obtiene el valor de la propiedad idModule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdModule() {
        return idModule;
    }

    /**
     * Define el valor de la propiedad idModule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdModule(String value) {
        this.idModule = value;
    }

    public boolean isSetIdModule() {
        return (this.idModule!= null);
    }

    /**
     * Obtiene el valor de la propiedad operationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Define el valor de la propiedad operationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    public boolean isSetOperationType() {
        return (this.operationType!= null);
    }

}
