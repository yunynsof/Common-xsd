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
 * <p>Clase Java para tChoreographyLoopType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tChoreographyLoopType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="MultiInstanceSequential"/>
 *     &lt;enumeration value="MultiInstanceParallel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tChoreographyLoopType")
@XmlEnum
public enum TChoreographyLoopType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("MultiInstanceSequential")
    MULTI_INSTANCE_SEQUENTIAL("MultiInstanceSequential"),
    @XmlEnumValue("MultiInstanceParallel")
    MULTI_INSTANCE_PARALLEL("MultiInstanceParallel");
    private final String value;

    TChoreographyLoopType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TChoreographyLoopType fromValue(String v) {
        for (TChoreographyLoopType c: TChoreographyLoopType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
