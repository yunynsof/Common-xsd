//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para policyInstanceDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="policyInstanceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPolicyInstance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="namePolicyInstance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idPolicy" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="namePolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyInstanceDetail", namespace = "http://tigo.com.hn/component/policyInstancePageResponse/V1", propOrder = {
    "idPolicyInstance",
    "namePolicyInstance",
    "idPolicy",
    "namePolicy"
})
public class PolicyInstanceDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idPolicyInstance;
    @XmlElement(required = true)
    protected String namePolicyInstance;
    protected long idPolicy;
    @XmlElement(required = true)
    protected String namePolicy;

    /**
     * Obtiene el valor de la propiedad idPolicyInstance.
     * 
     */
    public long getIdPolicyInstance() {
        return idPolicyInstance;
    }

    /**
     * Define el valor de la propiedad idPolicyInstance.
     * 
     */
    public void setIdPolicyInstance(long value) {
        this.idPolicyInstance = value;
    }

    public boolean isSetIdPolicyInstance() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad namePolicyInstance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePolicyInstance() {
        return namePolicyInstance;
    }

    /**
     * Define el valor de la propiedad namePolicyInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePolicyInstance(String value) {
        this.namePolicyInstance = value;
    }

    public boolean isSetNamePolicyInstance() {
        return (this.namePolicyInstance!= null);
    }

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

}
