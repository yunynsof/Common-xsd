//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:08 PM CST 
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
 * <p>Clase Java para KannelAdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="KannelAdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="KannelDriverConfig" type="{http://www.tigo.com.hn/configuration/KannelDriverType/V1}KannelDriverType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KannelAdapterConfigType", namespace = "http://tigo.com.hn/KannelAdapterConfigType/V1", propOrder = {
    "kannelDriverConfig"
})
public class KannelAdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "KannelDriverConfig", required = true)
    protected List<KannelDriverType> kannelDriverConfig;

    /**
     * Gets the value of the kannelDriverConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kannelDriverConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKannelDriverConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KannelDriverType }
     * 
     * 
     */
    public List<KannelDriverType> getKannelDriverConfig() {
        if (kannelDriverConfig == null) {
            kannelDriverConfig = new ArrayList<KannelDriverType>();
        }
        return this.kannelDriverConfig;
    }

    public boolean isSetKannelDriverConfig() {
        return ((this.kannelDriverConfig!= null)&&(!this.kannelDriverConfig.isEmpty()));
    }

    public void unsetKannelDriverConfig() {
        this.kannelDriverConfig = null;
    }

}
