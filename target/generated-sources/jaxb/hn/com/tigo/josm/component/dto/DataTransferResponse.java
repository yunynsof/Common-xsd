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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataTransferResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DataTransferResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tigo.com.hn/order/JOSMResponse/V1}JOSMResponse">
 *       &lt;sequence>
 *         &lt;element name="dataTransfers" type="{http://tigo.com.hn/component/DataTransferResponse/V1}DataTransferResponseService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTransferResponse", namespace = "http://tigo.com.hn/component/DataTransferResponse/V1", propOrder = {
    "dataTransfers"
})
public class DataTransferResponse
    extends JOSMResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected DataTransferResponseService dataTransfers;

    /**
     * Obtiene el valor de la propiedad dataTransfers.
     * 
     * @return
     *     possible object is
     *     {@link DataTransferResponseService }
     *     
     */
    public DataTransferResponseService getDataTransfers() {
        return dataTransfers;
    }

    /**
     * Define el valor de la propiedad dataTransfers.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTransferResponseService }
     *     
     */
    public void setDataTransfers(DataTransferResponseService value) {
        this.dataTransfers = value;
    }

    public boolean isSetDataTransfers() {
        return (this.dataTransfers!= null);
    }

}
