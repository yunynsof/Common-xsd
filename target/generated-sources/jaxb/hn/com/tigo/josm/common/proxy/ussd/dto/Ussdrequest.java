//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.common.proxy.ussd.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shortcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stateflag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userinput" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorstatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cellid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subscriberstate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="proxyActionParameterArray" type="{http://tigo.com.hn/ProxyUssdRequest/V1}proxyActionParameterArray"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "msisdn",
    "transactionid",
    "shortcode",
    "stateflag",
    "userinput",
    "errorstatus",
    "cellid",
    "subscriberstate",
    "productId",
    "orderType",
    "quantity",
    "proxyActionParameterArray"
})
@XmlRootElement(name = "ussdrequest")
public class Ussdrequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String msisdn;
    @XmlElement(required = true)
    protected String transactionid;
    @XmlElement(required = true)
    protected String shortcode;
    @XmlElement(required = true)
    protected String stateflag;
    @XmlElement(required = true)
    protected String userinput;
    @XmlElement(required = true)
    protected String errorstatus;
    @XmlElement(required = true)
    protected String cellid;
    @XmlElement(required = true)
    protected String subscriberstate;
    protected long productId;
    @XmlElement(required = true)
    protected String orderType;
    protected int quantity;
    @XmlElement(required = true)
    protected ProxyActionParameterArray proxyActionParameterArray;

    /**
     * Obtiene el valor de la propiedad msisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Define el valor de la propiedad msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    public boolean isSetMsisdn() {
        return (this.msisdn!= null);
    }

    /**
     * Obtiene el valor de la propiedad transactionid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionid() {
        return transactionid;
    }

    /**
     * Define el valor de la propiedad transactionid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionid(String value) {
        this.transactionid = value;
    }

    public boolean isSetTransactionid() {
        return (this.transactionid!= null);
    }

    /**
     * Obtiene el valor de la propiedad shortcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcode() {
        return shortcode;
    }

    /**
     * Define el valor de la propiedad shortcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcode(String value) {
        this.shortcode = value;
    }

    public boolean isSetShortcode() {
        return (this.shortcode!= null);
    }

    /**
     * Obtiene el valor de la propiedad stateflag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateflag() {
        return stateflag;
    }

    /**
     * Define el valor de la propiedad stateflag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateflag(String value) {
        this.stateflag = value;
    }

    public boolean isSetStateflag() {
        return (this.stateflag!= null);
    }

    /**
     * Obtiene el valor de la propiedad userinput.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserinput() {
        return userinput;
    }

    /**
     * Define el valor de la propiedad userinput.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserinput(String value) {
        this.userinput = value;
    }

    public boolean isSetUserinput() {
        return (this.userinput!= null);
    }

    /**
     * Obtiene el valor de la propiedad errorstatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorstatus() {
        return errorstatus;
    }

    /**
     * Define el valor de la propiedad errorstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorstatus(String value) {
        this.errorstatus = value;
    }

    public boolean isSetErrorstatus() {
        return (this.errorstatus!= null);
    }

    /**
     * Obtiene el valor de la propiedad cellid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellid() {
        return cellid;
    }

    /**
     * Define el valor de la propiedad cellid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellid(String value) {
        this.cellid = value;
    }

    public boolean isSetCellid() {
        return (this.cellid!= null);
    }

    /**
     * Obtiene el valor de la propiedad subscriberstate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberstate() {
        return subscriberstate;
    }

    /**
     * Define el valor de la propiedad subscriberstate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberstate(String value) {
        this.subscriberstate = value;
    }

    public boolean isSetSubscriberstate() {
        return (this.subscriberstate!= null);
    }

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    public boolean isSetProductId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad orderType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Define el valor de la propiedad orderType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    public boolean isSetOrderType() {
        return (this.orderType!= null);
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    public boolean isSetQuantity() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad proxyActionParameterArray.
     * 
     * @return
     *     possible object is
     *     {@link ProxyActionParameterArray }
     *     
     */
    public ProxyActionParameterArray getProxyActionParameterArray() {
        return proxyActionParameterArray;
    }

    /**
     * Define el valor de la propiedad proxyActionParameterArray.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyActionParameterArray }
     *     
     */
    public void setProxyActionParameterArray(ProxyActionParameterArray value) {
        this.proxyActionParameterArray = value;
    }

    public boolean isSetProxyActionParameterArray() {
        return (this.proxyActionParameterArray!= null);
    }

}
