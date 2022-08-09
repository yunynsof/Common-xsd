//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.scheduler.orders;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hn.com.tigo.josm.scheduler.orders package. 
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

    private final static QName _ComplexOrderRequestInstance_QNAME = new QName("http://tigo.com/josm/gateway/services/order/ComplexOrderRequest/V1", "complexOrderRequestInstance");
    private final static QName _MetaParameters_QNAME = new QName("http://tigo.com/josm/gateway/services/order/MetaParametersDTO/V1", "metaParameters");
    private final static QName _ScheduleWithOutScheduleTypeList_QNAME = new QName("http://tigo.com.hn/scheduler/orders/ScheduleResponse/V1", "scheduleWithOutScheduleTypeList");
    private final static QName _ScheduleWithOutScheduleId_QNAME = new QName("http://tigo.com.hn/scheduler/orders/Response/V1", "scheduleWithOutScheduleId");
    private final static QName _AdditionalParameters_QNAME = new QName("http://tigo.com/josm/gateway/services/order/AdditionalParameterDTO/V1", "additionalParameters");
    private final static QName _ScheduleWithOutScheduleType_QNAME = new QName("http://tigo.com.hn/scheduler/orders/ScheduleResponse/V1", "scheduleWithOutScheduleType");
    private final static QName _SimpleOrderRequest_QNAME = new QName("http://tigo.com/josm/gateway/services/order/SimpleOrderRequest/V1", "simpleOrderRequest");
    private final static QName _ScheduleXsd_QNAME = new QName("http://tigo.com.hn/scheduler/orders/Response/V1", "scheduleXsd");
    private final static QName _ScheduleResponse_QNAME = new QName("http://tigo.com.hn/scheduler/orders/ScheduleResponse/V1", "scheduleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hn.com.tigo.josm.scheduler.orders
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RescheduleRequest }
     * 
     */
    public RescheduleRequest createRescheduleRequest() {
        return new RescheduleRequest();
    }

    /**
     * Create an instance of {@link ScheduleXsd }
     * 
     */
    public ScheduleXsd createScheduleXsd() {
        return new ScheduleXsd();
    }

    /**
     * Create an instance of {@link ScheduleResponse }
     * 
     */
    public ScheduleResponse createScheduleResponse() {
        return new ScheduleResponse();
    }

    /**
     * Create an instance of {@link ScheduleWithOutScheduleId }
     * 
     */
    public ScheduleWithOutScheduleId createScheduleWithOutScheduleId() {
        return new ScheduleWithOutScheduleId();
    }

    /**
     * Create an instance of {@link ScheduleWithOutScheduleType }
     * 
     */
    public ScheduleWithOutScheduleType createScheduleWithOutScheduleType() {
        return new ScheduleWithOutScheduleType();
    }

    /**
     * Create an instance of {@link ScheduleWithOutScheduleTypeList }
     * 
     */
    public ScheduleWithOutScheduleTypeList createScheduleWithOutScheduleTypeList() {
        return new ScheduleWithOutScheduleTypeList();
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
     * Create an instance of {@link RmvScheduleRequest }
     * 
     */
    public RmvScheduleRequest createRmvScheduleRequest() {
        return new RmvScheduleRequest();
    }

    /**
     * Create an instance of {@link ScheduleComplexRequest }
     * 
     */
    public ScheduleComplexRequest createScheduleComplexRequest() {
        return new ScheduleComplexRequest();
    }

    /**
     * Create an instance of {@link ScheduleSimpleRequest }
     * 
     */
    public ScheduleSimpleRequest createScheduleSimpleRequest() {
        return new ScheduleSimpleRequest();
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
     * Create an instance of {@link ScheduleExecuteRequest }
     * 
     */
    public ScheduleExecuteRequest createScheduleExecuteRequest() {
        return new ScheduleExecuteRequest();
    }

    /**
     * Create an instance of {@link ScheduleRequest }
     * 
     */
    public ScheduleRequest createScheduleRequest() {
        return new ScheduleRequest();
    }

    /**
     * Create an instance of {@link SimpleOrderRequest }
     * 
     */
    public SimpleOrderRequest createSimpleOrderRequest() {
        return new SimpleOrderRequest();
    }

    /**
     * Create an instance of {@link ScheduleTypeRequest }
     * 
     */
    public ScheduleTypeRequest createScheduleTypeRequest() {
        return new ScheduleTypeRequest();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link TaskRequest }
     * 
     */
    public TaskRequest createTaskRequest() {
        return new TaskRequest();
    }

    /**
     * Create an instance of {@link UpdateCronExpressionRequest }
     * 
     */
    public UpdateCronExpressionRequest createUpdateCronExpressionRequest() {
        return new UpdateCronExpressionRequest();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/gateway/services/order/MetaParametersDTO/V1", name = "metaParameters")
    public JAXBElement<MetaParameters> createMetaParameters(MetaParameters value) {
        return new JAXBElement<MetaParameters>(_MetaParameters_QNAME, MetaParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleWithOutScheduleTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/scheduler/orders/ScheduleResponse/V1", name = "scheduleWithOutScheduleTypeList")
    public JAXBElement<ScheduleWithOutScheduleTypeList> createScheduleWithOutScheduleTypeList(ScheduleWithOutScheduleTypeList value) {
        return new JAXBElement<ScheduleWithOutScheduleTypeList>(_ScheduleWithOutScheduleTypeList_QNAME, ScheduleWithOutScheduleTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleWithOutScheduleId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/scheduler/orders/Response/V1", name = "scheduleWithOutScheduleId", substitutionHeadNamespace = "http://tigo.com.hn/scheduler/orders/ScheduleResponse/V1", substitutionHeadName = "scheduleResponse")
    public JAXBElement<ScheduleWithOutScheduleId> createScheduleWithOutScheduleId(ScheduleWithOutScheduleId value) {
        return new JAXBElement<ScheduleWithOutScheduleId>(_ScheduleWithOutScheduleId_QNAME, ScheduleWithOutScheduleId.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleWithOutScheduleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/scheduler/orders/ScheduleResponse/V1", name = "scheduleWithOutScheduleType")
    public JAXBElement<ScheduleWithOutScheduleType> createScheduleWithOutScheduleType(ScheduleWithOutScheduleType value) {
        return new JAXBElement<ScheduleWithOutScheduleType>(_ScheduleWithOutScheduleType_QNAME, ScheduleWithOutScheduleType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleXsd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/scheduler/orders/Response/V1", name = "scheduleXsd", substitutionHeadNamespace = "http://tigo.com.hn/scheduler/orders/ScheduleResponse/V1", substitutionHeadName = "scheduleResponse")
    public JAXBElement<ScheduleXsd> createScheduleXsd(ScheduleXsd value) {
        return new JAXBElement<ScheduleXsd>(_ScheduleXsd_QNAME, ScheduleXsd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/scheduler/orders/ScheduleResponse/V1", name = "scheduleResponse")
    public JAXBElement<ScheduleResponse> createScheduleResponse(ScheduleResponse value) {
        return new JAXBElement<ScheduleResponse>(_ScheduleResponse_QNAME, ScheduleResponse.class, null, value);
    }

}
