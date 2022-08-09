//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:30 AM CST 
//


package hn.com.tigo.josm.gateway.services.fufillment.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para purchaseProductResponseDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="purchaseProductResponseDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.business.api.fulfillmentengine.millicom.com/}responseDTO">
 *       &lt;sequence>
 *         &lt;element name="acquisitionMethods" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="platformCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="platformMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platformName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProductResponseDTO", propOrder = {
    "acquisitionMethods",
    "platformCode",
    "platformMessage",
    "platformName"
})
public class PurchaseProductResponseDTO
    extends ResponseDTO
{

    @XmlElement(nillable = true)
    protected List<String> acquisitionMethods;
    protected int platformCode;
    protected String platformMessage;
    protected String platformName;

    /**
     * Gets the value of the acquisitionMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acquisitionMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcquisitionMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAcquisitionMethods() {
        if (acquisitionMethods == null) {
            acquisitionMethods = new ArrayList<String>();
        }
        return this.acquisitionMethods;
    }

    /**
     * Obtiene el valor de la propiedad platformCode.
     * 
     */
    public int getPlatformCode() {
        return platformCode;
    }

    /**
     * Define el valor de la propiedad platformCode.
     * 
     */
    public void setPlatformCode(int value) {
        this.platformCode = value;
    }

    /**
     * Obtiene el valor de la propiedad platformMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformMessage() {
        return platformMessage;
    }

    /**
     * Define el valor de la propiedad platformMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformMessage(String value) {
        this.platformMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad platformName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * Define el valor de la propiedad platformName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformName(String value) {
        this.platformName = value;
    }

}
