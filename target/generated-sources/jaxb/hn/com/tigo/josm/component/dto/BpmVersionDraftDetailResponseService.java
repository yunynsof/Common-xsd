//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BpmVersionDraftDetailResponseService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BpmVersionDraftDetailResponseService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BpmVersionDraftDetails" type="{http://tigo.com.hn/component/BpmVersionDraftResponse/V1}BpmVersionDraftDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BpmVersionDraftDetailResponseService", propOrder = {
    "bpmVersionDraftDetails"
})
public class BpmVersionDraftDetailResponseService
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BpmVersionDraftDetails")
    protected List<BpmVersionDraftDetail> bpmVersionDraftDetails;

    /**
     * Gets the value of the bpmVersionDraftDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bpmVersionDraftDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBpmVersionDraftDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BpmVersionDraftDetail }
     * 
     * 
     */
    public List<BpmVersionDraftDetail> getBpmVersionDraftDetails() {
        if (bpmVersionDraftDetails == null) {
            bpmVersionDraftDetails = new ArrayList<BpmVersionDraftDetail>();
        }
        return this.bpmVersionDraftDetails;
    }

    public boolean isSetBpmVersionDraftDetails() {
        return ((this.bpmVersionDraftDetails!= null)&&(!this.bpmVersionDraftDetails.isEmpty()));
    }

    public void unsetBpmVersionDraftDetails() {
        this.bpmVersionDraftDetails = null;
    }

}
