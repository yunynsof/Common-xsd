//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:30 AM CST 
//


package hn.com.tigo.josm.common.adapter.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hn.com.tigo.josm.common.adapter.dto package. 
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

    private final static QName _Parameters_QNAME = new QName("http://tigo.com/enterprise/resources/parameters/simple/v1/schema", "parameters");
    private final static QName _AttributeValuePair_QNAME = new QName("http://www.example.org/AttributeValuePair", "attributeValuePair");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hn.com.tigo.josm.common.adapter.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AttributeValuePair }
     * 
     */
    public AttributeValuePair createAttributeValuePair() {
        return new AttributeValuePair();
    }

    /**
     * Create an instance of {@link ParameterArray }
     * 
     */
    public ParameterArray createParameterArray() {
        return new ParameterArray();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link TaskRequestType }
     * 
     */
    public TaskRequestType createTaskRequestType() {
        return new TaskRequestType();
    }

    /**
     * Create an instance of {@link TaskResponseType }
     * 
     */
    public TaskResponseType createTaskResponseType() {
        return new TaskResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/enterprise/resources/parameters/simple/v1/schema", name = "parameters")
    public JAXBElement<ParameterArray> createParameters(ParameterArray value) {
        return new JAXBElement<ParameterArray>(_Parameters_QNAME, ParameterArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/AttributeValuePair", name = "attributeValuePair")
    public JAXBElement<AttributeValuePair> createAttributeValuePair(AttributeValuePair value) {
        return new JAXBElement<AttributeValuePair>(_AttributeValuePair_QNAME, AttributeValuePair.class, null, value);
    }

}
