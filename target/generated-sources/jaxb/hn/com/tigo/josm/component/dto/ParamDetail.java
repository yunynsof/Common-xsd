//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idParam" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramDetail", namespace = "http://tigo.com.hn/component/paramPagedResponse/V1", propOrder = {
    "idParam",
    "nameParam",
    "value",
    "dataSource"
})
public class ParamDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idParam;
    @XmlElement(required = true)
    protected String nameParam;
    @XmlElement(required = true)
    protected String value;
    @XmlElement(required = true)
    protected String dataSource;

    /**
     * Obtiene el valor de la propiedad idParam.
     * 
     */
    public long getIdParam() {
        return idParam;
    }

    /**
     * Define el valor de la propiedad idParam.
     * 
     */
    public void setIdParam(long value) {
        this.idParam = value;
    }

    public boolean isSetIdParam() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad nameParam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameParam() {
        return nameParam;
    }

    /**
     * Define el valor de la propiedad nameParam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameParam(String value) {
        this.nameParam = value;
    }

    public boolean isSetNameParam() {
        return (this.nameParam!= null);
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
     * Obtiene el valor de la propiedad dataSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Define el valor de la propiedad dataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    public boolean isSetDataSource() {
        return (this.dataSource!= null);
    }

}
