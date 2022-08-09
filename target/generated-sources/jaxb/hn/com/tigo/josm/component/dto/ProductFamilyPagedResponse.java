//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:09 PM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productFamilyPagedResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productFamilyPagedResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/order/JOSMResponse/V1}JOSMResponse">
 *       &lt;sequence>
 *         &lt;element name="PageDetails" type="{http://tigo.com.hn/component/pageElement/V1}pageElement"/>
 *         &lt;element name="productFamilys" type="{http://tigo.com.hn/component/productFamilyPagedResponse}productFamilyDetailResponseService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productFamilyPagedResponse", namespace = "http://tigo.com.hn/component/productFamilyPagedResponse", propOrder = {
    "pageDetails",
    "productFamilys"
})
public class ProductFamilyPagedResponse
    extends JOSMResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PageDetails", required = true)
    protected PageElement pageDetails;
    protected ProductFamilyDetailResponseService productFamilys;

    /**
     * Obtiene el valor de la propiedad pageDetails.
     * 
     * @return
     *     possible object is
     *     {@link PageElement }
     *     
     */
    public PageElement getPageDetails() {
        return pageDetails;
    }

    /**
     * Define el valor de la propiedad pageDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link PageElement }
     *     
     */
    public void setPageDetails(PageElement value) {
        this.pageDetails = value;
    }

    public boolean isSetPageDetails() {
        return (this.pageDetails!= null);
    }

    /**
     * Obtiene el valor de la propiedad productFamilys.
     * 
     * @return
     *     possible object is
     *     {@link ProductFamilyDetailResponseService }
     *     
     */
    public ProductFamilyDetailResponseService getProductFamilys() {
        return productFamilys;
    }

    /**
     * Define el valor de la propiedad productFamilys.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFamilyDetailResponseService }
     *     
     */
    public void setProductFamilys(ProductFamilyDetailResponseService value) {
        this.productFamilys = value;
    }

    public boolean isSetProductFamilys() {
        return (this.productFamilys!= null);
    }

}
