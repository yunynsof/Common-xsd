//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
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
 * <p>Clase Java para tResourceRole complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tResourceRole">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="resourceRef" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *           &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}resourceParameterBinding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}resourceAssignmentExpression" minOccurs="0"/>
 *       &lt;/choice>
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
@XmlType(name = "tResourceRole", propOrder = {
    "resourceRef",
    "resourceParameterBinding",
    "resourceAssignmentExpression"
})
@XmlSeeAlso({
    TPerformer.class
})
public class TResourceRole
    extends TBaseElement
{

    protected QName resourceRef;
    protected List<TResourceParameterBinding> resourceParameterBinding;
    protected TResourceAssignmentExpression resourceAssignmentExpression;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Obtiene el valor de la propiedad resourceRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getResourceRef() {
        return resourceRef;
    }

    /**
     * Define el valor de la propiedad resourceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setResourceRef(QName value) {
        this.resourceRef = value;
    }

    /**
     * Gets the value of the resourceParameterBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceParameterBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceParameterBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TResourceParameterBinding }
     * 
     * 
     */
    public List<TResourceParameterBinding> getResourceParameterBinding() {
        if (resourceParameterBinding == null) {
            resourceParameterBinding = new ArrayList<TResourceParameterBinding>();
        }
        return this.resourceParameterBinding;
    }

    /**
     * Obtiene el valor de la propiedad resourceAssignmentExpression.
     * 
     * @return
     *     possible object is
     *     {@link TResourceAssignmentExpression }
     *     
     */
    public TResourceAssignmentExpression getResourceAssignmentExpression() {
        return resourceAssignmentExpression;
    }

    /**
     * Define el valor de la propiedad resourceAssignmentExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link TResourceAssignmentExpression }
     *     
     */
    public void setResourceAssignmentExpression(TResourceAssignmentExpression value) {
        this.resourceAssignmentExpression = value;
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
