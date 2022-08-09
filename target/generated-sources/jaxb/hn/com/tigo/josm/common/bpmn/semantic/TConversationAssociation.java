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
import javax.xml.namespace.QName;


/**
 * <p>Clase Java para tConversationAssociation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tConversationAssociation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;attribute name="innerConversationNodeRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="outerConversationNodeRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tConversationAssociation")
public class TConversationAssociation
    extends TBaseElement
{

    @XmlAttribute(name = "innerConversationNodeRef", required = true)
    protected QName innerConversationNodeRef;
    @XmlAttribute(name = "outerConversationNodeRef", required = true)
    protected QName outerConversationNodeRef;

    /**
     * Obtiene el valor de la propiedad innerConversationNodeRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getInnerConversationNodeRef() {
        return innerConversationNodeRef;
    }

    /**
     * Define el valor de la propiedad innerConversationNodeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setInnerConversationNodeRef(QName value) {
        this.innerConversationNodeRef = value;
    }

    /**
     * Obtiene el valor de la propiedad outerConversationNodeRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getOuterConversationNodeRef() {
        return outerConversationNodeRef;
    }

    /**
     * Define el valor de la propiedad outerConversationNodeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setOuterConversationNodeRef(QName value) {
        this.outerConversationNodeRef = value;
    }

}
