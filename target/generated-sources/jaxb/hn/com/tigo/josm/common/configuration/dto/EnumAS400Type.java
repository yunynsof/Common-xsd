//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:07 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnumAS400Type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumAS400Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="decimal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumAS400Type", namespace = "http://tigo.com.hn/adapter/AS400ProgramConfigType/V1")
@XmlEnum
public enum EnumAS400Type {

    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("decimal")
    DECIMAL("decimal");
    private final String value;

    EnumAS400Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumAS400Type fromValue(String v) {
        for (EnumAS400Type c: EnumAS400Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
