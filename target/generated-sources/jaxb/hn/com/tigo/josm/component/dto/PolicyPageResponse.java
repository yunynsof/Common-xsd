//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para policyPageResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="policyPageResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/order/JOSMResponse/V1}JOSMResponse">
 *       &lt;sequence>
 *         &lt;element name="policies" type="{http://tigo.com.hn/component/policyPageResponse/V1}policyDetailResponseService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyPageResponse", namespace = "http://tigo.com.hn/component/policyPageResponse/V1", propOrder = {
    "policies"
})
public class PolicyPageResponse
    extends JOSMResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PolicyDetailResponseService policies;

    /**
     * Obtiene el valor de la propiedad policies.
     * 
     * @return
     *     possible object is
     *     {@link PolicyDetailResponseService }
     *     
     */
    public PolicyDetailResponseService getPolicies() {
        return policies;
    }

    /**
     * Define el valor de la propiedad policies.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyDetailResponseService }
     *     
     */
    public void setPolicies(PolicyDetailResponseService value) {
        this.policies = value;
    }

    public boolean isSetPolicies() {
        return (this.policies!= null);
    }

}
