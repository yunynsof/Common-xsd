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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Clase Java para tCorrelationPropertyRetrievalExpression complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tCorrelationPropertyRetrievalExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;sequence>
 *         &lt;element name="messagePath" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFormalExpression"/>
 *       &lt;/sequence>
 *       &lt;attribute name="messageRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCorrelationPropertyRetrievalExpression", propOrder = {
    "messagePath"
})
public class TCorrelationPropertyRetrievalExpression
    extends TBaseElement
{

    @XmlElement(required = true)
    protected TFormalExpression messagePath;
    @XmlAttribute(name = "messageRef", required = true)
    protected QName messageRef;

    /**
     * Obtiene el valor de la propiedad messagePath.
     * 
     * @return
     *     possible object is
     *     {@link TFormalExpression }
     *     
     */
    public TFormalExpression getMessagePath() {
        return messagePath;
    }

    /**
     * Define el valor de la propiedad messagePath.
     * 
     * @param value
     *     allowed object is
     *     {@link TFormalExpression }
     *     
     */
    public void setMessagePath(TFormalExpression value) {
        this.messagePath = value;
    }

    /**
     * Obtiene el valor de la propiedad messageRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getMessageRef() {
        return messageRef;
    }

    /**
     * Define el valor de la propiedad messageRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setMessageRef(QName value) {
        this.messageRef = value;
    }

}
