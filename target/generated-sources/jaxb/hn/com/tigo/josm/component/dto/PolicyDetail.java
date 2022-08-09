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
 * <p>Clase Java para policyDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="policyDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPolicy" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="namePolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jndiPolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allOrNothingPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyDetail", namespace = "http://tigo.com.hn/component/policyPageResponse/V1", propOrder = {
    "idPolicy",
    "namePolicy",
    "jndiPolicy",
    "allOrNothingPolicy"
})
public class PolicyDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idPolicy;
    @XmlElement(required = true)
    protected String namePolicy;
    @XmlElement(required = true)
    protected String jndiPolicy;
    protected boolean allOrNothingPolicy;

    /**
     * Obtiene el valor de la propiedad idPolicy.
     * 
     */
    public long getIdPolicy() {
        return idPolicy;
    }

    /**
     * Define el valor de la propiedad idPolicy.
     * 
     */
    public void setIdPolicy(long value) {
        this.idPolicy = value;
    }

    public boolean isSetIdPolicy() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad namePolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePolicy() {
        return namePolicy;
    }

    /**
     * Define el valor de la propiedad namePolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePolicy(String value) {
        this.namePolicy = value;
    }

    public boolean isSetNamePolicy() {
        return (this.namePolicy!= null);
    }

    /**
     * Obtiene el valor de la propiedad jndiPolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiPolicy() {
        return jndiPolicy;
    }

    /**
     * Define el valor de la propiedad jndiPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiPolicy(String value) {
        this.jndiPolicy = value;
    }

    public boolean isSetJndiPolicy() {
        return (this.jndiPolicy!= null);
    }

    /**
     * Obtiene el valor de la propiedad allOrNothingPolicy.
     * 
     */
    public boolean isAllOrNothingPolicy() {
        return allOrNothingPolicy;
    }

    /**
     * Define el valor de la propiedad allOrNothingPolicy.
     * 
     */
    public void setAllOrNothingPolicy(boolean value) {
        this.allOrNothingPolicy = value;
    }

    public boolean isSetAllOrNothingPolicy() {
        return true;
    }

}
