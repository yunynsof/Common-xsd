//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:08 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IntrawayPublicIPAdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IntrawayPublicIPAdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="sAuthKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCompanyCrmId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sSaleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iTemporary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntrawayPublicIPAdapterConfigType", namespace = "http://tigo.com.hn/IntrawayPublicIPAdapterConfigType/V1", propOrder = {
    "sAuthKey",
    "sCompanyCrmId",
    "sServiceId",
    "sSaleId",
    "iTemporary"
})
public class IntrawayPublicIPAdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String sAuthKey;
    @XmlElement(required = true)
    protected String sCompanyCrmId;
    @XmlElement(required = true)
    protected String sServiceId;
    @XmlElement(required = true)
    protected String sSaleId;
    @XmlElement(required = true)
    protected String iTemporary;

    /**
     * Obtiene el valor de la propiedad sAuthKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAuthKey() {
        return sAuthKey;
    }

    /**
     * Define el valor de la propiedad sAuthKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAuthKey(String value) {
        this.sAuthKey = value;
    }

    public boolean isSetSAuthKey() {
        return (this.sAuthKey!= null);
    }

    /**
     * Obtiene el valor de la propiedad sCompanyCrmId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCompanyCrmId() {
        return sCompanyCrmId;
    }

    /**
     * Define el valor de la propiedad sCompanyCrmId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCompanyCrmId(String value) {
        this.sCompanyCrmId = value;
    }

    public boolean isSetSCompanyCrmId() {
        return (this.sCompanyCrmId!= null);
    }

    /**
     * Obtiene el valor de la propiedad sServiceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSServiceId() {
        return sServiceId;
    }

    /**
     * Define el valor de la propiedad sServiceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSServiceId(String value) {
        this.sServiceId = value;
    }

    public boolean isSetSServiceId() {
        return (this.sServiceId!= null);
    }

    /**
     * Obtiene el valor de la propiedad sSaleId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSaleId() {
        return sSaleId;
    }

    /**
     * Define el valor de la propiedad sSaleId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSaleId(String value) {
        this.sSaleId = value;
    }

    public boolean isSetSSaleId() {
        return (this.sSaleId!= null);
    }

    /**
     * Obtiene el valor de la propiedad iTemporary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITemporary() {
        return iTemporary;
    }

    /**
     * Define el valor de la propiedad iTemporary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITemporary(String value) {
        this.iTemporary = value;
    }

    public boolean isSetITemporary() {
        return (this.iTemporary!= null);
    }

}
