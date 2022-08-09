//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:10 PM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataTransferCheckResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DataTransferCheckResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/order/JOSMResponse/V1}JOSMResponse">
 *       &lt;sequence>
 *         &lt;element name="CheckedModules" type="{http://tigo.com.hn/component/DataTransferCheckResponse/V1}dataTransferCheckList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTransferCheckResponse", namespace = "http://tigo.com.hn/component/DataTransferCheckResponse/V1", propOrder = {
    "checkedModules"
})
public class DataTransferCheckResponse
    extends JOSMResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CheckedModules")
    protected DataTransferCheckList checkedModules;

    /**
     * Obtiene el valor de la propiedad checkedModules.
     * 
     * @return
     *     possible object is
     *     {@link DataTransferCheckList }
     *     
     */
    public DataTransferCheckList getCheckedModules() {
        return checkedModules;
    }

    /**
     * Define el valor de la propiedad checkedModules.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTransferCheckList }
     *     
     */
    public void setCheckedModules(DataTransferCheckList value) {
        this.checkedModules = value;
    }

    public boolean isSetCheckedModules() {
        return (this.checkedModules!= null);
    }

}
