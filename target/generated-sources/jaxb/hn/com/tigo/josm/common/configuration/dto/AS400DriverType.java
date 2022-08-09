//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AS400DriverType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AS400DriverType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}DriverType">
 *       &lt;sequence>
 *         &lt;element name="queueName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queueSplit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queueDefinition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queueLibName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queueInputType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AS400DriverType", namespace = "http://www.tigo.com.hn/configuration/AS400DriverType/V1", propOrder = {
    "queueName",
    "queueSplit",
    "queueDefinition",
    "queueLibName",
    "queueInputType"
})
public class AS400DriverType
    extends DriverType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String queueName;
    @XmlElement(required = true)
    protected String queueSplit;
    @XmlElement(required = true)
    protected String queueDefinition;
    @XmlElement(required = true)
    protected String queueLibName;
    @XmlElement(required = true)
    protected String queueInputType;

    /**
     * Obtiene el valor de la propiedad queueName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueName() {
        return queueName;
    }

    /**
     * Define el valor de la propiedad queueName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueName(String value) {
        this.queueName = value;
    }

    public boolean isSetQueueName() {
        return (this.queueName!= null);
    }

    /**
     * Obtiene el valor de la propiedad queueSplit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueSplit() {
        return queueSplit;
    }

    /**
     * Define el valor de la propiedad queueSplit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueSplit(String value) {
        this.queueSplit = value;
    }

    public boolean isSetQueueSplit() {
        return (this.queueSplit!= null);
    }

    /**
     * Obtiene el valor de la propiedad queueDefinition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueDefinition() {
        return queueDefinition;
    }

    /**
     * Define el valor de la propiedad queueDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueDefinition(String value) {
        this.queueDefinition = value;
    }

    public boolean isSetQueueDefinition() {
        return (this.queueDefinition!= null);
    }

    /**
     * Obtiene el valor de la propiedad queueLibName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueLibName() {
        return queueLibName;
    }

    /**
     * Define el valor de la propiedad queueLibName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueLibName(String value) {
        this.queueLibName = value;
    }

    public boolean isSetQueueLibName() {
        return (this.queueLibName!= null);
    }

    /**
     * Obtiene el valor de la propiedad queueInputType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueInputType() {
        return queueInputType;
    }

    /**
     * Define el valor de la propiedad queueInputType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueInputType(String value) {
        this.queueInputType = value;
    }

    public boolean isSetQueueInputType() {
        return (this.queueInputType!= null);
    }

}
