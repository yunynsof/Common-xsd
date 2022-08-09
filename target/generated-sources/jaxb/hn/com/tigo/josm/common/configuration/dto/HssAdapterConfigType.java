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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HssAdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HssAdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="hlrsn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sessionCheckTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HssAdapterConfigType", namespace = "http://www.tigo.com.hn/configuration/HssAdapterConfigType/V1", propOrder = {
    "hlrsn",
    "sessionCheckTime"
})
public class HssAdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int hlrsn;
    protected int sessionCheckTime;

    /**
     * Obtiene el valor de la propiedad hlrsn.
     * 
     */
    public int getHlrsn() {
        return hlrsn;
    }

    /**
     * Define el valor de la propiedad hlrsn.
     * 
     */
    public void setHlrsn(int value) {
        this.hlrsn = value;
    }

    public boolean isSetHlrsn() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad sessionCheckTime.
     * 
     */
    public int getSessionCheckTime() {
        return sessionCheckTime;
    }

    /**
     * Define el valor de la propiedad sessionCheckTime.
     * 
     */
    public void setSessionCheckTime(int value) {
        this.sessionCheckTime = value;
    }

    public boolean isSetSessionCheckTime() {
        return true;
    }

}
