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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tSequenceFlow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tSequenceFlow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFlowElement">
 *       &lt;sequence>
 *         &lt;element name="conditionExpression" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sourceRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="targetRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="isImmediate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSequenceFlow", propOrder = {
    "conditionExpression"
})
public class TSequenceFlow
    extends TFlowElement
{

    protected TExpression conditionExpression;
    @XmlAttribute(name = "sourceRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object sourceRef;
    @XmlAttribute(name = "targetRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object targetRef;
    @XmlAttribute(name = "isImmediate")
    protected Boolean isImmediate;

    /**
     * Obtiene el valor de la propiedad conditionExpression.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getConditionExpression() {
        return conditionExpression;
    }

    /**
     * Define el valor de la propiedad conditionExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setConditionExpression(TExpression value) {
        this.conditionExpression = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceRef.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSourceRef() {
        return sourceRef;
    }

    /**
     * Define el valor de la propiedad sourceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSourceRef(Object value) {
        this.sourceRef = value;
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
     * Obtiene el valor de la propiedad isImmediate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsImmediate() {
        return isImmediate;
    }

    /**
     * Define el valor de la propiedad isImmediate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsImmediate(Boolean value) {
        this.isImmediate = value;
    }

}
