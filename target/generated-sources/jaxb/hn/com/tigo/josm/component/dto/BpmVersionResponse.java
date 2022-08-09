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
 * <p>Clase Java para BpmVersionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BpmVersionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/order/JOSMResponse/V1}JOSMResponse">
 *       &lt;sequence>
 *         &lt;element name="PageDetail" type="{http://tigo.com.hn/component/pageElement/V1}pageElement"/>
 *         &lt;element name="BpmVersionList" type="{http://tigo.com.hn/component/BpmVersionResponse/V1}bpmVersionDetailResponseService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BpmVersionResponse", namespace = "http://tigo.com.hn/component/BpmVersionResponse/V1", propOrder = {
    "pageDetail",
    "bpmVersionList"
})
public class BpmVersionResponse
    extends JOSMResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PageDetail", required = true)
    protected PageElement pageDetail;
    @XmlElement(name = "BpmVersionList")
    protected BpmVersionDetailResponseService bpmVersionList;

    /**
     * Obtiene el valor de la propiedad pageDetail.
     * 
     * @return
     *     possible object is
     *     {@link PageElement }
     *     
     */
    public PageElement getPageDetail() {
        return pageDetail;
    }

    /**
     * Define el valor de la propiedad pageDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link PageElement }
     *     
     */
    public void setPageDetail(PageElement value) {
        this.pageDetail = value;
    }

    public boolean isSetPageDetail() {
        return (this.pageDetail!= null);
    }

    /**
     * Obtiene el valor de la propiedad bpmVersionList.
     * 
     * @return
     *     possible object is
     *     {@link BpmVersionDetailResponseService }
     *     
     */
    public BpmVersionDetailResponseService getBpmVersionList() {
        return bpmVersionList;
    }

    /**
     * Define el valor de la propiedad bpmVersionList.
     * 
     * @param value
     *     allowed object is
     *     {@link BpmVersionDetailResponseService }
     *     
     */
    public void setBpmVersionList(BpmVersionDetailResponseService value) {
        this.bpmVersionList = value;
    }

    public boolean isSetBpmVersionList() {
        return (this.bpmVersionList!= null);
    }

}
