//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.scheduler.configuration.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hn.com.tigo.josm.scheduler.configuration.dto package. 
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

    private final static QName _SchedulerConfiguration_QNAME = new QName("http://tigo.com.hn/scheduler/configuration/V1", "schedulerConfiguration");
    private final static QName _HttpClientConfiguration_QNAME = new QName("http://tigo.com.hn/scheduler/configuration/V1", "httpClientConfiguration");
    private final static QName _Balancing_QNAME = new QName("http://tigo.com.hn/scheduler/balancing/V1", "balancing");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hn.com.tigo.josm.scheduler.configuration.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Balancing }
     * 
     */
    public Balancing createBalancing() {
        return new Balancing();
    }

    /**
     * Create an instance of {@link ComplexBalancing }
     * 
     */
    public ComplexBalancing createComplexBalancing() {
        return new ComplexBalancing();
    }

    /**
     * Create an instance of {@link Balance }
     * 
     */
    public Balance createBalance() {
        return new Balance();
    }

    /**
     * Create an instance of {@link HttpClientConfiguration }
     * 
     */
    public HttpClientConfiguration createHttpClientConfiguration() {
        return new HttpClientConfiguration();
    }

    /**
     * Create an instance of {@link SchedulerConfiguration }
     * 
     */
    public SchedulerConfiguration createSchedulerConfiguration() {
        return new SchedulerConfiguration();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchedulerConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/scheduler/configuration/V1", name = "schedulerConfiguration")
    public JAXBElement<SchedulerConfiguration> createSchedulerConfiguration(SchedulerConfiguration value) {
        return new JAXBElement<SchedulerConfiguration>(_SchedulerConfiguration_QNAME, SchedulerConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HttpClientConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/scheduler/configuration/V1", name = "httpClientConfiguration")
    public JAXBElement<HttpClientConfiguration> createHttpClientConfiguration(HttpClientConfiguration value) {
        return new JAXBElement<HttpClientConfiguration>(_HttpClientConfiguration_QNAME, HttpClientConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Balancing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/scheduler/balancing/V1", name = "balancing")
    public JAXBElement<Balancing> createBalancing(Balancing value) {
        return new JAXBElement<Balancing>(_Balancing_QNAME, Balancing.class, null, value);
    }

}
