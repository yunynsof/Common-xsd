//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.common.proxy.mobiquity.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hn.com.tigo.josm.common.proxy.mobiquity.dto package. 
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

    private final static QName _ProxyMobiquityRequest_QNAME = new QName("http://tigo.com.hn/ProxyMobiquityRequest/V1", "ProxyMobiquityRequest");
    private final static QName _NonVoucherRechargeExtended_QNAME = new QName("http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1", "NonVoucherRechargeExtended");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hn.com.tigo.josm.common.proxy.mobiquity.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NonVoucherRechargeExtended }
     * 
     */
    public NonVoucherRechargeExtended createNonVoucherRechargeExtended() {
        return new NonVoucherRechargeExtended();
    }

    /**
     * Create an instance of {@link ProxyMobiquityRequestType }
     * 
     */
    public ProxyMobiquityRequestType createProxyMobiquityRequestType() {
        return new ProxyMobiquityRequestType();
    }

    /**
     * Create an instance of {@link MobiquityNonVoucherRecharge }
     * 
     */
    public MobiquityNonVoucherRecharge createMobiquityNonVoucherRecharge() {
        return new MobiquityNonVoucherRecharge();
    }

    /**
     * Create an instance of {@link MobiquityRetrieveSubscriber }
     * 
     */
    public MobiquityRetrieveSubscriber createMobiquityRetrieveSubscriber() {
        return new MobiquityRetrieveSubscriber();
    }

    /**
     * Create an instance of {@link MobiquityCreditAccount }
     * 
     */
    public MobiquityCreditAccount createMobiquityCreditAccount() {
        return new MobiquityCreditAccount();
    }

    /**
     * Create an instance of {@link SubCreditBalances }
     * 
     */
    public SubCreditBalances createSubCreditBalances() {
        return new SubCreditBalances();
    }

    /**
     * Create an instance of {@link BalanceCreditAccount }
     * 
     */
    public BalanceCreditAccount createBalanceCreditAccount() {
        return new BalanceCreditAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProxyMobiquityRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/ProxyMobiquityRequest/V1", name = "ProxyMobiquityRequest")
    public JAXBElement<ProxyMobiquityRequestType> createProxyMobiquityRequest(ProxyMobiquityRequestType value) {
        return new JAXBElement<ProxyMobiquityRequestType>(_ProxyMobiquityRequest_QNAME, ProxyMobiquityRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonVoucherRechargeExtended }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/ProxyMobiquityNonVoucherRecharge/V1", name = "NonVoucherRechargeExtended", substitutionHeadNamespace = "http://tigo.com.hn/ProxyMobiquityRequest/V1", substitutionHeadName = "ProxyMobiquityRequest")
    public JAXBElement<NonVoucherRechargeExtended> createNonVoucherRechargeExtended(NonVoucherRechargeExtended value) {
        return new JAXBElement<NonVoucherRechargeExtended>(_NonVoucherRechargeExtended_QNAME, NonVoucherRechargeExtended.class, null, value);
    }

}
