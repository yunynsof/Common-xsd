//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.09 a las 01:12:08 PM CST 
//


package hn.com.tigo.josm.gateway.services.fufillment.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hn.com.tigo.josm.gateway.services.fufillment.dto package. 
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

    private final static QName _GetOffers_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "getOffers");
    private final static QName _GetPaymentMethodsResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "getPaymentMethodsResponse");
    private final static QName _PurchaseProductAsyncResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "purchaseProductAsyncResponse");
    private final static QName _PurchaseProductAsync_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "purchaseProductAsync");
    private final static QName _TransferProductAsyncResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "transferProductAsyncResponse");
    private final static QName _GetProductPrice_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "getProductPrice");
    private final static QName _TransferProductResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "transferProductResponse");
    private final static QName _GetAcquirableProductsByMsisdn_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "getAcquirableProductsByMsisdn");
    private final static QName _ActivateProductAsync_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "activateProductAsync");
    private final static QName _LoanProductAsyncResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "loanProductAsyncResponse");
    private final static QName _GetProductPriceResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "getProductPriceResponse");
    private final static QName _TransferProduct_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "transferProduct");
    private final static QName _LoanProductAsync_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "loanProductAsync");
    private final static QName _SellProductAsync_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "sellProductAsync");
    private final static QName _PurchaseProduct_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "purchaseProduct");
    private final static QName _DeactivateProduct_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "DeactivateProduct");
    private final static QName _GetAcquirableProductsByMsisdnResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "getAcquirableProductsByMsisdnResponse");
    private final static QName _GetOffersResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "getOffersResponse");
    private final static QName _DeactivateProductAsyncResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "DeactivateProductAsyncResponse");
    private final static QName _PurchaseProductResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "purchaseProductResponse");
    private final static QName _ActivateProductResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "activateProductResponse");
    private final static QName _ActivateProduct_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "activateProduct");
    private final static QName _SellProductAsyncResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "sellProductAsyncResponse");
    private final static QName _ActivateProductAsyncResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "activateProductAsyncResponse");
    private final static QName _SellProductResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "sellProductResponse");
    private final static QName _TransferProductAsync_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "transferProductAsync");
    private final static QName _DeactivateProductResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "DeactivateProductResponse");
    private final static QName _LoanProductResponse_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "loanProductResponse");
    private final static QName _DeactivateProductAsync_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "DeactivateProductAsync");
    private final static QName _SellProduct_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "sellProduct");
    private final static QName _GetPaymentMethods_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "getPaymentMethods");
    private final static QName _LoanProduct_QNAME = new QName("http://ws.business.api.fulfillmentengine.millicom.com/", "loanProduct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hn.com.tigo.josm.gateway.services.fufillment.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SellProductResponse }
     * 
     */
    public SellProductResponse createSellProductResponse() {
        return new SellProductResponse();
    }

    /**
     * Create an instance of {@link ActivateProduct }
     * 
     */
    public ActivateProduct createActivateProduct() {
        return new ActivateProduct();
    }

    /**
     * Create an instance of {@link ActivateProductResponse }
     * 
     */
    public ActivateProductResponse createActivateProductResponse() {
        return new ActivateProductResponse();
    }

    /**
     * Create an instance of {@link PurchaseProductResponse }
     * 
     */
    public PurchaseProductResponse createPurchaseProductResponse() {
        return new PurchaseProductResponse();
    }

    /**
     * Create an instance of {@link DeactivateProductResponse }
     * 
     */
    public DeactivateProductResponse createDeactivateProductResponse() {
        return new DeactivateProductResponse();
    }

    /**
     * Create an instance of {@link TransferProductAsync }
     * 
     */
    public TransferProductAsync createTransferProductAsync() {
        return new TransferProductAsync();
    }

    /**
     * Create an instance of {@link LoanProductResponse }
     * 
     */
    public LoanProductResponse createLoanProductResponse() {
        return new LoanProductResponse();
    }

    /**
     * Create an instance of {@link LoanProduct }
     * 
     */
    public LoanProduct createLoanProduct() {
        return new LoanProduct();
    }

    /**
     * Create an instance of {@link GetPaymentMethods }
     * 
     */
    public GetPaymentMethods createGetPaymentMethods() {
        return new GetPaymentMethods();
    }

    /**
     * Create an instance of {@link SellProduct }
     * 
     */
    public SellProduct createSellProduct() {
        return new SellProduct();
    }

    /**
     * Create an instance of {@link DeactivateProductAsync }
     * 
     */
    public DeactivateProductAsync createDeactivateProductAsync() {
        return new DeactivateProductAsync();
    }

    /**
     * Create an instance of {@link PurchaseProductAsync }
     * 
     */
    public PurchaseProductAsync createPurchaseProductAsync() {
        return new PurchaseProductAsync();
    }

    /**
     * Create an instance of {@link GetPaymentMethodsResponse }
     * 
     */
    public GetPaymentMethodsResponse createGetPaymentMethodsResponse() {
        return new GetPaymentMethodsResponse();
    }

    /**
     * Create an instance of {@link GetOffers }
     * 
     */
    public GetOffers createGetOffers() {
        return new GetOffers();
    }

    /**
     * Create an instance of {@link TransferProductResponse }
     * 
     */
    public TransferProductResponse createTransferProductResponse() {
        return new TransferProductResponse();
    }

    /**
     * Create an instance of {@link GetAcquirableProductsByMsisdn }
     * 
     */
    public GetAcquirableProductsByMsisdn createGetAcquirableProductsByMsisdn() {
        return new GetAcquirableProductsByMsisdn();
    }

    /**
     * Create an instance of {@link GetProductPrice }
     * 
     */
    public GetProductPrice createGetProductPrice() {
        return new GetProductPrice();
    }

    /**
     * Create an instance of {@link LoanProductAsync }
     * 
     */
    public LoanProductAsync createLoanProductAsync() {
        return new LoanProductAsync();
    }

    /**
     * Create an instance of {@link TransferProduct }
     * 
     */
    public TransferProduct createTransferProduct() {
        return new TransferProduct();
    }

    /**
     * Create an instance of {@link GetProductPriceResponse }
     * 
     */
    public GetProductPriceResponse createGetProductPriceResponse() {
        return new GetProductPriceResponse();
    }

    /**
     * Create an instance of {@link ActivateProductAsync }
     * 
     */
    public ActivateProductAsync createActivateProductAsync() {
        return new ActivateProductAsync();
    }

    /**
     * Create an instance of {@link GetOffersResponse }
     * 
     */
    public GetOffersResponse createGetOffersResponse() {
        return new GetOffersResponse();
    }

    /**
     * Create an instance of {@link GetAcquirableProductsByMsisdnResponse }
     * 
     */
    public GetAcquirableProductsByMsisdnResponse createGetAcquirableProductsByMsisdnResponse() {
        return new GetAcquirableProductsByMsisdnResponse();
    }

    /**
     * Create an instance of {@link DeactivateProduct }
     * 
     */
    public DeactivateProduct createDeactivateProduct() {
        return new DeactivateProduct();
    }

    /**
     * Create an instance of {@link PurchaseProduct }
     * 
     */
    public PurchaseProduct createPurchaseProduct() {
        return new PurchaseProduct();
    }

    /**
     * Create an instance of {@link SellProductAsync }
     * 
     */
    public SellProductAsync createSellProductAsync() {
        return new SellProductAsync();
    }

    /**
     * Create an instance of {@link ProductDTO }
     * 
     */
    public ProductDTO createProductDTO() {
        return new ProductDTO();
    }

    /**
     * Create an instance of {@link AdditionalParameterDTO }
     * 
     */
    public AdditionalParameterDTO createAdditionalParameterDTO() {
        return new AdditionalParameterDTO();
    }

    /**
     * Create an instance of {@link ActivateProductResponseDTO }
     * 
     */
    public ActivateProductResponseDTO createActivateProductResponseDTO() {
        return new ActivateProductResponseDTO();
    }

    /**
     * Create an instance of {@link AcquisitionMethodPriceDTO }
     * 
     */
    public AcquisitionMethodPriceDTO createAcquisitionMethodPriceDTO() {
        return new AcquisitionMethodPriceDTO();
    }

    /**
     * Create an instance of {@link SellProductResponseDTO }
     * 
     */
    public SellProductResponseDTO createSellProductResponseDTO() {
        return new SellProductResponseDTO();
    }

    /**
     * Create an instance of {@link GetPaymentMethodsResponseDTO }
     * 
     */
    public GetPaymentMethodsResponseDTO createGetPaymentMethodsResponseDTO() {
        return new GetPaymentMethodsResponseDTO();
    }

    /**
     * Create an instance of {@link AcquiredProductDTO }
     * 
     */
    public AcquiredProductDTO createAcquiredProductDTO() {
        return new AcquiredProductDTO();
    }

    /**
     * Create an instance of {@link GetAcquiredProductDTO }
     * 
     */
    public GetAcquiredProductDTO createGetAcquiredProductDTO() {
        return new GetAcquiredProductDTO();
    }

    /**
     * Create an instance of {@link PurchaseProductResponseDTO }
     * 
     */
    public PurchaseProductResponseDTO createPurchaseProductResponseDTO() {
        return new PurchaseProductResponseDTO();
    }

    /**
     * Create an instance of {@link ResponseDTO }
     * 
     */
    public ResponseDTO createResponseDTO() {
        return new ResponseDTO();
    }

    /**
     * Create an instance of {@link TransferProductResponseDTO }
     * 
     */
    public TransferProductResponseDTO createTransferProductResponseDTO() {
        return new TransferProductResponseDTO();
    }

    /**
     * Create an instance of {@link GetOffersResponseDTO }
     * 
     */
    public GetOffersResponseDTO createGetOffersResponseDTO() {
        return new GetOffersResponseDTO();
    }

    /**
     * Create an instance of {@link ProductPriceListDTO }
     * 
     */
    public ProductPriceListDTO createProductPriceListDTO() {
        return new ProductPriceListDTO();
    }

    /**
     * Create an instance of {@link PriceDTO }
     * 
     */
    public PriceDTO createPriceDTO() {
        return new PriceDTO();
    }

    /**
     * Create an instance of {@link LoanProductResponseDTO }
     * 
     */
    public LoanProductResponseDTO createLoanProductResponseDTO() {
        return new LoanProductResponseDTO();
    }

    /**
     * Create an instance of {@link ProductPriceDTO }
     * 
     */
    public ProductPriceDTO createProductPriceDTO() {
        return new ProductPriceDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOffers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "getOffers")
    public JAXBElement<GetOffers> createGetOffers(GetOffers value) {
        return new JAXBElement<GetOffers>(_GetOffers_QNAME, GetOffers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentMethodsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "getPaymentMethodsResponse")
    public JAXBElement<GetPaymentMethodsResponse> createGetPaymentMethodsResponse(GetPaymentMethodsResponse value) {
        return new JAXBElement<GetPaymentMethodsResponse>(_GetPaymentMethodsResponse_QNAME, GetPaymentMethodsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "purchaseProductAsyncResponse")
    public JAXBElement<PurchaseProductResponse> createPurchaseProductAsyncResponse(PurchaseProductResponse value) {
        return new JAXBElement<PurchaseProductResponse>(_PurchaseProductAsyncResponse_QNAME, PurchaseProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseProductAsync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "purchaseProductAsync")
    public JAXBElement<PurchaseProductAsync> createPurchaseProductAsync(PurchaseProductAsync value) {
        return new JAXBElement<PurchaseProductAsync>(_PurchaseProductAsync_QNAME, PurchaseProductAsync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "transferProductAsyncResponse")
    public JAXBElement<TransferProductResponse> createTransferProductAsyncResponse(TransferProductResponse value) {
        return new JAXBElement<TransferProductResponse>(_TransferProductAsyncResponse_QNAME, TransferProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "getProductPrice")
    public JAXBElement<GetProductPrice> createGetProductPrice(GetProductPrice value) {
        return new JAXBElement<GetProductPrice>(_GetProductPrice_QNAME, GetProductPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "transferProductResponse")
    public JAXBElement<TransferProductResponse> createTransferProductResponse(TransferProductResponse value) {
        return new JAXBElement<TransferProductResponse>(_TransferProductResponse_QNAME, TransferProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcquirableProductsByMsisdn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "getAcquirableProductsByMsisdn")
    public JAXBElement<GetAcquirableProductsByMsisdn> createGetAcquirableProductsByMsisdn(GetAcquirableProductsByMsisdn value) {
        return new JAXBElement<GetAcquirableProductsByMsisdn>(_GetAcquirableProductsByMsisdn_QNAME, GetAcquirableProductsByMsisdn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateProductAsync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "activateProductAsync")
    public JAXBElement<ActivateProductAsync> createActivateProductAsync(ActivateProductAsync value) {
        return new JAXBElement<ActivateProductAsync>(_ActivateProductAsync_QNAME, ActivateProductAsync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "loanProductAsyncResponse")
    public JAXBElement<LoanProductResponse> createLoanProductAsyncResponse(LoanProductResponse value) {
        return new JAXBElement<LoanProductResponse>(_LoanProductAsyncResponse_QNAME, LoanProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "getProductPriceResponse")
    public JAXBElement<GetProductPriceResponse> createGetProductPriceResponse(GetProductPriceResponse value) {
        return new JAXBElement<GetProductPriceResponse>(_GetProductPriceResponse_QNAME, GetProductPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "transferProduct")
    public JAXBElement<TransferProduct> createTransferProduct(TransferProduct value) {
        return new JAXBElement<TransferProduct>(_TransferProduct_QNAME, TransferProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanProductAsync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "loanProductAsync")
    public JAXBElement<LoanProductAsync> createLoanProductAsync(LoanProductAsync value) {
        return new JAXBElement<LoanProductAsync>(_LoanProductAsync_QNAME, LoanProductAsync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellProductAsync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "sellProductAsync")
    public JAXBElement<SellProductAsync> createSellProductAsync(SellProductAsync value) {
        return new JAXBElement<SellProductAsync>(_SellProductAsync_QNAME, SellProductAsync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "purchaseProduct")
    public JAXBElement<PurchaseProduct> createPurchaseProduct(PurchaseProduct value) {
        return new JAXBElement<PurchaseProduct>(_PurchaseProduct_QNAME, PurchaseProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "DeactivateProduct")
    public JAXBElement<DeactivateProduct> createDeactivateProduct(DeactivateProduct value) {
        return new JAXBElement<DeactivateProduct>(_DeactivateProduct_QNAME, DeactivateProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcquirableProductsByMsisdnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "getAcquirableProductsByMsisdnResponse")
    public JAXBElement<GetAcquirableProductsByMsisdnResponse> createGetAcquirableProductsByMsisdnResponse(GetAcquirableProductsByMsisdnResponse value) {
        return new JAXBElement<GetAcquirableProductsByMsisdnResponse>(_GetAcquirableProductsByMsisdnResponse_QNAME, GetAcquirableProductsByMsisdnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOffersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "getOffersResponse")
    public JAXBElement<GetOffersResponse> createGetOffersResponse(GetOffersResponse value) {
        return new JAXBElement<GetOffersResponse>(_GetOffersResponse_QNAME, GetOffersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "DeactivateProductAsyncResponse")
    public JAXBElement<DeactivateProductResponse> createDeactivateProductAsyncResponse(DeactivateProductResponse value) {
        return new JAXBElement<DeactivateProductResponse>(_DeactivateProductAsyncResponse_QNAME, DeactivateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "purchaseProductResponse")
    public JAXBElement<PurchaseProductResponse> createPurchaseProductResponse(PurchaseProductResponse value) {
        return new JAXBElement<PurchaseProductResponse>(_PurchaseProductResponse_QNAME, PurchaseProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "activateProductResponse")
    public JAXBElement<ActivateProductResponse> createActivateProductResponse(ActivateProductResponse value) {
        return new JAXBElement<ActivateProductResponse>(_ActivateProductResponse_QNAME, ActivateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "activateProduct")
    public JAXBElement<ActivateProduct> createActivateProduct(ActivateProduct value) {
        return new JAXBElement<ActivateProduct>(_ActivateProduct_QNAME, ActivateProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "sellProductAsyncResponse")
    public JAXBElement<SellProductResponse> createSellProductAsyncResponse(SellProductResponse value) {
        return new JAXBElement<SellProductResponse>(_SellProductAsyncResponse_QNAME, SellProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "activateProductAsyncResponse")
    public JAXBElement<ActivateProductResponse> createActivateProductAsyncResponse(ActivateProductResponse value) {
        return new JAXBElement<ActivateProductResponse>(_ActivateProductAsyncResponse_QNAME, ActivateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "sellProductResponse")
    public JAXBElement<SellProductResponse> createSellProductResponse(SellProductResponse value) {
        return new JAXBElement<SellProductResponse>(_SellProductResponse_QNAME, SellProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferProductAsync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "transferProductAsync")
    public JAXBElement<TransferProductAsync> createTransferProductAsync(TransferProductAsync value) {
        return new JAXBElement<TransferProductAsync>(_TransferProductAsync_QNAME, TransferProductAsync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "DeactivateProductResponse")
    public JAXBElement<DeactivateProductResponse> createDeactivateProductResponse(DeactivateProductResponse value) {
        return new JAXBElement<DeactivateProductResponse>(_DeactivateProductResponse_QNAME, DeactivateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "loanProductResponse")
    public JAXBElement<LoanProductResponse> createLoanProductResponse(LoanProductResponse value) {
        return new JAXBElement<LoanProductResponse>(_LoanProductResponse_QNAME, LoanProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateProductAsync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "DeactivateProductAsync")
    public JAXBElement<DeactivateProductAsync> createDeactivateProductAsync(DeactivateProductAsync value) {
        return new JAXBElement<DeactivateProductAsync>(_DeactivateProductAsync_QNAME, DeactivateProductAsync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "sellProduct")
    public JAXBElement<SellProduct> createSellProduct(SellProduct value) {
        return new JAXBElement<SellProduct>(_SellProduct_QNAME, SellProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentMethods }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "getPaymentMethods")
    public JAXBElement<GetPaymentMethods> createGetPaymentMethods(GetPaymentMethods value) {
        return new JAXBElement<GetPaymentMethods>(_GetPaymentMethods_QNAME, GetPaymentMethods.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.api.fulfillmentengine.millicom.com/", name = "loanProduct")
    public JAXBElement<LoanProduct> createLoanProduct(LoanProduct value) {
        return new JAXBElement<LoanProduct>(_LoanProduct_QNAME, LoanProduct.class, null, value);
    }

}
