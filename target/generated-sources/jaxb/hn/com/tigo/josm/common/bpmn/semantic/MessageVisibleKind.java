//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:09 PM CST 
//


package hn.com.tigo.josm.common.bpmn.semantic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MessageVisibleKind.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageVisibleKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="initiating"/>
 *     &lt;enumeration value="non_initiating"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageVisibleKind", namespace = "http://www.omg.org/spec/BPMN/20100524/DI")
@XmlEnum
public enum MessageVisibleKind {

    @XmlEnumValue("initiating")
    INITIATING("initiating"),
    @XmlEnumValue("non_initiating")
    NON_INITIATING("non_initiating");
    private final String value;

    MessageVisibleKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageVisibleKind fromValue(String v) {
        for (MessageVisibleKind c: MessageVisibleKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
