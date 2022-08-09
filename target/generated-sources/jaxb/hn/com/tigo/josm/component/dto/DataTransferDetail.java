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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DataTransferDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DataTransferDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDataTransfer" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jasonValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jasonValueBackUp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxValidRestoreDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTransferDetail", namespace = "http://tigo.com.hn/component/DataTransferResponse/V1", propOrder = {
    "idDataTransfer",
    "idProduct",
    "orderType",
    "state",
    "jasonValue",
    "jasonValueBackUp",
    "maxValidRestoreDate"
})
public class DataTransferDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long idDataTransfer;
    protected long idProduct;
    @XmlElement(required = true)
    protected String orderType;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true, nillable = true)
    protected String jasonValue;
    @XmlElement(required = true, nillable = true)
    protected String jasonValueBackUp;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxValidRestoreDate;

    /**
     * Obtiene el valor de la propiedad idDataTransfer.
     * 
     */
    public long getIdDataTransfer() {
        return idDataTransfer;
    }

    /**
     * Define el valor de la propiedad idDataTransfer.
     * 
     */
    public void setIdDataTransfer(long value) {
        this.idDataTransfer = value;
    }

    public boolean isSetIdDataTransfer() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad idProduct.
     * 
     */
    public long getIdProduct() {
        return idProduct;
    }

    /**
     * Define el valor de la propiedad idProduct.
     * 
     */
    public void setIdProduct(long value) {
        this.idProduct = value;
    }

    public boolean isSetIdProduct() {
        return true;
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

    /**
     * Obtiene el valor de la propiedad jasonValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJasonValue() {
        return jasonValue;
    }

    /**
     * Define el valor de la propiedad jasonValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJasonValue(String value) {
        this.jasonValue = value;
    }

    public boolean isSetJasonValue() {
        return (this.jasonValue!= null);
    }

    /**
     * Obtiene el valor de la propiedad jasonValueBackUp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJasonValueBackUp() {
        return jasonValueBackUp;
    }

    /**
     * Define el valor de la propiedad jasonValueBackUp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJasonValueBackUp(String value) {
        this.jasonValueBackUp = value;
    }

    public boolean isSetJasonValueBackUp() {
        return (this.jasonValueBackUp!= null);
    }

    /**
     * Obtiene el valor de la propiedad maxValidRestoreDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxValidRestoreDate() {
        return maxValidRestoreDate;
    }

    /**
     * Define el valor de la propiedad maxValidRestoreDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxValidRestoreDate(XMLGregorianCalendar value) {
        this.maxValidRestoreDate = value;
    }

    public boolean isSetMaxValidRestoreDate() {
        return (this.maxValidRestoreDate!= null);
    }

}
