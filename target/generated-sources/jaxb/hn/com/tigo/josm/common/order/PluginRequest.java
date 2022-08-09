//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:07 PM CST 
//


package hn.com.tigo.josm.common.order;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PluginRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PluginRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="policy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="instance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simpleOrderRequest" type="{http://tigo.com/josm/gateway/services/order/SimpleOrderRequest/V1}SimpleOrderRequest"/>
 *         &lt;element name="allOrNorthing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PluginRequest", namespace = "http://tigo.com/josm/gateway/services/order/PluginRequest/V1", propOrder = {
    "ipAddress",
    "userPrincipal",
    "transactionID",
    "policyId",
    "policy",
    "instanceId",
    "instance",
    "orderType",
    "simpleOrderRequest",
    "allOrNorthing"
})
public class PluginRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String ipAddress;
    protected String userPrincipal;
    protected String transactionID;
    protected Long policyId;
    protected String policy;
    protected Long instanceId;
    protected String instance;
    protected String orderType;
    @XmlElement(required = true, nillable = true)
    protected SimpleOrderRequest simpleOrderRequest;
    protected String allOrNorthing;

    /**
     * Obtiene el valor de la propiedad ipAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Define el valor de la propiedad ipAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    public boolean isSetIpAddress() {
        return (this.ipAddress!= null);
    }

    /**
     * Obtiene el valor de la propiedad userPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPrincipal() {
        return userPrincipal;
    }

    /**
     * Define el valor de la propiedad userPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPrincipal(String value) {
        this.userPrincipal = value;
    }

    public boolean isSetUserPrincipal() {
        return (this.userPrincipal!= null);
    }

    /**
     * Obtiene el valor de la propiedad transactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Define el valor de la propiedad transactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    public boolean isSetTransactionID() {
        return (this.transactionID!= null);
    }

    /**
     * Obtiene el valor de la propiedad policyId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPolicyId() {
        return policyId;
    }

    /**
     * Define el valor de la propiedad policyId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPolicyId(Long value) {
        this.policyId = value;
    }

    public boolean isSetPolicyId() {
        return (this.policyId!= null);
    }

    /**
     * Obtiene el valor de la propiedad policy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * Define el valor de la propiedad policy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicy(String value) {
        this.policy = value;
    }

    public boolean isSetPolicy() {
        return (this.policy!= null);
    }

    /**
     * Obtiene el valor de la propiedad instanceId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInstanceId() {
        return instanceId;
    }

    /**
     * Define el valor de la propiedad instanceId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInstanceId(Long value) {
        this.instanceId = value;
    }

    public boolean isSetInstanceId() {
        return (this.instanceId!= null);
    }

    /**
     * Obtiene el valor de la propiedad instance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstance() {
        return instance;
    }

    /**
     * Define el valor de la propiedad instance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstance(String value) {
        this.instance = value;
    }

    public boolean isSetInstance() {
        return (this.instance!= null);
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
     * Obtiene el valor de la propiedad simpleOrderRequest.
     * 
     * @return
     *     possible object is
     *     {@link SimpleOrderRequest }
     *     
     */
    public SimpleOrderRequest getSimpleOrderRequest() {
        return simpleOrderRequest;
    }

    /**
     * Define el valor de la propiedad simpleOrderRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleOrderRequest }
     *     
     */
    public void setSimpleOrderRequest(SimpleOrderRequest value) {
        this.simpleOrderRequest = value;
    }

    public boolean isSetSimpleOrderRequest() {
        return (this.simpleOrderRequest!= null);
    }

    /**
     * Obtiene el valor de la propiedad allOrNorthing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllOrNorthing() {
        return allOrNorthing;
    }

    /**
     * Define el valor de la propiedad allOrNorthing.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllOrNorthing(String value) {
        this.allOrNorthing = value;
    }

    public boolean isSetAllOrNorthing() {
        return (this.allOrNorthing!= null);
    }

}
