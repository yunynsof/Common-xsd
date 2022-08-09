//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:07 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AS400AdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AS400AdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="AS400DriverConfig" type="{http://www.tigo.com.hn/configuration/AS400DriverType/V1}AS400DriverType" maxOccurs="unbounded"/>
 *         &lt;element name="AS400ProgramConfig" type="{http://tigo.com.hn/adapter/AS400ProgramConfigType/V1}AS400AdapterProgramType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AS400AdapterConfigType", namespace = "http://tigo.com.hn/AS400AdapterConfigType/V1", propOrder = {
    "as400DriverConfig",
    "as400ProgramConfig"
})
public class AS400AdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AS400DriverConfig", required = true)
    protected List<AS400DriverType> as400DriverConfig;
    @XmlElement(name = "AS400ProgramConfig", required = true)
    protected List<AS400AdapterProgramType> as400ProgramConfig;

    /**
     * Gets the value of the as400DriverConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the as400DriverConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAS400DriverConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AS400DriverType }
     * 
     * 
     */
    public List<AS400DriverType> getAS400DriverConfig() {
        if (as400DriverConfig == null) {
            as400DriverConfig = new ArrayList<AS400DriverType>();
        }
        return this.as400DriverConfig;
    }

    public boolean isSetAS400DriverConfig() {
        return ((this.as400DriverConfig!= null)&&(!this.as400DriverConfig.isEmpty()));
    }

    public void unsetAS400DriverConfig() {
        this.as400DriverConfig = null;
    }

    /**
     * Gets the value of the as400ProgramConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the as400ProgramConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAS400ProgramConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AS400AdapterProgramType }
     * 
     * 
     */
    public List<AS400AdapterProgramType> getAS400ProgramConfig() {
        if (as400ProgramConfig == null) {
            as400ProgramConfig = new ArrayList<AS400AdapterProgramType>();
        }
        return this.as400ProgramConfig;
    }

    public boolean isSetAS400ProgramConfig() {
        return ((this.as400ProgramConfig!= null)&&(!this.as400ProgramConfig.isEmpty()));
    }

    public void unsetAS400ProgramConfig() {
        this.as400ProgramConfig = null;
    }

}
