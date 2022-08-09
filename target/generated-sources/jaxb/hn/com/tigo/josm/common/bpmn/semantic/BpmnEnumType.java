//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
//


package hn.com.tigo.josm.common.bpmn.semantic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BpmnEnumType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="BpmnEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="inputData"/>
 *     &lt;enumeration value="orderRequestDetail"/>
 *     &lt;enumeration value="simpleOrderRequest"/>
 *     &lt;enumeration value="agentRequest"/>
 *     &lt;enumeration value="agentResponse"/>
 *     &lt;enumeration value="componentes"/>
 *     &lt;enumeration value="printer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BpmnEnumType", namespace = "http://tigo.com/bpm/sample/dataobject/V1")
@XmlEnum
public enum BpmnEnumType {

    @XmlEnumValue("inputData")
    INPUT_DATA("inputData"),
    @XmlEnumValue("orderRequestDetail")
    ORDER_REQUEST_DETAIL("orderRequestDetail"),
    @XmlEnumValue("simpleOrderRequest")
    SIMPLE_ORDER_REQUEST("simpleOrderRequest"),
    @XmlEnumValue("agentRequest")
    AGENT_REQUEST("agentRequest"),
    @XmlEnumValue("agentResponse")
    AGENT_RESPONSE("agentResponse"),
    @XmlEnumValue("componentes")
    COMPONENTES("componentes"),
    @XmlEnumValue("printer")
    PRINTER("printer");
    private final String value;

    BpmnEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BpmnEnumType fromValue(String v) {
        for (BpmnEnumType c: BpmnEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
