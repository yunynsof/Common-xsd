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
 * <p>Clase Java para IncentiveConsumptionAdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IncentiveConsumptionAdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="fields" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataSourceVas" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveConsumptionAdapterConfigType", namespace = "http://tigo.com.hn/IncentiveConsumptionAdapterConfig/V1", propOrder = {
    "fields",
    "dataSource",
    "dataSourceVas"
})
public class IncentiveConsumptionAdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String fields;
    @XmlElement(required = true)
    protected String dataSource;
    @XmlElement(required = true)
    protected String dataSourceVas;

    /**
     * Obtiene el valor de la propiedad fields.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFields() {
        return fields;
    }

    /**
     * Define el valor de la propiedad fields.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFields(String value) {
        this.fields = value;
    }

    public boolean isSetFields() {
        return (this.fields!= null);
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

    /**
     * Obtiene el valor de la propiedad dataSourceVas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceVas() {
        return dataSourceVas;
    }

    /**
     * Define el valor de la propiedad dataSourceVas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceVas(String value) {
        this.dataSourceVas = value;
    }

    public boolean isSetDataSourceVas() {
        return (this.dataSourceVas!= null);
    }

}
