//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.common.bpmn.semantic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Clase Java para tErrorEventDefinition complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tErrorEventDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEventDefinition">
 *       &lt;attribute name="errorRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tErrorEventDefinition")
public class TErrorEventDefinition
    extends TEventDefinition
{

    @XmlAttribute(name = "errorRef")
    protected QName errorRef;

    /**
     * Obtiene el valor de la propiedad errorRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getErrorRef() {
        return errorRef;
    }

    /**
     * Define el valor de la propiedad errorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setErrorRef(QName value) {
        this.errorRef = value;
    }

}
