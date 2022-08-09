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
 * <p>Clase Java para ActionGroupResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActionGroupResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/PromotionResponse}PromotionResponse">
 *       &lt;sequence>
 *         &lt;element name="ActionGroupList" type="{http://tigo.com.hn/promotion/component/ActionGroupResponse}ActionGroupDetailResponseService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionGroupResponse", namespace = "http://tigo.com.hn/promotion/component/ActionGroupResponse", propOrder = {
    "actionGroupList"
})
public class ActionGroupResponse
    extends PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ActionGroupList")
    protected ActionGroupDetailResponseService actionGroupList;

    /**
     * Obtiene el valor de la propiedad actionGroupList.
     * 
     * @return
     *     possible object is
     *     {@link ActionGroupDetailResponseService }
     *     
     */
    public ActionGroupDetailResponseService getActionGroupList() {
        return actionGroupList;
    }

    /**
     * Define el valor de la propiedad actionGroupList.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionGroupDetailResponseService }
     *     
     */
    public void setActionGroupList(ActionGroupDetailResponseService value) {
        this.actionGroupList = value;
    }

    public boolean isSetActionGroupList() {
        return (this.actionGroupList!= null);
    }

}
