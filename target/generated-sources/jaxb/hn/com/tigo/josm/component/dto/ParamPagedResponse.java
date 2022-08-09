//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.component.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramPagedResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramPagedResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/order/JOSMResponse/V1}JOSMResponse">
 *       &lt;sequence>
 *         &lt;element name="PageDetails" type="{http://tigo.com.hn/component/pageElement/V1}pageElement"/>
 *         &lt;element name="params" type="{http://tigo.com.hn/component/paramPagedResponse/V1}paramDetailResponseService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramPagedResponse", namespace = "http://tigo.com.hn/component/paramPagedResponse/V1", propOrder = {
    "pageDetails",
    "params"
})
public class ParamPagedResponse
    extends JOSMResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PageDetails", required = true)
    protected PageElement pageDetails;
    protected ParamDetailResponseService params;

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
     * Obtiene el valor de la propiedad params.
     * 
     * @return
     *     possible object is
     *     {@link ParamDetailResponseService }
     *     
     */
    public ParamDetailResponseService getParams() {
        return params;
    }

    /**
     * Define el valor de la propiedad params.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamDetailResponseService }
     *     
     */
    public void setParams(ParamDetailResponseService value) {
        this.params = value;
    }

    public boolean isSetParams() {
        return (this.params!= null);
    }

}
