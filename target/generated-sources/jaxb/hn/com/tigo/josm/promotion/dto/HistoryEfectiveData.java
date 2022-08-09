//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:10 PM CST 
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
 * <p>Clase Java para HistoryEfectiveData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HistoryEfectiveData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transaction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="executionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="errorCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryEfectiveData", namespace = "http://www.example.org/HistoryEfectiveResponse", propOrder = {
    "transaction",
    "executionDate",
    "totalCount",
    "errorCount",
    "percent"
})
public class HistoryEfectiveData
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String transaction;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar executionDate;
    protected long totalCount;
    protected long errorCount;
    protected double percent;

    /**
     * Obtiene el valor de la propiedad transaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaction() {
        return transaction;
    }

    /**
     * Define el valor de la propiedad transaction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaction(String value) {
        this.transaction = value;
    }

    public boolean isSetTransaction() {
        return (this.transaction!= null);
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
     * Obtiene el valor de la propiedad errorCount.
     * 
     */
    public long getErrorCount() {
        return errorCount;
    }

    /**
     * Define el valor de la propiedad errorCount.
     * 
     */
    public void setErrorCount(long value) {
        this.errorCount = value;
    }

    public boolean isSetErrorCount() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad percent.
     * 
     */
    public double getPercent() {
        return percent;
    }

    /**
     * Define el valor de la propiedad percent.
     * 
     */
    public void setPercent(double value) {
        this.percent = value;
    }

    public boolean isSetPercent() {
        return true;
    }

}
