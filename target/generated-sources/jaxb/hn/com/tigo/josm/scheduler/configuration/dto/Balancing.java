//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.scheduler.configuration.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Balancing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Balancing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="complexBalancing" type="{http://tigo.com.hn/scheduler/balancing/V1}ComplexBalancing" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Balancing", propOrder = {
    "mod",
    "complexBalancing"
})
public class Balancing {

    protected int mod;
    protected ComplexBalancing complexBalancing;

    /**
     * Obtiene el valor de la propiedad mod.
     * 
     */
    public int getMod() {
        return mod;
    }

    /**
     * Define el valor de la propiedad mod.
     * 
     */
    public void setMod(int value) {
        this.mod = value;
    }

    /**
     * Obtiene el valor de la propiedad complexBalancing.
     * 
     * @return
     *     possible object is
     *     {@link ComplexBalancing }
     *     
     */
    public ComplexBalancing getComplexBalancing() {
        return complexBalancing;
    }

    /**
     * Define el valor de la propiedad complexBalancing.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexBalancing }
     *     
     */
    public void setComplexBalancing(ComplexBalancing value) {
        this.complexBalancing = value;
    }

}
