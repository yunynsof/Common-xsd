//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productBpmVersionDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productBpmVersionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProductBpmVersion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idProductFamily" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameProductFamily" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idBpmVersion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nameBpmVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bpmState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bpmVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productBpmVersionDetail", namespace = "http://tigo.com.hn/component/productBpmVersionPagedResponse/V1", propOrder = {
    "idProductBpmVersion",
    "idProductFamily",
    "nameProductFamily",
    "idBpmVersion",
    "nameBpmVersion",
    "bpmState",
    "orderType",
    "bpmVersionNumber"
})
public class ProductBpmVersionDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idProductBpmVersion;
    protected long idProductFamily;
    @XmlElement(required = true)
    protected String nameProductFamily;
    protected long idBpmVersion;
    @XmlElement(required = true)
    protected String nameBpmVersion;
    @XmlElement(required = true)
    protected String bpmState;
    @XmlElement(required = true)
    protected String orderType;
    @XmlElement(required = true)
    protected String bpmVersionNumber;

    /**
     * Obtiene el valor de la propiedad idProductBpmVersion.
     * 
     */
    public long getIdProductBpmVersion() {
        return idProductBpmVersion;
    }

    /**
     * Define el valor de la propiedad idProductBpmVersion.
     * 
     */
    public void setIdProductBpmVersion(long value) {
        this.idProductBpmVersion = value;
    }

    public boolean isSetIdProductBpmVersion() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad idProductFamily.
     * 
     */
    public long getIdProductFamily() {
        return idProductFamily;
    }

    /**
     * Define el valor de la propiedad idProductFamily.
     * 
     */
    public void setIdProductFamily(long value) {
        this.idProductFamily = value;
    }

    public boolean isSetIdProductFamily() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad nameProductFamily.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameProductFamily() {
        return nameProductFamily;
    }

    /**
     * Define el valor de la propiedad nameProductFamily.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameProductFamily(String value) {
        this.nameProductFamily = value;
    }

    public boolean isSetNameProductFamily() {
        return (this.nameProductFamily!= null);
    }

    /**
     * Obtiene el valor de la propiedad idBpmVersion.
     * 
     */
    public long getIdBpmVersion() {
        return idBpmVersion;
    }

    /**
     * Define el valor de la propiedad idBpmVersion.
     * 
     */
    public void setIdBpmVersion(long value) {
        this.idBpmVersion = value;
    }

    public boolean isSetIdBpmVersion() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad nameBpmVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameBpmVersion() {
        return nameBpmVersion;
    }

    /**
     * Define el valor de la propiedad nameBpmVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameBpmVersion(String value) {
        this.nameBpmVersion = value;
    }

    public boolean isSetNameBpmVersion() {
        return (this.nameBpmVersion!= null);
    }

    /**
     * Obtiene el valor de la propiedad bpmState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmState() {
        return bpmState;
    }

    /**
     * Define el valor de la propiedad bpmState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmState(String value) {
        this.bpmState = value;
    }

    public boolean isSetBpmState() {
        return (this.bpmState!= null);
    }

    /**
     * Obtiene el valor de la propiedad orderType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Define el valor de la propiedad orderType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    public boolean isSetOrderType() {
        return (this.orderType!= null);
    }

    /**
     * Obtiene el valor de la propiedad bpmVersionNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmVersionNumber() {
        return bpmVersionNumber;
    }

    /**
     * Define el valor de la propiedad bpmVersionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmVersionNumber(String value) {
        this.bpmVersionNumber = value;
    }

    public boolean isSetBpmVersionNumber() {
        return (this.bpmVersionNumber!= null);
    }

}
