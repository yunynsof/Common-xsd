//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.common.proxy.as400.dto;

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
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicationKeys" type="{http://tigo.com.hn/ProxyRequest/V1}Keys"/>
 *         &lt;element name="serviceRequest" type="{http://tigo.com.hn/ProxyRequest/V1}ServiceRequest"/>
 *         &lt;element name="actionRequest" type="{http://tigo.com.hn/ProxyActions/V1}proxyActionArray"/>
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
    "productCode",
    "orderType",
    "transactionId",
    "priority",
    "applicationKeys",
    "serviceRequest",
    "actionRequest"
})
@XmlRootElement(name = "ProxyAs400RequestType", namespace = "http://tigo.com.hn/ProxyRequest/V1")
public class ProxyAs400RequestType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyRequest/V1", required = true)
    protected String productCode;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyRequest/V1", required = true)
    protected String orderType;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyRequest/V1", required = true)
    protected String transactionId;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyRequest/V1", required = true)
    protected String priority;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyRequest/V1", required = true)
    protected Keys applicationKeys;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyRequest/V1", required = true)
    protected ServiceRequest serviceRequest;
    @XmlElement(namespace = "http://tigo.com.hn/ProxyRequest/V1", required = true)
    protected ProxyActionArray actionRequest;

    /**
     * Obtiene el valor de la propiedad productCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Define el valor de la propiedad productCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    public boolean isSetProductCode() {
        return (this.productCode!= null);
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
     * Obtiene el valor de la propiedad transactionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Define el valor de la propiedad transactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    public boolean isSetTransactionId() {
        return (this.transactionId!= null);
    }

    /**
     * Obtiene el valor de la propiedad priority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Define el valor de la propiedad priority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    public boolean isSetPriority() {
        return (this.priority!= null);
    }

    /**
     * Obtiene el valor de la propiedad applicationKeys.
     * 
     * @return
     *     possible object is
     *     {@link Keys }
     *     
     */
    public Keys getApplicationKeys() {
        return applicationKeys;
    }

    /**
     * Define el valor de la propiedad applicationKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Keys }
     *     
     */
    public void setApplicationKeys(Keys value) {
        this.applicationKeys = value;
    }

    public boolean isSetApplicationKeys() {
        return (this.applicationKeys!= null);
    }

    /**
     * Obtiene el valor de la propiedad serviceRequest.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequest }
     *     
     */
    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    /**
     * Define el valor de la propiedad serviceRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequest }
     *     
     */
    public void setServiceRequest(ServiceRequest value) {
        this.serviceRequest = value;
    }

    public boolean isSetServiceRequest() {
        return (this.serviceRequest!= null);
    }

    /**
     * Obtiene el valor de la propiedad actionRequest.
     * 
     * @return
     *     possible object is
     *     {@link ProxyActionArray }
     *     
     */
    public ProxyActionArray getActionRequest() {
        return actionRequest;
    }

    /**
     * Define el valor de la propiedad actionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyActionArray }
     *     
     */
    public void setActionRequest(ProxyActionArray value) {
        this.actionRequest = value;
    }

    public boolean isSetActionRequest() {
        return (this.actionRequest!= null);
    }

}
