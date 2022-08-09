//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.plugin.configuration.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AllowedChannel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AllowedChannel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tigo.com.hn/pluginconfiguration/V1}ConfigurationType">
 *       &lt;sequence>
 *         &lt;element name="ProductChannels" type="{http://www.tigo.com.hn/policy/channel/V1}ProductChannels" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowedChannel", namespace = "http://www.tigo.com.hn/policy/channel/V1", propOrder = {
    "productChannels"
})
public class AllowedChannel
    extends ConfigurationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProductChannels", required = true)
    protected List<ProductChannels> productChannels;

    /**
     * Gets the value of the productChannels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productChannels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductChannels }
     * 
     * 
     */
    public List<ProductChannels> getProductChannels() {
        if (productChannels == null) {
            productChannels = new ArrayList<ProductChannels>();
        }
        return this.productChannels;
    }

    public boolean isSetProductChannels() {
        return ((this.productChannels!= null)&&(!this.productChannels.isEmpty()));
    }

    public void unsetProductChannels() {
        this.productChannels = null;
    }

}
