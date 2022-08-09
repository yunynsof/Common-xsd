//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:08 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para constraintDetailsErrors complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="constraintDetailsErrors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constraintErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="constraintErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constraintDetailsErrors", namespace = "http://tigo.com.hn/persistence/DatabaseErrorMappingMap/v1", propOrder = {
    "constraintErrorCode",
    "constraintErrorMessage"
})
public class ConstraintDetailsErrors
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String constraintErrorCode;
    @XmlElement(required = true)
    protected String constraintErrorMessage;

    /**
     * Obtiene el valor de la propiedad constraintErrorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintErrorCode() {
        return constraintErrorCode;
    }

    /**
     * Define el valor de la propiedad constraintErrorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintErrorCode(String value) {
        this.constraintErrorCode = value;
    }

    public boolean isSetConstraintErrorCode() {
        return (this.constraintErrorCode!= null);
    }

    /**
     * Obtiene el valor de la propiedad constraintErrorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintErrorMessage() {
        return constraintErrorMessage;
    }

    /**
     * Define el valor de la propiedad constraintErrorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintErrorMessage(String value) {
        this.constraintErrorMessage = value;
    }

    public boolean isSetConstraintErrorMessage() {
        return (this.constraintErrorMessage!= null);
    }

}
