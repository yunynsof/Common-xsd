//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
//


package hn.com.tigo.josm.plugin.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionLimit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionLimit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tigo.com.hn/pluginconfiguration/V1}ConfigurationType">
 *       &lt;sequence>
 *         &lt;element name="trxLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://www.tigo.com.hn/policy/type/period/V1}period"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionLimit", namespace = "http://www.tigo.com.hn/policy/transaction/limit/V1", propOrder = {
    "trxLimit",
    "period"
})
public class TransactionLimit
    extends ConfigurationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int trxLimit;
    @XmlElement(namespace = "http://www.tigo.com.hn/policy/type/period/V1", required = true)
    protected PeriodType period;

    /**
     * Obtiene el valor de la propiedad trxLimit.
     * 
     */
    public int getTrxLimit() {
        return trxLimit;
    }

    /**
     * Define el valor de la propiedad trxLimit.
     * 
     */
    public void setTrxLimit(int value) {
        this.trxLimit = value;
    }

    public boolean isSetTrxLimit() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad period.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPeriod() {
        return period;
    }

    /**
     * Define el valor de la propiedad period.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPeriod(PeriodType value) {
        this.period = value;
    }

    public boolean isSetPeriod() {
        return (this.period!= null);
    }

}
