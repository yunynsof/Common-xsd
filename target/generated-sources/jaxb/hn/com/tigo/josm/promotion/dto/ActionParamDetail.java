//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.promotion.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActionParamDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActionParamDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idActionParam" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idAction" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="typeInfo" type="{http://www.example.org/ParamTypeResponse}ParamTypeDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionParamDetail", namespace = "http://www.example.org/ActionParamResponse", propOrder = {
    "idActionParam",
    "name",
    "value",
    "idAction",
    "typeInfo"
})
public class ActionParamDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idActionParam;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String value;
    protected long idAction;
    protected ParamTypeDetail typeInfo;

    /**
     * Obtiene el valor de la propiedad idActionParam.
     * 
     */
    public long getIdActionParam() {
        return idActionParam;
    }

    /**
     * Define el valor de la propiedad idActionParam.
     * 
     */
    public void setIdActionParam(long value) {
        this.idActionParam = value;
    }

    public boolean isSetIdActionParam() {
        return true;
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
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Obtiene el valor de la propiedad idAction.
     * 
     */
    public long getIdAction() {
        return idAction;
    }

    /**
     * Define el valor de la propiedad idAction.
     * 
     */
    public void setIdAction(long value) {
        this.idAction = value;
    }

    public boolean isSetIdAction() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad typeInfo.
     * 
     * @return
     *     possible object is
     *     {@link ParamTypeDetail }
     *     
     */
    public ParamTypeDetail getTypeInfo() {
        return typeInfo;
    }

    /**
     * Define el valor de la propiedad typeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamTypeDetail }
     *     
     */
    public void setTypeInfo(ParamTypeDetail value) {
        this.typeInfo = value;
    }

    public boolean isSetTypeInfo() {
        return (this.typeInfo!= null);
    }

}
