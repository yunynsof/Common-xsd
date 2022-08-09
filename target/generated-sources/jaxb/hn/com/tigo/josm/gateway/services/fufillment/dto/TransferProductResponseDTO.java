//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:30 AM CST 
//


package hn.com.tigo.josm.gateway.services.fufillment.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transferProductResponseDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transferProductResponseDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.business.api.fulfillmentengine.millicom.com/}responseDTO">
 *       &lt;sequence>
 *         &lt;element name="platformCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "transferProductResponseDTO", propOrder = {
    "platformCode",
    "platformMessage",
    "platformName"
})
public class TransferProductResponseDTO
    extends ResponseDTO
{

    protected Integer platformCode;
    protected String platformMessage;
    protected String platformName;

    /**
     * Obtiene el valor de la propiedad platformCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlatformCode() {
        return platformCode;
    }

    /**
     * Define el valor de la propiedad platformCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlatformCode(Integer value) {
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
