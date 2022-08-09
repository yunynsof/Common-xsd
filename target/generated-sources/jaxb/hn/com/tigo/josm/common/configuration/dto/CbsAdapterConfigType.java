//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:07 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CbsAdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CbsAdapterConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfigType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="businessCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="beid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loginSystemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operatorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZoneId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="servicePathAR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="servicePathBB" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="servicePathBC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endpointIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fetchRows" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ceros" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CbsAdapterConfigType", namespace = "http://tigo.com.hn/CbsAdapterConfigType/V1", propOrder = {
    "version",
    "businessCode",
    "beid",
    "brid",
    "loginSystemCode",
    "operatorId",
    "channelId",
    "timeType",
    "timeZoneId",
    "servicePathAR",
    "servicePathBB",
    "servicePathBC",
    "endpointIP",
    "fetchRows",
    "ceros"
})
public class CbsAdapterConfigType
    extends AdapterConfigType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String businessCode;
    @XmlElement(required = true)
    protected String beid;
    @XmlElement(required = true)
    protected String brid;
    @XmlElement(required = true)
    protected String loginSystemCode;
    @XmlElement(required = true)
    protected String operatorId;
    @XmlElement(required = true)
    protected String channelId;
    @XmlElement(required = true)
    protected String timeType;
    @XmlElement(required = true)
    protected String timeZoneId;
    @XmlElement(required = true)
    protected String servicePathAR;
    @XmlElement(required = true)
    protected String servicePathBB;
    @XmlElement(required = true)
    protected String servicePathBC;
    @XmlElement(required = true)
    protected String endpointIP;
    @XmlElement(required = true)
    protected String fetchRows;
    @XmlElement(required = true)
    protected String ceros;

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

    /**
     * Obtiene el valor de la propiedad businessCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * Define el valor de la propiedad businessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCode(String value) {
        this.businessCode = value;
    }

    public boolean isSetBusinessCode() {
        return (this.businessCode!= null);
    }

    /**
     * Obtiene el valor de la propiedad beid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeid() {
        return beid;
    }

    /**
     * Define el valor de la propiedad beid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeid(String value) {
        this.beid = value;
    }

    public boolean isSetBeid() {
        return (this.beid!= null);
    }

    /**
     * Obtiene el valor de la propiedad brid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrid() {
        return brid;
    }

    /**
     * Define el valor de la propiedad brid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrid(String value) {
        this.brid = value;
    }

    public boolean isSetBrid() {
        return (this.brid!= null);
    }

    /**
     * Obtiene el valor de la propiedad loginSystemCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginSystemCode() {
        return loginSystemCode;
    }

    /**
     * Define el valor de la propiedad loginSystemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginSystemCode(String value) {
        this.loginSystemCode = value;
    }

    public boolean isSetLoginSystemCode() {
        return (this.loginSystemCode!= null);
    }

    /**
     * Obtiene el valor de la propiedad operatorId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Define el valor de la propiedad operatorId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorId(String value) {
        this.operatorId = value;
    }

    public boolean isSetOperatorId() {
        return (this.operatorId!= null);
    }

    /**
     * Obtiene el valor de la propiedad channelId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Define el valor de la propiedad channelId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    public boolean isSetChannelId() {
        return (this.channelId!= null);
    }

    /**
     * Obtiene el valor de la propiedad timeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeType() {
        return timeType;
    }

    /**
     * Define el valor de la propiedad timeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeType(String value) {
        this.timeType = value;
    }

    public boolean isSetTimeType() {
        return (this.timeType!= null);
    }

    /**
     * Obtiene el valor de la propiedad timeZoneId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * Define el valor de la propiedad timeZoneId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneId(String value) {
        this.timeZoneId = value;
    }

    public boolean isSetTimeZoneId() {
        return (this.timeZoneId!= null);
    }

    /**
     * Obtiene el valor de la propiedad servicePathAR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePathAR() {
        return servicePathAR;
    }

    /**
     * Define el valor de la propiedad servicePathAR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePathAR(String value) {
        this.servicePathAR = value;
    }

    public boolean isSetServicePathAR() {
        return (this.servicePathAR!= null);
    }

    /**
     * Obtiene el valor de la propiedad servicePathBB.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePathBB() {
        return servicePathBB;
    }

    /**
     * Define el valor de la propiedad servicePathBB.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePathBB(String value) {
        this.servicePathBB = value;
    }

    public boolean isSetServicePathBB() {
        return (this.servicePathBB!= null);
    }

    /**
     * Obtiene el valor de la propiedad servicePathBC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePathBC() {
        return servicePathBC;
    }

    /**
     * Define el valor de la propiedad servicePathBC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePathBC(String value) {
        this.servicePathBC = value;
    }

    public boolean isSetServicePathBC() {
        return (this.servicePathBC!= null);
    }

    /**
     * Obtiene el valor de la propiedad endpointIP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpointIP() {
        return endpointIP;
    }

    /**
     * Define el valor de la propiedad endpointIP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpointIP(String value) {
        this.endpointIP = value;
    }

    public boolean isSetEndpointIP() {
        return (this.endpointIP!= null);
    }

    /**
     * Obtiene el valor de la propiedad fetchRows.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFetchRows() {
        return fetchRows;
    }

    /**
     * Define el valor de la propiedad fetchRows.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetchRows(String value) {
        this.fetchRows = value;
    }

    public boolean isSetFetchRows() {
        return (this.fetchRows!= null);
    }

    /**
     * Obtiene el valor de la propiedad ceros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeros() {
        return ceros;
    }

    /**
     * Define el valor de la propiedad ceros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeros(String value) {
        this.ceros = value;
    }

    public boolean isSetCeros() {
        return (this.ceros!= null);
    }

}
