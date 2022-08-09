//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 12:22:07 PM CST 
//


package hn.com.tigo.josm.common.configuration.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SchedulerConfiguration complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SchedulerConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minThread" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxThread" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="keepAlive" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="limitJobs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="threadSleep" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cacheExpiration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isLoggerEnable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchedulerConfiguration", namespace = "http://tigo.com.hn/scheduler/configuration/V1", propOrder = {
    "minThread",
    "maxThread",
    "keepAlive",
    "limitJobs",
    "threadSleep",
    "cacheExpiration",
    "isLoggerEnable"
})
public class SchedulerConfiguration
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int minThread;
    protected int maxThread;
    protected long keepAlive;
    protected int limitJobs;
    protected long threadSleep;
    protected int cacheExpiration;
    protected boolean isLoggerEnable;

    /**
     * Obtiene el valor de la propiedad minThread.
     * 
     */
    public int getMinThread() {
        return minThread;
    }

    /**
     * Define el valor de la propiedad minThread.
     * 
     */
    public void setMinThread(int value) {
        this.minThread = value;
    }

    public boolean isSetMinThread() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad maxThread.
     * 
     */
    public int getMaxThread() {
        return maxThread;
    }

    /**
     * Define el valor de la propiedad maxThread.
     * 
     */
    public void setMaxThread(int value) {
        this.maxThread = value;
    }

    public boolean isSetMaxThread() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad keepAlive.
     * 
     */
    public long getKeepAlive() {
        return keepAlive;
    }

    /**
     * Define el valor de la propiedad keepAlive.
     * 
     */
    public void setKeepAlive(long value) {
        this.keepAlive = value;
    }

    public boolean isSetKeepAlive() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad limitJobs.
     * 
     */
    public int getLimitJobs() {
        return limitJobs;
    }

    /**
     * Define el valor de la propiedad limitJobs.
     * 
     */
    public void setLimitJobs(int value) {
        this.limitJobs = value;
    }

    public boolean isSetLimitJobs() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad threadSleep.
     * 
     */
    public long getThreadSleep() {
        return threadSleep;
    }

    /**
     * Define el valor de la propiedad threadSleep.
     * 
     */
    public void setThreadSleep(long value) {
        this.threadSleep = value;
    }

    public boolean isSetThreadSleep() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad cacheExpiration.
     * 
     */
    public int getCacheExpiration() {
        return cacheExpiration;
    }

    /**
     * Define el valor de la propiedad cacheExpiration.
     * 
     */
    public void setCacheExpiration(int value) {
        this.cacheExpiration = value;
    }

    public boolean isSetCacheExpiration() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad isLoggerEnable.
     * 
     */
    public boolean isIsLoggerEnable() {
        return isLoggerEnable;
    }

    /**
     * Define el valor de la propiedad isLoggerEnable.
     * 
     */
    public void setIsLoggerEnable(boolean value) {
        this.isLoggerEnable = value;
    }

    public boolean isSetIsLoggerEnable() {
        return true;
    }

}
