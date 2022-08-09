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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Clase Java para tCallableElement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tCallableElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement">
 *       &lt;sequence>
 *         &lt;element name="supportedInterfaceRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}ioSpecification" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}ioBinding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCallableElement", propOrder = {
    "supportedInterfaceRef",
    "ioSpecification",
    "ioBinding"
})
@XmlSeeAlso({
    TProcess.class,
    TGlobalTask.class
})
public class TCallableElement
    extends TRootElement
{

    protected List<QName> supportedInterfaceRef;
    protected TInputOutputSpecification ioSpecification;
    protected List<TInputOutputBinding> ioBinding;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the supportedInterfaceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedInterfaceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedInterfaceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getSupportedInterfaceRef() {
        if (supportedInterfaceRef == null) {
            supportedInterfaceRef = new ArrayList<QName>();
        }
        return this.supportedInterfaceRef;
    }

    /**
     * Obtiene el valor de la propiedad ioSpecification.
     * 
     * @return
     *     possible object is
     *     {@link TInputOutputSpecification }
     *     
     */
    public TInputOutputSpecification getIoSpecification() {
        return ioSpecification;
    }

    /**
     * Define el valor de la propiedad ioSpecification.
     * 
     * @param value
     *     allowed object is
     *     {@link TInputOutputSpecification }
     *     
     */
    public void setIoSpecification(TInputOutputSpecification value) {
        this.ioSpecification = value;
    }

    /**
     * Gets the value of the ioBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ioBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIoBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TInputOutputBinding }
     * 
     * 
     */
    public List<TInputOutputBinding> getIoBinding() {
        if (ioBinding == null) {
            ioBinding = new ArrayList<TInputOutputBinding>();
        }
        return this.ioBinding;
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

}
