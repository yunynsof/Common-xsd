//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.promotion.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para PromotionProgressBarDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionProgressBarDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idPromotion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="namePromotion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="executionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionProgressBarDetail", namespace = "http://www.example.org/PromotionProgressBarResponse", propOrder = {
    "id",
    "transactionId",
    "idPromotion",
    "namePromotion",
    "executionDate",
    "totalCount",
    "userName",
    "state"
})
public class PromotionProgressBarDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long id;
    @XmlElement(required = true)
    protected String transactionId;
    protected long idPromotion;
    @XmlElement(required = true)
    protected String namePromotion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar executionDate;
    protected long totalCount;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String state;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    public boolean isSetId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad transactionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Define el valor de la propiedad transactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    public boolean isSetTransactionId() {
        return (this.transactionId!= null);
    }

    /**
     * Obtiene el valor de la propiedad idPromotion.
     * 
     */
    public long getIdPromotion() {
        return idPromotion;
    }

    /**
     * Define el valor de la propiedad idPromotion.
     * 
     */
    public void setIdPromotion(long value) {
        this.idPromotion = value;
    }

    public boolean isSetIdPromotion() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad namePromotion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePromotion() {
        return namePromotion;
    }

    /**
     * Define el valor de la propiedad namePromotion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePromotion(String value) {
        this.namePromotion = value;
    }

    public boolean isSetNamePromotion() {
        return (this.namePromotion!= null);
    }

    /**
     * Obtiene el valor de la propiedad executionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecutionDate() {
        return executionDate;
    }

    /**
     * Define el valor de la propiedad executionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecutionDate(XMLGregorianCalendar value) {
        this.executionDate = value;
    }

    public boolean isSetExecutionDate() {
        return (this.executionDate!= null);
    }

    /**
     * Obtiene el valor de la propiedad totalCount.
     * 
     */
    public long getTotalCount() {
        return totalCount;
    }

    /**
     * Define el valor de la propiedad totalCount.
     * 
     */
    public void setTotalCount(long value) {
        this.totalCount = value;
    }

    public boolean isSetTotalCount() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Define el valor de la propiedad userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    public boolean isSetUserName() {
        return (this.userName!= null);
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    public boolean isSetState() {
        return (this.state!= null);
    }

}
