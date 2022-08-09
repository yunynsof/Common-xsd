//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:30 AM CST 
//


package hn.com.tigo.josm.common.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComplexOrderRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComplexOrderRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="externalTransacionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allOrNothing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orderRequestDetail" type="{http://tigo.com/josm/gateway/services/order/ComplexOrderRequest/V1}OrderRequestDetail" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexOrderRequest", namespace = "http://tigo.com/josm/gateway/services/order/ComplexOrderRequest/V1", propOrder = {
    "channelId",
    "externalTransacionId",
    "comment",
    "allOrNothing",
    "orderRequestDetail"
})
public class ComplexOrderRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int channelId;
    protected String externalTransacionId;
    protected String comment;
    protected boolean allOrNothing;
    @XmlElement(required = true, nillable = true)
    protected List<OrderRequestDetail> orderRequestDetail;

    /**
     * Obtiene el valor de la propiedad channelId.
     * 
     */
    public int getChannelId() {
        return channelId;
    }

    /**
     * Define el valor de la propiedad channelId.
     * 
     */
    public void setChannelId(int value) {
        this.channelId = value;
    }

    public boolean isSetChannelId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad externalTransacionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTransacionId() {
        return externalTransacionId;
    }

    /**
     * Define el valor de la propiedad externalTransacionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTransacionId(String value) {
        this.externalTransacionId = value;
    }

    public boolean isSetExternalTransacionId() {
        return (this.externalTransacionId!= null);
    }

    /**
     * Obtiene el valor de la propiedad comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Define el valor de la propiedad comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    public boolean isSetComment() {
        return (this.comment!= null);
    }

    /**
     * Obtiene el valor de la propiedad allOrNothing.
     * 
     */
    public boolean isAllOrNothing() {
        return allOrNothing;
    }

    /**
     * Define el valor de la propiedad allOrNothing.
     * 
     */
    public void setAllOrNothing(boolean value) {
        this.allOrNothing = value;
    }

    public boolean isSetAllOrNothing() {
        return true;
    }

    /**
     * Gets the value of the orderRequestDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderRequestDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderRequestDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderRequestDetail }
     * 
     * 
     */
    public List<OrderRequestDetail> getOrderRequestDetail() {
        if (orderRequestDetail == null) {
            orderRequestDetail = new ArrayList<OrderRequestDetail>();
        }
        return this.orderRequestDetail;
    }

    public boolean isSetOrderRequestDetail() {
        return ((this.orderRequestDetail!= null)&&(!this.orderRequestDetail.isEmpty()));
    }

    public void unsetOrderRequestDetail() {
        this.orderRequestDetail = null;
    }

}
