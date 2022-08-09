//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.subscription.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hn.com.tigo.josm.subscription.dto package. 
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

    private final static QName _ActivateSubscription_QNAME = new QName("http://tigo.com/josm/subscription/services/subscription/v1/schema", "ActivateSubscription");
    private final static QName _ChangeNumber_QNAME = new QName("http://tigo.com/josm/subscription/services/subscription/v1/schema", "ChangeNumber");
    private final static QName _DeactivateSubscriptionsAll_QNAME = new QName("http://tigo.com/josm/subscription/services/subscription/v1/schema", "DeactivateSubscriptionsAll");
    private final static QName _VerifySubscription_QNAME = new QName("http://tigo.com/josm/subscription/services/subscription/v1/schema", "VerifySubscription");
    private final static QName _MessageFault_QNAME = new QName("http://tigo.com/josm/subscription/services/subscription/v1/schema", "MessageFault");
    private final static QName _MessageACK_QNAME = new QName("http://tigo.com/josm/subscription/services/subscription/v1/schema", "MessageACK");
    private final static QName _DeactivateSubscription_QNAME = new QName("http://tigo.com/josm/subscription/services/subscription/v1/schema", "DeactivateSubscription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hn.com.tigo.josm.subscription.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageACKType }
     * 
     */
    public MessageACKType createMessageACKType() {
        return new MessageACKType();
    }

    /**
     * Create an instance of {@link DeactivateSubscriptionType }
     * 
     */
    public DeactivateSubscriptionType createDeactivateSubscriptionType() {
        return new DeactivateSubscriptionType();
    }

    /**
     * Create an instance of {@link ChangeNumberType }
     * 
     */
    public ChangeNumberType createChangeNumberType() {
        return new ChangeNumberType();
    }

    /**
     * Create an instance of {@link MessageFaultType }
     * 
     */
    public MessageFaultType createMessageFaultType() {
        return new MessageFaultType();
    }

    /**
     * Create an instance of {@link VerifySubscriptionType }
     * 
     */
    public VerifySubscriptionType createVerifySubscriptionType() {
        return new VerifySubscriptionType();
    }

    /**
     * Create an instance of {@link DeactivateSubscriptionsAllType }
     * 
     */
    public DeactivateSubscriptionsAllType createDeactivateSubscriptionsAllType() {
        return new DeactivateSubscriptionsAllType();
    }

    /**
     * Create an instance of {@link ActivateSubscriptionType }
     * 
     */
    public ActivateSubscriptionType createActivateSubscriptionType() {
        return new ActivateSubscriptionType();
    }

    /**
     * Create an instance of {@link SubscriptionType }
     * 
     */
    public SubscriptionType createSubscriptionType() {
        return new SubscriptionType();
    }

    /**
     * Create an instance of {@link SuscriptionsType }
     * 
     */
    public SuscriptionsType createSuscriptionsType() {
        return new SuscriptionsType();
    }

    /**
     * Create an instance of {@link WarningMessageType }
     * 
     */
    public WarningMessageType createWarningMessageType() {
        return new WarningMessageType();
    }

    /**
     * Create an instance of {@link SuscriptionType }
     * 
     */
    public SuscriptionType createSuscriptionType() {
        return new SuscriptionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateSubscriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/subscription/services/subscription/v1/schema", name = "ActivateSubscription")
    public JAXBElement<ActivateSubscriptionType> createActivateSubscription(ActivateSubscriptionType value) {
        return new JAXBElement<ActivateSubscriptionType>(_ActivateSubscription_QNAME, ActivateSubscriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/subscription/services/subscription/v1/schema", name = "ChangeNumber")
    public JAXBElement<ChangeNumberType> createChangeNumber(ChangeNumberType value) {
        return new JAXBElement<ChangeNumberType>(_ChangeNumber_QNAME, ChangeNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateSubscriptionsAllType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/subscription/services/subscription/v1/schema", name = "DeactivateSubscriptionsAll")
    public JAXBElement<DeactivateSubscriptionsAllType> createDeactivateSubscriptionsAll(DeactivateSubscriptionsAllType value) {
        return new JAXBElement<DeactivateSubscriptionsAllType>(_DeactivateSubscriptionsAll_QNAME, DeactivateSubscriptionsAllType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifySubscriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/subscription/services/subscription/v1/schema", name = "VerifySubscription")
    public JAXBElement<VerifySubscriptionType> createVerifySubscription(VerifySubscriptionType value) {
        return new JAXBElement<VerifySubscriptionType>(_VerifySubscription_QNAME, VerifySubscriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/subscription/services/subscription/v1/schema", name = "MessageFault")
    public JAXBElement<MessageFaultType> createMessageFault(MessageFaultType value) {
        return new JAXBElement<MessageFaultType>(_MessageFault_QNAME, MessageFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageACKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/subscription/services/subscription/v1/schema", name = "MessageACK")
    public JAXBElement<MessageACKType> createMessageACK(MessageACKType value) {
        return new JAXBElement<MessageACKType>(_MessageACK_QNAME, MessageACKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateSubscriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/josm/subscription/services/subscription/v1/schema", name = "DeactivateSubscription")
    public JAXBElement<DeactivateSubscriptionType> createDeactivateSubscription(DeactivateSubscriptionType value) {
        return new JAXBElement<DeactivateSubscriptionType>(_DeactivateSubscription_QNAME, DeactivateSubscriptionType.class, null, value);
    }

}
