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
 * <p>Clase Java para MasterStatusAdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MasterStatusAdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="changeSubscriberIdProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="changeSubscriberIdAttribute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subscriberProfileNumberRecord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterStatusAdapterConfigType", namespace = "http://tigo.com.hn/MasterStatusAdapterConfigType/V1", propOrder = {
    "changeSubscriberIdProfile",
    "changeSubscriberIdAttribute",
    "subscriberProfileNumberRecord"
})
public class MasterStatusAdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String changeSubscriberIdProfile;
    @XmlElement(required = true)
    protected String changeSubscriberIdAttribute;
    protected int subscriberProfileNumberRecord;

    /**
     * Obtiene el valor de la propiedad changeSubscriberIdProfile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeSubscriberIdProfile() {
        return changeSubscriberIdProfile;
    }

    /**
     * Define el valor de la propiedad changeSubscriberIdProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeSubscriberIdProfile(String value) {
        this.changeSubscriberIdProfile = value;
    }

    public boolean isSetChangeSubscriberIdProfile() {
        return (this.changeSubscriberIdProfile!= null);
    }

    /**
     * Obtiene el valor de la propiedad changeSubscriberIdAttribute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeSubscriberIdAttribute() {
        return changeSubscriberIdAttribute;
    }

    /**
     * Define el valor de la propiedad changeSubscriberIdAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeSubscriberIdAttribute(String value) {
        this.changeSubscriberIdAttribute = value;
    }

    public boolean isSetChangeSubscriberIdAttribute() {
        return (this.changeSubscriberIdAttribute!= null);
    }

    /**
     * Obtiene el valor de la propiedad subscriberProfileNumberRecord.
     * 
     */
    public int getSubscriberProfileNumberRecord() {
        return subscriberProfileNumberRecord;
    }

    /**
     * Define el valor de la propiedad subscriberProfileNumberRecord.
     * 
     */
    public void setSubscriberProfileNumberRecord(int value) {
        this.subscriberProfileNumberRecord = value;
    }

    public boolean isSetSubscriberProfileNumberRecord() {
        return true;
    }

}
