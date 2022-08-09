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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TigoApiAdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TigoApiAdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="GetOnTheFlyBalanceUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GoToMarketQueryUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TagAndTriggeryUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TigoApiAdapterConfigType", namespace = "http://tigo.com.hn/TigoApiAdapterConfigType/V1", propOrder = {
    "getOnTheFlyBalanceUrl",
    "goToMarketQueryUrl",
    "tagAndTriggeryUrl"
})
public class TigoApiAdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GetOnTheFlyBalanceUrl", required = true)
    protected String getOnTheFlyBalanceUrl;
    @XmlElement(name = "GoToMarketQueryUrl", required = true)
    protected String goToMarketQueryUrl;
    @XmlElement(name = "TagAndTriggeryUrl", required = true)
    protected String tagAndTriggeryUrl;

    /**
     * Obtiene el valor de la propiedad getOnTheFlyBalanceUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetOnTheFlyBalanceUrl() {
        return getOnTheFlyBalanceUrl;
    }

    /**
     * Define el valor de la propiedad getOnTheFlyBalanceUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetOnTheFlyBalanceUrl(String value) {
        this.getOnTheFlyBalanceUrl = value;
    }

    public boolean isSetGetOnTheFlyBalanceUrl() {
        return (this.getOnTheFlyBalanceUrl!= null);
    }

    /**
     * Obtiene el valor de la propiedad goToMarketQueryUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoToMarketQueryUrl() {
        return goToMarketQueryUrl;
    }

    /**
     * Define el valor de la propiedad goToMarketQueryUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoToMarketQueryUrl(String value) {
        this.goToMarketQueryUrl = value;
    }

    public boolean isSetGoToMarketQueryUrl() {
        return (this.goToMarketQueryUrl!= null);
    }

    /**
     * Obtiene el valor de la propiedad tagAndTriggeryUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagAndTriggeryUrl() {
        return tagAndTriggeryUrl;
    }

    /**
     * Define el valor de la propiedad tagAndTriggeryUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagAndTriggeryUrl(String value) {
        this.tagAndTriggeryUrl = value;
    }

    public boolean isSetTagAndTriggeryUrl() {
        return (this.tagAndTriggeryUrl!= null);
    }

}
