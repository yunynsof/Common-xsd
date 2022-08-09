//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:07 PM CST 
//


package hn.com.tigo.josm.common.order;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hn.com.tigo.josm.common.order package. 
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

    private final static QName _MetaParameters_QNAME = new QName("http://tigo.com/josm/gateway/services/order/MetaParametersDTO/V1", "metaParameters");
    private final static QName _ComplexOrderRequestInstance_QNAME = new QName("http://tigo.com/josm/gateway/services/order/ComplexOrderRequest/V1", "complexOrderRequestInstance");
    private final static QName _PluginResponse_QNAME = new QName("http://tigo.com.hn/PluginResponse", "pluginResponse");
    private final static QName _Parameters_QNAME = new QName("http://tigo.com/enterprise/resources/order/parameters/simple/v1/schema", "parameters");
    private final static QName _AdditionalParameters_QNAME = new QName("http://tigo.com/josm/gateway/services/order/AdditionalParameterDTO/V1", "additionalParameters");
    private final static QName _PluginRequestInstance_QNAME = new QName("http://tigo.com/josm/gateway/services/order/PluginRequest/V1", "pluginRequestInstance");
    private final static QName _OrderResponseInstance_QNAME = new QName("http://tigo.com/josm/gateway/services/order/OrderResponse/V1", "orderResponseInstance");
    private final static QName _SimpleOrderRequest_QNAME = new QName("http://tigo.com/josm/gateway/services/order/SimpleOrderRequest/V1", "simpleOrderRequest");
    private final static QName _OrderResponseDetailList_QNAME = new QName("http://tigo.com/josm/gateway/services/order/OrderResponseDetail/V1", "orderResponseDetailList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hn.com.tigo.josm.common.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdditionalParameters }
     * 
     */
    public AdditionalParameters createAdditionalParameters() {
        return new AdditionalParameters();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link ComplexOrderRequest }
     * 
     */
    public ComplexOrderRequest createComplexOrderRequest() {
        return new ComplexOrderRequest();
    }

    /**
     * Create an instance of {@link OrderRequestDetail }
     * 
     */
    public OrderRequestDetail createOrderRequestDetail() {
        return new OrderRequestDetail();
    }

    /**
     * Create an instance of {@link MetaParameters }
     * 
     */
    public MetaParameters createMetaParameters() {
        return new MetaParameters();
    }

    /**
     * Create an instance of {@link ParameterMeta }
     * 
     */
    public ParameterMeta createParameterMeta() {
        return new ParameterMeta();
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
     * Create an instance of {@link OrderResponse }
     * 
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link OrderResponseDetailList }
     * 
     */
    public OrderResponseDetailList createOrderResponseDetailList() {
        return new OrderResponseDetailList();
    }

    /**
     * Create an instance of {@link OrderResponseDetail }
     * 
     */
    public OrderResponseDetail createOrderResponseDetail() {
        return new OrderResponseDetail();
    }

    /**
     * Create an instance of {@link PluginRequest }
     * 
     */
    public PluginRequest createPluginRequest() {
        return new PluginRequest();
    }

    /**
     * Create an instance of {@link SimpleOrderRequest }
     * 
     */
    public SimpleOrderRequest createSimpleOrderRequest() {
        return new SimpleOrderRequest();
    }

    /**
     * Create an instance of {@link PluginResponse }
     * 
     */
    public PluginResponse createPluginResponse() {
        return new PluginResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/gateway/services/order/MetaParametersDTO/V1", name = "metaParameters")
    public JAXBElement<MetaParameters> createMetaParameters(MetaParameters value) {
        return new JAXBElement<MetaParameters>(_MetaParameters_QNAME, MetaParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplexOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/gateway/services/order/ComplexOrderRequest/V1", name = "complexOrderRequestInstance")
    public JAXBElement<ComplexOrderRequest> createComplexOrderRequestInstance(ComplexOrderRequest value) {
        return new JAXBElement<ComplexOrderRequest>(_ComplexOrderRequestInstance_QNAME, ComplexOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PluginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/PluginResponse", name = "pluginResponse")
    public JAXBElement<PluginResponse> createPluginResponse(PluginResponse value) {
        return new JAXBElement<PluginResponse>(_PluginResponse_QNAME, PluginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/enterprise/resources/order/parameters/simple/v1/schema", name = "parameters")
    public JAXBElement<ParameterArray> createParameters(ParameterArray value) {
        return new JAXBElement<ParameterArray>(_Parameters_QNAME, ParameterArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/gateway/services/order/AdditionalParameterDTO/V1", name = "additionalParameters")
    public JAXBElement<AdditionalParameters> createAdditionalParameters(AdditionalParameters value) {
        return new JAXBElement<AdditionalParameters>(_AdditionalParameters_QNAME, AdditionalParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PluginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/gateway/services/order/PluginRequest/V1", name = "pluginRequestInstance")
    public JAXBElement<PluginRequest> createPluginRequestInstance(PluginRequest value) {
        return new JAXBElement<PluginRequest>(_PluginRequestInstance_QNAME, PluginRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/gateway/services/order/OrderResponse/V1", name = "orderResponseInstance")
    public JAXBElement<OrderResponse> createOrderResponseInstance(OrderResponse value) {
        return new JAXBElement<OrderResponse>(_OrderResponseInstance_QNAME, OrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/gateway/services/order/SimpleOrderRequest/V1", name = "simpleOrderRequest")
    public JAXBElement<SimpleOrderRequest> createSimpleOrderRequest(SimpleOrderRequest value) {
        return new JAXBElement<SimpleOrderRequest>(_SimpleOrderRequest_QNAME, SimpleOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponseDetailList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/gateway/services/order/OrderResponseDetail/V1", name = "orderResponseDetailList")
    public JAXBElement<OrderResponseDetailList> createOrderResponseDetailList(OrderResponseDetailList value) {
        return new JAXBElement<OrderResponseDetailList>(_OrderResponseDetailList_QNAME, OrderResponseDetailList.class, null, value);
    }

}
