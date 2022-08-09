//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para channelPageResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="channelPageResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/order/JOSMResponse/V1}JOSMResponse">
 *       &lt;sequence>
 *         &lt;element name="channels" type="{http://tigo.com.hn/component/channelPageResponse/V1}channelDetailResponseService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channelPageResponse", namespace = "http://tigo.com.hn/component/channelPageResponse/V1", propOrder = {
    "channels"
})
public class ChannelPageResponse
    extends JOSMResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ChannelDetailResponseService channels;

    /**
     * Obtiene el valor de la propiedad channels.
     * 
     * @return
     *     possible object is
     *     {@link ChannelDetailResponseService }
     *     
     */
    public ChannelDetailResponseService getChannels() {
        return channels;
    }

    /**
     * Define el valor de la propiedad channels.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelDetailResponseService }
     *     
     */
    public void setChannels(ChannelDetailResponseService value) {
        this.channels = value;
    }

    public boolean isSetChannels() {
        return (this.channels!= null);
    }

}
