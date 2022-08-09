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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdapterConfigType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdapterConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DriverConfig" type="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}DriverType"/>
 *         &lt;element name="MaitenanceConfig" type="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}MaintenanceType" minOccurs="0"/>
 *         &lt;element name="requestTimeOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxThroughput" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DriverPoolSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TaskMockDelayList" type="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}TaskMockDelayListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdapterConfigType", namespace = "http://www.tigo.com.hn/configuration/AdapterConfigType/V1", propOrder = {
    "driverConfig",
    "maitenanceConfig",
    "requestTimeOut",
    "maxThroughput",
    "driverPoolSize",
    "taskMockDelayList"
})
@XmlSeeAlso({
    AmsysAdapterConfigType.class,
    AS400AdapterConfigType.class,
    PrestamitoAdapterConfigType.class,
    BasicAdapterConfigType.class,
    BdoAdapterConfigType.class,
    BoomerangAdapterConfigType.class,
    CallLockingAdapterConfigType.class,
    CbsAdapterConfigType.class,
    CcwsAdapterConfigType.class,
    CDRAdapterConfigType.class,
    CkgAdapterConfigType.class,
    CleaningSubscriptionsAdapterConfigType.class,
    ComissionAdapterConfigType.class,
    ComissionPaquetigosAdapterConfigType.class,
    DeezerAdapterConfigType.class,
    DmsAdapterConfigType.class,
    DpiAdapterConfigType.class,
    ExchangeAdapterConfigType.class,
    ExchangeAS400AdapterConfigType.class,
    FulfillmentProxyConfigType.class,
    HIB20StatusAdapterConfigType.class,
    HssAdapterConfigType.class,
    IncentiveConsumptionAdapterConfigType.class,
    InternetIncompatibilityAdapterConfigType.class,
    IntrawayPublicIPAdapterConfigType.class,
    InvoiceAdapterConfigType.class,
    KannelAdapterConfigType.class,
    MasisaAdapterConfigType.class,
    MasterStatusAdapterConfigType.class,
    MobiquityAdapterConfigType.class,
    NotifyAdapterConfigType.class,
    PascAdapterConfigType.class,
    PlatformMappingConfigType.class,
    PretupsAdapterConfigType.class,
    PromotionAdapterConfigType.class,
    RbtAdapterConfigType.class,
    RoamingAdapterConfigType.class,
    ScheduleAdapterConfigType.class,
    SEAdapterConfigType.class,
    SimAdapterConfigType.class,
    SmsBlockerAdapterConfigType.class,
    SprAdapterConfigType.class,
    SprProxyAdapterConfigType.class,
    SubscriberACLAdapterConfigType.class,
    SubscriberLocationAdapterConfigType.class,
    TigoApiAdapterConfigType.class,
    TigoMoneyAdapterConfigType.class,
    TigoMoneyReverseTransactionAdapterConfigType.class,
    USSDAdapterConfigType.class,
    VasStatementAdapterConfigType.class,
    ZeroBalancePlatformAdapterConfigType.class
})
public class AdapterConfigType implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DriverConfig", required = true)
    protected DriverType driverConfig;
    @XmlElement(name = "MaitenanceConfig")
    protected MaintenanceType maitenanceConfig;
    protected int requestTimeOut;
    @XmlElement(name = "MaxThroughput")
    protected int maxThroughput;
    @XmlElement(name = "DriverPoolSize")
    protected int driverPoolSize;
    @XmlElement(name = "TaskMockDelayList")
    protected TaskMockDelayListType taskMockDelayList;

    /**
     * Obtiene el valor de la propiedad driverConfig.
     * 
     * @return
     *     possible object is
     *     {@link DriverType }
     *     
     */
    public DriverType getDriverConfig() {
        return driverConfig;
    }

    /**
     * Define el valor de la propiedad driverConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverType }
     *     
     */
    public void setDriverConfig(DriverType value) {
        this.driverConfig = value;
    }

    public boolean isSetDriverConfig() {
        return (this.driverConfig!= null);
    }

    /**
     * Obtiene el valor de la propiedad maitenanceConfig.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceType }
     *     
     */
    public MaintenanceType getMaitenanceConfig() {
        return maitenanceConfig;
    }

    /**
     * Define el valor de la propiedad maitenanceConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceType }
     *     
     */
    public void setMaitenanceConfig(MaintenanceType value) {
        this.maitenanceConfig = value;
    }

    public boolean isSetMaitenanceConfig() {
        return (this.maitenanceConfig!= null);
    }

    /**
     * Obtiene el valor de la propiedad requestTimeOut.
     * 
     */
    public int getRequestTimeOut() {
        return requestTimeOut;
    }

    /**
     * Define el valor de la propiedad requestTimeOut.
     * 
     */
    public void setRequestTimeOut(int value) {
        this.requestTimeOut = value;
    }

    public boolean isSetRequestTimeOut() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad maxThroughput.
     * 
     */
    public int getMaxThroughput() {
        return maxThroughput;
    }

    /**
     * Define el valor de la propiedad maxThroughput.
     * 
     */
    public void setMaxThroughput(int value) {
        this.maxThroughput = value;
    }

    public boolean isSetMaxThroughput() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad driverPoolSize.
     * 
     */
    public int getDriverPoolSize() {
        return driverPoolSize;
    }

    /**
     * Define el valor de la propiedad driverPoolSize.
     * 
     */
    public void setDriverPoolSize(int value) {
        this.driverPoolSize = value;
    }

    public boolean isSetDriverPoolSize() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad taskMockDelayList.
     * 
     * @return
     *     possible object is
     *     {@link TaskMockDelayListType }
     *     
     */
    public TaskMockDelayListType getTaskMockDelayList() {
        return taskMockDelayList;
    }

    /**
     * Define el valor de la propiedad taskMockDelayList.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskMockDelayListType }
     *     
     */
    public void setTaskMockDelayList(TaskMockDelayListType value) {
        this.taskMockDelayList = value;
    }

    public boolean isSetTaskMockDelayList() {
        return (this.taskMockDelayList!= null);
    }

}
