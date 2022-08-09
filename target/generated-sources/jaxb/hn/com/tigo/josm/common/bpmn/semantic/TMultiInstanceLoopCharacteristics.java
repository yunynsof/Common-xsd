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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Clase Java para tMultiInstanceLoopCharacteristics complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tMultiInstanceLoopCharacteristics">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tLoopCharacteristics">
 *       &lt;sequence>
 *         &lt;element name="loopCardinality" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/>
 *         &lt;element name="loopDataInputRef" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/>
 *         &lt;element name="loopDataOutputRef" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/>
 *         &lt;element name="inputDataItem" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tDataInput" minOccurs="0"/>
 *         &lt;element name="outputDataItem" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tDataOutput" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}complexBehaviorDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="completionCondition" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isSequential" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="behavior" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tMultiInstanceFlowCondition" default="All" />
 *       &lt;attribute name="oneBehaviorEventRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="noneBehaviorEventRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMultiInstanceLoopCharacteristics", propOrder = {
    "loopCardinality",
    "loopDataInputRef",
    "loopDataOutputRef",
    "inputDataItem",
    "outputDataItem",
    "complexBehaviorDefinition",
    "completionCondition"
})
public class TMultiInstanceLoopCharacteristics
    extends TLoopCharacteristics
{

    protected TExpression loopCardinality;
    protected QName loopDataInputRef;
    protected QName loopDataOutputRef;
    protected TDataInput inputDataItem;
    protected TDataOutput outputDataItem;
    protected List<TComplexBehaviorDefinition> complexBehaviorDefinition;
    protected TExpression completionCondition;
    @XmlAttribute(name = "isSequential")
    protected Boolean isSequential;
    @XmlAttribute(name = "behavior")
    protected TMultiInstanceFlowCondition behavior;
    @XmlAttribute(name = "oneBehaviorEventRef")
    protected QName oneBehaviorEventRef;
    @XmlAttribute(name = "noneBehaviorEventRef")
    protected QName noneBehaviorEventRef;

    /**
     * Obtiene el valor de la propiedad loopCardinality.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getLoopCardinality() {
        return loopCardinality;
    }

    /**
     * Define el valor de la propiedad loopCardinality.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setLoopCardinality(TExpression value) {
        this.loopCardinality = value;
    }

    /**
     * Obtiene el valor de la propiedad loopDataInputRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getLoopDataInputRef() {
        return loopDataInputRef;
    }

    /**
     * Define el valor de la propiedad loopDataInputRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setLoopDataInputRef(QName value) {
        this.loopDataInputRef = value;
    }

    /**
     * Obtiene el valor de la propiedad loopDataOutputRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getLoopDataOutputRef() {
        return loopDataOutputRef;
    }

    /**
     * Define el valor de la propiedad loopDataOutputRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setLoopDataOutputRef(QName value) {
        this.loopDataOutputRef = value;
    }

    /**
     * Obtiene el valor de la propiedad inputDataItem.
     * 
     * @return
     *     possible object is
     *     {@link TDataInput }
     *     
     */
    public TDataInput getInputDataItem() {
        return inputDataItem;
    }

    /**
     * Define el valor de la propiedad inputDataItem.
     * 
     * @param value
     *     allowed object is
     *     {@link TDataInput }
     *     
     */
    public void setInputDataItem(TDataInput value) {
        this.inputDataItem = value;
    }

    /**
     * Obtiene el valor de la propiedad outputDataItem.
     * 
     * @return
     *     possible object is
     *     {@link TDataOutput }
     *     
     */
    public TDataOutput getOutputDataItem() {
        return outputDataItem;
    }

    /**
     * Define el valor de la propiedad outputDataItem.
     * 
     * @param value
     *     allowed object is
     *     {@link TDataOutput }
     *     
     */
    public void setOutputDataItem(TDataOutput value) {
        this.outputDataItem = value;
    }

    /**
     * Gets the value of the complexBehaviorDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complexBehaviorDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplexBehaviorDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TComplexBehaviorDefinition }
     * 
     * 
     */
    public List<TComplexBehaviorDefinition> getComplexBehaviorDefinition() {
        if (complexBehaviorDefinition == null) {
            complexBehaviorDefinition = new ArrayList<TComplexBehaviorDefinition>();
        }
        return this.complexBehaviorDefinition;
    }

    /**
     * Obtiene el valor de la propiedad completionCondition.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getCompletionCondition() {
        return completionCondition;
    }

    /**
     * Define el valor de la propiedad completionCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setCompletionCondition(TExpression value) {
        this.completionCondition = value;
    }

    /**
     * Obtiene el valor de la propiedad isSequential.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsSequential() {
        if (isSequential == null) {
            return false;
        } else {
            return isSequential;
        }
    }

    /**
     * Define el valor de la propiedad isSequential.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSequential(Boolean value) {
        this.isSequential = value;
    }

    /**
     * Obtiene el valor de la propiedad behavior.
     * 
     * @return
     *     possible object is
     *     {@link TMultiInstanceFlowCondition }
     *     
     */
    public TMultiInstanceFlowCondition getBehavior() {
        if (behavior == null) {
            return TMultiInstanceFlowCondition.ALL;
        } else {
            return behavior;
        }
    }

    /**
     * Define el valor de la propiedad behavior.
     * 
     * @param value
     *     allowed object is
     *     {@link TMultiInstanceFlowCondition }
     *     
     */
    public void setBehavior(TMultiInstanceFlowCondition value) {
        this.behavior = value;
    }

    /**
     * Obtiene el valor de la propiedad oneBehaviorEventRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getOneBehaviorEventRef() {
        return oneBehaviorEventRef;
    }

    /**
     * Define el valor de la propiedad oneBehaviorEventRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setOneBehaviorEventRef(QName value) {
        this.oneBehaviorEventRef = value;
    }

    /**
     * Obtiene el valor de la propiedad noneBehaviorEventRef.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getNoneBehaviorEventRef() {
        return noneBehaviorEventRef;
    }

    /**
     * Define el valor de la propiedad noneBehaviorEventRef.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setNoneBehaviorEventRef(QName value) {
        this.noneBehaviorEventRef = value;
    }

}
