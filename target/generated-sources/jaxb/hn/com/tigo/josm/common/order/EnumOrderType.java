//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:07 PM CST 
//


package hn.com.tigo.josm.common.order;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnumOrderType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVATE"/>
 *     &lt;enumeration value="DEACTIVATE"/>
 *     &lt;enumeration value="LOAN"/>
 *     &lt;enumeration value="PURCHASE"/>
 *     &lt;enumeration value="SELL"/>
 *     &lt;enumeration value="TRANSFER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumOrderType", namespace = "http://tigo.com/josm/gateway/services/order/ComplexOrderRequest/V1")
@XmlEnum
public enum EnumOrderType {

    ACTIVATE,
    DEACTIVATE,
    LOAN,
    PURCHASE,
    SELL,
    TRANSFER;

    public String value() {
        return name();
    }

    public static EnumOrderType fromValue(String v) {
        return valueOf(v);
    }

}
