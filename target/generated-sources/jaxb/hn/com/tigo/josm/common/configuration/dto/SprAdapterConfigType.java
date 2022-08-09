//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
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
 * <p>Clase Java para SprAdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SprAdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="connectionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="restUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fields" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="sprSubscriberType" type="{http://tigo.com.hn/SprAdapterConfig/V1}SprSubscriberType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SprAdapterConfigType", namespace = "http://tigo.com.hn/SprAdapterConfig/V1", propOrder = {
    "dataSource",
    "connectionType",
    "restUrl",
    "fields",
    "errorCodes",
    "sprSubscriberType"
})
public class SprAdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String dataSource;
    @XmlElement(required = true)
    protected String connectionType;
    @XmlElement(required = true)
    protected String restUrl;
    @XmlElement(required = true)
    protected String fields;
    @XmlElement(required = true)
    protected List<String> errorCodes;
    @XmlElement(nillable = true)
    protected List<SprSubscriberType> sprSubscriberType;

    /**
     * Obtiene el valor de la propiedad dataSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Define el valor de la propiedad dataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    public boolean isSetDataSource() {
        return (this.dataSource!= null);
    }

    /**
     * Obtiene el valor de la propiedad connectionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * Define el valor de la propiedad connectionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionType(String value) {
        this.connectionType = value;
    }

    public boolean isSetConnectionType() {
        return (this.connectionType!= null);
    }

    /**
     * Obtiene el valor de la propiedad restUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestUrl() {
        return restUrl;
    }

    /**
     * Define el valor de la propiedad restUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestUrl(String value) {
        this.restUrl = value;
    }

    public boolean isSetRestUrl() {
        return (this.restUrl!= null);
    }

    /**
     * Obtiene el valor de la propiedad fields.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFields() {
        return fields;
    }

    /**
     * Define el valor de la propiedad fields.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFields(String value) {
        this.fields = value;
    }

    public boolean isSetFields() {
        return (this.fields!= null);
    }

    /**
     * Gets the value of the errorCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorCodes() {
        if (errorCodes == null) {
            errorCodes = new ArrayList<String>();
        }
        return this.errorCodes;
    }

    public boolean isSetErrorCodes() {
        return ((this.errorCodes!= null)&&(!this.errorCodes.isEmpty()));
    }

    public void unsetErrorCodes() {
        this.errorCodes = null;
    }

    /**
     * Gets the value of the sprSubscriberType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sprSubscriberType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSprSubscriberType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SprSubscriberType }
     * 
     * 
     */
    public List<SprSubscriberType> getSprSubscriberType() {
        if (sprSubscriberType == null) {
            sprSubscriberType = new ArrayList<SprSubscriberType>();
        }
        return this.sprSubscriberType;
    }

    public boolean isSetSprSubscriberType() {
        return ((this.sprSubscriberType!= null)&&(!this.sprSubscriberType.isEmpty()));
    }

    public void unsetSprSubscriberType() {
        this.sprSubscriberType = null;
    }

}
