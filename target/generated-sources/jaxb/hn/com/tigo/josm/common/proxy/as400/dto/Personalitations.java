//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.common.proxy.as400.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Personalitations complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Personalitations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fnum" type="{http://tigo.com.hn/ProxyServices/V1}Fnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Personalitations", propOrder = {
    "fnum"
})
public class Personalitations
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Fnum fnum;

    /**
     * Obtiene el valor de la propiedad fnum.
     * 
     * @return
     *     possible object is
     *     {@link Fnum }
     *     
     */
    public Fnum getFnum() {
        return fnum;
    }

    /**
     * Define el valor de la propiedad fnum.
     * 
     * @param value
     *     allowed object is
     *     {@link Fnum }
     *     
     */
    public void setFnum(Fnum value) {
        this.fnum = value;
    }

    public boolean isSetFnum() {
        return (this.fnum!= null);
    }

}
