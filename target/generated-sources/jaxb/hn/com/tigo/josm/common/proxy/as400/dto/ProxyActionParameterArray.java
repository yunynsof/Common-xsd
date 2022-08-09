//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.common.proxy.as400.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para proxyActionParameterArray complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="proxyActionParameterArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proxyActionParameterList" type="{http://tigo.com.hn/ProxyActions/V1}ProxyActionParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proxyActionParameterArray", namespace = "http://tigo.com.hn/ProxyActions/V1", propOrder = {
    "proxyActionParameterList"
})
public class ProxyActionParameterArray
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<ProxyActionParameterType> proxyActionParameterList;

    /**
     * Gets the value of the proxyActionParameterList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proxyActionParameterList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProxyActionParameterList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProxyActionParameterType }
     * 
     * 
     */
    public List<ProxyActionParameterType> getProxyActionParameterList() {
        if (proxyActionParameterList == null) {
            proxyActionParameterList = new ArrayList<ProxyActionParameterType>();
        }
        return this.proxyActionParameterList;
    }

    public boolean isSetProxyActionParameterList() {
        return ((this.proxyActionParameterList!= null)&&(!this.proxyActionParameterList.isEmpty()));
    }

    public void unsetProxyActionParameterList() {
        this.proxyActionParameterList = null;
    }

}
