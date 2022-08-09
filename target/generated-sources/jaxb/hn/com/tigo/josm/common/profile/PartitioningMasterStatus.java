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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartitioningMasterStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartitioningMasterStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jndiList" type="{http://www.example.org/PartitioningMasterStatus}ComplexJndi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartitioningMasterStatus", namespace = "http://www.example.org/PartitioningMasterStatus", propOrder = {
    "timeOut",
    "mod",
    "jndiList"
})
public class PartitioningMasterStatus
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int timeOut;
    protected int mod;
    protected ComplexJndi jndiList;

    /**
     * Obtiene el valor de la propiedad timeOut.
     * 
     */
    public int getTimeOut() {
        return timeOut;
    }

    /**
     * Define el valor de la propiedad timeOut.
     * 
     */
    public void setTimeOut(int value) {
        this.timeOut = value;
    }

    public boolean isSetTimeOut() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad mod.
     * 
     */
    public int getMod() {
        return mod;
    }

    /**
     * Define el valor de la propiedad mod.
     * 
     */
    public void setMod(int value) {
        this.mod = value;
    }

    public boolean isSetMod() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad jndiList.
     * 
     * @return
     *     possible object is
     *     {@link ComplexJndi }
     *     
     */
    public ComplexJndi getJndiList() {
        return jndiList;
    }

    /**
     * Define el valor de la propiedad jndiList.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexJndi }
     *     
     */
    public void setJndiList(ComplexJndi value) {
        this.jndiList = value;
    }

    public boolean isSetJndiList() {
        return (this.jndiList!= null);
    }

}
