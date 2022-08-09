//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
//


package hn.com.tigo.josm.common.bpmn.semantic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Font complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Font">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="isBold" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isItalic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isUnderline" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isStrikeThrough" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Font", namespace = "http://www.omg.org/spec/DD/20100524/DC")
public class Font {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "size")
    protected Double size;
    @XmlAttribute(name = "isBold")
    protected Boolean isBold;
    @XmlAttribute(name = "isItalic")
    protected Boolean isItalic;
    @XmlAttribute(name = "isUnderline")
    protected Boolean isUnderline;
    @XmlAttribute(name = "isStrikeThrough")
    protected Boolean isStrikeThrough;

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

    /**
     * Obtiene el valor de la propiedad size.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSize() {
        return size;
    }

    /**
     * Define el valor de la propiedad size.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSize(Double value) {
        this.size = value;
    }

    /**
     * Obtiene el valor de la propiedad isBold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBold() {
        return isBold;
    }

    /**
     * Define el valor de la propiedad isBold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBold(Boolean value) {
        this.isBold = value;
    }

    /**
     * Obtiene el valor de la propiedad isItalic.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsItalic() {
        return isItalic;
    }

    /**
     * Define el valor de la propiedad isItalic.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsItalic(Boolean value) {
        this.isItalic = value;
    }

    /**
     * Obtiene el valor de la propiedad isUnderline.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUnderline() {
        return isUnderline;
    }

    /**
     * Define el valor de la propiedad isUnderline.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnderline(Boolean value) {
        this.isUnderline = value;
    }

    /**
     * Obtiene el valor de la propiedad isStrikeThrough.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStrikeThrough() {
        return isStrikeThrough;
    }

    /**
     * Define el valor de la propiedad isStrikeThrough.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStrikeThrough(Boolean value) {
        this.isStrikeThrough = value;
    }

}
