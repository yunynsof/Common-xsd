//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
//


package hn.com.tigo.josm.common.bpmn.semantic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Label complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Label">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}Node">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/DD/20100524/DC}Bounds" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Label", namespace = "http://www.omg.org/spec/DD/20100524/DI", propOrder = {
    "bounds"
})
@XmlSeeAlso({
    BPMNLabel.class
})
public abstract class Label
    extends Node
{

    @XmlElement(name = "Bounds", namespace = "http://www.omg.org/spec/DD/20100524/DC")
    protected Bounds bounds;

    /**
     * Obtiene el valor de la propiedad bounds.
     * 
     * @return
     *     possible object is
     *     {@link Bounds }
     *     
     */
    public Bounds getBounds() {
        return bounds;
    }

    /**
     * Define el valor de la propiedad bounds.
     * 
     * @param value
     *     allowed object is
     *     {@link Bounds }
     *     
     */
    public void setBounds(Bounds value) {
        this.bounds = value;
    }

}
