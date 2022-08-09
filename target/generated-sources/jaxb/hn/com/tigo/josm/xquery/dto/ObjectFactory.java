//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.xquery.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hn.com.tigo.josm.xquery.dto package. 
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

    private final static QName _XqueryConfiguration_QNAME = new QName("http://tigo.com/josm/xquery/XqueryConfiguration/V1", "xqueryConfiguration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hn.com.tigo.josm.xquery.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XqueryConfiguration }
     * 
     */
    public XqueryConfiguration createXqueryConfiguration() {
        return new XqueryConfiguration();
    }

    /**
     * Create an instance of {@link Datasource }
     * 
     */
    public Datasource createDatasource() {
        return new Datasource();
    }

    /**
     * Create an instance of {@link Datasources }
     * 
     */
    public Datasources createDatasources() {
        return new Datasources();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XqueryConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/xquery/XqueryConfiguration/V1", name = "xqueryConfiguration")
    public JAXBElement<XqueryConfiguration> createXqueryConfiguration(XqueryConfiguration value) {
        return new JAXBElement<XqueryConfiguration>(_XqueryConfiguration_QNAME, XqueryConfiguration.class, null, value);
    }

}
