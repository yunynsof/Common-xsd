//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:10 PM CST 
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
 * <p>Clase Java para dataTransferCheckList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dataTransferCheckList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModuleDetails" type="{http://tigo.com.hn/component/DataTransferCheckResponse/V1}dataTransferCheckDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataTransferCheckList", namespace = "http://tigo.com.hn/component/DataTransferCheckResponse/V1", propOrder = {
    "moduleDetails"
})
public class DataTransferCheckList
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ModuleDetails")
    protected List<DataTransferCheckDetail> moduleDetails;

    /**
     * Gets the value of the moduleDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moduleDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModuleDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataTransferCheckDetail }
     * 
     * 
     */
    public List<DataTransferCheckDetail> getModuleDetails() {
        if (moduleDetails == null) {
            moduleDetails = new ArrayList<DataTransferCheckDetail>();
        }
        return this.moduleDetails;
    }

    public boolean isSetModuleDetails() {
        return ((this.moduleDetails!= null)&&(!this.moduleDetails.isEmpty()));
    }

    public void unsetModuleDetails() {
        this.moduleDetails = null;
    }

}
