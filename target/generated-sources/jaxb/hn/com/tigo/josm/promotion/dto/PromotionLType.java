//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:10 PM CST 
//


package hn.com.tigo.josm.promotion.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionLType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionLType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/PromotionResponse}PromotionResponse">
 *       &lt;sequence>
 *         &lt;element name="promotionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="productGift" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="attributes" type="{http://www.example.org/PromotionLType}Attributes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionLType", namespace = "http://www.example.org/PromotionLType", propOrder = {
    "promotionId",
    "categoryId",
    "productId",
    "productGift",
    "startDate",
    "endDate",
    "state",
    "attributes"
})
public class PromotionLType
    extends PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long promotionId;
    protected long categoryId;
    protected long productId;
    protected long productGift;
    @XmlElement(required = true)
    protected String startDate;
    @XmlElement(required = true)
    protected String endDate;
    protected long state;
    @XmlElement(required = true, nillable = true)
    protected Attributes attributes;

    /**
     * Obtiene el valor de la propiedad promotionId.
     * 
     */
    public long getPromotionId() {
        return promotionId;
    }

    /**
     * Define el valor de la propiedad promotionId.
     * 
     */
    public void setPromotionId(long value) {
        this.promotionId = value;
    }

    public boolean isSetPromotionId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad categoryId.
     * 
     */
    public long getCategoryId() {
        return categoryId;
    }

    /**
     * Define el valor de la propiedad categoryId.
     * 
     */
    public void setCategoryId(long value) {
        this.categoryId = value;
    }

    public boolean isSetCategoryId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    public boolean isSetProductId() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad productGift.
     * 
     */
    public long getProductGift() {
        return productGift;
    }

    /**
     * Define el valor de la propiedad productGift.
     * 
     */
    public void setProductGift(long value) {
        this.productGift = value;
    }

    public boolean isSetProductGift() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    public boolean isSetStartDate() {
        return (this.startDate!= null);
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    public boolean isSetEndDate() {
        return (this.endDate!= null);
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     */
    public long getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     */
    public void setState(long value) {
        this.state = value;
    }

    public boolean isSetState() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad attributes.
     * 
     * @return
     *     possible object is
     *     {@link Attributes }
     *     
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Define el valor de la propiedad attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link Attributes }
     *     
     */
    public void setAttributes(Attributes value) {
        this.attributes = value;
    }

    public boolean isSetAttributes() {
        return (this.attributes!= null);
    }

}
