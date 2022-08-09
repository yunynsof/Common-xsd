//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.common.proxy.as400.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProxyServiceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProxyServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personalisations" type="{http://tigo.com.hn/ProxyServices/V1}Personalitations"/>
 *         &lt;element name="proxyActionParameterArray" type="{http://tigo.com.hn/ProxyServices/V1}proxyParameterArray"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProxyServiceType", propOrder = {
    "id",
    "name",
    "operation",
    "personalisations",
    "proxyActionParameterArray"
})
public class ProxyServiceType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String operation;
    @XmlElement(required = true)
    protected Personalitations personalisations;
    @XmlElement(required = true)
    protected ProxyParameterArray proxyActionParameterArray;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Obtiene el valor de la propiedad operation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Define el valor de la propiedad operation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    public boolean isSetOperation() {
        return (this.operation!= null);
    }

    /**
     * Obtiene el valor de la propiedad personalisations.
     * 
     * @return
     *     possible object is
     *     {@link Personalitations }
     *     
     */
    public Personalitations getPersonalisations() {
        return personalisations;
    }

    /**
     * Define el valor de la propiedad personalisations.
     * 
     * @param value
     *     allowed object is
     *     {@link Personalitations }
     *     
     */
    public void setPersonalisations(Personalitations value) {
        this.personalisations = value;
    }

    public boolean isSetPersonalisations() {
        return (this.personalisations!= null);
    }

    /**
     * Obtiene el valor de la propiedad proxyActionParameterArray.
     * 
     * @return
     *     possible object is
     *     {@link ProxyParameterArray }
     *     
     */
    public ProxyParameterArray getProxyActionParameterArray() {
        return proxyActionParameterArray;
    }

    /**
     * Define el valor de la propiedad proxyActionParameterArray.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyParameterArray }
     *     
     */
    public void setProxyActionParameterArray(ProxyParameterArray value) {
        this.proxyActionParameterArray = value;
    }

    public boolean isSetProxyActionParameterArray() {
        return (this.proxyActionParameterArray!= null);
    }

}
