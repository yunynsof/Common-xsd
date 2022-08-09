//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.rule.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hn.com.tigo.josm.rule.dto package. 
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

    private final static QName _RuleResponse_QNAME = new QName("http://tigo.com/josm/rule/service/V1", "ruleResponse");
    private final static QName _RuleEngineException_QNAME = new QName("http://tigo.com/josm/rule/service/V1", "ruleEngineException");
    private final static QName _RuleRequest_QNAME = new QName("http://tigo.com/josm/rule/service/V1", "ruleRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hn.com.tigo.josm.rule.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RuleRequest }
     * 
     */
    public RuleRequest createRuleRequest() {
        return new RuleRequest();
    }

    /**
     * Create an instance of {@link RuleEngineException }
     * 
     */
    public RuleEngineException createRuleEngineException() {
        return new RuleEngineException();
    }

    /**
     * Create an instance of {@link RuleResponse }
     * 
     */
    public RuleResponse createRuleResponse() {
        return new RuleResponse();
    }

    /**
     * Create an instance of {@link FactData }
     * 
     */
    public FactData createFactData() {
        return new FactData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/rule/service/V1", name = "ruleResponse")
    public JAXBElement<RuleResponse> createRuleResponse(RuleResponse value) {
        return new JAXBElement<RuleResponse>(_RuleResponse_QNAME, RuleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleEngineException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/rule/service/V1", name = "ruleEngineException")
    public JAXBElement<RuleEngineException> createRuleEngineException(RuleEngineException value) {
        return new JAXBElement<RuleEngineException>(_RuleEngineException_QNAME, RuleEngineException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/rule/service/V1", name = "ruleRequest")
    public JAXBElement<RuleRequest> createRuleRequest(RuleRequest value) {
        return new JAXBElement<RuleRequest>(_RuleRequest_QNAME, RuleRequest.class, null, value);
    }

}
