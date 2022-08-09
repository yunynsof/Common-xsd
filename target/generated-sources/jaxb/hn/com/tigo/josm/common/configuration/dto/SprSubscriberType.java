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
 * <p>Clase Java para SprSubscriberType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SprSubscriberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sprSubscriberType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sprSubscriberTypeFields" type="{http://tigo.com.hn/SprAdapterConfig/V1}SprSubscriberTypeFields" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SprSubscriberType", namespace = "http://tigo.com.hn/SprAdapterConfig/V1", propOrder = {
    "sprSubscriberType",
    "sprSubscriberTypeFields"
})
public class SprSubscriberType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String sprSubscriberType;
    @XmlElement(nillable = true)
    protected List<SprSubscriberTypeFields> sprSubscriberTypeFields;

    /**
     * Obtiene el valor de la propiedad sprSubscriberType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSprSubscriberType() {
        return sprSubscriberType;
    }

    /**
     * Define el valor de la propiedad sprSubscriberType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSprSubscriberType(String value) {
        this.sprSubscriberType = value;
    }

    public boolean isSetSprSubscriberType() {
        return (this.sprSubscriberType!= null);
    }

    /**
     * Gets the value of the sprSubscriberTypeFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sprSubscriberTypeFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSprSubscriberTypeFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SprSubscriberTypeFields }
     * 
     * 
     */
    public List<SprSubscriberTypeFields> getSprSubscriberTypeFields() {
        if (sprSubscriberTypeFields == null) {
            sprSubscriberTypeFields = new ArrayList<SprSubscriberTypeFields>();
        }
        return this.sprSubscriberTypeFields;
    }

    public boolean isSetSprSubscriberTypeFields() {
        return ((this.sprSubscriberTypeFields!= null)&&(!this.sprSubscriberTypeFields.isEmpty()));
    }

    public void unsetSprSubscriberTypeFields() {
        this.sprSubscriberTypeFields = null;
    }

}
