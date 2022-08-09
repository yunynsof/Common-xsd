//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:30 AM CST 
//


package hn.com.tigo.josm.common.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MetaParameters complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MetaParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameterMeta" type="{http://tigo.com/josm/gateway/services/order/MetaParametersDTO/V1}ParameterMeta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaParameters", propOrder = {
    "parameterMeta"
})
public class MetaParameters
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(nillable = true)
    protected List<ParameterMeta> parameterMeta;

    /**
     * Gets the value of the parameterMeta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterMeta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterMeta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterMeta }
     * 
     * 
     */
    public List<ParameterMeta> getParameterMeta() {
        if (parameterMeta == null) {
            parameterMeta = new ArrayList<ParameterMeta>();
        }
        return this.parameterMeta;
    }

    public boolean isSetParameterMeta() {
        return ((this.parameterMeta!= null)&&(!this.parameterMeta.isEmpty()));
    }

    public void unsetParameterMeta() {
        this.parameterMeta = null;
    }

}
