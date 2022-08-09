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
 * <p>Clase Java para BpmVersionDraftDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BpmVersionDraftDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bpmDraftId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bpmId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bpmXml" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bpmEditType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "BpmVersionDraftDetail", propOrder = {
    "bpmDraftId",
    "bpmId",
    "bpmXml",
    "bpmEditType",
    "bpmName"
})
public class BpmVersionDraftDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long bpmDraftId;
    @XmlElement(required = true)
    protected String bpmId;
    @XmlElement(required = true)
    protected String bpmXml;
    @XmlElement(required = true)
    protected String bpmEditType;
    @XmlElement(required = true)
    protected String bpmName;

    /**
     * Obtiene el valor de la propiedad bpmDraftId.
     * 
     */
    public long getBpmDraftId() {
        return bpmDraftId;
    }

    /**
     * Define el valor de la propiedad bpmDraftId.
     * 
     */
    public void setBpmDraftId(long value) {
        this.bpmDraftId = value;
    }

    public boolean isSetBpmDraftId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad bpmId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmId() {
        return bpmId;
    }

    /**
     * Define el valor de la propiedad bpmId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmId(String value) {
        this.bpmId = value;
    }

    public boolean isSetBpmId() {
        return (this.bpmId!= null);
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
     * Obtiene el valor de la propiedad bpmEditType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmEditType() {
        return bpmEditType;
    }

    /**
     * Define el valor de la propiedad bpmEditType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmEditType(String value) {
        this.bpmEditType = value;
    }

    public boolean isSetBpmEditType() {
        return (this.bpmEditType!= null);
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
