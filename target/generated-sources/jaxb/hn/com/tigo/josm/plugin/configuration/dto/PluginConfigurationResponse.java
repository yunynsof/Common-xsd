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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://tigo.com.hn/pluginconfiguration/V1}configuration" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="configurationType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "configuration"
})
@XmlRootElement(name = "pluginConfigurationResponse", namespace = "http://tigo.com.hn/pluginconfiguration/V1")
public class PluginConfigurationResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "configuration", namespace = "http://tigo.com.hn/pluginconfiguration/V1", type = JAXBElement.class)
    protected List<JAXBElement<? extends ConfigurationType>> configuration;
    @XmlAttribute(name = "configurationType", required = true)
    protected String configurationType;

    /**
     * Gets the value of the configuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TransactionLimit }{@code >}
     * {@link JAXBElement }{@code <}{@link AllowedStype }{@code >}
     * {@link JAXBElement }{@code <}{@link TransactionAmount }{@code >}
     * {@link JAXBElement }{@code <}{@link AllowedChannel }{@code >}
     * {@link JAXBElement }{@code <}{@link CalendarPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link AllowedMaster }{@code >}
     * {@link JAXBElement }{@code <}{@link SubscriberACLPolicyConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link AllowedCos }{@code >}
     * {@link JAXBElement }{@code <}{@link SubscriberNumberPolicyConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link ConfigurationType }{@code >}
     * {@link JAXBElement }{@code <}{@link IpAclConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link ProductIncompatibility }{@code >}
     * {@link JAXBElement }{@code <}{@link DosPolicyConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link IpAclPolicy }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ConfigurationType>> getConfiguration() {
        if (configuration == null) {
            configuration = new ArrayList<JAXBElement<? extends ConfigurationType>>();
        }
        return this.configuration;
    }

    public boolean isSetConfiguration() {
        return ((this.configuration!= null)&&(!this.configuration.isEmpty()));
    }

    public void unsetConfiguration() {
        this.configuration = null;
    }

    /**
     * Obtiene el valor de la propiedad configurationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationType() {
        return configurationType;
    }

    /**
     * Define el valor de la propiedad configurationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationType(String value) {
        this.configurationType = value;
    }

    public boolean isSetConfigurationType() {
        return (this.configurationType!= null);
    }

}
