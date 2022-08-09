//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.common.proxy.mobiquity.dto;

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
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rechValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rechDays" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rechComm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allOrNothing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ccwsUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ccwsPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "subscriberId",
    "identity",
    "rechValue",
    "rechDays",
    "rechComm",
    "orderType",
    "productId",
    "quantity",
    "allOrNothing",
    "ccwsUser",
    "ccwsPassword"
})
@XmlRootElement(name = "MobiquityNonVoucherRecharge", namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1")
public class MobiquityNonVoucherRecharge {

    @XmlElement(namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1", required = true)
    protected String subscriberId;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1", required = true)
    protected String identity;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1", required = true)
    protected String rechValue;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1", required = true)
    protected String rechDays;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1", required = true)
    protected String rechComm;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1", required = true)
    protected String orderType;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1", required = true)
    protected String productId;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1", required = true)
    protected String quantity;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1")
    protected boolean allOrNothing;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1", required = true)
    protected String ccwsUser;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1", required = true)
    protected String ccwsPassword;

    /**
     * Obtiene el valor de la propiedad subscriberId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Define el valor de la propiedad subscriberId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * Obtiene el valor de la propiedad identity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * Define el valor de la propiedad identity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentity(String value) {
        this.identity = value;
    }

    /**
     * Obtiene el valor de la propiedad rechValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechValue() {
        return rechValue;
    }

    /**
     * Define el valor de la propiedad rechValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechValue(String value) {
        this.rechValue = value;
    }

    /**
     * Obtiene el valor de la propiedad rechDays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechDays() {
        return rechDays;
    }

    /**
     * Define el valor de la propiedad rechDays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechDays(String value) {
        this.rechDays = value;
    }

    /**
     * Obtiene el valor de la propiedad rechComm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechComm() {
        return rechComm;
    }

    /**
     * Define el valor de la propiedad rechComm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechComm(String value) {
        this.rechComm = value;
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

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad allOrNothing.
     * 
     */
    public boolean isAllOrNothing() {
        return allOrNothing;
    }

    /**
     * Define el valor de la propiedad allOrNothing.
     * 
     */
    public void setAllOrNothing(boolean value) {
        this.allOrNothing = value;
    }

    /**
     * Obtiene el valor de la propiedad ccwsUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcwsUser() {
        return ccwsUser;
    }

    /**
     * Define el valor de la propiedad ccwsUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcwsUser(String value) {
        this.ccwsUser = value;
    }

    /**
     * Obtiene el valor de la propiedad ccwsPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcwsPassword() {
        return ccwsPassword;
    }

    /**
     * Define el valor de la propiedad ccwsPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcwsPassword(String value) {
        this.ccwsPassword = value;
    }

}
