//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:31 AM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PlatformRegexListDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PlatformRegexListDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regexExpresion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="separatorList" type="{http://tigo.com.hn/PlatformMappingConfigType/V1}PlatformSeparatorList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlatformRegexListDetail", propOrder = {
    "productId",
    "orderType",
    "quantity",
    "regexExpresion",
    "separatorList"
})
public class PlatformRegexListDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "productId", namespace = "http://tigo.com.hn/PlatformMappingConfigType/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productId;
    @XmlElementRef(name = "orderType", namespace = "http://tigo.com.hn/PlatformMappingConfigType/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderType;
    @XmlElementRef(name = "quantity", namespace = "http://tigo.com.hn/PlatformMappingConfigType/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantity;
    @XmlElement(required = true, nillable = true)
    protected List<String> regexExpresion;
    @XmlElement(required = true, nillable = true)
    protected PlatformSeparatorList separatorList;

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductId(JAXBElement<String> value) {
        this.productId = value;
    }

    public boolean isSetProductId() {
        return (this.productId!= null);
    }

    /**
     * Obtiene el valor de la propiedad orderType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderType() {
        return orderType;
    }

    /**
     * Define el valor de la propiedad orderType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderType(JAXBElement<String> value) {
        this.orderType = value;
    }

    public boolean isSetOrderType() {
        return (this.orderType!= null);
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantity(JAXBElement<String> value) {
        this.quantity = value;
    }

    public boolean isSetQuantity() {
        return (this.quantity!= null);
    }

    /**
     * Gets the value of the regexExpresion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regexExpresion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegexExpresion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRegexExpresion() {
        if (regexExpresion == null) {
            regexExpresion = new ArrayList<String>();
        }
        return this.regexExpresion;
    }

    public boolean isSetRegexExpresion() {
        return ((this.regexExpresion!= null)&&(!this.regexExpresion.isEmpty()));
    }

    public void unsetRegexExpresion() {
        this.regexExpresion = null;
    }

    /**
     * Obtiene el valor de la propiedad separatorList.
     * 
     * @return
     *     possible object is
     *     {@link PlatformSeparatorList }
     *     
     */
    public PlatformSeparatorList getSeparatorList() {
        return separatorList;
    }

    /**
     * Define el valor de la propiedad separatorList.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformSeparatorList }
     *     
     */
    public void setSeparatorList(PlatformSeparatorList value) {
        this.separatorList = value;
    }

    public boolean isSetSeparatorList() {
        return (this.separatorList!= null);
    }

}
