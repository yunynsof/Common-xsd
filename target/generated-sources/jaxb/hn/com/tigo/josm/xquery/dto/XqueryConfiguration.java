//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.xquery.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para XqueryConfiguration complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="XqueryConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datasources" type="{http://tigo.com/josm/xquery/XqueryConfiguration/V1}Datasources"/>
 *         &lt;element name="expirationTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maximumCapacityConnection" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XqueryConfiguration", propOrder = {
    "datasources",
    "expirationTime",
    "maximumCapacityConnection"
})
public class XqueryConfiguration {

    @XmlElement(required = true)
    protected Datasources datasources;
    protected int expirationTime;
    protected int maximumCapacityConnection;

    /**
     * Obtiene el valor de la propiedad datasources.
     * 
     * @return
     *     possible object is
     *     {@link Datasources }
     *     
     */
    public Datasources getDatasources() {
        return datasources;
    }

    /**
     * Define el valor de la propiedad datasources.
     * 
     * @param value
     *     allowed object is
     *     {@link Datasources }
     *     
     */
    public void setDatasources(Datasources value) {
        this.datasources = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationTime.
     * 
     */
    public int getExpirationTime() {
        return expirationTime;
    }

    /**
     * Define el valor de la propiedad expirationTime.
     * 
     */
    public void setExpirationTime(int value) {
        this.expirationTime = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumCapacityConnection.
     * 
     */
    public int getMaximumCapacityConnection() {
        return maximumCapacityConnection;
    }

    /**
     * Define el valor de la propiedad maximumCapacityConnection.
     * 
     */
    public void setMaximumCapacityConnection(int value) {
        this.maximumCapacityConnection = value;
    }

}
