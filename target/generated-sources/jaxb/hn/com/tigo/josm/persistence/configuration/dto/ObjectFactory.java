//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 09:31:32 AM CST 
//


package hn.com.tigo.josm.persistence.configuration.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hn.com.tigo.josm.persistence.configuration.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Configuration_QNAME = new QName("http://www.tigo.com.hn/persistence/Configuration/V1", "configuration");
    private final static QName _DataBaseErrorMappingMap_QNAME = new QName("http://tigo.com.hn/persistence/DatabaseErrorMappingMap/v1", "dataBaseErrorMappingMap");
    private final static QName _DataBaseErrorMap_QNAME = new QName("http://tigo.com.hn/persistence/DatabaseErrorMapping/v1", "dataBaseErrorMap");
    private final static QName _Partitioning_QNAME = new QName("http://www.tigo.com.hn/persistence/partitioing/V1", "partitioning");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hn.com.tigo.josm.persistence.configuration.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Configuration }
     * 
     */
    public Configuration createConfiguration() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link DatabaseErrorMap }
     * 
     */
    public DatabaseErrorMap createDatabaseErrorMap() {
        return new DatabaseErrorMap();
    }

    /**
     * Create an instance of {@link DatabaseError }
     * 
     */
    public DatabaseError createDatabaseError() {
        return new DatabaseError();
    }

    /**
     * Create an instance of {@link DataBaseErrorMappingMap }
     * 
     */
    public DataBaseErrorMappingMap createDataBaseErrorMappingMap() {
        return new DataBaseErrorMappingMap();
    }

    /**
     * Create an instance of {@link DatabaseErrors }
     * 
     */
    public DatabaseErrors createDatabaseErrors() {
        return new DatabaseErrors();
    }

    /**
     * Create an instance of {@link ConstraintDetailsErrors }
     * 
     */
    public ConstraintDetailsErrors createConstraintDetailsErrors() {
        return new ConstraintDetailsErrors();
    }

    /**
     * Create an instance of {@link ConstraintDetails }
     * 
     */
    public ConstraintDetails createConstraintDetails() {
        return new ConstraintDetails();
    }

    /**
     * Create an instance of {@link Partitioning }
     * 
     */
    public Partitioning createPartitioning() {
        return new Partitioning();
    }

    /**
     * Create an instance of {@link Partition }
     * 
     */
    public Partition createPartition() {
        return new Partition();
    }

    /**
     * Create an instance of {@link ComplexPartitioning }
     * 
     */
    public ComplexPartitioning createComplexPartitioning() {
        return new ComplexPartitioning();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Configuration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/persistence/Configuration/V1", name = "configuration")
    public JAXBElement<Configuration> createConfiguration(Configuration value) {
        return new JAXBElement<Configuration>(_Configuration_QNAME, Configuration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataBaseErrorMappingMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/persistence/DatabaseErrorMappingMap/v1", name = "dataBaseErrorMappingMap")
    public JAXBElement<DataBaseErrorMappingMap> createDataBaseErrorMappingMap(DataBaseErrorMappingMap value) {
        return new JAXBElement<DataBaseErrorMappingMap>(_DataBaseErrorMappingMap_QNAME, DataBaseErrorMappingMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseErrorMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com.hn/persistence/DatabaseErrorMapping/v1", name = "dataBaseErrorMap")
    public JAXBElement<DatabaseErrorMap> createDataBaseErrorMap(DatabaseErrorMap value) {
        return new JAXBElement<DatabaseErrorMap>(_DataBaseErrorMap_QNAME, DatabaseErrorMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Partitioning }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com.hn/persistence/partitioing/V1", name = "partitioning")
    public JAXBElement<Partitioning> createPartitioning(Partitioning value) {
        return new JAXBElement<Partitioning>(_Partitioning_QNAME, Partitioning.class, null, value);
    }

}
