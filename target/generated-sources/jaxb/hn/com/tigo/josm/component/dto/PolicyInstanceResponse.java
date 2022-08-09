//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para policyInstanceResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="policyInstanceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/order/JOSMResponse/V1}JOSMResponse">
 *       &lt;sequence>
 *         &lt;element name="policieInstances" type="{http://tigo.com.hn/component/policyInstancePageResponse/V1}policyInstanceResponseService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyInstanceResponse", namespace = "http://tigo.com.hn/component/policyInstancePageResponse/V1", propOrder = {
    "policieInstances"
})
public class PolicyInstanceResponse
    extends JOSMResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PolicyInstanceResponseService policieInstances;

    /**
     * Obtiene el valor de la propiedad policieInstances.
     * 
     * @return
     *     possible object is
     *     {@link PolicyInstanceResponseService }
     *     
     */
    public PolicyInstanceResponseService getPolicieInstances() {
        return policieInstances;
    }

    /**
     * Define el valor de la propiedad policieInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyInstanceResponseService }
     *     
     */
    public void setPolicieInstances(PolicyInstanceResponseService value) {
        this.policieInstances = value;
    }

    public boolean isSetPolicieInstances() {
        return (this.policieInstances!= null);
    }

}
