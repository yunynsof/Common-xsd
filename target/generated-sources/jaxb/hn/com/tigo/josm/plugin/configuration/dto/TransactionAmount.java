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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionAmount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionAmount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tigo.com.hn/pluginconfiguration/V1}ConfigurationType">
 *       &lt;sequence>
 *         &lt;element name="amountKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="minimumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maximumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAmount", namespace = "http://www.tigo.com.hn/policy/transaction/amount/V1", propOrder = {
    "amountKey",
    "minimumAmount",
    "maximumAmount"
})
public class TransactionAmount
    extends ConfigurationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<String> amountKey;
    protected Double minimumAmount;
    protected Double maximumAmount;

    /**
     * Gets the value of the amountKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAmountKey() {
        if (amountKey == null) {
            amountKey = new ArrayList<String>();
        }
        return this.amountKey;
    }

    public boolean isSetAmountKey() {
        return ((this.amountKey!= null)&&(!this.amountKey.isEmpty()));
    }

    public void unsetAmountKey() {
        this.amountKey = null;
    }

    /**
     * Obtiene el valor de la propiedad minimumAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Define el valor de la propiedad minimumAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumAmount(Double value) {
        this.minimumAmount = value;
    }

    public boolean isSetMinimumAmount() {
        return (this.minimumAmount!= null);
    }

    /**
     * Obtiene el valor de la propiedad maximumAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Define el valor de la propiedad maximumAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumAmount(Double value) {
        this.maximumAmount = value;
    }

    public boolean isSetMaximumAmount() {
        return (this.maximumAmount!= null);
    }

}
