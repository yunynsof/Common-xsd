//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.common.bpmn.semantic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Clase Java para tOperation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;sequence>
 *         &lt;element name="inMessageRef" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="outMessageRef" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/>
 *         &lt;element name="errorRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="implementationRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOperation", propOrder = {
    "inMessageRef",
    "outMessageRef",
    "errorRef"
})
public class TOperation
    extends TBaseElement
{

    @XmlElement(required = true)
    protected QName inMessageRef;
    protected QName outMessageRef;
    protected List<QName> errorRef;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "implementationRef")
    protected QName implementationRef;

    /**
     * Obtiene el valor de la propiedad inMessageRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getInMessageRef() {
        return inMessageRef;
    }

    /**
     * Define el valor de la propiedad inMessageRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setInMessageRef(QName value) {
        this.inMessageRef = value;
    }

    /**
     * Obtiene el valor de la propiedad outMessageRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getOutMessageRef() {
        return outMessageRef;
    }

    /**
     * Define el valor de la propiedad outMessageRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setOutMessageRef(QName value) {
        this.outMessageRef = value;
    }

    /**
     * Gets the value of the errorRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getErrorRef() {
        if (errorRef == null) {
            errorRef = new ArrayList<QName>();
        }
        return this.errorRef;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad implementationRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getImplementationRef() {
        return implementationRef;
    }

    /**
     * Define el valor de la propiedad implementationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setImplementationRef(QName value) {
        this.implementationRef = value;
    }

}
