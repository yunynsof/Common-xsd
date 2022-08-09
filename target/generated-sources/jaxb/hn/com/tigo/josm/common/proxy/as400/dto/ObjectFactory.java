//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.common.proxy.as400.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hn.com.tigo.josm.common.proxy.as400.dto package. 
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

    private final static QName _ProxyAction_QNAME = new QName("http://tigo.com.hn/ProxyActions/V1", "proxyAction");
    private final static QName _ProxyService_QNAME = new QName("http://tigo.com.hn/ProxyServices/V1", "proxyService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hn.com.tigo.josm.common.proxy.as400.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProxyActionArray }
     * 
     */
    public ProxyActionArray createProxyActionArray() {
        return new ProxyActionArray();
    }

    /**
     * Create an instance of {@link ProxyActionType }
     * 
     */
    public ProxyActionType createProxyActionType() {
        return new ProxyActionType();
    }

    /**
     * Create an instance of {@link ProxyActionParameterArray }
     * 
     */
    public ProxyActionParameterArray createProxyActionParameterArray() {
        return new ProxyActionParameterArray();
    }

    /**
     * Create an instance of {@link ProxyActionParameterType }
     * 
     */
    public ProxyActionParameterType createProxyActionParameterType() {
        return new ProxyActionParameterType();
    }

    /**
     * Create an instance of {@link ProxyAs400RequestType }
     * 
     */
    public ProxyAs400RequestType createProxyAs400RequestType() {
        return new ProxyAs400RequestType();
    }

    /**
     * Create an instance of {@link Keys }
     * 
     */
    public Keys createKeys() {
        return new Keys();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link Services }
     * 
     */
    public Services createServices() {
        return new Services();
    }

    /**
     * Create an instance of {@link ProxyServiceArray }
     * 
     */
    public ProxyServiceArray createProxyServiceArray() {
        return new ProxyServiceArray();
    }

    /**
     * Create an instance of {@link Personalitations }
     * 
     */
    public Personalitations createPersonalitations() {
        return new Personalitations();
    }

    /**
     * Create an instance of {@link Fnum }
     * 
     */
    public Fnum createFnum() {
        return new Fnum();
    }

    /**
     * Create an instance of {@link ProxyParameterType }
     * 
     */
    public ProxyParameterType createProxyParameterType() {
        return new ProxyParameterType();
    }

    /**
     * Create an instance of {@link ProxyServiceType }
     * 
     */
    public ProxyServiceType createProxyServiceType() {
        return new ProxyServiceType();
    }

    /**
     * Create an instance of {@link ProxyParameterArray }
     * 
     */
    public ProxyParameterArray createProxyParameterArray() {
        return new ProxyParameterArray();
    }

    /**
     * Create an instance of {@link ProxyAs400ResponseType }
     * 
     */
    public ProxyAs400ResponseType createProxyAs400ResponseType() {
        return new ProxyAs400ResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProxyActionArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/ProxyActions/V1", name = "proxyAction")
    public JAXBElement<ProxyActionArray> createProxyAction(ProxyActionArray value) {
        return new JAXBElement<ProxyActionArray>(_ProxyAction_QNAME, ProxyActionArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProxyServiceArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/ProxyServices/V1", name = "proxyService")
    public JAXBElement<ProxyServiceArray> createProxyService(ProxyServiceArray value) {
        return new JAXBElement<ProxyServiceArray>(_ProxyService_QNAME, ProxyServiceArray.class, null, value);
    }

}
