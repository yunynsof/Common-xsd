//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.orchestrator.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnumStateDebug.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumStateDebug">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Paused"/>
 *     &lt;enumeration value="Stoped"/>
 *     &lt;enumeration value="Running"/>
 *     &lt;enumeration value="Started"/>
 *     &lt;enumeration value="Unspecified"/>
 *     &lt;enumeration value="Unspecified thread"/>
 *     &lt;enumeration value="Successful action"/>
 *     &lt;enumeration value="Error action"/>
 *     &lt;enumeration value="End"/>
 *     &lt;enumeration value="Debugger already on"/>
 *     &lt;enumeration value="Debugger already off"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumStateDebug", namespace = "http://www.example.org/EnumStateDebug")
@XmlEnum
public enum EnumStateDebug {

    @XmlEnumValue("Paused")
    PAUSED("Paused"),
    @XmlEnumValue("Stoped")
    STOPED("Stoped"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Started")
    STARTED("Started"),
    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("Unspecified thread")
    UNSPECIFIED_THREAD("Unspecified thread"),
    @XmlEnumValue("Successful action")
    SUCCESSFUL_ACTION("Successful action"),
    @XmlEnumValue("Error action")
    ERROR_ACTION("Error action"),
    @XmlEnumValue("End")
    END("End"),
    @XmlEnumValue("Debugger already on")
    DEBUGGER_ALREADY_ON("Debugger already on"),
    @XmlEnumValue("Debugger already off")
    DEBUGGER_ALREADY_OFF("Debugger already off");
    private final String value;

    EnumStateDebug(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumStateDebug fromValue(String v) {
        for (EnumStateDebug c: EnumStateDebug.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
