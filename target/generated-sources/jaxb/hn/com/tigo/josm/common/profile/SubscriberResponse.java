//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.common.profile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para SubscriberResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubscriberResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/profile/MasterStatusResponse/V1}MasterStatusResponse">
 *       &lt;sequence>
 *         &lt;element name="idSubscriber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="activated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subscriberNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberResponse", namespace = "http://tigo.com.hn/profile/SubscriberResponse/V1", propOrder = {
    "idSubscriber",
    "dateCreated",
    "activated",
    "subscriberNumber"
})
public class SubscriberResponse
    extends MasterStatusResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idSubscriber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateCreated;
    @XmlElement(required = true)
    protected String activated;
    @XmlElement(required = true)
    protected String subscriberNumber;

    /**
     * Obtiene el valor de la propiedad idSubscriber.
     * 
     */
    public long getIdSubscriber() {
        return idSubscriber;
    }

    /**
     * Define el valor de la propiedad idSubscriber.
     * 
     */
    public void setIdSubscriber(long value) {
        this.idSubscriber = value;
    }

    public boolean isSetIdSubscriber() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad dateCreated.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Define el valor de la propiedad dateCreated.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    public boolean isSetDateCreated() {
        return (this.dateCreated!= null);
    }

    /**
     * Obtiene el valor de la propiedad activated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivated() {
        return activated;
    }

    /**
     * Define el valor de la propiedad activated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivated(String value) {
        this.activated = value;
    }

    public boolean isSetActivated() {
        return (this.activated!= null);
    }

    /**
     * Obtiene el valor de la propiedad subscriberNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    /**
     * Define el valor de la propiedad subscriberNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNumber(String value) {
        this.subscriberNumber = value;
    }

    public boolean isSetSubscriberNumber() {
        return (this.subscriberNumber!= null);
    }

}
