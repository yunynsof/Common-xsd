//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
//


package hn.com.tigo.josm.common.bpmn.semantic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tChoreography complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tChoreography">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tCollaboration">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}flowElement" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tChoreography", propOrder = {
    "flowElement"
})
@XmlSeeAlso({
    TGlobalChoreographyTask.class
})
public class TChoreography
    extends TCollaboration
{

    @XmlElementRef(name = "flowElement", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TFlowElement>> flowElement;

    /**
     * Gets the value of the flowElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flowElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TFlowElement }{@code >}
     * {@link JAXBElement }{@code <}{@link TBoundaryEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TScriptTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TInclusiveGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TIntermediateThrowEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TSubChoreography }{@code >}
     * {@link JAXBElement }{@code <}{@link TIntermediateCatchEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TSendTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TDataStoreReference }{@code >}
     * {@link JAXBElement }{@code <}{@link TComplexGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TImplicitThrowEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TEndEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TReceiveTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TParallelGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TManualTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TDataObject }{@code >}
     * {@link JAXBElement }{@code <}{@link TCallActivity }{@code >}
     * {@link JAXBElement }{@code <}{@link TTransaction }{@code >}
     * {@link JAXBElement }{@code <}{@link TCallChoreography }{@code >}
     * {@link JAXBElement }{@code <}{@link TChoreographyTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TSubProcess }{@code >}
     * {@link JAXBElement }{@code <}{@link TSequenceFlow }{@code >}
     * {@link JAXBElement }{@code <}{@link TEventBasedGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TBusinessRuleTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TAdHocSubProcess }{@code >}
     * {@link JAXBElement }{@code <}{@link TDataObjectReference }{@code >}
     * {@link JAXBElement }{@code <}{@link TUserTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TExclusiveGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TServiceTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TStartEvent }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TFlowElement>> getFlowElement() {
        if (flowElement == null) {
            flowElement = new ArrayList<JAXBElement<? extends TFlowElement>>();
        }
        return this.flowElement;
    }

}
