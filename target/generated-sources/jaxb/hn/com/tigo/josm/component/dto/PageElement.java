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
 * <p>Clase Java para pageElement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pageElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numberOfPages" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageElement", namespace = "http://tigo.com.hn/component/pageElement/V1", propOrder = {
    "pageNumber",
    "pageSize",
    "numberOfPages",
    "total"
})
public class PageElement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "")
    protected long pageNumber;
    @XmlElement(namespace = "")
    protected long pageSize;
    @XmlElement(namespace = "")
    protected long numberOfPages;
    @XmlElement(namespace = "")
    protected long total;

    /**
     * Obtiene el valor de la propiedad pageNumber.
     * 
     */
    public long getPageNumber() {
        return pageNumber;
    }

    /**
     * Define el valor de la propiedad pageNumber.
     * 
     */
    public void setPageNumber(long value) {
        this.pageNumber = value;
    }

    public boolean isSetPageNumber() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad pageSize.
     * 
     */
    public long getPageSize() {
        return pageSize;
    }

    /**
     * Define el valor de la propiedad pageSize.
     * 
     */
    public void setPageSize(long value) {
        this.pageSize = value;
    }

    public boolean isSetPageSize() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad numberOfPages.
     * 
     */
    public long getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Define el valor de la propiedad numberOfPages.
     * 
     */
    public void setNumberOfPages(long value) {
        this.numberOfPages = value;
    }

    public boolean isSetNumberOfPages() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public long getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(long value) {
        this.total = value;
    }

    public boolean isSetTotal() {
        return true;
    }

}
