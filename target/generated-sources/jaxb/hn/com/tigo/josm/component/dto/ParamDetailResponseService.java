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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramDetailResponseService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramDetailResponseService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramDetails" type="{http://tigo.com.hn/component/paramPagedResponse/V1}paramDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramDetailResponseService", namespace = "http://tigo.com.hn/component/paramPagedResponse/V1", propOrder = {
    "paramDetails"
})
public class ParamDetailResponseService
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<ParamDetail> paramDetails;

    /**
     * Gets the value of the paramDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamDetail }
     * 
     * 
     */
    public List<ParamDetail> getParamDetails() {
        if (paramDetails == null) {
            paramDetails = new ArrayList<ParamDetail>();
        }
        return this.paramDetails;
    }

    public boolean isSetParamDetails() {
        return ((this.paramDetails!= null)&&(!this.paramDetails.isEmpty()));
    }

    public void unsetParamDetails() {
        this.paramDetails = null;
    }

}
