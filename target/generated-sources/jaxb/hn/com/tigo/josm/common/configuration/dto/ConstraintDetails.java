//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConstraintDetails complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConstraintDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constraintName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorMessage" type="{http://tigo.com.hn/persistence/DatabaseErrorMappingMap/v1}constraintDetailsErrors"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintDetails", namespace = "http://tigo.com.hn/persistence/DatabaseErrorMappingMap/v1", propOrder = {
    "constraintName",
    "errorMessage"
})
public class ConstraintDetails
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String constraintName;
    @XmlElement(required = true)
    protected ConstraintDetailsErrors errorMessage;

    /**
     * Obtiene el valor de la propiedad constraintName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintName() {
        return constraintName;
    }

    /**
     * Define el valor de la propiedad constraintName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintName(String value) {
        this.constraintName = value;
    }

    public boolean isSetConstraintName() {
        return (this.constraintName!= null);
    }

    /**
     * Obtiene el valor de la propiedad errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintDetailsErrors }
     *     
     */
    public ConstraintDetailsErrors getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define el valor de la propiedad errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintDetailsErrors }
     *     
     */
    public void setErrorMessage(ConstraintDetailsErrors value) {
        this.errorMessage = value;
    }

    public boolean isSetErrorMessage() {
        return (this.errorMessage!= null);
    }

}
