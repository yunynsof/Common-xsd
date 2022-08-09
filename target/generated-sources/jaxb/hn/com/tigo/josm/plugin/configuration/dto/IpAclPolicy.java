//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.plugin.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IpAclPolicy complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IpAclPolicy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tigo.com.hn/pluginconfiguration/V1}ConfigurationType">
 *       &lt;sequence>
 *         &lt;element name="ipAcl" type="{http://www.tigo.com.hn/policy/ipAcl/V1}IpAcl"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpAclPolicy", namespace = "http://www.tigo.com.hn/policy/ipAcl/V1", propOrder = {
    "ipAcl"
})
public class IpAclPolicy
    extends ConfigurationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected IpAcl ipAcl;

    /**
     * Obtiene el valor de la propiedad ipAcl.
     * 
     * @return
     *     possible object is
     *     {@link IpAcl }
     *     
     */
    public IpAcl getIpAcl() {
        return ipAcl;
    }

    /**
     * Define el valor de la propiedad ipAcl.
     * 
     * @param value
     *     allowed object is
     *     {@link IpAcl }
     *     
     */
    public void setIpAcl(IpAcl value) {
        this.ipAcl = value;
    }

    public boolean isSetIpAcl() {
        return (this.ipAcl!= null);
    }

}
