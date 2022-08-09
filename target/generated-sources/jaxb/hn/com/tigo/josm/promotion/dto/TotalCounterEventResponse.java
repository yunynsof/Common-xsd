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
 * <p>Clase Java para TotalCounterEventResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TotalCounterEventResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/PromotionResponse}PromotionResponse">
 *       &lt;sequence>
 *         &lt;element name="TotalCounterEventList" type="{http://www.example.org/TotalCounterEventResponse}TotalCounterEventResponseService"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalCounterEventResponse", namespace = "http://www.example.org/TotalCounterEventResponse", propOrder = {
    "totalCounterEventList"
})
public class TotalCounterEventResponse
    extends PromotionResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TotalCounterEventList", required = true)
    protected TotalCounterEventResponseService totalCounterEventList;

    /**
     * Obtiene el valor de la propiedad totalCounterEventList.
     * 
     * @return
     *     possible object is
     *     {@link TotalCounterEventResponseService }
     *     
     */
    public TotalCounterEventResponseService getTotalCounterEventList() {
        return totalCounterEventList;
    }

    /**
     * Define el valor de la propiedad totalCounterEventList.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCounterEventResponseService }
     *     
     */
    public void setTotalCounterEventList(TotalCounterEventResponseService value) {
        this.totalCounterEventList = value;
    }

    public boolean isSetTotalCounterEventList() {
        return (this.totalCounterEventList!= null);
    }

}
