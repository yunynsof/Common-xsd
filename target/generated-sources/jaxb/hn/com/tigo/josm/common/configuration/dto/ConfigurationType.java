//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConfigurationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="configExpiration" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://www.tigo.com.hn/configuration/AdapterConfigType/V1}AdapterConfig" minOccurs="0"/>
 *         &lt;element name="GatewayType" type="{http://tigo.com.hn/gatewayConfig/V1}GatewayConfig" minOccurs="0"/>
 *         &lt;element name="BrokerType" type="{http://tigo.com.hn/BrokerConfig/V1}BrokerConfig" minOccurs="0"/>
 *         &lt;element name="OrchestratorType" type="{http://tigo.com.hn/OrchestratorConfig/V1}OrchestratorConfig" minOccurs="0"/>
 *         &lt;element name="AutoCorrectType" type="{http://tigo.com.hn/autoCorrect/V1}AutoCorrectType" minOccurs="0"/>
 *         &lt;element ref="{http://tigo.com.hn/ProxyConfigType/V1}ProxyConfig" minOccurs="0"/>
 *         &lt;element name="partitioningMasterStatusType" type="{http://www.example.org/PartitioningMasterStatus}PartitioningMasterStatus" minOccurs="0"/>
 *         &lt;element name="partitioningType" type="{http://www.tigo.com.hn/persistence/partitioing/V1}Partitioning" minOccurs="0"/>
 *         &lt;element name="configurationType" type="{http://www.tigo.com.hn/persistence/Configuration/V1}Configuration" minOccurs="0"/>
 *         &lt;element name="schedulerType" type="{http://tigo.com.hn/scheduler/configuration/V1}SchedulerConfiguration" minOccurs="0"/>
 *         &lt;element name="balanceType" type="{http://tigo.com.hn/scheduler/balancing/V1}Balancing" minOccurs="0"/>
 *         &lt;element name="httpClientType" type="{http://tigo.com.hn/scheduler/configuration/V1}HttpClientConfiguration" minOccurs="0"/>
 *         &lt;element name="serviceTaskType" type="{http://tigo.com.hn/ServiceTask/V1}ServiceTaskType" minOccurs="0"/>
 *         &lt;element name="xqueryConfiguration" type="{http://tigo.com/josm/xquery/XqueryConfiguration/V1}XqueryConfiguration" minOccurs="0"/>
 *         &lt;element name="PromotionEngineConfig" type="{http://tigo.com.hn/PromotionEngine/PromotionEngineConfig/V1}promotionEngineConfig" minOccurs="0"/>
 *         &lt;element name="DatabaseErrorCodeType" type="{http://tigo.com.hn/persistence/DatabaseErrorMapping/v1}databaseErrorMap" minOccurs="0"/>
 *         &lt;element name="JOSMServiceType" type="{http://tigo.com.hn/configuration/JOSMServiceConfiguration/V1}UrlDetailService" minOccurs="0"/>
 *         &lt;element name="DatabaseErrorMapType" type="{http://tigo.com.hn/persistence/DatabaseErrorMappingMap/v1}dataBaseErrorMappingMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationType", namespace = "http://www.tigo.com.hn/ResponseJOSM", propOrder = {
    "configExpiration",
    "adapterConfig",
    "gatewayType",
    "brokerType",
    "orchestratorType",
    "autoCorrectType",
    "proxyConfig",
    "partitioningMasterStatusType",
    "partitioningType",
    "configurationType",
    "schedulerType",
    "balanceType",
    "httpClientType",
    "serviceTaskType",
    "xqueryConfiguration",
    "promotionEngineConfig",
    "databaseErrorCodeType",
    "josmServiceType",
    "databaseErrorMapType"
})
public class ConfigurationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long configExpiration;
    @XmlElementRef(name = "AdapterConfig", namespace = "http://www.tigo.com.hn/configuration/AdapterConfigType/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AdapterConfigType> adapterConfig;
    @XmlElement(name = "GatewayType")
    protected GatewayConfig gatewayType;
    @XmlElement(name = "BrokerType")
    protected BrokerConfig brokerType;
    @XmlElement(name = "OrchestratorType")
    protected OrchestratorConfig orchestratorType;
    @XmlElement(name = "AutoCorrectType")
    protected AutoCorrectType autoCorrectType;
    @XmlElementRef(name = "ProxyConfig", namespace = "http://tigo.com.hn/ProxyConfigType/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ProxyConfigType> proxyConfig;
    protected PartitioningMasterStatus partitioningMasterStatusType;
    protected Partitioning partitioningType;
    protected Configuration configurationType;
    protected SchedulerConfiguration schedulerType;
    protected Balancing balanceType;
    protected HttpClientConfiguration httpClientType;
    protected ServiceTaskType serviceTaskType;
    protected XqueryConfiguration xqueryConfiguration;
    @XmlElement(name = "PromotionEngineConfig")
    protected PromotionEngineConfig promotionEngineConfig;
    @XmlElement(name = "DatabaseErrorCodeType")
    protected DatabaseErrorMap databaseErrorCodeType;
    @XmlElement(name = "JOSMServiceType")
    protected UrlDetailService josmServiceType;
    @XmlElement(name = "DatabaseErrorMapType")
    protected DataBaseErrorMappingMap databaseErrorMapType;

    /**
     * Obtiene el valor de la propiedad configExpiration.
     * 
     */
    public long getConfigExpiration() {
        return configExpiration;
    }

    /**
     * Define el valor de la propiedad configExpiration.
     * 
     */
    public void setConfigExpiration(long value) {
        this.configExpiration = value;
    }

    public boolean isSetConfigExpiration() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad adapterConfig.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComissionPaquetigosAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CcwsAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlatformMappingConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobiquityAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComissionAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZeroBalancePlatformAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HIB20StatusAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CDRAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AS400AdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CleaningSubscriptionsAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PretupsAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfillmentProxyConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PascAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SEAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PromotionAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InternetIncompatibilityAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoomerangAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DmsAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IncentiveConsumptionAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InvoiceAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HssAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MasisaAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link KannelAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotifyAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BdoAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MasterStatusAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeAS400AdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CbsAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntrawayPublicIPAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubscriberLocationAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SmsBlockerAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubscriberACLAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SprAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoamingAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CkgAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RbtAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeezerAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SprProxyAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrestamitoAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link USSDAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TigoApiAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VasStatementAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AmsysAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TigoMoneyAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BasicAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CallLockingAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TigoMoneyReverseTransactionAdapterConfigType }{@code >}
     *     
     */
    public JAXBElement<? extends AdapterConfigType> getAdapterConfig() {
        return adapterConfig;
    }

    /**
     * Define el valor de la propiedad adapterConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComissionPaquetigosAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CcwsAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlatformMappingConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobiquityAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComissionAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZeroBalancePlatformAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HIB20StatusAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CDRAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AS400AdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CleaningSubscriptionsAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PretupsAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfillmentProxyConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PascAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SEAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PromotionAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InternetIncompatibilityAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoomerangAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DmsAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IncentiveConsumptionAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InvoiceAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HssAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MasisaAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link KannelAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotifyAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BdoAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MasterStatusAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeAS400AdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CbsAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntrawayPublicIPAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubscriberLocationAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SmsBlockerAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubscriberACLAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SprAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoamingAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CkgAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RbtAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeezerAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SprProxyAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrestamitoAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link USSDAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TigoApiAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VasStatementAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AmsysAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TigoMoneyAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BasicAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CallLockingAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimAdapterConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TigoMoneyReverseTransactionAdapterConfigType }{@code >}
     *     
     */
    public void setAdapterConfig(JAXBElement<? extends AdapterConfigType> value) {
        this.adapterConfig = value;
    }

    public boolean isSetAdapterConfig() {
        return (this.adapterConfig!= null);
    }

    /**
     * Obtiene el valor de la propiedad gatewayType.
     * 
     * @return
     *     possible object is
     *     {@link GatewayConfig }
     *     
     */
    public GatewayConfig getGatewayType() {
        return gatewayType;
    }

    /**
     * Define el valor de la propiedad gatewayType.
     * 
     * @param value
     *     allowed object is
     *     {@link GatewayConfig }
     *     
     */
    public void setGatewayType(GatewayConfig value) {
        this.gatewayType = value;
    }

    public boolean isSetGatewayType() {
        return (this.gatewayType!= null);
    }

    /**
     * Obtiene el valor de la propiedad brokerType.
     * 
     * @return
     *     possible object is
     *     {@link BrokerConfig }
     *     
     */
    public BrokerConfig getBrokerType() {
        return brokerType;
    }

    /**
     * Define el valor de la propiedad brokerType.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerConfig }
     *     
     */
    public void setBrokerType(BrokerConfig value) {
        this.brokerType = value;
    }

    public boolean isSetBrokerType() {
        return (this.brokerType!= null);
    }

    /**
     * Obtiene el valor de la propiedad orchestratorType.
     * 
     * @return
     *     possible object is
     *     {@link OrchestratorConfig }
     *     
     */
    public OrchestratorConfig getOrchestratorType() {
        return orchestratorType;
    }

    /**
     * Define el valor de la propiedad orchestratorType.
     * 
     * @param value
     *     allowed object is
     *     {@link OrchestratorConfig }
     *     
     */
    public void setOrchestratorType(OrchestratorConfig value) {
        this.orchestratorType = value;
    }

    public boolean isSetOrchestratorType() {
        return (this.orchestratorType!= null);
    }

    /**
     * Obtiene el valor de la propiedad autoCorrectType.
     * 
     * @return
     *     possible object is
     *     {@link AutoCorrectType }
     *     
     */
    public AutoCorrectType getAutoCorrectType() {
        return autoCorrectType;
    }

    /**
     * Define el valor de la propiedad autoCorrectType.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoCorrectType }
     *     
     */
    public void setAutoCorrectType(AutoCorrectType value) {
        this.autoCorrectType = value;
    }

    public boolean isSetAutoCorrectType() {
        return (this.autoCorrectType!= null);
    }

    /**
     * Obtiene el valor de la propiedad proxyConfig.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProxyUSSDConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProxyConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProxyAS400ConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProxyMobiquityConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProxyKannelConfigType }{@code >}
     *     
     */
    public JAXBElement<? extends ProxyConfigType> getProxyConfig() {
        return proxyConfig;
    }

    /**
     * Define el valor de la propiedad proxyConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProxyUSSDConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProxyConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProxyAS400ConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProxyMobiquityConfigType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProxyKannelConfigType }{@code >}
     *     
     */
    public void setProxyConfig(JAXBElement<? extends ProxyConfigType> value) {
        this.proxyConfig = value;
    }

    public boolean isSetProxyConfig() {
        return (this.proxyConfig!= null);
    }

    /**
     * Obtiene el valor de la propiedad partitioningMasterStatusType.
     * 
     * @return
     *     possible object is
     *     {@link PartitioningMasterStatus }
     *     
     */
    public PartitioningMasterStatus getPartitioningMasterStatusType() {
        return partitioningMasterStatusType;
    }

    /**
     * Define el valor de la propiedad partitioningMasterStatusType.
     * 
     * @param value
     *     allowed object is
     *     {@link PartitioningMasterStatus }
     *     
     */
    public void setPartitioningMasterStatusType(PartitioningMasterStatus value) {
        this.partitioningMasterStatusType = value;
    }

    public boolean isSetPartitioningMasterStatusType() {
        return (this.partitioningMasterStatusType!= null);
    }

    /**
     * Obtiene el valor de la propiedad partitioningType.
     * 
     * @return
     *     possible object is
     *     {@link Partitioning }
     *     
     */
    public Partitioning getPartitioningType() {
        return partitioningType;
    }

    /**
     * Define el valor de la propiedad partitioningType.
     * 
     * @param value
     *     allowed object is
     *     {@link Partitioning }
     *     
     */
    public void setPartitioningType(Partitioning value) {
        this.partitioningType = value;
    }

    public boolean isSetPartitioningType() {
        return (this.partitioningType!= null);
    }

    /**
     * Obtiene el valor de la propiedad configurationType.
     * 
     * @return
     *     possible object is
     *     {@link Configuration }
     *     
     */
    public Configuration getConfigurationType() {
        return configurationType;
    }

    /**
     * Define el valor de la propiedad configurationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Configuration }
     *     
     */
    public void setConfigurationType(Configuration value) {
        this.configurationType = value;
    }

    public boolean isSetConfigurationType() {
        return (this.configurationType!= null);
    }

    /**
     * Obtiene el valor de la propiedad schedulerType.
     * 
     * @return
     *     possible object is
     *     {@link SchedulerConfiguration }
     *     
     */
    public SchedulerConfiguration getSchedulerType() {
        return schedulerType;
    }

    /**
     * Define el valor de la propiedad schedulerType.
     * 
     * @param value
     *     allowed object is
     *     {@link SchedulerConfiguration }
     *     
     */
    public void setSchedulerType(SchedulerConfiguration value) {
        this.schedulerType = value;
    }

    public boolean isSetSchedulerType() {
        return (this.schedulerType!= null);
    }

    /**
     * Obtiene el valor de la propiedad balanceType.
     * 
     * @return
     *     possible object is
     *     {@link Balancing }
     *     
     */
    public Balancing getBalanceType() {
        return balanceType;
    }

    /**
     * Define el valor de la propiedad balanceType.
     * 
     * @param value
     *     allowed object is
     *     {@link Balancing }
     *     
     */
    public void setBalanceType(Balancing value) {
        this.balanceType = value;
    }

    public boolean isSetBalanceType() {
        return (this.balanceType!= null);
    }

    /**
     * Obtiene el valor de la propiedad httpClientType.
     * 
     * @return
     *     possible object is
     *     {@link HttpClientConfiguration }
     *     
     */
    public HttpClientConfiguration getHttpClientType() {
        return httpClientType;
    }

    /**
     * Define el valor de la propiedad httpClientType.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpClientConfiguration }
     *     
     */
    public void setHttpClientType(HttpClientConfiguration value) {
        this.httpClientType = value;
    }

    public boolean isSetHttpClientType() {
        return (this.httpClientType!= null);
    }

    /**
     * Obtiene el valor de la propiedad serviceTaskType.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTaskType }
     *     
     */
    public ServiceTaskType getServiceTaskType() {
        return serviceTaskType;
    }

    /**
     * Define el valor de la propiedad serviceTaskType.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTaskType }
     *     
     */
    public void setServiceTaskType(ServiceTaskType value) {
        this.serviceTaskType = value;
    }

    public boolean isSetServiceTaskType() {
        return (this.serviceTaskType!= null);
    }

    /**
     * Obtiene el valor de la propiedad xqueryConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link XqueryConfiguration }
     *     
     */
    public XqueryConfiguration getXqueryConfiguration() {
        return xqueryConfiguration;
    }

    /**
     * Define el valor de la propiedad xqueryConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link XqueryConfiguration }
     *     
     */
    public void setXqueryConfiguration(XqueryConfiguration value) {
        this.xqueryConfiguration = value;
    }

    public boolean isSetXqueryConfiguration() {
        return (this.xqueryConfiguration!= null);
    }

    /**
     * Obtiene el valor de la propiedad promotionEngineConfig.
     * 
     * @return
     *     possible object is
     *     {@link PromotionEngineConfig }
     *     
     */
    public PromotionEngineConfig getPromotionEngineConfig() {
        return promotionEngineConfig;
    }

    /**
     * Define el valor de la propiedad promotionEngineConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionEngineConfig }
     *     
     */
    public void setPromotionEngineConfig(PromotionEngineConfig value) {
        this.promotionEngineConfig = value;
    }

    public boolean isSetPromotionEngineConfig() {
        return (this.promotionEngineConfig!= null);
    }

    /**
     * Obtiene el valor de la propiedad databaseErrorCodeType.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseErrorMap }
     *     
     */
    public DatabaseErrorMap getDatabaseErrorCodeType() {
        return databaseErrorCodeType;
    }

    /**
     * Define el valor de la propiedad databaseErrorCodeType.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseErrorMap }
     *     
     */
    public void setDatabaseErrorCodeType(DatabaseErrorMap value) {
        this.databaseErrorCodeType = value;
    }

    public boolean isSetDatabaseErrorCodeType() {
        return (this.databaseErrorCodeType!= null);
    }

    /**
     * Obtiene el valor de la propiedad josmServiceType.
     * 
     * @return
     *     possible object is
     *     {@link UrlDetailService }
     *     
     */
    public UrlDetailService getJOSMServiceType() {
        return josmServiceType;
    }

    /**
     * Define el valor de la propiedad josmServiceType.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlDetailService }
     *     
     */
    public void setJOSMServiceType(UrlDetailService value) {
        this.josmServiceType = value;
    }

    public boolean isSetJOSMServiceType() {
        return (this.josmServiceType!= null);
    }

    /**
     * Obtiene el valor de la propiedad databaseErrorMapType.
     * 
     * @return
     *     possible object is
     *     {@link DataBaseErrorMappingMap }
     *     
     */
    public DataBaseErrorMappingMap getDatabaseErrorMapType() {
        return databaseErrorMapType;
    }

    /**
     * Define el valor de la propiedad databaseErrorMapType.
     * 
     * @param value
     *     allowed object is
     *     {@link DataBaseErrorMappingMap }
     *     
     */
    public void setDatabaseErrorMapType(DataBaseErrorMappingMap value) {
        this.databaseErrorMapType = value;
    }

    public boolean isSetDatabaseErrorMapType() {
        return (this.databaseErrorMapType!= null);
    }

}
