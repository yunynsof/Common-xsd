//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:07 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ZeroBalancePlatformAdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ZeroBalancePlatformAdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="total_nodes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroBalancePlatformAdapterConfigType", namespace = "http://tigo.com.hn/ZeroBalancePlatformAdapterConfig/V1", propOrder = {
    "totalNodes",
    "nodes"
})
public class ZeroBalancePlatformAdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "total_nodes", required = true)
    protected String totalNodes;
    @XmlElement(required = true)
    protected String nodes;

    /**
     * Obtiene el valor de la propiedad totalNodes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNodes() {
        return totalNodes;
    }

    /**
     * Define el valor de la propiedad totalNodes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNodes(String value) {
        this.totalNodes = value;
    }

    public boolean isSetTotalNodes() {
        return (this.totalNodes!= null);
    }

    /**
     * Obtiene el valor de la propiedad nodes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodes() {
        return nodes;
    }

    /**
     * Define el valor de la propiedad nodes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodes(String value) {
        this.nodes = value;
    }

    public boolean isSetNodes() {
        return (this.nodes!= null);
    }

}
