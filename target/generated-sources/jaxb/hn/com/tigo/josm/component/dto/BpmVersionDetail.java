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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bpmVersionDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bpmVersionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bpmId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bpmVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bpmXml" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bpmName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bpmVersionDetail", namespace = "http://tigo.com.hn/component/BpmVersionResponse/V1", propOrder = {
    "bpmId",
    "bpmVersion",
    "bpmXml",
    "bpmName"
})
public class BpmVersionDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long bpmId;
    @XmlElement(required = true)
    protected String bpmVersion;
    @XmlElement(required = true)
    protected String bpmXml;
    @XmlElement(required = true)
    protected String bpmName;

    /**
     * Obtiene el valor de la propiedad bpmId.
     * 
     */
    public long getBpmId() {
        return bpmId;
    }

    /**
     * Define el valor de la propiedad bpmId.
     * 
     */
    public void setBpmId(long value) {
        this.bpmId = value;
    }

    public boolean isSetBpmId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad bpmVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmVersion() {
        return bpmVersion;
    }

    /**
     * Define el valor de la propiedad bpmVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmVersion(String value) {
        this.bpmVersion = value;
    }

    public boolean isSetBpmVersion() {
        return (this.bpmVersion!= null);
    }

    /**
     * Obtiene el valor de la propiedad bpmXml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmXml() {
        return bpmXml;
    }

    /**
     * Define el valor de la propiedad bpmXml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmXml(String value) {
        this.bpmXml = value;
    }

    public boolean isSetBpmXml() {
        return (this.bpmXml!= null);
    }

    /**
     * Obtiene el valor de la propiedad bpmName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmName() {
        return bpmName;
    }

    /**
     * Define el valor de la propiedad bpmName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmName(String value) {
        this.bpmName = value;
    }

    public boolean isSetBpmName() {
        return (this.bpmName!= null);
    }

}
