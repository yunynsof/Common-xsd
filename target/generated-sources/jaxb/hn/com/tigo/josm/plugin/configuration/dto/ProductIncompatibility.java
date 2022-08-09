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
 * <p>Clase Java para ProductIncompatibility complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProductIncompatibility">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tigo.com.hn/pluginconfiguration/V1}ConfigurationType">
 *       &lt;sequence>
 *         &lt;element name="selfIncompatibility" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="targetProduct" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIncompatibility", namespace = "http://www.tigo.com.hn/policy/productincompatibility/V1", propOrder = {
    "selfIncompatibility",
    "targetProduct"
})
public class ProductIncompatibility
    extends ConfigurationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected boolean selfIncompatibility;
    @XmlElement(type = Long.class)
    protected List<Long> targetProduct;

    /**
     * Obtiene el valor de la propiedad selfIncompatibility.
     * 
     */
    public boolean isSelfIncompatibility() {
        return selfIncompatibility;
    }

    /**
     * Define el valor de la propiedad selfIncompatibility.
     * 
     */
    public void setSelfIncompatibility(boolean value) {
        this.selfIncompatibility = value;
    }

    public boolean isSetSelfIncompatibility() {
        return true;
    }

    /**
     * Gets the value of the targetProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTargetProduct() {
        if (targetProduct == null) {
            targetProduct = new ArrayList<Long>();
        }
        return this.targetProduct;
    }

    public boolean isSetTargetProduct() {
        return ((this.targetProduct!= null)&&(!this.targetProduct.isEmpty()));
    }

    public void unsetTargetProduct() {
        this.targetProduct = null;
    }

}
