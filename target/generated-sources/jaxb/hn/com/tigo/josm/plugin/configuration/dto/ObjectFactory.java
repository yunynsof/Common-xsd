//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.plugin.configuration.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hn.com.tigo.josm.plugin.configuration.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalendarPolicy_QNAME = new QName("http://www.tigo.com.hn/policy/calendar/V1", "calendarPolicy");
    private final static QName _Configuration_QNAME = new QName("http://tigo.com.hn/pluginconfiguration/V1", "configuration");
    private final static QName _Period_QNAME = new QName("http://www.tigo.com.hn/policy/type/period/V1", "period");
    private final static QName _AllowedStype_QNAME = new QName("http://www.tigo.com.hn/policy/stype/V1", "allowedStype");
    private final static QName _IpAclConfig_QNAME = new QName("http://www.tigo.com.hn/policy/ipAclConfig/V1", "ipAclConfig");
    private final static QName _ProductIncompatibility_QNAME = new QName("http://www.tigo.com.hn/policy/productincompatibility/V1", "productIncompatibility");
    private final static QName _AllowedCos_QNAME = new QName("http://www.tigo.com.hn/policy/cos/V1", "allowedCos");
    private final static QName _AllowedChannel_QNAME = new QName("http://www.tigo.com.hn/policy/channel/V1", "allowedChannel");
    private final static QName _TransactionLimit_QNAME = new QName("http://www.tigo.com.hn/policy/transaction/limit/V1", "transactionLimit");
    private final static QName _TransactionAmount_QNAME = new QName("http://www.tigo.com.hn/policy/transaction/amount/V1", "transactionAmount");
    private final static QName _IpAcl_QNAME = new QName("http://www.tigo.com.hn/policy/ipAcl/V1", "IpAcl");
    private final static QName _IpAclPolicy_QNAME = new QName("http://www.tigo.com.hn/policy/ipAcl/V1", "ipAclPolicy");
    private final static QName _SubscriberACLPolicyConfig_QNAME = new QName("http://tigo.com.hn/SubscriberACLPolicyConfig/V1", "subscriberACLPolicyConfig");
    private final static QName _SubscriberNumberPolicyConfig_QNAME = new QName("http://tigo.com.hn/SubscriberNumberPolicyConfig/V1", "subscriberNumberPolicyConfig");
    private final static QName _DosPolicyConfig_QNAME = new QName("http://www.tigo.com.hn/policy/dos/V1", "dosPolicyConfig");
    private final static QName _AllowedMaster_QNAME = new QName("http://www.tigo.com.hn/policy/master/V1", "allowedMaster");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hn.com.tigo.josm.plugin.configuration.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalendarPolicy }
     * 
     */
    public CalendarPolicy createCalendarPolicy() {
        return new CalendarPolicy();
    }

    /**
     * Create an instance of {@link ConfigurationType }
     * 
     */
    public ConfigurationType createConfigurationType() {
        return new ConfigurationType();
    }

    /**
     * Create an instance of {@link Interval }
     * 
     */
    public Interval createInterval() {
        return new Interval();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link PluginConfigurationResponse }
     * 
     */
    public PluginConfigurationResponse createPluginConfigurationResponse() {
        return new PluginConfigurationResponse();
    }

    /**
     * Create an instance of {@link AllowedChannel }
     * 
     */
    public AllowedChannel createAllowedChannel() {
        return new AllowedChannel();
    }

    /**
     * Create an instance of {@link ProductChannels }
     * 
     */
    public ProductChannels createProductChannels() {
        return new ProductChannels();
    }

    /**
     * Create an instance of {@link AllowedCos }
     * 
     */
    public AllowedCos createAllowedCos() {
        return new AllowedCos();
    }

    /**
     * Create an instance of {@link DosPolicyConfig }
     * 
     */
    public DosPolicyConfig createDosPolicyConfig() {
        return new DosPolicyConfig();
    }

    /**
     * Create an instance of {@link IpAclConfig }
     * 
     */
    public IpAclConfig createIpAclConfig() {
        return new IpAclConfig();
    }

    /**
     * Create an instance of {@link IpAcl }
     * 
     */
    public IpAcl createIpAcl() {
        return new IpAcl();
    }

    /**
     * Create an instance of {@link IpAclPolicy }
     * 
     */
    public IpAclPolicy createIpAclPolicy() {
        return new IpAclPolicy();
    }

    /**
     * Create an instance of {@link AllowedMaster }
     * 
     */
    public AllowedMaster createAllowedMaster() {
        return new AllowedMaster();
    }

    /**
     * Create an instance of {@link PluginConfigurationType }
     * 
     */
    public PluginConfigurationType createPluginConfigurationType() {
        return new PluginConfigurationType();
    }

    /**
     * Create an instance of {@link PolicyXsdArray }
     * 
     */
    public PolicyXsdArray createPolicyXsdArray() {
        return new PolicyXsdArray();
    }

    /**
     * Create an instance of {@link ProductIncompatibility }
     * 
     */
    public ProductIncompatibility createProductIncompatibility() {
        return new ProductIncompatibility();
    }

    /**
     * Create an instance of {@link SubscriberACLPolicyConfig }
     * 
     */
    public SubscriberACLPolicyConfig createSubscriberACLPolicyConfig() {
        return new SubscriberACLPolicyConfig();
    }

    /**
     * Create an instance of {@link SubscriberArray }
     * 
     */
    public SubscriberArray createSubscriberArray() {
        return new SubscriberArray();
    }

    /**
     * Create an instance of {@link SubscriberNumberPolicyConfig }
     * 
     */
    public SubscriberNumberPolicyConfig createSubscriberNumberPolicyConfig() {
        return new SubscriberNumberPolicyConfig();
    }

    /**
     * Create an instance of {@link AllowedStype }
     * 
     */
    public AllowedStype createAllowedStype() {
        return new AllowedStype();
    }

    /**
     * Create an instance of {@link TransactionAmount }
     * 
     */
    public TransactionAmount createTransactionAmount() {
        return new TransactionAmount();
    }

    /**
     * Create an instance of {@link TransactionLimit }
     * 
     */
    public TransactionLimit createTransactionLimit() {
        return new TransactionLimit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalendarPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/policy/calendar/V1", name = "calendarPolicy", substitutionHeadNamespace = "http://tigo.com.hn/pluginconfiguration/V1", substitutionHeadName = "configuration")
    public JAXBElement<CalendarPolicy> createCalendarPolicy(CalendarPolicy value) {
        return new JAXBElement<CalendarPolicy>(_CalendarPolicy_QNAME, CalendarPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/pluginconfiguration/V1", name = "configuration")
    public JAXBElement<ConfigurationType> createConfiguration(ConfigurationType value) {
        return new JAXBElement<ConfigurationType>(_Configuration_QNAME, ConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/policy/type/period/V1", name = "period")
    public JAXBElement<PeriodType> createPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_Period_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowedStype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/policy/stype/V1", name = "allowedStype", substitutionHeadNamespace = "http://tigo.com.hn/pluginconfiguration/V1", substitutionHeadName = "configuration")
    public JAXBElement<AllowedStype> createAllowedStype(AllowedStype value) {
        return new JAXBElement<AllowedStype>(_AllowedStype_QNAME, AllowedStype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IpAclConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/policy/ipAclConfig/V1", name = "ipAclConfig", substitutionHeadNamespace = "http://tigo.com.hn/pluginconfiguration/V1", substitutionHeadName = "configuration")
    public JAXBElement<IpAclConfig> createIpAclConfig(IpAclConfig value) {
        return new JAXBElement<IpAclConfig>(_IpAclConfig_QNAME, IpAclConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductIncompatibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/policy/productincompatibility/V1", name = "productIncompatibility", substitutionHeadNamespace = "http://tigo.com.hn/pluginconfiguration/V1", substitutionHeadName = "configuration")
    public JAXBElement<ProductIncompatibility> createProductIncompatibility(ProductIncompatibility value) {
        return new JAXBElement<ProductIncompatibility>(_ProductIncompatibility_QNAME, ProductIncompatibility.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowedCos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/policy/cos/V1", name = "allowedCos", substitutionHeadNamespace = "http://tigo.com.hn/pluginconfiguration/V1", substitutionHeadName = "configuration")
    public JAXBElement<AllowedCos> createAllowedCos(AllowedCos value) {
        return new JAXBElement<AllowedCos>(_AllowedCos_QNAME, AllowedCos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowedChannel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/policy/channel/V1", name = "allowedChannel", substitutionHeadNamespace = "http://tigo.com.hn/pluginconfiguration/V1", substitutionHeadName = "configuration")
    public JAXBElement<AllowedChannel> createAllowedChannel(AllowedChannel value) {
        return new JAXBElement<AllowedChannel>(_AllowedChannel_QNAME, AllowedChannel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionLimit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/policy/transaction/limit/V1", name = "transactionLimit", substitutionHeadNamespace = "http://tigo.com.hn/pluginconfiguration/V1", substitutionHeadName = "configuration")
    public JAXBElement<TransactionLimit> createTransactionLimit(TransactionLimit value) {
        return new JAXBElement<TransactionLimit>(_TransactionLimit_QNAME, TransactionLimit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/policy/transaction/amount/V1", name = "transactionAmount", substitutionHeadNamespace = "http://tigo.com.hn/pluginconfiguration/V1", substitutionHeadName = "configuration")
    public JAXBElement<TransactionAmount> createTransactionAmount(TransactionAmount value) {
        return new JAXBElement<TransactionAmount>(_TransactionAmount_QNAME, TransactionAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IpAcl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/policy/ipAcl/V1", name = "IpAcl")
    public JAXBElement<IpAcl> createIpAcl(IpAcl value) {
        return new JAXBElement<IpAcl>(_IpAcl_QNAME, IpAcl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IpAclPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/policy/ipAcl/V1", name = "ipAclPolicy", substitutionHeadNamespace = "http://tigo.com.hn/pluginconfiguration/V1", substitutionHeadName = "configuration")
    public JAXBElement<IpAclPolicy> createIpAclPolicy(IpAclPolicy value) {
        return new JAXBElement<IpAclPolicy>(_IpAclPolicy_QNAME, IpAclPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriberACLPolicyConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/SubscriberACLPolicyConfig/V1", name = "subscriberACLPolicyConfig", substitutionHeadNamespace = "http://tigo.com.hn/pluginconfiguration/V1", substitutionHeadName = "configuration")
    public JAXBElement<SubscriberACLPolicyConfig> createSubscriberACLPolicyConfig(SubscriberACLPolicyConfig value) {
        return new JAXBElement<SubscriberACLPolicyConfig>(_SubscriberACLPolicyConfig_QNAME, SubscriberACLPolicyConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriberNumberPolicyConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/SubscriberNumberPolicyConfig/V1", name = "subscriberNumberPolicyConfig", substitutionHeadNamespace = "http://tigo.com.hn/pluginconfiguration/V1", substitutionHeadName = "configuration")
    public JAXBElement<SubscriberNumberPolicyConfig> createSubscriberNumberPolicyConfig(SubscriberNumberPolicyConfig value) {
        return new JAXBElement<SubscriberNumberPolicyConfig>(_SubscriberNumberPolicyConfig_QNAME, SubscriberNumberPolicyConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DosPolicyConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/policy/dos/V1", name = "dosPolicyConfig", substitutionHeadNamespace = "http://tigo.com.hn/pluginconfiguration/V1", substitutionHeadName = "configuration")
    public JAXBElement<DosPolicyConfig> createDosPolicyConfig(DosPolicyConfig value) {
        return new JAXBElement<DosPolicyConfig>(_DosPolicyConfig_QNAME, DosPolicyConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowedMaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/policy/master/V1", name = "allowedMaster", substitutionHeadNamespace = "http://tigo.com.hn/pluginconfiguration/V1", substitutionHeadName = "configuration")
    public JAXBElement<AllowedMaster> createAllowedMaster(AllowedMaster value) {
        return new JAXBElement<AllowedMaster>(_AllowedMaster_QNAME, AllowedMaster.class, null, value);
    }

}
