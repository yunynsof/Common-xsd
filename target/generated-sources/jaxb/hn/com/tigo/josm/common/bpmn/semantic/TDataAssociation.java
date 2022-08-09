//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
//


package hn.com.tigo.josm.common.bpmn.semantic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tDataAssociation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tDataAssociation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;sequence>
 *         &lt;element name="sourceRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targetRef" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         &lt;element name="transformation" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFormalExpression" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}assignment" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tDataAssociation", propOrder = {
    "sourceRef",
    "targetRef",
    "transformation",
    "assignment"
})
@XmlSeeAlso({
    TDataInputAssociation.class,
    TDataOutputAssociation.class
})
public class TDataAssociation
    extends TBaseElement
{

    @XmlElementRef(name = "sourceRef", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> sourceRef;
    @XmlElement(required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object targetRef;
    protected TFormalExpression transformation;
    protected List<TAssignment> assignment;

    /**
     * Gets the value of the sourceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getSourceRef() {
        if (sourceRef == null) {
            sourceRef = new ArrayList<JAXBElement<Object>>();
        }
        return this.sourceRef;
    }

    /**
     * Obtiene el valor de la propiedad targetRef.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTargetRef() {
        return targetRef;
    }

    /**
     * Define el valor de la propiedad targetRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTargetRef(Object value) {
        this.targetRef = value;
    }

    /**
     * Obtiene el valor de la propiedad transformation.
     * 
     * @return
     *     possible object is
     *     {@link TFormalExpression }
     *     
     */
    public TFormalExpression getTransformation() {
        return transformation;
    }

    /**
     * Define el valor de la propiedad transformation.
     * 
     * @param value
     *     allowed object is
     *     {@link TFormalExpression }
     *     
     */
    public void setTransformation(TFormalExpression value) {
        this.transformation = value;
    }

    /**
     * Gets the value of the assignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAssignment }
     * 
     * 
     */
    public List<TAssignment> getAssignment() {
        if (assignment == null) {
            assignment = new ArrayList<TAssignment>();
        }
        return this.assignment;
    }

}
