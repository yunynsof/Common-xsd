//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.common.bpmn.semantic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Clase Java para tBaseElement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tBaseElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}documentation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}extensionElements" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBaseElement", propOrder = {
    "documentation",
    "extensionElements"
})
@XmlSeeAlso({
    TOperation.class,
    TCorrelationSubscription.class,
    TResourceAssignmentExpression.class,
    TMonitoring.class,
    TParticipant.class,
    TParticipantMultiplicity.class,
    TInputSet.class,
    TOutputSet.class,
    TRelationship.class,
    TAssignment.class,
    TMessageFlow.class,
    TInputOutputBinding.class,
    TResourceParameter.class,
    TProperty.class,
    TDataInput.class,
    TComplexBehaviorDefinition.class,
    TMessageFlowAssociation.class,
    TConversationLink.class,
    TParticipantAssociation.class,
    TDataAssociation.class,
    TCategoryValue.class,
    TLoopCharacteristics.class,
    TCorrelationPropertyBinding.class,
    TResourceRole.class,
    TConversationNode.class,
    TLane.class,
    TCorrelationPropertyRetrievalExpression.class,
    TDataState.class,
    TLaneSet.class,
    TConversationAssociation.class,
    TInputOutputSpecification.class,
    TCorrelationKey.class,
    TResourceParameterBinding.class,
    TRendering.class,
    TFlowElement.class,
    TRootElement.class,
    TAuditing.class,
    TArtifact.class,
    TDataOutput.class
})
public abstract class TBaseElement {

    protected List<TDocumentation> documentation;
    protected TExtensionElements extensionElements;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the documentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDocumentation }
     * 
     * 
     */
    public List<TDocumentation> getDocumentation() {
        if (documentation == null) {
            documentation = new ArrayList<TDocumentation>();
        }
        return this.documentation;
    }

    /**
     * Obtiene el valor de la propiedad extensionElements.
     * 
     * @return
     *     possible object is
     *     {@link TExtensionElements }
     *     
     */
    public TExtensionElements getExtensionElements() {
        return extensionElements;
    }

    /**
     * Define el valor de la propiedad extensionElements.
     * 
     * @param value
     *     allowed object is
     *     {@link TExtensionElements }
     *     
     */
    public void setExtensionElements(TExtensionElements value) {
        this.extensionElements = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
