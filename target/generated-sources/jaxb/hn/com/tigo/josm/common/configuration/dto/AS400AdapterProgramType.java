//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AS400AdapterProgramType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AS400AdapterProgramType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}DriverType">
 *       &lt;sequence>
 *         &lt;element name="as400ProgramName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="as400ProgramLib" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="as400ParameterConfig" type="{http://tigo.com.hn/adapter/AS400ProgramConfigType/V1}AS400ParameterType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AS400AdapterProgramType", namespace = "http://tigo.com.hn/adapter/AS400ProgramConfigType/V1", propOrder = {
    "as400ProgramName",
    "as400ProgramLib",
    "as400ParameterConfig"
})
public class AS400AdapterProgramType
    extends DriverType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String as400ProgramName;
    @XmlElement(required = true)
    protected String as400ProgramLib;
    @XmlElement(required = true)
    protected List<AS400ParameterType> as400ParameterConfig;

    /**
     * Obtiene el valor de la propiedad as400ProgramName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAs400ProgramName() {
        return as400ProgramName;
    }

    /**
     * Define el valor de la propiedad as400ProgramName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAs400ProgramName(String value) {
        this.as400ProgramName = value;
    }

    public boolean isSetAs400ProgramName() {
        return (this.as400ProgramName!= null);
    }

    /**
     * Obtiene el valor de la propiedad as400ProgramLib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAs400ProgramLib() {
        return as400ProgramLib;
    }

    /**
     * Define el valor de la propiedad as400ProgramLib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAs400ProgramLib(String value) {
        this.as400ProgramLib = value;
    }

    public boolean isSetAs400ProgramLib() {
        return (this.as400ProgramLib!= null);
    }

    /**
     * Gets the value of the as400ParameterConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the as400ParameterConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAs400ParameterConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AS400ParameterType }
     * 
     * 
     */
    public List<AS400ParameterType> getAs400ParameterConfig() {
        if (as400ParameterConfig == null) {
            as400ParameterConfig = new ArrayList<AS400ParameterType>();
        }
        return this.as400ParameterConfig;
    }

    public boolean isSetAs400ParameterConfig() {
        return ((this.as400ParameterConfig!= null)&&(!this.as400ParameterConfig.isEmpty()));
    }

    public void unsetAs400ParameterConfig() {
        this.as400ParameterConfig = null;
    }

}
