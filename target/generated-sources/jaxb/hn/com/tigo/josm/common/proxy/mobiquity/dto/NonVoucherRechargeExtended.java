//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.common.proxy.mobiquity.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NonVoucherRechargeExtended complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NonVoucherRechargeExtended">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tigo.com.hn/ProxyMobiquityRequest/V1}ProxyMobiquityRequestType">
 *       &lt;sequence>
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rechValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rechDays" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rechComm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonVoucherRechargeExtended", namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1", propOrder = {
    "subscriberId",
    "identity",
    "rechValue",
    "rechDays",
    "rechComm",
    "orderType",
    "productId",
    "quantity"
})
public class NonVoucherRechargeExtended
    extends ProxyMobiquityRequestType
{

    @XmlElement(required = true)
    protected String subscriberId;
    @XmlElement(required = true)
    protected String identity;
    @XmlElement(required = true)
    protected String rechValue;
    @XmlElement(required = true)
    protected String rechDays;
    @XmlElement(required = true)
    protected String rechComm;
    @XmlElement(required = true)
    protected String orderType;
    @XmlElement(required = true)
    protected String productId;
    @XmlElement(required = true)
    protected String quantity;

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

}
