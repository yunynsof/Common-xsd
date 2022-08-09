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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AS400ParameterType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AS400ParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="output" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="complement" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="type" type="{http://tigo.com.hn/adapter/AS400ProgramConfigType/V1}EnumAS400Type" />
 *       &lt;attribute name="decimals" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AS400ParameterType", namespace = "http://tigo.com.hn/adapter/AS400ProgramConfigType/V1", propOrder = {
    "name",
    "size"
})
public class AS400ParameterType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String name;
    protected int size;
    @XmlAttribute(name = "output")
    protected Boolean output;
    @XmlAttribute(name = "complement")
    protected Boolean complement;
    @XmlAttribute(name = "type")
    protected EnumAS400Type type;
    @XmlAttribute(name = "decimals")
    protected Integer decimals;

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
     * Obtiene el valor de la propiedad size.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Define el valor de la propiedad size.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

    public boolean isSetSize() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad output.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOutput() {
        return output;
    }

    /**
     * Define el valor de la propiedad output.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutput(boolean value) {
        this.output = value;
    }

    public boolean isSetOutput() {
        return (this.output!= null);
    }

    public void unsetOutput() {
        this.output = null;
    }

    /**
     * Obtiene el valor de la propiedad complement.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isComplement() {
        return complement;
    }

    /**
     * Define el valor de la propiedad complement.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplement(boolean value) {
        this.complement = value;
    }

    public boolean isSetComplement() {
        return (this.complement!= null);
    }

    public void unsetComplement() {
        this.complement = null;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link EnumAS400Type }
     *     
     */
    public EnumAS400Type getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumAS400Type }
     *     
     */
    public void setType(EnumAS400Type value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Obtiene el valor de la propiedad decimals.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDecimals() {
        if (decimals == null) {
            return  0;
        } else {
            return decimals;
        }
    }

    /**
     * Define el valor de la propiedad decimals.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDecimals(int value) {
        this.decimals = value;
    }

    public boolean isSetDecimals() {
        return (this.decimals!= null);
    }

    public void unsetDecimals() {
        this.decimals = null;
    }

}
