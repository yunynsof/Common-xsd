//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.common.bpmn.semantic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Clase Java para tParticipantAssociation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tParticipantAssociation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;sequence>
 *         &lt;element name="innerParticipantRef" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="outerParticipantRef" type="{http://www.w3.org/2001/XMLSchema}QName"/>
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
@XmlType(name = "tParticipantAssociation", propOrder = {
    "innerParticipantRef",
    "outerParticipantRef"
})
public class TParticipantAssociation
    extends TBaseElement
{

    @XmlElement(required = true)
    protected QName innerParticipantRef;
    @XmlElement(required = true)
    protected QName outerParticipantRef;

    /**
     * Obtiene el valor de la propiedad innerParticipantRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getInnerParticipantRef() {
        return innerParticipantRef;
    }

    /**
     * Define el valor de la propiedad innerParticipantRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setInnerParticipantRef(QName value) {
        this.innerParticipantRef = value;
    }

    /**
     * Obtiene el valor de la propiedad outerParticipantRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getOuterParticipantRef() {
        return outerParticipantRef;
    }

    /**
     * Define el valor de la propiedad outerParticipantRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setOuterParticipantRef(QName value) {
        this.outerParticipantRef = value;
    }

}
