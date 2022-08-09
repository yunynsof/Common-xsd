//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:08 PM CST 
//


package hn.com.tigo.josm.common.proxy.ussd.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para menuType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="menuType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="menuItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "menuType", propOrder = {
    "menuItem"
})
public class MenuType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String menuItem;

    /**
     * Obtiene el valor de la propiedad menuItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuItem() {
        return menuItem;
    }

    /**
     * Define el valor de la propiedad menuItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuItem(String value) {
        this.menuItem = value;
    }

    public boolean isSetMenuItem() {
        return (this.menuItem!= null);
    }

}
