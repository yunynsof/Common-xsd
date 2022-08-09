//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:08 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PlatformRegexList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PlatformRegexList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="platformRegexListDetail" type="{http://tigo.com.hn/PlatformMappingConfigType/V1}PlatformRegexListDetail" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlatformRegexList", propOrder = {
    "platformRegexListDetail"
})
public class PlatformRegexList
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected List<PlatformRegexListDetail> platformRegexListDetail;

    /**
     * Gets the value of the platformRegexListDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the platformRegexListDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlatformRegexListDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlatformRegexListDetail }
     * 
     * 
     */
    public List<PlatformRegexListDetail> getPlatformRegexListDetail() {
        if (platformRegexListDetail == null) {
            platformRegexListDetail = new ArrayList<PlatformRegexListDetail>();
        }
        return this.platformRegexListDetail;
    }

    public boolean isSetPlatformRegexListDetail() {
        return ((this.platformRegexListDetail!= null)&&(!this.platformRegexListDetail.isEmpty()));
    }

    public void unsetPlatformRegexListDetail() {
        this.platformRegexListDetail = null;
    }

}
