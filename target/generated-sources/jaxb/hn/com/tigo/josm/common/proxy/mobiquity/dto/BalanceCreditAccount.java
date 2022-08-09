//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.common.proxy.mobiquity.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BalanceCreditAccount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BalanceCreditAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BalanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceCreditAccount", propOrder = {
    "creditValue",
    "balanceName",
    "expirationDate"
})
public class BalanceCreditAccount {

    @XmlElement(name = "CreditValue", required = true)
    protected String creditValue;
    @XmlElement(name = "BalanceName", required = true)
    protected String balanceName;
    @XmlElement(name = "ExpirationDate", required = true)
    protected String expirationDate;

    /**
     * Obtiene el valor de la propiedad creditValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditValue() {
        return creditValue;
    }

    /**
     * Define el valor de la propiedad creditValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditValue(String value) {
        this.creditValue = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceName() {
        return balanceName;
    }

    /**
     * Define el valor de la propiedad balanceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceName(String value) {
        this.balanceName = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define el valor de la propiedad expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

}
