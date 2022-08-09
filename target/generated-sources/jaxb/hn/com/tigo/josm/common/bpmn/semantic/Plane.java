//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.common.bpmn.semantic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Plane complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Plane">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}Node">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/DD/20100524/DI}DiagramElement" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Plane", namespace = "http://www.omg.org/spec/DD/20100524/DI", propOrder = {
    "diagramElement"
})
@XmlSeeAlso({
    BPMNPlane.class
})
public abstract class Plane
    extends Node
{

    @XmlElementRef(name = "DiagramElement", namespace = "http://www.omg.org/spec/DD/20100524/DI", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends DiagramElement>> diagramElement;

    /**
     * Gets the value of the diagramElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagramElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagramElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DiagramElement }{@code >}
     * {@link JAXBElement }{@code <}{@link BPMNEdge }{@code >}
     * {@link JAXBElement }{@code <}{@link BPMNShape }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DiagramElement>> getDiagramElement() {
        if (diagramElement == null) {
            diagramElement = new ArrayList<JAXBElement<? extends DiagramElement>>();
        }
        return this.diagramElement;
    }

}
