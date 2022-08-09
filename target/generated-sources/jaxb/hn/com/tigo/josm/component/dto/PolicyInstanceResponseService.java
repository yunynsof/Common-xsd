//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para policyInstanceResponseService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="policyInstanceResponseService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyInstanceDetails" type="{http://tigo.com.hn/component/policyInstancePageResponse/V1}policyInstanceDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyInstanceResponseService", namespace = "http://tigo.com.hn/component/policyInstancePageResponse/V1", propOrder = {
    "policyInstanceDetails"
})
public class PolicyInstanceResponseService
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<PolicyInstanceDetail> policyInstanceDetails;

    /**
     * Gets the value of the policyInstanceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyInstanceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyInstanceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyInstanceDetail }
     * 
     * 
     */
    public List<PolicyInstanceDetail> getPolicyInstanceDetails() {
        if (policyInstanceDetails == null) {
            policyInstanceDetails = new ArrayList<PolicyInstanceDetail>();
        }
        return this.policyInstanceDetails;
    }

    public boolean isSetPolicyInstanceDetails() {
        return ((this.policyInstanceDetails!= null)&&(!this.policyInstanceDetails.isEmpty()));
    }

    public void unsetPolicyInstanceDetails() {
        this.policyInstanceDetails = null;
    }

}
