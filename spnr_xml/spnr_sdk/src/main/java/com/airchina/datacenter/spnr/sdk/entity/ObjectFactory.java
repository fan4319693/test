//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.airchina.datacenter.spnr.entity package.
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

    private final static QName _AccommodationCategory_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "AccommodationCategory");
    private final static QName _PriceRefKey_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "PriceRefKey");
    private final static QName _FlightDuration_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "FlightDuration");
    private final static QName _OfferMatch_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OfferMatch");
    private final static QName _DescriptionContent_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "DescriptionContent");
    private final static QName _SaleInfo_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "SaleInfo");
    private final static QName _TravelerInfo_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "TravelerInfo");
    private final static QName _SeatData_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "SeatData");
    private final static QName _SectionSeatData_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "SectionSeatData");
    private final static QName _Attributes_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Attributes");
    private final static QName _Commission_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Commission");
    private final static QName _OfferIDRef_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OfferIDRef");
    private final static QName _FlightFrequency_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "FlightFrequency");
    private final static QName _ServiceDate_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ServiceDate");
    private final static QName _IncentiveData_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "IncentiveData");
    private final static QName _Meals_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Meals");
    private final static QName _FreqGuestNumber_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "FreqGuestNumber");
    private final static QName _OJCorporateHierarchy_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OJ_CorporateHierarchy");
    private final static QName _FareType_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "FareType");
    private final static QName _DestActivityDescriptiveContents_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "DestActivityDescriptiveContents");
    private final static QName _NDCTicketingInfo_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "NDC_TicketingInfo");
    private final static QName _JourneyControlData_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "JourneyControlData");
    private final static QName _DateRangeType_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "DateRangeType");
    private final static QName _FlightTableRef_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "FlightTableRef");
    private final static QName _NumberOfStops_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "NumberOfStops");
    private final static QName _Long_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Long");
    private final static QName _FlightNumber_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "FlightNumber");
    private final static QName _MediaContent_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "MediaContent");
    private final static QName _Diagnostics_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Diagnostics");
    private final static QName _AccommodationService_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "AccommodationService");
    private final static QName _TPAExtensions_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions");
    private final static QName _Corporate_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Corporate");
    private final static QName _RedemptionCurrency_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "RedemptionCurrency");
    private final static QName _Reason_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Reason");
    private final static QName _RecordLocator_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "RecordLocator");
    private final static QName _ClassOfService_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ClassOfService");
    private final static QName _Derivation_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Derivation");
    private final static QName _NumberInParty_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "NumberInParty");
    private final static QName _ContractID_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ContractID");
    private final static QName _InfantData_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "InfantData");
    private final static QName _InstantPurchase_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "InstantPurchase");
    private final static QName _RoomRating_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "roomRating");
    private final static QName _Component_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Component");
    private final static QName _CountryCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "CountryCode");
    private final static QName _Age_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Age");
    private final static QName _AirDirectOnly_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "AirDirectOnly");
    private final static QName _InfoGroup_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "InfoGroup");
    private final static QName _BundleContent_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "BundleContent");
    private final static QName _TravelerRefInfo_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "TravelerRefInfo");
    private final static QName _Comment_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Comment");
    private final static QName _CreditCard_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "CreditCard");
    private final static QName _Penalty_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Penalty");
    private final static QName _BookByDate_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "BookByDate");
    private final static QName _ServiceRefInfo_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ServiceRefInfo");
    private final static QName _Combinality_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Combinality");
    private final static QName _SpclAttributes_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "SpclAttributes");
    private final static QName _ServiceIDRef_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ServiceIDRef");
    private final static QName _ShoppingResponse_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ShoppingResponse");
    private final static QName _ServicesFilter_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ServicesFilter");
    private final static QName _FlightRefInfo_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "FlightRefInfo");
    private final static QName _Redemption_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Redemption");
    private final static QName _ExtensionPoint_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ExtensionPoint");
    private final static QName _PricingCurrency_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "PricingCurrency");
    private final static QName _CityCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "CityCode");
    private final static QName _DepartureTime_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "DepartureTime");
    private final static QName _TicketedDateTime_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "TicketedDateTime");
    private final static QName _DescriptionVariable_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "DescriptionVariable");
    private final static QName _Gender_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Gender");
    private final static QName _InExchangeForTicket_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "InExchangeForTicket");
    private final static QName _JourneyTime_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "JourneyTime");
    private final static QName _ShoppingResponseIDs_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ShoppingResponseIDs");
    private final static QName _Penalties_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Penalties");
    private final static QName _PromoCodes_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "PromoCodes");
    private final static QName _OtherMemberships_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OtherMemberships");
    private final static QName _USDOT_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "USDOT");
    private final static QName _FareCacheKey_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "FareCacheKey");
    private final static QName _DepartureDate_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "DepartureDate");
    private final static QName _SegmentIDRef_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "SegmentIDRef");
    private final static QName _TripMileage_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "TripMileage");
    private final static QName _DateOfBirth_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "DateOfBirth");
    private final static QName _IncentiveProgram_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "IncentiveProgram");
    private final static QName _SeatLocation_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "SeatLocation");
    private final static QName _AirportCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "AirportCode");
    private final static QName _ArrivalCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ArrivalCode");
    private final static QName _OntologyExtension_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OntologyExtension");
    private final static QName _ForInfo_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ForInfo");
    private final static QName _RestrictionType_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "restrictionType");
    private final static QName _FiledCurrencyCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "FiledCurrencyCode");
    private final static QName _LoyaltyProgramRef_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "LoyaltyProgramRef");
    private final static QName _NDCRestrictions_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "NDC_Restrictions");
    private final static QName _Office_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Office");
    private final static QName _ProfileIndex_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ProfileIndex");
    private final static QName _Infant_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Infant");
    private final static QName _ServiceLocation_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ServiceLocation");
    private final static QName _AirlineCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "AirlineCode");
    private final static QName _TicketDesignator_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "TicketDesignator");
    private final static QName _MediaReference_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "MediaReference");
    private final static QName _DepartureCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "DepartureCode");
    private final static QName _PaxType_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "PaxType");
    private final static QName _TicketByDate_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "TicketByDate");
    private final static QName _SearchType_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "SearchType");
    private final static QName _FareBasisCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "FareBasisCode");
    private final static QName _ValidatingCarrier_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ValidatingCarrier");
    private final static QName _FlightSegmentNumber_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "FlightSegmentNumber");
    private final static QName _Disclosure_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Disclosure");
    private final static QName _ExchangeInfo_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ExchangeInfo");
    private final static QName _TravelerIDRef_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "TravelerIDRef");
    private final static QName _FlightTable_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "FlightTable");
    private final static QName _CCIssuer_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "CCIssuer");
    private final static QName _FareRefKey_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "FareRefKey");
    private final static QName _TripPurpose_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "TripPurpose");
    private final static QName _MarriedSegment_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "MarriedSegment");
    private final static QName _Frequency_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Frequency");
    private final static QName _ShoppingResponseID_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ShoppingResponseID");
    private final static QName _ServicesDescriptionTypeDescription_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Description");
    private final static QName _ProductBaseInsurancePlanCost_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "PlanCost");
    private final static QName _ProductBaseInsuranceSupplierPenalties_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "SupplierPenalties");
    private final static QName _ProductBaseInsuranceUniqueID_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "UniqueID");
    private final static QName _ProductBaseInsuranceInsuranceCustomer_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "InsuranceCustomer");
    private final static QName _ProductBaseInsuranceAmendmentPenalties_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "AmendmentPenalties");
    private final static QName _ProductBaseInsurancePolicyDetail_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "PolicyDetail");
    private final static QName _ProductBaseInsuranceCancellationPenalties_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "CancellationPenalties");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.airchina.datacenter.spnr.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TripProfile }
     * 
     */
    public TripProfile createTripProfile() {
        return new TripProfile();
    }

    /**
     * Create an instance of {@link Discounts }
     * 
     */
    public Discounts createDiscounts() {
        return new Discounts();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Extras }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Extras createExtras() {
        return new com.airchina.datacenter.spnr.sdk.entity.Extras();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Rates }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Rates createRates() {
        return new com.airchina.datacenter.spnr.sdk.entity.Rates();
    }

    /**
     * Create an instance of {@link AllRates }
     * 
     */
    public AllRates createAllRates() {
        return new AllRates();
    }

    /**
     * Create an instance of {@link AvailabilityRates }
     * 
     */
    public AvailabilityRates createAvailabilityRates() {
        return new AvailabilityRates();
    }

    /**
     * Create an instance of {@link AvailabilityAllRates }
     * 
     */
    public AvailabilityAllRates createAvailabilityAllRates() {
        return new AvailabilityAllRates();
    }

    /**
     * Create an instance of {@link DestActivityDescriptions }
     * 
     */
    public DestActivityDescriptions createDestActivityDescriptions() {
        return new DestActivityDescriptions();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.RatePlans }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.RatePlans createRatePlans() {
        return new com.airchina.datacenter.spnr.sdk.entity.RatePlans();
    }

    /**
     * Create an instance of {@link ServicePriceType }
     * 
     */
    public ServicePriceType createServicePriceType() {
        return new ServicePriceType();
    }

    /**
     * Create an instance of {@link TaxConfiguration }
     * 
     */
    public TaxConfiguration createTaxConfiguration() {
        return new TaxConfiguration();
    }

    /**
     * Create an instance of {@link SuperPNRType }
     * 
     */
    public SuperPNRType createSuperPNRType() {
        return new SuperPNRType();
    }

    /**
     * Create an instance of {@link CouponRequestCommonType }
     * 
     */
    public CouponRequestCommonType createCouponRequestCommonType() {
        return new CouponRequestCommonType();
    }

    /**
     * Create an instance of {@link TravelerInfoType }
     * 
     */
    public TravelerInfoType createTravelerInfoType() {
        return new TravelerInfoType();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType }
     * 
     */
    public SpecialReqDetailsType createSpecialReqDetailsType() {
        return new SpecialReqDetailsType();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.SpecialRemarks }
     * 
     */
    public SpecialReqDetailsType.SpecialRemarks createSpecialReqDetailsTypeSpecialRemarks() {
        return new SpecialReqDetailsType.SpecialRemarks();
    }

    /**
     * Create an instance of {@link SpecialRemarkType }
     * 
     */
    public SpecialRemarkType createSpecialRemarkType() {
        return new SpecialRemarkType();
    }

    /**
     * Create an instance of {@link SpecialRemarkType.AuthorizedViewers }
     * 
     */
    public SpecialRemarkType.AuthorizedViewers createSpecialRemarkTypeAuthorizedViewers() {
        return new SpecialRemarkType.AuthorizedViewers();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.Remarks }
     * 
     */
    public SpecialReqDetailsType.Remarks createSpecialReqDetailsTypeRemarks() {
        return new SpecialReqDetailsType.Remarks();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.OtherServiceInformations }
     * 
     */
    public SpecialReqDetailsType.OtherServiceInformations createSpecialReqDetailsTypeOtherServiceInformations() {
        return new SpecialReqDetailsType.OtherServiceInformations();
    }

    /**
     * Create an instance of {@link OtherServiceInfoType }
     * 
     */
    public OtherServiceInfoType createOtherServiceInfoType() {
        return new OtherServiceInfoType();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.TransportRequests }
     * 
     */
    public SpecialReqDetailsType.TransportRequests createSpecialReqDetailsTypeTransportRequests() {
        return new SpecialReqDetailsType.TransportRequests();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.TransportRequests.TransportRequest }
     * 
     */
    public SpecialReqDetailsType.TransportRequests.TransportRequest createSpecialReqDetailsTypeTransportRequestsTransportRequest() {
        return new SpecialReqDetailsType.TransportRequests.TransportRequest();
    }

    /**
     * Create an instance of {@link SupplierRefType }
     * 
     */
    public SupplierRefType createSupplierRefType() {
        return new SupplierRefType();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing }
     * 
     */
    public SupplierRefType.Pricing createSupplierRefTypePricing() {
        return new SupplierRefType.Pricing();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing.CancellationRefunds }
     * 
     */
    public SupplierRefType.Pricing.CancellationRefunds createSupplierRefTypePricingCancellationRefunds() {
        return new SupplierRefType.Pricing.CancellationRefunds();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing.CancellationRefunds.CancellationRefund }
     * 
     */
    public SupplierRefType.Pricing.CancellationRefunds.CancellationRefund createSupplierRefTypePricingCancellationRefundsCancellationRefund() {
        return new SupplierRefType.Pricing.CancellationRefunds.CancellationRefund();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing.CancellationFees }
     * 
     */
    public SupplierRefType.Pricing.CancellationFees createSupplierRefTypePricingCancellationFees() {
        return new SupplierRefType.Pricing.CancellationFees();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing.CancellationFees.CancellationFee }
     * 
     */
    public SupplierRefType.Pricing.CancellationFees.CancellationFee createSupplierRefTypePricingCancellationFeesCancellationFee() {
        return new SupplierRefType.Pricing.CancellationFees.CancellationFee();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing.PriceAdjustments }
     * 
     */
    public SupplierRefType.Pricing.PriceAdjustments createSupplierRefTypePricingPriceAdjustments() {
        return new SupplierRefType.Pricing.PriceAdjustments();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment }
     * 
     */
    public SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment createSupplierRefTypePricingPriceAdjustmentsPriceAdjustment() {
        return new SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.SpecialServiceRequests }
     * 
     */
    public SpecialReqDetailsType.SpecialServiceRequests createSpecialReqDetailsTypeSpecialServiceRequests() {
        return new SpecialReqDetailsType.SpecialServiceRequests();
    }

    /**
     * Create an instance of {@link SpecialServiceRequestType }
     * 
     */
    public SpecialServiceRequestType createSpecialServiceRequestType() {
        return new SpecialServiceRequestType();
    }

    /**
     * Create an instance of {@link SpecialServiceRequestType.AgeQualifications }
     * 
     */
    public SpecialServiceRequestType.AgeQualifications createSpecialServiceRequestTypeAgeQualifications() {
        return new SpecialServiceRequestType.AgeQualifications();
    }

    /**
     * Create an instance of {@link SpecialServiceRequestType.InfoEntries }
     * 
     */
    public SpecialServiceRequestType.InfoEntries createSpecialServiceRequestTypeInfoEntries() {
        return new SpecialServiceRequestType.InfoEntries();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.SeatRequests }
     * 
     */
    public SpecialReqDetailsType.SeatRequests createSpecialReqDetailsTypeSeatRequests() {
        return new SpecialReqDetailsType.SeatRequests();
    }

    /**
     * Create an instance of {@link AirTravelerType }
     * 
     */
    public AirTravelerType createAirTravelerType() {
        return new AirTravelerType();
    }

    /**
     * Create an instance of {@link AirTravelerType.APISInformation }
     * 
     */
    public AirTravelerType.APISInformation createAirTravelerTypeAPISInformation() {
        return new AirTravelerType.APISInformation();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link EventCategoriesType }
     * 
     */
    public EventCategoriesType createEventCategoriesType() {
        return new EventCategoriesType();
    }

    /**
     * Create an instance of {@link FeaturesType }
     * 
     */
    public FeaturesType createFeaturesType() {
        return new FeaturesType();
    }

    /**
     * Create an instance of {@link FeaturesType.Feature }
     * 
     */
    public FeaturesType.Feature createFeaturesTypeFeature() {
        return new FeaturesType.Feature();
    }

    /**
     * Create an instance of {@link PromotionDescriptionType }
     * 
     */
    public PromotionDescriptionType createPromotionDescriptionType() {
        return new PromotionDescriptionType();
    }

    /**
     * Create an instance of {@link PromotionDescriptionType.Description }
     * 
     */
    public PromotionDescriptionType.Description createPromotionDescriptionTypeDescription() {
        return new PromotionDescriptionType.Description();
    }

    /**
     * Create an instance of {@link PoliciesType }
     * 
     */
    public PoliciesType createPoliciesType() {
        return new PoliciesType();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy }
     * 
     */
    public PoliciesType.Policy createPoliciesTypePolicy() {
        return new PoliciesType.Policy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.CommissionPolicy }
     * 
     */
    public PoliciesType.Policy.CommissionPolicy createPoliciesTypePolicyCommissionPolicy() {
        return new PoliciesType.Policy.CommissionPolicy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.StayRequirements }
     * 
     */
    public PoliciesType.Policy.StayRequirements createPoliciesTypePolicyStayRequirements() {
        return new PoliciesType.Policy.StayRequirements();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PetsPolicies }
     * 
     */
    public PoliciesType.Policy.PetsPolicies createPoliciesTypePolicyPetsPolicies() {
        return new PoliciesType.Policy.PetsPolicies();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.TaxPolicies }
     * 
     */
    public PoliciesType.Policy.TaxPolicies createPoliciesTypePolicyTaxPolicies() {
        return new PoliciesType.Policy.TaxPolicies();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PolicyInfo }
     * 
     */
    public PoliciesType.Policy.PolicyInfo createPoliciesTypePolicyPolicyInfo() {
        return new PoliciesType.Policy.PolicyInfo();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PolicyInfo.ChildCategories }
     * 
     */
    public PoliciesType.Policy.PolicyInfo.ChildCategories createPoliciesTypePolicyPolicyInfoChildCategories() {
        return new PoliciesType.Policy.PolicyInfo.ChildCategories();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PaymentPolicy }
     * 
     */
    public PoliciesType.Policy.PaymentPolicy createPoliciesTypePolicyPaymentPolicy() {
        return new PoliciesType.Policy.PaymentPolicy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment }
     * 
     */
    public PoliciesType.Policy.PaymentPolicy.RequiredPayment createPoliciesTypePolicyPaymentPolicyRequiredPayment() {
        return new PoliciesType.Policy.PaymentPolicy.RequiredPayment();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments }
     * 
     */
    public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments createPoliciesTypePolicyPaymentPolicyRequiredPaymentAcceptedPayments() {
        return new PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment }
     * 
     */
    public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment createPoliciesTypePolicyPaymentPolicyRequiredPaymentAcceptedPaymentsAcceptedPayment() {
        return new PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields }
     * 
     */
    public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields createPoliciesTypePolicyPaymentPolicyRequiredPaymentAcceptedPaymentsAcceptedPaymentAgressoExtraFields() {
        return new PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress }
     * 
     */
    public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress createPoliciesTypePolicyPaymentPolicyRequiredPaymentAcceptedPaymentsAcceptedPaymentBankAddress() {
        return new PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.CheckoutCharges }
     * 
     */
    public PoliciesType.Policy.CheckoutCharges createPoliciesTypePolicyCheckoutCharges() {
        return new PoliciesType.Policy.CheckoutCharges();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PolicyInfoCodes }
     * 
     */
    public PoliciesType.Policy.PolicyInfoCodes createPoliciesTypePolicyPolicyInfoCodes() {
        return new PoliciesType.Policy.PolicyInfoCodes();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType }
     * 
     */
    public RequiredPaymentsType createRequiredPaymentsType() {
        return new RequiredPaymentsType();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment createRequiredPaymentsTypeGuaranteePayment() {
        return new RequiredPaymentsType.GuaranteePayment();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail }
     * 
     */
    public PkgInvoiceDetail createPkgInvoiceDetail() {
        return new PkgInvoiceDetail();
    }

    /**
     * Create an instance of {@link AccomType }
     * 
     */
    public AccomType createAccomType() {
        return new AccomType();
    }

    /**
     * Create an instance of {@link ContactInfosType }
     * 
     */
    public ContactInfosType createContactInfosType() {
        return new ContactInfosType();
    }

    /**
     * Create an instance of {@link ContactInfoType }
     * 
     */
    public ContactInfoType createContactInfoType() {
        return new ContactInfoType();
    }

    /**
     * Create an instance of {@link ContactInfoType.LocationCodes }
     * 
     */
    public ContactInfoType.LocationCodes createContactInfoTypeLocationCodes() {
        return new ContactInfoType.LocationCodes();
    }

    /**
     * Create an instance of {@link RailRateQualifyingType }
     * 
     */
    public RailRateQualifyingType createRailRateQualifyingType() {
        return new RailRateQualifyingType();
    }

    /**
     * Create an instance of {@link AccessesType }
     * 
     */
    public AccessesType createAccessesType() {
        return new AccessesType();
    }

    /**
     * Create an instance of {@link CabinCameraPosType }
     * 
     */
    public CabinCameraPosType createCabinCameraPosType() {
        return new CabinCameraPosType();
    }

    /**
     * Create an instance of {@link RailPassengerShopTypeDEPRECATE }
     * 
     */
    public RailPassengerShopTypeDEPRECATE createRailPassengerShopTypeDEPRECATE() {
        return new RailPassengerShopTypeDEPRECATE();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType }
     * 
     */
    public AirItineraryPricingInfoType createAirItineraryPricingInfoType() {
        return new AirItineraryPricingInfoType();
    }

    /**
     * Create an instance of {@link LoyaltyPricingType }
     * 
     */
    public LoyaltyPricingType createLoyaltyPricingType() {
        return new LoyaltyPricingType();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.Loyalty }
     * 
     */
    public AirItineraryPricingInfoType.Loyalty createAirItineraryPricingInfoTypeLoyalty() {
        return new AirItineraryPricingInfoType.Loyalty();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.Loyalty.PricingParameters }
     * 
     */
    public AirItineraryPricingInfoType.Loyalty.PricingParameters createAirItineraryPricingInfoTypeLoyaltyPricingParameters() {
        return new AirItineraryPricingInfoType.Loyalty.PricingParameters();
    }

    /**
     * Create an instance of {@link LoyaltyBaseType }
     * 
     */
    public LoyaltyBaseType createLoyaltyBaseType() {
        return new LoyaltyBaseType();
    }

    /**
     * Create an instance of {@link LoyaltyBaseType.Rule }
     * 
     */
    public LoyaltyBaseType.Rule createLoyaltyBaseTypeRule() {
        return new LoyaltyBaseType.Rule();
    }

    /**
     * Create an instance of {@link LoyaltyPricingType.Combinations }
     * 
     */
    public LoyaltyPricingType.Combinations createLoyaltyPricingTypeCombinations() {
        return new LoyaltyPricingType.Combinations();
    }

    /**
     * Create an instance of {@link LoyaltyPricingType.Combinations.Combination }
     * 
     */
    public LoyaltyPricingType.Combinations.Combination createLoyaltyPricingTypeCombinationsCombination() {
        return new LoyaltyPricingType.Combinations.Combination();
    }

    /**
     * Create an instance of {@link LoyaltyDetailsPricingType }
     * 
     */
    public LoyaltyDetailsPricingType createLoyaltyDetailsPricingType() {
        return new LoyaltyDetailsPricingType();
    }

    /**
     * Create an instance of {@link LoyaltyPricingType.Combinations.Combination.LoyaltyDetails }
     * 
     */
    public LoyaltyPricingType.Combinations.Combination.LoyaltyDetails createLoyaltyPricingTypeCombinationsCombinationLoyaltyDetails() {
        return new LoyaltyPricingType.Combinations.Combination.LoyaltyDetails();
    }

    /**
     * Create an instance of {@link LoyaltyPricingType.Combinations.Combination.LoyaltyDetails.PricingParameters }
     * 
     */
    public LoyaltyPricingType.Combinations.Combination.LoyaltyDetails.PricingParameters createLoyaltyPricingTypeCombinationsCombinationLoyaltyDetailsPricingParameters() {
        return new LoyaltyPricingType.Combinations.Combination.LoyaltyDetails.PricingParameters();
    }

    /**
     * Create an instance of {@link LoyaltyDetailsPricingType.Combinations }
     * 
     */
    public LoyaltyDetailsPricingType.Combinations createLoyaltyDetailsPricingTypeCombinations() {
        return new LoyaltyDetailsPricingType.Combinations();
    }

    /**
     * Create an instance of {@link LoyaltyDetailsPricingType.Combinations.Combination }
     * 
     */
    public LoyaltyDetailsPricingType.Combinations.Combination createLoyaltyDetailsPricingTypeCombinationsCombination() {
        return new LoyaltyDetailsPricingType.Combinations.Combination();
    }

    /**
     * Create an instance of {@link LoyaltyPTCType }
     * 
     */
    public LoyaltyPTCType createLoyaltyPTCType() {
        return new LoyaltyPTCType();
    }

    /**
     * Create an instance of {@link LoyaltyPTCType.PTC }
     * 
     */
    public LoyaltyPTCType.PTC createLoyaltyPTCTypePTC() {
        return new LoyaltyPTCType.PTC();
    }

    /**
     * Create an instance of {@link LoyaltyPTCType.PTC.Redemption }
     * 
     */
    public LoyaltyPTCType.PTC.Redemption createLoyaltyPTCTypePTCRedemption() {
        return new LoyaltyPTCType.PTC.Redemption();
    }

    /**
     * Create an instance of {@link LoyaltyDetailsPricingType.Combinations.Combination.Redemption }
     * 
     */
    public LoyaltyDetailsPricingType.Combinations.Combination.Redemption createLoyaltyDetailsPricingTypeCombinationsCombinationRedemption() {
        return new LoyaltyDetailsPricingType.Combinations.Combination.Redemption();
    }

    /**
     * Create an instance of {@link LoyaltyPricingType.Combinations.Combination.Redemption }
     * 
     */
    public LoyaltyPricingType.Combinations.Combination.Redemption createLoyaltyPricingTypeCombinationsCombinationRedemption() {
        return new LoyaltyPricingType.Combinations.Combination.Redemption();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.BagAllowRefs }
     * 
     */
    public AirItineraryPricingInfoType.BagAllowRefs createAirItineraryPricingInfoTypeBagAllowRefs() {
        return new AirItineraryPricingInfoType.BagAllowRefs();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.SpecialServiceRequests }
     * 
     */
    public AirItineraryPricingInfoType.SpecialServiceRequests createAirItineraryPricingInfoTypeSpecialServiceRequests() {
        return new AirItineraryPricingInfoType.SpecialServiceRequests();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.FareInfos }
     * 
     */
    public AirItineraryPricingInfoType.FareInfos createAirItineraryPricingInfoTypeFareInfos() {
        return new AirItineraryPricingInfoType.FareInfos();
    }

    /**
     * Create an instance of {@link FareInfoType }
     * 
     */
    public FareInfoType createFareInfoType() {
        return new FareInfoType();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo }
     * 
     */
    public FareInfoType.FareInfo createFareInfoTypeFareInfo() {
        return new FareInfoType.FareInfo();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.ReissueFees }
     * 
     */
    public FareInfoType.FareInfo.ReissueFees createFareInfoTypeFareInfoReissueFees() {
        return new FareInfoType.FareInfo.ReissueFees();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.ReissueFees.ReissueFee }
     * 
     */
    public FareInfoType.FareInfo.ReissueFees.ReissueFee createFareInfoTypeFareInfoReissueFeesReissueFee() {
        return new FareInfoType.FareInfo.ReissueFees.ReissueFee();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.Fare }
     * 
     */
    public FareInfoType.FareInfo.Fare createFareInfoTypeFareInfoFare() {
        return new FareInfoType.FareInfo.Fare();
    }

    /**
     * Create an instance of {@link RuleInfoType }
     * 
     */
    public RuleInfoType createRuleInfoType() {
        return new RuleInfoType();
    }

    /**
     * Create an instance of {@link RuleInfoType.ResTicketingRules }
     * 
     */
    public RuleInfoType.ResTicketingRules createRuleInfoTypeResTicketingRules() {
        return new RuleInfoType.ResTicketingRules();
    }

    /**
     * Create an instance of {@link AdvResTicketingType }
     * 
     */
    public AdvResTicketingType createAdvResTicketingType() {
        return new AdvResTicketingType();
    }

    /**
     * Create an instance of {@link AddressesType }
     * 
     */
    public AddressesType createAddressesType() {
        return new AddressesType();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType }
     * 
     */
    public ItineraryItemResponseType createItineraryItemResponseType() {
        return new ItineraryItemResponseType();
    }

    /**
     * Create an instance of {@link VehicleRentalCoreType }
     * 
     */
    public VehicleRentalCoreType createVehicleRentalCoreType() {
        return new VehicleRentalCoreType();
    }

    /**
     * Create an instance of {@link PickUpLocationType }
     * 
     */
    public PickUpLocationType createPickUpLocationType() {
        return new PickUpLocationType();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation }
     * 
     */
    public ItineraryItemResponseType.Accommodation createItineraryItemResponseTypeAccommodation() {
        return new ItineraryItemResponseType.Accommodation();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation.RoomProfiles }
     * 
     */
    public ItineraryItemResponseType.Accommodation.RoomProfiles createItineraryItemResponseTypeAccommodationRoomProfiles() {
        return new ItineraryItemResponseType.Accommodation.RoomProfiles();
    }

    /**
     * Create an instance of {@link RoomProfileType }
     * 
     */
    public RoomProfileType createRoomProfileType() {
        return new RoomProfileType();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile }
     * 
     */
    public ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile createItineraryItemResponseTypeAccommodationRoomProfilesRoomProfile() {
        return new ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices }
     * 
     */
    public ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices createItineraryItemResponseTypeAccommodationRoomProfilesRoomProfilePrices() {
        return new ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices();
    }

    /**
     * Create an instance of {@link OJVoucherBaseType }
     * 
     */
    public OJVoucherBaseType createOJVoucherBaseType() {
        return new OJVoucherBaseType();
    }

    /**
     * Create an instance of {@link OJVoucherInfosType }
     * 
     */
    public OJVoucherInfosType createOJVoucherInfosType() {
        return new OJVoucherInfosType();
    }

    /**
     * Create an instance of {@link FacilityInfoType }
     * 
     */
    public FacilityInfoType createFacilityInfoType() {
        return new FacilityInfoType();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms }
     * 
     */
    public FacilityInfoType.GuestRooms createFacilityInfoTypeGuestRooms() {
        return new FacilityInfoType.GuestRooms();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms.GuestRoom }
     * 
     */
    public FacilityInfoType.GuestRooms.GuestRoom createFacilityInfoTypeGuestRoomsGuestRoom() {
        return new FacilityInfoType.GuestRooms.GuestRoom();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms.GuestRoom.Amenities }
     * 
     */
    public FacilityInfoType.GuestRooms.GuestRoom.Amenities createFacilityInfoTypeGuestRoomsGuestRoomAmenities() {
        return new FacilityInfoType.GuestRooms.GuestRoom.Amenities();
    }

    /**
     * Create an instance of {@link MeetingRoomsType }
     * 
     */
    public MeetingRoomsType createMeetingRoomsType() {
        return new MeetingRoomsType();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms }
     * 
     */
    public FacilityInfoType.MeetingRooms createFacilityInfoTypeMeetingRooms() {
        return new FacilityInfoType.MeetingRooms();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups createFacilityInfoTypeMeetingRoomsPricingGroups() {
        return new FacilityInfoType.MeetingRooms.PricingGroups();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup createFacilityInfoTypeMeetingRoomsPricingGroupsPricingGroup() {
        return new FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs createFacilityInfoTypeMeetingRoomsPricingGroupsPricingGroupSpecificRoomTimeslotConfigs() {
        return new FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates createFacilityInfoTypeMeetingRoomsPricingGroupsPricingGroupPeriodRates() {
        return new FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates createFacilityInfoTypeMeetingRoomsPricingGroupsPricingGroupDayRates() {
        return new FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates createFacilityInfoTypeMeetingRoomsPricingGroupsPricingGroupTimeSlotRates() {
        return new FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms createFacilityInfoTypeMeetingRoomsPricingGroupsPricingGroupTimeSlotRatesRooms() {
        return new FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods createFacilityInfoTypeMeetingRoomsPricingGroupsPricingGroupPeriods() {
        return new FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.Codes }
     * 
     */
    public FacilityInfoType.MeetingRooms.Codes createFacilityInfoTypeMeetingRoomsCodes() {
        return new FacilityInfoType.MeetingRooms.Codes();
    }

    /**
     * Create an instance of {@link MeetingRoomsType.MeetingRoom }
     * 
     */
    public MeetingRoomsType.MeetingRoom createMeetingRoomsTypeMeetingRoom() {
        return new MeetingRoomsType.MeetingRoom();
    }

    /**
     * Create an instance of {@link MeetingRoomsType.MeetingRoom.Codes }
     * 
     */
    public MeetingRoomsType.MeetingRoom.Codes createMeetingRoomsTypeMeetingRoomCodes() {
        return new MeetingRoomsType.MeetingRoom.Codes();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType }
     * 
     */
    public BasicPropertyInfoType createBasicPropertyInfoType() {
        return new BasicPropertyInfoType();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.ContactNumbers }
     * 
     */
    public BasicPropertyInfoType.ContactNumbers createBasicPropertyInfoTypeContactNumbers() {
        return new BasicPropertyInfoType.ContactNumbers();
    }

    /**
     * Create an instance of {@link PkgPassengerListItem }
     * 
     */
    public PkgPassengerListItem createPkgPassengerListItem() {
        return new PkgPassengerListItem();
    }

    /**
     * Create an instance of {@link TrainInfoType }
     * 
     */
    public TrainInfoType createTrainInfoType() {
        return new TrainInfoType();
    }

    /**
     * Create an instance of {@link VideoDescriptionType }
     * 
     */
    public VideoDescriptionType createVideoDescriptionType() {
        return new VideoDescriptionType();
    }

    /**
     * Create an instance of {@link AirAncillaryLoungeProductType }
     * 
     */
    public AirAncillaryLoungeProductType createAirAncillaryLoungeProductType() {
        return new AirAncillaryLoungeProductType();
    }

    /**
     * Create an instance of {@link AirAncillariesAirportProductSummaryType }
     * 
     */
    public AirAncillariesAirportProductSummaryType createAirAncillariesAirportProductSummaryType() {
        return new AirAncillariesAirportProductSummaryType();
    }

    /**
     * Create an instance of {@link PackageProductType }
     * 
     */
    public PackageProductType createPackageProductType() {
        return new PackageProductType();
    }

    /**
     * Create an instance of {@link PackageProductType.Attachments }
     * 
     */
    public PackageProductType.Attachments createPackageProductTypeAttachments() {
        return new PackageProductType.Attachments();
    }

    /**
     * Create an instance of {@link CancelPenaltyType }
     * 
     */
    public CancelPenaltyType createCancelPenaltyType() {
        return new CancelPenaltyType();
    }

    /**
     * Create an instance of {@link AgeQualificationType }
     * 
     */
    public AgeQualificationType createAgeQualificationType() {
        return new AgeQualificationType();
    }

    /**
     * Create an instance of {@link RelativePositionsType }
     * 
     */
    public RelativePositionsType createRelativePositionsType() {
        return new RelativePositionsType();
    }

    /**
     * Create an instance of {@link ServiceBundleNoPriceType }
     * 
     */
    public ServiceBundleNoPriceType createServiceBundleNoPriceType() {
        return new ServiceBundleNoPriceType();
    }

    /**
     * Create an instance of {@link ServiceBundleNoPriceType.Item }
     * 
     */
    public ServiceBundleNoPriceType.Item createServiceBundleNoPriceTypeItem() {
        return new ServiceBundleNoPriceType.Item();
    }

    /**
     * Create an instance of {@link ServiceBundleNoPriceType.Item.ItemDetail }
     * 
     */
    public ServiceBundleNoPriceType.Item.ItemDetail createServiceBundleNoPriceTypeItemItemDetail() {
        return new ServiceBundleNoPriceType.Item.ItemDetail();
    }

    /**
     * Create an instance of {@link ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions }
     * 
     */
    public ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions createServiceBundleNoPriceTypeItemItemDetailBookingInstructions() {
        return new ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions();
    }

    /**
     * Create an instance of {@link OJPaymentFormType }
     * 
     */
    public OJPaymentFormType createOJPaymentFormType() {
        return new OJPaymentFormType();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType }
     * 
     */
    public TravelerInfoSummaryType createTravelerInfoSummaryType() {
        return new TravelerInfoSummaryType();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType }
     * 
     */
    public PriceRequestInformationType createPriceRequestInformationType() {
        return new PriceRequestInformationType();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.PriceRequestInformation }
     * 
     */
    public TravelerInfoSummaryType.PriceRequestInformation createTravelerInfoSummaryTypePriceRequestInformation() {
        return new TravelerInfoSummaryType.PriceRequestInformation();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing }
     * 
     */
    public TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing createTravelerInfoSummaryTypePriceRequestInformationDiscountPricing() {
        return new TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing();
    }

    /**
     * Create an instance of {@link CouponType }
     * 
     */
    public CouponType createCouponType() {
        return new CouponType();
    }

    /**
     * Create an instance of {@link CouponType.RedemptionInfo }
     * 
     */
    public CouponType.RedemptionInfo createCouponTypeRedemptionInfo() {
        return new CouponType.RedemptionInfo();
    }

    /**
     * Create an instance of {@link AssociatedContentType }
     * 
     */
    public AssociatedContentType createAssociatedContentType() {
        return new AssociatedContentType();
    }

    /**
     * Create an instance of {@link AssociatedContentType.AssocItems }
     * 
     */
    public AssociatedContentType.AssocItems createAssociatedContentTypeAssocItems() {
        return new AssociatedContentType.AssocItems();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType }
     * 
     */
    public RatePlanCandidatesType createRatePlanCandidatesType() {
        return new RatePlanCandidatesType();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType.RatePlanCandidate }
     * 
     */
    public RatePlanCandidatesType.RatePlanCandidate createRatePlanCandidatesTypeRatePlanCandidate() {
        return new RatePlanCandidatesType.RatePlanCandidate();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType.RatePlanCandidate.HotelRefs }
     * 
     */
    public RatePlanCandidatesType.RatePlanCandidate.HotelRefs createRatePlanCandidatesTypeRatePlanCandidateHotelRefs() {
        return new RatePlanCandidatesType.RatePlanCandidate.HotelRefs();
    }

    /**
     * Create an instance of {@link BeneficiaryType }
     * 
     */
    public BeneficiaryType createBeneficiaryType() {
        return new BeneficiaryType();
    }

    /**
     * Create an instance of {@link OntologyWeightType }
     * 
     */
    public OntologyWeightType createOntologyWeightType() {
        return new OntologyWeightType();
    }

    /**
     * Create an instance of {@link OntologyDistanceType }
     * 
     */
    public OntologyDistanceType createOntologyDistanceType() {
        return new OntologyDistanceType();
    }

    /**
     * Create an instance of {@link SeatDimensionType }
     * 
     */
    public SeatDimensionType createSeatDimensionType() {
        return new SeatDimensionType();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType }
     * 
     */
    public SupplierDescriptiveContentType createSupplierDescriptiveContentType() {
        return new SupplierDescriptiveContentType();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.VoucherProductTypes }
     * 
     */
    public SupplierDescriptiveContentType.VoucherProductTypes createSupplierDescriptiveContentTypeVoucherProductTypes() {
        return new SupplierDescriptiveContentType.VoucherProductTypes();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.MergeConfigurations }
     * 
     */
    public SupplierDescriptiveContentType.MergeConfigurations createSupplierDescriptiveContentTypeMergeConfigurations() {
        return new SupplierDescriptiveContentType.MergeConfigurations();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.Deduplication }
     * 
     */
    public SupplierDescriptiveContentType.Deduplication createSupplierDescriptiveContentTypeDeduplication() {
        return new SupplierDescriptiveContentType.Deduplication();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.Deduplication.Algorithm }
     * 
     */
    public SupplierDescriptiveContentType.Deduplication.Algorithm createSupplierDescriptiveContentTypeDeduplicationAlgorithm() {
        return new SupplierDescriptiveContentType.Deduplication.Algorithm();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.Policies }
     * 
     */
    public SupplierDescriptiveContentType.Policies createSupplierDescriptiveContentTypePolicies() {
        return new SupplierDescriptiveContentType.Policies();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices createSupplierDescriptiveContentTypeBookingOffices() {
        return new SupplierDescriptiveContentType.BookingOffices();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice createSupplierDescriptiveContentTypeBookingOfficesBookingOffice() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeContract() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeContractPaymentDetails() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeContractPaymentDetailsPaymentDetail() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeContractPaymentDetailsPaymentDetailAgressoExtraFields() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeSupplierNotification() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeContacts() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeNames() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names();
    }

    /**
     * Create an instance of {@link ActionsType }
     * 
     */
    public ActionsType createActionsType() {
        return new ActionsType();
    }

    /**
     * Create an instance of {@link AirlinePrefType }
     * 
     */
    public AirlinePrefType createAirlinePrefType() {
        return new AirlinePrefType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link ParagraphType }
     * 
     */
    public ParagraphType createParagraphType() {
        return new ParagraphType();
    }

    /**
     * Create an instance of {@link CabinAvailabilityType }
     * 
     */
    public CabinAvailabilityType createCabinAvailabilityType() {
        return new CabinAvailabilityType();
    }

    /**
     * Create an instance of {@link TransportInfoType }
     * 
     */
    public TransportInfoType createTransportInfoType() {
        return new TransportInfoType();
    }

    /**
     * Create an instance of {@link NotificationType }
     * 
     */
    public NotificationType createNotificationType() {
        return new NotificationType();
    }

    /**
     * Create an instance of {@link AccommodationInfoType }
     * 
     */
    public AccommodationInfoType createAccommodationInfoType() {
        return new AccommodationInfoType();
    }

    /**
     * Create an instance of {@link FlightSegmentBaseType }
     * 
     */
    public FlightSegmentBaseType createFlightSegmentBaseType() {
        return new FlightSegmentBaseType();
    }

    /**
     * Create an instance of {@link PkgAirSegmentType }
     * 
     */
    public PkgAirSegmentType createPkgAirSegmentType() {
        return new PkgAirSegmentType();
    }

    /**
     * Create an instance of {@link TravelersType }
     * 
     */
    public TravelersType createTravelersType() {
        return new TravelersType();
    }

    /**
     * Create an instance of {@link TravelersType.Traveler }
     * 
     */
    public TravelersType.Traveler createTravelersTypeTraveler() {
        return new TravelersType.Traveler();
    }

    /**
     * Create an instance of {@link PaymentLoyaltyType }
     * 
     */
    public PaymentLoyaltyType createPaymentLoyaltyType() {
        return new PaymentLoyaltyType();
    }

    /**
     * Create an instance of {@link PaymentLoyaltyType.Redeem }
     * 
     */
    public PaymentLoyaltyType.Redeem createPaymentLoyaltyTypeRedeem() {
        return new PaymentLoyaltyType.Redeem();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.CustomerType }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.CustomerType createCustomerType() {
        return new com.airchina.datacenter.spnr.sdk.entity.CustomerType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.CustomerType.CorporateInfo }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.CustomerType.CorporateInfo createCustomerTypeCorporateInfo() {
        return new com.airchina.datacenter.spnr.sdk.entity.CustomerType.CorporateInfo();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.CustomerType.CorporateInfo.UserRoles }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.CustomerType.CorporateInfo.UserRoles createCustomerTypeCorporateInfoUserRoles() {
        return new com.airchina.datacenter.spnr.sdk.entity.CustomerType.CorporateInfo.UserRoles();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType }
     * 
     */
    public VehicleRentalRateType createVehicleRentalRateType() {
        return new VehicleRentalRateType();
    }

    /**
     * Create an instance of {@link PaymentFormType }
     * 
     */
    public PaymentFormType createPaymentFormType() {
        return new PaymentFormType();
    }

    /**
     * Create an instance of {@link PaymentFormType.Other }
     * 
     */
    public PaymentFormType.Other createPaymentFormTypeOther() {
        return new PaymentFormType.Other();
    }

    /**
     * Create an instance of {@link PaymentFormType.Ticket }
     * 
     */
    public PaymentFormType.Ticket createPaymentFormTypeTicket() {
        return new PaymentFormType.Ticket();
    }

    /**
     * Create an instance of {@link GeocodingType }
     * 
     */
    public GeocodingType createGeocodingType() {
        return new GeocodingType();
    }

    /**
     * Create an instance of {@link FormulaType }
     * 
     */
    public FormulaType createFormulaType() {
        return new FormulaType();
    }

    /**
     * Create an instance of {@link OffLocationServiceCoreType }
     * 
     */
    public OffLocationServiceCoreType createOffLocationServiceCoreType() {
        return new OffLocationServiceCoreType();
    }

    /**
     * Create an instance of {@link BaseFareType }
     * 
     */
    public BaseFareType createBaseFareType() {
        return new BaseFareType();
    }

    /**
     * Create an instance of {@link BaseFareType.FiledIn }
     * 
     */
    public BaseFareType.FiledIn createBaseFareTypeFiledIn() {
        return new BaseFareType.FiledIn();
    }

    /**
     * Create an instance of {@link SellableProductsType }
     * 
     */
    public SellableProductsType createSellableProductsType() {
        return new SellableProductsType();
    }

    /**
     * Create an instance of {@link SellableProductsType.SellableProduct }
     * 
     */
    public SellableProductsType.SellableProduct createSellableProductsTypeSellableProduct() {
        return new SellableProductsType.SellableProduct();
    }

    /**
     * Create an instance of {@link ExtraType }
     * 
     */
    public ExtraType createExtraType() {
        return new ExtraType();
    }

    /**
     * Create an instance of {@link ExtraType.Extra }
     * 
     */
    public ExtraType.Extra createExtraTypeExtra() {
        return new ExtraType.Extra();
    }

    /**
     * Create an instance of {@link MultimediaObjectType }
     * 
     */
    public MultimediaObjectType createMultimediaObjectType() {
        return new MultimediaObjectType();
    }

    /**
     * Create an instance of {@link RoomStayType }
     * 
     */
    public RoomStayType createRoomStayType() {
        return new RoomStayType();
    }

    /**
     * Create an instance of {@link DateTimeSpanType }
     * 
     */
    public DateTimeSpanType createDateTimeSpanType() {
        return new DateTimeSpanType();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates }
     * 
     */
    public RoomStayType.RoomRates createRoomStayTypeRoomRates() {
        return new RoomStayType.RoomRates();
    }

    /**
     * Create an instance of {@link RoomRateType }
     * 
     */
    public RoomRateType createRoomRateType() {
        return new RoomRateType();
    }

    /**
     * Create an instance of {@link RoomRateType.Features }
     * 
     */
    public RoomRateType.Features createRoomRateTypeFeatures() {
        return new RoomRateType.Features();
    }

    /**
     * Create an instance of {@link RoomStayType.RatePlans }
     * 
     */
    public RoomStayType.RatePlans createRoomStayTypeRatePlans() {
        return new RoomStayType.RatePlans();
    }

    /**
     * Create an instance of {@link RatePlanType }
     * 
     */
    public RatePlanType createRatePlanType() {
        return new RatePlanType();
    }

    /**
     * Create an instance of {@link RatePlanType.SellingMode }
     * 
     */
    public RatePlanType.SellingMode createRatePlanTypeSellingMode() {
        return new RatePlanType.SellingMode();
    }

    /**
     * Create an instance of {@link RatePlanType.SellingMode.Contracts }
     * 
     */
    public RatePlanType.SellingMode.Contracts createRatePlanTypeSellingModeContracts() {
        return new RatePlanType.SellingMode.Contracts();
    }

    /**
     * Create an instance of {@link RatePlanType.TaxPolicies }
     * 
     */
    public RatePlanType.TaxPolicies createRatePlanTypeTaxPolicies() {
        return new RatePlanType.TaxPolicies();
    }

    /**
     * Create an instance of {@link RatePlanType.ChildPricings }
     * 
     */
    public RatePlanType.ChildPricings createRatePlanTypeChildPricings() {
        return new RatePlanType.ChildPricings();
    }

    /**
     * Create an instance of {@link RatePlanType.ChildPricings.ChildPricing }
     * 
     */
    public RatePlanType.ChildPricings.ChildPricing createRatePlanTypeChildPricingsChildPricing() {
        return new RatePlanType.ChildPricings.ChildPricing();
    }

    /**
     * Create an instance of {@link RatePlanType.RatePlanLevelFee }
     * 
     */
    public RatePlanType.RatePlanLevelFee createRatePlanTypeRatePlanLevelFee() {
        return new RatePlanType.RatePlanLevelFee();
    }

    /**
     * Create an instance of {@link RatePlanType.RatePlanShoulders }
     * 
     */
    public RatePlanType.RatePlanShoulders createRatePlanTypeRatePlanShoulders() {
        return new RatePlanType.RatePlanShoulders();
    }

    /**
     * Create an instance of {@link RatePlanType.Rates }
     * 
     */
    public RatePlanType.Rates createRatePlanTypeRates() {
        return new RatePlanType.Rates();
    }

    /**
     * Create an instance of {@link RateUploadType }
     * 
     */
    public RateUploadType createRateUploadType() {
        return new RateUploadType();
    }

    /**
     * Create an instance of {@link RatePlanType.Rates.Rate }
     * 
     */
    public RatePlanType.Rates.Rate createRatePlanTypeRatesRate() {
        return new RatePlanType.Rates.Rate();
    }

    /**
     * Create an instance of {@link RatePlanType.Rates.Rate.MealPlans }
     * 
     */
    public RatePlanType.Rates.Rate.MealPlans createRatePlanTypeRatesRateMealPlans() {
        return new RatePlanType.Rates.Rate.MealPlans();
    }

    /**
     * Create an instance of {@link RateUploadType.AdditionalGuestAmounts }
     * 
     */
    public RateUploadType.AdditionalGuestAmounts createRateUploadTypeAdditionalGuestAmounts() {
        return new RateUploadType.AdditionalGuestAmounts();
    }

    /**
     * Create an instance of {@link RateUploadType.BaseByGuestAmts }
     * 
     */
    public RateUploadType.BaseByGuestAmts createRateUploadTypeBaseByGuestAmts() {
        return new RateUploadType.BaseByGuestAmts();
    }

    /**
     * Create an instance of {@link RatePlanType.TaxesAndMargins }
     * 
     */
    public RatePlanType.TaxesAndMargins createRatePlanTypeTaxesAndMargins() {
        return new RatePlanType.TaxesAndMargins();
    }

    /**
     * Create an instance of {@link RatePlanType.TaxesAndMargins.TaxAndMargin }
     * 
     */
    public RatePlanType.TaxesAndMargins.TaxAndMargin createRatePlanTypeTaxesAndMarginsTaxAndMargin() {
        return new RatePlanType.TaxesAndMargins.TaxAndMargin();
    }

    /**
     * Create an instance of {@link RatePlanType.Extras }
     * 
     */
    public RatePlanType.Extras createRatePlanTypeExtras() {
        return new RatePlanType.Extras();
    }

    /**
     * Create an instance of {@link BookingRulesType }
     * 
     */
    public BookingRulesType createBookingRulesType() {
        return new BookingRulesType();
    }

    /**
     * Create an instance of {@link RatePlanType.BookingRules }
     * 
     */
    public RatePlanType.BookingRules createRatePlanTypeBookingRules() {
        return new RatePlanType.BookingRules();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule }
     * 
     */
    public BookingRulesType.BookingRule createBookingRulesTypeBookingRule() {
        return new BookingRulesType.BookingRule();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.AddtionalRules }
     * 
     */
    public BookingRulesType.BookingRule.AddtionalRules createBookingRulesTypeBookingRuleAddtionalRules() {
        return new BookingRulesType.BookingRule.AddtionalRules();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.DOWRestrictions }
     * 
     */
    public BookingRulesType.BookingRule.DOWRestrictions createBookingRulesTypeBookingRuleDOWRestrictions() {
        return new BookingRulesType.BookingRule.DOWRestrictions();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.AcceptableGuarantees }
     * 
     */
    public BookingRulesType.BookingRule.AcceptableGuarantees createBookingRulesTypeBookingRuleAcceptableGuarantees() {
        return new BookingRulesType.BookingRule.AcceptableGuarantees();
    }

    /**
     * Create an instance of {@link GuaranteeType }
     * 
     */
    public GuaranteeType createGuaranteeType() {
        return new GuaranteeType();
    }

    /**
     * Create an instance of {@link GuaranteeType.GuaranteesAccepted }
     * 
     */
    public GuaranteeType.GuaranteesAccepted createGuaranteeTypeGuaranteesAccepted() {
        return new GuaranteeType.GuaranteesAccepted();
    }

    /**
     * Create an instance of {@link RatePlanType.Notifications }
     * 
     */
    public RatePlanType.Notifications createRatePlanTypeNotifications() {
        return new RatePlanType.Notifications();
    }

    /**
     * Create an instance of {@link RatePlanType.MealPlans }
     * 
     */
    public RatePlanType.MealPlans createRatePlanTypeMealPlans() {
        return new RatePlanType.MealPlans();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomTypes }
     * 
     */
    public RoomStayType.RoomTypes createRoomStayTypeRoomTypes() {
        return new RoomStayType.RoomTypes();
    }

    /**
     * Create an instance of {@link RoomTypeType }
     * 
     */
    public RoomTypeType createRoomTypeType() {
        return new RoomTypeType();
    }

    /**
     * Create an instance of {@link PkgFlightSegmentBaseType }
     * 
     */
    public PkgFlightSegmentBaseType createPkgFlightSegmentBaseType() {
        return new PkgFlightSegmentBaseType();
    }

    /**
     * Create an instance of {@link HotelRoomListType }
     * 
     */
    public HotelRoomListType createHotelRoomListType() {
        return new HotelRoomListType();
    }

    /**
     * Create an instance of {@link HotelRoomListType.RoomStays }
     * 
     */
    public HotelRoomListType.RoomStays createHotelRoomListTypeRoomStays() {
        return new HotelRoomListType.RoomStays();
    }

    /**
     * Create an instance of {@link DirectBillType }
     * 
     */
    public DirectBillType createDirectBillType() {
        return new DirectBillType();
    }

    /**
     * Create an instance of {@link ContactPersonType }
     * 
     */
    public ContactPersonType createContactPersonType() {
        return new ContactPersonType();
    }

    /**
     * Create an instance of {@link HotelRoomListType.MasterContact }
     * 
     */
    public HotelRoomListType.MasterContact createHotelRoomListTypeMasterContact() {
        return new HotelRoomListType.MasterContact();
    }

    /**
     * Create an instance of {@link HotelRoomListType.Guests }
     * 
     */
    public HotelRoomListType.Guests createHotelRoomListTypeGuests() {
        return new HotelRoomListType.Guests();
    }

    /**
     * Create an instance of {@link HotelRoomListType.Guests.Guest }
     * 
     */
    public HotelRoomListType.Guests.Guest createHotelRoomListTypeGuestsGuest() {
        return new HotelRoomListType.Guests.Guest();
    }

    /**
     * Create an instance of {@link HotelPaymentFormType }
     * 
     */
    public HotelPaymentFormType createHotelPaymentFormType() {
        return new HotelPaymentFormType();
    }

    /**
     * Create an instance of {@link BiasingInfos }
     * 
     */
    public BiasingInfos createBiasingInfos() {
        return new BiasingInfos();
    }

    /**
     * Create an instance of {@link CancelInfoRSType }
     * 
     */
    public CancelInfoRSType createCancelInfoRSType() {
        return new CancelInfoRSType();
    }

    /**
     * Create an instance of {@link CoreBagAllowanceType }
     * 
     */
    public CoreBagAllowanceType createCoreBagAllowanceType() {
        return new CoreBagAllowanceType();
    }

    /**
     * Create an instance of {@link CarryOnAllowanceType }
     * 
     */
    public CarryOnAllowanceType createCarryOnAllowanceType() {
        return new CarryOnAllowanceType();
    }

    /**
     * Create an instance of {@link CarryOnAllowanceType.BookingInstructions }
     * 
     */
    public CarryOnAllowanceType.BookingInstructions createCarryOnAllowanceTypeBookingInstructions() {
        return new CarryOnAllowanceType.BookingInstructions();
    }

    /**
     * Create an instance of {@link FlightDetailsType }
     * 
     */
    public FlightDetailsType createFlightDetailsType() {
        return new FlightDetailsType();
    }

    /**
     * Create an instance of {@link FlightDetailsType.FlightLegInfo }
     * 
     */
    public FlightDetailsType.FlightLegInfo createFlightDetailsTypeFlightLegInfo() {
        return new FlightDetailsType.FlightLegInfo();
    }

    /**
     * Create an instance of {@link FlightDetailsType.FlightLegInfo.OperationTimes }
     * 
     */
    public FlightDetailsType.FlightLegInfo.OperationTimes createFlightDetailsTypeFlightLegInfoOperationTimes() {
        return new FlightDetailsType.FlightLegInfo.OperationTimes();
    }

    /**
     * Create an instance of {@link ConversionType }
     * 
     */
    public ConversionType createConversionType() {
        return new ConversionType();
    }

    /**
     * Create an instance of {@link RestrictionLocationsType }
     * 
     */
    public RestrictionLocationsType createRestrictionLocationsType() {
        return new RestrictionLocationsType();
    }

    /**
     * Create an instance of {@link GuestRoomType }
     * 
     */
    public GuestRoomType createGuestRoomType() {
        return new GuestRoomType();
    }

    /**
     * Create an instance of {@link GuestRoomType.Amenities }
     * 
     */
    public GuestRoomType.Amenities createGuestRoomTypeAmenities() {
        return new GuestRoomType.Amenities();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentType }
     * 
     */
    public DestActivityDescriptiveContentType createDestActivityDescriptiveContentType() {
        return new DestActivityDescriptiveContentType();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentType.Notifications }
     * 
     */
    public DestActivityDescriptiveContentType.Notifications createDestActivityDescriptiveContentTypeNotifications() {
        return new DestActivityDescriptiveContentType.Notifications();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentType.TicketCategories }
     * 
     */
    public DestActivityDescriptiveContentType.TicketCategories createDestActivityDescriptiveContentTypeTicketCategories() {
        return new DestActivityDescriptiveContentType.TicketCategories();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentType.TicketCategories.TicketCategory }
     * 
     */
    public DestActivityDescriptiveContentType.TicketCategories.TicketCategory createDestActivityDescriptiveContentTypeTicketCategoriesTicketCategory() {
        return new DestActivityDescriptiveContentType.TicketCategories.TicketCategory();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description }
     * 
     */
    public DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description createDestActivityDescriptiveContentTypeTicketCategoriesTicketCategoryDescription() {
        return new DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentType.Extras }
     * 
     */
    public DestActivityDescriptiveContentType.Extras createDestActivityDescriptiveContentTypeExtras() {
        return new DestActivityDescriptiveContentType.Extras();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentType.Extras.Extra }
     * 
     */
    public DestActivityDescriptiveContentType.Extras.Extra createDestActivityDescriptiveContentTypeExtrasExtra() {
        return new DestActivityDescriptiveContentType.Extras.Extra();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentType.Extras.Extra.Description }
     * 
     */
    public DestActivityDescriptiveContentType.Extras.Extra.Description createDestActivityDescriptiveContentTypeExtrasExtraDescription() {
        return new DestActivityDescriptiveContentType.Extras.Extra.Description();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentType.Positions }
     * 
     */
    public DestActivityDescriptiveContentType.Positions createDestActivityDescriptiveContentTypePositions() {
        return new DestActivityDescriptiveContentType.Positions();
    }

    /**
     * Create an instance of {@link CancellationFeesType }
     * 
     */
    public CancellationFeesType createCancellationFeesType() {
        return new CancellationFeesType();
    }

    /**
     * Create an instance of {@link CancellationFeeType }
     * 
     */
    public CancellationFeeType createCancellationFeeType() {
        return new CancellationFeeType();
    }

    /**
     * Create an instance of {@link ImageDescriptionType }
     * 
     */
    public ImageDescriptionType createImageDescriptionType() {
        return new ImageDescriptionType();
    }

    /**
     * Create an instance of {@link PhonesType }
     * 
     */
    public PhonesType createPhonesType() {
        return new PhonesType();
    }

    /**
     * Create an instance of {@link AddOnsType }
     * 
     */
    public AddOnsType createAddOnsType() {
        return new AddOnsType();
    }

    /**
     * Create an instance of {@link AddOnsType.AddOn }
     * 
     */
    public AddOnsType.AddOn createAddOnsTypeAddOn() {
        return new AddOnsType.AddOn();
    }

    /**
     * Create an instance of {@link AddOnsType.AddOn.Notifications }
     * 
     */
    public AddOnsType.AddOn.Notifications createAddOnsTypeAddOnNotifications() {
        return new AddOnsType.AddOn.Notifications();
    }

    /**
     * Create an instance of {@link AddOnsType.PassengerTypes }
     * 
     */
    public AddOnsType.PassengerTypes createAddOnsTypePassengerTypes() {
        return new AddOnsType.PassengerTypes();
    }

    /**
     * Create an instance of {@link GroundTransportRouteQueryType }
     * 
     */
    public GroundTransportRouteQueryType createGroundTransportRouteQueryType() {
        return new GroundTransportRouteQueryType();
    }

    /**
     * Create an instance of {@link GroundTransportQueryType }
     * 
     */
    public GroundTransportQueryType createGroundTransportQueryType() {
        return new GroundTransportQueryType();
    }

    /**
     * Create an instance of {@link JourneySegmentType }
     * 
     */
    public JourneySegmentType createJourneySegmentType() {
        return new JourneySegmentType();
    }

    /**
     * Create an instance of {@link JourneySegmentType.FareOption }
     * 
     */
    public JourneySegmentType.FareOption createJourneySegmentTypeFareOption() {
        return new JourneySegmentType.FareOption();
    }

    /**
     * Create an instance of {@link RailPriceType }
     * 
     */
    public RailPriceType createRailPriceType() {
        return new RailPriceType();
    }

    /**
     * Create an instance of {@link JourneySegmentType.FareOption.TotalFare }
     * 
     */
    public JourneySegmentType.FareOption.TotalFare createJourneySegmentTypeFareOptionTotalFare() {
        return new JourneySegmentType.FareOption.TotalFare();
    }

    /**
     * Create an instance of {@link BusSegmentType }
     * 
     */
    public BusSegmentType createBusSegmentType() {
        return new BusSegmentType();
    }

    /**
     * Create an instance of {@link JourneySegmentType.BusSegment }
     * 
     */
    public JourneySegmentType.BusSegment createJourneySegmentTypeBusSegment() {
        return new JourneySegmentType.BusSegment();
    }

    /**
     * Create an instance of {@link JourneySegmentType.TrainSegment }
     * 
     */
    public JourneySegmentType.TrainSegment createJourneySegmentTypeTrainSegment() {
        return new JourneySegmentType.TrainSegment();
    }

    /**
     * Create an instance of {@link JourneySegmentType.TrainSegment.AvailabilityDetail }
     * 
     */
    public JourneySegmentType.TrainSegment.AvailabilityDetail createJourneySegmentTypeTrainSegmentAvailabilityDetail() {
        return new JourneySegmentType.TrainSegment.AvailabilityDetail();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link SocialNetworkingPaxType }
     * 
     */
    public SocialNetworkingPaxType createSocialNetworkingPaxType() {
        return new SocialNetworkingPaxType();
    }

    /**
     * Create an instance of {@link RailAvailPrefsType }
     * 
     */
    public RailAvailPrefsType createRailAvailPrefsType() {
        return new RailAvailPrefsType();
    }

    /**
     * Create an instance of {@link FlightSegmentType }
     * 
     */
    public FlightSegmentType createFlightSegmentType() {
        return new FlightSegmentType();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType }
     * 
     */
    public BookFlightSegmentType createBookFlightSegmentType() {
        return new BookFlightSegmentType();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.BookingClassAvails }
     * 
     */
    public BookFlightSegmentType.BookingClassAvails createBookFlightSegmentTypeBookingClassAvails() {
        return new BookFlightSegmentType.BookingClassAvails();
    }

    /**
     * Create an instance of {@link LengthsOfStayType }
     * 
     */
    public LengthsOfStayType createLengthsOfStayType() {
        return new LengthsOfStayType();
    }

    /**
     * Create an instance of {@link LengthsOfStayType.LengthOfStay }
     * 
     */
    public LengthsOfStayType.LengthOfStay createLengthsOfStayTypeLengthOfStay() {
        return new LengthsOfStayType.LengthOfStay();
    }

    /**
     * Create an instance of {@link CheckedBagAllowanceType }
     * 
     */
    public CheckedBagAllowanceType createCheckedBagAllowanceType() {
        return new CheckedBagAllowanceType();
    }

    /**
     * Create an instance of {@link FormulasType }
     * 
     */
    public FormulasType createFormulasType() {
        return new FormulasType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ProfileType }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ProfileType createProfileType() {
        return new com.airchina.datacenter.spnr.sdk.entity.ProfileType();
    }

    /**
     * Create an instance of {@link Specials }
     * 
     */
    public Specials createSpecials() {
        return new Specials();
    }

    /**
     * Create an instance of {@link Specials.Special }
     * 
     */
    public Specials.Special createSpecialsSpecial() {
        return new Specials.Special();
    }

    /**
     * Create an instance of {@link Specials.Special.Discount }
     * 
     */
    public Specials.Special.Discount createSpecialsSpecialDiscount() {
        return new Specials.Special.Discount();
    }

    /**
     * Create an instance of {@link Specials.Special.Discount.Description }
     * 
     */
    public Specials.Special.Discount.Description createSpecialsSpecialDiscountDescription() {
        return new Specials.Special.Discount.Description();
    }

    /**
     * Create an instance of {@link Specials.Special.StayDates }
     * 
     */
    public Specials.Special.StayDates createSpecialsSpecialStayDates() {
        return new Specials.Special.StayDates();
    }

    /**
     * Create an instance of {@link Specials.Special.StayDates.StayDate }
     * 
     */
    public Specials.Special.StayDates.StayDate createSpecialsSpecialStayDatesStayDate() {
        return new Specials.Special.StayDates.StayDate();
    }

    /**
     * Create an instance of {@link Specials.Special.StayDates.StayDate.BookingDates }
     * 
     */
    public Specials.Special.StayDates.StayDate.BookingDates createSpecialsSpecialStayDatesStayDateBookingDates() {
        return new Specials.Special.StayDates.StayDate.BookingDates();
    }

    /**
     * Create an instance of {@link Specials.Special.StayDates.StayDate.BookingDates.BookingDate }
     * 
     */
    public Specials.Special.StayDates.StayDate.BookingDates.BookingDate createSpecialsSpecialStayDatesStayDateBookingDatesBookingDate() {
        return new Specials.Special.StayDates.StayDate.BookingDates.BookingDate();
    }

    /**
     * Create an instance of {@link Specials.Special.RoomTypes }
     * 
     */
    public Specials.Special.RoomTypes createSpecialsSpecialRoomTypes() {
        return new Specials.Special.RoomTypes();
    }

    /**
     * Create an instance of {@link CategoryCodesType }
     * 
     */
    public CategoryCodesType createCategoryCodesType() {
        return new CategoryCodesType();
    }

    /**
     * Create an instance of {@link CategoryCodesType.GuestRoomInfo }
     * 
     */
    public CategoryCodesType.GuestRoomInfo createCategoryCodesTypeGuestRoomInfo() {
        return new CategoryCodesType.GuestRoomInfo();
    }

    /**
     * Create an instance of {@link CategoryCodesType.GuestRoomInfo.RateRanges }
     * 
     */
    public CategoryCodesType.GuestRoomInfo.RateRanges createCategoryCodesTypeGuestRoomInfoRateRanges() {
        return new CategoryCodesType.GuestRoomInfo.RateRanges();
    }

    /**
     * Create an instance of {@link VehicleLocationDetailsType }
     * 
     */
    public VehicleLocationDetailsType createVehicleLocationDetailsType() {
        return new VehicleLocationDetailsType();
    }

    /**
     * Create an instance of {@link SupplierPenaltiesType }
     * 
     */
    public SupplierPenaltiesType createSupplierPenaltiesType() {
        return new SupplierPenaltiesType();
    }

    /**
     * Create an instance of {@link AccommodationSegmentRequestType }
     * 
     */
    public AccommodationSegmentRequestType createAccommodationSegmentRequestType() {
        return new AccommodationSegmentRequestType();
    }

    /**
     * Create an instance of {@link VehicleSegmentAdditionalInfoType }
     * 
     */
    public VehicleSegmentAdditionalInfoType createVehicleSegmentAdditionalInfoType() {
        return new VehicleSegmentAdditionalInfoType();
    }

    /**
     * Create an instance of {@link OntologyContactType }
     * 
     */
    public OntologyContactType createOntologyContactType() {
        return new OntologyContactType();
    }

    /**
     * Create an instance of {@link VendorMessagesType }
     * 
     */
    public VendorMessagesType createVendorMessagesType() {
        return new VendorMessagesType();
    }

    /**
     * Create an instance of {@link CustomQuestionType }
     * 
     */
    public CustomQuestionType createCustomQuestionType() {
        return new CustomQuestionType();
    }

    /**
     * Create an instance of {@link RestaurantType }
     * 
     */
    public RestaurantType createRestaurantType() {
        return new RestaurantType();
    }

    /**
     * Create an instance of {@link RestaurantType.CuisineCodes }
     * 
     */
    public RestaurantType.CuisineCodes createRestaurantTypeCuisineCodes() {
        return new RestaurantType.CuisineCodes();
    }

    /**
     * Create an instance of {@link RestaurantType.InfoCodes }
     * 
     */
    public RestaurantType.InfoCodes createRestaurantTypeInfoCodes() {
        return new RestaurantType.InfoCodes();
    }

    /**
     * Create an instance of {@link MultimediaDescriptionsType }
     * 
     */
    public MultimediaDescriptionsType createMultimediaDescriptionsType() {
        return new MultimediaDescriptionsType();
    }

    /**
     * Create an instance of {@link RatePlanRegionRestrictions }
     * 
     */
    public RatePlanRegionRestrictions createRatePlanRegionRestrictions() {
        return new RatePlanRegionRestrictions();
    }

    /**
     * Create an instance of {@link ImageItemsType }
     * 
     */
    public ImageItemsType createImageItemsType() {
        return new ImageItemsType();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType }
     * 
     */
    public AvailRequestSegmentsType createAvailRequestSegmentsType() {
        return new AvailRequestSegmentsType();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType.AvailRequestSegment }
     * 
     */
    public AvailRequestSegmentsType.AvailRequestSegment createAvailRequestSegmentsTypeAvailRequestSegment() {
        return new AvailRequestSegmentsType.AvailRequestSegment();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType }
     * 
     */
    public HotelSearchCriteriaType createHotelSearchCriteriaType() {
        return new HotelSearchCriteriaType();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType }
     * 
     */
    public ItemSearchCriterionType createItemSearchCriterionType() {
        return new ItemSearchCriterionType();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType }
     * 
     */
    public HotelSearchCriterionType createHotelSearchCriterionType() {
        return new HotelSearchCriterionType();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Polygon }
     * 
     */
    public ItemSearchCriterionType.Polygon createItemSearchCriterionTypePolygon() {
        return new ItemSearchCriterionType.Polygon();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType.RateConfigurations }
     * 
     */
    public HotelSearchCriteriaType.RateConfigurations createHotelSearchCriteriaTypeRateConfigurations() {
        return new HotelSearchCriteriaType.RateConfigurations();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType.RateConfigurations.RateConfiguration }
     * 
     */
    public HotelSearchCriteriaType.RateConfigurations.RateConfiguration createHotelSearchCriteriaTypeRateConfigurationsRateConfiguration() {
        return new HotelSearchCriteriaType.RateConfigurations.RateConfiguration();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates }
     * 
     */
    public AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates createAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidates() {
        return new AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates();
    }

    /**
     * Create an instance of {@link SailingInfoType }
     * 
     */
    public SailingInfoType createSailingInfoType() {
        return new SailingInfoType();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType }
     * 
     */
    public SailingCategoryInfoType createSailingCategoryInfoType() {
        return new SailingCategoryInfoType();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory createSailingCategoryInfoTypeSelectedCategory() {
        return new SailingCategoryInfoType.SelectedCategory();
    }

    /**
     * Create an instance of {@link CabinOptionType }
     * 
     */
    public CabinOptionType createCabinOptionType() {
        return new CabinOptionType();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory.SelectedCabin createSailingCategoryInfoTypeSelectedCategorySelectedCabin() {
        return new SailingCategoryInfoType.SelectedCategory.SelectedCabin();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes createSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttributes() {
        return new SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory.CabinAttributes }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory.CabinAttributes createSailingCategoryInfoTypeSelectedCategoryCabinAttributes() {
        return new SailingCategoryInfoType.SelectedCategory.CabinAttributes();
    }

    /**
     * Create an instance of {@link SailingBaseType }
     * 
     */
    public SailingBaseType createSailingBaseType() {
        return new SailingBaseType();
    }

    /**
     * Create an instance of {@link RailPassengerCategoryType }
     * 
     */
    public RailPassengerCategoryType createRailPassengerCategoryType() {
        return new RailPassengerCategoryType();
    }

    /**
     * Create an instance of {@link OntologyTravelerClassType }
     * 
     */
    public OntologyTravelerClassType createOntologyTravelerClassType() {
        return new OntologyTravelerClassType();
    }

    /**
     * Create an instance of {@link OntologyValueType }
     * 
     */
    public OntologyValueType createOntologyValueType() {
        return new OntologyValueType();
    }

    /**
     * Create an instance of {@link RailReservationSummaryType }
     * 
     */
    public RailReservationSummaryType createRailReservationSummaryType() {
        return new RailReservationSummaryType();
    }

    /**
     * Create an instance of {@link RailReservationSummaryType.ODInfo }
     * 
     */
    public RailReservationSummaryType.ODInfo createRailReservationSummaryTypeODInfo() {
        return new RailReservationSummaryType.ODInfo();
    }

    /**
     * Create an instance of {@link VehicleRetrieveResRSCoreType }
     * 
     */
    public VehicleRetrieveResRSCoreType createVehicleRetrieveResRSCoreType() {
        return new VehicleRetrieveResRSCoreType();
    }

    /**
     * Create an instance of {@link OJRemarkType }
     * 
     */
    public OJRemarkType createOJRemarkType() {
        return new OJRemarkType();
    }

    /**
     * Create an instance of {@link WeatherInfoType }
     * 
     */
    public WeatherInfoType createWeatherInfoType() {
        return new WeatherInfoType();
    }

    /**
     * Create an instance of {@link URLsType }
     * 
     */
    public URLsType createURLsType() {
        return new URLsType();
    }

    /**
     * Create an instance of {@link VehicleRentalDetailsType }
     * 
     */
    public VehicleRentalDetailsType createVehicleRentalDetailsType() {
        return new VehicleRentalDetailsType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.PaymentType }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.PaymentType createPaymentType() {
        return new com.airchina.datacenter.spnr.sdk.entity.PaymentType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.PaymentType.PaymentQualifiers }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.PaymentType.PaymentQualifiers createPaymentTypePaymentQualifiers() {
        return new com.airchina.datacenter.spnr.sdk.entity.PaymentType.PaymentQualifiers();
    }

    /**
     * Create an instance of {@link GroupPriorities }
     * 
     */
    public GroupPriorities createGroupPriorities() {
        return new GroupPriorities();
    }

    /**
     * Create an instance of {@link TransportationType }
     * 
     */
    public TransportationType createTransportationType() {
        return new TransportationType();
    }

    /**
     * Create an instance of {@link CodeListScheduleType }
     * 
     */
    public CodeListScheduleType createCodeListScheduleType() {
        return new CodeListScheduleType();
    }

    /**
     * Create an instance of {@link CodeListScheduleType.OperationTimes }
     * 
     */
    public CodeListScheduleType.OperationTimes createCodeListScheduleTypeOperationTimes() {
        return new CodeListScheduleType.OperationTimes();
    }

    /**
     * Create an instance of {@link StopLegType }
     * 
     */
    public StopLegType createStopLegType() {
        return new StopLegType();
    }

    /**
     * Create an instance of {@link RailFareType }
     * 
     */
    public RailFareType createRailFareType() {
        return new RailFareType();
    }

    /**
     * Create an instance of {@link RailFareType.TermAndCondition }
     * 
     */
    public RailFareType.TermAndCondition createRailFareTypeTermAndCondition() {
        return new RailFareType.TermAndCondition();
    }

    /**
     * Create an instance of {@link RailFareType.BasicFare }
     * 
     */
    public RailFareType.BasicFare createRailFareTypeBasicFare() {
        return new RailFareType.BasicFare();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType }
     * 
     */
    public PropertyValueMatchType createPropertyValueMatchType() {
        return new PropertyValueMatchType();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType.Amenities }
     * 
     */
    public PropertyValueMatchType.Amenities createPropertyValueMatchTypeAmenities() {
        return new PropertyValueMatchType.Amenities();
    }

    /**
     * Create an instance of {@link FareTaxesType }
     * 
     */
    public FareTaxesType createFareTaxesType() {
        return new FareTaxesType();
    }

    /**
     * Create an instance of {@link FareTaxesType.Tax }
     * 
     */
    public FareTaxesType.Tax createFareTaxesTypeTax() {
        return new FareTaxesType.Tax();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType }
     * 
     */
    public StatisticApplicationSetType createStatisticApplicationSetType() {
        return new StatisticApplicationSetType();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.CountCategorySummaries }
     * 
     */
    public StatisticApplicationSetType.CountCategorySummaries createStatisticApplicationSetTypeCountCategorySummaries() {
        return new StatisticApplicationSetType.CountCategorySummaries();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.RevenueCategorySummaries }
     * 
     */
    public StatisticApplicationSetType.RevenueCategorySummaries createStatisticApplicationSetTypeRevenueCategorySummaries() {
        return new StatisticApplicationSetType.RevenueCategorySummaries();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.StatisticCodes }
     * 
     */
    public StatisticApplicationSetType.StatisticCodes createStatisticApplicationSetTypeStatisticCodes() {
        return new StatisticApplicationSetType.StatisticCodes();
    }

    /**
     * Create an instance of {@link OffLocationServiceType }
     * 
     */
    public OffLocationServiceType createOffLocationServiceType() {
        return new OffLocationServiceType();
    }

    /**
     * Create an instance of {@link RateAmountMessageType }
     * 
     */
    public RateAmountMessageType createRateAmountMessageType() {
        return new RateAmountMessageType();
    }

    /**
     * Create an instance of {@link RateAmountMessageType.Rates }
     * 
     */
    public RateAmountMessageType.Rates createRateAmountMessageTypeRates() {
        return new RateAmountMessageType.Rates();
    }

    /**
     * Create an instance of {@link VehicleVendorAvailabilityType }
     * 
     */
    public VehicleVendorAvailabilityType createVehicleVendorAvailabilityType() {
        return new VehicleVendorAvailabilityType();
    }

    /**
     * Create an instance of {@link VehicleVendorAvailabilityType.VehAvails }
     * 
     */
    public VehicleVendorAvailabilityType.VehAvails createVehicleVendorAvailabilityTypeVehAvails() {
        return new VehicleVendorAvailabilityType.VehAvails();
    }

    /**
     * Create an instance of {@link VehicleVendorAvailabilityType.VehAvails.VehAvail }
     * 
     */
    public VehicleVendorAvailabilityType.VehAvails.VehAvail createVehicleVendorAvailabilityTypeVehAvailsVehAvail() {
        return new VehicleVendorAvailabilityType.VehAvails.VehAvail();
    }

    /**
     * Create an instance of {@link AssociatedBookingProductType }
     * 
     */
    public AssociatedBookingProductType createAssociatedBookingProductType() {
        return new AssociatedBookingProductType();
    }

    /**
     * Create an instance of {@link ProfilesType }
     * 
     */
    public ProfilesType createProfilesType() {
        return new ProfilesType();
    }

    /**
     * Create an instance of {@link ModificationsType }
     * 
     */
    public ModificationsType createModificationsType() {
        return new ModificationsType();
    }

    /**
     * Create an instance of {@link RailOriginDestinationSummaryType }
     * 
     */
    public RailOriginDestinationSummaryType createRailOriginDestinationSummaryType() {
        return new RailOriginDestinationSummaryType();
    }

    /**
     * Create an instance of {@link AirAncillariesBundledProductsSummaryType }
     * 
     */
    public AirAncillariesBundledProductsSummaryType createAirAncillariesBundledProductsSummaryType() {
        return new AirAncillariesBundledProductsSummaryType();
    }

    /**
     * Create an instance of {@link AirAncillariesBundledProductsSummaryType.Service }
     * 
     */
    public AirAncillariesBundledProductsSummaryType.Service createAirAncillariesBundledProductsSummaryTypeService() {
        return new AirAncillariesBundledProductsSummaryType.Service();
    }

    /**
     * Create an instance of {@link AirAncillariesBundledProductsSummaryType.Service.Prices }
     * 
     */
    public AirAncillariesBundledProductsSummaryType.Service.Prices createAirAncillariesBundledProductsSummaryTypeServicePrices() {
        return new AirAncillariesBundledProductsSummaryType.Service.Prices();
    }

    /**
     * Create an instance of {@link OntologyLodgingType }
     * 
     */
    public OntologyLodgingType createOntologyLodgingType() {
        return new OntologyLodgingType();
    }

    /**
     * Create an instance of {@link RFPResponseDetailType }
     * 
     */
    public RFPResponseDetailType createRFPResponseDetailType() {
        return new RFPResponseDetailType();
    }

    /**
     * Create an instance of {@link RoomSharesType }
     * 
     */
    public RoomSharesType createRoomSharesType() {
        return new RoomSharesType();
    }

    /**
     * Create an instance of {@link RoomSharesType.RoomShare }
     * 
     */
    public RoomSharesType.RoomShare createRoomSharesTypeRoomShare() {
        return new RoomSharesType.RoomShare();
    }

    /**
     * Create an instance of {@link RoomSharesType.RoomShare.GuestRPHs }
     * 
     */
    public RoomSharesType.RoomShare.GuestRPHs createRoomSharesTypeRoomShareGuestRPHs() {
        return new RoomSharesType.RoomShare.GuestRPHs();
    }

    /**
     * Create an instance of {@link PkgPassengerRPHs }
     * 
     */
    public PkgPassengerRPHs createPkgPassengerRPHs() {
        return new PkgPassengerRPHs();
    }

    /**
     * Create an instance of {@link QueuesType }
     * 
     */
    public QueuesType createQueuesType() {
        return new QueuesType();
    }

    /**
     * Create an instance of {@link QueuesType.Queue }
     * 
     */
    public QueuesType.Queue createQueuesTypeQueue() {
        return new QueuesType.Queue();
    }

    /**
     * Create an instance of {@link QueuesType.Queue.Summary }
     * 
     */
    public QueuesType.Queue.Summary createQueuesTypeQueueSummary() {
        return new QueuesType.Queue.Summary();
    }

    /**
     * Create an instance of {@link RestaurantsType }
     * 
     */
    public RestaurantsType createRestaurantsType() {
        return new RestaurantsType();
    }

    /**
     * Create an instance of {@link RestaurantsType.SrvcInfoCodes }
     * 
     */
    public RestaurantsType.SrvcInfoCodes createRestaurantsTypeSrvcInfoCodes() {
        return new RestaurantsType.SrvcInfoCodes();
    }

    /**
     * Create an instance of {@link RestaurantsType.Restaurant }
     * 
     */
    public RestaurantsType.Restaurant createRestaurantsTypeRestaurant() {
        return new RestaurantsType.Restaurant();
    }

    /**
     * Create an instance of {@link RestaurantsType.Restaurant.SrvcInfoCodes }
     * 
     */
    public RestaurantsType.Restaurant.SrvcInfoCodes createRestaurantsTypeRestaurantSrvcInfoCodes() {
        return new RestaurantsType.Restaurant.SrvcInfoCodes();
    }

    /**
     * Create an instance of {@link BankFavorType }
     * 
     */
    public BankFavorType createBankFavorType() {
        return new BankFavorType();
    }

    /**
     * Create an instance of {@link GuestCountType }
     * 
     */
    public GuestCountType createGuestCountType() {
        return new GuestCountType();
    }

    /**
     * Create an instance of {@link MealPlanType }
     * 
     */
    public MealPlanType createMealPlanType() {
        return new MealPlanType();
    }

    /**
     * Create an instance of {@link MealPlanType.Prices }
     * 
     */
    public MealPlanType.Prices createMealPlanTypePrices() {
        return new MealPlanType.Prices();
    }

    /**
     * Create an instance of {@link MultiModalOfferType }
     * 
     */
    public MultiModalOfferType createMultiModalOfferType() {
        return new MultiModalOfferType();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.TravelerCharacteristics }
     * 
     */
    public MultiModalOfferType.TravelerCharacteristics createMultiModalOfferTypeTravelerCharacteristics() {
        return new MultiModalOfferType.TravelerCharacteristics();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.TravelerCharacteristics.DetailInfo }
     * 
     */
    public MultiModalOfferType.TravelerCharacteristics.DetailInfo createMultiModalOfferTypeTravelerCharacteristicsDetailInfo() {
        return new MultiModalOfferType.TravelerCharacteristics.DetailInfo();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.TripCharacteristics }
     * 
     */
    public MultiModalOfferType.TripCharacteristics createMultiModalOfferTypeTripCharacteristics() {
        return new MultiModalOfferType.TripCharacteristics();
    }

    /**
     * Create an instance of {@link OntologyAnimalType }
     * 
     */
    public OntologyAnimalType createOntologyAnimalType() {
        return new OntologyAnimalType();
    }

    /**
     * Create an instance of {@link OntologyAnimalType.Detail }
     * 
     */
    public OntologyAnimalType.Detail createOntologyAnimalTypeDetail() {
        return new OntologyAnimalType.Detail();
    }

    /**
     * Create an instance of {@link OntologyBaggageType }
     * 
     */
    public OntologyBaggageType createOntologyBaggageType() {
        return new OntologyBaggageType();
    }

    /**
     * Create an instance of {@link OntologyBaggageType.Detail }
     * 
     */
    public OntologyBaggageType.Detail createOntologyBaggageTypeDetail() {
        return new OntologyBaggageType.Detail();
    }

    /**
     * Create an instance of {@link OntologyLocationType }
     * 
     */
    public OntologyLocationType createOntologyLocationType() {
        return new OntologyLocationType();
    }

    /**
     * Create an instance of {@link OntologyAddressType }
     * 
     */
    public OntologyAddressType createOntologyAddressType() {
        return new OntologyAddressType();
    }

    /**
     * Create an instance of {@link OntologyLocationType.Geocode }
     * 
     */
    public OntologyLocationType.Geocode createOntologyLocationTypeGeocode() {
        return new OntologyLocationType.Geocode();
    }

    /**
     * Create an instance of {@link OntologyTimeDurationType }
     * 
     */
    public OntologyTimeDurationType createOntologyTimeDurationType() {
        return new OntologyTimeDurationType();
    }

    /**
     * Create an instance of {@link OntologyTimeDurationType.StartAndEnd }
     * 
     */
    public OntologyTimeDurationType.StartAndEnd createOntologyTimeDurationTypeStartAndEnd() {
        return new OntologyTimeDurationType.StartAndEnd();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.RequestedOffer }
     * 
     */
    public MultiModalOfferType.RequestedOffer createMultiModalOfferTypeRequestedOffer() {
        return new MultiModalOfferType.RequestedOffer();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.RequestedOffer.TimePeriod }
     * 
     */
    public MultiModalOfferType.RequestedOffer.TimePeriod createMultiModalOfferTypeRequestedOfferTimePeriod() {
        return new MultiModalOfferType.RequestedOffer.TimePeriod();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart }
     * 
     */
    public MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart createMultiModalOfferTypeRequestedOfferTimePeriodEarliestStart() {
        return new MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod }
     * 
     */
    public MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod createMultiModalOfferTypeRequestedOfferTimePeriodEarliestStartCalculationMethod() {
        return new MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.Ontology }
     * 
     */
    public MultiModalOfferType.Ontology createMultiModalOfferTypeOntology() {
        return new MultiModalOfferType.Ontology();
    }

    /**
     * Create an instance of {@link OntologyCompanyType }
     * 
     */
    public OntologyCompanyType createOntologyCompanyType() {
        return new OntologyCompanyType();
    }

    /**
     * Create an instance of {@link SupplierBookingReferenceIDType }
     * 
     */
    public SupplierBookingReferenceIDType createSupplierBookingReferenceIDType() {
        return new SupplierBookingReferenceIDType();
    }

    /**
     * Create an instance of {@link HotelReservationType }
     * 
     */
    public HotelReservationType createHotelReservationType() {
        return new HotelReservationType();
    }

    /**
     * Create an instance of {@link HotelResModifyRequestType }
     * 
     */
    public HotelResModifyRequestType createHotelResModifyRequestType() {
        return new HotelResModifyRequestType();
    }

    /**
     * Create an instance of {@link HotelResModifyRequestType.SupplierFees }
     * 
     */
    public HotelResModifyRequestType.SupplierFees createHotelResModifyRequestTypeSupplierFees() {
        return new HotelResModifyRequestType.SupplierFees();
    }

    /**
     * Create an instance of {@link AirAncillaryProductPriceType }
     * 
     */
    public AirAncillaryProductPriceType createAirAncillaryProductPriceType() {
        return new AirAncillaryProductPriceType();
    }

    /**
     * Create an instance of {@link ShipInfoType }
     * 
     */
    public ShipInfoType createShipInfoType() {
        return new ShipInfoType();
    }

    /**
     * Create an instance of {@link TicketRemarkType }
     * 
     */
    public TicketRemarkType createTicketRemarkType() {
        return new TicketRemarkType();
    }

    /**
     * Create an instance of {@link UserInputSrvcType }
     * 
     */
    public UserInputSrvcType createUserInputSrvcType() {
        return new UserInputSrvcType();
    }

    /**
     * Create an instance of {@link UserInputSrvcType.UserChoices }
     * 
     */
    public UserInputSrvcType.UserChoices createUserInputSrvcTypeUserChoices() {
        return new UserInputSrvcType.UserChoices();
    }

    /**
     * Create an instance of {@link UserInputSrvcType.UserChoices.FlightOptions }
     * 
     */
    public UserInputSrvcType.UserChoices.FlightOptions createUserInputSrvcTypeUserChoicesFlightOptions() {
        return new UserInputSrvcType.UserChoices.FlightOptions();
    }

    /**
     * Create an instance of {@link UserInputSrvcType.UserChoices.FlightOptions.Flight }
     * 
     */
    public UserInputSrvcType.UserChoices.FlightOptions.Flight createUserInputSrvcTypeUserChoicesFlightOptionsFlight() {
        return new UserInputSrvcType.UserChoices.FlightOptions.Flight();
    }

    /**
     * Create an instance of {@link FerryProductType }
     * 
     */
    public FerryProductType createFerryProductType() {
        return new FerryProductType();
    }

    /**
     * Create an instance of {@link DestActivityResResponseItemType }
     * 
     */
    public DestActivityResResponseItemType createDestActivityResResponseItemType() {
        return new DestActivityResResponseItemType();
    }

    /**
     * Create an instance of {@link MeetingRoomCapacityType }
     * 
     */
    public MeetingRoomCapacityType createMeetingRoomCapacityType() {
        return new MeetingRoomCapacityType();
    }

    /**
     * Create an instance of {@link OntologyActivityType }
     * 
     */
    public OntologyActivityType createOntologyActivityType() {
        return new OntologyActivityType();
    }

    /**
     * Create an instance of {@link FacilityChoicesType }
     * 
     */
    public FacilityChoicesType createFacilityChoicesType() {
        return new FacilityChoicesType();
    }

    /**
     * Create an instance of {@link SearchQualifierType }
     * 
     */
    public SearchQualifierType createSearchQualifierType() {
        return new SearchQualifierType();
    }

    /**
     * Create an instance of {@link ExtrasCoreType }
     * 
     */
    public ExtrasCoreType createExtrasCoreType() {
        return new ExtrasCoreType();
    }

    /**
     * Create an instance of {@link ExtrasInfoType }
     * 
     */
    public ExtrasInfoType createExtrasInfoType() {
        return new ExtrasInfoType();
    }

    /**
     * Create an instance of {@link TravelCostType }
     * 
     */
    public TravelCostType createTravelCostType() {
        return new TravelCostType();
    }

    /**
     * Create an instance of {@link VenueType }
     * 
     */
    public VenueType createVenueType() {
        return new VenueType();
    }

    /**
     * Create an instance of {@link VenueType.Positions }
     * 
     */
    public VenueType.Positions createVenueTypePositions() {
        return new VenueType.Positions();
    }

    /**
     * Create an instance of {@link ServiceRPHsType }
     * 
     */
    public ServiceRPHsType createServiceRPHsType() {
        return new ServiceRPHsType();
    }

    /**
     * Create an instance of {@link DestActivityRetrieveInfoType }
     * 
     */
    public DestActivityRetrieveInfoType createDestActivityRetrieveInfoType() {
        return new DestActivityRetrieveInfoType();
    }

    /**
     * Create an instance of {@link DestActivityRetrieveInfoType.DestActivityItems }
     * 
     */
    public DestActivityRetrieveInfoType.DestActivityItems createDestActivityRetrieveInfoTypeDestActivityItems() {
        return new DestActivityRetrieveInfoType.DestActivityItems();
    }

    /**
     * Create an instance of {@link DestActivityRetrieveInfoType.DestActivityItems.Item }
     * 
     */
    public DestActivityRetrieveInfoType.DestActivityItems.Item createDestActivityRetrieveInfoTypeDestActivityItemsItem() {
        return new DestActivityRetrieveInfoType.DestActivityItems.Item();
    }

    /**
     * Create an instance of {@link PaymentsType }
     * 
     */
    public PaymentsType createPaymentsType() {
        return new PaymentsType();
    }

    /**
     * Create an instance of {@link OperationSchedulesPlusChargeType }
     * 
     */
    public OperationSchedulesPlusChargeType createOperationSchedulesPlusChargeType() {
        return new OperationSchedulesPlusChargeType();
    }

    /**
     * Create an instance of {@link OperationScheduleType }
     * 
     */
    public OperationScheduleType createOperationScheduleType() {
        return new OperationScheduleType();
    }

    /**
     * Create an instance of {@link OperationScheduleType.OperationTimes }
     * 
     */
    public OperationScheduleType.OperationTimes createOperationScheduleTypeOperationTimes() {
        return new OperationScheduleType.OperationTimes();
    }

    /**
     * Create an instance of {@link PackageType }
     * 
     */
    public PackageType createPackageType() {
        return new PackageType();
    }

    /**
     * Create an instance of {@link SailingSearchQualifierType }
     * 
     */
    public SailingSearchQualifierType createSailingSearchQualifierType() {
        return new SailingSearchQualifierType();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType }
     * 
     */
    public VehicleLocationLiabilitiesType createVehicleLocationLiabilitiesType() {
        return new VehicleLocationLiabilitiesType();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType.Coverages }
     * 
     */
    public VehicleLocationLiabilitiesType.Coverages createVehicleLocationLiabilitiesTypeCoverages() {
        return new VehicleLocationLiabilitiesType.Coverages();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType.Coverages.Coverage }
     * 
     */
    public VehicleLocationLiabilitiesType.Coverages.Coverage createVehicleLocationLiabilitiesTypeCoveragesCoverage() {
        return new VehicleLocationLiabilitiesType.Coverages.Coverage();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees }
     * 
     */
    public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees createVehicleLocationLiabilitiesTypeCoveragesCoverageCoverageFees() {
        return new VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee }
     * 
     */
    public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee createVehicleLocationLiabilitiesTypeCoveragesCoverageCoverageFeesCoverageFee() {
        return new VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles }
     * 
     */
    public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles createVehicleLocationLiabilitiesTypeCoveragesCoverageCoverageFeesCoverageFeeVehicles() {
        return new VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles();
    }

    /**
     * Create an instance of {@link VehicleCoreType }
     * 
     */
    public VehicleCoreType createVehicleCoreType() {
        return new VehicleCoreType();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link AssociatedFFsType }
     * 
     */
    public AssociatedFFsType createAssociatedFFsType() {
        return new AssociatedFFsType();
    }

    /**
     * Create an instance of {@link AirportWeatherType }
     * 
     */
    public AirportWeatherType createAirportWeatherType() {
        return new AirportWeatherType();
    }

    /**
     * Create an instance of {@link RateQualifierType }
     * 
     */
    public RateQualifierType createRateQualifierType() {
        return new RateQualifierType();
    }

    /**
     * Create an instance of {@link FlightRestrictionType }
     * 
     */
    public FlightRestrictionType createFlightRestrictionType() {
        return new FlightRestrictionType();
    }

    /**
     * Create an instance of {@link FlightRestrictionType.OriginDestinationOption }
     * 
     */
    public FlightRestrictionType.OriginDestinationOption createFlightRestrictionTypeOriginDestinationOption() {
        return new FlightRestrictionType.OriginDestinationOption();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Address }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Address createAddress() {
        return new com.airchina.datacenter.spnr.sdk.entity.Address();
    }

    /**
     * Create an instance of {@link AirItineraryType }
     * 
     */
    public AirItineraryType createAirItineraryType() {
        return new AirItineraryType();
    }

    /**
     * Create an instance of {@link AirItineraryType.PlatingCarriers }
     * 
     */
    public AirItineraryType.PlatingCarriers createAirItineraryTypePlatingCarriers() {
        return new AirItineraryType.PlatingCarriers();
    }

    /**
     * Create an instance of {@link AirItineraryType.OriginDestinationOptions }
     * 
     */
    public AirItineraryType.OriginDestinationOptions createAirItineraryTypeOriginDestinationOptions() {
        return new AirItineraryType.OriginDestinationOptions();
    }

    /**
     * Create an instance of {@link OriginDestinationOptionType }
     * 
     */
    public OriginDestinationOptionType createOriginDestinationOptionType() {
        return new OriginDestinationOptionType();
    }

    /**
     * Create an instance of {@link AirItineraryType.OriginDestinationOptions.OriginDestinationOption }
     * 
     */
    public AirItineraryType.OriginDestinationOptions.OriginDestinationOption createAirItineraryTypeOriginDestinationOptionsOriginDestinationOption() {
        return new AirItineraryType.OriginDestinationOptions.OriginDestinationOption();
    }

    /**
     * Create an instance of {@link BaggageSpecificationType }
     * 
     */
    public BaggageSpecificationType createBaggageSpecificationType() {
        return new BaggageSpecificationType();
    }

    /**
     * Create an instance of {@link CustomerCountsType }
     * 
     */
    public CustomerCountsType createCustomerCountsType() {
        return new CustomerCountsType();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType }
     * 
     */
    public VehicleLocationAdditionalFeesType createVehicleLocationAdditionalFeesType() {
        return new VehicleLocationAdditionalFeesType();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.MiscellaneousCharges }
     * 
     */
    public VehicleLocationAdditionalFeesType.MiscellaneousCharges createVehicleLocationAdditionalFeesTypeMiscellaneousCharges() {
        return new VehicleLocationAdditionalFeesType.MiscellaneousCharges();
    }

    /**
     * Create an instance of {@link VehicleChargeType }
     * 
     */
    public VehicleChargeType createVehicleChargeType() {
        return new VehicleChargeType();
    }

    /**
     * Create an instance of {@link VehicleChargeType.TaxAmounts }
     * 
     */
    public VehicleChargeType.TaxAmounts createVehicleChargeTypeTaxAmounts() {
        return new VehicleChargeType.TaxAmounts();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.Surcharges }
     * 
     */
    public VehicleLocationAdditionalFeesType.Surcharges createVehicleLocationAdditionalFeesTypeSurcharges() {
        return new VehicleLocationAdditionalFeesType.Surcharges();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.Fees }
     * 
     */
    public VehicleLocationAdditionalFeesType.Fees createVehicleLocationAdditionalFeesTypeFees() {
        return new VehicleLocationAdditionalFeesType.Fees();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.Taxes }
     * 
     */
    public VehicleLocationAdditionalFeesType.Taxes createVehicleLocationAdditionalFeesTypeTaxes() {
        return new VehicleLocationAdditionalFeesType.Taxes();
    }

    /**
     * Create an instance of {@link RefundQualifierType }
     * 
     */
    public RefundQualifierType createRefundQualifierType() {
        return new RefundQualifierType();
    }

    /**
     * Create an instance of {@link CoveredTravelerType }
     * 
     */
    public CoveredTravelerType createCoveredTravelerType() {
        return new CoveredTravelerType();
    }

    /**
     * Create an instance of {@link CoveredTravelerType.Beneficiary }
     * 
     */
    public CoveredTravelerType.Beneficiary createCoveredTravelerTypeBeneficiary() {
        return new CoveredTravelerType.Beneficiary();
    }

    /**
     * Create an instance of {@link QRDataType }
     * 
     */
    public QRDataType createQRDataType() {
        return new QRDataType();
    }

    /**
     * Create an instance of {@link SPNREmailType }
     * 
     */
    public SPNREmailType createSPNREmailType() {
        return new SPNREmailType();
    }

    /**
     * Create an instance of {@link SPNREmailType.Attachments }
     * 
     */
    public SPNREmailType.Attachments createSPNREmailTypeAttachments() {
        return new SPNREmailType.Attachments();
    }

    /**
     * Create an instance of {@link HotelReservationIDsType }
     * 
     */
    public HotelReservationIDsType createHotelReservationIDsType() {
        return new HotelReservationIDsType();
    }

    /**
     * Create an instance of {@link LoyaltyPaymentType }
     * 
     */
    public LoyaltyPaymentType createLoyaltyPaymentType() {
        return new LoyaltyPaymentType();
    }

    /**
     * Create an instance of {@link RoutingHopType }
     * 
     */
    public RoutingHopType createRoutingHopType() {
        return new RoutingHopType();
    }

    /**
     * Create an instance of {@link MediaLinkType }
     * 
     */
    public MediaLinkType createMediaLinkType() {
        return new MediaLinkType();
    }

    /**
     * Create an instance of {@link CruiseProfileType }
     * 
     */
    public CruiseProfileType createCruiseProfileType() {
        return new CruiseProfileType();
    }

    /**
     * Create an instance of {@link CombinationAllowedType }
     * 
     */
    public CombinationAllowedType createCombinationAllowedType() {
        return new CombinationAllowedType();
    }

    /**
     * Create an instance of {@link MembershipPriceType }
     * 
     */
    public MembershipPriceType createMembershipPriceType() {
        return new MembershipPriceType();
    }

    /**
     * Create an instance of {@link RailPersonInfoType }
     * 
     */
    public RailPersonInfoType createRailPersonInfoType() {
        return new RailPersonInfoType();
    }

    /**
     * Create an instance of {@link CabinAvailType }
     * 
     */
    public CabinAvailType createCabinAvailType() {
        return new CabinAvailType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType }
     * 
     */
    public VehicleReservationRQCoreType createVehicleReservationRQCoreType() {
        return new VehicleReservationRQCoreType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.SpecialEquipPrefs }
     * 
     */
    public VehicleReservationRQCoreType.SpecialEquipPrefs createVehicleReservationRQCoreTypeSpecialEquipPrefs() {
        return new VehicleReservationRQCoreType.SpecialEquipPrefs();
    }

    /**
     * Create an instance of {@link StatisticType }
     * 
     */
    public StatisticType createStatisticType() {
        return new StatisticType();
    }

    /**
     * Create an instance of {@link BundleProductsType }
     * 
     */
    public BundleProductsType createBundleProductsType() {
        return new BundleProductsType();
    }

    /**
     * Create an instance of {@link SPNRPriceAdjustmentsType }
     * 
     */
    public SPNRPriceAdjustmentsType createSPNRPriceAdjustmentsType() {
        return new SPNRPriceAdjustmentsType();
    }

    /**
     * Create an instance of {@link CertificateType }
     * 
     */
    public CertificateType createCertificateType() {
        return new CertificateType();
    }

    /**
     * Create an instance of {@link BookingToolPartyType }
     * 
     */
    public BookingToolPartyType createBookingToolPartyType() {
        return new BookingToolPartyType();
    }

    /**
     * Create an instance of {@link RailReservationType }
     * 
     */
    public RailReservationType createRailReservationType() {
        return new RailReservationType();
    }

    /**
     * Create an instance of {@link RailReservationType.Itinerary }
     * 
     */
    public RailReservationType.Itinerary createRailReservationTypeItinerary() {
        return new RailReservationType.Itinerary();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType }
     * 
     */
    public AvailStatusMessageType createAvailStatusMessageType() {
        return new AvailStatusMessageType();
    }

    /**
     * Create an instance of {@link PackageLoyaltyPricingType }
     * 
     */
    public PackageLoyaltyPricingType createPackageLoyaltyPricingType() {
        return new PackageLoyaltyPricingType();
    }

    /**
     * Create an instance of {@link SearchTravelerType }
     * 
     */
    public SearchTravelerType createSearchTravelerType() {
        return new SearchTravelerType();
    }

    /**
     * Create an instance of {@link AirReservationType }
     * 
     */
    public AirReservationType createAirReservationType() {
        return new AirReservationType();
    }

    /**
     * Create an instance of {@link AirReservationType.SupplierNotes }
     * 
     */
    public AirReservationType.SupplierNotes createAirReservationTypeSupplierNotes() {
        return new AirReservationType.SupplierNotes();
    }

    /**
     * Create an instance of {@link AirReservationType.Queues }
     * 
     */
    public AirReservationType.Queues createAirReservationTypeQueues() {
        return new AirReservationType.Queues();
    }

    /**
     * Create an instance of {@link RelativePositionsInfoType }
     * 
     */
    public RelativePositionsInfoType createRelativePositionsInfoType() {
        return new RelativePositionsInfoType();
    }

    /**
     * Create an instance of {@link HotelInfoType }
     * 
     */
    public HotelInfoType createHotelInfoType() {
        return new HotelInfoType();
    }

    /**
     * Create an instance of {@link HotelInfoType.Languages }
     * 
     */
    public HotelInfoType.Languages createHotelInfoTypeLanguages() {
        return new HotelInfoType.Languages();
    }

    /**
     * Create an instance of {@link HotelInfoType.OwnershipManagementInfos }
     * 
     */
    public HotelInfoType.OwnershipManagementInfos createHotelInfoTypeOwnershipManagementInfos() {
        return new HotelInfoType.OwnershipManagementInfos();
    }

    /**
     * Create an instance of {@link HotelInfoType.Services }
     * 
     */
    public HotelInfoType.Services createHotelInfoTypeServices() {
        return new HotelInfoType.Services();
    }

    /**
     * Create an instance of {@link HotelInfoType.HotelInfoCodes }
     * 
     */
    public HotelInfoType.HotelInfoCodes createHotelInfoTypeHotelInfoCodes() {
        return new HotelInfoType.HotelInfoCodes();
    }

    /**
     * Create an instance of {@link HotelInfoType.Descriptions }
     * 
     */
    public HotelInfoType.Descriptions createHotelInfoTypeDescriptions() {
        return new HotelInfoType.Descriptions();
    }

    /**
     * Create an instance of {@link HotelInfoType.Descriptions.Renovation }
     * 
     */
    public HotelInfoType.Descriptions.Renovation createHotelInfoTypeDescriptionsRenovation() {
        return new HotelInfoType.Descriptions.Renovation();
    }

    /**
     * Create an instance of {@link HotelInfoType.RelativePositions }
     * 
     */
    public HotelInfoType.RelativePositions createHotelInfoTypeRelativePositions() {
        return new HotelInfoType.RelativePositions();
    }

    /**
     * Create an instance of {@link VideoItemsType }
     * 
     */
    public VideoItemsType createVideoItemsType() {
        return new VideoItemsType();
    }

    /**
     * Create an instance of {@link MembershipType }
     * 
     */
    public MembershipType createMembershipType() {
        return new MembershipType();
    }

    /**
     * Create an instance of {@link CustomerPrimaryAdditionalType }
     * 
     */
    public CustomerPrimaryAdditionalType createCustomerPrimaryAdditionalType() {
        return new CustomerPrimaryAdditionalType();
    }

    /**
     * Create an instance of {@link PromotionType }
     * 
     */
    public PromotionType createPromotionType() {
        return new PromotionType();
    }

    /**
     * Create an instance of {@link MainFromPrice }
     * 
     */
    public MainFromPrice createMainFromPrice() {
        return new MainFromPrice();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType }
     * 
     */
    public CruiseGuestDetailType createCruiseGuestDetailType() {
        return new CruiseGuestDetailType();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.AirAccommodations }
     * 
     */
    public CruiseGuestDetailType.AirAccommodations createCruiseGuestDetailTypeAirAccommodations() {
        return new CruiseGuestDetailType.AirAccommodations();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedPackages }
     * 
     */
    public CruiseGuestDetailType.SelectedPackages createCruiseGuestDetailTypeSelectedPackages() {
        return new CruiseGuestDetailType.SelectedPackages();
    }

    /**
     * Create an instance of {@link CruisePackageType }
     * 
     */
    public CruisePackageType createCruisePackageType() {
        return new CruisePackageType();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType }
     * 
     */
    public PTCFareBreakdownType createPTCFareBreakdownType() {
        return new PTCFareBreakdownType();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.Endorsements }
     * 
     */
    public PTCFareBreakdownType.Endorsements createPTCFareBreakdownTypeEndorsements() {
        return new PTCFareBreakdownType.Endorsements();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.TicketDesignators }
     * 
     */
    public PTCFareBreakdownType.TicketDesignators createPTCFareBreakdownTypeTicketDesignators() {
        return new PTCFareBreakdownType.TicketDesignators();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareBasisCodes }
     * 
     */
    public PTCFareBreakdownType.FareBasisCodes createPTCFareBreakdownTypeFareBasisCodes() {
        return new PTCFareBreakdownType.FareBasisCodes();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PricingSeqs }
     * 
     */
    public PTCFareBreakdownType.PricingSeqs createPTCFareBreakdownTypePricingSeqs() {
        return new PTCFareBreakdownType.PricingSeqs();
    }

    /**
     * Create an instance of {@link ServiceItemCoreType }
     * 
     */
    public ServiceItemCoreType createServiceItemCoreType() {
        return new ServiceItemCoreType();
    }

    /**
     * Create an instance of {@link ServiceItemCoreType.BookingInstructions }
     * 
     */
    public ServiceItemCoreType.BookingInstructions createServiceItemCoreTypeBookingInstructions() {
        return new ServiceItemCoreType.BookingInstructions();
    }

    /**
     * Create an instance of {@link RailChargesType }
     * 
     */
    public RailChargesType createRailChargesType() {
        return new RailChargesType();
    }

    /**
     * Create an instance of {@link UniqueIDsType }
     * 
     */
    public UniqueIDsType createUniqueIDsType() {
        return new UniqueIDsType();
    }

    /**
     * Create an instance of {@link MediaImageType }
     * 
     */
    public MediaImageType createMediaImageType() {
        return new MediaImageType();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType }
     * 
     */
    public CruiseGuestInfoType createCruiseGuestInfoType() {
        return new CruiseGuestInfoType();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType.PaymentOptions }
     * 
     */
    public CruiseGuestInfoType.PaymentOptions createCruiseGuestInfoTypePaymentOptions() {
        return new CruiseGuestInfoType.PaymentOptions();
    }

    /**
     * Create an instance of {@link PaymentDetailType }
     * 
     */
    public PaymentDetailType createPaymentDetailType() {
        return new PaymentDetailType();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType.LinkedBookings }
     * 
     */
    public CruiseGuestInfoType.LinkedBookings createCruiseGuestInfoTypeLinkedBookings() {
        return new CruiseGuestInfoType.LinkedBookings();
    }

    /**
     * Create an instance of {@link BatchRefundParamsInfoType }
     * 
     */
    public BatchRefundParamsInfoType createBatchRefundParamsInfoType() {
        return new BatchRefundParamsInfoType();
    }

    /**
     * Create an instance of {@link HotelReservationsType }
     * 
     */
    public HotelReservationsType createHotelReservationsType() {
        return new HotelReservationsType();
    }

    /**
     * Create an instance of {@link ReservationItemsType }
     * 
     */
    public ReservationItemsType createReservationItemsType() {
        return new ReservationItemsType();
    }

    /**
     * Create an instance of {@link ItinPricingType }
     * 
     */
    public ItinPricingType createItinPricingType() {
        return new ItinPricingType();
    }

    /**
     * Create an instance of {@link TravelSegmentType }
     * 
     */
    public TravelSegmentType createTravelSegmentType() {
        return new TravelSegmentType();
    }

    /**
     * Create an instance of {@link TravelSegmentType.GroundTransport }
     * 
     */
    public TravelSegmentType.GroundTransport createTravelSegmentTypeGroundTransport() {
        return new TravelSegmentType.GroundTransport();
    }

    /**
     * Create an instance of {@link TravelSegmentType.Air }
     * 
     */
    public TravelSegmentType.Air createTravelSegmentTypeAir() {
        return new TravelSegmentType.Air();
    }

    /**
     * Create an instance of {@link TravelSegmentType.Air.Reservation }
     * 
     */
    public TravelSegmentType.Air.Reservation createTravelSegmentTypeAirReservation() {
        return new TravelSegmentType.Air.Reservation();
    }

    /**
     * Create an instance of {@link TravelSegmentType.Air.Reservation.Seats }
     * 
     */
    public TravelSegmentType.Air.Reservation.Seats createTravelSegmentTypeAirReservationSeats() {
        return new TravelSegmentType.Air.Reservation.Seats();
    }

    /**
     * Create an instance of {@link VehAvailType }
     * 
     */
    public VehAvailType createVehAvailType() {
        return new VehAvailType();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType }
     * 
     */
    public VehicleAvailCoreType createVehicleAvailCoreType() {
        return new VehicleAvailCoreType();
    }

    /**
     * Create an instance of {@link RoomStayLiteType }
     * 
     */
    public RoomStayLiteType createRoomStayLiteType() {
        return new RoomStayLiteType();
    }

    /**
     * Create an instance of {@link WrittenConfInstType }
     * 
     */
    public WrittenConfInstType createWrittenConfInstType() {
        return new WrittenConfInstType();
    }

    /**
     * Create an instance of {@link TicketRemarkVerificationType }
     * 
     */
    public TicketRemarkVerificationType createTicketRemarkVerificationType() {
        return new TicketRemarkVerificationType();
    }

    /**
     * Create an instance of {@link BaggagePieceType }
     * 
     */
    public BaggagePieceType createBaggagePieceType() {
        return new BaggagePieceType();
    }

    /**
     * Create an instance of {@link CategoryOptionType }
     * 
     */
    public CategoryOptionType createCategoryOptionType() {
        return new CategoryOptionType();
    }

    /**
     * Create an instance of {@link IndCoverageReqsType }
     * 
     */
    public IndCoverageReqsType createIndCoverageReqsType() {
        return new IndCoverageReqsType();
    }

    /**
     * Create an instance of {@link IndCoverageReqsType.PreexistingConditions }
     * 
     */
    public IndCoverageReqsType.PreexistingConditions createIndCoverageReqsTypePreexistingConditions() {
        return new IndCoverageReqsType.PreexistingConditions();
    }

    /**
     * Create an instance of {@link IndCoverageReqsType.CoveredLuggage }
     * 
     */
    public IndCoverageReqsType.CoveredLuggage createIndCoverageReqsTypeCoveredLuggage() {
        return new IndCoverageReqsType.CoveredLuggage();
    }

    /**
     * Create an instance of {@link IndCoverageReqsType.CoveredLuggage.LuggageItem }
     * 
     */
    public IndCoverageReqsType.CoveredLuggage.LuggageItem createIndCoverageReqsTypeCoveredLuggageLuggageItem() {
        return new IndCoverageReqsType.CoveredLuggage.LuggageItem();
    }

    /**
     * Create an instance of {@link VehicleProductDetailsType }
     * 
     */
    public VehicleProductDetailsType createVehicleProductDetailsType() {
        return new VehicleProductDetailsType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoType }
     * 
     */
    public VehicleReservationRQAdditionalInfoType createVehicleReservationRQAdditionalInfoType() {
        return new VehicleReservationRQAdditionalInfoType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoType.CoveragePrefs }
     * 
     */
    public VehicleReservationRQAdditionalInfoType.CoveragePrefs createVehicleReservationRQAdditionalInfoTypeCoveragePrefs() {
        return new VehicleReservationRQAdditionalInfoType.CoveragePrefs();
    }

    /**
     * Create an instance of {@link HotelResModifyType }
     * 
     */
    public HotelResModifyType createHotelResModifyType() {
        return new HotelResModifyType();
    }

    /**
     * Create an instance of {@link ImageType }
     * 
     */
    public ImageType createImageType() {
        return new ImageType();
    }

    /**
     * Create an instance of {@link FFPAccumulationType }
     * 
     */
    public FFPAccumulationType createFFPAccumulationType() {
        return new FFPAccumulationType();
    }

    /**
     * Create an instance of {@link UserInputOtherType }
     * 
     */
    public UserInputOtherType createUserInputOtherType() {
        return new UserInputOtherType();
    }

    /**
     * Create an instance of {@link UserInputOtherType.UserChoices }
     * 
     */
    public UserInputOtherType.UserChoices createUserInputOtherTypeUserChoices() {
        return new UserInputOtherType.UserChoices();
    }

    /**
     * Create an instance of {@link UserInputOtherType.UserChoices.FlightOptions }
     * 
     */
    public UserInputOtherType.UserChoices.FlightOptions createUserInputOtherTypeUserChoicesFlightOptions() {
        return new UserInputOtherType.UserChoices.FlightOptions();
    }

    /**
     * Create an instance of {@link UserInputOtherType.UserChoices.FlightOptions.Flight }
     * 
     */
    public UserInputOtherType.UserChoices.FlightOptions.Flight createUserInputOtherTypeUserChoicesFlightOptionsFlight() {
        return new UserInputOtherType.UserChoices.FlightOptions.Flight();
    }

    /**
     * Create an instance of {@link SailingType }
     * 
     */
    public SailingType createSailingType() {
        return new SailingType();
    }

    /**
     * Create an instance of {@link InsCoverageType }
     * 
     */
    public InsCoverageType createInsCoverageType() {
        return new InsCoverageType();
    }

    /**
     * Create an instance of {@link VerificationType }
     * 
     */
    public VerificationType createVerificationType() {
        return new VerificationType();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType }
     * 
     */
    public CruiseBookingInfoType createCruiseBookingInfoType() {
        return new CruiseBookingInfoType();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.GuestPrices }
     * 
     */
    public CruiseBookingInfoType.GuestPrices createCruiseBookingInfoTypeGuestPrices() {
        return new CruiseBookingInfoType.GuestPrices();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.GuestPrices.GuestPrice }
     * 
     */
    public CruiseBookingInfoType.GuestPrices.GuestPrice createCruiseBookingInfoTypeGuestPricesGuestPrice() {
        return new CruiseBookingInfoType.GuestPrices.GuestPrice();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos }
     * 
     */
    public CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos createCruiseBookingInfoTypeGuestPricesGuestPricePriceInfos() {
        return new CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.PaymentSchedule }
     * 
     */
    public CruiseBookingInfoType.PaymentSchedule createCruiseBookingInfoTypePaymentSchedule() {
        return new CruiseBookingInfoType.PaymentSchedule();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.BookingPrices }
     * 
     */
    public CruiseBookingInfoType.BookingPrices createCruiseBookingInfoTypeBookingPrices() {
        return new CruiseBookingInfoType.BookingPrices();
    }

    /**
     * Create an instance of {@link ModifyRuleType }
     * 
     */
    public ModifyRuleType createModifyRuleType() {
        return new ModifyRuleType();
    }

    /**
     * Create an instance of {@link OriginDestinationInformationType }
     * 
     */
    public OriginDestinationInformationType createOriginDestinationInformationType() {
        return new OriginDestinationInformationType();
    }

    /**
     * Create an instance of {@link FerryPaymentDetailType }
     * 
     */
    public FerryPaymentDetailType createFerryPaymentDetailType() {
        return new FerryPaymentDetailType();
    }

    /**
     * Create an instance of {@link RailConnectionType }
     * 
     */
    public RailConnectionType createRailConnectionType() {
        return new RailConnectionType();
    }

    /**
     * Create an instance of {@link RatePlanReleases }
     * 
     */
    public RatePlanReleases createRatePlanReleases() {
        return new RatePlanReleases();
    }

    /**
     * Create an instance of {@link RatePlanReleases.Release }
     * 
     */
    public RatePlanReleases.Release createRatePlanReleasesRelease() {
        return new RatePlanReleases.Release();
    }

    /**
     * Create an instance of {@link NDCImageType }
     * 
     */
    public NDCImageType createNDCImageType() {
        return new NDCImageType();
    }

    /**
     * Create an instance of {@link CancellationRefundType }
     * 
     */
    public CancellationRefundType createCancellationRefundType() {
        return new CancellationRefundType();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link AirAncillariesServiceType }
     * 
     */
    public AirAncillariesServiceType createAirAncillariesServiceType() {
        return new AirAncillariesServiceType();
    }

    /**
     * Create an instance of {@link AirAncillariesServiceType.Baggage }
     * 
     */
    public AirAncillariesServiceType.Baggage createAirAncillariesServiceTypeBaggage() {
        return new AirAncillariesServiceType.Baggage();
    }

    /**
     * Create an instance of {@link AirAncillariesServiceType.BookingInstructions }
     * 
     */
    public AirAncillariesServiceType.BookingInstructions createAirAncillariesServiceTypeBookingInstructions() {
        return new AirAncillariesServiceType.BookingInstructions();
    }

    /**
     * Create an instance of {@link AreasType }
     * 
     */
    public AreasType createAreasType() {
        return new AreasType();
    }

    /**
     * Create an instance of {@link TimeSlots }
     * 
     */
    public TimeSlots createTimeSlots() {
        return new TimeSlots();
    }

    /**
     * Create an instance of {@link VicinityType }
     * 
     */
    public VicinityType createVicinityType() {
        return new VicinityType();
    }

    /**
     * Create an instance of {@link AirAncillaryLoungeRoomType }
     * 
     */
    public AirAncillaryLoungeRoomType createAirAncillaryLoungeRoomType() {
        return new AirAncillaryLoungeRoomType();
    }

    /**
     * Create an instance of {@link AirAncillaryLoungeRoomType.OpenTimes }
     * 
     */
    public AirAncillaryLoungeRoomType.OpenTimes createAirAncillaryLoungeRoomTypeOpenTimes() {
        return new AirAncillaryLoungeRoomType.OpenTimes();
    }

    /**
     * Create an instance of {@link VerificationODOType }
     * 
     */
    public VerificationODOType createVerificationODOType() {
        return new VerificationODOType();
    }

    /**
     * Create an instance of {@link PostResType }
     * 
     */
    public PostResType createPostResType() {
        return new PostResType();
    }

    /**
     * Create an instance of {@link PostResType.PostResInfo }
     * 
     */
    public PostResType.PostResInfo createPostResTypePostResInfo() {
        return new PostResType.PostResInfo();
    }

    /**
     * Create an instance of {@link FerryReservationRequest }
     * 
     */
    public FerryReservationRequest createFerryReservationRequest() {
        return new FerryReservationRequest();
    }

    /**
     * Create an instance of {@link VehicleDetailsType }
     * 
     */
    public VehicleDetailsType createVehicleDetailsType() {
        return new VehicleDetailsType();
    }

    /**
     * Create an instance of {@link VehicleDetailsType.Trailer }
     * 
     */
    public VehicleDetailsType.Trailer createVehicleDetailsTypeTrailer() {
        return new VehicleDetailsType.Trailer();
    }

    /**
     * Create an instance of {@link VehicleDetailsType.Trailer.TrailerPricing }
     * 
     */
    public VehicleDetailsType.Trailer.TrailerPricing createVehicleDetailsTypeTrailerTrailerPricing() {
        return new VehicleDetailsType.Trailer.TrailerPricing();
    }

    /**
     * Create an instance of {@link VehicleDetailsType.Vehicle }
     * 
     */
    public VehicleDetailsType.Vehicle createVehicleDetailsTypeVehicle() {
        return new VehicleDetailsType.Vehicle();
    }

    /**
     * Create an instance of {@link VehicleDetailsType.Vehicle.VehiclePricing }
     * 
     */
    public VehicleDetailsType.Vehicle.VehiclePricing createVehicleDetailsTypeVehicleVehiclePricing() {
        return new VehicleDetailsType.Vehicle.VehiclePricing();
    }

    /**
     * Create an instance of {@link FerryReservationRequest.PassengerCount }
     * 
     */
    public FerryReservationRequest.PassengerCount createFerryReservationRequestPassengerCount() {
        return new FerryReservationRequest.PassengerCount();
    }

    /**
     * Create an instance of {@link PassengerDetailType }
     * 
     */
    public PassengerDetailType createPassengerDetailType() {
        return new PassengerDetailType();
    }

    /**
     * Create an instance of {@link FareType }
     * 
     */
    public FareType createFareType() {
        return new FareType();
    }

    /**
     * Create an instance of {@link FareType.Fees }
     * 
     */
    public FareType.Fees createFareTypeFees() {
        return new FareType.Fees();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType }
     * 
     */
    public VehicleLocationAdditionalDetailsType createVehicleLocationAdditionalDetailsType() {
        return new VehicleLocationAdditionalDetailsType();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.OneWayDropLocations }
     * 
     */
    public VehicleLocationAdditionalDetailsType.OneWayDropLocations createVehicleLocationAdditionalDetailsTypeOneWayDropLocations() {
        return new VehicleLocationAdditionalDetailsType.OneWayDropLocations();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.Shuttle }
     * 
     */
    public VehicleLocationAdditionalDetailsType.Shuttle createVehicleLocationAdditionalDetailsTypeShuttle() {
        return new VehicleLocationAdditionalDetailsType.Shuttle();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos }
     * 
     */
    public VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos createVehicleLocationAdditionalDetailsTypeShuttleShuttleInfos() {
        return new VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.VehRentLocInfos }
     * 
     */
    public VehicleLocationAdditionalDetailsType.VehRentLocInfos createVehicleLocationAdditionalDetailsTypeVehRentLocInfos() {
        return new VehicleLocationAdditionalDetailsType.VehRentLocInfos();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo }
     * 
     */
    public VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo createVehicleLocationAdditionalDetailsTypeVehRentLocInfosVehRentLocInfo() {
        return new VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords }
     * 
     */
    public VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords createVehicleLocationAdditionalDetailsTypeVehRentLocInfosVehRentLocInfoKeywords() {
        return new VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords();
    }

    /**
     * Create an instance of {@link PaymentResponseType }
     * 
     */
    public PaymentResponseType createPaymentResponseType() {
        return new PaymentResponseType();
    }

    /**
     * Create an instance of {@link ItineraryItemRequestType }
     * 
     */
    public ItineraryItemRequestType createItineraryItemRequestType() {
        return new ItineraryItemRequestType();
    }

    /**
     * Create an instance of {@link AreaInfoType }
     * 
     */
    public AreaInfoType createAreaInfoType() {
        return new AreaInfoType();
    }

    /**
     * Create an instance of {@link AreaInfoType.OtherHotels }
     * 
     */
    public AreaInfoType.OtherHotels createAreaInfoTypeOtherHotels() {
        return new AreaInfoType.OtherHotels();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations }
     * 
     */
    public AreaInfoType.Recreations createAreaInfoTypeRecreations() {
        return new AreaInfoType.Recreations();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations.Recreation }
     * 
     */
    public AreaInfoType.Recreations.Recreation createAreaInfoTypeRecreationsRecreation() {
        return new AreaInfoType.Recreations.Recreation();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations.Recreation.RecreationDetails }
     * 
     */
    public AreaInfoType.Recreations.Recreation.RecreationDetails createAreaInfoTypeRecreationsRecreationRecreationDetails() {
        return new AreaInfoType.Recreations.Recreation.RecreationDetails();
    }

    /**
     * Create an instance of {@link AreaInfoType.Attractions }
     * 
     */
    public AreaInfoType.Attractions createAreaInfoTypeAttractions() {
        return new AreaInfoType.Attractions();
    }

    /**
     * Create an instance of {@link AreaInfoType.Attractions.Attraction }
     * 
     */
    public AreaInfoType.Attractions.Attraction createAreaInfoTypeAttractionsAttraction() {
        return new AreaInfoType.Attractions.Attraction();
    }

    /**
     * Create an instance of {@link RefPointsType }
     * 
     */
    public RefPointsType createRefPointsType() {
        return new RefPointsType();
    }

    /**
     * Create an instance of {@link RefPointsType.RefPoint }
     * 
     */
    public RefPointsType.RefPoint createRefPointsTypeRefPoint() {
        return new RefPointsType.RefPoint();
    }

    /**
     * Create an instance of {@link FormattedTextSubSectionType }
     * 
     */
    public FormattedTextSubSectionType createFormattedTextSubSectionType() {
        return new FormattedTextSubSectionType();
    }

    /**
     * Create an instance of {@link VehicleAdditionalDriverRequirementsType }
     * 
     */
    public VehicleAdditionalDriverRequirementsType createVehicleAdditionalDriverRequirementsType() {
        return new VehicleAdditionalDriverRequirementsType();
    }

    /**
     * Create an instance of {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos }
     * 
     */
    public VehicleAdditionalDriverRequirementsType.AddlDriverInfos createVehicleAdditionalDriverRequirementsTypeAddlDriverInfos() {
        return new VehicleAdditionalDriverRequirementsType.AddlDriverInfos();
    }

    /**
     * Create an instance of {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles }
     * 
     */
    public VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles createVehicleAdditionalDriverRequirementsTypeAddlDriverInfosVehicles() {
        return new VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles();
    }

    /**
     * Create an instance of {@link AllowanceType }
     * 
     */
    public AllowanceType createAllowanceType() {
        return new AllowanceType();
    }

    /**
     * Create an instance of {@link AllowanceType.BookingInstructions }
     * 
     */
    public AllowanceType.BookingInstructions createAllowanceTypeBookingInstructions() {
        return new AllowanceType.BookingInstructions();
    }

    /**
     * Create an instance of {@link PaymentCardType }
     * 
     */
    public PaymentCardType createPaymentCardType() {
        return new PaymentCardType();
    }

    /**
     * Create an instance of {@link PaymentCardType.ThreeDomainSecurity }
     * 
     */
    public PaymentCardType.ThreeDomainSecurity createPaymentCardTypeThreeDomainSecurity() {
        return new PaymentCardType.ThreeDomainSecurity();
    }

    /**
     * Create an instance of {@link PaymentCardType.ThreeDomainSecurity.Gateway }
     * 
     */
    public PaymentCardType.ThreeDomainSecurity.Gateway createPaymentCardTypeThreeDomainSecurityGateway() {
        return new PaymentCardType.ThreeDomainSecurity.Gateway();
    }

    /**
     * Create an instance of {@link CruiseReservationType }
     * 
     */
    public CruiseReservationType createCruiseReservationType() {
        return new CruiseReservationType();
    }

    /**
     * Create an instance of {@link CruiseReservationType.PaymentsDue }
     * 
     */
    public CruiseReservationType.PaymentsDue createCruiseReservationTypePaymentsDue() {
        return new CruiseReservationType.PaymentsDue();
    }

    /**
     * Create an instance of {@link BundleAttributesType }
     * 
     */
    public BundleAttributesType createBundleAttributesType() {
        return new BundleAttributesType();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType }
     * 
     */
    public VehicleRentalTransactionType createVehicleRentalTransactionType() {
        return new VehicleRentalTransactionType();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.PricedEquips }
     * 
     */
    public VehicleRentalTransactionType.PricedEquips createVehicleRentalTransactionTypePricedEquips() {
        return new VehicleRentalTransactionType.PricedEquips();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.PricedEquips.PricedEquip }
     * 
     */
    public VehicleRentalTransactionType.PricedEquips.PricedEquip createVehicleRentalTransactionTypePricedEquipsPricedEquip() {
        return new VehicleRentalTransactionType.PricedEquips.PricedEquip();
    }

    /**
     * Create an instance of {@link SuperPNRActionsType }
     * 
     */
    public SuperPNRActionsType createSuperPNRActionsType() {
        return new SuperPNRActionsType();
    }

    /**
     * Create an instance of {@link UserInputResponseType }
     * 
     */
    public UserInputResponseType createUserInputResponseType() {
        return new UserInputResponseType();
    }

    /**
     * Create an instance of {@link UserInputResponseType.UserChoices }
     * 
     */
    public UserInputResponseType.UserChoices createUserInputResponseTypeUserChoices() {
        return new UserInputResponseType.UserChoices();
    }

    /**
     * Create an instance of {@link UserInputResponseType.UserChoices.FlightOptions }
     * 
     */
    public UserInputResponseType.UserChoices.FlightOptions createUserInputResponseTypeUserChoicesFlightOptions() {
        return new UserInputResponseType.UserChoices.FlightOptions();
    }

    /**
     * Create an instance of {@link UserInputResponseType.UserChoices.FlightOptions.Flight }
     * 
     */
    public UserInputResponseType.UserChoices.FlightOptions.Flight createUserInputResponseTypeUserChoicesFlightOptionsFlight() {
        return new UserInputResponseType.UserChoices.FlightOptions.Flight();
    }

    /**
     * Create an instance of {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment }
     * 
     */
    public UserInputResponseType.UserChoices.FlightOptions.Flight.Segment createUserInputResponseTypeUserChoicesFlightOptionsFlightSegment() {
        return new UserInputResponseType.UserChoices.FlightOptions.Flight.Segment();
    }

    /**
     * Create an instance of {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes }
     * 
     */
    public UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes createUserInputResponseTypeUserChoicesFlightOptionsFlightSegmentClasses() {
        return new UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes();
    }

    /**
     * Create an instance of {@link EMDType }
     * 
     */
    public EMDType createEMDType() {
        return new EMDType();
    }

    /**
     * Create an instance of {@link EMDType.TaxCouponInformation }
     * 
     */
    public EMDType.TaxCouponInformation createEMDTypeTaxCouponInformation() {
        return new EMDType.TaxCouponInformation();
    }

    /**
     * Create an instance of {@link EMDType.TaxCouponInformation.TicketDocument }
     * 
     */
    public EMDType.TaxCouponInformation.TicketDocument createEMDTypeTaxCouponInformationTicketDocument() {
        return new EMDType.TaxCouponInformation.TicketDocument();
    }

    /**
     * Create an instance of {@link EMDType.TaxCouponInformation.TicketDocument.CouponNumber }
     * 
     */
    public EMDType.TaxCouponInformation.TicketDocument.CouponNumber createEMDTypeTaxCouponInformationTicketDocumentCouponNumber() {
        return new EMDType.TaxCouponInformation.TicketDocument.CouponNumber();
    }

    /**
     * Create an instance of {@link FareComponentType }
     * 
     */
    public FareComponentType createFareComponentType() {
        return new FareComponentType();
    }

    /**
     * Create an instance of {@link EMDType.ExchResidualFareComponent }
     * 
     */
    public EMDType.ExchResidualFareComponent createEMDTypeExchResidualFareComponent() {
        return new EMDType.ExchResidualFareComponent();
    }

    /**
     * Create an instance of {@link FareComponentType.PriceableUnit }
     * 
     */
    public FareComponentType.PriceableUnit createFareComponentTypePriceableUnit() {
        return new FareComponentType.PriceableUnit();
    }

    /**
     * Create an instance of {@link FareComponentType.PriceableUnit.FareComponentDetail }
     * 
     */
    public FareComponentType.PriceableUnit.FareComponentDetail createFareComponentTypePriceableUnitFareComponentDetail() {
        return new FareComponentType.PriceableUnit.FareComponentDetail();
    }

    /**
     * Create an instance of {@link EMDType.CarrierFeeInfo }
     * 
     */
    public EMDType.CarrierFeeInfo createEMDTypeCarrierFeeInfo() {
        return new EMDType.CarrierFeeInfo();
    }

    /**
     * Create an instance of {@link EMDType.CarrierFeeInfo.CarrierFee }
     * 
     */
    public EMDType.CarrierFeeInfo.CarrierFee createEMDTypeCarrierFeeInfoCarrierFee() {
        return new EMDType.CarrierFeeInfo.CarrierFee();
    }

    /**
     * Create an instance of {@link EMDType.TicketDocument }
     * 
     */
    public EMDType.TicketDocument createEMDTypeTicketDocument() {
        return new EMDType.TicketDocument();
    }

    /**
     * Create an instance of {@link EMDType.TicketDocument.CouponInfo }
     * 
     */
    public EMDType.TicketDocument.CouponInfo createEMDTypeTicketDocumentCouponInfo() {
        return new EMDType.TicketDocument.CouponInfo();
    }

    /**
     * Create an instance of {@link ETFareInfo }
     * 
     */
    public ETFareInfo createETFareInfo() {
        return new ETFareInfo();
    }

    /**
     * Create an instance of {@link EMDType.Taxes }
     * 
     */
    public EMDType.Taxes createEMDTypeTaxes() {
        return new EMDType.Taxes();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Module }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Module createModule() {
        return new com.airchina.datacenter.spnr.sdk.entity.Module();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Module.Products }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Module.Products createModuleProducts() {
        return new com.airchina.datacenter.spnr.sdk.entity.Module.Products();
    }

    /**
     * Create an instance of {@link BrandControlRuleInfoType }
     * 
     */
    public BrandControlRuleInfoType createBrandControlRuleInfoType() {
        return new BrandControlRuleInfoType();
    }

    /**
     * Create an instance of {@link RowDetailsType }
     * 
     */
    public RowDetailsType createRowDetailsType() {
        return new RowDetailsType();
    }

    /**
     * Create an instance of {@link RowDetailsType.AirSeats }
     * 
     */
    public RowDetailsType.AirSeats createRowDetailsTypeAirSeats() {
        return new RowDetailsType.AirSeats();
    }

    /**
     * Create an instance of {@link OrdersType }
     * 
     */
    public OrdersType createOrdersType() {
        return new OrdersType();
    }

    /**
     * Create an instance of {@link OrdersType.Order }
     * 
     */
    public OrdersType.Order createOrdersTypeOrder() {
        return new OrdersType.Order();
    }

    /**
     * Create an instance of {@link OrdersType.Order.Products }
     * 
     */
    public OrdersType.Order.Products createOrdersTypeOrderProducts() {
        return new OrdersType.Order.Products();
    }

    /**
     * Create an instance of {@link ProductDescriptionsType }
     * 
     */
    public ProductDescriptionsType createProductDescriptionsType() {
        return new ProductDescriptionsType();
    }

    /**
     * Create an instance of {@link ProductBiasList }
     * 
     */
    public ProductBiasList createProductBiasList() {
        return new ProductBiasList();
    }

    /**
     * Create an instance of {@link ProductBiasList.Product }
     * 
     */
    public ProductBiasList.Product createProductBiasListProduct() {
        return new ProductBiasList.Product();
    }

    /**
     * Create an instance of {@link RecipientInfosType }
     * 
     */
    public RecipientInfosType createRecipientInfosType() {
        return new RecipientInfosType();
    }

    /**
     * Create an instance of {@link RecipientInfosType.RecipientInfo }
     * 
     */
    public RecipientInfosType.RecipientInfo createRecipientInfosTypeRecipientInfo() {
        return new RecipientInfosType.RecipientInfo();
    }

    /**
     * Create an instance of {@link OntologyPaymentType }
     * 
     */
    public OntologyPaymentType createOntologyPaymentType() {
        return new OntologyPaymentType();
    }

    /**
     * Create an instance of {@link OntologyPaymentType.Rate }
     * 
     */
    public OntologyPaymentType.Rate createOntologyPaymentTypeRate() {
        return new OntologyPaymentType.Rate();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link ItemType.ItemQuantities }
     * 
     */
    public ItemType.ItemQuantities createItemTypeItemQuantities() {
        return new ItemType.ItemQuantities();
    }

    /**
     * Create an instance of {@link CoverageLimitType }
     * 
     */
    public CoverageLimitType createCoverageLimitType() {
        return new CoverageLimitType();
    }

    /**
     * Create an instance of {@link CostingItemType }
     * 
     */
    public CostingItemType createCostingItemType() {
        return new CostingItemType();
    }

    /**
     * Create an instance of {@link AssociatedProductsType }
     * 
     */
    public AssociatedProductsType createAssociatedProductsType() {
        return new AssociatedProductsType();
    }

    /**
     * Create an instance of {@link SPNRPricingType }
     * 
     */
    public SPNRPricingType createSPNRPricingType() {
        return new SPNRPricingType();
    }

    /**
     * Create an instance of {@link TravelerRPHs }
     * 
     */
    public TravelerRPHs createTravelerRPHs() {
        return new TravelerRPHs();
    }

    /**
     * Create an instance of {@link AffiliationInfoType }
     * 
     */
    public AffiliationInfoType createAffiliationInfoType() {
        return new AffiliationInfoType();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.PartnerInfos }
     * 
     */
    public AffiliationInfoType.PartnerInfos createAffiliationInfoTypePartnerInfos() {
        return new AffiliationInfoType.PartnerInfos();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.Awards }
     * 
     */
    public AffiliationInfoType.Awards createAffiliationInfoTypeAwards() {
        return new AffiliationInfoType.Awards();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.LoyalPrograms }
     * 
     */
    public AffiliationInfoType.LoyalPrograms createAffiliationInfoTypeLoyalPrograms() {
        return new AffiliationInfoType.LoyalPrograms();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.LoyalPrograms.LoyalProgram }
     * 
     */
    public AffiliationInfoType.LoyalPrograms.LoyalProgram createAffiliationInfoTypeLoyalProgramsLoyalProgram() {
        return new AffiliationInfoType.LoyalPrograms.LoyalProgram();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.Brands }
     * 
     */
    public AffiliationInfoType.Brands createAffiliationInfoTypeBrands() {
        return new AffiliationInfoType.Brands();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.DistribSystems }
     * 
     */
    public AffiliationInfoType.DistribSystems createAffiliationInfoTypeDistribSystems() {
        return new AffiliationInfoType.DistribSystems();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.DistribSystems.DistribSystem }
     * 
     */
    public AffiliationInfoType.DistribSystems.DistribSystem createAffiliationInfoTypeDistribSystemsDistribSystem() {
        return new AffiliationInfoType.DistribSystems.DistribSystem();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.DistribSystems.DistribSystem.Priorities }
     * 
     */
    public AffiliationInfoType.DistribSystems.DistribSystem.Priorities createAffiliationInfoTypeDistribSystemsDistribSystemPriorities() {
        return new AffiliationInfoType.DistribSystems.DistribSystem.Priorities();
    }

    /**
     * Create an instance of {@link AirAncillaryBundleProductType }
     * 
     */
    public AirAncillaryBundleProductType createAirAncillaryBundleProductType() {
        return new AirAncillaryBundleProductType();
    }

    /**
     * Create an instance of {@link AirAncillaryBundleProductType.PassengerTypes }
     * 
     */
    public AirAncillaryBundleProductType.PassengerTypes createAirAncillaryBundleProductTypePassengerTypes() {
        return new AirAncillaryBundleProductType.PassengerTypes();
    }

    /**
     * Create an instance of {@link PlanRestrictionType }
     * 
     */
    public PlanRestrictionType createPlanRestrictionType() {
        return new PlanRestrictionType();
    }

    /**
     * Create an instance of {@link SpecificFlightInfoType }
     * 
     */
    public SpecificFlightInfoType createSpecificFlightInfoType() {
        return new SpecificFlightInfoType();
    }

    /**
     * Create an instance of {@link SpecificFlightInfoType.BookingClassPref }
     * 
     */
    public SpecificFlightInfoType.BookingClassPref createSpecificFlightInfoTypeBookingClassPref() {
        return new SpecificFlightInfoType.BookingClassPref();
    }

    /**
     * Create an instance of {@link SpecificFlightInfoType.BookingClassPref.AssociatedBrands }
     * 
     */
    public SpecificFlightInfoType.BookingClassPref.AssociatedBrands createSpecificFlightInfoTypeBookingClassPrefAssociatedBrands() {
        return new SpecificFlightInfoType.BookingClassPref.AssociatedBrands();
    }

    /**
     * Create an instance of {@link PricedItineraryType }
     * 
     */
    public PricedItineraryType createPricedItineraryType() {
        return new PricedItineraryType();
    }

    /**
     * Create an instance of {@link PricedItineraryType.Notes }
     * 
     */
    public PricedItineraryType.Notes createPricedItineraryTypeNotes() {
        return new PricedItineraryType.Notes();
    }

    /**
     * Create an instance of {@link SpecialSrvcSSRType }
     * 
     */
    public SpecialSrvcSSRType createSpecialSrvcSSRType() {
        return new SpecialSrvcSSRType();
    }

    /**
     * Create an instance of {@link CommentType }
     * 
     */
    public CommentType createCommentType() {
        return new CommentType();
    }

    /**
     * Create an instance of {@link PageviewType }
     * 
     */
    public PageviewType createPageviewType() {
        return new PageviewType();
    }

    /**
     * Create an instance of {@link PageviewType.Pageview }
     * 
     */
    public PageviewType.Pageview createPageviewTypePageview() {
        return new PageviewType.Pageview();
    }

    /**
     * Create an instance of {@link SpecialSrvcOtherType }
     * 
     */
    public SpecialSrvcOtherType createSpecialSrvcOtherType() {
        return new SpecialSrvcOtherType();
    }

    /**
     * Create an instance of {@link WeChatMessageType }
     * 
     */
    public WeChatMessageType createWeChatMessageType() {
        return new WeChatMessageType();
    }

    /**
     * Create an instance of {@link VoluntaryChangesType }
     * 
     */
    public VoluntaryChangesType createVoluntaryChangesType() {
        return new VoluntaryChangesType();
    }

    /**
     * Create an instance of {@link PenaltyCoreType }
     * 
     */
    public PenaltyCoreType createPenaltyCoreType() {
        return new PenaltyCoreType();
    }

    /**
     * Create an instance of {@link PenaltyCoreType.Cancel }
     * 
     */
    public PenaltyCoreType.Cancel createPenaltyCoreTypeCancel() {
        return new PenaltyCoreType.Cancel();
    }

    /**
     * Create an instance of {@link PenaltyCoreType.Change }
     * 
     */
    public PenaltyCoreType.Change createPenaltyCoreTypeChange() {
        return new PenaltyCoreType.Change();
    }

    /**
     * Create an instance of {@link TaxCollectionType }
     * 
     */
    public TaxCollectionType createTaxCollectionType() {
        return new TaxCollectionType();
    }

    /**
     * Create an instance of {@link AdjustmentsType }
     * 
     */
    public AdjustmentsType createAdjustmentsType() {
        return new AdjustmentsType();
    }

    /**
     * Create an instance of {@link CodeListFeeType }
     * 
     */
    public CodeListFeeType createCodeListFeeType() {
        return new CodeListFeeType();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Taxes }
     * 
     */
    public CodeListFeeType.Taxes createCodeListFeeTypeTaxes() {
        return new CodeListFeeType.Taxes();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Taxes.Qualifiers }
     * 
     */
    public CodeListFeeType.Taxes.Qualifiers createCodeListFeeTypeTaxesQualifiers() {
        return new CodeListFeeType.Taxes.Qualifiers();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Taxes.Qualifiers.ChargeUnit }
     * 
     */
    public CodeListFeeType.Taxes.Qualifiers.ChargeUnit createCodeListFeeTypeTaxesQualifiersChargeUnit() {
        return new CodeListFeeType.Taxes.Qualifiers.ChargeUnit();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Taxes.Amount }
     * 
     */
    public CodeListFeeType.Taxes.Amount createCodeListFeeTypeTaxesAmount() {
        return new CodeListFeeType.Taxes.Amount();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Qualifiers }
     * 
     */
    public CodeListFeeType.Qualifiers createCodeListFeeTypeQualifiers() {
        return new CodeListFeeType.Qualifiers();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Qualifiers.ChargeUnit }
     * 
     */
    public CodeListFeeType.Qualifiers.ChargeUnit createCodeListFeeTypeQualifiersChargeUnit() {
        return new CodeListFeeType.Qualifiers.ChargeUnit();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Amount }
     * 
     */
    public CodeListFeeType.Amount createCodeListFeeTypeAmount() {
        return new CodeListFeeType.Amount();
    }

    /**
     * Create an instance of {@link PhonePrefType }
     * 
     */
    public PhonePrefType createPhonePrefType() {
        return new PhonePrefType();
    }

    /**
     * Create an instance of {@link ServiceItemNoPriceRefType }
     * 
     */
    public ServiceItemNoPriceRefType createServiceItemNoPriceRefType() {
        return new ServiceItemNoPriceRefType();
    }

    /**
     * Create an instance of {@link ServiceItemNoPriceRefType.BookingInstructions }
     * 
     */
    public ServiceItemNoPriceRefType.BookingInstructions createServiceItemNoPriceRefTypeBookingInstructions() {
        return new ServiceItemNoPriceRefType.BookingInstructions();
    }

    /**
     * Create an instance of {@link RailAccommDetailType }
     * 
     */
    public RailAccommDetailType createRailAccommDetailType() {
        return new RailAccommDetailType();
    }

    /**
     * Create an instance of {@link StayRestrictionsType }
     * 
     */
    public StayRestrictionsType createStayRestrictionsType() {
        return new StayRestrictionsType();
    }

    /**
     * Create an instance of {@link GDSInfoType }
     * 
     */
    public GDSInfoType createGDSInfoType() {
        return new GDSInfoType();
    }

    /**
     * Create an instance of {@link GDSInfoType.GDSCodes }
     * 
     */
    public GDSInfoType.GDSCodes createGDSInfoTypeGDSCodes() {
        return new GDSInfoType.GDSCodes();
    }

    /**
     * Create an instance of {@link GDSInfoType.GDSCodes.GDSCode }
     * 
     */
    public GDSInfoType.GDSCodes.GDSCode createGDSInfoTypeGDSCodesGDSCode() {
        return new GDSInfoType.GDSCodes.GDSCode();
    }

    /**
     * Create an instance of {@link GDSInfoType.GDSCodes.GDSCode.GDSCodeDetails }
     * 
     */
    public GDSInfoType.GDSCodes.GDSCode.GDSCodeDetails createGDSInfoTypeGDSCodesGDSCodeGDSCodeDetails() {
        return new GDSInfoType.GDSCodes.GDSCode.GDSCodeDetails();
    }

    /**
     * Create an instance of {@link TicketingInfoType }
     * 
     */
    public TicketingInfoType createTicketingInfoType() {
        return new TicketingInfoType();
    }

    /**
     * Create an instance of {@link TicketingInfoType.CheckInInfo }
     * 
     */
    public TicketingInfoType.CheckInInfo createTicketingInfoTypeCheckInInfo() {
        return new TicketingInfoType.CheckInInfo();
    }

    /**
     * Create an instance of {@link TicketingInfoType.CheckInInfo.Notes }
     * 
     */
    public TicketingInfoType.CheckInInfo.Notes createTicketingInfoTypeCheckInInfoNotes() {
        return new TicketingInfoType.CheckInInfo.Notes();
    }

    /**
     * Create an instance of {@link SpecialRequestType }
     * 
     */
    public SpecialRequestType createSpecialRequestType() {
        return new SpecialRequestType();
    }

    /**
     * Create an instance of {@link RailPriceBreakdownType }
     * 
     */
    public RailPriceBreakdownType createRailPriceBreakdownType() {
        return new RailPriceBreakdownType();
    }

    /**
     * Create an instance of {@link OntologyLoyaltyType }
     * 
     */
    public OntologyLoyaltyType createOntologyLoyaltyType() {
        return new OntologyLoyaltyType();
    }

    /**
     * Create an instance of {@link MarketingDataType }
     * 
     */
    public MarketingDataType createMarketingDataType() {
        return new MarketingDataType();
    }

    /**
     * Create an instance of {@link MarketingDataType.MediaContent }
     * 
     */
    public MarketingDataType.MediaContent createMarketingDataTypeMediaContent() {
        return new MarketingDataType.MediaContent();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType }
     * 
     */
    public VehicleSegmentCoreType createVehicleSegmentCoreType() {
        return new VehicleSegmentCoreType();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType.SpecialEquipPrefs }
     * 
     */
    public VehicleSegmentCoreType.SpecialEquipPrefs createVehicleSegmentCoreTypeSpecialEquipPrefs() {
        return new VehicleSegmentCoreType.SpecialEquipPrefs();
    }

    /**
     * Create an instance of {@link SpecialSrvcPaxType }
     * 
     */
    public SpecialSrvcPaxType createSpecialSrvcPaxType() {
        return new SpecialSrvcPaxType();
    }

    /**
     * Create an instance of {@link SpecialSrvcPaxType.OtherType }
     * 
     */
    public SpecialSrvcPaxType.OtherType createSpecialSrvcPaxTypeOtherType() {
        return new SpecialSrvcPaxType.OtherType();
    }

    /**
     * Create an instance of {@link SpecialSrvcPaxType.SSRType }
     * 
     */
    public SpecialSrvcPaxType.SSRType createSpecialSrvcPaxTypeSSRType() {
        return new SpecialSrvcPaxType.SSRType();
    }

    /**
     * Create an instance of {@link AncillaryAvailBoundProductsType }
     * 
     */
    public AncillaryAvailBoundProductsType createAncillaryAvailBoundProductsType() {
        return new AncillaryAvailBoundProductsType();
    }

    /**
     * Create an instance of {@link AncillaryAvailBoundProductsType.AncillaryProducts }
     * 
     */
    public AncillaryAvailBoundProductsType.AncillaryProducts createAncillaryAvailBoundProductsTypeAncillaryProducts() {
        return new AncillaryAvailBoundProductsType.AncillaryProducts();
    }

    /**
     * Create an instance of {@link AncillaryAvailBoundProductsType.AncillaryProducts.Flights }
     * 
     */
    public AncillaryAvailBoundProductsType.AncillaryProducts.Flights createAncillaryAvailBoundProductsTypeAncillaryProductsFlights() {
        return new AncillaryAvailBoundProductsType.AncillaryProducts.Flights();
    }

    /**
     * Create an instance of {@link PreferencesType }
     * 
     */
    public PreferencesType createPreferencesType() {
        return new PreferencesType();
    }

    /**
     * Create an instance of {@link VehicleLocationVehiclesType }
     * 
     */
    public VehicleLocationVehiclesType createVehicleLocationVehiclesType() {
        return new VehicleLocationVehiclesType();
    }

    /**
     * Create an instance of {@link VehicleLocationVehiclesType.VehicleInfos }
     * 
     */
    public VehicleLocationVehiclesType.VehicleInfos createVehicleLocationVehiclesTypeVehicleInfos() {
        return new VehicleLocationVehiclesType.VehicleInfos();
    }

    /**
     * Create an instance of {@link AmendmentFeesType }
     * 
     */
    public AmendmentFeesType createAmendmentFeesType() {
        return new AmendmentFeesType();
    }

    /**
     * Create an instance of {@link CouponsType }
     * 
     */
    public CouponsType createCouponsType() {
        return new CouponsType();
    }

    /**
     * Create an instance of {@link RoomPriceType }
     * 
     */
    public RoomPriceType createRoomPriceType() {
        return new RoomPriceType();
    }

    /**
     * Create an instance of {@link TripFeaturesType }
     * 
     */
    public TripFeaturesType createTripFeaturesType() {
        return new TripFeaturesType();
    }

    /**
     * Create an instance of {@link TripFeaturesType.Destinations }
     * 
     */
    public TripFeaturesType.Destinations createTripFeaturesTypeDestinations() {
        return new TripFeaturesType.Destinations();
    }

    /**
     * Create an instance of {@link ProductBase }
     * 
     */
    public ProductBase createProductBase() {
        return new ProductBase();
    }

    /**
     * Create an instance of {@link ProductBase.AncillaryProduct }
     * 
     */
    public ProductBase.AncillaryProduct createProductBaseAncillaryProduct() {
        return new ProductBase.AncillaryProduct();
    }

    /**
     * Create an instance of {@link ProductBase.AncillaryProduct.Attributes }
     * 
     */
    public ProductBase.AncillaryProduct.Attributes createProductBaseAncillaryProductAttributes() {
        return new ProductBase.AncillaryProduct.Attributes();
    }

    /**
     * Create an instance of {@link ProductBase.ProductBaseBaggage }
     * 
     */
    public ProductBase.ProductBaseBaggage createProductBaseProductBaseBaggage() {
        return new ProductBase.ProductBaseBaggage();
    }

    /**
     * Create an instance of {@link ProductBase.ProductBaseBaggage.OriginDestination }
     * 
     */
    public ProductBase.ProductBaseBaggage.OriginDestination createProductBaseProductBaseBaggageOriginDestination() {
        return new ProductBase.ProductBaseBaggage.OriginDestination();
    }

    /**
     * Create an instance of {@link ProductBase.ProductBaseBaggage.OriginDestination.Service }
     * 
     */
    public ProductBase.ProductBaseBaggage.OriginDestination.Service createProductBaseProductBaseBaggageOriginDestinationService() {
        return new ProductBase.ProductBaseBaggage.OriginDestination.Service();
    }

    /**
     * Create an instance of {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage }
     * 
     */
    public ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage createProductBaseProductBaseBaggageOriginDestinationServiceBaggage() {
        return new ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage();
    }

    /**
     * Create an instance of {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions }
     * 
     */
    public ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions createProductBaseProductBaseBaggageOriginDestinationServiceBookingInstructions() {
        return new ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions();
    }

    /**
     * Create an instance of {@link DestActivityReservationType }
     * 
     */
    public DestActivityReservationType createDestActivityReservationType() {
        return new DestActivityReservationType();
    }

    /**
     * Create an instance of {@link ProductBase.Activity }
     * 
     */
    public ProductBase.Activity createProductBaseActivity() {
        return new ProductBase.Activity();
    }

    /**
     * Create an instance of {@link ProductBase.Activity.TPAExtensions }
     * 
     */
    public ProductBase.Activity.TPAExtensions createProductBaseActivityTPAExtensions() {
        return new ProductBase.Activity.TPAExtensions();
    }

    /**
     * Create an instance of {@link ProductBase.Activity.TPAExtensions.Insurance }
     * 
     */
    public ProductBase.Activity.TPAExtensions.Insurance createProductBaseActivityTPAExtensionsInsurance() {
        return new ProductBase.Activity.TPAExtensions.Insurance();
    }

    /**
     * Create an instance of {@link PlanCostType }
     * 
     */
    public PlanCostType createPlanCostType() {
        return new PlanCostType();
    }

    /**
     * Create an instance of {@link ProductBase.Activity.TPAExtensions.Insurance.PlanCost }
     * 
     */
    public ProductBase.Activity.TPAExtensions.Insurance.PlanCost createProductBaseActivityTPAExtensionsInsurancePlanCost() {
        return new ProductBase.Activity.TPAExtensions.Insurance.PlanCost();
    }

    /**
     * Create an instance of {@link ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices }
     * 
     */
    public ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices createProductBaseActivityTPAExtensionsInsurancePlanCostIncrementalPrices() {
        return new ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices();
    }

    /**
     * Create an instance of {@link ProductBase.Activity.BookingReferenceID }
     * 
     */
    public ProductBase.Activity.BookingReferenceID createProductBaseActivityBookingReferenceID() {
        return new ProductBase.Activity.BookingReferenceID();
    }

    /**
     * Create an instance of {@link ProductBase.Hotel }
     * 
     */
    public ProductBase.Hotel createProductBaseHotel() {
        return new ProductBase.Hotel();
    }

    /**
     * Create an instance of {@link VehicleReservationType }
     * 
     */
    public VehicleReservationType createVehicleReservationType() {
        return new VehicleReservationType();
    }

    /**
     * Create an instance of {@link ProductBase.Vehicle }
     * 
     */
    public ProductBase.Vehicle createProductBaseVehicle() {
        return new ProductBase.Vehicle();
    }

    /**
     * Create an instance of {@link ProductBase.Vehicle.BookingReferenceID }
     * 
     */
    public ProductBase.Vehicle.BookingReferenceID createProductBaseVehicleBookingReferenceID() {
        return new ProductBase.Vehicle.BookingReferenceID();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link AmountType.AdditionalCharges }
     * 
     */
    public AmountType.AdditionalCharges createAmountTypeAdditionalCharges() {
        return new AmountType.AdditionalCharges();
    }

    /**
     * Create an instance of {@link AmountType.NightlyRates }
     * 
     */
    public AmountType.NightlyRates createAmountTypeNightlyRates() {
        return new AmountType.NightlyRates();
    }

    /**
     * Create an instance of {@link SpecialSrvcSegType }
     * 
     */
    public SpecialSrvcSegType createSpecialSrvcSegType() {
        return new SpecialSrvcSegType();
    }

    /**
     * Create an instance of {@link BusInfoType }
     * 
     */
    public BusInfoType createBusInfoType() {
        return new BusInfoType();
    }

    /**
     * Create an instance of {@link RailPassengerDetailType }
     * 
     */
    public RailPassengerDetailType createRailPassengerDetailType() {
        return new RailPassengerDetailType();
    }

    /**
     * Create an instance of {@link FlightSegmentRefsType }
     * 
     */
    public FlightSegmentRefsType createFlightSegmentRefsType() {
        return new FlightSegmentRefsType();
    }

    /**
     * Create an instance of {@link RefundType }
     * 
     */
    public RefundType createRefundType() {
        return new RefundType();
    }

    /**
     * Create an instance of {@link RefundType.Refund }
     * 
     */
    public RefundType.Refund createRefundTypeRefund() {
        return new RefundType.Refund();
    }

    /**
     * Create an instance of {@link FlightDetailType }
     * 
     */
    public FlightDetailType createFlightDetailType() {
        return new FlightDetailType();
    }

    /**
     * Create an instance of {@link EmailsType }
     * 
     */
    public EmailsType createEmailsType() {
        return new EmailsType();
    }

    /**
     * Create an instance of {@link AirAncillariesFlightProductSummaryType }
     * 
     */
    public AirAncillariesFlightProductSummaryType createAirAncillariesFlightProductSummaryType() {
        return new AirAncillariesFlightProductSummaryType();
    }

    /**
     * Create an instance of {@link ItemsType }
     * 
     */
    public ItemsType createItemsType() {
        return new ItemsType();
    }

    /**
     * Create an instance of {@link OntologyTransportationType }
     * 
     */
    public OntologyTransportationType createOntologyTransportationType() {
        return new OntologyTransportationType();
    }

    /**
     * Create an instance of {@link OntologyTransportationType.Vehicle }
     * 
     */
    public OntologyTransportationType.Vehicle createOntologyTransportationTypeVehicle() {
        return new OntologyTransportationType.Vehicle();
    }

    /**
     * Create an instance of {@link OntologyTransportationType.FlightAndRail }
     * 
     */
    public OntologyTransportationType.FlightAndRail createOntologyTransportationTypeFlightAndRail() {
        return new OntologyTransportationType.FlightAndRail();
    }

    /**
     * Create an instance of {@link RoomStaysType }
     * 
     */
    public RoomStaysType createRoomStaysType() {
        return new RoomStaysType();
    }

    /**
     * Create an instance of {@link RoomStaysType.RoomStay }
     * 
     */
    public RoomStaysType.RoomStay createRoomStaysTypeRoomStay() {
        return new RoomStaysType.RoomStay();
    }

    /**
     * Create an instance of {@link FareCodeOptionType }
     * 
     */
    public FareCodeOptionType createFareCodeOptionType() {
        return new FareCodeOptionType();
    }

    /**
     * Create an instance of {@link ServiceItemNoPriceType }
     * 
     */
    public ServiceItemNoPriceType createServiceItemNoPriceType() {
        return new ServiceItemNoPriceType();
    }

    /**
     * Create an instance of {@link ServiceItemNoPriceType.BookingInstructions }
     * 
     */
    public ServiceItemNoPriceType.BookingInstructions createServiceItemNoPriceTypeBookingInstructions() {
        return new ServiceItemNoPriceType.BookingInstructions();
    }

    /**
     * Create an instance of {@link FareSummaryTypeDEPRECATE }
     * 
     */
    public FareSummaryTypeDEPRECATE createFareSummaryTypeDEPRECATE() {
        return new FareSummaryTypeDEPRECATE();
    }

    /**
     * Create an instance of {@link CabinClassType }
     * 
     */
    public CabinClassType createCabinClassType() {
        return new CabinClassType();
    }

    /**
     * Create an instance of {@link ComboType }
     * 
     */
    public ComboType createComboType() {
        return new ComboType();
    }

    /**
     * Create an instance of {@link FareFiledInType }
     * 
     */
    public FareFiledInType createFareFiledInType() {
        return new FareFiledInType();
    }

    /**
     * Create an instance of {@link AllianceConsortiumType }
     * 
     */
    public AllianceConsortiumType createAllianceConsortiumType() {
        return new AllianceConsortiumType();
    }

    /**
     * Create an instance of {@link StationDetailsType }
     * 
     */
    public StationDetailsType createStationDetailsType() {
        return new StationDetailsType();
    }

    /**
     * Create an instance of {@link ChildAmountType }
     * 
     */
    public ChildAmountType createChildAmountType() {
        return new ChildAmountType();
    }

    /**
     * Create an instance of {@link AncillaryAvailBaggageType }
     * 
     */
    public AncillaryAvailBaggageType createAncillaryAvailBaggageType() {
        return new AncillaryAvailBaggageType();
    }

    /**
     * Create an instance of {@link ViewershipsType }
     * 
     */
    public ViewershipsType createViewershipsType() {
        return new ViewershipsType();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership }
     * 
     */
    public ViewershipsType.Viewership createViewershipsTypeViewership() {
        return new ViewershipsType.Viewership();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.DistributorTypes }
     * 
     */
    public ViewershipsType.Viewership.DistributorTypes createViewershipsTypeViewershipDistributorTypes() {
        return new ViewershipsType.Viewership.DistributorTypes();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.BookingChannelCodes }
     * 
     */
    public ViewershipsType.Viewership.BookingChannelCodes createViewershipsTypeViewershipBookingChannelCodes() {
        return new ViewershipsType.Viewership.BookingChannelCodes();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.LocationCodes }
     * 
     */
    public ViewershipsType.Viewership.LocationCodes createViewershipsTypeViewershipLocationCodes() {
        return new ViewershipsType.Viewership.LocationCodes();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.ProfileTypes }
     * 
     */
    public ViewershipsType.Viewership.ProfileTypes createViewershipsTypeViewershipProfileTypes() {
        return new ViewershipsType.Viewership.ProfileTypes();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.SystemCodes }
     * 
     */
    public ViewershipsType.Viewership.SystemCodes createViewershipsTypeViewershipSystemCodes() {
        return new ViewershipsType.Viewership.SystemCodes();
    }

    /**
     * Create an instance of {@link VerificationPNR }
     * 
     */
    public VerificationPNR createVerificationPNR() {
        return new VerificationPNR();
    }

    /**
     * Create an instance of {@link VerificationPNR.Reshop }
     * 
     */
    public VerificationPNR.Reshop createVerificationPNRReshop() {
        return new VerificationPNR.Reshop();
    }

    /**
     * Create an instance of {@link VerificationPNR.Ticketing }
     * 
     */
    public VerificationPNR.Ticketing createVerificationPNRTicketing() {
        return new VerificationPNR.Ticketing();
    }

    /**
     * Create an instance of {@link VerificationPNR.Products }
     * 
     */
    public VerificationPNR.Products createVerificationPNRProducts() {
        return new VerificationPNR.Products();
    }

    /**
     * Create an instance of {@link VerificationPNR.Products.Product }
     * 
     */
    public VerificationPNR.Products.Product createVerificationPNRProductsProduct() {
        return new VerificationPNR.Products.Product();
    }

    /**
     * Create an instance of {@link VerificationPNR.Primary }
     * 
     */
    public VerificationPNR.Primary createVerificationPNRPrimary() {
        return new VerificationPNR.Primary();
    }

    /**
     * Create an instance of {@link VerificationPNR.Source }
     * 
     */
    public VerificationPNR.Source createVerificationPNRSource() {
        return new VerificationPNR.Source();
    }

    /**
     * Create an instance of {@link VerificationPNR.Source.Locales }
     * 
     */
    public VerificationPNR.Source.Locales createVerificationPNRSourceLocales() {
        return new VerificationPNR.Source.Locales();
    }

    /**
     * Create an instance of {@link VerificationPNR.Refunds }
     * 
     */
    public VerificationPNR.Refunds createVerificationPNRRefunds() {
        return new VerificationPNR.Refunds();
    }

    /**
     * Create an instance of {@link VerificationPNR.Refunds.Refund }
     * 
     */
    public VerificationPNR.Refunds.Refund createVerificationPNRRefundsRefund() {
        return new VerificationPNR.Refunds.Refund();
    }

    /**
     * Create an instance of {@link VerificationPNR.Remarks }
     * 
     */
    public VerificationPNR.Remarks createVerificationPNRRemarks() {
        return new VerificationPNR.Remarks();
    }

    /**
     * Create an instance of {@link VerificationPNR.Coupons }
     * 
     */
    public VerificationPNR.Coupons createVerificationPNRCoupons() {
        return new VerificationPNR.Coupons();
    }

    /**
     * Create an instance of {@link VerificationPNR.Product }
     * 
     */
    public VerificationPNR.Product createVerificationPNRProduct() {
        return new VerificationPNR.Product();
    }

    /**
     * Create an instance of {@link DocumentHandlingType }
     * 
     */
    public DocumentHandlingType createDocumentHandlingType() {
        return new DocumentHandlingType();
    }

    /**
     * Create an instance of {@link LoyaltyProductType }
     * 
     */
    public LoyaltyProductType createLoyaltyProductType() {
        return new LoyaltyProductType();
    }

    /**
     * Create an instance of {@link LoyaltyProductType.Redemption }
     * 
     */
    public LoyaltyProductType.Redemption createLoyaltyProductTypeRedemption() {
        return new LoyaltyProductType.Redemption();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType }
     * 
     */
    public AirAncillaryProductType createAirAncillaryProductType() {
        return new AirAncillaryProductType();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.TravelerInputs }
     * 
     */
    public AirAncillaryProductType.TravelerInputs createAirAncillaryProductTypeTravelerInputs() {
        return new AirAncillaryProductType.TravelerInputs();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.ProductGroups }
     * 
     */
    public AirAncillaryProductType.ProductGroups createAirAncillaryProductTypeProductGroups() {
        return new AirAncillaryProductType.ProductGroups();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.Attributes }
     * 
     */
    public AirAncillaryProductType.Attributes createAirAncillaryProductTypeAttributes() {
        return new AirAncillaryProductType.Attributes();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.ProductDescriptiveContent }
     * 
     */
    public AirAncillaryProductType.ProductDescriptiveContent createAirAncillaryProductTypeProductDescriptiveContent() {
        return new AirAncillaryProductType.ProductDescriptiveContent();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage }
     * 
     */
    public AirAncillaryProductType.ProductDescriptiveContent.Baggage createAirAncillaryProductTypeProductDescriptiveContentBaggage() {
        return new AirAncillaryProductType.ProductDescriptiveContent.Baggage();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions }
     * 
     */
    public AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions createAirAncillaryProductTypeProductDescriptiveContentBaggageMaxDimensions() {
        return new AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.Restrictions }
     * 
     */
    public AirAncillaryProductType.Restrictions createAirAncillaryProductTypeRestrictions() {
        return new AirAncillaryProductType.Restrictions();
    }

    /**
     * Create an instance of {@link PackageResponseType }
     * 
     */
    public PackageResponseType createPackageResponseType() {
        return new PackageResponseType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.PTCs }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.PTCs createPTCs() {
        return new com.airchina.datacenter.spnr.sdk.entity.PTCs();
    }

    /**
     * Create an instance of {@link BookingOfficeType }
     * 
     */
    public BookingOfficeType createBookingOfficeType() {
        return new BookingOfficeType();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Contract }
     * 
     */
    public BookingOfficeType.Contract createBookingOfficeTypeContract() {
        return new BookingOfficeType.Contract();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Contract.PaymentDetails }
     * 
     */
    public BookingOfficeType.Contract.PaymentDetails createBookingOfficeTypeContractPaymentDetails() {
        return new BookingOfficeType.Contract.PaymentDetails();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail }
     * 
     */
    public BookingOfficeType.Contract.PaymentDetails.PaymentDetail createBookingOfficeTypeContractPaymentDetailsPaymentDetail() {
        return new BookingOfficeType.Contract.PaymentDetails.PaymentDetail();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields }
     * 
     */
    public BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields createBookingOfficeTypeContractPaymentDetailsPaymentDetailAgressoExtraFields() {
        return new BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields();
    }

    /**
     * Create an instance of {@link BookingOfficeType.SupplierNotification }
     * 
     */
    public BookingOfficeType.SupplierNotification createBookingOfficeTypeSupplierNotification() {
        return new BookingOfficeType.SupplierNotification();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Contacts }
     * 
     */
    public BookingOfficeType.Contacts createBookingOfficeTypeContacts() {
        return new BookingOfficeType.Contacts();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Names }
     * 
     */
    public BookingOfficeType.Names createBookingOfficeTypeNames() {
        return new BookingOfficeType.Names();
    }

    /**
     * Create an instance of {@link FareQuoteInfoType }
     * 
     */
    public FareQuoteInfoType createFareQuoteInfoType() {
        return new FareQuoteInfoType();
    }

    /**
     * Create an instance of {@link FareQuoteInfoType.Endorsements }
     * 
     */
    public FareQuoteInfoType.Endorsements createFareQuoteInfoTypeEndorsements() {
        return new FareQuoteInfoType.Endorsements();
    }

    /**
     * Create an instance of {@link FareQuoteInfoType.TicketDesignators }
     * 
     */
    public FareQuoteInfoType.TicketDesignators createFareQuoteInfoTypeTicketDesignators() {
        return new FareQuoteInfoType.TicketDesignators();
    }

    /**
     * Create an instance of {@link AirPricedOfferType }
     * 
     */
    public AirPricedOfferType createAirPricedOfferType() {
        return new AirPricedOfferType();
    }

    /**
     * Create an instance of {@link CustomRequestType }
     * 
     */
    public CustomRequestType createCustomRequestType() {
        return new CustomRequestType();
    }

    /**
     * Create an instance of {@link ItineraryReceiptProductType }
     * 
     */
    public ItineraryReceiptProductType createItineraryReceiptProductType() {
        return new ItineraryReceiptProductType();
    }

    /**
     * Create an instance of {@link ItineraryReceiptProductType.ItineraryProduct }
     * 
     */
    public ItineraryReceiptProductType.ItineraryProduct createItineraryReceiptProductTypeItineraryProduct() {
        return new ItineraryReceiptProductType.ItineraryProduct();
    }

    /**
     * Create an instance of {@link ItineraryReceiptProductType.ItineraryProduct.Ticketing }
     * 
     */
    public ItineraryReceiptProductType.ItineraryProduct.Ticketing createItineraryReceiptProductTypeItineraryProductTicketing() {
        return new ItineraryReceiptProductType.ItineraryProduct.Ticketing();
    }

    /**
     * Create an instance of {@link ItineraryReceiptProductType.DeliveryInfo }
     * 
     */
    public ItineraryReceiptProductType.DeliveryInfo createItineraryReceiptProductTypeDeliveryInfo() {
        return new ItineraryReceiptProductType.DeliveryInfo();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link TaxItemType }
     * 
     */
    public TaxItemType createTaxItemType() {
        return new TaxItemType();
    }

    /**
     * Create an instance of {@link RateType }
     * 
     */
    public RateType createRateType() {
        return new RateType();
    }

    /**
     * Create an instance of {@link AccommodationType }
     * 
     */
    public AccommodationType createAccommodationType() {
        return new AccommodationType();
    }

    /**
     * Create an instance of {@link AccommodationType.BerthAvailabilityDetail }
     * 
     */
    public AccommodationType.BerthAvailabilityDetail createAccommodationTypeBerthAvailabilityDetail() {
        return new AccommodationType.BerthAvailabilityDetail();
    }

    /**
     * Create an instance of {@link AccommodationType.BerthAvailabilityDetail.Car }
     * 
     */
    public AccommodationType.BerthAvailabilityDetail.Car createAccommodationTypeBerthAvailabilityDetailCar() {
        return new AccommodationType.BerthAvailabilityDetail.Car();
    }

    /**
     * Create an instance of {@link AccommodationType.BerthAvailabilityDetail.Car.Compartment }
     * 
     */
    public AccommodationType.BerthAvailabilityDetail.Car.Compartment createAccommodationTypeBerthAvailabilityDetailCarCompartment() {
        return new AccommodationType.BerthAvailabilityDetail.Car.Compartment();
    }

    /**
     * Create an instance of {@link AccommodationType.SeatAvailabilityDetail }
     * 
     */
    public AccommodationType.SeatAvailabilityDetail createAccommodationTypeSeatAvailabilityDetail() {
        return new AccommodationType.SeatAvailabilityDetail();
    }

    /**
     * Create an instance of {@link AccommodationType.SeatAvailabilityDetail.Car }
     * 
     */
    public AccommodationType.SeatAvailabilityDetail.Car createAccommodationTypeSeatAvailabilityDetailCar() {
        return new AccommodationType.SeatAvailabilityDetail.Car();
    }

    /**
     * Create an instance of {@link AccommodationType.SeatAvailabilityDetail.Car.Compartment }
     * 
     */
    public AccommodationType.SeatAvailabilityDetail.Car.Compartment createAccommodationTypeSeatAvailabilityDetailCarCompartment() {
        return new AccommodationType.SeatAvailabilityDetail.Car.Compartment();
    }

    /**
     * Create an instance of {@link ContactsType }
     * 
     */
    public ContactsType createContactsType() {
        return new ContactsType();
    }

    /**
     * Create an instance of {@link ContactsType.Name }
     * 
     */
    public ContactsType.Name createContactsTypeName() {
        return new ContactsType.Name();
    }

    /**
     * Create an instance of {@link RequestedLocationType }
     * 
     */
    public RequestedLocationType createRequestedLocationType() {
        return new RequestedLocationType();
    }

    /**
     * Create an instance of {@link PermissionsType }
     * 
     */
    public PermissionsType createPermissionsType() {
        return new PermissionsType();
    }

    /**
     * Create an instance of {@link GroundTransportServiceCriteriaType }
     * 
     */
    public GroundTransportServiceCriteriaType createGroundTransportServiceCriteriaType() {
        return new GroundTransportServiceCriteriaType();
    }

    /**
     * Create an instance of {@link ResGuestsType }
     * 
     */
    public ResGuestsType createResGuestsType() {
        return new ResGuestsType();
    }

    /**
     * Create an instance of {@link ResGuestsType.ResGuest }
     * 
     */
    public ResGuestsType.ResGuest createResGuestsTypeResGuest() {
        return new ResGuestsType.ResGuest();
    }

    /**
     * Create an instance of {@link ResGuestsType.ResGuest.ProfileRPHs }
     * 
     */
    public ResGuestsType.ResGuest.ProfileRPHs createResGuestsTypeResGuestProfileRPHs() {
        return new ResGuestsType.ResGuest.ProfileRPHs();
    }

    /**
     * Create an instance of {@link OtherPaymentForm }
     * 
     */
    public OtherPaymentForm createOtherPaymentForm() {
        return new OtherPaymentForm();
    }

    /**
     * Create an instance of {@link AirArrangerType }
     * 
     */
    public AirArrangerType createAirArrangerType() {
        return new AirArrangerType();
    }

    /**
     * Create an instance of {@link AddQueryInfoType }
     * 
     */
    public AddQueryInfoType createAddQueryInfoType() {
        return new AddQueryInfoType();
    }

    /**
     * Create an instance of {@link AddQueryInfoType.Brands }
     * 
     */
    public AddQueryInfoType.Brands createAddQueryInfoTypeBrands() {
        return new AddQueryInfoType.Brands();
    }

    /**
     * Create an instance of {@link AddQueryInfoType.Cabins }
     * 
     */
    public AddQueryInfoType.Cabins createAddQueryInfoTypeCabins() {
        return new AddQueryInfoType.Cabins();
    }

    /**
     * Create an instance of {@link AddQueryInfoType.Banks }
     * 
     */
    public AddQueryInfoType.Banks createAddQueryInfoTypeBanks() {
        return new AddQueryInfoType.Banks();
    }

    /**
     * Create an instance of {@link AcceptablePaymentCardsInfoType }
     * 
     */
    public AcceptablePaymentCardsInfoType createAcceptablePaymentCardsInfoType() {
        return new AcceptablePaymentCardsInfoType();
    }

    /**
     * Create an instance of {@link AcceptablePaymentCardsInfoType.AcceptablePaymentCards }
     * 
     */
    public AcceptablePaymentCardsInfoType.AcceptablePaymentCards createAcceptablePaymentCardsInfoTypeAcceptablePaymentCards() {
        return new AcceptablePaymentCardsInfoType.AcceptablePaymentCards();
    }

    /**
     * Create an instance of {@link TextItemsType }
     * 
     */
    public TextItemsType createTextItemsType() {
        return new TextItemsType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ContactInfo }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ContactInfo createContactInfo() {
        return new com.airchina.datacenter.spnr.sdk.entity.ContactInfo();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Contacts }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Contacts createContactInfoContacts() {
        return new com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Contacts();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Names }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Names createContactInfoNames() {
        return new com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Names();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Addresses }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Addresses createContactInfoAddresses() {
        return new com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Addresses();
    }

    /**
     * Create an instance of {@link FareInfoEndorsementType }
     * 
     */
    public FareInfoEndorsementType createFareInfoEndorsementType() {
        return new FareInfoEndorsementType();
    }

    /**
     * Create an instance of {@link AvailablePlansType }
     * 
     */
    public AvailablePlansType createAvailablePlansType() {
        return new AvailablePlansType();
    }

    /**
     * Create an instance of {@link AvailablePlansType.AvailablePlan }
     * 
     */
    public AvailablePlansType.AvailablePlan createAvailablePlansTypeAvailablePlan() {
        return new AvailablePlansType.AvailablePlan();
    }

    /**
     * Create an instance of {@link CustomResponseType }
     * 
     */
    public CustomResponseType createCustomResponseType() {
        return new CustomResponseType();
    }

    /**
     * Create an instance of {@link ProfileVerificationType }
     * 
     */
    public ProfileVerificationType createProfileVerificationType() {
        return new ProfileVerificationType();
    }

    /**
     * Create an instance of {@link OptionListType }
     * 
     */
    public OptionListType createOptionListType() {
        return new OptionListType();
    }

    /**
     * Create an instance of {@link OptionListType.ListItem }
     * 
     */
    public OptionListType.ListItem createOptionListTypeListItem() {
        return new OptionListType.ListItem();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType }
     * 
     */
    public HotelDescriptiveContentType createHotelDescriptiveContentType() {
        return new HotelDescriptiveContentType();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType.EffectivePeriods }
     * 
     */
    public HotelDescriptiveContentType.EffectivePeriods createHotelDescriptiveContentTypeEffectivePeriods() {
        return new HotelDescriptiveContentType.EffectivePeriods();
    }

    /**
     * Create an instance of {@link PlanForBookRQType }
     * 
     */
    public PlanForBookRQType createPlanForBookRQType() {
        return new PlanForBookRQType();
    }

    /**
     * Create an instance of {@link PlanForBookRQType.OJTExtensions }
     * 
     */
    public PlanForBookRQType.OJTExtensions createPlanForBookRQTypeOJTExtensions() {
        return new PlanForBookRQType.OJTExtensions();
    }

    /**
     * Create an instance of {@link ResGuestRPHsType }
     * 
     */
    public ResGuestRPHsType createResGuestRPHsType() {
        return new ResGuestRPHsType();
    }

    /**
     * Create an instance of {@link OJCancelPenaltiesType }
     * 
     */
    public OJCancelPenaltiesType createOJCancelPenaltiesType() {
        return new OJCancelPenaltiesType();
    }

    /**
     * Create an instance of {@link InsCoverageDetailType }
     * 
     */
    public InsCoverageDetailType createInsCoverageDetailType() {
        return new InsCoverageDetailType();
    }

    /**
     * Create an instance of {@link InsCoverageDetailType.CoveredTrips }
     * 
     */
    public InsCoverageDetailType.CoveredTrips createInsCoverageDetailTypeCoveredTrips() {
        return new InsCoverageDetailType.CoveredTrips();
    }

    /**
     * Create an instance of {@link QuotationType }
     * 
     */
    public QuotationType createQuotationType() {
        return new QuotationType();
    }

    /**
     * Create an instance of {@link PurchaseInfoType }
     * 
     */
    public PurchaseInfoType createPurchaseInfoType() {
        return new PurchaseInfoType();
    }

    /**
     * Create an instance of {@link PurchaseInfoType.Ranges }
     * 
     */
    public PurchaseInfoType.Ranges createPurchaseInfoTypeRanges() {
        return new PurchaseInfoType.Ranges();
    }

    /**
     * Create an instance of {@link PurchaseInfoType.Ranges.Range }
     * 
     */
    public PurchaseInfoType.Ranges.Range createPurchaseInfoTypeRangesRange() {
        return new PurchaseInfoType.Ranges.Range();
    }

    /**
     * Create an instance of {@link ItineraryInfoType }
     * 
     */
    public ItineraryInfoType createItineraryInfoType() {
        return new ItineraryInfoType();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType }
     * 
     */
    public AirSearchPrefsType createAirSearchPrefsType() {
        return new AirSearchPrefsType();
    }

    /**
     * Create an instance of {@link PromotionProfileType }
     * 
     */
    public PromotionProfileType createPromotionProfileType() {
        return new PromotionProfileType();
    }

    /**
     * Create an instance of {@link VehicleAvailAdditionalInfoType }
     * 
     */
    public VehicleAvailAdditionalInfoType createVehicleAvailAdditionalInfoType() {
        return new VehicleAvailAdditionalInfoType();
    }

    /**
     * Create an instance of {@link PlanForQuoteRSType }
     * 
     */
    public PlanForQuoteRSType createPlanForQuoteRSType() {
        return new PlanForQuoteRSType();
    }

    /**
     * Create an instance of {@link PlanForQuoteRSType.PlanCost }
     * 
     */
    public PlanForQuoteRSType.PlanCost createPlanForQuoteRSTypePlanCost() {
        return new PlanForQuoteRSType.PlanCost();
    }

    /**
     * Create an instance of {@link PlanForQuoteRSType.PlanCost.IncrementalPrices }
     * 
     */
    public PlanForQuoteRSType.PlanCost.IncrementalPrices createPlanForQuoteRSTypePlanCostIncrementalPrices() {
        return new PlanForQuoteRSType.PlanCost.IncrementalPrices();
    }

    /**
     * Create an instance of {@link RailAmenityType }
     * 
     */
    public RailAmenityType createRailAmenityType() {
        return new RailAmenityType();
    }

    /**
     * Create an instance of {@link RailOriginDestinationInformationType }
     * 
     */
    public RailOriginDestinationInformationType createRailOriginDestinationInformationType() {
        return new RailOriginDestinationInformationType();
    }

    /**
     * Create an instance of {@link PromotionProfilesType }
     * 
     */
    public PromotionProfilesType createPromotionProfilesType() {
        return new PromotionProfilesType();
    }

    /**
     * Create an instance of {@link DestActivityItemsType }
     * 
     */
    public DestActivityItemsType createDestActivityItemsType() {
        return new DestActivityItemsType();
    }

    /**
     * Create an instance of {@link LoyaltyDetailType }
     * 
     */
    public LoyaltyDetailType createLoyaltyDetailType() {
        return new LoyaltyDetailType();
    }

    /**
     * Create an instance of {@link ConnectionType }
     * 
     */
    public ConnectionType createConnectionType() {
        return new ConnectionType();
    }

    /**
     * Create an instance of {@link TravelClubType }
     * 
     */
    public TravelClubType createTravelClubType() {
        return new TravelClubType();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link CompanyInfoType }
     * 
     */
    public CompanyInfoType createCompanyInfoType() {
        return new CompanyInfoType();
    }

    /**
     * Create an instance of {@link ServicesType }
     * 
     */
    public ServicesType createServicesType() {
        return new ServicesType();
    }

    /**
     * Create an instance of {@link MoreDataEchoTokensType }
     * 
     */
    public MoreDataEchoTokensType createMoreDataEchoTokensType() {
        return new MoreDataEchoTokensType();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType }
     * 
     */
    public TicketingFullInfoType createTicketingFullInfoType() {
        return new TicketingFullInfoType();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.PaymentInfo }
     * 
     */
    public TicketingFullInfoType.PaymentInfo createTicketingFullInfoTypePaymentInfo() {
        return new TicketingFullInfoType.PaymentInfo();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.Endorsements }
     * 
     */
    public TicketingFullInfoType.Endorsements createTicketingFullInfoTypeEndorsements() {
        return new TicketingFullInfoType.Endorsements();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.PassengerInfo }
     * 
     */
    public TicketingFullInfoType.PassengerInfo createTicketingFullInfoTypePassengerInfo() {
        return new TicketingFullInfoType.PassengerInfo();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.FlightInfo }
     * 
     */
    public TicketingFullInfoType.FlightInfo createTicketingFullInfoTypeFlightInfo() {
        return new TicketingFullInfoType.FlightInfo();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.FlightInfo.BookingInfo }
     * 
     */
    public TicketingFullInfoType.FlightInfo.BookingInfo createTicketingFullInfoTypeFlightInfoBookingInfo() {
        return new TicketingFullInfoType.FlightInfo.BookingInfo();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.FlightInfo.ServiceDetails }
     * 
     */
    public TicketingFullInfoType.FlightInfo.ServiceDetails createTicketingFullInfoTypeFlightInfoServiceDetails() {
        return new TicketingFullInfoType.FlightInfo.ServiceDetails();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.ConjunctiveTicketNbr }
     * 
     */
    public TicketingFullInfoType.ConjunctiveTicketNbr createTicketingFullInfoTypeConjunctiveTicketNbr() {
        return new TicketingFullInfoType.ConjunctiveTicketNbr();
    }

    /**
     * Create an instance of {@link RatePlanUserTypeRestrictions }
     * 
     */
    public RatePlanUserTypeRestrictions createRatePlanUserTypeRestrictions() {
        return new RatePlanUserTypeRestrictions();
    }

    /**
     * Create an instance of {@link FlightAmenitiesType }
     * 
     */
    public FlightAmenitiesType createFlightAmenitiesType() {
        return new FlightAmenitiesType();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType }
     * 
     */
    public VehicleAgeRequirementsType createVehicleAgeRequirementsType() {
        return new VehicleAgeRequirementsType();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType.Age }
     * 
     */
    public VehicleAgeRequirementsType.Age createVehicleAgeRequirementsTypeAge() {
        return new VehicleAgeRequirementsType.Age();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType.Age.Vehicles }
     * 
     */
    public VehicleAgeRequirementsType.Age.Vehicles createVehicleAgeRequirementsTypeAgeVehicles() {
        return new VehicleAgeRequirementsType.Age.Vehicles();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType.Age.AgeInfos }
     * 
     */
    public VehicleAgeRequirementsType.Age.AgeInfos createVehicleAgeRequirementsTypeAgeAgeInfos() {
        return new VehicleAgeRequirementsType.Age.AgeInfos();
    }

    /**
     * Create an instance of {@link BaseInvCountType }
     * 
     */
    public BaseInvCountType createBaseInvCountType() {
        return new BaseInvCountType();
    }

    /**
     * Create an instance of {@link BaseInvCountType.InvCounts }
     * 
     */
    public BaseInvCountType.InvCounts createBaseInvCountTypeInvCounts() {
        return new BaseInvCountType.InvCounts();
    }

    /**
     * Create an instance of {@link BaseInvCountType.InvCounts.InvCount }
     * 
     */
    public BaseInvCountType.InvCounts.InvCount createBaseInvCountTypeInvCountsInvCount() {
        return new BaseInvCountType.InvCounts.InvCount();
    }

    /**
     * Create an instance of {@link TagsType }
     * 
     */
    public TagsType createTagsType() {
        return new TagsType();
    }

    /**
     * Create an instance of {@link OntologyDimensionType }
     * 
     */
    public OntologyDimensionType createOntologyDimensionType() {
        return new OntologyDimensionType();
    }

    /**
     * Create an instance of {@link AuthorizationType }
     * 
     */
    public AuthorizationType createAuthorizationType() {
        return new AuthorizationType();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType }
     * 
     */
    public VehicleProfileRentalPrefType createVehicleProfileRentalPrefType() {
        return new VehicleProfileRentalPrefType();
    }

    /**
     * Create an instance of {@link PricedItineraryExtendType }
     * 
     */
    public PricedItineraryExtendType createPricedItineraryExtendType() {
        return new PricedItineraryExtendType();
    }

    /**
     * Create an instance of {@link ReferenceDataType }
     * 
     */
    public ReferenceDataType createReferenceDataType() {
        return new ReferenceDataType();
    }

    /**
     * Create an instance of {@link AirSearchCriteriaType }
     * 
     */
    public AirSearchCriteriaType createAirSearchCriteriaType() {
        return new AirSearchCriteriaType();
    }

    /**
     * Create an instance of {@link FerryInvoiceDetail }
     * 
     */
    public FerryInvoiceDetail createFerryInvoiceDetail() {
        return new FerryInvoiceDetail();
    }

    /**
     * Create an instance of {@link FerryInvoiceDetail.CostingItems }
     * 
     */
    public FerryInvoiceDetail.CostingItems createFerryInvoiceDetailCostingItems() {
        return new FerryInvoiceDetail.CostingItems();
    }

    /**
     * Create an instance of {@link FulfillmentType }
     * 
     */
    public FulfillmentType createFulfillmentType() {
        return new FulfillmentType();
    }

    /**
     * Create an instance of {@link SpecialType }
     * 
     */
    public SpecialType createSpecialType() {
        return new SpecialType();
    }

    /**
     * Create an instance of {@link SpecialType.Special }
     * 
     */
    public SpecialType.Special createSpecialTypeSpecial() {
        return new SpecialType.Special();
    }

    /**
     * Create an instance of {@link OntologyOfferType }
     * 
     */
    public OntologyOfferType createOntologyOfferType() {
        return new OntologyOfferType();
    }

    /**
     * Create an instance of {@link OptionListInputType }
     * 
     */
    public OptionListInputType createOptionListInputType() {
        return new OptionListInputType();
    }

    /**
     * Create an instance of {@link BookedTrainSegmentType }
     * 
     */
    public BookedTrainSegmentType createBookedTrainSegmentType() {
        return new BookedTrainSegmentType();
    }

    /**
     * Create an instance of {@link AccommodationServiceType }
     * 
     */
    public AccommodationServiceType createAccommodationServiceType() {
        return new AccommodationServiceType();
    }

    /**
     * Create an instance of {@link FlightRefInfoType }
     * 
     */
    public FlightRefInfoType createFlightRefInfoType() {
        return new FlightRefInfoType();
    }

    /**
     * Create an instance of {@link SpecialSrvcType }
     * 
     */
    public SpecialSrvcType createSpecialSrvcType() {
        return new SpecialSrvcType();
    }

    /**
     * Create an instance of {@link ServicesFilterType }
     * 
     */
    public ServicesFilterType createServicesFilterType() {
        return new ServicesFilterType();
    }

    /**
     * Create an instance of {@link ServicesFilterType.Attributes }
     * 
     */
    public ServicesFilterType.Attributes createServicesFilterTypeAttributes() {
        return new ServicesFilterType.Attributes();
    }

    /**
     * Create an instance of {@link DeliItineraryStatusType }
     * 
     */
    public DeliItineraryStatusType createDeliItineraryStatusType() {
        return new DeliItineraryStatusType();
    }

    /**
     * Create an instance of {@link AssociatedBookingsType }
     * 
     */
    public AssociatedBookingsType createAssociatedBookingsType() {
        return new AssociatedBookingsType();
    }

    /**
     * Create an instance of {@link AssociatedBookingsType.Booking }
     * 
     */
    public AssociatedBookingsType.Booking createAssociatedBookingsTypeBooking() {
        return new AssociatedBookingsType.Booking();
    }

    /**
     * Create an instance of {@link AssociatedBookingsType.Booking.Customer }
     * 
     */
    public AssociatedBookingsType.Booking.Customer createAssociatedBookingsTypeBookingCustomer() {
        return new AssociatedBookingsType.Booking.Customer();
    }

    /**
     * Create an instance of {@link AssociatedBookingsType.Booking.Customer.Primary }
     * 
     */
    public AssociatedBookingsType.Booking.Customer.Primary createAssociatedBookingsTypeBookingCustomerPrimary() {
        return new AssociatedBookingsType.Booking.Customer.Primary();
    }

    /**
     * Create an instance of {@link SuperPNRType.CrossRefs }
     * 
     */
    public SuperPNRType.CrossRefs createSuperPNRTypeCrossRefs() {
        return new SuperPNRType.CrossRefs();
    }

    /**
     * Create an instance of {@link SuperPNRType.Attachments }
     * 
     */
    public SuperPNRType.Attachments createSuperPNRTypeAttachments() {
        return new SuperPNRType.Attachments();
    }

    /**
     * Create an instance of {@link SuperPNRType.BackendAudits }
     * 
     */
    public SuperPNRType.BackendAudits createSuperPNRTypeBackendAudits() {
        return new SuperPNRType.BackendAudits();
    }

    /**
     * Create an instance of {@link OJCustomerPrimaryAdditionalType }
     * 
     */
    public OJCustomerPrimaryAdditionalType createOJCustomerPrimaryAdditionalType() {
        return new OJCustomerPrimaryAdditionalType();
    }

    /**
     * Create an instance of {@link OJCustomerPrimaryAdditionalType.Primary }
     * 
     */
    public OJCustomerPrimaryAdditionalType.Primary createOJCustomerPrimaryAdditionalTypePrimary() {
        return new OJCustomerPrimaryAdditionalType.Primary();
    }

    /**
     * Create an instance of {@link SuperPNRType.Queues }
     * 
     */
    public SuperPNRType.Queues createSuperPNRTypeQueues() {
        return new SuperPNRType.Queues();
    }

    /**
     * Create an instance of {@link PaymentDetailsType }
     * 
     */
    public PaymentDetailsType createPaymentDetailsType() {
        return new PaymentDetailsType();
    }

    /**
     * Create an instance of {@link OJAmendPenaltiesType }
     * 
     */
    public OJAmendPenaltiesType createOJAmendPenaltiesType() {
        return new OJAmendPenaltiesType();
    }

    /**
     * Create an instance of {@link ProductPricingType }
     * 
     */
    public ProductPricingType createProductPricingType() {
        return new ProductPricingType();
    }

    /**
     * Create an instance of {@link ModularProductType }
     * 
     */
    public ModularProductType createModularProductType() {
        return new ModularProductType();
    }

    /**
     * Create an instance of {@link ModularProductType.CrossRefs }
     * 
     */
    public ModularProductType.CrossRefs createModularProductTypeCrossRefs() {
        return new ModularProductType.CrossRefs();
    }

    /**
     * Create an instance of {@link ModularProductType.PaymentRefs }
     * 
     */
    public ModularProductType.PaymentRefs createModularProductTypePaymentRefs() {
        return new ModularProductType.PaymentRefs();
    }

    /**
     * Create an instance of {@link XPromotionType }
     * 
     */
    public XPromotionType createXPromotionType() {
        return new XPromotionType();
    }

    /**
     * Create an instance of {@link XPromotionType.Search }
     * 
     */
    public XPromotionType.Search createXPromotionTypeSearch() {
        return new XPromotionType.Search();
    }

    /**
     * Create an instance of {@link ServiceCombineType }
     * 
     */
    public ServiceCombineType createServiceCombineType() {
        return new ServiceCombineType();
    }

    /**
     * Create an instance of {@link ServiceRefInfoType }
     * 
     */
    public ServiceRefInfoType createServiceRefInfoType() {
        return new ServiceRefInfoType();
    }

    /**
     * Create an instance of {@link ServiceBundleNoPriceRefType }
     * 
     */
    public ServiceBundleNoPriceRefType createServiceBundleNoPriceRefType() {
        return new ServiceBundleNoPriceRefType();
    }

    /**
     * Create an instance of {@link ServiceBundleNoPriceRefType.Item }
     * 
     */
    public ServiceBundleNoPriceRefType.Item createServiceBundleNoPriceRefTypeItem() {
        return new ServiceBundleNoPriceRefType.Item();
    }

    /**
     * Create an instance of {@link ServiceBundleNoPriceRefType.Item.ItemDetail }
     * 
     */
    public ServiceBundleNoPriceRefType.Item.ItemDetail createServiceBundleNoPriceRefTypeItemItemDetail() {
        return new ServiceBundleNoPriceRefType.Item.ItemDetail();
    }

    /**
     * Create an instance of {@link ServiceBundleNoPriceRefType.Item.ItemDetail.BookingInstructions }
     * 
     */
    public ServiceBundleNoPriceRefType.Item.ItemDetail.BookingInstructions createServiceBundleNoPriceRefTypeItemItemDetailBookingInstructions() {
        return new ServiceBundleNoPriceRefType.Item.ItemDetail.BookingInstructions();
    }

    /**
     * Create an instance of {@link TaxConfiguration.TaxPolicies }
     * 
     */
    public TaxConfiguration.TaxPolicies createTaxConfigurationTaxPolicies() {
        return new TaxConfiguration.TaxPolicies();
    }

    /**
     * Create an instance of {@link ComponentType }
     * 
     */
    public ComponentType createComponentType() {
        return new ComponentType();
    }

    /**
     * Create an instance of {@link ComponentType.Marketing }
     * 
     */
    public ComponentType.Marketing createComponentTypeMarketing() {
        return new ComponentType.Marketing();
    }

    /**
     * Create an instance of {@link ComponentType.Location }
     * 
     */
    public ComponentType.Location createComponentTypeLocation() {
        return new ComponentType.Location();
    }

    /**
     * Create an instance of {@link ComponentType.Location.Space }
     * 
     */
    public ComponentType.Location.Space createComponentTypeLocationSpace() {
        return new ComponentType.Location.Space();
    }

    /**
     * Create an instance of {@link ComponentType.Dimensions }
     * 
     */
    public ComponentType.Dimensions createComponentTypeDimensions() {
        return new ComponentType.Dimensions();
    }

    /**
     * Create an instance of {@link ServicePriceType.ServicePriceCalculation }
     * 
     */
    public ServicePriceType.ServicePriceCalculation createServicePriceTypeServicePriceCalculation() {
        return new ServicePriceType.ServicePriceCalculation();
    }

    /**
     * Create an instance of {@link ServicePriceType.ServicePriceCalculation.Operation }
     * 
     */
    public ServicePriceType.ServicePriceCalculation.Operation createServicePriceTypeServicePriceCalculationOperation() {
        return new ServicePriceType.ServicePriceCalculation.Operation();
    }

    /**
     * Create an instance of {@link RedemptionType }
     * 
     */
    public RedemptionType createRedemptionType() {
        return new RedemptionType();
    }

    /**
     * Create an instance of {@link RedemptionType.Transactions }
     * 
     */
    public RedemptionType.Transactions createRedemptionTypeTransactions() {
        return new RedemptionType.Transactions();
    }

    /**
     * Create an instance of {@link RedemptionType.Transactions.Transaction }
     * 
     */
    public RedemptionType.Transactions.Transaction createRedemptionTypeTransactionsTransaction() {
        return new RedemptionType.Transactions.Transaction();
    }

    /**
     * Create an instance of {@link RedemptionType.Accruals }
     * 
     */
    public RedemptionType.Accruals createRedemptionTypeAccruals() {
        return new RedemptionType.Accruals();
    }

    /**
     * Create an instance of {@link ExemptTaxType }
     * 
     */
    public ExemptTaxType createExemptTaxType() {
        return new ExemptTaxType();
    }

    /**
     * Create an instance of {@link ExemptTaxType.Tax }
     * 
     */
    public ExemptTaxType.Tax createExemptTaxTypeTax() {
        return new ExemptTaxType.Tax();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.RatePlans.RatePlan }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.RatePlans.RatePlan createRatePlansRatePlan() {
        return new com.airchina.datacenter.spnr.sdk.entity.RatePlans.RatePlan();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.RatePlans.RatePlan.InvCounts }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.RatePlans.RatePlan.InvCounts createRatePlansRatePlanInvCounts() {
        return new com.airchina.datacenter.spnr.sdk.entity.RatePlans.RatePlan.InvCounts();
    }

    /**
     * Create an instance of {@link DerivationType }
     * 
     */
    public DerivationType createDerivationType() {
        return new DerivationType();
    }

    /**
     * Create an instance of {@link DerivationType.Certificate }
     * 
     */
    public DerivationType.Certificate createDerivationTypeCertificate() {
        return new DerivationType.Certificate();
    }

    /**
     * Create an instance of {@link MediaContentType }
     * 
     */
    public MediaContentType createMediaContentType() {
        return new MediaContentType();
    }

    /**
     * Create an instance of {@link MediaContentType.MediaLinks }
     * 
     */
    public MediaContentType.MediaLinks createMediaContentTypeMediaLinks() {
        return new MediaContentType.MediaLinks();
    }

    /**
     * Create an instance of {@link MediaContentType.Images }
     * 
     */
    public MediaContentType.Images createMediaContentTypeImages() {
        return new MediaContentType.Images();
    }

    /**
     * Create an instance of {@link MultimediaObjectsType }
     * 
     */
    public MultimediaObjectsType createMultimediaObjectsType() {
        return new MultimediaObjectsType();
    }

    /**
     * Create an instance of {@link MultimediaObjectsType.MultimediaObject }
     * 
     */
    public MultimediaObjectsType.MultimediaObject createMultimediaObjectsTypeMultimediaObject() {
        return new MultimediaObjectsType.MultimediaObject();
    }

    /**
     * Create an instance of {@link MultimediaObjectsType.MultimediaObject.ImageItems }
     * 
     */
    public MultimediaObjectsType.MultimediaObject.ImageItems createMultimediaObjectsTypeMultimediaObjectImageItems() {
        return new MultimediaObjectsType.MultimediaObject.ImageItems();
    }

    /**
     * Create an instance of {@link MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem }
     * 
     */
    public MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem createMultimediaObjectsTypeMultimediaObjectImageItemsImageItem() {
        return new MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem();
    }

    /**
     * Create an instance of {@link PTCsFromDestActivityCommonTypes }
     * 
     */
    public PTCsFromDestActivityCommonTypes createPTCsFromDestActivityCommonTypes() {
        return new PTCsFromDestActivityCommonTypes();
    }

    /**
     * Create an instance of {@link SearchType }
     * 
     */
    public SearchType createSearchType() {
        return new SearchType();
    }

    /**
     * Create an instance of {@link SearchType.Passengers }
     * 
     */
    public SearchType.Passengers createSearchTypePassengers() {
        return new SearchType.Passengers();
    }

    /**
     * Create an instance of {@link SearchType.OriginDestinationInformation }
     * 
     */
    public SearchType.OriginDestinationInformation createSearchTypeOriginDestinationInformation() {
        return new SearchType.OriginDestinationInformation();
    }

    /**
     * Create an instance of {@link SearchType.OriginDestinationInformation.FlightDetails }
     * 
     */
    public SearchType.OriginDestinationInformation.FlightDetails createSearchTypeOriginDestinationInformationFlightDetails() {
        return new SearchType.OriginDestinationInformation.FlightDetails();
    }

    /**
     * Create an instance of {@link SearchType.HotelInformation }
     * 
     */
    public SearchType.HotelInformation createSearchTypeHotelInformation() {
        return new SearchType.HotelInformation();
    }

    /**
     * Create an instance of {@link SearchType.HotelInformation.RoomInformation }
     * 
     */
    public SearchType.HotelInformation.RoomInformation createSearchTypeHotelInformationRoomInformation() {
        return new SearchType.HotelInformation.RoomInformation();
    }

    /**
     * Create an instance of {@link JourneyControlType }
     * 
     */
    public JourneyControlType createJourneyControlType() {
        return new JourneyControlType();
    }

    /**
     * Create an instance of {@link JourneyControlType.JCDFlight }
     * 
     */
    public JourneyControlType.JCDFlight createJourneyControlTypeJCDFlight() {
        return new JourneyControlType.JCDFlight();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentsType }
     * 
     */
    public DestActivityDescriptiveContentsType createDestActivityDescriptiveContentsType() {
        return new DestActivityDescriptiveContentsType();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentsType.DestActivityDescriptiveContent }
     * 
     */
    public DestActivityDescriptiveContentsType.DestActivityDescriptiveContent createDestActivityDescriptiveContentsTypeDestActivityDescriptiveContent() {
        return new DestActivityDescriptiveContentsType.DestActivityDescriptiveContent();
    }

    /**
     * Create an instance of {@link CorporateHierarchiesType }
     * 
     */
    public CorporateHierarchiesType createCorporateHierarchiesType() {
        return new CorporateHierarchiesType();
    }

    /**
     * Create an instance of {@link FreqGuestNumberType }
     * 
     */
    public FreqGuestNumberType createFreqGuestNumberType() {
        return new FreqGuestNumberType();
    }

    /**
     * Create an instance of {@link ServiceIncentiveDataType }
     * 
     */
    public ServiceIncentiveDataType createServiceIncentiveDataType() {
        return new ServiceIncentiveDataType();
    }

    /**
     * Create an instance of {@link ServiceIncentiveDataType.Offer }
     * 
     */
    public ServiceIncentiveDataType.Offer createServiceIncentiveDataTypeOffer() {
        return new ServiceIncentiveDataType.Offer();
    }

    /**
     * Create an instance of {@link SeatDataType }
     * 
     */
    public SeatDataType createSeatDataType() {
        return new SeatDataType();
    }

    /**
     * Create an instance of {@link SeatDataType.Marketing }
     * 
     */
    public SeatDataType.Marketing createSeatDataTypeMarketing() {
        return new SeatDataType.Marketing();
    }

    /**
     * Create an instance of {@link SaleInfoType }
     * 
     */
    public SaleInfoType createSaleInfoType() {
        return new SaleInfoType();
    }

    /**
     * Create an instance of {@link SaleInfoType.Identification }
     * 
     */
    public SaleInfoType.Identification createSaleInfoTypeIdentification() {
        return new SaleInfoType.Identification();
    }

    /**
     * Create an instance of {@link SaleInfoType.Identification.RequestorInfo }
     * 
     */
    public SaleInfoType.Identification.RequestorInfo createSaleInfoTypeIdentificationRequestorInfo() {
        return new SaleInfoType.Identification.RequestorInfo();
    }

    /**
     * Create an instance of {@link CommissionType }
     * 
     */
    public CommissionType createCommissionType() {
        return new CommissionType();
    }

    /**
     * Create an instance of {@link AttributesType }
     * 
     */
    public AttributesType createAttributesType() {
        return new AttributesType();
    }

    /**
     * Create an instance of {@link DestActivityDescriptions.Renovation }
     * 
     */
    public DestActivityDescriptions.Renovation createDestActivityDescriptionsRenovation() {
        return new DestActivityDescriptions.Renovation();
    }

    /**
     * Create an instance of {@link AccommodationCategoryType }
     * 
     */
    public AccommodationCategoryType createAccommodationCategoryType() {
        return new AccommodationCategoryType();
    }

    /**
     * Create an instance of {@link AvailabilityRates.SellingRestrictions }
     * 
     */
    public AvailabilityRates.SellingRestrictions createAvailabilityRatesSellingRestrictions() {
        return new AvailabilityRates.SellingRestrictions();
    }

    /**
     * Create an instance of {@link AvailabilityRates.SellingRestrictions.DistributionChannels }
     * 
     */
    public AvailabilityRates.SellingRestrictions.DistributionChannels createAvailabilityRatesSellingRestrictionsDistributionChannels() {
        return new AvailabilityRates.SellingRestrictions.DistributionChannels();
    }

    /**
     * Create an instance of {@link AvailabilityRates.SellingRestrictions.Regions }
     * 
     */
    public AvailabilityRates.SellingRestrictions.Regions createAvailabilityRatesSellingRestrictionsRegions() {
        return new AvailabilityRates.SellingRestrictions.Regions();
    }

    /**
     * Create an instance of {@link AvailabilityRates.SellingRestrictions.CustomerTypes }
     * 
     */
    public AvailabilityRates.SellingRestrictions.CustomerTypes createAvailabilityRatesSellingRestrictionsCustomerTypes() {
        return new AvailabilityRates.SellingRestrictions.CustomerTypes();
    }

    /**
     * Create an instance of {@link AvailabilityRates.Releases }
     * 
     */
    public AvailabilityRates.Releases createAvailabilityRatesReleases() {
        return new AvailabilityRates.Releases();
    }

    /**
     * Create an instance of {@link AvailabilityRates.StatusApplicationBlackOutDates }
     * 
     */
    public AvailabilityRates.StatusApplicationBlackOutDates createAvailabilityRatesStatusApplicationBlackOutDates() {
        return new AvailabilityRates.StatusApplicationBlackOutDates();
    }

    /**
     * Create an instance of {@link AllRates.QuantityOptions }
     * 
     */
    public AllRates.QuantityOptions createAllRatesQuantityOptions() {
        return new AllRates.QuantityOptions();
    }

    /**
     * Create an instance of {@link ExPriceAdjustmentsType }
     * 
     */
    public ExPriceAdjustmentsType createExPriceAdjustmentsType() {
        return new ExPriceAdjustmentsType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Rates.Rate }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Rates.Rate createRatesRate() {
        return new com.airchina.datacenter.spnr.sdk.entity.Rates.Rate();
    }

    /**
     * Create an instance of {@link AutoExchangeType }
     * 
     */
    public AutoExchangeType createAutoExchangeType() {
        return new AutoExchangeType();
    }

    /**
     * Create an instance of {@link FlightTableType }
     * 
     */
    public FlightTableType createFlightTableType() {
        return new FlightTableType();
    }

    /**
     * Create an instance of {@link FlightTableType.Flight }
     * 
     */
    public FlightTableType.Flight createFlightTableTypeFlight() {
        return new FlightTableType.Flight();
    }

    /**
     * Create an instance of {@link MediaReferenceType }
     * 
     */
    public MediaReferenceType createMediaReferenceType() {
        return new MediaReferenceType();
    }

    /**
     * Create an instance of {@link ProductContentType }
     * 
     */
    public ProductContentType createProductContentType() {
        return new ProductContentType();
    }

    /**
     * Create an instance of {@link ServiceProcessInfoType }
     * 
     */
    public ServiceProcessInfoType createServiceProcessInfoType() {
        return new ServiceProcessInfoType();
    }

    /**
     * Create an instance of {@link SupplierSpecificInfosType }
     * 
     */
    public SupplierSpecificInfosType createSupplierSpecificInfosType() {
        return new SupplierSpecificInfosType();
    }

    /**
     * Create an instance of {@link SearchResponse.DestActivityDescriptiveContents }
     * 
     */
    public SearchResponse.DestActivityDescriptiveContents createSearchResponseDestActivityDescriptiveContents() {
        return new SearchResponse.DestActivityDescriptiveContents();
    }

    /**
     * Create an instance of {@link SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent }
     * 
     */
    public SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent createSearchResponseDestActivityDescriptiveContentsDestActivityDescriptiveContent() {
        return new SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent();
    }

    /**
     * Create an instance of {@link SearchResponse.VehAvails }
     * 
     */
    public SearchResponse.VehAvails createSearchResponseVehAvails() {
        return new SearchResponse.VehAvails();
    }

    /**
     * Create an instance of {@link SearchResponse.VehAvails.VehAvail }
     * 
     */
    public SearchResponse.VehAvails.VehAvail createSearchResponseVehAvailsVehAvail() {
        return new SearchResponse.VehAvails.VehAvail();
    }

    /**
     * Create an instance of {@link SearchResponse.RoomStays }
     * 
     */
    public SearchResponse.RoomStays createSearchResponseRoomStays() {
        return new SearchResponse.RoomStays();
    }

    /**
     * Create an instance of {@link SearchResponse.Package }
     * 
     */
    public SearchResponse.Package createSearchResponsePackage() {
        return new SearchResponse.Package();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Price }
     * 
     */
    public SearchResponse.Package.Price createSearchResponsePackagePrice() {
        return new SearchResponse.Package.Price();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Extras }
     * 
     */
    public SearchResponse.Package.Extras createSearchResponsePackageExtras() {
        return new SearchResponse.Package.Extras();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Extras.Extra }
     * 
     */
    public SearchResponse.Package.Extras.Extra createSearchResponsePackageExtrasExtra() {
        return new SearchResponse.Package.Extras.Extra();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent }
     * 
     */
    public SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent createSearchResponsePackageExtrasExtraDestActivityDescriptiveContent() {
        return new SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Flights }
     * 
     */
    public SearchResponse.Package.Flights createSearchResponsePackageFlights() {
        return new SearchResponse.Package.Flights();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Flights.PricedItinerary }
     * 
     */
    public SearchResponse.Package.Flights.PricedItinerary createSearchResponsePackageFlightsPricedItinerary() {
        return new SearchResponse.Package.Flights.PricedItinerary();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Flights.Price }
     * 
     */
    public SearchResponse.Package.Flights.Price createSearchResponsePackageFlightsPrice() {
        return new SearchResponse.Package.Flights.Price();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Vehicles }
     * 
     */
    public SearchResponse.Package.Vehicles createSearchResponsePackageVehicles() {
        return new SearchResponse.Package.Vehicles();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Vehicles.Vehicle }
     * 
     */
    public SearchResponse.Package.Vehicles.Vehicle createSearchResponsePackageVehiclesVehicle() {
        return new SearchResponse.Package.Vehicles.Vehicle();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Vehicles.Vehicle.VehAvail }
     * 
     */
    public SearchResponse.Package.Vehicles.Vehicle.VehAvail createSearchResponsePackageVehiclesVehicleVehAvail() {
        return new SearchResponse.Package.Vehicles.Vehicle.VehAvail();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Vehicles.Vehicle.Price }
     * 
     */
    public SearchResponse.Package.Vehicles.Vehicle.Price createSearchResponsePackageVehiclesVehiclePrice() {
        return new SearchResponse.Package.Vehicles.Vehicle.Price();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Vehicles.Vehicle.Price.Modular }
     * 
     */
    public SearchResponse.Package.Vehicles.Vehicle.Price.Modular createSearchResponsePackageVehiclesVehiclePriceModular() {
        return new SearchResponse.Package.Vehicles.Vehicle.Price.Modular();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Accomodation }
     * 
     */
    public SearchResponse.Package.Accomodation createSearchResponsePackageAccomodation() {
        return new SearchResponse.Package.Accomodation();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Accomodation.Room }
     * 
     */
    public SearchResponse.Package.Accomodation.Room createSearchResponsePackageAccomodationRoom() {
        return new SearchResponse.Package.Accomodation.Room();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Accomodation.Room.Price }
     * 
     */
    public SearchResponse.Package.Accomodation.Room.Price createSearchResponsePackageAccomodationRoomPrice() {
        return new SearchResponse.Package.Accomodation.Room.Price();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Accomodation.Room.Price.Modular }
     * 
     */
    public SearchResponse.Package.Accomodation.Room.Price.Modular createSearchResponsePackageAccomodationRoomPriceModular() {
        return new SearchResponse.Package.Accomodation.Room.Price.Modular();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Accomodation.Room.Price.Pricing }
     * 
     */
    public SearchResponse.Package.Accomodation.Room.Price.Pricing createSearchResponsePackageAccomodationRoomPricePricing() {
        return new SearchResponse.Package.Accomodation.Room.Price.Pricing();
    }

    /**
     * Create an instance of {@link ServicePenaltyType }
     * 
     */
    public ServicePenaltyType createServicePenaltyType() {
        return new ServicePenaltyType();
    }

    /**
     * Create an instance of {@link ServicePenaltyType.Cancel }
     * 
     */
    public ServicePenaltyType.Cancel createServicePenaltyTypeCancel() {
        return new ServicePenaltyType.Cancel();
    }

    /**
     * Create an instance of {@link ServicePenaltyType.Change }
     * 
     */
    public ServicePenaltyType.Change createServicePenaltyTypeChange() {
        return new ServicePenaltyType.Change();
    }

    /**
     * Create an instance of {@link ShoppingResponseIDsType }
     * 
     */
    public ShoppingResponseIDsType createShoppingResponseIDsType() {
        return new ShoppingResponseIDsType();
    }

    /**
     * Create an instance of {@link ShoppingResponseIDsType.AssociatedIDs }
     * 
     */
    public ShoppingResponseIDsType.AssociatedIDs createShoppingResponseIDsTypeAssociatedIDs() {
        return new ShoppingResponseIDsType.AssociatedIDs();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Extras.Extra }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Extras.Extra createExtrasExtra() {
        return new com.airchina.datacenter.spnr.sdk.entity.Extras.Extra();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Extras.Extra.Rooms }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Extras.Extra.Rooms createExtrasExtraRooms() {
        return new com.airchina.datacenter.spnr.sdk.entity.Extras.Extra.Rooms();
    }

    /**
     * Create an instance of {@link TktInExchangeForType }
     * 
     */
    public TktInExchangeForType createTktInExchangeForType() {
        return new TktInExchangeForType();
    }

    /**
     * Create an instance of {@link PromotionsType }
     * 
     */
    public PromotionsType createPromotionsType() {
        return new PromotionsType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Origin }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Origin createOrigin() {
        return new com.airchina.datacenter.spnr.sdk.entity.Origin();
    }

    /**
     * Create an instance of {@link TripProfiles }
     * 
     */
    public TripProfiles createTripProfiles() {
        return new TripProfiles();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.StayDateRange }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.StayDateRange createStayDateRange() {
        return new com.airchina.datacenter.spnr.sdk.entity.StayDateRange();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.DOW }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.DOW createDOW() {
        return new com.airchina.datacenter.spnr.sdk.entity.DOW();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Search }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Search createSearch() {
        return new com.airchina.datacenter.spnr.sdk.entity.Search();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Passengers }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Passengers createPassengers() {
        return new com.airchina.datacenter.spnr.sdk.entity.Passengers();
    }

    /**
     * Create an instance of {@link Passenger }
     * 
     */
    public Passenger createPassenger() {
        return new Passenger();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.OriginDestinationInformation }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.OriginDestinationInformation createOriginDestinationInformation() {
        return new com.airchina.datacenter.spnr.sdk.entity.OriginDestinationInformation();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Location }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Location createLocation() {
        return new com.airchina.datacenter.spnr.sdk.entity.Location();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Destination }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Destination createDestination() {
        return new com.airchina.datacenter.spnr.sdk.entity.Destination();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.HotelInformation }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.HotelInformation createHotelInformation() {
        return new com.airchina.datacenter.spnr.sdk.entity.HotelInformation();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.HotelName }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.HotelName createHotelName() {
        return new com.airchina.datacenter.spnr.sdk.entity.HotelName();
    }

    /**
     * Create an instance of {@link LocationTypeFromSearchHotel }
     * 
     */
    public LocationTypeFromSearchHotel createLocationTypeFromSearchHotel() {
        return new LocationTypeFromSearchHotel();
    }

    /**
     * Create an instance of {@link HotelChain }
     * 
     */
    public HotelChain createHotelChain() {
        return new HotelChain();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.VehicleInformation }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.VehicleInformation createVehicleInformation() {
        return new com.airchina.datacenter.spnr.sdk.entity.VehicleInformation();
    }

    /**
     * Create an instance of {@link CarType }
     * 
     */
    public CarType createCarType() {
        return new CarType();
    }

    /**
     * Create an instance of {@link DriverAge }
     * 
     */
    public DriverAge createDriverAge() {
        return new DriverAge();
    }

    /**
     * Create an instance of {@link CarCompany }
     * 
     */
    public CarCompany createCarCompany() {
        return new CarCompany();
    }

    /**
     * Create an instance of {@link FlightInformation }
     * 
     */
    public FlightInformation createFlightInformation() {
        return new FlightInformation();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.AirlinePrefs }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.AirlinePrefs createAirlinePrefs() {
        return new com.airchina.datacenter.spnr.sdk.entity.AirlinePrefs();
    }

    /**
     * Create an instance of {@link AirlinePref }
     * 
     */
    public AirlinePref createAirlinePref() {
        return new AirlinePref();
    }

    /**
     * Create an instance of {@link SeatClass }
     * 
     */
    public SeatClass createSeatClass() {
        return new SeatClass();
    }

    /**
     * Create an instance of {@link EticketDesired }
     * 
     */
    public EticketDesired createEticketDesired() {
        return new EticketDesired();
    }

    /**
     * Create an instance of {@link TripProfile.FromPrices }
     * 
     */
    public TripProfile.FromPrices createTripProfileFromPrices() {
        return new TripProfile.FromPrices();
    }

    /**
     * Create an instance of {@link ImpressionType }
     * 
     */
    public ImpressionType createImpressionType() {
        return new ImpressionType();
    }

    /**
     * Create an instance of {@link DateTimeStampType }
     * 
     */
    public DateTimeStampType createDateTimeStampType() {
        return new DateTimeStampType();
    }

    /**
     * Create an instance of {@link ExtensionPointType }
     * 
     */
    public ExtensionPointType createExtensionPointType() {
        return new ExtensionPointType();
    }

    /**
     * Create an instance of {@link SrvcDesVariableType }
     * 
     */
    public SrvcDesVariableType createSrvcDesVariableType() {
        return new SrvcDesVariableType();
    }

    /**
     * Create an instance of {@link Discounts.DiscountForTickets }
     * 
     */
    public Discounts.DiscountForTickets createDiscountsDiscountForTickets() {
        return new Discounts.DiscountForTickets();
    }

    /**
     * Create an instance of {@link NDCPromotionType }
     * 
     */
    public NDCPromotionType createNDCPromotionType() {
        return new NDCPromotionType();
    }

    /**
     * Create an instance of {@link FareCacheKeyType }
     * 
     */
    public FareCacheKeyType createFareCacheKeyType() {
        return new FareCacheKeyType();
    }

    /**
     * Create an instance of {@link SegmentIDRefType }
     * 
     */
    public SegmentIDRefType createSegmentIDRefType() {
        return new SegmentIDRefType();
    }

    /**
     * Create an instance of {@link OtherMembershipsType }
     * 
     */
    public OtherMembershipsType createOtherMembershipsType() {
        return new OtherMembershipsType();
    }

    /**
     * Create an instance of {@link Tags }
     * 
     */
    public Tags createTags() {
        return new Tags();
    }

    /**
     * Create an instance of {@link TagType }
     * 
     */
    public TagType createTagType() {
        return new TagType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Restrictions }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Restrictions createRestrictions() {
        return new com.airchina.datacenter.spnr.sdk.entity.Restrictions();
    }

    /**
     * Create an instance of {@link USDOTType }
     * 
     */
    public USDOTType createUSDOTType() {
        return new USDOTType();
    }

    /**
     * Create an instance of {@link StatusFromPromotionCommonTypes }
     * 
     */
    public StatusFromPromotionCommonTypes createStatusFromPromotionCommonTypes() {
        return new StatusFromPromotionCommonTypes();
    }

    /**
     * Create an instance of {@link SearchResponses }
     * 
     */
    public SearchResponses createSearchResponses() {
        return new SearchResponses();
    }

    /**
     * Create an instance of {@link PricedItinerariesType }
     * 
     */
    public PricedItinerariesType createPricedItinerariesType() {
        return new PricedItinerariesType();
    }

    /**
     * Create an instance of {@link BasicRate }
     * 
     */
    public BasicRate createBasicRate() {
        return new BasicRate();
    }

    /**
     * Create an instance of {@link SeatLocationType }
     * 
     */
    public SeatLocationType createSeatLocationType() {
        return new SeatLocationType();
    }

    /**
     * Create an instance of {@link IncentiveProgramType }
     * 
     */
    public IncentiveProgramType createIncentiveProgramType() {
        return new IncentiveProgramType();
    }

    /**
     * Create an instance of {@link CurrencyCodeType }
     * 
     */
    public CurrencyCodeType createCurrencyCodeType() {
        return new CurrencyCodeType();
    }

    /**
     * Create an instance of {@link OntologyExtensionType }
     * 
     */
    public OntologyExtensionType createOntologyExtensionType() {
        return new OntologyExtensionType();
    }

    /**
     * Create an instance of {@link SalesDateRange }
     * 
     */
    public SalesDateRange createSalesDateRange() {
        return new SalesDateRange();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Amenities }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Amenities createAmenities() {
        return new com.airchina.datacenter.spnr.sdk.entity.Amenities();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Amenity }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Amenity createAmenity() {
        return new com.airchina.datacenter.spnr.sdk.entity.Amenity();
    }

    /**
     * Create an instance of {@link PrivateFareOfficeType }
     * 
     */
    public PrivateFareOfficeType createPrivateFareOfficeType() {
        return new PrivateFareOfficeType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Group }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Group createGroup() {
        return new com.airchina.datacenter.spnr.sdk.entity.Group();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Description }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Description createDescription() {
        return new com.airchina.datacenter.spnr.sdk.entity.Description();
    }

    /**
     * Create an instance of {@link PointOfSale }
     * 
     */
    public PointOfSale createPointOfSale() {
        return new PointOfSale();
    }

    /**
     * Create an instance of {@link PricingRestrictionType }
     * 
     */
    public PricingRestrictionType createPricingRestrictionType() {
        return new PricingRestrictionType();
    }

    /**
     * Create an instance of {@link ResultOrdering }
     * 
     */
    public ResultOrdering createResultOrdering() {
        return new ResultOrdering();
    }

    /**
     * Create an instance of {@link TravelerInfantType }
     * 
     */
    public TravelerInfantType createTravelerInfantType() {
        return new TravelerInfantType();
    }

    /**
     * Create an instance of {@link ProfileIndexType }
     * 
     */
    public ProfileIndexType createProfileIndexType() {
        return new ProfileIndexType();
    }

    /**
     * Create an instance of {@link TicketDesignatorType }
     * 
     */
    public TicketDesignatorType createTicketDesignatorType() {
        return new TicketDesignatorType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Descriptions }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Descriptions createDescriptions() {
        return new com.airchina.datacenter.spnr.sdk.entity.Descriptions();
    }

    /**
     * Create an instance of {@link DescriptionFromHotelContentDescription }
     * 
     */
    public DescriptionFromHotelContentDescription createDescriptionFromHotelContentDescription() {
        return new DescriptionFromHotelContentDescription();
    }

    /**
     * Create an instance of {@link Groups }
     * 
     */
    public Groups createGroups() {
        return new Groups();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.DescriptionDetails }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.DescriptionDetails createDescriptionDetails() {
        return new com.airchina.datacenter.spnr.sdk.entity.DescriptionDetails();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link Context }
     * 
     */
    public Context createContext() {
        return new Context();
    }

    /**
     * Create an instance of {@link FlightNumberNodeType }
     * 
     */
    public FlightNumberNodeType createFlightNumberNodeType() {
        return new FlightNumberNodeType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link FareBasisCodeType }
     * 
     */
    public FareBasisCodeType createFareBasisCodeType() {
        return new FareBasisCodeType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Text }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Text createText() {
        return new com.airchina.datacenter.spnr.sdk.entity.Text();
    }

    /**
     * Create an instance of {@link TravelerIDRefType }
     * 
     */
    public TravelerIDRefType createTravelerIDRefType() {
        return new TravelerIDRefType();
    }

    /**
     * Create an instance of {@link SearchCriteria }
     * 
     */
    public SearchCriteria createSearchCriteria() {
        return new SearchCriteria();
    }

    /**
     * Create an instance of {@link PointsOfSale }
     * 
     */
    public PointsOfSale createPointsOfSale() {
        return new PointsOfSale();
    }

    /**
     * Create an instance of {@link Dates }
     * 
     */
    public Dates createDates() {
        return new Dates();
    }

    /**
     * Create an instance of {@link CCExpiration }
     * 
     */
    public CCExpiration createCCExpiration() {
        return new CCExpiration();
    }

    /**
     * Create an instance of {@link StatusApplicationControlTimes }
     * 
     */
    public StatusApplicationControlTimes createStatusApplicationControlTimes() {
        return new StatusApplicationControlTimes();
    }

    /**
     * Create an instance of {@link StatusApplicationControlTime }
     * 
     */
    public StatusApplicationControlTime createStatusApplicationControlTime() {
        return new StatusApplicationControlTime();
    }

    /**
     * Create an instance of {@link FareRefKeyType }
     * 
     */
    public FareRefKeyType createFareRefKeyType() {
        return new FareRefKeyType();
    }

    /**
     * Create an instance of {@link Audit }
     * 
     */
    public Audit createAudit() {
        return new Audit();
    }

    /**
     * Create an instance of {@link CCIssuerType }
     * 
     */
    public CCIssuerType createCCIssuerType() {
        return new CCIssuerType();
    }

    /**
     * Create an instance of {@link FlightFrequencyType }
     * 
     */
    public FlightFrequencyType createFlightFrequencyType() {
        return new FlightFrequencyType();
    }

    /**
     * Create an instance of {@link ShoppingResponseIDType }
     * 
     */
    public ShoppingResponseIDType createShoppingResponseIDType() {
        return new ShoppingResponseIDType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.StatusApplicationControl }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.StatusApplicationControl createStatusApplicationControl() {
        return new com.airchina.datacenter.spnr.sdk.entity.StatusApplicationControl();
    }

    /**
     * Create an instance of {@link TotalType }
     * 
     */
    public TotalType createTotalType() {
        return new TotalType();
    }

    /**
     * Create an instance of {@link AvailabilityAllRates.EventDateTime }
     * 
     */
    public AvailabilityAllRates.EventDateTime createAvailabilityAllRatesEventDateTime() {
        return new AvailabilityAllRates.EventDateTime();
    }

    /**
     * Create an instance of {@link TextDescriptionType }
     * 
     */
    public TextDescriptionType createTextDescriptionType() {
        return new TextDescriptionType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.RateRange }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.RateRange createRateRange() {
        return new com.airchina.datacenter.spnr.sdk.entity.RateRange();
    }

    /**
     * Create an instance of {@link OfferMatchType }
     * 
     */
    public OfferMatchType createOfferMatchType() {
        return new OfferMatchType();
    }

    /**
     * Create an instance of {@link NDCTravelerInfoType }
     * 
     */
    public NDCTravelerInfoType createNDCTravelerInfoType() {
        return new NDCTravelerInfoType();
    }

    /**
     * Create an instance of {@link OfferIDRefType }
     * 
     */
    public OfferIDRefType createOfferIDRefType() {
        return new OfferIDRefType();
    }

    /**
     * Create an instance of {@link NDCTicketingInfoType }
     * 
     */
    public NDCTicketingInfoType createNDCTicketingInfoType() {
        return new NDCTicketingInfoType();
    }

    /**
     * Create an instance of {@link LinkParams }
     * 
     */
    public LinkParams createLinkParams() {
        return new LinkParams();
    }

    /**
     * Create an instance of {@link ServiceID }
     * 
     */
    public ServiceID createServiceID() {
        return new ServiceID();
    }

    /**
     * Create an instance of {@link OfferIDType }
     * 
     */
    public OfferIDType createOfferIDType() {
        return new OfferIDType();
    }

    /**
     * Create an instance of {@link TravelerName }
     * 
     */
    public TravelerName createTravelerName() {
        return new TravelerName();
    }

    /**
     * Create an instance of {@link TravelerNameType }
     * 
     */
    public TravelerNameType createTravelerNameType() {
        return new TravelerNameType();
    }

    /**
     * Create an instance of {@link TravelerAgeType }
     * 
     */
    public TravelerAgeType createTravelerAgeType() {
        return new TravelerAgeType();
    }

    /**
     * Create an instance of {@link OfferID }
     * 
     */
    public OfferID createOfferID() {
        return new OfferID();
    }

    /**
     * Create an instance of {@link DateRangeType }
     * 
     */
    public DateRangeType createDateRangeType() {
        return new DateRangeType();
    }

    /**
     * Create an instance of {@link FlightTableRefType }
     * 
     */
    public FlightTableRefType createFlightTableRefType() {
        return new FlightTableRefType();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Notifications }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Notifications createNotifications() {
        return new com.airchina.datacenter.spnr.sdk.entity.Notifications();
    }

    /**
     * Create an instance of {@link SPNRNotificationType }
     * 
     */
    public SPNRNotificationType createSPNRNotificationType() {
        return new SPNRNotificationType();
    }

    /**
     * Create an instance of {@link RedemptionCurrencyType }
     * 
     */
    public RedemptionCurrencyType createRedemptionCurrencyType() {
        return new RedemptionCurrencyType();
    }

    /**
     * Create an instance of {@link DiagnosticsType }
     * 
     */
    public DiagnosticsType createDiagnosticsType() {
        return new DiagnosticsType();
    }

    /**
     * Create an instance of {@link TPAExtensionsType }
     * 
     */
    public TPAExtensionsType createTPAExtensionsType() {
        return new TPAExtensionsType();
    }

    /**
     * Create an instance of {@link PrivateFareCorpType }
     * 
     */
    public PrivateFareCorpType createPrivateFareCorpType() {
        return new PrivateFareCorpType();
    }

    /**
     * Create an instance of {@link FlightCOSDetailType }
     * 
     */
    public FlightCOSDetailType createFlightCOSDetailType() {
        return new FlightCOSDetailType();
    }

    /**
     * Create an instance of {@link PrivateFareContractType }
     * 
     */
    public PrivateFareContractType createPrivateFareContractType() {
        return new PrivateFareContractType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.MergeConfiguration }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.MergeConfiguration createMergeConfiguration() {
        return new com.airchina.datacenter.spnr.sdk.entity.MergeConfiguration();
    }

    /**
     * Create an instance of {@link Channels }
     * 
     */
    public Channels createChannels() {
        return new Channels();
    }

    /**
     * Create an instance of {@link ChannelType }
     * 
     */
    public ChannelType createChannelType() {
        return new ChannelType();
    }

    /**
     * Create an instance of {@link RecordLocatorType }
     * 
     */
    public RecordLocatorType createRecordLocatorType() {
        return new RecordLocatorType();
    }

    /**
     * Create an instance of {@link AncillaryService }
     * 
     */
    public AncillaryService createAncillaryService() {
        return new AncillaryService();
    }

    /**
     * Create an instance of {@link AncillaryServiceType }
     * 
     */
    public AncillaryServiceType createAncillaryServiceType() {
        return new AncillaryServiceType();
    }

    /**
     * Create an instance of {@link InfoGroupType }
     * 
     */
    public InfoGroupType createInfoGroupType() {
        return new InfoGroupType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ServicePrice }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ServicePrice createServicePrice() {
        return new com.airchina.datacenter.spnr.sdk.entity.ServicePrice();
    }

    /**
     * Create an instance of {@link ServiceBasePriceType }
     * 
     */
    public ServiceBasePriceType createServiceBasePriceType() {
        return new ServiceBasePriceType();
    }

    /**
     * Create an instance of {@link TaxesType }
     * 
     */
    public TaxesType createTaxesType() {
        return new TaxesType();
    }

    /**
     * Create an instance of {@link ReissuePriceType }
     * 
     */
    public ReissuePriceType createReissuePriceType() {
        return new ReissuePriceType();
    }

    /**
     * Create an instance of {@link DefaultLanguage }
     * 
     */
    public DefaultLanguage createDefaultLanguage() {
        return new DefaultLanguage();
    }

    /**
     * Create an instance of {@link TravelerRefInfoType }
     * 
     */
    public TravelerRefInfoType createTravelerRefInfoType() {
        return new TravelerRefInfoType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Comments }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Comments createComments() {
        return new com.airchina.datacenter.spnr.sdk.entity.Comments();
    }

    /**
     * Create an instance of {@link OJSuperPNR }
     * 
     */
    public OJSuperPNR createOJSuperPNR() {
        return new OJSuperPNR();
    }

    /**
     * Create an instance of {@link POSType }
     * 
     */
    public POSType createPOSType() {
        return new POSType();
    }

    /**
     * Create an instance of {@link SuperPNRType.PackageProduct }
     * 
     */
    public SuperPNRType.PackageProduct createSuperPNRTypePackageProduct() {
        return new SuperPNRType.PackageProduct();
    }

    /**
     * Create an instance of {@link SuperPNRType.Remarks }
     * 
     */
    public SuperPNRType.Remarks createSuperPNRTypeRemarks() {
        return new SuperPNRType.Remarks();
    }

    /**
     * Create an instance of {@link WarningsType }
     * 
     */
    public WarningsType createWarningsType() {
        return new WarningsType();
    }

    /**
     * Create an instance of {@link CancelPenaltiesType }
     * 
     */
    public CancelPenaltiesType createCancelPenaltiesType() {
        return new CancelPenaltiesType();
    }

    /**
     * Create an instance of {@link AuditsType }
     * 
     */
    public AuditsType createAuditsType() {
        return new AuditsType();
    }

    /**
     * Create an instance of {@link SPNRErrorsType }
     * 
     */
    public SPNRErrorsType createSPNRErrorsType() {
        return new SPNRErrorsType();
    }

    /**
     * Create an instance of {@link SuperPNRType.Emails }
     * 
     */
    public SuperPNRType.Emails createSuperPNRTypeEmails() {
        return new SuperPNRType.Emails();
    }

    /**
     * Create an instance of {@link SuperPNRType.OJActionItem }
     * 
     */
    public SuperPNRType.OJActionItem createSuperPNRTypeOJActionItem() {
        return new SuperPNRType.OJActionItem();
    }

    /**
     * Create an instance of {@link OrderCategoryType }
     * 
     */
    public OrderCategoryType createOrderCategoryType() {
        return new OrderCategoryType();
    }

    /**
     * Create an instance of {@link CCQualifierType }
     * 
     */
    public CCQualifierType createCCQualifierType() {
        return new CCQualifierType();
    }

    /**
     * Create an instance of {@link ShoppingResponseType }
     * 
     */
    public ShoppingResponseType createShoppingResponseType() {
        return new ShoppingResponseType();
    }

    /**
     * Create an instance of {@link ServiceIDRefType }
     * 
     */
    public ServiceIDRefType createServiceIDRefType() {
        return new ServiceIDRefType();
    }

    /**
     * Create an instance of {@link OfferTimeLimit }
     * 
     */
    public OfferTimeLimit createOfferTimeLimit() {
        return new OfferTimeLimit();
    }

    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
    }

    /**
     * Create an instance of {@link AdvanceDepartureType }
     * 
     */
    public AdvanceDepartureType createAdvanceDepartureType() {
        return new AdvanceDepartureType();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link NDCServiceType }
     * 
     */
    public NDCServiceType createNDCServiceType() {
        return new NDCServiceType();
    }

    /**
     * Create an instance of {@link RefundInfoType }
     * 
     */
    public RefundInfoType createRefundInfoType() {
        return new RefundInfoType();
    }

    /**
     * Create an instance of {@link SeatingPrefType }
     * 
     */
    public SeatingPrefType createSeatingPrefType() {
        return new SeatingPrefType();
    }

    /**
     * Create an instance of {@link OperatingAirlineType }
     * 
     */
    public OperatingAirlineType createOperatingAirlineType() {
        return new OperatingAirlineType();
    }

    /**
     * Create an instance of {@link OntologyTripPurposeType }
     * 
     */
    public OntologyTripPurposeType createOntologyTripPurposeType() {
        return new OntologyTripPurposeType();
    }

    /**
     * Create an instance of {@link OperationSchedulesType }
     * 
     */
    public OperationSchedulesType createOperationSchedulesType() {
        return new OperationSchedulesType();
    }

    /**
     * Create an instance of {@link AirAncillaryProductLocalisedContentType }
     * 
     */
    public AirAncillaryProductLocalisedContentType createAirAncillaryProductLocalisedContentType() {
        return new AirAncillaryProductLocalisedContentType();
    }

    /**
     * Create an instance of {@link AirTaxType }
     * 
     */
    public AirTaxType createAirTaxType() {
        return new AirTaxType();
    }

    /**
     * Create an instance of {@link ExtrasType }
     * 
     */
    public ExtrasType createExtrasType() {
        return new ExtrasType();
    }

    /**
     * Create an instance of {@link VehicleBaseType }
     * 
     */
    public VehicleBaseType createVehicleBaseType() {
        return new VehicleBaseType();
    }

    /**
     * Create an instance of {@link ReservationItemReferencesType }
     * 
     */
    public ReservationItemReferencesType createReservationItemReferencesType() {
        return new ReservationItemReferencesType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.UserText }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.UserText createUserText() {
        return new com.airchina.datacenter.spnr.sdk.entity.UserText();
    }

    /**
     * Create an instance of {@link PaymentCardDetailsType }
     * 
     */
    public PaymentCardDetailsType createPaymentCardDetailsType() {
        return new PaymentCardDetailsType();
    }

    /**
     * Create an instance of {@link ItineraryRQType }
     * 
     */
    public ItineraryRQType createItineraryRQType() {
        return new ItineraryRQType();
    }

    /**
     * Create an instance of {@link ResCommonDetailType }
     * 
     */
    public ResCommonDetailType createResCommonDetailType() {
        return new ResCommonDetailType();
    }

    /**
     * Create an instance of {@link PaymentRulesType }
     * 
     */
    public PaymentRulesType createPaymentRulesType() {
        return new PaymentRulesType();
    }

    /**
     * Create an instance of {@link BookingChannelType }
     * 
     */
    public BookingChannelType createBookingChannelType() {
        return new BookingChannelType();
    }

    /**
     * Create an instance of {@link BookingOfficesType }
     * 
     */
    public BookingOfficesType createBookingOfficesType() {
        return new BookingOfficesType();
    }

    /**
     * Create an instance of {@link CouponChangeRulesType }
     * 
     */
    public CouponChangeRulesType createCouponChangeRulesType() {
        return new CouponChangeRulesType();
    }

    /**
     * Create an instance of {@link PenaltyStayInfoType }
     * 
     */
    public PenaltyStayInfoType createPenaltyStayInfoType() {
        return new PenaltyStayInfoType();
    }

    /**
     * Create an instance of {@link DistribPrefType }
     * 
     */
    public DistribPrefType createDistribPrefType() {
        return new DistribPrefType();
    }

    /**
     * Create an instance of {@link ListRecycledProducts }
     * 
     */
    public ListRecycledProducts createListRecycledProducts() {
        return new ListRecycledProducts();
    }

    /**
     * Create an instance of {@link LoyaltyPartnerType }
     * 
     */
    public LoyaltyPartnerType createLoyaltyPartnerType() {
        return new LoyaltyPartnerType();
    }

    /**
     * Create an instance of {@link RoomAmenityPrefType }
     * 
     */
    public RoomAmenityPrefType createRoomAmenityPrefType() {
        return new RoomAmenityPrefType();
    }

    /**
     * Create an instance of {@link PowerType }
     * 
     */
    public PowerType createPowerType() {
        return new PowerType();
    }

    /**
     * Create an instance of {@link OJResponseType }
     * 
     */
    public OJResponseType createOJResponseType() {
        return new OJResponseType();
    }

    /**
     * Create an instance of {@link ImageItemType }
     * 
     */
    public ImageItemType createImageItemType() {
        return new ImageItemType();
    }

    /**
     * Create an instance of {@link QueueActionType }
     * 
     */
    public QueueActionType createQueueActionType() {
        return new QueueActionType();
    }

    /**
     * Create an instance of {@link FQTVInfoCoreType }
     * 
     */
    public FQTVInfoCoreType createFQTVInfoCoreType() {
        return new FQTVInfoCoreType();
    }

    /**
     * Create an instance of {@link AmountLiteType }
     * 
     */
    public AmountLiteType createAmountLiteType() {
        return new AmountLiteType();
    }

    /**
     * Create an instance of {@link AncillaryMultimediaObjectType }
     * 
     */
    public AncillaryMultimediaObjectType createAncillaryMultimediaObjectType() {
        return new AncillaryMultimediaObjectType();
    }

    /**
     * Create an instance of {@link VendorMessageType }
     * 
     */
    public VendorMessageType createVendorMessageType() {
        return new VendorMessageType();
    }

    /**
     * Create an instance of {@link VehicleAvailVendorInfoType }
     * 
     */
    public VehicleAvailVendorInfoType createVehicleAvailVendorInfoType() {
        return new VehicleAvailVendorInfoType();
    }

    /**
     * Create an instance of {@link PeriodPriceType }
     * 
     */
    public PeriodPriceType createPeriodPriceType() {
        return new PeriodPriceType();
    }

    /**
     * Create an instance of {@link FerryErrorType }
     * 
     */
    public FerryErrorType createFerryErrorType() {
        return new FerryErrorType();
    }

    /**
     * Create an instance of {@link SeatAvailabilityType }
     * 
     */
    public SeatAvailabilityType createSeatAvailabilityType() {
        return new SeatAvailabilityType();
    }

    /**
     * Create an instance of {@link SeatDetailType }
     * 
     */
    public SeatDetailType createSeatDetailType() {
        return new SeatDetailType();
    }

    /**
     * Create an instance of {@link OntologyBookingMethodType }
     * 
     */
    public OntologyBookingMethodType createOntologyBookingMethodType() {
        return new OntologyBookingMethodType();
    }

    /**
     * Create an instance of {@link ListAdditionalOperationInfo }
     * 
     */
    public ListAdditionalOperationInfo createListAdditionalOperationInfo() {
        return new ListAdditionalOperationInfo();
    }

    /**
     * Create an instance of {@link PackageRedeemType }
     * 
     */
    public PackageRedeemType createPackageRedeemType() {
        return new PackageRedeemType();
    }

    /**
     * Create an instance of {@link PriceAdjustmentType }
     * 
     */
    public PriceAdjustmentType createPriceAdjustmentType() {
        return new PriceAdjustmentType();
    }

    /**
     * Create an instance of {@link LoyaltyTransactionsType }
     * 
     */
    public LoyaltyTransactionsType createLoyaltyTransactionsType() {
        return new LoyaltyTransactionsType();
    }

    /**
     * Create an instance of {@link RoomTypeLiteType }
     * 
     */
    public RoomTypeLiteType createRoomTypeLiteType() {
        return new RoomTypeLiteType();
    }

    /**
     * Create an instance of {@link BasePriceType }
     * 
     */
    public BasePriceType createBasePriceType() {
        return new BasePriceType();
    }

    /**
     * Create an instance of {@link EquipmentTypePref }
     * 
     */
    public EquipmentTypePref createEquipmentTypePref() {
        return new EquipmentTypePref();
    }

    /**
     * Create an instance of {@link CodeAmountType }
     * 
     */
    public CodeAmountType createCodeAmountType() {
        return new CodeAmountType();
    }

    /**
     * Create an instance of {@link SessionType }
     * 
     */
    public SessionType createSessionType() {
        return new SessionType();
    }

    /**
     * Create an instance of {@link RedeemType }
     * 
     */
    public RedeemType createRedeemType() {
        return new RedeemType();
    }

    /**
     * Create an instance of {@link CorporateRateType }
     * 
     */
    public CorporateRateType createCorporateRateType() {
        return new CorporateRateType();
    }

    /**
     * Create an instance of {@link OJActionItemType }
     * 
     */
    public OJActionItemType createOJActionItemType() {
        return new OJActionItemType();
    }

    /**
     * Create an instance of {@link CouponPriceType }
     * 
     */
    public CouponPriceType createCouponPriceType() {
        return new CouponPriceType();
    }

    /**
     * Create an instance of {@link SpecRequestPrefType }
     * 
     */
    public SpecRequestPrefType createSpecRequestPrefType() {
        return new SpecRequestPrefType();
    }

    /**
     * Create an instance of {@link PriceInfoType }
     * 
     */
    public PriceInfoType createPriceInfoType() {
        return new PriceInfoType();
    }

    /**
     * Create an instance of {@link VehicleLocationInformationType }
     * 
     */
    public VehicleLocationInformationType createVehicleLocationInformationType() {
        return new VehicleLocationInformationType();
    }

    /**
     * Create an instance of {@link AmenityOptionType }
     * 
     */
    public AmenityOptionType createAmenityOptionType() {
        return new AmenityOptionType();
    }

    /**
     * Create an instance of {@link SearchCriteriaType }
     * 
     */
    public SearchCriteriaType createSearchCriteriaType() {
        return new SearchCriteriaType();
    }

    /**
     * Create an instance of {@link BaggageWeightType }
     * 
     */
    public BaggageWeightType createBaggageWeightType() {
        return new BaggageWeightType();
    }

    /**
     * Create an instance of {@link MonetaryRuleType }
     * 
     */
    public MonetaryRuleType createMonetaryRuleType() {
        return new MonetaryRuleType();
    }

    /**
     * Create an instance of {@link SPNRErrorType }
     * 
     */
    public SPNRErrorType createSPNRErrorType() {
        return new SPNRErrorType();
    }

    /**
     * Create an instance of {@link MarketingPrefType }
     * 
     */
    public MarketingPrefType createMarketingPrefType() {
        return new MarketingPrefType();
    }

    /**
     * Create an instance of {@link CertificationType }
     * 
     */
    public CertificationType createCertificationType() {
        return new CertificationType();
    }

    /**
     * Create an instance of {@link VehicleTourInfoType }
     * 
     */
    public VehicleTourInfoType createVehicleTourInfoType() {
        return new VehicleTourInfoType();
    }

    /**
     * Create an instance of {@link PackageEarnType }
     * 
     */
    public PackageEarnType createPackageEarnType() {
        return new PackageEarnType();
    }

    /**
     * Create an instance of {@link CodeListSummaryExtension }
     * 
     */
    public CodeListSummaryExtension createCodeListSummaryExtension() {
        return new CodeListSummaryExtension();
    }

    /**
     * Create an instance of {@link FareSurchargesType }
     * 
     */
    public FareSurchargesType createFareSurchargesType() {
        return new FareSurchargesType();
    }

    /**
     * Create an instance of {@link RequestedCoveragesType }
     * 
     */
    public RequestedCoveragesType createRequestedCoveragesType() {
        return new RequestedCoveragesType();
    }

    /**
     * Create an instance of {@link RelatedTravelerPrefType }
     * 
     */
    public RelatedTravelerPrefType createRelatedTravelerPrefType() {
        return new RelatedTravelerPrefType();
    }

    /**
     * Create an instance of {@link FerryBookingCore }
     * 
     */
    public FerryBookingCore createFerryBookingCore() {
        return new FerryBookingCore();
    }

    /**
     * Create an instance of {@link RefundQualifiersType }
     * 
     */
    public RefundQualifiersType createRefundQualifiersType() {
        return new RefundQualifiersType();
    }

    /**
     * Create an instance of {@link LoyaltyProgramType }
     * 
     */
    public LoyaltyProgramType createLoyaltyProgramType() {
        return new LoyaltyProgramType();
    }

    /**
     * Create an instance of {@link SourceConfigType }
     * 
     */
    public SourceConfigType createSourceConfigType() {
        return new SourceConfigType();
    }

    /**
     * Create an instance of {@link FareSurchargeType }
     * 
     */
    public FareSurchargeType createFareSurchargeType() {
        return new FareSurchargeType();
    }

    /**
     * Create an instance of {@link ListBankAccountType }
     * 
     */
    public ListBankAccountType createListBankAccountType() {
        return new ListBankAccountType();
    }

    /**
     * Create an instance of {@link RatePlanLiteType }
     * 
     */
    public RatePlanLiteType createRatePlanLiteType() {
        return new RatePlanLiteType();
    }

    /**
     * Create an instance of {@link RailAvailQueryType }
     * 
     */
    public RailAvailQueryType createRailAvailQueryType() {
        return new RailAvailQueryType();
    }

    /**
     * Create an instance of {@link AirInfoType }
     * 
     */
    public AirInfoType createAirInfoType() {
        return new AirInfoType();
    }

    /**
     * Create an instance of {@link PersonalInsuranceItemType }
     * 
     */
    public PersonalInsuranceItemType createPersonalInsuranceItemType() {
        return new PersonalInsuranceItemType();
    }

    /**
     * Create an instance of {@link AirAncillaryProductContentType }
     * 
     */
    public AirAncillaryProductContentType createAirAncillaryProductContentType() {
        return new AirAncillaryProductContentType();
    }

    /**
     * Create an instance of {@link AccrualType }
     * 
     */
    public AccrualType createAccrualType() {
        return new AccrualType();
    }

    /**
     * Create an instance of {@link StagesType }
     * 
     */
    public StagesType createStagesType() {
        return new StagesType();
    }

    /**
     * Create an instance of {@link FareInfoEndorsementsType }
     * 
     */
    public FareInfoEndorsementsType createFareInfoEndorsementsType() {
        return new FareInfoEndorsementsType();
    }

    /**
     * Create an instance of {@link FerryPersonNameType }
     * 
     */
    public FerryPersonNameType createFerryPersonNameType() {
        return new FerryPersonNameType();
    }

    /**
     * Create an instance of {@link SourceIdentificationType }
     * 
     */
    public SourceIdentificationType createSourceIdentificationType() {
        return new SourceIdentificationType();
    }

    /**
     * Create an instance of {@link ReservationType }
     * 
     */
    public ReservationType createReservationType() {
        return new ReservationType();
    }

    /**
     * Create an instance of {@link PriceRangeType }
     * 
     */
    public PriceRangeType createPriceRangeType() {
        return new PriceRangeType();
    }

    /**
     * Create an instance of {@link DimensionLengthWidthHeightType }
     * 
     */
    public DimensionLengthWidthHeightType createDimensionLengthWidthHeightType() {
        return new DimensionLengthWidthHeightType();
    }

    /**
     * Create an instance of {@link PartialRedemptionType }
     * 
     */
    public PartialRedemptionType createPartialRedemptionType() {
        return new PartialRedemptionType();
    }

    /**
     * Create an instance of {@link CabinClassCoreType }
     * 
     */
    public CabinClassCoreType createCabinClassCoreType() {
        return new CabinClassCoreType();
    }

    /**
     * Create an instance of {@link FreshFoodType }
     * 
     */
    public FreshFoodType createFreshFoodType() {
        return new FreshFoodType();
    }

    /**
     * Create an instance of {@link TrainQueryType }
     * 
     */
    public TrainQueryType createTrainQueryType() {
        return new TrainQueryType();
    }

    /**
     * Create an instance of {@link VehiclePrefType }
     * 
     */
    public VehiclePrefType createVehiclePrefType() {
        return new VehiclePrefType();
    }

    /**
     * Create an instance of {@link OnboardAccomType }
     * 
     */
    public OnboardAccomType createOnboardAccomType() {
        return new OnboardAccomType();
    }

    /**
     * Create an instance of {@link FormattedTextType }
     * 
     */
    public FormattedTextType createFormattedTextType() {
        return new FormattedTextType();
    }

    /**
     * Create an instance of {@link EntertainmentType }
     * 
     */
    public EntertainmentType createEntertainmentType() {
        return new EntertainmentType();
    }

    /**
     * Create an instance of {@link CabinDetailsType }
     * 
     */
    public CabinDetailsType createCabinDetailsType() {
        return new CabinDetailsType();
    }

    /**
     * Create an instance of {@link EncryptionTokenType }
     * 
     */
    public EncryptionTokenType createEncryptionTokenType() {
        return new EncryptionTokenType();
    }

    /**
     * Create an instance of {@link OtherChargeType }
     * 
     */
    public OtherChargeType createOtherChargeType() {
        return new OtherChargeType();
    }

    /**
     * Create an instance of {@link OntologyPricingMethodType }
     * 
     */
    public OntologyPricingMethodType createOntologyPricingMethodType() {
        return new OntologyPricingMethodType();
    }

    /**
     * Create an instance of {@link SystemSourceType }
     * 
     */
    public SystemSourceType createSystemSourceType() {
        return new SystemSourceType();
    }

    /**
     * Create an instance of {@link CoveragePricedType }
     * 
     */
    public CoveragePricedType createCoveragePricedType() {
        return new CoveragePricedType();
    }

    /**
     * Create an instance of {@link RuleData }
     * 
     */
    public RuleData createRuleData() {
        return new RuleData();
    }

    /**
     * Create an instance of {@link AuthenticationInfoType }
     * 
     */
    public AuthenticationInfoType createAuthenticationInfoType() {
        return new AuthenticationInfoType();
    }

    /**
     * Create an instance of {@link PTCType }
     * 
     */
    public PTCType createPTCType() {
        return new PTCType();
    }

    /**
     * Create an instance of {@link SeatRequestType }
     * 
     */
    public SeatRequestType createSeatRequestType() {
        return new SeatRequestType();
    }

    /**
     * Create an instance of {@link ListGlobalIndicatorType }
     * 
     */
    public ListGlobalIndicatorType createListGlobalIndicatorType() {
        return new ListGlobalIndicatorType();
    }

    /**
     * Create an instance of {@link SurchargeBasicType }
     * 
     */
    public SurchargeBasicType createSurchargeBasicType() {
        return new SurchargeBasicType();
    }

    /**
     * Create an instance of {@link OntologyDefinitionType }
     * 
     */
    public OntologyDefinitionType createOntologyDefinitionType() {
        return new OntologyDefinitionType();
    }

    /**
     * Create an instance of {@link AncillarySearchCriteriaType }
     * 
     */
    public AncillarySearchCriteriaType createAncillarySearchCriteriaType() {
        return new AncillarySearchCriteriaType();
    }

    /**
     * Create an instance of {@link TravelerScore }
     * 
     */
    public TravelerScore createTravelerScore() {
        return new TravelerScore();
    }

    /**
     * Create an instance of {@link ItineraryType }
     * 
     */
    public ItineraryType createItineraryType() {
        return new ItineraryType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Phone }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Phone createPhone() {
        return new com.airchina.datacenter.spnr.sdk.entity.Phone();
    }

    /**
     * Create an instance of {@link AirlineOperatorIDType }
     * 
     */
    public AirlineOperatorIDType createAirlineOperatorIDType() {
        return new AirlineOperatorIDType();
    }

    /**
     * Create an instance of {@link AirAncillariesProductSummaryBase }
     * 
     */
    public AirAncillariesProductSummaryBase createAirAncillariesProductSummaryBase() {
        return new AirAncillariesProductSummaryBase();
    }

    /**
     * Create an instance of {@link LoyaltyPrefType }
     * 
     */
    public LoyaltyPrefType createLoyaltyPrefType() {
        return new LoyaltyPrefType();
    }

    /**
     * Create an instance of {@link UsersType }
     * 
     */
    public UsersType createUsersType() {
        return new UsersType();
    }

    /**
     * Create an instance of {@link SPNRVoucherType }
     * 
     */
    public SPNRVoucherType createSPNRVoucherType() {
        return new SPNRVoucherType();
    }

    /**
     * Create an instance of {@link PriceCriteriaType }
     * 
     */
    public PriceCriteriaType createPriceCriteriaType() {
        return new PriceCriteriaType();
    }

    /**
     * Create an instance of {@link VehicleReservationSummaryType }
     * 
     */
    public VehicleReservationSummaryType createVehicleReservationSummaryType() {
        return new VehicleReservationSummaryType();
    }

    /**
     * Create an instance of {@link AgreementsType }
     * 
     */
    public AgreementsType createAgreementsType() {
        return new AgreementsType();
    }

    /**
     * Create an instance of {@link AgentCommissionType }
     * 
     */
    public AgentCommissionType createAgentCommissionType() {
        return new AgentCommissionType();
    }

    /**
     * Create an instance of {@link SupplierCostType }
     * 
     */
    public SupplierCostType createSupplierCostType() {
        return new SupplierCostType();
    }

    /**
     * Create an instance of {@link ListAirFareDateType }
     * 
     */
    public ListAirFareDateType createListAirFareDateType() {
        return new ListAirFareDateType();
    }

    /**
     * Create an instance of {@link ListVehCategory }
     * 
     */
    public ListVehCategory createListVehCategory() {
        return new ListVehCategory();
    }

    /**
     * Create an instance of {@link AdvanceTicketingType }
     * 
     */
    public AdvanceTicketingType createAdvanceTicketingType() {
        return new AdvanceTicketingType();
    }

    /**
     * Create an instance of {@link CorporateDetailsType }
     * 
     */
    public CorporateDetailsType createCorporateDetailsType() {
        return new CorporateDetailsType();
    }

    /**
     * Create an instance of {@link PointOfSaleType }
     * 
     */
    public PointOfSaleType createPointOfSaleType() {
        return new PointOfSaleType();
    }

    /**
     * Create an instance of {@link ArriveType }
     * 
     */
    public ArriveType createArriveType() {
        return new ArriveType();
    }

    /**
     * Create an instance of {@link CustomerReferencesType }
     * 
     */
    public CustomerReferencesType createCustomerReferencesType() {
        return new CustomerReferencesType();
    }

    /**
     * Create an instance of {@link VehicleArrivalDetailsType }
     * 
     */
    public VehicleArrivalDetailsType createVehicleArrivalDetailsType() {
        return new VehicleArrivalDetailsType();
    }

    /**
     * Create an instance of {@link SpecialServiceType }
     * 
     */
    public SpecialServiceType createSpecialServiceType() {
        return new SpecialServiceType();
    }

    /**
     * Create an instance of {@link OtherSrvcPrefType }
     * 
     */
    public OtherSrvcPrefType createOtherSrvcPrefType() {
        return new OtherSrvcPrefType();
    }

    /**
     * Create an instance of {@link NotificationsType }
     * 
     */
    public NotificationsType createNotificationsType() {
        return new NotificationsType();
    }

    /**
     * Create an instance of {@link CorporateType }
     * 
     */
    public CorporateType createCorporateType() {
        return new CorporateType();
    }

    /**
     * Create an instance of {@link TSPaymentOptionType }
     * 
     */
    public TSPaymentOptionType createTSPaymentOptionType() {
        return new TSPaymentOptionType();
    }

    /**
     * Create an instance of {@link ReservationDetailsType }
     * 
     */
    public ReservationDetailsType createReservationDetailsType() {
        return new ReservationDetailsType();
    }

    /**
     * Create an instance of {@link PriceAdjustmentsType }
     * 
     */
    public PriceAdjustmentsType createPriceAdjustmentsType() {
        return new PriceAdjustmentsType();
    }

    /**
     * Create an instance of {@link ComplexGroup }
     * 
     */
    public ComplexGroup createComplexGroup() {
        return new ComplexGroup();
    }

    /**
     * Create an instance of {@link TravelerInformationType }
     * 
     */
    public TravelerInformationType createTravelerInformationType() {
        return new TravelerInformationType();
    }

    /**
     * Create an instance of {@link AuditEventsType }
     * 
     */
    public AuditEventsType createAuditEventsType() {
        return new AuditEventsType();
    }

    /**
     * Create an instance of {@link LanguagePrefType }
     * 
     */
    public LanguagePrefType createLanguagePrefType() {
        return new LanguagePrefType();
    }

    /**
     * Create an instance of {@link AirAncillaryProductPaxChangeFeeType }
     * 
     */
    public AirAncillaryProductPaxChangeFeeType createAirAncillaryProductPaxChangeFeeType() {
        return new AirAncillaryProductPaxChangeFeeType();
    }

    /**
     * Create an instance of {@link BaggageSizeType }
     * 
     */
    public BaggageSizeType createBaggageSizeType() {
        return new BaggageSizeType();
    }

    /**
     * Create an instance of {@link ListReservationBilling }
     * 
     */
    public ListReservationBilling createListReservationBilling() {
        return new ListReservationBilling();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link AggregatorPartyType }
     * 
     */
    public AggregatorPartyType createAggregatorPartyType() {
        return new AggregatorPartyType();
    }

    /**
     * Create an instance of {@link RecreationSrvcPrefType }
     * 
     */
    public RecreationSrvcPrefType createRecreationSrvcPrefType() {
        return new RecreationSrvcPrefType();
    }

    /**
     * Create an instance of {@link POIDistanceType }
     * 
     */
    public POIDistanceType createPOIDistanceType() {
        return new POIDistanceType();
    }

    /**
     * Create an instance of {@link ListGroundServiceProvided }
     * 
     */
    public ListGroundServiceProvided createListGroundServiceProvided() {
        return new ListGroundServiceProvided();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link BiasingConfig }
     * 
     */
    public BiasingConfig createBiasingConfig() {
        return new BiasingConfig();
    }

    /**
     * Create an instance of {@link SPNRWarningType }
     * 
     */
    public SPNRWarningType createSPNRWarningType() {
        return new SPNRWarningType();
    }

    /**
     * Create an instance of {@link SimplifiedStringType }
     * 
     */
    public SimplifiedStringType createSimplifiedStringType() {
        return new SimplifiedStringType();
    }

    /**
     * Create an instance of {@link EmployeeInfoType }
     * 
     */
    public EmployeeInfoType createEmployeeInfoType() {
        return new EmployeeInfoType();
    }

    /**
     * Create an instance of {@link AirlineCarrierType }
     * 
     */
    public AirlineCarrierType createAirlineCarrierType() {
        return new AirlineCarrierType();
    }

    /**
     * Create an instance of {@link BasicSegmentType }
     * 
     */
    public BasicSegmentType createBasicSegmentType() {
        return new BasicSegmentType();
    }

    /**
     * Create an instance of {@link SeatMapDetailsType }
     * 
     */
    public SeatMapDetailsType createSeatMapDetailsType() {
        return new SeatMapDetailsType();
    }

    /**
     * Create an instance of {@link AgeQualificationsType }
     * 
     */
    public AgeQualificationsType createAgeQualificationsType() {
        return new AgeQualificationsType();
    }

    /**
     * Create an instance of {@link InsuranceProductLinkType }
     * 
     */
    public InsuranceProductLinkType createInsuranceProductLinkType() {
        return new InsuranceProductLinkType();
    }

    /**
     * Create an instance of {@link FerryPaymentCardBaseType }
     * 
     */
    public FerryPaymentCardBaseType createFerryPaymentCardBaseType() {
        return new FerryPaymentCardBaseType();
    }

    /**
     * Create an instance of {@link AirlineIDType }
     * 
     */
    public AirlineIDType createAirlineIDType() {
        return new AirlineIDType();
    }

    /**
     * Create an instance of {@link OntologyCurrencyType }
     * 
     */
    public OntologyCurrencyType createOntologyCurrencyType() {
        return new OntologyCurrencyType();
    }

    /**
     * Create an instance of {@link PackageLoyaltyBaseType }
     * 
     */
    public PackageLoyaltyBaseType createPackageLoyaltyBaseType() {
        return new PackageLoyaltyBaseType();
    }

    /**
     * Create an instance of {@link TicketingInfoRSType }
     * 
     */
    public TicketingInfoRSType createTicketingInfoRSType() {
        return new TicketingInfoRSType();
    }

    /**
     * Create an instance of {@link BedTypePrefType }
     * 
     */
    public BedTypePrefType createBedTypePrefType() {
        return new BedTypePrefType();
    }

    /**
     * Create an instance of {@link HotelResRequestType }
     * 
     */
    public HotelResRequestType createHotelResRequestType() {
        return new HotelResRequestType();
    }

    /**
     * Create an instance of {@link SrvcProcessInfoType }
     * 
     */
    public SrvcProcessInfoType createSrvcProcessInfoType() {
        return new SrvcProcessInfoType();
    }

    /**
     * Create an instance of {@link CustomerTagType }
     * 
     */
    public CustomerTagType createCustomerTagType() {
        return new CustomerTagType();
    }

    /**
     * Create an instance of {@link BusinessLocaleType }
     * 
     */
    public BusinessLocaleType createBusinessLocaleType() {
        return new BusinessLocaleType();
    }

    /**
     * Create an instance of {@link TaxType }
     * 
     */
    public TaxType createTaxType() {
        return new TaxType();
    }

    /**
     * Create an instance of {@link PkgPriceType }
     * 
     */
    public PkgPriceType createPkgPriceType() {
        return new PkgPriceType();
    }

    /**
     * Create an instance of {@link InsurancePrefType }
     * 
     */
    public InsurancePrefType createInsurancePrefType() {
        return new InsurancePrefType();
    }

    /**
     * Create an instance of {@link AirAncillaryProductSummaryType }
     * 
     */
    public AirAncillaryProductSummaryType createAirAncillaryProductSummaryType() {
        return new AirAncillaryProductSummaryType();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link FarePriceType }
     * 
     */
    public FarePriceType createFarePriceType() {
        return new FarePriceType();
    }

    /**
     * Create an instance of {@link MembershipReservationType }
     * 
     */
    public MembershipReservationType createMembershipReservationType() {
        return new MembershipReservationType();
    }

    /**
     * Create an instance of {@link BoundedAffiliationsType }
     * 
     */
    public BoundedAffiliationsType createBoundedAffiliationsType() {
        return new BoundedAffiliationsType();
    }

    /**
     * Create an instance of {@link BasicEndorsementType }
     * 
     */
    public BasicEndorsementType createBasicEndorsementType() {
        return new BasicEndorsementType();
    }

    /**
     * Create an instance of {@link EquipmentDetailType }
     * 
     */
    public EquipmentDetailType createEquipmentDetailType() {
        return new EquipmentDetailType();
    }

    /**
     * Create an instance of {@link PropertyTypePrefType }
     * 
     */
    public PropertyTypePrefType createPropertyTypePrefType() {
        return new PropertyTypePrefType();
    }

    /**
     * Create an instance of {@link BankFavorRequestType }
     * 
     */
    public BankFavorRequestType createBankFavorRequestType() {
        return new BankFavorRequestType();
    }

    /**
     * Create an instance of {@link URLType }
     * 
     */
    public URLType createURLType() {
        return new URLType();
    }

    /**
     * Create an instance of {@link VerificationPNRPaymentType }
     * 
     */
    public VerificationPNRPaymentType createVerificationPNRPaymentType() {
        return new VerificationPNRPaymentType();
    }

    /**
     * Create an instance of {@link HotelPrefType }
     * 
     */
    public HotelPrefType createHotelPrefType() {
        return new HotelPrefType();
    }

    /**
     * Create an instance of {@link OntologyCodeType }
     * 
     */
    public OntologyCodeType createOntologyCodeType() {
        return new OntologyCodeType();
    }

    /**
     * Create an instance of {@link CustomerDetailsType }
     * 
     */
    public CustomerDetailsType createCustomerDetailsType() {
        return new CustomerDetailsType();
    }

    /**
     * Create an instance of {@link DescriptionsType }
     * 
     */
    public DescriptionsType createDescriptionsType() {
        return new DescriptionsType();
    }

    /**
     * Create an instance of {@link CorporateHierarchyType }
     * 
     */
    public CorporateHierarchyType createCorporateHierarchyType() {
        return new CorporateHierarchyType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link HotelResModifyResponseType }
     * 
     */
    public HotelResModifyResponseType createHotelResModifyResponseType() {
        return new HotelResModifyResponseType();
    }

    /**
     * Create an instance of {@link RoomStayCandidateType }
     * 
     */
    public RoomStayCandidateType createRoomStayCandidateType() {
        return new RoomStayCandidateType();
    }

    /**
     * Create an instance of {@link DestinationSystemCodesType }
     * 
     */
    public DestinationSystemCodesType createDestinationSystemCodesType() {
        return new DestinationSystemCodesType();
    }

    /**
     * Create an instance of {@link AdditionalGuestAmountType }
     * 
     */
    public AdditionalGuestAmountType createAdditionalGuestAmountType() {
        return new AdditionalGuestAmountType();
    }

    /**
     * Create an instance of {@link FerryContactPersonType }
     * 
     */
    public FerryContactPersonType createFerryContactPersonType() {
        return new FerryContactPersonType();
    }

    /**
     * Create an instance of {@link AmadeusWarningType }
     * 
     */
    public AmadeusWarningType createAmadeusWarningType() {
        return new AmadeusWarningType();
    }

    /**
     * Create an instance of {@link FerryAddressType }
     * 
     */
    public FerryAddressType createFerryAddressType() {
        return new FerryAddressType();
    }

    /**
     * Create an instance of {@link AdvancePurchaseType }
     * 
     */
    public AdvancePurchaseType createAdvancePurchaseType() {
        return new AdvancePurchaseType();
    }

    /**
     * Create an instance of {@link PetInfoPrefType }
     * 
     */
    public PetInfoPrefType createPetInfoPrefType() {
        return new PetInfoPrefType();
    }

    /**
     * Create an instance of {@link CouponRefundRulesType }
     * 
     */
    public CouponRefundRulesType createCouponRefundRulesType() {
        return new CouponRefundRulesType();
    }

    /**
     * Create an instance of {@link BookingSummaryType }
     * 
     */
    public BookingSummaryType createBookingSummaryType() {
        return new BookingSummaryType();
    }

    /**
     * Create an instance of {@link PermissionType }
     * 
     */
    public PermissionType createPermissionType() {
        return new PermissionType();
    }

    /**
     * Create an instance of {@link RateRangesType }
     * 
     */
    public RateRangesType createRateRangesType() {
        return new RateRangesType();
    }

    /**
     * Create an instance of {@link OntologyAgeBirthDateType }
     * 
     */
    public OntologyAgeBirthDateType createOntologyAgeBirthDateType() {
        return new OntologyAgeBirthDateType();
    }

    /**
     * Create an instance of {@link ListLevelOfService }
     * 
     */
    public ListLevelOfService createListLevelOfService() {
        return new ListLevelOfService();
    }

    /**
     * Create an instance of {@link InsuranceType }
     * 
     */
    public InsuranceType createInsuranceType() {
        return new InsuranceType();
    }

    /**
     * Create an instance of {@link S7Type }
     * 
     */
    public S7Type createS7Type() {
        return new S7Type();
    }

    /**
     * Create an instance of {@link ListRateCategory }
     * 
     */
    public ListRateCategory createListRateCategory() {
        return new ListRateCategory();
    }

    /**
     * Create an instance of {@link RoomLocationPrefType }
     * 
     */
    public RoomLocationPrefType createRoomLocationPrefType() {
        return new RoomLocationPrefType();
    }

    /**
     * Create an instance of {@link InfoType }
     * 
     */
    public InfoType createInfoType() {
        return new InfoType();
    }

    /**
     * Create an instance of {@link CorporatePoliciesType }
     * 
     */
    public CorporatePoliciesType createCorporatePoliciesType() {
        return new CorporatePoliciesType();
    }

    /**
     * Create an instance of {@link AuditType }
     * 
     */
    public AuditType createAuditType() {
        return new AuditType();
    }

    /**
     * Create an instance of {@link AdditionalDetailType }
     * 
     */
    public AdditionalDetailType createAdditionalDetailType() {
        return new AdditionalDetailType();
    }

    /**
     * Create an instance of {@link AttachmentsType }
     * 
     */
    public AttachmentsType createAttachmentsType() {
        return new AttachmentsType();
    }

    /**
     * Create an instance of {@link FerryPaymentCardType }
     * 
     */
    public FerryPaymentCardType createFerryPaymentCardType() {
        return new FerryPaymentCardType();
    }

    /**
     * Create an instance of {@link InsuranceCustomerType }
     * 
     */
    public InsuranceCustomerType createInsuranceCustomerType() {
        return new InsuranceCustomerType();
    }

    /**
     * Create an instance of {@link PassengerTypeQuantityType }
     * 
     */
    public PassengerTypeQuantityType createPassengerTypeQuantityType() {
        return new PassengerTypeQuantityType();
    }

    /**
     * Create an instance of {@link ListFeeTaxType }
     * 
     */
    public ListFeeTaxType createListFeeTaxType() {
        return new ListFeeTaxType();
    }

    /**
     * Create an instance of {@link IRRCertificateType }
     * 
     */
    public IRRCertificateType createIRRCertificateType() {
        return new IRRCertificateType();
    }

    /**
     * Create an instance of {@link VehicleEquipmentType }
     * 
     */
    public VehicleEquipmentType createVehicleEquipmentType() {
        return new VehicleEquipmentType();
    }

    /**
     * Create an instance of {@link OperationSchedulePlusRPHType }
     * 
     */
    public OperationSchedulePlusRPHType createOperationSchedulePlusRPHType() {
        return new OperationSchedulePlusRPHType();
    }

    /**
     * Create an instance of {@link TravelArrangerType }
     * 
     */
    public TravelArrangerType createTravelArrangerType() {
        return new TravelArrangerType();
    }

    /**
     * Create an instance of {@link RequiredPaymentLiteType }
     * 
     */
    public RequiredPaymentLiteType createRequiredPaymentLiteType() {
        return new RequiredPaymentLiteType();
    }

    /**
     * Create an instance of {@link TSPaymentOptionTypes }
     * 
     */
    public TSPaymentOptionTypes createTSPaymentOptionTypes() {
        return new TSPaymentOptionTypes();
    }

    /**
     * Create an instance of {@link FareBasisSourceAttrType }
     * 
     */
    public FareBasisSourceAttrType createFareBasisSourceAttrType() {
        return new FareBasisSourceAttrType();
    }

    /**
     * Create an instance of {@link FerryCompanyNameType }
     * 
     */
    public FerryCompanyNameType createFerryCompanyNameType() {
        return new FerryCompanyNameType();
    }

    /**
     * Create an instance of {@link OriginDestinationSummaryTypeDEPRECATE }
     * 
     */
    public OriginDestinationSummaryTypeDEPRECATE createOriginDestinationSummaryTypeDEPRECATE() {
        return new OriginDestinationSummaryTypeDEPRECATE();
    }

    /**
     * Create an instance of {@link AccommodationCategoryBaseType }
     * 
     */
    public AccommodationCategoryBaseType createAccommodationCategoryBaseType() {
        return new AccommodationCategoryBaseType();
    }

    /**
     * Create an instance of {@link BlackoutDateType }
     * 
     */
    public BlackoutDateType createBlackoutDateType() {
        return new BlackoutDateType();
    }

    /**
     * Create an instance of {@link ExPriceAdjustmentType }
     * 
     */
    public ExPriceAdjustmentType createExPriceAdjustmentType() {
        return new ExPriceAdjustmentType();
    }

    /**
     * Create an instance of {@link FareBasisSegAttrType }
     * 
     */
    public FareBasisSegAttrType createFareBasisSegAttrType() {
        return new FareBasisSegAttrType();
    }

    /**
     * Create an instance of {@link TSTokenType }
     * 
     */
    public TSTokenType createTSTokenType() {
        return new TSTokenType();
    }

    /**
     * Create an instance of {@link TerminalType }
     * 
     */
    public TerminalType createTerminalType() {
        return new TerminalType();
    }

    /**
     * Create an instance of {@link CommissionInfoType }
     * 
     */
    public CommissionInfoType createCommissionInfoType() {
        return new CommissionInfoType();
    }

    /**
     * Create an instance of {@link QuoteDetailType }
     * 
     */
    public QuoteDetailType createQuoteDetailType() {
        return new QuoteDetailType();
    }

    /**
     * Create an instance of {@link ListDataActionType }
     * 
     */
    public ListDataActionType createListDataActionType() {
        return new ListDataActionType();
    }

    /**
     * Create an instance of {@link ListRecycleFacilityLocation }
     * 
     */
    public ListRecycleFacilityLocation createListRecycleFacilityLocation() {
        return new ListRecycleFacilityLocation();
    }

    /**
     * Create an instance of {@link BundleBoundProductsType }
     * 
     */
    public BundleBoundProductsType createBundleBoundProductsType() {
        return new BundleBoundProductsType();
    }

    /**
     * Create an instance of {@link OJVoucherImportHistoryType }
     * 
     */
    public OJVoucherImportHistoryType createOJVoucherImportHistoryType() {
        return new OJVoucherImportHistoryType();
    }

    /**
     * Create an instance of {@link EmployerType }
     * 
     */
    public EmployerType createEmployerType() {
        return new EmployerType();
    }

    /**
     * Create an instance of {@link PropertyClassPrefType }
     * 
     */
    public PropertyClassPrefType createPropertyClassPrefType() {
        return new PropertyClassPrefType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.PaymentModel }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.PaymentModel createPaymentModel() {
        return new com.airchina.datacenter.spnr.sdk.entity.PaymentModel();
    }

    /**
     * Create an instance of {@link AdjustedCurrencyAmountType }
     * 
     */
    public AdjustedCurrencyAmountType createAdjustedCurrencyAmountType() {
        return new AdjustedCurrencyAmountType();
    }

    /**
     * Create an instance of {@link AirAncillaryLoungeContentType }
     * 
     */
    public AirAncillaryLoungeContentType createAirAncillaryLoungeContentType() {
        return new AirAncillaryLoungeContentType();
    }

    /**
     * Create an instance of {@link OntologyNameType }
     * 
     */
    public OntologyNameType createOntologyNameType() {
        return new OntologyNameType();
    }

    /**
     * Create an instance of {@link AirReservationTravelerInfo }
     * 
     */
    public AirReservationTravelerInfo createAirReservationTravelerInfo() {
        return new AirReservationTravelerInfo();
    }

    /**
     * Create an instance of {@link OperationSchedulePlusChargeType }
     * 
     */
    public OperationSchedulePlusChargeType createOperationSchedulePlusChargeType() {
        return new OperationSchedulePlusChargeType();
    }

    /**
     * Create an instance of {@link PassengerFareBreakdown }
     * 
     */
    public PassengerFareBreakdown createPassengerFareBreakdown() {
        return new PassengerFareBreakdown();
    }

    /**
     * Create an instance of {@link AirProductDetailsType }
     * 
     */
    public AirProductDetailsType createAirProductDetailsType() {
        return new AirProductDetailsType();
    }

    /**
     * Create an instance of {@link ImageDataType }
     * 
     */
    public ImageDataType createImageDataType() {
        return new ImageDataType();
    }

    /**
     * Create an instance of {@link CoverageDetailsType }
     * 
     */
    public CoverageDetailsType createCoverageDetailsType() {
        return new CoverageDetailsType();
    }

    /**
     * Create an instance of {@link AncillaryBundleProductsType }
     * 
     */
    public AncillaryBundleProductsType createAncillaryBundleProductsType() {
        return new AncillaryBundleProductsType();
    }

    /**
     * Create an instance of {@link AffiliationsType }
     * 
     */
    public AffiliationsType createAffiliationsType() {
        return new AffiliationsType();
    }

    /**
     * Create an instance of {@link TransportationsType }
     * 
     */
    public TransportationsType createTransportationsType() {
        return new TransportationsType();
    }

    /**
     * Create an instance of {@link ListRatePlanType }
     * 
     */
    public ListRatePlanType createListRatePlanType() {
        return new ListRatePlanType();
    }

    /**
     * Create an instance of {@link TelephoneInfoType }
     * 
     */
    public TelephoneInfoType createTelephoneInfoType() {
        return new TelephoneInfoType();
    }

    /**
     * Create an instance of {@link CouponRuleType }
     * 
     */
    public CouponRuleType createCouponRuleType() {
        return new CouponRuleType();
    }

    /**
     * Create an instance of {@link IntegerRangeOJType }
     * 
     */
    public IntegerRangeOJType createIntegerRangeOJType() {
        return new IntegerRangeOJType();
    }

    /**
     * Create an instance of {@link BankFavorInfoType }
     * 
     */
    public BankFavorInfoType createBankFavorInfoType() {
        return new BankFavorInfoType();
    }

    /**
     * Create an instance of {@link RedemptionTransactionType }
     * 
     */
    public RedemptionTransactionType createRedemptionTransactionType() {
        return new RedemptionTransactionType();
    }

    /**
     * Create an instance of {@link AlternateLocationInfoType }
     * 
     */
    public AlternateLocationInfoType createAlternateLocationInfoType() {
        return new AlternateLocationInfoType();
    }

    /**
     * Create an instance of {@link FerrySourceType }
     * 
     */
    public FerrySourceType createFerrySourceType() {
        return new FerrySourceType();
    }

    /**
     * Create an instance of {@link TimeDurationType }
     * 
     */
    public TimeDurationType createTimeDurationType() {
        return new TimeDurationType();
    }

    /**
     * Create an instance of {@link CancellationRefundDetailsType }
     * 
     */
    public CancellationRefundDetailsType createCancellationRefundDetailsType() {
        return new CancellationRefundDetailsType();
    }

    /**
     * Create an instance of {@link VehicleChargePurposeType }
     * 
     */
    public VehicleChargePurposeType createVehicleChargePurposeType() {
        return new VehicleChargePurposeType();
    }

    /**
     * Create an instance of {@link ContextType }
     * 
     */
    public ContextType createContextType() {
        return new ContextType();
    }

    /**
     * Create an instance of {@link BusinessSrvcPrefType }
     * 
     */
    public BusinessSrvcPrefType createBusinessSrvcPrefType() {
        return new BusinessSrvcPrefType();
    }

    /**
     * Create an instance of {@link ListTravelPurpose }
     * 
     */
    public ListTravelPurpose createListTravelPurpose() {
        return new ListTravelPurpose();
    }

    /**
     * Create an instance of {@link S5Type }
     * 
     */
    public S5Type createS5Type() {
        return new S5Type();
    }

    /**
     * Create an instance of {@link ImagesType }
     * 
     */
    public ImagesType createImagesType() {
        return new ImagesType();
    }

    /**
     * Create an instance of {@link SurchargesType }
     * 
     */
    public SurchargesType createSurchargesType() {
        return new SurchargesType();
    }

    /**
     * Create an instance of {@link CurrencyAmountType }
     * 
     */
    public CurrencyAmountType createCurrencyAmountType() {
        return new CurrencyAmountType();
    }

    /**
     * Create an instance of {@link RoomRateLiteType }
     * 
     */
    public RoomRateLiteType createRoomRateLiteType() {
        return new RoomRateLiteType();
    }

    /**
     * Create an instance of {@link DepartType }
     * 
     */
    public DepartType createDepartType() {
        return new DepartType();
    }

    /**
     * Create an instance of {@link ListAgeCategory }
     * 
     */
    public ListAgeCategory createListAgeCategory() {
        return new ListAgeCategory();
    }

    /**
     * Create an instance of {@link ListGolferType }
     * 
     */
    public ListGolferType createListGolferType() {
        return new ListGolferType();
    }

    /**
     * Create an instance of {@link CouponUsageRulesType }
     * 
     */
    public CouponUsageRulesType createCouponUsageRulesType() {
        return new CouponUsageRulesType();
    }

    /**
     * Create an instance of {@link BookingPriceInfoType }
     * 
     */
    public BookingPriceInfoType createBookingPriceInfoType() {
        return new BookingPriceInfoType();
    }

    /**
     * Create an instance of {@link ProtectedDataType }
     * 
     */
    public ProtectedDataType createProtectedDataType() {
        return new ProtectedDataType();
    }

    /**
     * Create an instance of {@link FlightCOSSeatType }
     * 
     */
    public FlightCOSSeatType createFlightCOSSeatType() {
        return new FlightCOSSeatType();
    }

    /**
     * Create an instance of {@link ServiceItemRefType }
     * 
     */
    public ServiceItemRefType createServiceItemRefType() {
        return new ServiceItemRefType();
    }

    /**
     * Create an instance of {@link ListPowerType }
     * 
     */
    public ListPowerType createListPowerType() {
        return new ListPowerType();
    }

    /**
     * Create an instance of {@link ReferencePlaceHolderType }
     * 
     */
    public ReferencePlaceHolderType createReferencePlaceHolderType() {
        return new ReferencePlaceHolderType();
    }

    /**
     * Create an instance of {@link CorporateActionType }
     * 
     */
    public CorporateActionType createCorporateActionType() {
        return new CorporateActionType();
    }

    /**
     * Create an instance of {@link OwnInsuranceChoiceType }
     * 
     */
    public OwnInsuranceChoiceType createOwnInsuranceChoiceType() {
        return new OwnInsuranceChoiceType();
    }

    /**
     * Create an instance of {@link DestActivityReadRequestType }
     * 
     */
    public DestActivityReadRequestType createDestActivityReadRequestType() {
        return new DestActivityReadRequestType();
    }

    /**
     * Create an instance of {@link FQTVInfoSegType }
     * 
     */
    public FQTVInfoSegType createFQTVInfoSegType() {
        return new FQTVInfoSegType();
    }

    /**
     * Create an instance of {@link SearchBankType }
     * 
     */
    public SearchBankType createSearchBankType() {
        return new SearchBankType();
    }

    /**
     * Create an instance of {@link CabinDetail }
     * 
     */
    public CabinDetail createCabinDetail() {
        return new CabinDetail();
    }

    /**
     * Create an instance of {@link StreetNmbrType }
     * 
     */
    public StreetNmbrType createStreetNmbrType() {
        return new StreetNmbrType();
    }

    /**
     * Create an instance of {@link AgentDetailsType }
     * 
     */
    public AgentDetailsType createAgentDetailsType() {
        return new AgentDetailsType();
    }

    /**
     * Create an instance of {@link LoyaltyRuleType }
     * 
     */
    public LoyaltyRuleType createLoyaltyRuleType() {
        return new LoyaltyRuleType();
    }

    /**
     * Create an instance of {@link RelatedTravelerType }
     * 
     */
    public RelatedTravelerType createRelatedTravelerType() {
        return new RelatedTravelerType();
    }

    /**
     * Create an instance of {@link TicketDistribPrefType }
     * 
     */
    public TicketDistribPrefType createTicketDistribPrefType() {
        return new TicketDistribPrefType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link TrainIdentificationType }
     * 
     */
    public TrainIdentificationType createTrainIdentificationType() {
        return new TrainIdentificationType();
    }

    /**
     * Create an instance of {@link TrainSegmentSummaryType }
     * 
     */
    public TrainSegmentSummaryType createTrainSegmentSummaryType() {
        return new TrainSegmentSummaryType();
    }

    /**
     * Create an instance of {@link AircraftType }
     * 
     */
    public AircraftType createAircraftType() {
        return new AircraftType();
    }

    /**
     * Create an instance of {@link TierRateType }
     * 
     */
    public TierRateType createTierRateType() {
        return new TierRateType();
    }

    /**
     * Create an instance of {@link CompanyNamePrefType }
     * 
     */
    public CompanyNamePrefType createCompanyNamePrefType() {
        return new CompanyNamePrefType();
    }

    /**
     * Create an instance of {@link CorporatePolicyType }
     * 
     */
    public CorporatePolicyType createCorporatePolicyType() {
        return new CorporatePolicyType();
    }

    /**
     * Create an instance of {@link ContactInfoRootType }
     * 
     */
    public ContactInfoRootType createContactInfoRootType() {
        return new ContactInfoRootType();
    }

    /**
     * Create an instance of {@link CompanyNameType }
     * 
     */
    public CompanyNameType createCompanyNameType() {
        return new CompanyNameType();
    }

    /**
     * Create an instance of {@link FreeTextType }
     * 
     */
    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    /**
     * Create an instance of {@link PropertyIdentityType }
     * 
     */
    public PropertyIdentityType createPropertyIdentityType() {
        return new PropertyIdentityType();
    }

    /**
     * Create an instance of {@link RateLiteType }
     * 
     */
    public RateLiteType createRateLiteType() {
        return new RateLiteType();
    }

    /**
     * Create an instance of {@link AddressInfoType }
     * 
     */
    public AddressInfoType createAddressInfoType() {
        return new AddressInfoType();
    }

    /**
     * Create an instance of {@link CorporateNode }
     * 
     */
    public CorporateNode createCorporateNode() {
        return new CorporateNode();
    }

    /**
     * Create an instance of {@link AirAncillaryProductPaxChangeFeesType }
     * 
     */
    public AirAncillaryProductPaxChangeFeesType createAirAncillaryProductPaxChangeFeesType() {
        return new AirAncillaryProductPaxChangeFeesType();
    }

    /**
     * Create an instance of {@link EarnType }
     * 
     */
    public EarnType createEarnType() {
        return new EarnType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link TelephoneType }
     * 
     */
    public TelephoneType createTelephoneType() {
        return new TelephoneType();
    }

    /**
     * Create an instance of {@link StateProvType }
     * 
     */
    public StateProvType createStateProvType() {
        return new StateProvType();
    }

    /**
     * Create an instance of {@link OntologyTripModeType }
     * 
     */
    public OntologyTripModeType createOntologyTripModeType() {
        return new OntologyTripModeType();
    }

    /**
     * Create an instance of {@link LocationGeneralType }
     * 
     */
    public LocationGeneralType createLocationGeneralType() {
        return new LocationGeneralType();
    }

    /**
     * Create an instance of {@link TravelDateTimeType }
     * 
     */
    public TravelDateTimeType createTravelDateTimeType() {
        return new TravelDateTimeType();
    }

    /**
     * Create an instance of {@link ImageFormatTextType }
     * 
     */
    public ImageFormatTextType createImageFormatTextType() {
        return new ImageFormatTextType();
    }

    /**
     * Create an instance of {@link CouponValueType }
     * 
     */
    public CouponValueType createCouponValueType() {
        return new CouponValueType();
    }

    /**
     * Create an instance of {@link FerryTravellerCountType }
     * 
     */
    public FerryTravellerCountType createFerryTravellerCountType() {
        return new FerryTravellerCountType();
    }

    /**
     * Create an instance of {@link IncludesType }
     * 
     */
    public IncludesType createIncludesType() {
        return new IncludesType();
    }

    /**
     * Create an instance of {@link ExAgentDetailsType }
     * 
     */
    public ExAgentDetailsType createExAgentDetailsType() {
        return new ExAgentDetailsType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.RelativePosition }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.RelativePosition createRelativePosition() {
        return new com.airchina.datacenter.spnr.sdk.entity.RelativePosition();
    }

    /**
     * Create an instance of {@link FlightSegmentWithPrice }
     * 
     */
    public FlightSegmentWithPrice createFlightSegmentWithPrice() {
        return new FlightSegmentWithPrice();
    }

    /**
     * Create an instance of {@link IssuerNameType }
     * 
     */
    public IssuerNameType createIssuerNameType() {
        return new IssuerNameType();
    }

    /**
     * Create an instance of {@link ItineraryPassengersType }
     * 
     */
    public ItineraryPassengersType createItineraryPassengersType() {
        return new ItineraryPassengersType();
    }

    /**
     * Create an instance of {@link BaggageDimensionsType }
     * 
     */
    public BaggageDimensionsType createBaggageDimensionsType() {
        return new BaggageDimensionsType();
    }

    /**
     * Create an instance of {@link SurchargeType }
     * 
     */
    public SurchargeType createSurchargeType() {
        return new SurchargeType();
    }

    /**
     * Create an instance of {@link SPNRWarningsType }
     * 
     */
    public SPNRWarningsType createSPNRWarningsType() {
        return new SPNRWarningsType();
    }

    /**
     * Create an instance of {@link PkgFlightSegmentType }
     * 
     */
    public PkgFlightSegmentType createPkgFlightSegmentType() {
        return new PkgFlightSegmentType();
    }

    /**
     * Create an instance of {@link DateRangeOJType }
     * 
     */
    public DateRangeOJType createDateRangeOJType() {
        return new DateRangeOJType();
    }

    /**
     * Create an instance of {@link FerryPOSType }
     * 
     */
    public FerryPOSType createFerryPOSType() {
        return new FerryPOSType();
    }

    /**
     * Create an instance of {@link SPNRPriceAdjustmentType }
     * 
     */
    public SPNRPriceAdjustmentType createSPNRPriceAdjustmentType() {
        return new SPNRPriceAdjustmentType();
    }

    /**
     * Create an instance of {@link TravelerRulesType }
     * 
     */
    public TravelerRulesType createTravelerRulesType() {
        return new TravelerRulesType();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link PersonalSrvcPrefType }
     * 
     */
    public PersonalSrvcPrefType createPersonalSrvcPrefType() {
        return new PersonalSrvcPrefType();
    }

    /**
     * Create an instance of {@link VehicleEquipmentPricedType }
     * 
     */
    public VehicleEquipmentPricedType createVehicleEquipmentPricedType() {
        return new VehicleEquipmentPricedType();
    }

    /**
     * Create an instance of {@link AmendmentFeeType }
     * 
     */
    public AmendmentFeeType createAmendmentFeeType() {
        return new AmendmentFeeType();
    }

    /**
     * Create an instance of {@link VerificationTicketingType }
     * 
     */
    public VerificationTicketingType createVerificationTicketingType() {
        return new VerificationTicketingType();
    }

    /**
     * Create an instance of {@link SPNRBaggageDimensionsType }
     * 
     */
    public SPNRBaggageDimensionsType createSPNRBaggageDimensionsType() {
        return new SPNRBaggageDimensionsType();
    }

    /**
     * Create an instance of {@link AirFeeType }
     * 
     */
    public AirFeeType createAirFeeType() {
        return new AirFeeType();
    }

    /**
     * Create an instance of {@link AdvanceReservationType }
     * 
     */
    public AdvanceReservationType createAdvanceReservationType() {
        return new AdvanceReservationType();
    }

    /**
     * Create an instance of {@link ResGlobalInfoType }
     * 
     */
    public ResGlobalInfoType createResGlobalInfoType() {
        return new ResGlobalInfoType();
    }

    /**
     * Create an instance of {@link LegMilesType }
     * 
     */
    public LegMilesType createLegMilesType() {
        return new LegMilesType();
    }

    /**
     * Create an instance of {@link AmadeusWarningsType }
     * 
     */
    public AmadeusWarningsType createAmadeusWarningsType() {
        return new AmadeusWarningsType();
    }

    /**
     * Create an instance of {@link TaxesCollectionType }
     * 
     */
    public TaxesCollectionType createTaxesCollectionType() {
        return new TaxesCollectionType();
    }

    /**
     * Create an instance of {@link BerthDetailType }
     * 
     */
    public BerthDetailType createBerthDetailType() {
        return new BerthDetailType();
    }

    /**
     * Create an instance of {@link GroundTransportServiceType }
     * 
     */
    public GroundTransportServiceType createGroundTransportServiceType() {
        return new GroundTransportServiceType();
    }

    /**
     * Create an instance of {@link ReservationsType }
     * 
     */
    public ReservationsType createReservationsType() {
        return new ReservationsType();
    }

    /**
     * Create an instance of {@link ListChargeFrequency }
     * 
     */
    public ListChargeFrequency createListChargeFrequency() {
        return new ListChargeFrequency();
    }

    /**
     * Create an instance of {@link PolicyDetailType }
     * 
     */
    public PolicyDetailType createPolicyDetailType() {
        return new PolicyDetailType();
    }

    /**
     * Create an instance of {@link AccommodationProductDetailsType }
     * 
     */
    public AccommodationProductDetailsType createAccommodationProductDetailsType() {
        return new AccommodationProductDetailsType();
    }

    /**
     * Create an instance of {@link ClassCodeType }
     * 
     */
    public ClassCodeType createClassCodeType() {
        return new ClassCodeType();
    }

    /**
     * Create an instance of {@link ListAirTripType }
     * 
     */
    public ListAirTripType createListAirTripType() {
        return new ListAirTripType();
    }

    /**
     * Create an instance of {@link AncillaryImage }
     * 
     */
    public AncillaryImage createAncillaryImage() {
        return new AncillaryImage();
    }

    /**
     * Create an instance of {@link OJFailedVoucherType }
     * 
     */
    public OJFailedVoucherType createOJFailedVoucherType() {
        return new OJFailedVoucherType();
    }

    /**
     * Create an instance of {@link AgencyPartyType }
     * 
     */
    public AgencyPartyType createAgencyPartyType() {
        return new AgencyPartyType();
    }

    /**
     * Create an instance of {@link SocialNetworkingType }
     * 
     */
    public SocialNetworkingType createSocialNetworkingType() {
        return new SocialNetworkingType();
    }

    /**
     * Create an instance of {@link AirRemarkType }
     * 
     */
    public AirRemarkType createAirRemarkType() {
        return new AirRemarkType();
    }

    /**
     * Create an instance of {@link AirAncillariesJourneyProductSummaryType }
     * 
     */
    public AirAncillariesJourneyProductSummaryType createAirAncillariesJourneyProductSummaryType() {
        return new AirAncillariesJourneyProductSummaryType();
    }

    /**
     * Create an instance of {@link RoomAmenityMixedType }
     * 
     */
    public RoomAmenityMixedType createRoomAmenityMixedType() {
        return new RoomAmenityMixedType();
    }

    /**
     * Create an instance of {@link FormattedTextTextType }
     * 
     */
    public FormattedTextTextType createFormattedTextTextType() {
        return new FormattedTextTextType();
    }

    /**
     * Create an instance of {@link StageType }
     * 
     */
    public StageType createStageType() {
        return new StageType();
    }

    /**
     * Create an instance of {@link ListProximity }
     * 
     */
    public ListProximity createListProximity() {
        return new ListProximity();
    }

    /**
     * Create an instance of {@link ListUnitOfMeasure }
     * 
     */
    public ListUnitOfMeasure createListUnitOfMeasure() {
        return new ListUnitOfMeasure();
    }

    /**
     * Create an instance of {@link PetCountType }
     * 
     */
    public PetCountType createPetCountType() {
        return new PetCountType();
    }

    /**
     * Create an instance of {@link BeverageType }
     * 
     */
    public BeverageType createBeverageType() {
        return new BeverageType();
    }

    /**
     * Create an instance of {@link VehicleRetrieveResRSAdditionalInfoType }
     * 
     */
    public VehicleRetrieveResRSAdditionalInfoType createVehicleRetrieveResRSAdditionalInfoType() {
        return new VehicleRetrieveResRSAdditionalInfoType();
    }

    /**
     * Create an instance of {@link CodeListDetailExtension }
     * 
     */
    public CodeListDetailExtension createCodeListDetailExtension() {
        return new CodeListDetailExtension();
    }

    /**
     * Create an instance of {@link PaymentCardHolderType }
     * 
     */
    public PaymentCardHolderType createPaymentCardHolderType() {
        return new PaymentCardHolderType();
    }

    /**
     * Create an instance of {@link SupplementChargesType }
     * 
     */
    public SupplementChargesType createSupplementChargesType() {
        return new SupplementChargesType();
    }

    /**
     * Create an instance of {@link TravelerRuleType }
     * 
     */
    public TravelerRuleType createTravelerRuleType() {
        return new TravelerRuleType();
    }

    /**
     * Create an instance of {@link PropertyAmenityPrefType }
     * 
     */
    public PropertyAmenityPrefType createPropertyAmenityPrefType() {
        return new PropertyAmenityPrefType();
    }

    /**
     * Create an instance of {@link ExtraProductDetailsType }
     * 
     */
    public ExtraProductDetailsType createExtraProductDetailsType() {
        return new ExtraProductDetailsType();
    }

    /**
     * Create an instance of {@link ListSSRType }
     * 
     */
    public ListSSRType createListSSRType() {
        return new ListSSRType();
    }

    /**
     * Create an instance of {@link CancelInfoRQType }
     * 
     */
    public CancelInfoRQType createCancelInfoRQType() {
        return new CancelInfoRQType();
    }

    /**
     * Create an instance of {@link InvCountType }
     * 
     */
    public InvCountType createInvCountType() {
        return new InvCountType();
    }

    /**
     * Create an instance of {@link PhysChallFeaturePrefType }
     * 
     */
    public PhysChallFeaturePrefType createPhysChallFeaturePrefType() {
        return new PhysChallFeaturePrefType();
    }

    /**
     * Create an instance of {@link BoardingPassType }
     * 
     */
    public BoardingPassType createBoardingPassType() {
        return new BoardingPassType();
    }

    /**
     * Create an instance of {@link FerryWarningType }
     * 
     */
    public FerryWarningType createFerryWarningType() {
        return new FerryWarningType();
    }

    /**
     * Create an instance of {@link ProductAuditType }
     * 
     */
    public ProductAuditType createProductAuditType() {
        return new ProductAuditType();
    }

    /**
     * Create an instance of {@link FlightMealsType }
     * 
     */
    public FlightMealsType createFlightMealsType() {
        return new FlightMealsType();
    }

    /**
     * Create an instance of {@link ResDateTimeType }
     * 
     */
    public ResDateTimeType createResDateTimeType() {
        return new ResDateTimeType();
    }

    /**
     * Create an instance of {@link AcceptedPaymentsType }
     * 
     */
    public AcceptedPaymentsType createAcceptedPaymentsType() {
        return new AcceptedPaymentsType();
    }

    /**
     * Create an instance of {@link HotelResResponseType }
     * 
     */
    public HotelResResponseType createHotelResResponseType() {
        return new HotelResResponseType();
    }

    /**
     * Create an instance of {@link SPNRFareType }
     * 
     */
    public SPNRFareType createSPNRFareType() {
        return new SPNRFareType();
    }

    /**
     * Create an instance of {@link TravelerCountType }
     * 
     */
    public TravelerCountType createTravelerCountType() {
        return new TravelerCountType();
    }

    /**
     * Create an instance of {@link RemarksType }
     * 
     */
    public RemarksType createRemarksType() {
        return new RemarksType();
    }

    /**
     * Create an instance of {@link ModifyTypesType }
     * 
     */
    public ModifyTypesType createModifyTypesType() {
        return new ModifyTypesType();
    }

    /**
     * Create an instance of {@link CustomersType }
     * 
     */
    public CustomersType createCustomersType() {
        return new CustomersType();
    }

    /**
     * Create an instance of {@link ProductDescriptionType }
     * 
     */
    public ProductDescriptionType createProductDescriptionType() {
        return new ProductDescriptionType();
    }

    /**
     * Create an instance of {@link FeeDescType }
     * 
     */
    public FeeDescType createFeeDescType() {
        return new FeeDescType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Restriction }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Restriction createRestriction() {
        return new com.airchina.datacenter.spnr.sdk.entity.Restriction();
    }

    /**
     * Create an instance of {@link PortLocationType }
     * 
     */
    public PortLocationType createPortLocationType() {
        return new PortLocationType();
    }

    /**
     * Create an instance of {@link VehicleWhereAtFacilityType }
     * 
     */
    public VehicleWhereAtFacilityType createVehicleWhereAtFacilityType() {
        return new VehicleWhereAtFacilityType();
    }

    /**
     * Create an instance of {@link SeatMapRowNbrType }
     * 
     */
    public SeatMapRowNbrType createSeatMapRowNbrType() {
        return new SeatMapRowNbrType();
    }

    /**
     * Create an instance of {@link InterestPrefType }
     * 
     */
    public InterestPrefType createInterestPrefType() {
        return new InterestPrefType();
    }

    /**
     * Create an instance of {@link OJVoucherType }
     * 
     */
    public OJVoucherType createOJVoucherType() {
        return new OJVoucherType();
    }

    /**
     * Create an instance of {@link NetworkCodeType }
     * 
     */
    public NetworkCodeType createNetworkCodeType() {
        return new NetworkCodeType();
    }

    /**
     * Create an instance of {@link RailPassengerOccupationType }
     * 
     */
    public RailPassengerOccupationType createRailPassengerOccupationType() {
        return new RailPassengerOccupationType();
    }

    /**
     * Create an instance of {@link AmountPercentType }
     * 
     */
    public AmountPercentType createAmountPercentType() {
        return new AmountPercentType();
    }

    /**
     * Create an instance of {@link CancellationRefundsType }
     * 
     */
    public CancellationRefundsType createCancellationRefundsType() {
        return new CancellationRefundsType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.AccommodationClass }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.AccommodationClass createAccommodationClass() {
        return new com.airchina.datacenter.spnr.sdk.entity.AccommodationClass();
    }

    /**
     * Create an instance of {@link RailPassengerCategoryDetailType }
     * 
     */
    public RailPassengerCategoryDetailType createRailPassengerCategoryDetailType() {
        return new RailPassengerCategoryDetailType();
    }

    /**
     * Create an instance of {@link OJRequestType }
     * 
     */
    public OJRequestType createOJRequestType() {
        return new OJRequestType();
    }

    /**
     * Create an instance of {@link ListChargeUnit }
     * 
     */
    public ListChargeUnit createListChargeUnit() {
        return new ListChargeUnit();
    }

    /**
     * Create an instance of {@link ListVehSize }
     * 
     */
    public ListVehSize createListVehSize() {
        return new ListVehSize();
    }

    /**
     * Create an instance of {@link ListPaymentCardIssuer }
     * 
     */
    public ListPaymentCardIssuer createListPaymentCardIssuer() {
        return new ListPaymentCardIssuer();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.UserType }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.UserType createUserType() {
        return new com.airchina.datacenter.spnr.sdk.entity.UserType();
    }

    /**
     * Create an instance of {@link BaseItineraryType }
     * 
     */
    public BaseItineraryType createBaseItineraryType() {
        return new BaseItineraryType();
    }

    /**
     * Create an instance of {@link TouchPointType }
     * 
     */
    public TouchPointType createTouchPointType() {
        return new TouchPointType();
    }

    /**
     * Create an instance of {@link TimeInstantType }
     * 
     */
    public TimeInstantType createTimeInstantType() {
        return new TimeInstantType();
    }

    /**
     * Create an instance of {@link ModifyTypeType }
     * 
     */
    public ModifyTypeType createModifyTypeType() {
        return new ModifyTypeType();
    }

    /**
     * Create an instance of {@link ListLoyaltyPrgCurrency }
     * 
     */
    public ListLoyaltyPrgCurrency createListLoyaltyPrgCurrency() {
        return new ListLoyaltyPrgCurrency();
    }

    /**
     * Create an instance of {@link FerryWarningsType }
     * 
     */
    public FerryWarningsType createFerryWarningsType() {
        return new FerryWarningsType();
    }

    /**
     * Create an instance of {@link AccommodationDetailType }
     * 
     */
    public AccommodationDetailType createAccommodationDetailType() {
        return new AccommodationDetailType();
    }

    /**
     * Create an instance of {@link TravelPurposeType }
     * 
     */
    public TravelPurposeType createTravelPurposeType() {
        return new TravelPurposeType();
    }

    /**
     * Create an instance of {@link PkgCautionType }
     * 
     */
    public PkgCautionType createPkgCautionType() {
        return new PkgCautionType();
    }

    /**
     * Create an instance of {@link AirAncillaryOffsetProductType }
     * 
     */
    public AirAncillaryOffsetProductType createAirAncillaryOffsetProductType() {
        return new AirAncillaryOffsetProductType();
    }

    /**
     * Create an instance of {@link MarketingCabinType }
     * 
     */
    public MarketingCabinType createMarketingCabinType() {
        return new MarketingCabinType();
    }

    /**
     * Create an instance of {@link PTCDocTypeType }
     * 
     */
    public PTCDocTypeType createPTCDocTypeType() {
        return new PTCDocTypeType();
    }

    /**
     * Create an instance of {@link SuccessType }
     * 
     */
    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    /**
     * Create an instance of {@link MessageStructureType }
     * 
     */
    public MessageStructureType createMessageStructureType() {
        return new MessageStructureType();
    }

    /**
     * Create an instance of {@link MultimediaDescriptionType }
     * 
     */
    public MultimediaDescriptionType createMultimediaDescriptionType() {
        return new MultimediaDescriptionType();
    }

    /**
     * Create an instance of {@link LayoutType }
     * 
     */
    public LayoutType createLayoutType() {
        return new LayoutType();
    }

    /**
     * Create an instance of {@link ServiceRequestType }
     * 
     */
    public ServiceRequestType createServiceRequestType() {
        return new ServiceRequestType();
    }

    /**
     * Create an instance of {@link EquipmentType }
     * 
     */
    public EquipmentType createEquipmentType() {
        return new EquipmentType();
    }

    /**
     * Create an instance of {@link SeatIdentificationType }
     * 
     */
    public SeatIdentificationType createSeatIdentificationType() {
        return new SeatIdentificationType();
    }

    /**
     * Create an instance of {@link ListFareStatus }
     * 
     */
    public ListFareStatus createListFareStatus() {
        return new ListFareStatus();
    }

    /**
     * Create an instance of {@link ChargesType }
     * 
     */
    public ChargesType createChargesType() {
        return new ChargesType();
    }

    /**
     * Create an instance of {@link OccupancyCountType }
     * 
     */
    public OccupancyCountType createOccupancyCountType() {
        return new OccupancyCountType();
    }

    /**
     * Create an instance of {@link CouponPurchaseRulesType }
     * 
     */
    public CouponPurchaseRulesType createCouponPurchaseRulesType() {
        return new CouponPurchaseRulesType();
    }

    /**
     * Create an instance of {@link CodeListExtension }
     * 
     */
    public CodeListExtension createCodeListExtension() {
        return new CodeListExtension();
    }

    /**
     * Create an instance of {@link RequestorIDType }
     * 
     */
    public RequestorIDType createRequestorIDType() {
        return new RequestorIDType();
    }

    /**
     * Create an instance of {@link MessageAcknowledgementType }
     * 
     */
    public MessageAcknowledgementType createMessageAcknowledgementType() {
        return new MessageAcknowledgementType();
    }

    /**
     * Create an instance of {@link ListGroundLocationType }
     * 
     */
    public ListGroundLocationType createListGroundLocationType() {
        return new ListGroundLocationType();
    }

    /**
     * Create an instance of {@link StatusApplicationControlType }
     * 
     */
    public StatusApplicationControlType createStatusApplicationControlType() {
        return new StatusApplicationControlType();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.DiscountType }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.DiscountType createDiscountType() {
        return new com.airchina.datacenter.spnr.sdk.entity.DiscountType();
    }

    /**
     * Create an instance of {@link ProductDetailsType }
     * 
     */
    public ProductDetailsType createProductDetailsType() {
        return new ProductDetailsType();
    }

    /**
     * Create an instance of {@link OntologyReservationStatusType }
     * 
     */
    public OntologyReservationStatusType createOntologyReservationStatusType() {
        return new OntologyReservationStatusType();
    }

    /**
     * Create an instance of {@link EquipmentSummaryType }
     * 
     */
    public EquipmentSummaryType createEquipmentSummaryType() {
        return new EquipmentSummaryType();
    }

    /**
     * Create an instance of {@link StandaloneAncillaryType }
     * 
     */
    public StandaloneAncillaryType createStandaloneAncillaryType() {
        return new StandaloneAncillaryType();
    }

    /**
     * Create an instance of {@link WeChatType }
     * 
     */
    public WeChatType createWeChatType() {
        return new WeChatType();
    }

    /**
     * Create an instance of {@link BusIdentificationType }
     * 
     */
    public BusIdentificationType createBusIdentificationType() {
        return new BusIdentificationType();
    }

    /**
     * Create an instance of {@link AncillaryProductsType }
     * 
     */
    public AncillaryProductsType createAncillaryProductsType() {
        return new AncillaryProductsType();
    }

    /**
     * Create an instance of {@link FareSourceType }
     * 
     */
    public FareSourceType createFareSourceType() {
        return new FareSourceType();
    }

    /**
     * Create an instance of {@link UniqueIDType }
     * 
     */
    public UniqueIDType createUniqueIDType() {
        return new UniqueIDType();
    }

    /**
     * Create an instance of {@link CustomerInfoType }
     * 
     */
    public CustomerInfoType createCustomerInfoType() {
        return new CustomerInfoType();
    }

    /**
     * Create an instance of {@link SecurityFeaturePrefType }
     * 
     */
    public SecurityFeaturePrefType createSecurityFeaturePrefType() {
        return new SecurityFeaturePrefType();
    }

    /**
     * Create an instance of {@link CabinClassDetailType }
     * 
     */
    public CabinClassDetailType createCabinClassDetailType() {
        return new CabinClassDetailType();
    }

    /**
     * Create an instance of {@link ProtectedDataDetailType }
     * 
     */
    public ProtectedDataDetailType createProtectedDataDetailType() {
        return new ProtectedDataDetailType();
    }

    /**
     * Create an instance of {@link PropertyNamePrefType }
     * 
     */
    public PropertyNamePrefType createPropertyNamePrefType() {
        return new PropertyNamePrefType();
    }

    /**
     * Create an instance of {@link BiasingConfigSet }
     * 
     */
    public BiasingConfigSet createBiasingConfigSet() {
        return new BiasingConfigSet();
    }

    /**
     * Create an instance of {@link LocationFromSearchHotel }
     * 
     */
    public LocationFromSearchHotel createLocationFromSearchHotel() {
        return new LocationFromSearchHotel();
    }

    /**
     * Create an instance of {@link DeadlineType }
     * 
     */
    public DeadlineType createDeadlineType() {
        return new DeadlineType();
    }

    /**
     * Create an instance of {@link CustomerReferenceType }
     * 
     */
    public CustomerReferenceType createCustomerReferenceType() {
        return new CustomerReferenceType();
    }

    /**
     * Create an instance of {@link OrderSubCategoryType }
     * 
     */
    public OrderSubCategoryType createOrderSubCategoryType() {
        return new OrderSubCategoryType();
    }

    /**
     * Create an instance of {@link RBDRateType }
     * 
     */
    public RBDRateType createRBDRateType() {
        return new RBDRateType();
    }

    /**
     * Create an instance of {@link CommonPrefType }
     * 
     */
    public CommonPrefType createCommonPrefType() {
        return new CommonPrefType();
    }

    /**
     * Create an instance of {@link AirAncillaryProductPricesType }
     * 
     */
    public AirAncillaryProductPricesType createAirAncillaryProductPricesType() {
        return new AirAncillaryProductPricesType();
    }

    /**
     * Create an instance of {@link RailAvailScheduleQueryType }
     * 
     */
    public RailAvailScheduleQueryType createRailAvailScheduleQueryType() {
        return new RailAvailScheduleQueryType();
    }

    /**
     * Create an instance of {@link CurrencyCodePOSType }
     * 
     */
    public CurrencyCodePOSType createCurrencyCodePOSType() {
        return new CurrencyCodePOSType();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link FlightType }
     * 
     */
    public FlightType createFlightType() {
        return new FlightType();
    }

    /**
     * Create an instance of {@link CoverageType }
     * 
     */
    public CoverageType createCoverageType() {
        return new CoverageType();
    }

    /**
     * Create an instance of {@link CabinDetails }
     * 
     */
    public CabinDetails createCabinDetails() {
        return new CabinDetails();
    }

    /**
     * Create an instance of {@link StationType }
     * 
     */
    public StationType createStationType() {
        return new StationType();
    }

    /**
     * Create an instance of {@link BankAcctType }
     * 
     */
    public BankAcctType createBankAcctType() {
        return new BankAcctType();
    }

    /**
     * Create an instance of {@link FoodSrvcPrefType }
     * 
     */
    public FoodSrvcPrefType createFoodSrvcPrefType() {
        return new FoodSrvcPrefType();
    }

    /**
     * Create an instance of {@link SPNRPOSType }
     * 
     */
    public SPNRPOSType createSPNRPOSType() {
        return new SPNRPOSType();
    }

    /**
     * Create an instance of {@link PkgRoomInventoryType }
     * 
     */
    public PkgRoomInventoryType createPkgRoomInventoryType() {
        return new PkgRoomInventoryType();
    }

    /**
     * Create an instance of {@link ListQuestionCategory }
     * 
     */
    public ListQuestionCategory createListQuestionCategory() {
        return new ListQuestionCategory();
    }

    /**
     * Create an instance of {@link ServicesDescriptionType }
     * 
     */
    public ServicesDescriptionType createServicesDescriptionType() {
        return new ServicesDescriptionType();
    }

    /**
     * Create an instance of {@link EquipmentIDType }
     * 
     */
    public EquipmentIDType createEquipmentIDType() {
        return new EquipmentIDType();
    }

    /**
     * Create an instance of {@link TrainSegmentType }
     * 
     */
    public TrainSegmentType createTrainSegmentType() {
        return new TrainSegmentType();
    }

    /**
     * Create an instance of {@link PaymentFormPrefType }
     * 
     */
    public PaymentFormPrefType createPaymentFormPrefType() {
        return new PaymentFormPrefType();
    }

    /**
     * Create an instance of {@link ListVehChargePurpose }
     * 
     */
    public ListVehChargePurpose createListVehChargePurpose() {
        return new ListVehChargePurpose();
    }

    /**
     * Create an instance of {@link AdditionalDetailsType }
     * 
     */
    public AdditionalDetailsType createAdditionalDetailsType() {
        return new AdditionalDetailsType();
    }

    /**
     * Create an instance of {@link MealPrefType }
     * 
     */
    public MealPrefType createMealPrefType() {
        return new MealPrefType();
    }

    /**
     * Create an instance of {@link RailSegmentType }
     * 
     */
    public RailSegmentType createRailSegmentType() {
        return new RailSegmentType();
    }

    /**
     * Create an instance of {@link InstantPurchaseType }
     * 
     */
    public InstantPurchaseType createInstantPurchaseType() {
        return new InstantPurchaseType();
    }

    /**
     * Create an instance of {@link AirportPrefType }
     * 
     */
    public AirportPrefType createAirportPrefType() {
        return new AirportPrefType();
    }

    /**
     * Create an instance of {@link AddressPrefType }
     * 
     */
    public AddressPrefType createAddressPrefType() {
        return new AddressPrefType();
    }

    /**
     * Create an instance of {@link DictionaryOJType }
     * 
     */
    public DictionaryOJType createDictionaryOJType() {
        return new DictionaryOJType();
    }

    /**
     * Create an instance of {@link OffLocationServicePricedType }
     * 
     */
    public OffLocationServicePricedType createOffLocationServicePricedType() {
        return new OffLocationServicePricedType();
    }

    /**
     * Create an instance of {@link AirlineOperatorDetailType }
     * 
     */
    public AirlineOperatorDetailType createAirlineOperatorDetailType() {
        return new AirlineOperatorDetailType();
    }

    /**
     * Create an instance of {@link ForInfoType }
     * 
     */
    public ForInfoType createForInfoType() {
        return new ForInfoType();
    }

    /**
     * Create an instance of {@link AuditEventType }
     * 
     */
    public AuditEventType createAuditEventType() {
        return new AuditEventType();
    }

    /**
     * Create an instance of {@link CheckRuleType }
     * 
     */
    public CheckRuleType createCheckRuleType() {
        return new CheckRuleType();
    }

    /**
     * Create an instance of {@link VideoItemType }
     * 
     */
    public VideoItemType createVideoItemType() {
        return new VideoItemType();
    }

    /**
     * Create an instance of {@link PkgTravelSegment }
     * 
     */
    public PkgTravelSegment createPkgTravelSegment() {
        return new PkgTravelSegment();
    }

    /**
     * Create an instance of {@link GuestType }
     * 
     */
    public GuestType createGuestType() {
        return new GuestType();
    }

    /**
     * Create an instance of {@link FerryUniqueIDType }
     * 
     */
    public FerryUniqueIDType createFerryUniqueIDType() {
        return new FerryUniqueIDType();
    }

    /**
     * Create an instance of {@link FeesType }
     * 
     */
    public FeesType createFeesType() {
        return new FeesType();
    }

    /**
     * Create an instance of {@link ListApplyToLevel }
     * 
     */
    public ListApplyToLevel createListApplyToLevel() {
        return new ListApplyToLevel();
    }

    /**
     * Create an instance of {@link FareFamilyType }
     * 
     */
    public FareFamilyType createFareFamilyType() {
        return new FareFamilyType();
    }

    /**
     * Create an instance of {@link CarbonOffsetType }
     * 
     */
    public CarbonOffsetType createCarbonOffsetType() {
        return new CarbonOffsetType();
    }

    /**
     * Create an instance of {@link SupplierPenaltyType }
     * 
     */
    public SupplierPenaltyType createSupplierPenaltyType() {
        return new SupplierPenaltyType();
    }

    /**
     * Create an instance of {@link ReasonCode }
     * 
     */
    public ReasonCode createReasonCode() {
        return new ReasonCode();
    }

    /**
     * Create an instance of {@link DeviceType }
     * 
     */
    public DeviceType createDeviceType() {
        return new DeviceType();
    }

    /**
     * Create an instance of {@link FlightStopType }
     * 
     */
    public FlightStopType createFlightStopType() {
        return new FlightStopType();
    }

    /**
     * Create an instance of {@link CancelRuleType }
     * 
     */
    public CancelRuleType createCancelRuleType() {
        return new CancelRuleType();
    }

    /**
     * Create an instance of {@link MediaEntertainPrefType }
     * 
     */
    public MediaEntertainPrefType createMediaEntertainPrefType() {
        return new MediaEntertainPrefType();
    }

    /**
     * Create an instance of {@link RelativePositionType }
     * 
     */
    public RelativePositionType createRelativePositionType() {
        return new RelativePositionType();
    }

    /**
     * Create an instance of {@link GuestTransportationType }
     * 
     */
    public GuestTransportationType createGuestTransportationType() {
        return new GuestTransportationType();
    }

    /**
     * Create an instance of {@link FerryTravellerCountBaseType }
     * 
     */
    public FerryTravellerCountBaseType createFerryTravellerCountBaseType() {
        return new FerryTravellerCountBaseType();
    }

    /**
     * Create an instance of {@link TimeZoneType }
     * 
     */
    public TimeZoneType createTimeZoneType() {
        return new TimeZoneType();
    }

    /**
     * Create an instance of {@link NamePrefType }
     * 
     */
    public NamePrefType createNamePrefType() {
        return new NamePrefType();
    }

    /**
     * Create an instance of {@link FullRedemptionType }
     * 
     */
    public FullRedemptionType createFullRedemptionType() {
        return new FullRedemptionType();
    }

    /**
     * Create an instance of {@link CompartmentType }
     * 
     */
    public CompartmentType createCompartmentType() {
        return new CompartmentType();
    }

    /**
     * Create an instance of {@link ListCabinClass }
     * 
     */
    public ListCabinClass createListCabinClass() {
        return new ListCabinClass();
    }

    /**
     * Create an instance of {@link PropertyLocationPrefType }
     * 
     */
    public PropertyLocationPrefType createPropertyLocationPrefType() {
        return new PropertyLocationPrefType();
    }

    /**
     * Create an instance of {@link StatisticsType }
     * 
     */
    public StatisticsType createStatisticsType() {
        return new StatisticsType();
    }

    /**
     * Create an instance of {@link ListTransactionAction }
     * 
     */
    public ListTransactionAction createListTransactionAction() {
        return new ListTransactionAction();
    }

    /**
     * Create an instance of {@link SellerProfileType }
     * 
     */
    public SellerProfileType createSellerProfileType() {
        return new SellerProfileType();
    }

    /**
     * Create an instance of {@link VehicleSpecialReqPrefType }
     * 
     */
    public VehicleSpecialReqPrefType createVehicleSpecialReqPrefType() {
        return new VehicleSpecialReqPrefType();
    }

    /**
     * Create an instance of {@link CountryNameType }
     * 
     */
    public CountryNameType createCountryNameType() {
        return new CountryNameType();
    }

    /**
     * Create an instance of {@link PositionType }
     * 
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link AirlineOperatorCoreType }
     * 
     */
    public AirlineOperatorCoreType createAirlineOperatorCoreType() {
        return new AirlineOperatorCoreType();
    }

    /**
     * Create an instance of {@link LocationTimeType }
     * 
     */
    public LocationTimeType createLocationTimeType() {
        return new LocationTimeType();
    }

    /**
     * Create an instance of {@link ContractIDType }
     * 
     */
    public ContractIDType createContractIDType() {
        return new ContractIDType();
    }

    /**
     * Create an instance of {@link AirAncillarySupplierSummaryType }
     * 
     */
    public AirAncillarySupplierSummaryType createAirAncillarySupplierSummaryType() {
        return new AirAncillarySupplierSummaryType();
    }

    /**
     * Create an instance of {@link WifiType }
     * 
     */
    public WifiType createWifiType() {
        return new WifiType();
    }

    /**
     * Create an instance of {@link CouponRequestCommonType.Post }
     * 
     */
    public CouponRequestCommonType.Post createCouponRequestCommonTypePost() {
        return new CouponRequestCommonType.Post();
    }

    /**
     * Create an instance of {@link CouponRequestCommonType.TravelerInfo }
     * 
     */
    public CouponRequestCommonType.TravelerInfo createCouponRequestCommonTypeTravelerInfo() {
        return new CouponRequestCommonType.TravelerInfo();
    }

    /**
     * Create an instance of {@link TravelerInfoType.AirTraveler }
     * 
     */
    public TravelerInfoType.AirTraveler createTravelerInfoTypeAirTraveler() {
        return new TravelerInfoType.AirTraveler();
    }

    /**
     * Create an instance of {@link TravelerInfoType.SpecialReqDetails }
     * 
     */
    public TravelerInfoType.SpecialReqDetails createTravelerInfoTypeSpecialReqDetails() {
        return new TravelerInfoType.SpecialReqDetails();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.StandaloneAncillaries }
     * 
     */
    public SpecialReqDetailsType.StandaloneAncillaries createSpecialReqDetailsTypeStandaloneAncillaries() {
        return new SpecialReqDetailsType.StandaloneAncillaries();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.SpecialRemarks.SpecialRemark }
     * 
     */
    public SpecialReqDetailsType.SpecialRemarks.SpecialRemark createSpecialReqDetailsTypeSpecialRemarksSpecialRemark() {
        return new SpecialReqDetailsType.SpecialRemarks.SpecialRemark();
    }

    /**
     * Create an instance of {@link SpecialRemarkType.TravelerRefNumber }
     * 
     */
    public SpecialRemarkType.TravelerRefNumber createSpecialRemarkTypeTravelerRefNumber() {
        return new SpecialRemarkType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link SpecialRemarkType.FlightRefNumber }
     * 
     */
    public SpecialRemarkType.FlightRefNumber createSpecialRemarkTypeFlightRefNumber() {
        return new SpecialRemarkType.FlightRefNumber();
    }

    /**
     * Create an instance of {@link SpecialRemarkType.AuthorizedViewers.AuthorizedViewer }
     * 
     */
    public SpecialRemarkType.AuthorizedViewers.AuthorizedViewer createSpecialRemarkTypeAuthorizedViewersAuthorizedViewer() {
        return new SpecialRemarkType.AuthorizedViewers.AuthorizedViewer();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.Remarks.Remark }
     * 
     */
    public SpecialReqDetailsType.Remarks.Remark createSpecialReqDetailsTypeRemarksRemark() {
        return new SpecialReqDetailsType.Remarks.Remark();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation }
     * 
     */
    public SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation createSpecialReqDetailsTypeOtherServiceInformationsOtherServiceInformation() {
        return new SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation();
    }

    /**
     * Create an instance of {@link OtherServiceInfoType.TravelerRefNumber }
     * 
     */
    public OtherServiceInfoType.TravelerRefNumber createOtherServiceInfoTypeTravelerRefNumber() {
        return new OtherServiceInfoType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.TransportRequests.TransportRequest.SupplierRef }
     * 
     */
    public SpecialReqDetailsType.TransportRequests.TransportRequest.SupplierRef createSpecialReqDetailsTypeTransportRequestsTransportRequestSupplierRef() {
        return new SpecialReqDetailsType.TransportRequests.TransportRequest.SupplierRef();
    }

    /**
     * Create an instance of {@link SupplierRefType.Endorsement }
     * 
     */
    public SupplierRefType.Endorsement createSupplierRefTypeEndorsement() {
        return new SupplierRefType.Endorsement();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing.PrePayTotal }
     * 
     */
    public SupplierRefType.Pricing.PrePayTotal createSupplierRefTypePricingPrePayTotal() {
        return new SupplierRefType.Pricing.PrePayTotal();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing.TotalPrice }
     * 
     */
    public SupplierRefType.Pricing.TotalPrice createSupplierRefTypePricingTotalPrice() {
        return new SupplierRefType.Pricing.TotalPrice();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.BaseFare }
     * 
     */
    public SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.BaseFare createSupplierRefTypePricingCancellationRefundsCancellationRefundBaseFare() {
        return new SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.BaseFare();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Taxes }
     * 
     */
    public SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Taxes createSupplierRefTypePricingCancellationRefundsCancellationRefundTaxes() {
        return new SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Taxes();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Agent }
     * 
     */
    public SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Agent createSupplierRefTypePricingCancellationRefundsCancellationRefundAgent() {
        return new SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Agent();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing.CancellationFees.CancellationFee.Agent }
     * 
     */
    public SupplierRefType.Pricing.CancellationFees.CancellationFee.Agent createSupplierRefTypePricingCancellationFeesCancellationFeeAgent() {
        return new SupplierRefType.Pricing.CancellationFees.CancellationFee.Agent();
    }

    /**
     * Create an instance of {@link SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment.Agent }
     * 
     */
    public SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment.Agent createSupplierRefTypePricingPriceAdjustmentsPriceAdjustmentAgent() {
        return new SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment.Agent();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest }
     * 
     */
    public SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest createSpecialReqDetailsTypeSpecialServiceRequestsSpecialServiceRequest() {
        return new SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest();
    }

    /**
     * Create an instance of {@link SpecialServiceRequestType.AgeQualifications.AgeQualification }
     * 
     */
    public SpecialServiceRequestType.AgeQualifications.AgeQualification createSpecialServiceRequestTypeAgeQualificationsAgeQualification() {
        return new SpecialServiceRequestType.AgeQualifications.AgeQualification();
    }

    /**
     * Create an instance of {@link SpecialServiceRequestType.InfoEntries.InfoEntry }
     * 
     */
    public SpecialServiceRequestType.InfoEntries.InfoEntry createSpecialServiceRequestTypeInfoEntriesInfoEntry() {
        return new SpecialServiceRequestType.InfoEntries.InfoEntry();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType.SeatRequests.SeatRequest }
     * 
     */
    public SpecialReqDetailsType.SeatRequests.SeatRequest createSpecialReqDetailsTypeSeatRequestsSeatRequest() {
        return new SpecialReqDetailsType.SeatRequests.SeatRequest();
    }

    /**
     * Create an instance of {@link AirTravelerType.ProfileRef }
     * 
     */
    public AirTravelerType.ProfileRef createAirTravelerTypeProfileRef() {
        return new AirTravelerType.ProfileRef();
    }

    /**
     * Create an instance of {@link AirTravelerType.Telephone }
     * 
     */
    public AirTravelerType.Telephone createAirTravelerTypeTelephone() {
        return new AirTravelerType.Telephone();
    }

    /**
     * Create an instance of {@link AirTravelerType.Email }
     * 
     */
    public AirTravelerType.Email createAirTravelerTypeEmail() {
        return new AirTravelerType.Email();
    }

    /**
     * Create an instance of {@link AirTravelerType.Address }
     * 
     */
    public AirTravelerType.Address createAirTravelerTypeAddress() {
        return new AirTravelerType.Address();
    }

    /**
     * Create an instance of {@link AirTravelerType.CitizenCountryName }
     * 
     */
    public AirTravelerType.CitizenCountryName createAirTravelerTypeCitizenCountryName() {
        return new AirTravelerType.CitizenCountryName();
    }

    /**
     * Create an instance of {@link AirTravelerType.CustLoyalty }
     * 
     */
    public AirTravelerType.CustLoyalty createAirTravelerTypeCustLoyalty() {
        return new AirTravelerType.CustLoyalty();
    }

    /**
     * Create an instance of {@link AirTravelerType.Document }
     * 
     */
    public AirTravelerType.Document createAirTravelerTypeDocument() {
        return new AirTravelerType.Document();
    }

    /**
     * Create an instance of {@link AirTravelerType.TravelerRefNumber }
     * 
     */
    public AirTravelerType.TravelerRefNumber createAirTravelerTypeTravelerRefNumber() {
        return new AirTravelerType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link AirTravelerType.FlightSegmentRPHs }
     * 
     */
    public AirTravelerType.FlightSegmentRPHs createAirTravelerTypeFlightSegmentRPHs() {
        return new AirTravelerType.FlightSegmentRPHs();
    }

    /**
     * Create an instance of {@link AirTravelerType.APISInformation.Address }
     * 
     */
    public AirTravelerType.APISInformation.Address createAirTravelerTypeAPISInformationAddress() {
        return new AirTravelerType.APISInformation.Address();
    }

    /**
     * Create an instance of {@link AddressType.StreetNmbr }
     * 
     */
    public AddressType.StreetNmbr createAddressTypeStreetNmbr() {
        return new AddressType.StreetNmbr();
    }

    /**
     * Create an instance of {@link AddressType.BldgRoom }
     * 
     */
    public AddressType.BldgRoom createAddressTypeBldgRoom() {
        return new AddressType.BldgRoom();
    }

    /**
     * Create an instance of {@link AddressType.AddressLine }
     * 
     */
    public AddressType.AddressLine createAddressTypeAddressLine() {
        return new AddressType.AddressLine();
    }

    /**
     * Create an instance of {@link AddressType.Position }
     * 
     */
    public AddressType.Position createAddressTypePosition() {
        return new AddressType.Position();
    }

    /**
     * Create an instance of {@link DocumentType.AdditionalPersonNames }
     * 
     */
    public DocumentType.AdditionalPersonNames createDocumentTypeAdditionalPersonNames() {
        return new DocumentType.AdditionalPersonNames();
    }

    /**
     * Create an instance of {@link DocumentType.AdditionalDocument }
     * 
     */
    public DocumentType.AdditionalDocument createDocumentTypeAdditionalDocument() {
        return new DocumentType.AdditionalDocument();
    }

    /**
     * Create an instance of {@link EventCategoriesType.Category }
     * 
     */
    public EventCategoriesType.Category createEventCategoriesTypeCategory() {
        return new EventCategoriesType.Category();
    }

    /**
     * Create an instance of {@link FeaturesType.Feature.Charge }
     * 
     */
    public FeaturesType.Feature.Charge createFeaturesTypeFeatureCharge() {
        return new FeaturesType.Feature.Charge();
    }

    /**
     * Create an instance of {@link PromotionDescriptionType.Description.Short }
     * 
     */
    public PromotionDescriptionType.Description.Short createPromotionDescriptionTypeDescriptionShort() {
        return new PromotionDescriptionType.Description.Short();
    }

    /**
     * Create an instance of {@link PromotionDescriptionType.Description.Long }
     * 
     */
    public PromotionDescriptionType.Description.Long createPromotionDescriptionTypeDescriptionLong() {
        return new PromotionDescriptionType.Description.Long();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.GuaranteePaymentPolicy }
     * 
     */
    public PoliciesType.Policy.GuaranteePaymentPolicy createPoliciesTypePolicyGuaranteePaymentPolicy() {
        return new PoliciesType.Policy.GuaranteePaymentPolicy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.FeePolicies }
     * 
     */
    public PoliciesType.Policy.FeePolicies createPoliciesTypePolicyFeePolicies() {
        return new PoliciesType.Policy.FeePolicies();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.CommissionPolicy.PaymentCompany }
     * 
     */
    public PoliciesType.Policy.CommissionPolicy.PaymentCompany createPoliciesTypePolicyCommissionPolicyPaymentCompany() {
        return new PoliciesType.Policy.CommissionPolicy.PaymentCompany();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.StayRequirements.StayRequirement }
     * 
     */
    public PoliciesType.Policy.StayRequirements.StayRequirement createPoliciesTypePolicyStayRequirementsStayRequirement() {
        return new PoliciesType.Policy.StayRequirements.StayRequirement();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PetsPolicies.PetsPolicy }
     * 
     */
    public PoliciesType.Policy.PetsPolicies.PetsPolicy createPoliciesTypePolicyPetsPoliciesPetsPolicy() {
        return new PoliciesType.Policy.PetsPolicies.PetsPolicy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.TaxPolicies.TaxPolicy }
     * 
     */
    public PoliciesType.Policy.TaxPolicies.TaxPolicy createPoliciesTypePolicyTaxPoliciesTaxPolicy() {
        return new PoliciesType.Policy.TaxPolicies.TaxPolicy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PolicyInfo.ChildCategories.ChildCategory }
     * 
     */
    public PoliciesType.Policy.PolicyInfo.ChildCategories.ChildCategory createPoliciesTypePolicyPolicyInfoChildCategoriesChildCategory() {
        return new PoliciesType.Policy.PolicyInfo.ChildCategories.ChildCategory();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAcct }
     * 
     */
    public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAcct createPoliciesTypePolicyPaymentPolicyRequiredPaymentAcceptedPaymentsAcceptedPaymentBankAcct() {
        return new PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAcct();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.Currency }
     * 
     */
    public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.Currency createPoliciesTypePolicyPaymentPolicyRequiredPaymentAcceptedPaymentsAcceptedPaymentCurrency() {
        return new PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.Currency();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentType }
     * 
     */
    public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentType createPoliciesTypePolicyPaymentPolicyRequiredPaymentAcceptedPaymentsAcceptedPaymentPaymentType() {
        return new PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentType();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentCard }
     * 
     */
    public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentCard createPoliciesTypePolicyPaymentPolicyRequiredPaymentAcceptedPaymentsAcceptedPaymentPaymentCard() {
        return new PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentCard();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields.PaymentTerm }
     * 
     */
    public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields.PaymentTerm createPoliciesTypePolicyPaymentPolicyRequiredPaymentAcceptedPaymentsAcceptedPaymentAgressoExtraFieldsPaymentTerm() {
        return new PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields.PaymentTerm();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress.CountryName }
     * 
     */
    public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress.CountryName createPoliciesTypePolicyPaymentPolicyRequiredPaymentAcceptedPaymentsAcceptedPaymentBankAddressCountryName() {
        return new PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress.CountryName();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.CheckoutCharges.CheckoutCharge }
     * 
     */
    public PoliciesType.Policy.CheckoutCharges.CheckoutCharge createPoliciesTypePolicyCheckoutChargesCheckoutCharge() {
        return new PoliciesType.Policy.CheckoutCharges.CheckoutCharge();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode }
     * 
     */
    public PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode createPoliciesTypePolicyPolicyInfoCodesPolicyInfoCode() {
        return new PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment.Deadline }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment.Deadline createRequiredPaymentsTypeGuaranteePaymentDeadline() {
        return new RequiredPaymentsType.GuaranteePayment.Deadline();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment.Address }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment.Address createRequiredPaymentsTypeGuaranteePaymentAddress() {
        return new RequiredPaymentsType.GuaranteePayment.Address();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.CostingItems }
     * 
     */
    public PkgInvoiceDetail.CostingItems createPkgInvoiceDetailCostingItems() {
        return new PkgInvoiceDetail.CostingItems();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.GrossAmount }
     * 
     */
    public PkgInvoiceDetail.GrossAmount createPkgInvoiceDetailGrossAmount() {
        return new PkgInvoiceDetail.GrossAmount();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.DepositAmount }
     * 
     */
    public PkgInvoiceDetail.DepositAmount createPkgInvoiceDetailDepositAmount() {
        return new PkgInvoiceDetail.DepositAmount();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.AgentCommission }
     * 
     */
    public PkgInvoiceDetail.AgentCommission createPkgInvoiceDetailAgentCommission() {
        return new PkgInvoiceDetail.AgentCommission();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.NetAmount }
     * 
     */
    public PkgInvoiceDetail.NetAmount createPkgInvoiceDetailNetAmount() {
        return new PkgInvoiceDetail.NetAmount();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.BalanceDueAmount }
     * 
     */
    public PkgInvoiceDetail.BalanceDueAmount createPkgInvoiceDetailBalanceDueAmount() {
        return new PkgInvoiceDetail.BalanceDueAmount();
    }

    /**
     * Create an instance of {@link PkgInvoiceDetail.AmountReceived }
     * 
     */
    public PkgInvoiceDetail.AmountReceived createPkgInvoiceDetailAmountReceived() {
        return new PkgInvoiceDetail.AmountReceived();
    }

    /**
     * Create an instance of {@link AccomType.Places }
     * 
     */
    public AccomType.Places createAccomTypePlaces() {
        return new AccomType.Places();
    }

    /**
     * Create an instance of {@link AccomType.AccomRef }
     * 
     */
    public AccomType.AccomRef createAccomTypeAccomRef() {
        return new AccomType.AccomRef();
    }

    /**
     * Create an instance of {@link ContactInfosType.ContactInfo }
     * 
     */
    public ContactInfosType.ContactInfo createContactInfosTypeContactInfo() {
        return new ContactInfosType.ContactInfo();
    }

    /**
     * Create an instance of {@link ContactInfoType.CompanyName }
     * 
     */
    public ContactInfoType.CompanyName createContactInfoTypeCompanyName() {
        return new ContactInfoType.CompanyName();
    }

    /**
     * Create an instance of {@link ContactInfoType.LocationCodes.LocationCode }
     * 
     */
    public ContactInfoType.LocationCodes.LocationCode createContactInfoTypeLocationCodesLocationCode() {
        return new ContactInfoType.LocationCodes.LocationCode();
    }

    /**
     * Create an instance of {@link RailRateQualifyingType.DiscountType }
     * 
     */
    public RailRateQualifyingType.DiscountType createRailRateQualifyingTypeDiscountType() {
        return new RailRateQualifyingType.DiscountType();
    }

    /**
     * Create an instance of {@link AccessesType.Access }
     * 
     */
    public AccessesType.Access createAccessesTypeAccess() {
        return new AccessesType.Access();
    }

    /**
     * Create an instance of {@link CabinCameraPosType.Row }
     * 
     */
    public CabinCameraPosType.Row createCabinCameraPosTypeRow() {
        return new CabinCameraPosType.Row();
    }

    /**
     * Create an instance of {@link CabinCameraPosType.Column }
     * 
     */
    public CabinCameraPosType.Column createCabinCameraPosTypeColumn() {
        return new CabinCameraPosType.Column();
    }

    /**
     * Create an instance of {@link RailPassengerShopTypeDEPRECATE.PassengerQualifyingInfo }
     * 
     */
    public RailPassengerShopTypeDEPRECATE.PassengerQualifyingInfo createRailPassengerShopTypeDEPRECATEPassengerQualifyingInfo() {
        return new RailPassengerShopTypeDEPRECATE.PassengerQualifyingInfo();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.PTCFareBreakdowns }
     * 
     */
    public AirItineraryPricingInfoType.PTCFareBreakdowns createAirItineraryPricingInfoTypePTCFareBreakdowns() {
        return new AirItineraryPricingInfoType.PTCFareBreakdowns();
    }

    /**
     * Create an instance of {@link LoyaltyPricingType.Earn }
     * 
     */
    public LoyaltyPricingType.Earn createLoyaltyPricingTypeEarn() {
        return new LoyaltyPricingType.Earn();
    }

    /**
     * Create an instance of {@link LoyaltyPricingType.Redeem }
     * 
     */
    public LoyaltyPricingType.Redeem createLoyaltyPricingTypeRedeem() {
        return new LoyaltyPricingType.Redeem();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.Loyalty.PricingParameters.PricingParameter }
     * 
     */
    public AirItineraryPricingInfoType.Loyalty.PricingParameters.PricingParameter createAirItineraryPricingInfoTypeLoyaltyPricingParametersPricingParameter() {
        return new AirItineraryPricingInfoType.Loyalty.PricingParameters.PricingParameter();
    }

    /**
     * Create an instance of {@link LoyaltyBaseType.Rule.Info }
     * 
     */
    public LoyaltyBaseType.Rule.Info createLoyaltyBaseTypeRuleInfo() {
        return new LoyaltyBaseType.Rule.Info();
    }

    /**
     * Create an instance of {@link LoyaltyPricingType.Combinations.Combination.Cash }
     * 
     */
    public LoyaltyPricingType.Combinations.Combination.Cash createLoyaltyPricingTypeCombinationsCombinationCash() {
        return new LoyaltyPricingType.Combinations.Combination.Cash();
    }

    /**
     * Create an instance of {@link LoyaltyPricingType.Combinations.Combination.Earn }
     * 
     */
    public LoyaltyPricingType.Combinations.Combination.Earn createLoyaltyPricingTypeCombinationsCombinationEarn() {
        return new LoyaltyPricingType.Combinations.Combination.Earn();
    }

    /**
     * Create an instance of {@link LoyaltyPricingType.Combinations.Combination.PTCs }
     * 
     */
    public LoyaltyPricingType.Combinations.Combination.PTCs createLoyaltyPricingTypeCombinationsCombinationPTCs() {
        return new LoyaltyPricingType.Combinations.Combination.PTCs();
    }

    /**
     * Create an instance of {@link LoyaltyPricingType.Combinations.Combination.LoyaltyDetails.PricingParameters.PricingParameter }
     * 
     */
    public LoyaltyPricingType.Combinations.Combination.LoyaltyDetails.PricingParameters.PricingParameter createLoyaltyPricingTypeCombinationsCombinationLoyaltyDetailsPricingParametersPricingParameter() {
        return new LoyaltyPricingType.Combinations.Combination.LoyaltyDetails.PricingParameters.PricingParameter();
    }

    /**
     * Create an instance of {@link LoyaltyDetailsPricingType.Combinations.Combination.Cash }
     * 
     */
    public LoyaltyDetailsPricingType.Combinations.Combination.Cash createLoyaltyDetailsPricingTypeCombinationsCombinationCash() {
        return new LoyaltyDetailsPricingType.Combinations.Combination.Cash();
    }

    /**
     * Create an instance of {@link LoyaltyDetailsPricingType.Combinations.Combination.Earn }
     * 
     */
    public LoyaltyDetailsPricingType.Combinations.Combination.Earn createLoyaltyDetailsPricingTypeCombinationsCombinationEarn() {
        return new LoyaltyDetailsPricingType.Combinations.Combination.Earn();
    }

    /**
     * Create an instance of {@link LoyaltyDetailsPricingType.Combinations.Combination.PTCs }
     * 
     */
    public LoyaltyDetailsPricingType.Combinations.Combination.PTCs createLoyaltyDetailsPricingTypeCombinationsCombinationPTCs() {
        return new LoyaltyDetailsPricingType.Combinations.Combination.PTCs();
    }

    /**
     * Create an instance of {@link LoyaltyPTCType.PTC.Cash }
     * 
     */
    public LoyaltyPTCType.PTC.Cash createLoyaltyPTCTypePTCCash() {
        return new LoyaltyPTCType.PTC.Cash();
    }

    /**
     * Create an instance of {@link LoyaltyPTCType.PTC.Earn }
     * 
     */
    public LoyaltyPTCType.PTC.Earn createLoyaltyPTCTypePTCEarn() {
        return new LoyaltyPTCType.PTC.Earn();
    }

    /**
     * Create an instance of {@link LoyaltyPTCType.PTC.Redemption.Redeem }
     * 
     */
    public LoyaltyPTCType.PTC.Redemption.Redeem createLoyaltyPTCTypePTCRedemptionRedeem() {
        return new LoyaltyPTCType.PTC.Redemption.Redeem();
    }

    /**
     * Create an instance of {@link LoyaltyDetailsPricingType.Combinations.Combination.Redemption.Redeem }
     * 
     */
    public LoyaltyDetailsPricingType.Combinations.Combination.Redemption.Redeem createLoyaltyDetailsPricingTypeCombinationsCombinationRedemptionRedeem() {
        return new LoyaltyDetailsPricingType.Combinations.Combination.Redemption.Redeem();
    }

    /**
     * Create an instance of {@link LoyaltyPricingType.Combinations.Combination.Redemption.Redeem }
     * 
     */
    public LoyaltyPricingType.Combinations.Combination.Redemption.Redeem createLoyaltyPricingTypeCombinationsCombinationRedemptionRedeem() {
        return new LoyaltyPricingType.Combinations.Combination.Redemption.Redeem();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.BagAllowRefs.BagAllowRef }
     * 
     */
    public AirItineraryPricingInfoType.BagAllowRefs.BagAllowRef createAirItineraryPricingInfoTypeBagAllowRefsBagAllowRef() {
        return new AirItineraryPricingInfoType.BagAllowRefs.BagAllowRef();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.SpecialServiceRequests.SpecialServiceRequest }
     * 
     */
    public AirItineraryPricingInfoType.SpecialServiceRequests.SpecialServiceRequest createAirItineraryPricingInfoTypeSpecialServiceRequestsSpecialServiceRequest() {
        return new AirItineraryPricingInfoType.SpecialServiceRequests.SpecialServiceRequest();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType.FareInfos.FareInfo }
     * 
     */
    public AirItineraryPricingInfoType.FareInfos.FareInfo createAirItineraryPricingInfoTypeFareInfosFareInfo() {
        return new AirItineraryPricingInfoType.FareInfos.FareInfo();
    }

    /**
     * Create an instance of {@link FareInfoType.FareReference }
     * 
     */
    public FareInfoType.FareReference createFareInfoTypeFareReference() {
        return new FareInfoType.FareReference();
    }

    /**
     * Create an instance of {@link FareInfoType.RuleInfo }
     * 
     */
    public FareInfoType.RuleInfo createFareInfoTypeRuleInfo() {
        return new FareInfoType.RuleInfo();
    }

    /**
     * Create an instance of {@link FareInfoType.Date }
     * 
     */
    public FareInfoType.Date createFareInfoTypeDate() {
        return new FareInfoType.Date();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.Date }
     * 
     */
    public FareInfoType.FareInfo.Date createFareInfoTypeFareInfoDate() {
        return new FareInfoType.FareInfo.Date();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.PTC }
     * 
     */
    public FareInfoType.FareInfo.PTC createFareInfoTypeFareInfoPTC() {
        return new FareInfoType.FareInfo.PTC();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.DiscountPricing }
     * 
     */
    public FareInfoType.FareInfo.DiscountPricing createFareInfoTypeFareInfoDiscountPricing() {
        return new FareInfoType.FareInfo.DiscountPricing();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.ReissueFees.ReissueFee.CustLoyalty }
     * 
     */
    public FareInfoType.FareInfo.ReissueFees.ReissueFee.CustLoyalty createFareInfoTypeFareInfoReissueFeesReissueFeeCustLoyalty() {
        return new FareInfoType.FareInfo.ReissueFees.ReissueFee.CustLoyalty();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.Fare.Taxes }
     * 
     */
    public FareInfoType.FareInfo.Fare.Taxes createFareInfoTypeFareInfoFareTaxes() {
        return new FareInfoType.FareInfo.Fare.Taxes();
    }

    /**
     * Create an instance of {@link RuleInfoType.ChargesRules }
     * 
     */
    public RuleInfoType.ChargesRules createRuleInfoTypeChargesRules() {
        return new RuleInfoType.ChargesRules();
    }

    /**
     * Create an instance of {@link RuleInfoType.ResTicketingRules.AdvResTicketing }
     * 
     */
    public RuleInfoType.ResTicketingRules.AdvResTicketing createRuleInfoTypeResTicketingRulesAdvResTicketing() {
        return new RuleInfoType.ResTicketingRules.AdvResTicketing();
    }

    /**
     * Create an instance of {@link AdvResTicketingType.AdvReservation }
     * 
     */
    public AdvResTicketingType.AdvReservation createAdvResTicketingTypeAdvReservation() {
        return new AdvResTicketingType.AdvReservation();
    }

    /**
     * Create an instance of {@link AdvResTicketingType.AdvTicketing }
     * 
     */
    public AdvResTicketingType.AdvTicketing createAdvResTicketingTypeAdvTicketing() {
        return new AdvResTicketingType.AdvTicketing();
    }

    /**
     * Create an instance of {@link AddressesType.Address }
     * 
     */
    public AddressesType.Address createAddressesTypeAddress() {
        return new AddressesType.Address();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.RentalCar }
     * 
     */
    public ItineraryItemResponseType.RentalCar createItineraryItemResponseTypeRentalCar() {
        return new ItineraryItemResponseType.RentalCar();
    }

    /**
     * Create an instance of {@link VehicleRentalCoreType.PickUpLocation }
     * 
     */
    public VehicleRentalCoreType.PickUpLocation createVehicleRentalCoreTypePickUpLocation() {
        return new VehicleRentalCoreType.PickUpLocation();
    }

    /**
     * Create an instance of {@link VehicleRentalCoreType.ReturnLocation }
     * 
     */
    public VehicleRentalCoreType.ReturnLocation createVehicleRentalCoreTypeReturnLocation() {
        return new VehicleRentalCoreType.ReturnLocation();
    }

    /**
     * Create an instance of {@link PickUpLocationType.LocationDetail }
     * 
     */
    public PickUpLocationType.LocationDetail createPickUpLocationTypeLocationDetail() {
        return new PickUpLocationType.LocationDetail();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation.AccommodationClass }
     * 
     */
    public ItineraryItemResponseType.Accommodation.AccommodationClass createItineraryItemResponseTypeAccommodationAccommodationClass() {
        return new ItineraryItemResponseType.Accommodation.AccommodationClass();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation.MealPlans }
     * 
     */
    public ItineraryItemResponseType.Accommodation.MealPlans createItineraryItemResponseTypeAccommodationMealPlans() {
        return new ItineraryItemResponseType.Accommodation.MealPlans();
    }

    /**
     * Create an instance of {@link RoomProfileType.PassengerRPHs }
     * 
     */
    public RoomProfileType.PassengerRPHs createRoomProfileTypePassengerRPHs() {
        return new RoomProfileType.PassengerRPHs();
    }

    /**
     * Create an instance of {@link ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price }
     * 
     */
    public ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price createItineraryItemResponseTypeAccommodationRoomProfilesRoomProfilePricesPrice() {
        return new ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price();
    }

    /**
     * Create an instance of {@link OJVoucherBaseType.Infos }
     * 
     */
    public OJVoucherBaseType.Infos createOJVoucherBaseTypeInfos() {
        return new OJVoucherBaseType.Infos();
    }

    /**
     * Create an instance of {@link OJVoucherInfosType.Info }
     * 
     */
    public OJVoucherInfosType.Info createOJVoucherInfosTypeInfo() {
        return new OJVoucherInfosType.Info();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms.GuestRoom.TypeRoom }
     * 
     */
    public FacilityInfoType.GuestRooms.GuestRoom.TypeRoom createFacilityInfoTypeGuestRoomsGuestRoomTypeRoom() {
        return new FacilityInfoType.GuestRooms.GuestRoom.TypeRoom();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms.GuestRoom.DayRoom }
     * 
     */
    public FacilityInfoType.GuestRooms.GuestRoom.DayRoom createFacilityInfoTypeGuestRoomsGuestRoomDayRoom() {
        return new FacilityInfoType.GuestRooms.GuestRoom.DayRoom();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms.GuestRoom.Amenities.Amenity }
     * 
     */
    public FacilityInfoType.GuestRooms.GuestRoom.Amenities.Amenity createFacilityInfoTypeGuestRoomsGuestRoomAmenitiesAmenity() {
        return new FacilityInfoType.GuestRooms.GuestRoom.Amenities.Amenity();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs.SpecificRoomTimeslotConfig }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs.SpecificRoomTimeslotConfig createFacilityInfoTypeMeetingRoomsPricingGroupsPricingGroupSpecificRoomTimeslotConfigsSpecificRoomTimeslotConfig() {
        return new FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs.SpecificRoomTimeslotConfig();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates.PeriodRate }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates.PeriodRate createFacilityInfoTypeMeetingRoomsPricingGroupsPricingGroupPeriodRatesPeriodRate() {
        return new FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates.PeriodRate();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates.DayRate }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates.DayRate createFacilityInfoTypeMeetingRoomsPricingGroupsPricingGroupDayRatesDayRate() {
        return new FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates.DayRate();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.TimeSlotRate }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.TimeSlotRate createFacilityInfoTypeMeetingRoomsPricingGroupsPricingGroupTimeSlotRatesTimeSlotRate() {
        return new FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.TimeSlotRate();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms.Room }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms.Room createFacilityInfoTypeMeetingRoomsPricingGroupsPricingGroupTimeSlotRatesRoomsRoom() {
        return new FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms.Room();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods.Period }
     * 
     */
    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods.Period createFacilityInfoTypeMeetingRoomsPricingGroupsPricingGroupPeriodsPeriod() {
        return new FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods.Period();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms.Codes.Code }
     * 
     */
    public FacilityInfoType.MeetingRooms.Codes.Code createFacilityInfoTypeMeetingRoomsCodesCode() {
        return new FacilityInfoType.MeetingRooms.Codes.Code();
    }

    /**
     * Create an instance of {@link MeetingRoomsType.MeetingRoom.Dimension }
     * 
     */
    public MeetingRoomsType.MeetingRoom.Dimension createMeetingRoomsTypeMeetingRoomDimension() {
        return new MeetingRoomsType.MeetingRoom.Dimension();
    }

    /**
     * Create an instance of {@link MeetingRoomsType.MeetingRoom.AvailableCapacities }
     * 
     */
    public MeetingRoomsType.MeetingRoom.AvailableCapacities createMeetingRoomsTypeMeetingRoomAvailableCapacities() {
        return new MeetingRoomsType.MeetingRoom.AvailableCapacities();
    }

    /**
     * Create an instance of {@link MeetingRoomsType.MeetingRoom.Codes.Code }
     * 
     */
    public MeetingRoomsType.MeetingRoom.Codes.Code createMeetingRoomsTypeMeetingRoomCodesCode() {
        return new MeetingRoomsType.MeetingRoom.Codes.Code();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Services }
     * 
     */
    public BasicPropertyInfoType.Services createBasicPropertyInfoTypeServices() {
        return new BasicPropertyInfoType.Services();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Position }
     * 
     */
    public BasicPropertyInfoType.Position createBasicPropertyInfoTypePosition() {
        return new BasicPropertyInfoType.Position();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Award }
     * 
     */
    public BasicPropertyInfoType.Award createBasicPropertyInfoTypeAward() {
        return new BasicPropertyInfoType.Award();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.RelativePosition }
     * 
     */
    public BasicPropertyInfoType.RelativePosition createBasicPropertyInfoTypeRelativePosition() {
        return new BasicPropertyInfoType.RelativePosition();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.HotelAmenity }
     * 
     */
    public BasicPropertyInfoType.HotelAmenity createBasicPropertyInfoTypeHotelAmenity() {
        return new BasicPropertyInfoType.HotelAmenity();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Recreation }
     * 
     */
    public BasicPropertyInfoType.Recreation createBasicPropertyInfoTypeRecreation() {
        return new BasicPropertyInfoType.Recreation();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.TaxConfigurations }
     * 
     */
    public BasicPropertyInfoType.TaxConfigurations createBasicPropertyInfoTypeTaxConfigurations() {
        return new BasicPropertyInfoType.TaxConfigurations();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.ContactNumbers.ContactNumber }
     * 
     */
    public BasicPropertyInfoType.ContactNumbers.ContactNumber createBasicPropertyInfoTypeContactNumbersContactNumber() {
        return new BasicPropertyInfoType.ContactNumbers.ContactNumber();
    }

    /**
     * Create an instance of {@link PkgPassengerListItem.SpecialNeed }
     * 
     */
    public PkgPassengerListItem.SpecialNeed createPkgPassengerListItemSpecialNeed() {
        return new PkgPassengerListItem.SpecialNeed();
    }

    /**
     * Create an instance of {@link TrainInfoType.ValidDate }
     * 
     */
    public TrainInfoType.ValidDate createTrainInfoTypeValidDate() {
        return new TrainInfoType.ValidDate();
    }

    /**
     * Create an instance of {@link VideoDescriptionType.VideoFormat }
     * 
     */
    public VideoDescriptionType.VideoFormat createVideoDescriptionTypeVideoFormat() {
        return new VideoDescriptionType.VideoFormat();
    }

    /**
     * Create an instance of {@link AirAncillaryLoungeProductType.CheckInTime }
     * 
     */
    public AirAncillaryLoungeProductType.CheckInTime createAirAncillaryLoungeProductTypeCheckInTime() {
        return new AirAncillaryLoungeProductType.CheckInTime();
    }

    /**
     * Create an instance of {@link AirAncillaryLoungeProductType.Rooms }
     * 
     */
    public AirAncillaryLoungeProductType.Rooms createAirAncillaryLoungeProductTypeRooms() {
        return new AirAncillaryLoungeProductType.Rooms();
    }

    /**
     * Create an instance of {@link AirAncillariesAirportProductSummaryType.Airport }
     * 
     */
    public AirAncillariesAirportProductSummaryType.Airport createAirAncillariesAirportProductSummaryTypeAirport() {
        return new AirAncillariesAirportProductSummaryType.Airport();
    }

    /**
     * Create an instance of {@link PackageProductType.Products }
     * 
     */
    public PackageProductType.Products createPackageProductTypeProducts() {
        return new PackageProductType.Products();
    }

    /**
     * Create an instance of {@link PackageProductType.Remarks }
     * 
     */
    public PackageProductType.Remarks createPackageProductTypeRemarks() {
        return new PackageProductType.Remarks();
    }

    /**
     * Create an instance of {@link PackageProductType.ExchangeRate }
     * 
     */
    public PackageProductType.ExchangeRate createPackageProductTypeExchangeRate() {
        return new PackageProductType.ExchangeRate();
    }

    /**
     * Create an instance of {@link PackageProductType.Attachments.Attachment }
     * 
     */
    public PackageProductType.Attachments.Attachment createPackageProductTypeAttachmentsAttachment() {
        return new PackageProductType.Attachments.Attachment();
    }

    /**
     * Create an instance of {@link CancelPenaltyType.Deadline }
     * 
     */
    public CancelPenaltyType.Deadline createCancelPenaltyTypeDeadline() {
        return new CancelPenaltyType.Deadline();
    }

    /**
     * Create an instance of {@link AgeQualificationType.PTC }
     * 
     */
    public AgeQualificationType.PTC createAgeQualificationTypePTC() {
        return new AgeQualificationType.PTC();
    }

    /**
     * Create an instance of {@link RelativePositionsType.RelativePosition }
     * 
     */
    public RelativePositionsType.RelativePosition createRelativePositionsTypeRelativePosition() {
        return new RelativePositionsType.RelativePosition();
    }

    /**
     * Create an instance of {@link ServiceBundleNoPriceType.Item.ItemDetail.DescriptionDetails }
     * 
     */
    public ServiceBundleNoPriceType.Item.ItemDetail.DescriptionDetails createServiceBundleNoPriceTypeItemItemDetailDescriptionDetails() {
        return new ServiceBundleNoPriceType.Item.ItemDetail.DescriptionDetails();
    }

    /**
     * Create an instance of {@link ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions.UpgradeMethod }
     * 
     */
    public ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions.UpgradeMethod createServiceBundleNoPriceTypeItemItemDetailBookingInstructionsUpgradeMethod() {
        return new ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link OJPaymentFormType.Voucher }
     * 
     */
    public OJPaymentFormType.Voucher createOJPaymentFormTypeVoucher() {
        return new OJPaymentFormType.Voucher();
    }

    /**
     * Create an instance of {@link OJPaymentFormType.LoyaltyRedemption }
     * 
     */
    public OJPaymentFormType.LoyaltyRedemption createOJPaymentFormTypeLoyaltyRedemption() {
        return new OJPaymentFormType.LoyaltyRedemption();
    }

    /**
     * Create an instance of {@link OJPaymentFormType.MiscChargeOrder }
     * 
     */
    public OJPaymentFormType.MiscChargeOrder createOJPaymentFormTypeMiscChargeOrder() {
        return new OJPaymentFormType.MiscChargeOrder();
    }

    /**
     * Create an instance of {@link OJPaymentFormType.Cash }
     * 
     */
    public OJPaymentFormType.Cash createOJPaymentFormTypeCash() {
        return new OJPaymentFormType.Cash();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.SeatsRequested }
     * 
     */
    public TravelerInfoSummaryType.SeatsRequested createTravelerInfoSummaryTypeSeatsRequested() {
        return new TravelerInfoSummaryType.SeatsRequested();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.NegotiatedFareCode }
     * 
     */
    public PriceRequestInformationType.NegotiatedFareCode createPriceRequestInformationTypeNegotiatedFareCode() {
        return new PriceRequestInformationType.NegotiatedFareCode();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.Promotion }
     * 
     */
    public PriceRequestInformationType.Promotion createPriceRequestInformationTypePromotion() {
        return new PriceRequestInformationType.Promotion();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride }
     * 
     */
    public TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride createTravelerInfoSummaryTypePriceRequestInformationSegmentOverride() {
        return new TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.PriceRequestInformation.Account }
     * 
     */
    public TravelerInfoSummaryType.PriceRequestInformation.Account createTravelerInfoSummaryTypePriceRequestInformationAccount() {
        return new TravelerInfoSummaryType.PriceRequestInformation.Account();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement }
     * 
     */
    public TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement createTravelerInfoSummaryTypePriceRequestInformationLocationRequirement() {
        return new TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference }
     * 
     */
    public TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference createTravelerInfoSummaryTypePriceRequestInformationDiscountPricingFlightReference() {
        return new TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference();
    }

    /**
     * Create an instance of {@link CouponType.Ticketing }
     * 
     */
    public CouponType.Ticketing createCouponTypeTicketing() {
        return new CouponType.Ticketing();
    }

    /**
     * Create an instance of {@link CouponType.Points }
     * 
     */
    public CouponType.Points createCouponTypePoints() {
        return new CouponType.Points();
    }

    /**
     * Create an instance of {@link CouponType.RedemptionInfo.CrossRefs }
     * 
     */
    public CouponType.RedemptionInfo.CrossRefs createCouponTypeRedemptionInfoCrossRefs() {
        return new CouponType.RedemptionInfo.CrossRefs();
    }

    /**
     * Create an instance of {@link CouponType.RedemptionInfo.Travelers }
     * 
     */
    public CouponType.RedemptionInfo.Travelers createCouponTypeRedemptionInfoTravelers() {
        return new CouponType.RedemptionInfo.Travelers();
    }

    /**
     * Create an instance of {@link AssociatedContentType.SpecialRequestDetails }
     * 
     */
    public AssociatedContentType.SpecialRequestDetails createAssociatedContentTypeSpecialRequestDetails() {
        return new AssociatedContentType.SpecialRequestDetails();
    }

    /**
     * Create an instance of {@link AssociatedContentType.AssocItems.AssocItem }
     * 
     */
    public AssociatedContentType.AssocItems.AssocItem createAssociatedContentTypeAssocItemsAssocItem() {
        return new AssociatedContentType.AssocItems.AssocItem();
    }

    /**
     * Create an instance of {@link AssociatedContentType.AssocItems.SpecialRequestDetails }
     * 
     */
    public AssociatedContentType.AssocItems.SpecialRequestDetails createAssociatedContentTypeAssocItemsSpecialRequestDetails() {
        return new AssociatedContentType.AssocItems.SpecialRequestDetails();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType.RatePlanCandidate.MealsIncluded }
     * 
     */
    public RatePlanCandidatesType.RatePlanCandidate.MealsIncluded createRatePlanCandidatesTypeRatePlanCandidateMealsIncluded() {
        return new RatePlanCandidatesType.RatePlanCandidate.MealsIncluded();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType.RatePlanCandidate.HotelRefs.HotelRef }
     * 
     */
    public RatePlanCandidatesType.RatePlanCandidate.HotelRefs.HotelRef createRatePlanCandidatesTypeRatePlanCandidateHotelRefsHotelRef() {
        return new RatePlanCandidatesType.RatePlanCandidate.HotelRefs.HotelRef();
    }

    /**
     * Create an instance of {@link BeneficiaryType.Telephone }
     * 
     */
    public BeneficiaryType.Telephone createBeneficiaryTypeTelephone() {
        return new BeneficiaryType.Telephone();
    }

    /**
     * Create an instance of {@link OntologyWeightType.WeightUnit }
     * 
     */
    public OntologyWeightType.WeightUnit createOntologyWeightTypeWeightUnit() {
        return new OntologyWeightType.WeightUnit();
    }

    /**
     * Create an instance of {@link OntologyDistanceType.Distance }
     * 
     */
    public OntologyDistanceType.Distance createOntologyDistanceTypeDistance() {
        return new OntologyDistanceType.Distance();
    }

    /**
     * Create an instance of {@link SeatDimensionType.Width }
     * 
     */
    public SeatDimensionType.Width createSeatDimensionTypeWidth() {
        return new SeatDimensionType.Width();
    }

    /**
     * Create an instance of {@link SeatDimensionType.Pitch }
     * 
     */
    public SeatDimensionType.Pitch createSeatDimensionTypePitch() {
        return new SeatDimensionType.Pitch();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.VoucherProductTypes.VoucherProductType }
     * 
     */
    public SupplierDescriptiveContentType.VoucherProductTypes.VoucherProductType createSupplierDescriptiveContentTypeVoucherProductTypesVoucherProductType() {
        return new SupplierDescriptiveContentType.VoucherProductTypes.VoucherProductType();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.MergeConfigurations.MergeConfiguration }
     * 
     */
    public SupplierDescriptiveContentType.MergeConfigurations.MergeConfiguration createSupplierDescriptiveContentTypeMergeConfigurationsMergeConfiguration() {
        return new SupplierDescriptiveContentType.MergeConfigurations.MergeConfiguration();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.Deduplication.Algorithm.Parameter }
     * 
     */
    public SupplierDescriptiveContentType.Deduplication.Algorithm.Parameter createSupplierDescriptiveContentTypeDeduplicationAlgorithmParameter() {
        return new SupplierDescriptiveContentType.Deduplication.Algorithm.Parameter();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.Policies.Policy }
     * 
     */
    public SupplierDescriptiveContentType.Policies.Policy createSupplierDescriptiveContentTypePoliciesPolicy() {
        return new SupplierDescriptiveContentType.Policies.Policy();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Addresses }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Addresses createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeAddresses() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Addresses();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Phones }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Phones createSupplierDescriptiveContentTypeBookingOfficesBookingOfficePhones() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Phones();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Emails }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Emails createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeEmails() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Emails();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.ContactInfos }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.ContactInfos createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeContractContactInfos() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.ContactInfos();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.BankAcct }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.BankAcct createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeContractPaymentDetailsPaymentDetailBankAcct() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.BankAcct();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.Currency }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.Currency createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeContractPaymentDetailsPaymentDetailCurrency() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.Currency();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeContractPaymentDetailsPaymentDetailAgressoExtraFieldsPaymentTerm() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Phones }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Phones createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeSupplierNotificationPhones() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Phones();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Emails }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Emails createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeSupplierNotificationEmails() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Emails();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts.Contact }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts.Contact createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeContactsContact() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts.Contact();
    }

    /**
     * Create an instance of {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names.Name }
     * 
     */
    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names.Name createSupplierDescriptiveContentTypeBookingOfficesBookingOfficeNamesName() {
        return new SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names.Name();
    }

    /**
     * Create an instance of {@link ActionsType.Action }
     * 
     */
    public ActionsType.Action createActionsTypeAction() {
        return new ActionsType.Action();
    }

    /**
     * Create an instance of {@link AirlinePrefType.FareRestrictPref }
     * 
     */
    public AirlinePrefType.FareRestrictPref createAirlinePrefTypeFareRestrictPref() {
        return new AirlinePrefType.FareRestrictPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.FlightTypePref }
     * 
     */
    public AirlinePrefType.FlightTypePref createAirlinePrefTypeFlightTypePref() {
        return new AirlinePrefType.FlightTypePref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.CabinPref }
     * 
     */
    public AirlinePrefType.CabinPref createAirlinePrefTypeCabinPref() {
        return new AirlinePrefType.CabinPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.SeatPref }
     * 
     */
    public AirlinePrefType.SeatPref createAirlinePrefTypeSeatPref() {
        return new AirlinePrefType.SeatPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.SSRPref }
     * 
     */
    public AirlinePrefType.SSRPref createAirlinePrefTypeSSRPref() {
        return new AirlinePrefType.SSRPref();
    }

    /**
     * Create an instance of {@link PersonNameType.Document }
     * 
     */
    public PersonNameType.Document createPersonNameTypeDocument() {
        return new PersonNameType.Document();
    }

    /**
     * Create an instance of {@link PersonNameType.AdditionalName }
     * 
     */
    public PersonNameType.AdditionalName createPersonNameTypeAdditionalName() {
        return new PersonNameType.AdditionalName();
    }

    /**
     * Create an instance of {@link ParagraphType.ListItem }
     * 
     */
    public ParagraphType.ListItem createParagraphTypeListItem() {
        return new ParagraphType.ListItem();
    }

    /**
     * Create an instance of {@link CabinAvailabilityType.Meal }
     * 
     */
    public CabinAvailabilityType.Meal createCabinAvailabilityTypeMeal() {
        return new CabinAvailabilityType.Meal();
    }

    /**
     * Create an instance of {@link CabinAvailabilityType.BaggageAllowance }
     * 
     */
    public CabinAvailabilityType.BaggageAllowance createCabinAvailabilityTypeBaggageAllowance() {
        return new CabinAvailabilityType.BaggageAllowance();
    }

    /**
     * Create an instance of {@link CabinAvailabilityType.FlightLoadInfo }
     * 
     */
    public CabinAvailabilityType.FlightLoadInfo createCabinAvailabilityTypeFlightLoadInfo() {
        return new CabinAvailabilityType.FlightLoadInfo();
    }

    /**
     * Create an instance of {@link TransportInfoType.TransportInfo }
     * 
     */
    public TransportInfoType.TransportInfo createTransportInfoTypeTransportInfo() {
        return new TransportInfoType.TransportInfo();
    }

    /**
     * Create an instance of {@link NotificationType.Data }
     * 
     */
    public NotificationType.Data createNotificationTypeData() {
        return new NotificationType.Data();
    }

    /**
     * Create an instance of {@link AccommodationInfoType.Resort }
     * 
     */
    public AccommodationInfoType.Resort createAccommodationInfoTypeResort() {
        return new AccommodationInfoType.Resort();
    }

    /**
     * Create an instance of {@link AccommodationInfoType.AccommodationClass }
     * 
     */
    public AccommodationInfoType.AccommodationClass createAccommodationInfoTypeAccommodationClass() {
        return new AccommodationInfoType.AccommodationClass();
    }

    /**
     * Create an instance of {@link FlightSegmentBaseType.DepartureAirport }
     * 
     */
    public FlightSegmentBaseType.DepartureAirport createFlightSegmentBaseTypeDepartureAirport() {
        return new FlightSegmentBaseType.DepartureAirport();
    }

    /**
     * Create an instance of {@link FlightSegmentBaseType.ArrivalAirport }
     * 
     */
    public FlightSegmentBaseType.ArrivalAirport createFlightSegmentBaseTypeArrivalAirport() {
        return new FlightSegmentBaseType.ArrivalAirport();
    }

    /**
     * Create an instance of {@link PkgAirSegmentType.AvailableSeats }
     * 
     */
    public PkgAirSegmentType.AvailableSeats createPkgAirSegmentTypeAvailableSeats() {
        return new PkgAirSegmentType.AvailableSeats();
    }

    /**
     * Create an instance of {@link PkgAirSegmentType.Passengers }
     * 
     */
    public PkgAirSegmentType.Passengers createPkgAirSegmentTypePassengers() {
        return new PkgAirSegmentType.Passengers();
    }

    /**
     * Create an instance of {@link TravelersType.Traveler.TravelerCharacteristic }
     * 
     */
    public TravelersType.Traveler.TravelerCharacteristic createTravelersTypeTravelerTravelerCharacteristic() {
        return new TravelersType.Traveler.TravelerCharacteristic();
    }

    /**
     * Create an instance of {@link PaymentLoyaltyType.Earn }
     * 
     */
    public PaymentLoyaltyType.Earn createPaymentLoyaltyTypeEarn() {
        return new PaymentLoyaltyType.Earn();
    }

    /**
     * Create an instance of {@link PaymentLoyaltyType.Redeem.SubRedeem }
     * 
     */
    public PaymentLoyaltyType.Redeem.SubRedeem createPaymentLoyaltyTypeRedeemSubRedeem() {
        return new PaymentLoyaltyType.Redeem.SubRedeem();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.CustomerType.Telephone }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.CustomerType.Telephone createCustomerTypeTelephone() {
        return new com.airchina.datacenter.spnr.sdk.entity.CustomerType.Telephone();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.CustomerType.Address }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.CustomerType.Address createCustomerTypeAddress() {
        return new com.airchina.datacenter.spnr.sdk.entity.CustomerType.Address();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.CustomerType.CitizenCountryName }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.CustomerType.CitizenCountryName createCustomerTypeCitizenCountryName() {
        return new com.airchina.datacenter.spnr.sdk.entity.CustomerType.CitizenCountryName();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.CustomerType.CustLoyalty }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.CustomerType.CustLoyalty createCustomerTypeCustLoyalty() {
        return new com.airchina.datacenter.spnr.sdk.entity.CustomerType.CustLoyalty();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.CustomerType.TravelerRefNumber }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.CustomerType.TravelerRefNumber createCustomerTypeTravelerRefNumber() {
        return new com.airchina.datacenter.spnr.sdk.entity.CustomerType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.CustomerType.PassengerTypeQuantity }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.CustomerType.PassengerTypeQuantity createCustomerTypePassengerTypeQuantity() {
        return new com.airchina.datacenter.spnr.sdk.entity.CustomerType.PassengerTypeQuantity();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.CustomerType.CorporateInfo.UserRoles.User }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.CustomerType.CorporateInfo.UserRoles.User createCustomerTypeCorporateInfoUserRolesUser() {
        return new com.airchina.datacenter.spnr.sdk.entity.CustomerType.CorporateInfo.UserRoles.User();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.RateDistance }
     * 
     */
    public VehicleRentalRateType.RateDistance createVehicleRentalRateTypeRateDistance() {
        return new VehicleRentalRateType.RateDistance();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.VehicleCharges }
     * 
     */
    public VehicleRentalRateType.VehicleCharges createVehicleRentalRateTypeVehicleCharges() {
        return new VehicleRentalRateType.VehicleCharges();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.RateRestrictions }
     * 
     */
    public VehicleRentalRateType.RateRestrictions createVehicleRentalRateTypeRateRestrictions() {
        return new VehicleRentalRateType.RateRestrictions();
    }

    /**
     * Create an instance of {@link PaymentFormType.Voucher }
     * 
     */
    public PaymentFormType.Voucher createPaymentFormTypeVoucher() {
        return new PaymentFormType.Voucher();
    }

    /**
     * Create an instance of {@link PaymentFormType.LoyaltyRedemption }
     * 
     */
    public PaymentFormType.LoyaltyRedemption createPaymentFormTypeLoyaltyRedemption() {
        return new PaymentFormType.LoyaltyRedemption();
    }

    /**
     * Create an instance of {@link PaymentFormType.MiscChargeOrder }
     * 
     */
    public PaymentFormType.MiscChargeOrder createPaymentFormTypeMiscChargeOrder() {
        return new PaymentFormType.MiscChargeOrder();
    }

    /**
     * Create an instance of {@link PaymentFormType.Cash }
     * 
     */
    public PaymentFormType.Cash createPaymentFormTypeCash() {
        return new PaymentFormType.Cash();
    }

    /**
     * Create an instance of {@link PaymentFormType.Other.Ref }
     * 
     */
    public PaymentFormType.Other.Ref createPaymentFormTypeOtherRef() {
        return new PaymentFormType.Other.Ref();
    }

    /**
     * Create an instance of {@link PaymentFormType.Ticket.ConjunctionTicketNbr }
     * 
     */
    public PaymentFormType.Ticket.ConjunctionTicketNbr createPaymentFormTypeTicketConjunctionTicketNbr() {
        return new PaymentFormType.Ticket.ConjunctionTicketNbr();
    }

    /**
     * Create an instance of {@link GeocodingType.Latitude }
     * 
     */
    public GeocodingType.Latitude createGeocodingTypeLatitude() {
        return new GeocodingType.Latitude();
    }

    /**
     * Create an instance of {@link GeocodingType.Longitude }
     * 
     */
    public GeocodingType.Longitude createGeocodingTypeLongitude() {
        return new GeocodingType.Longitude();
    }

    /**
     * Create an instance of {@link FormulaType.Info }
     * 
     */
    public FormulaType.Info createFormulaTypeInfo() {
        return new FormulaType.Info();
    }

    /**
     * Create an instance of {@link OffLocationServiceCoreType.Address }
     * 
     */
    public OffLocationServiceCoreType.Address createOffLocationServiceCoreTypeAddress() {
        return new OffLocationServiceCoreType.Address();
    }

    /**
     * Create an instance of {@link BaseFareType.FiledIn.Amount }
     * 
     */
    public BaseFareType.FiledIn.Amount createBaseFareTypeFiledInAmount() {
        return new BaseFareType.FiledIn.Amount();
    }

    /**
     * Create an instance of {@link BaseFareType.FiledIn.NUCAmount }
     * 
     */
    public BaseFareType.FiledIn.NUCAmount createBaseFareTypeFiledInNUCAmount() {
        return new BaseFareType.FiledIn.NUCAmount();
    }

    /**
     * Create an instance of {@link SellableProductsType.SellableProduct.InventoryBlock }
     * 
     */
    public SellableProductsType.SellableProduct.InventoryBlock createSellableProductsTypeSellableProductInventoryBlock() {
        return new SellableProductsType.SellableProduct.InventoryBlock();
    }

    /**
     * Create an instance of {@link ExtraType.Extra.Tax }
     * 
     */
    public ExtraType.Extra.Tax createExtraTypeExtraTax() {
        return new ExtraType.Extra.Tax();
    }

    /**
     * Create an instance of {@link ExtraType.Extra.Restrictions }
     * 
     */
    public ExtraType.Extra.Restrictions createExtraTypeExtraRestrictions() {
        return new ExtraType.Extra.Restrictions();
    }

    /**
     * Create an instance of {@link MultimediaObjectType.ImageData }
     * 
     */
    public MultimediaObjectType.ImageData createMultimediaObjectTypeImageData() {
        return new MultimediaObjectType.ImageData();
    }

    /**
     * Create an instance of {@link RoomStayType.TimeSpan }
     * 
     */
    public RoomStayType.TimeSpan createRoomStayTypeTimeSpan() {
        return new RoomStayType.TimeSpan();
    }

    /**
     * Create an instance of {@link RoomStayType.BasicPropertyInfo }
     * 
     */
    public RoomStayType.BasicPropertyInfo createRoomStayTypeBasicPropertyInfo() {
        return new RoomStayType.BasicPropertyInfo();
    }

    /**
     * Create an instance of {@link DateTimeSpanType.StartDateWindow }
     * 
     */
    public DateTimeSpanType.StartDateWindow createDateTimeSpanTypeStartDateWindow() {
        return new DateTimeSpanType.StartDateWindow();
    }

    /**
     * Create an instance of {@link DateTimeSpanType.EndDateWindow }
     * 
     */
    public DateTimeSpanType.EndDateWindow createDateTimeSpanTypeEndDateWindow() {
        return new DateTimeSpanType.EndDateWindow();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates.RoomRate }
     * 
     */
    public RoomStayType.RoomRates.RoomRate createRoomStayTypeRoomRatesRoomRate() {
        return new RoomStayType.RoomRates.RoomRate();
    }

    /**
     * Create an instance of {@link RoomRateType.Features.Feature }
     * 
     */
    public RoomRateType.Features.Feature createRoomRateTypeFeaturesFeature() {
        return new RoomRateType.Features.Feature();
    }

    /**
     * Create an instance of {@link RoomStayType.RatePlans.RatePlan }
     * 
     */
    public RoomStayType.RatePlans.RatePlan createRoomStayTypeRatePlansRatePlan() {
        return new RoomStayType.RatePlans.RatePlan();
    }

    /**
     * Create an instance of {@link RatePlanType.PaymentType }
     * 
     */
    public RatePlanType.PaymentType createRatePlanTypePaymentType() {
        return new RatePlanType.PaymentType();
    }

    /**
     * Create an instance of {@link RatePlanType.PaymentModel }
     * 
     */
    public RatePlanType.PaymentModel createRatePlanTypePaymentModel() {
        return new RatePlanType.PaymentModel();
    }

    /**
     * Create an instance of {@link RatePlanType.MealsIncluded }
     * 
     */
    public RatePlanType.MealsIncluded createRatePlanTypeMealsIncluded() {
        return new RatePlanType.MealsIncluded();
    }

    /**
     * Create an instance of {@link RatePlanType.RatePlanInclusions }
     * 
     */
    public RatePlanType.RatePlanInclusions createRatePlanTypeRatePlanInclusions() {
        return new RatePlanType.RatePlanInclusions();
    }

    /**
     * Create an instance of {@link RatePlanType.RestrictionStatus }
     * 
     */
    public RatePlanType.RestrictionStatus createRatePlanTypeRestrictionStatus() {
        return new RatePlanType.RestrictionStatus();
    }

    /**
     * Create an instance of {@link RatePlanType.SellingMode.Contracts.Contract }
     * 
     */
    public RatePlanType.SellingMode.Contracts.Contract createRatePlanTypeSellingModeContractsContract() {
        return new RatePlanType.SellingMode.Contracts.Contract();
    }

    /**
     * Create an instance of {@link RatePlanType.TaxPolicies.TaxPolicy }
     * 
     */
    public RatePlanType.TaxPolicies.TaxPolicy createRatePlanTypeTaxPoliciesTaxPolicy() {
        return new RatePlanType.TaxPolicies.TaxPolicy();
    }

    /**
     * Create an instance of {@link RatePlanType.ChildPricings.ChildPricing.Pricing }
     * 
     */
    public RatePlanType.ChildPricings.ChildPricing.Pricing createRatePlanTypeChildPricingsChildPricingPricing() {
        return new RatePlanType.ChildPricings.ChildPricing.Pricing();
    }

    /**
     * Create an instance of {@link RatePlanType.RatePlanLevelFee.Fee }
     * 
     */
    public RatePlanType.RatePlanLevelFee.Fee createRatePlanTypeRatePlanLevelFeeFee() {
        return new RatePlanType.RatePlanLevelFee.Fee();
    }

    /**
     * Create an instance of {@link RatePlanType.RatePlanShoulders.RatePlanShoulder }
     * 
     */
    public RatePlanType.RatePlanShoulders.RatePlanShoulder createRatePlanTypeRatePlanShouldersRatePlanShoulder() {
        return new RatePlanType.RatePlanShoulders.RatePlanShoulder();
    }

    /**
     * Create an instance of {@link RateUploadType.GuaranteePolicies }
     * 
     */
    public RateUploadType.GuaranteePolicies createRateUploadTypeGuaranteePolicies() {
        return new RateUploadType.GuaranteePolicies();
    }

    /**
     * Create an instance of {@link RatePlanType.Rates.Rate.MealPlans.MealPlan }
     * 
     */
    public RatePlanType.Rates.Rate.MealPlans.MealPlan createRatePlanTypeRatesRateMealPlansMealPlan() {
        return new RatePlanType.Rates.Rate.MealPlans.MealPlan();
    }

    /**
     * Create an instance of {@link RateUploadType.AdditionalGuestAmounts.AdditionalGuestAmount }
     * 
     */
    public RateUploadType.AdditionalGuestAmounts.AdditionalGuestAmount createRateUploadTypeAdditionalGuestAmountsAdditionalGuestAmount() {
        return new RateUploadType.AdditionalGuestAmounts.AdditionalGuestAmount();
    }

    /**
     * Create an instance of {@link RateUploadType.BaseByGuestAmts.BaseByGuestAmt }
     * 
     */
    public RateUploadType.BaseByGuestAmts.BaseByGuestAmt createRateUploadTypeBaseByGuestAmtsBaseByGuestAmt() {
        return new RateUploadType.BaseByGuestAmts.BaseByGuestAmt();
    }

    /**
     * Create an instance of {@link RateUploadType.BaseByGuestAmts.AvailableDaysOfWeek }
     * 
     */
    public RateUploadType.BaseByGuestAmts.AvailableDaysOfWeek createRateUploadTypeBaseByGuestAmtsAvailableDaysOfWeek() {
        return new RateUploadType.BaseByGuestAmts.AvailableDaysOfWeek();
    }

    /**
     * Create an instance of {@link RatePlanType.TaxesAndMargins.TaxAndMargin.Tax }
     * 
     */
    public RatePlanType.TaxesAndMargins.TaxAndMargin.Tax createRatePlanTypeTaxesAndMarginsTaxAndMarginTax() {
        return new RatePlanType.TaxesAndMargins.TaxAndMargin.Tax();
    }

    /**
     * Create an instance of {@link RatePlanType.TaxesAndMargins.TaxAndMargin.Margin }
     * 
     */
    public RatePlanType.TaxesAndMargins.TaxAndMargin.Margin createRatePlanTypeTaxesAndMarginsTaxAndMarginMargin() {
        return new RatePlanType.TaxesAndMargins.TaxAndMargin.Margin();
    }

    /**
     * Create an instance of {@link RatePlanType.Extras.Extra }
     * 
     */
    public RatePlanType.Extras.Extra createRatePlanTypeExtrasExtra() {
        return new RatePlanType.Extras.Extra();
    }

    /**
     * Create an instance of {@link RatePlanType.BookingRules.InventoryInfo }
     * 
     */
    public RatePlanType.BookingRules.InventoryInfo createRatePlanTypeBookingRulesInventoryInfo() {
        return new RatePlanType.BookingRules.InventoryInfo();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.RestrictionStatus }
     * 
     */
    public BookingRulesType.BookingRule.RestrictionStatus createBookingRulesTypeBookingRuleRestrictionStatus() {
        return new BookingRulesType.BookingRule.RestrictionStatus();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.CheckoutCharge }
     * 
     */
    public BookingRulesType.BookingRule.CheckoutCharge createBookingRulesTypeBookingRuleCheckoutCharge() {
        return new BookingRulesType.BookingRule.CheckoutCharge();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.AddtionalRules.AdditionalRule }
     * 
     */
    public BookingRulesType.BookingRule.AddtionalRules.AdditionalRule createBookingRulesTypeBookingRuleAddtionalRulesAdditionalRule() {
        return new BookingRulesType.BookingRule.AddtionalRules.AdditionalRule();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.DOWRestrictions.AvailableDaysOfWeek }
     * 
     */
    public BookingRulesType.BookingRule.DOWRestrictions.AvailableDaysOfWeek createBookingRulesTypeBookingRuleDOWRestrictionsAvailableDaysOfWeek() {
        return new BookingRulesType.BookingRule.DOWRestrictions.AvailableDaysOfWeek();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.DOWRestrictions.ArrivalDaysOfWeek }
     * 
     */
    public BookingRulesType.BookingRule.DOWRestrictions.ArrivalDaysOfWeek createBookingRulesTypeBookingRuleDOWRestrictionsArrivalDaysOfWeek() {
        return new BookingRulesType.BookingRule.DOWRestrictions.ArrivalDaysOfWeek();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.DOWRestrictions.DepartureDaysOfWeek }
     * 
     */
    public BookingRulesType.BookingRule.DOWRestrictions.DepartureDaysOfWeek createBookingRulesTypeBookingRuleDOWRestrictionsDepartureDaysOfWeek() {
        return new BookingRulesType.BookingRule.DOWRestrictions.DepartureDaysOfWeek();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.DOWRestrictions.RequiredDaysOfWeek }
     * 
     */
    public BookingRulesType.BookingRule.DOWRestrictions.RequiredDaysOfWeek createBookingRulesTypeBookingRuleDOWRestrictionsRequiredDaysOfWeek() {
        return new BookingRulesType.BookingRule.DOWRestrictions.RequiredDaysOfWeek();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.AcceptableGuarantees.AcceptableGuarantee }
     * 
     */
    public BookingRulesType.BookingRule.AcceptableGuarantees.AcceptableGuarantee createBookingRulesTypeBookingRuleAcceptableGuaranteesAcceptableGuarantee() {
        return new BookingRulesType.BookingRule.AcceptableGuarantees.AcceptableGuarantee();
    }

    /**
     * Create an instance of {@link GuaranteeType.Deadline }
     * 
     */
    public GuaranteeType.Deadline createGuaranteeTypeDeadline() {
        return new GuaranteeType.Deadline();
    }

    /**
     * Create an instance of {@link GuaranteeType.GuaranteesAccepted.GuaranteeAccepted }
     * 
     */
    public GuaranteeType.GuaranteesAccepted.GuaranteeAccepted createGuaranteeTypeGuaranteesAcceptedGuaranteeAccepted() {
        return new GuaranteeType.GuaranteesAccepted.GuaranteeAccepted();
    }

    /**
     * Create an instance of {@link RatePlanType.Notifications.Notification }
     * 
     */
    public RatePlanType.Notifications.Notification createRatePlanTypeNotificationsNotification() {
        return new RatePlanType.Notifications.Notification();
    }

    /**
     * Create an instance of {@link RatePlanType.MealPlans.MealPlan }
     * 
     */
    public RatePlanType.MealPlans.MealPlan createRatePlanTypeMealPlansMealPlan() {
        return new RatePlanType.MealPlans.MealPlan();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomTypes.RoomType }
     * 
     */
    public RoomStayType.RoomTypes.RoomType createRoomStayTypeRoomTypesRoomType() {
        return new RoomStayType.RoomTypes.RoomType();
    }

    /**
     * Create an instance of {@link RoomTypeType.Amenities }
     * 
     */
    public RoomTypeType.Amenities createRoomTypeTypeAmenities() {
        return new RoomTypeType.Amenities();
    }

    /**
     * Create an instance of {@link RoomTypeType.Occupancy }
     * 
     */
    public RoomTypeType.Occupancy createRoomTypeTypeOccupancy() {
        return new RoomTypeType.Occupancy();
    }

    /**
     * Create an instance of {@link PkgFlightSegmentBaseType.DepartureAirport }
     * 
     */
    public PkgFlightSegmentBaseType.DepartureAirport createPkgFlightSegmentBaseTypeDepartureAirport() {
        return new PkgFlightSegmentBaseType.DepartureAirport();
    }

    /**
     * Create an instance of {@link PkgFlightSegmentBaseType.ArrivalAirport }
     * 
     */
    public PkgFlightSegmentBaseType.ArrivalAirport createPkgFlightSegmentBaseTypeArrivalAirport() {
        return new PkgFlightSegmentBaseType.ArrivalAirport();
    }

    /**
     * Create an instance of {@link HotelRoomListType.MasterAccount }
     * 
     */
    public HotelRoomListType.MasterAccount createHotelRoomListTypeMasterAccount() {
        return new HotelRoomListType.MasterAccount();
    }

    /**
     * Create an instance of {@link HotelRoomListType.Event }
     * 
     */
    public HotelRoomListType.Event createHotelRoomListTypeEvent() {
        return new HotelRoomListType.Event();
    }

    /**
     * Create an instance of {@link HotelRoomListType.RoomStays.RoomStay }
     * 
     */
    public HotelRoomListType.RoomStays.RoomStay createHotelRoomListTypeRoomStaysRoomStay() {
        return new HotelRoomListType.RoomStays.RoomStay();
    }

    /**
     * Create an instance of {@link DirectBillType.CompanyName }
     * 
     */
    public DirectBillType.CompanyName createDirectBillTypeCompanyName() {
        return new DirectBillType.CompanyName();
    }

    /**
     * Create an instance of {@link ContactPersonType.CustLoyalty }
     * 
     */
    public ContactPersonType.CustLoyalty createContactPersonTypeCustLoyalty() {
        return new ContactPersonType.CustLoyalty();
    }

    /**
     * Create an instance of {@link ContactPersonType.TravelerRefNumber }
     * 
     */
    public ContactPersonType.TravelerRefNumber createContactPersonTypeTravelerRefNumber() {
        return new ContactPersonType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link ContactPersonType.Document }
     * 
     */
    public ContactPersonType.Document createContactPersonTypeDocument() {
        return new ContactPersonType.Document();
    }

    /**
     * Create an instance of {@link HotelRoomListType.MasterContact.UniqueIDs }
     * 
     */
    public HotelRoomListType.MasterContact.UniqueIDs createHotelRoomListTypeMasterContactUniqueIDs() {
        return new HotelRoomListType.MasterContact.UniqueIDs();
    }

    /**
     * Create an instance of {@link HotelRoomListType.MasterContact.Loyalty }
     * 
     */
    public HotelRoomListType.MasterContact.Loyalty createHotelRoomListTypeMasterContactLoyalty() {
        return new HotelRoomListType.MasterContact.Loyalty();
    }

    /**
     * Create an instance of {@link HotelRoomListType.Guests.Guest.Loyalty }
     * 
     */
    public HotelRoomListType.Guests.Guest.Loyalty createHotelRoomListTypeGuestsGuestLoyalty() {
        return new HotelRoomListType.Guests.Guest.Loyalty();
    }

    /**
     * Create an instance of {@link HotelRoomListType.Guests.Guest.GuaranteePayment }
     * 
     */
    public HotelRoomListType.Guests.Guest.GuaranteePayment createHotelRoomListTypeGuestsGuestGuaranteePayment() {
        return new HotelRoomListType.Guests.Guest.GuaranteePayment();
    }

    /**
     * Create an instance of {@link HotelPaymentFormType.MasterAccountUsage }
     * 
     */
    public HotelPaymentFormType.MasterAccountUsage createHotelPaymentFormTypeMasterAccountUsage() {
        return new HotelPaymentFormType.MasterAccountUsage();
    }

    /**
     * Create an instance of {@link BiasingInfos.BiasingInfo }
     * 
     */
    public BiasingInfos.BiasingInfo createBiasingInfosBiasingInfo() {
        return new BiasingInfos.BiasingInfo();
    }

    /**
     * Create an instance of {@link CancelInfoRSType.CancelRules }
     * 
     */
    public CancelInfoRSType.CancelRules createCancelInfoRSTypeCancelRules() {
        return new CancelInfoRSType.CancelRules();
    }

    /**
     * Create an instance of {@link CoreBagAllowanceType.MaxWeightPerPiece }
     * 
     */
    public CoreBagAllowanceType.MaxWeightPerPiece createCoreBagAllowanceTypeMaxWeightPerPiece() {
        return new CoreBagAllowanceType.MaxWeightPerPiece();
    }

    /**
     * Create an instance of {@link CoreBagAllowanceType.MaxLengthPerPiece }
     * 
     */
    public CoreBagAllowanceType.MaxLengthPerPiece createCoreBagAllowanceTypeMaxLengthPerPiece() {
        return new CoreBagAllowanceType.MaxLengthPerPiece();
    }

    /**
     * Create an instance of {@link CoreBagAllowanceType.BaggageDescription }
     * 
     */
    public CoreBagAllowanceType.BaggageDescription createCoreBagAllowanceTypeBaggageDescription() {
        return new CoreBagAllowanceType.BaggageDescription();
    }

    /**
     * Create an instance of {@link CoreBagAllowanceType.TotalWeight }
     * 
     */
    public CoreBagAllowanceType.TotalWeight createCoreBagAllowanceTypeTotalWeight() {
        return new CoreBagAllowanceType.TotalWeight();
    }

    /**
     * Create an instance of {@link CarryOnAllowanceType.Diagnostics }
     * 
     */
    public CarryOnAllowanceType.Diagnostics createCarryOnAllowanceTypeDiagnostics() {
        return new CarryOnAllowanceType.Diagnostics();
    }

    /**
     * Create an instance of {@link CarryOnAllowanceType.BookingInstructions.UpgradeMethod }
     * 
     */
    public CarryOnAllowanceType.BookingInstructions.UpgradeMethod createCarryOnAllowanceTypeBookingInstructionsUpgradeMethod() {
        return new CarryOnAllowanceType.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link FlightDetailsType.FlightLegInfo.DepartureAirport }
     * 
     */
    public FlightDetailsType.FlightLegInfo.DepartureAirport createFlightDetailsTypeFlightLegInfoDepartureAirport() {
        return new FlightDetailsType.FlightLegInfo.DepartureAirport();
    }

    /**
     * Create an instance of {@link FlightDetailsType.FlightLegInfo.ArrivalAirport }
     * 
     */
    public FlightDetailsType.FlightLegInfo.ArrivalAirport createFlightDetailsTypeFlightLegInfoArrivalAirport() {
        return new FlightDetailsType.FlightLegInfo.ArrivalAirport();
    }

    /**
     * Create an instance of {@link FlightDetailsType.FlightLegInfo.Comment }
     * 
     */
    public FlightDetailsType.FlightLegInfo.Comment createFlightDetailsTypeFlightLegInfoComment() {
        return new FlightDetailsType.FlightLegInfo.Comment();
    }

    /**
     * Create an instance of {@link FlightDetailsType.FlightLegInfo.DepartureDateTime }
     * 
     */
    public FlightDetailsType.FlightLegInfo.DepartureDateTime createFlightDetailsTypeFlightLegInfoDepartureDateTime() {
        return new FlightDetailsType.FlightLegInfo.DepartureDateTime();
    }

    /**
     * Create an instance of {@link FlightDetailsType.FlightLegInfo.ArrivalDateTime }
     * 
     */
    public FlightDetailsType.FlightLegInfo.ArrivalDateTime createFlightDetailsTypeFlightLegInfoArrivalDateTime() {
        return new FlightDetailsType.FlightLegInfo.ArrivalDateTime();
    }

    /**
     * Create an instance of {@link FlightDetailsType.FlightLegInfo.OperationTimes.OperationTime }
     * 
     */
    public FlightDetailsType.FlightLegInfo.OperationTimes.OperationTime createFlightDetailsTypeFlightLegInfoOperationTimesOperationTime() {
        return new FlightDetailsType.FlightLegInfo.OperationTimes.OperationTime();
    }

    /**
     * Create an instance of {@link ConversionType.CoreProduct }
     * 
     */
    public ConversionType.CoreProduct createConversionTypeCoreProduct() {
        return new ConversionType.CoreProduct();
    }

    /**
     * Create an instance of {@link ConversionType.SPNR }
     * 
     */
    public ConversionType.SPNR createConversionTypeSPNR() {
        return new ConversionType.SPNR();
    }

    /**
     * Create an instance of {@link RestrictionLocationsType.Location }
     * 
     */
    public RestrictionLocationsType.Location createRestrictionLocationsTypeLocation() {
        return new RestrictionLocationsType.Location();
    }

    /**
     * Create an instance of {@link GuestRoomType.Quantities }
     * 
     */
    public GuestRoomType.Quantities createGuestRoomTypeQuantities() {
        return new GuestRoomType.Quantities();
    }

    /**
     * Create an instance of {@link GuestRoomType.Room }
     * 
     */
    public GuestRoomType.Room createGuestRoomTypeRoom() {
        return new GuestRoomType.Room();
    }

    /**
     * Create an instance of {@link GuestRoomType.RoomLevelFees }
     * 
     */
    public GuestRoomType.RoomLevelFees createGuestRoomTypeRoomLevelFees() {
        return new GuestRoomType.RoomLevelFees();
    }

    /**
     * Create an instance of {@link GuestRoomType.Amenities.Amenity }
     * 
     */
    public GuestRoomType.Amenities.Amenity createGuestRoomTypeAmenitiesAmenity() {
        return new GuestRoomType.Amenities.Amenity();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentType.Notifications.Notification }
     * 
     */
    public DestActivityDescriptiveContentType.Notifications.Notification createDestActivityDescriptiveContentTypeNotificationsNotification() {
        return new DestActivityDescriptiveContentType.Notifications.Notification();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description.Text }
     * 
     */
    public DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description.Text createDestActivityDescriptiveContentTypeTicketCategoriesTicketCategoryDescriptionText() {
        return new DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description.Text();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentType.Extras.Extra.Description.Text }
     * 
     */
    public DestActivityDescriptiveContentType.Extras.Extra.Description.Text createDestActivityDescriptiveContentTypeExtrasExtraDescriptionText() {
        return new DestActivityDescriptiveContentType.Extras.Extra.Description.Text();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentType.Positions.Position }
     * 
     */
    public DestActivityDescriptiveContentType.Positions.Position createDestActivityDescriptiveContentTypePositionsPosition() {
        return new DestActivityDescriptiveContentType.Positions.Position();
    }

    /**
     * Create an instance of {@link CancellationFeesType.CancellationFee }
     * 
     */
    public CancellationFeesType.CancellationFee createCancellationFeesTypeCancellationFee() {
        return new CancellationFeesType.CancellationFee();
    }

    /**
     * Create an instance of {@link CancellationFeeType.NonMemberFee }
     * 
     */
    public CancellationFeeType.NonMemberFee createCancellationFeeTypeNonMemberFee() {
        return new CancellationFeeType.NonMemberFee();
    }

    /**
     * Create an instance of {@link ImageDescriptionType.ImageFormat }
     * 
     */
    public ImageDescriptionType.ImageFormat createImageDescriptionTypeImageFormat() {
        return new ImageDescriptionType.ImageFormat();
    }

    /**
     * Create an instance of {@link ImageDescriptionType.Description }
     * 
     */
    public ImageDescriptionType.Description createImageDescriptionTypeDescription() {
        return new ImageDescriptionType.Description();
    }

    /**
     * Create an instance of {@link PhonesType.Phone }
     * 
     */
    public PhonesType.Phone createPhonesTypePhone() {
        return new PhonesType.Phone();
    }

    /**
     * Create an instance of {@link AddOnsType.AddOn.Notifications.Notification }
     * 
     */
    public AddOnsType.AddOn.Notifications.Notification createAddOnsTypeAddOnNotificationsNotification() {
        return new AddOnsType.AddOn.Notifications.Notification();
    }

    /**
     * Create an instance of {@link AddOnsType.PassengerTypes.PassengerType }
     * 
     */
    public AddOnsType.PassengerTypes.PassengerType createAddOnsTypePassengerTypesPassengerType() {
        return new AddOnsType.PassengerTypes.PassengerType();
    }

    /**
     * Create an instance of {@link GroundTransportRouteQueryType.RailQuery }
     * 
     */
    public GroundTransportRouteQueryType.RailQuery createGroundTransportRouteQueryTypeRailQuery() {
        return new GroundTransportRouteQueryType.RailQuery();
    }

    /**
     * Create an instance of {@link GroundTransportRouteQueryType.BusQuery }
     * 
     */
    public GroundTransportRouteQueryType.BusQuery createGroundTransportRouteQueryTypeBusQuery() {
        return new GroundTransportRouteQueryType.BusQuery();
    }

    /**
     * Create an instance of {@link GroundTransportQueryType.Supplier }
     * 
     */
    public GroundTransportQueryType.Supplier createGroundTransportQueryTypeSupplier() {
        return new GroundTransportQueryType.Supplier();
    }

    /**
     * Create an instance of {@link JourneySegmentType.FareOption.PriceDetail }
     * 
     */
    public JourneySegmentType.FareOption.PriceDetail createJourneySegmentTypeFareOptionPriceDetail() {
        return new JourneySegmentType.FareOption.PriceDetail();
    }

    /**
     * Create an instance of {@link RailPriceType.Price }
     * 
     */
    public RailPriceType.Price createRailPriceTypePrice() {
        return new RailPriceType.Price();
    }

    /**
     * Create an instance of {@link JourneySegmentType.FareOption.TotalFare.AlternateCurrencyTotal }
     * 
     */
    public JourneySegmentType.FareOption.TotalFare.AlternateCurrencyTotal createJourneySegmentTypeFareOptionTotalFareAlternateCurrencyTotal() {
        return new JourneySegmentType.FareOption.TotalFare.AlternateCurrencyTotal();
    }

    /**
     * Create an instance of {@link BusSegmentType.Equipment }
     * 
     */
    public BusSegmentType.Equipment createBusSegmentTypeEquipment() {
        return new BusSegmentType.Equipment();
    }

    /**
     * Create an instance of {@link JourneySegmentType.BusSegment.ClassCodes }
     * 
     */
    public JourneySegmentType.BusSegment.ClassCodes createJourneySegmentTypeBusSegmentClassCodes() {
        return new JourneySegmentType.BusSegment.ClassCodes();
    }

    /**
     * Create an instance of {@link JourneySegmentType.BusSegment.Remarks }
     * 
     */
    public JourneySegmentType.BusSegment.Remarks createJourneySegmentTypeBusSegmentRemarks() {
        return new JourneySegmentType.BusSegment.Remarks();
    }

    /**
     * Create an instance of {@link JourneySegmentType.TrainSegment.Remarks }
     * 
     */
    public JourneySegmentType.TrainSegment.Remarks createJourneySegmentTypeTrainSegmentRemarks() {
        return new JourneySegmentType.TrainSegment.Remarks();
    }

    /**
     * Create an instance of {@link JourneySegmentType.TrainSegment.AvailabilityDetail.ClassCode }
     * 
     */
    public JourneySegmentType.TrainSegment.AvailabilityDetail.ClassCode createJourneySegmentTypeTrainSegmentAvailabilityDetailClassCode() {
        return new JourneySegmentType.TrainSegment.AvailabilityDetail.ClassCode();
    }

    /**
     * Create an instance of {@link SourceType.BookingChannel }
     * 
     */
    public SourceType.BookingChannel createSourceTypeBookingChannel() {
        return new SourceType.BookingChannel();
    }

    /**
     * Create an instance of {@link SourceType.CorporateIDs }
     * 
     */
    public SourceType.CorporateIDs createSourceTypeCorporateIDs() {
        return new SourceType.CorporateIDs();
    }

    /**
     * Create an instance of {@link SocialNetworkingPaxType.TravelerIDRef }
     * 
     */
    public SocialNetworkingPaxType.TravelerIDRef createSocialNetworkingPaxTypeTravelerIDRef() {
        return new SocialNetworkingPaxType.TravelerIDRef();
    }

    /**
     * Create an instance of {@link RailAvailPrefsType.TransportModes }
     * 
     */
    public RailAvailPrefsType.TransportModes createRailAvailPrefsTypeTransportModes() {
        return new RailAvailPrefsType.TransportModes();
    }

    /**
     * Create an instance of {@link FlightSegmentType.MarketingAirline }
     * 
     */
    public FlightSegmentType.MarketingAirline createFlightSegmentTypeMarketingAirline() {
        return new FlightSegmentType.MarketingAirline();
    }

    /**
     * Create an instance of {@link FlightSegmentType.Codeshare }
     * 
     */
    public FlightSegmentType.Codeshare createFlightSegmentTypeCodeshare() {
        return new FlightSegmentType.Codeshare();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.BookingClassAvail }
     * 
     */
    public BookFlightSegmentType.BookingClassAvail createBookFlightSegmentTypeBookingClassAvail() {
        return new BookFlightSegmentType.BookingClassAvail();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.Comment }
     * 
     */
    public BookFlightSegmentType.Comment createBookFlightSegmentTypeComment() {
        return new BookFlightSegmentType.Comment();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.StopLocation }
     * 
     */
    public BookFlightSegmentType.StopLocation createBookFlightSegmentTypeStopLocation() {
        return new BookFlightSegmentType.StopLocation();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.BookingClassAvails.BookingClassAvail }
     * 
     */
    public BookFlightSegmentType.BookingClassAvails.BookingClassAvail createBookFlightSegmentTypeBookingClassAvailsBookingClassAvail() {
        return new BookFlightSegmentType.BookingClassAvails.BookingClassAvail();
    }

    /**
     * Create an instance of {@link LengthsOfStayType.LengthOfStay.LOSPattern }
     * 
     */
    public LengthsOfStayType.LengthOfStay.LOSPattern createLengthsOfStayTypeLengthOfStayLOSPattern() {
        return new LengthsOfStayType.LengthOfStay.LOSPattern();
    }

    /**
     * Create an instance of {@link LengthsOfStayType.LengthOfStay.DOW }
     * 
     */
    public LengthsOfStayType.LengthOfStay.DOW createLengthsOfStayTypeLengthOfStayDOW() {
        return new LengthsOfStayType.LengthOfStay.DOW();
    }

    /**
     * Create an instance of {@link CheckedBagAllowanceType.MaxWeightPerPiece }
     * 
     */
    public CheckedBagAllowanceType.MaxWeightPerPiece createCheckedBagAllowanceTypeMaxWeightPerPiece() {
        return new CheckedBagAllowanceType.MaxWeightPerPiece();
    }

    /**
     * Create an instance of {@link CheckedBagAllowanceType.MaxLengthPerPiece }
     * 
     */
    public CheckedBagAllowanceType.MaxLengthPerPiece createCheckedBagAllowanceTypeMaxLengthPerPiece() {
        return new CheckedBagAllowanceType.MaxLengthPerPiece();
    }

    /**
     * Create an instance of {@link CheckedBagAllowanceType.BaggageDescription }
     * 
     */
    public CheckedBagAllowanceType.BaggageDescription createCheckedBagAllowanceTypeBaggageDescription() {
        return new CheckedBagAllowanceType.BaggageDescription();
    }

    /**
     * Create an instance of {@link CheckedBagAllowanceType.TotalWeight }
     * 
     */
    public CheckedBagAllowanceType.TotalWeight createCheckedBagAllowanceTypeTotalWeight() {
        return new CheckedBagAllowanceType.TotalWeight();
    }

    /**
     * Create an instance of {@link FormulasType.Formula }
     * 
     */
    public FormulasType.Formula createFormulasTypeFormula() {
        return new FormulasType.Formula();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ProfileType.UserID }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ProfileType.UserID createProfileTypeUserID() {
        return new com.airchina.datacenter.spnr.sdk.entity.ProfileType.UserID();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ProfileType.Loyalty }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ProfileType.Loyalty createProfileTypeLoyalty() {
        return new com.airchina.datacenter.spnr.sdk.entity.ProfileType.Loyalty();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ProfileType.CorporateInfo }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ProfileType.CorporateInfo createProfileTypeCorporateInfo() {
        return new com.airchina.datacenter.spnr.sdk.entity.ProfileType.CorporateInfo();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ProfileType.CustomQuestions }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ProfileType.CustomQuestions createProfileTypeCustomQuestions() {
        return new com.airchina.datacenter.spnr.sdk.entity.ProfileType.CustomQuestions();
    }

    /**
     * Create an instance of {@link Specials.Special.Discount.Description.Text }
     * 
     */
    public Specials.Special.Discount.Description.Text createSpecialsSpecialDiscountDescriptionText() {
        return new Specials.Special.Discount.Description.Text();
    }

    /**
     * Create an instance of {@link Specials.Special.StayDates.StayDate.DOW }
     * 
     */
    public Specials.Special.StayDates.StayDate.DOW createSpecialsSpecialStayDatesStayDateDOW() {
        return new Specials.Special.StayDates.StayDate.DOW();
    }

    /**
     * Create an instance of {@link Specials.Special.StayDates.StayDate.ArrivalDaysOfWeek }
     * 
     */
    public Specials.Special.StayDates.StayDate.ArrivalDaysOfWeek createSpecialsSpecialStayDatesStayDateArrivalDaysOfWeek() {
        return new Specials.Special.StayDates.StayDate.ArrivalDaysOfWeek();
    }

    /**
     * Create an instance of {@link Specials.Special.StayDates.StayDate.BookingDates.BookingDate.DOW }
     * 
     */
    public Specials.Special.StayDates.StayDate.BookingDates.BookingDate.DOW createSpecialsSpecialStayDatesStayDateBookingDatesBookingDateDOW() {
        return new Specials.Special.StayDates.StayDate.BookingDates.BookingDate.DOW();
    }

    /**
     * Create an instance of {@link Specials.Special.RoomTypes.RoomType }
     * 
     */
    public Specials.Special.RoomTypes.RoomType createSpecialsSpecialRoomTypesRoomType() {
        return new Specials.Special.RoomTypes.RoomType();
    }

    /**
     * Create an instance of {@link CategoryCodesType.HotelCategory }
     * 
     */
    public CategoryCodesType.HotelCategory createCategoryCodesTypeHotelCategory() {
        return new CategoryCodesType.HotelCategory();
    }

    /**
     * Create an instance of {@link CategoryCodesType.LocationCategory }
     * 
     */
    public CategoryCodesType.LocationCategory createCategoryCodesTypeLocationCategory() {
        return new CategoryCodesType.LocationCategory();
    }

    /**
     * Create an instance of {@link CategoryCodesType.SegmentCategory }
     * 
     */
    public CategoryCodesType.SegmentCategory createCategoryCodesTypeSegmentCategory() {
        return new CategoryCodesType.SegmentCategory();
    }

    /**
     * Create an instance of {@link CategoryCodesType.ArchitecturalStyle }
     * 
     */
    public CategoryCodesType.ArchitecturalStyle createCategoryCodesTypeArchitecturalStyle() {
        return new CategoryCodesType.ArchitecturalStyle();
    }

    /**
     * Create an instance of {@link CategoryCodesType.GuestRoomInfo.RateRanges.RateRange }
     * 
     */
    public CategoryCodesType.GuestRoomInfo.RateRanges.RateRange createCategoryCodesTypeGuestRoomInfoRateRangesRateRange() {
        return new CategoryCodesType.GuestRoomInfo.RateRanges.RateRange();
    }

    /**
     * Create an instance of {@link VehicleLocationDetailsType.Telephone }
     * 
     */
    public VehicleLocationDetailsType.Telephone createVehicleLocationDetailsTypeTelephone() {
        return new VehicleLocationDetailsType.Telephone();
    }

    /**
     * Create an instance of {@link SupplierPenaltiesType.SupplierPenalty }
     * 
     */
    public SupplierPenaltiesType.SupplierPenalty createSupplierPenaltiesTypeSupplierPenalty() {
        return new SupplierPenaltiesType.SupplierPenalty();
    }

    /**
     * Create an instance of {@link AccommodationSegmentRequestType.RoomProfiles }
     * 
     */
    public AccommodationSegmentRequestType.RoomProfiles createAccommodationSegmentRequestTypeRoomProfiles() {
        return new AccommodationSegmentRequestType.RoomProfiles();
    }

    /**
     * Create an instance of {@link AccommodationSegmentRequestType.MealPlans }
     * 
     */
    public AccommodationSegmentRequestType.MealPlans createAccommodationSegmentRequestTypeMealPlans() {
        return new AccommodationSegmentRequestType.MealPlans();
    }

    /**
     * Create an instance of {@link VehicleSegmentAdditionalInfoType.PaymentRules }
     * 
     */
    public VehicleSegmentAdditionalInfoType.PaymentRules createVehicleSegmentAdditionalInfoTypePaymentRules() {
        return new VehicleSegmentAdditionalInfoType.PaymentRules();
    }

    /**
     * Create an instance of {@link VehicleSegmentAdditionalInfoType.PricedCoverages }
     * 
     */
    public VehicleSegmentAdditionalInfoType.PricedCoverages createVehicleSegmentAdditionalInfoTypePricedCoverages() {
        return new VehicleSegmentAdditionalInfoType.PricedCoverages();
    }

    /**
     * Create an instance of {@link VehicleSegmentAdditionalInfoType.VendorMessages }
     * 
     */
    public VehicleSegmentAdditionalInfoType.VendorMessages createVehicleSegmentAdditionalInfoTypeVendorMessages() {
        return new VehicleSegmentAdditionalInfoType.VendorMessages();
    }

    /**
     * Create an instance of {@link OntologyContactType.Email }
     * 
     */
    public OntologyContactType.Email createOntologyContactTypeEmail() {
        return new OntologyContactType.Email();
    }

    /**
     * Create an instance of {@link OntologyContactType.Phone }
     * 
     */
    public OntologyContactType.Phone createOntologyContactTypePhone() {
        return new OntologyContactType.Phone();
    }

    /**
     * Create an instance of {@link VendorMessagesType.VendorMessage }
     * 
     */
    public VendorMessagesType.VendorMessage createVendorMessagesTypeVendorMessage() {
        return new VendorMessagesType.VendorMessage();
    }

    /**
     * Create an instance of {@link CustomQuestionType.ProvidedAnswerChoices }
     * 
     */
    public CustomQuestionType.ProvidedAnswerChoices createCustomQuestionTypeProvidedAnswerChoices() {
        return new CustomQuestionType.ProvidedAnswerChoices();
    }

    /**
     * Create an instance of {@link RestaurantType.MultimediaDescriptions }
     * 
     */
    public RestaurantType.MultimediaDescriptions createRestaurantTypeMultimediaDescriptions() {
        return new RestaurantType.MultimediaDescriptions();
    }

    /**
     * Create an instance of {@link RestaurantType.CuisineCodes.CuisineCode }
     * 
     */
    public RestaurantType.CuisineCodes.CuisineCode createRestaurantTypeCuisineCodesCuisineCode() {
        return new RestaurantType.CuisineCodes.CuisineCode();
    }

    /**
     * Create an instance of {@link RestaurantType.InfoCodes.InfoCode }
     * 
     */
    public RestaurantType.InfoCodes.InfoCode createRestaurantTypeInfoCodesInfoCode() {
        return new RestaurantType.InfoCodes.InfoCode();
    }

    /**
     * Create an instance of {@link MultimediaDescriptionsType.MultimediaDescription }
     * 
     */
    public MultimediaDescriptionsType.MultimediaDescription createMultimediaDescriptionsTypeMultimediaDescription() {
        return new MultimediaDescriptionsType.MultimediaDescription();
    }

    /**
     * Create an instance of {@link MultimediaDescriptionsType.Text }
     * 
     */
    public MultimediaDescriptionsType.Text createMultimediaDescriptionsTypeText() {
        return new MultimediaDescriptionsType.Text();
    }

    /**
     * Create an instance of {@link RatePlanRegionRestrictions.Region }
     * 
     */
    public RatePlanRegionRestrictions.Region createRatePlanRegionRestrictionsRegion() {
        return new RatePlanRegionRestrictions.Region();
    }

    /**
     * Create an instance of {@link ImageItemsType.ImageItem }
     * 
     */
    public ImageItemsType.ImageItem createImageItemsTypeImageItem() {
        return new ImageItemsType.ImageItem();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType.AvailRequestSegment.StayDateRange }
     * 
     */
    public AvailRequestSegmentsType.AvailRequestSegment.StayDateRange createAvailRequestSegmentsTypeAvailRequestSegmentStayDateRange() {
        return new AvailRequestSegmentsType.AvailRequestSegment.StayDateRange();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType.AvailRequestSegment.RateRange }
     * 
     */
    public AvailRequestSegmentsType.AvailRequestSegment.RateRange createAvailRequestSegmentsTypeAvailRequestSegmentRateRange() {
        return new AvailRequestSegmentsType.AvailRequestSegment.RateRange();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria }
     * 
     */
    public AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria createAvailRequestSegmentsTypeAvailRequestSegmentHotelSearchCriteria() {
        return new AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType.Criterion }
     * 
     */
    public HotelSearchCriteriaType.Criterion createHotelSearchCriteriaTypeCriterion() {
        return new HotelSearchCriteriaType.Criterion();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType.ExclusionCriteria }
     * 
     */
    public HotelSearchCriteriaType.ExclusionCriteria createHotelSearchCriteriaTypeExclusionCriteria() {
        return new HotelSearchCriteriaType.ExclusionCriteria();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Position }
     * 
     */
    public ItemSearchCriterionType.Position createItemSearchCriterionTypePosition() {
        return new ItemSearchCriterionType.Position();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Address }
     * 
     */
    public ItemSearchCriterionType.Address createItemSearchCriterionTypeAddress() {
        return new ItemSearchCriterionType.Address();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Telephone }
     * 
     */
    public ItemSearchCriterionType.Telephone createItemSearchCriterionTypeTelephone() {
        return new ItemSearchCriterionType.Telephone();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.RefPoint }
     * 
     */
    public ItemSearchCriterionType.RefPoint createItemSearchCriterionTypeRefPoint() {
        return new ItemSearchCriterionType.RefPoint();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.CodeRef }
     * 
     */
    public ItemSearchCriterionType.CodeRef createItemSearchCriterionTypeCodeRef() {
        return new ItemSearchCriterionType.CodeRef();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.HotelRef }
     * 
     */
    public ItemSearchCriterionType.HotelRef createItemSearchCriterionTypeHotelRef() {
        return new ItemSearchCriterionType.HotelRef();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Radius }
     * 
     */
    public ItemSearchCriterionType.Radius createItemSearchCriterionTypeRadius() {
        return new ItemSearchCriterionType.Radius();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.HotelAmenity }
     * 
     */
    public HotelSearchCriterionType.HotelAmenity createHotelSearchCriterionTypeHotelAmenity() {
        return new HotelSearchCriterionType.HotelAmenity();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.Award }
     * 
     */
    public HotelSearchCriterionType.Award createHotelSearchCriterionTypeAward() {
        return new HotelSearchCriterionType.Award();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.Recreation }
     * 
     */
    public HotelSearchCriterionType.Recreation createHotelSearchCriterionTypeRecreation() {
        return new HotelSearchCriterionType.Recreation();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.Service }
     * 
     */
    public HotelSearchCriterionType.Service createHotelSearchCriterionTypeService() {
        return new HotelSearchCriterionType.Service();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.Transportation }
     * 
     */
    public HotelSearchCriterionType.Transportation createHotelSearchCriterionTypeTransportation() {
        return new HotelSearchCriterionType.Transportation();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.RateRange }
     * 
     */
    public HotelSearchCriterionType.RateRange createHotelSearchCriterionTypeRateRange() {
        return new HotelSearchCriterionType.RateRange();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.RoomStayCandidates }
     * 
     */
    public HotelSearchCriterionType.RoomStayCandidates createHotelSearchCriterionTypeRoomStayCandidates() {
        return new HotelSearchCriterionType.RoomStayCandidates();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Polygon.LatLong }
     * 
     */
    public ItemSearchCriterionType.Polygon.LatLong createItemSearchCriterionTypePolygonLatLong() {
        return new ItemSearchCriterionType.Polygon.LatLong();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType.RateConfigurations.RateConfiguration.Profile }
     * 
     */
    public HotelSearchCriteriaType.RateConfigurations.RateConfiguration.Profile createHotelSearchCriteriaTypeRateConfigurationsRateConfigurationProfile() {
        return new HotelSearchCriteriaType.RateConfigurations.RateConfiguration.Profile();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate }
     * 
     */
    public AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate createAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidatesRoomStayCandidate() {
        return new AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate();
    }

    /**
     * Create an instance of {@link SailingInfoType.SelectedSailing }
     * 
     */
    public SailingInfoType.SelectedSailing createSailingInfoTypeSelectedSailing() {
        return new SailingInfoType.SelectedSailing();
    }

    /**
     * Create an instance of {@link SailingInfoType.InclusivePackageOption }
     * 
     */
    public SailingInfoType.InclusivePackageOption createSailingInfoTypeInclusivePackageOption() {
        return new SailingInfoType.InclusivePackageOption();
    }

    /**
     * Create an instance of {@link SailingInfoType.Currency }
     * 
     */
    public SailingInfoType.Currency createSailingInfoTypeCurrency() {
        return new SailingInfoType.Currency();
    }

    /**
     * Create an instance of {@link CabinOptionType.CabinConfiguration }
     * 
     */
    public CabinOptionType.CabinConfiguration createCabinOptionTypeCabinConfiguration() {
        return new CabinOptionType.CabinConfiguration();
    }

    /**
     * Create an instance of {@link CabinOptionType.MeasurementInfo }
     * 
     */
    public CabinOptionType.MeasurementInfo createCabinOptionTypeMeasurementInfo() {
        return new CabinOptionType.MeasurementInfo();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute createSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttributesCabinAttribute() {
        return new SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute createSailingCategoryInfoTypeSelectedCategoryCabinAttributesCabinAttribute() {
        return new SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute();
    }

    /**
     * Create an instance of {@link SailingBaseType.CruiseLine }
     * 
     */
    public SailingBaseType.CruiseLine createSailingBaseTypeCruiseLine() {
        return new SailingBaseType.CruiseLine();
    }

    /**
     * Create an instance of {@link SailingBaseType.Region }
     * 
     */
    public SailingBaseType.Region createSailingBaseTypeRegion() {
        return new SailingBaseType.Region();
    }

    /**
     * Create an instance of {@link SailingBaseType.DeparturePort }
     * 
     */
    public SailingBaseType.DeparturePort createSailingBaseTypeDeparturePort() {
        return new SailingBaseType.DeparturePort();
    }

    /**
     * Create an instance of {@link SailingBaseType.ArrivalPort }
     * 
     */
    public SailingBaseType.ArrivalPort createSailingBaseTypeArrivalPort() {
        return new SailingBaseType.ArrivalPort();
    }

    /**
     * Create an instance of {@link RailPassengerCategoryType.PassengerQualifyingInfo }
     * 
     */
    public RailPassengerCategoryType.PassengerQualifyingInfo createRailPassengerCategoryTypePassengerQualifyingInfo() {
        return new RailPassengerCategoryType.PassengerQualifyingInfo();
    }

    /**
     * Create an instance of {@link OntologyTravelerClassType.AgeCategory }
     * 
     */
    public OntologyTravelerClassType.AgeCategory createOntologyTravelerClassTypeAgeCategory() {
        return new OntologyTravelerClassType.AgeCategory();
    }

    /**
     * Create an instance of {@link OntologyTravelerClassType.PassengerCategory }
     * 
     */
    public OntologyTravelerClassType.PassengerCategory createOntologyTravelerClassTypePassengerCategory() {
        return new OntologyTravelerClassType.PassengerCategory();
    }

    /**
     * Create an instance of {@link OntologyValueType.ScoreBasis }
     * 
     */
    public OntologyValueType.ScoreBasis createOntologyValueTypeScoreBasis() {
        return new OntologyValueType.ScoreBasis();
    }

    /**
     * Create an instance of {@link RailReservationSummaryType.ODInfo.TrainSegment }
     * 
     */
    public RailReservationSummaryType.ODInfo.TrainSegment createRailReservationSummaryTypeODInfoTrainSegment() {
        return new RailReservationSummaryType.ODInfo.TrainSegment();
    }

    /**
     * Create an instance of {@link VehicleRetrieveResRSCoreType.VehResSummaries }
     * 
     */
    public VehicleRetrieveResRSCoreType.VehResSummaries createVehicleRetrieveResRSCoreTypeVehResSummaries() {
        return new VehicleRetrieveResRSCoreType.VehResSummaries();
    }

    /**
     * Create an instance of {@link OJRemarkType.Agent }
     * 
     */
    public OJRemarkType.Agent createOJRemarkTypeAgent() {
        return new OJRemarkType.Agent();
    }

    /**
     * Create an instance of {@link WeatherInfoType.Precipitation }
     * 
     */
    public WeatherInfoType.Precipitation createWeatherInfoTypePrecipitation() {
        return new WeatherInfoType.Precipitation();
    }

    /**
     * Create an instance of {@link WeatherInfoType.Temperature }
     * 
     */
    public WeatherInfoType.Temperature createWeatherInfoTypeTemperature() {
        return new WeatherInfoType.Temperature();
    }

    /**
     * Create an instance of {@link URLsType.URL }
     * 
     */
    public URLsType.URL createURLsTypeURL() {
        return new URLsType.URL();
    }

    /**
     * Create an instance of {@link VehicleRentalDetailsType.FuelLevelDetails }
     * 
     */
    public VehicleRentalDetailsType.FuelLevelDetails createVehicleRentalDetailsTypeFuelLevelDetails() {
        return new VehicleRentalDetailsType.FuelLevelDetails();
    }

    /**
     * Create an instance of {@link VehicleRentalDetailsType.OdometerReading }
     * 
     */
    public VehicleRentalDetailsType.OdometerReading createVehicleRentalDetailsTypeOdometerReading() {
        return new VehicleRentalDetailsType.OdometerReading();
    }

    /**
     * Create an instance of {@link VehicleRentalDetailsType.ConditionReport }
     * 
     */
    public VehicleRentalDetailsType.ConditionReport createVehicleRentalDetailsTypeConditionReport() {
        return new VehicleRentalDetailsType.ConditionReport();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.PaymentType.ReportingExchangeRates }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.PaymentType.ReportingExchangeRates createPaymentTypeReportingExchangeRates() {
        return new com.airchina.datacenter.spnr.sdk.entity.PaymentType.ReportingExchangeRates();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.PaymentType.Remarks }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.PaymentType.Remarks createPaymentTypeRemarks() {
        return new com.airchina.datacenter.spnr.sdk.entity.PaymentType.Remarks();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.PaymentType.PaymentQualifiers.PaymentQualifier }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.PaymentType.PaymentQualifiers.PaymentQualifier createPaymentTypePaymentQualifiersPaymentQualifier() {
        return new com.airchina.datacenter.spnr.sdk.entity.PaymentType.PaymentQualifiers.PaymentQualifier();
    }

    /**
     * Create an instance of {@link GroupPriorities.GroupPriority }
     * 
     */
    public GroupPriorities.GroupPriority createGroupPrioritiesGroupPriority() {
        return new GroupPriorities.GroupPriority();
    }

    /**
     * Create an instance of {@link TransportationType.Transportation }
     * 
     */
    public TransportationType.Transportation createTransportationTypeTransportation() {
        return new TransportationType.Transportation();
    }

    /**
     * Create an instance of {@link CodeListScheduleType.OperationTimes.OperationTime }
     * 
     */
    public CodeListScheduleType.OperationTimes.OperationTime createCodeListScheduleTypeOperationTimesOperationTime() {
        return new CodeListScheduleType.OperationTimes.OperationTime();
    }

    /**
     * Create an instance of {@link StopLegType.DepartureAirport }
     * 
     */
    public StopLegType.DepartureAirport createStopLegTypeDepartureAirport() {
        return new StopLegType.DepartureAirport();
    }

    /**
     * Create an instance of {@link StopLegType.ArrivalAirport }
     * 
     */
    public StopLegType.ArrivalAirport createStopLegTypeArrivalAirport() {
        return new StopLegType.ArrivalAirport();
    }

    /**
     * Create an instance of {@link RailFareType.TermAndCondition.FareRule }
     * 
     */
    public RailFareType.TermAndCondition.FareRule createRailFareTypeTermAndConditionFareRule() {
        return new RailFareType.TermAndCondition.FareRule();
    }

    /**
     * Create an instance of {@link RailFareType.TermAndCondition.EffectiveDates }
     * 
     */
    public RailFareType.TermAndCondition.EffectiveDates createRailFareTypeTermAndConditionEffectiveDates() {
        return new RailFareType.TermAndCondition.EffectiveDates();
    }

    /**
     * Create an instance of {@link RailFareType.BasicFare.AlternateCurrency }
     * 
     */
    public RailFareType.BasicFare.AlternateCurrency createRailFareTypeBasicFareAlternateCurrency() {
        return new RailFareType.BasicFare.AlternateCurrency();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType.SearchValueMatch }
     * 
     */
    public PropertyValueMatchType.SearchValueMatch createPropertyValueMatchTypeSearchValueMatch() {
        return new PropertyValueMatchType.SearchValueMatch();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType.RateRange }
     * 
     */
    public PropertyValueMatchType.RateRange createPropertyValueMatchTypeRateRange() {
        return new PropertyValueMatchType.RateRange();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType.Amenities.Amenity }
     * 
     */
    public PropertyValueMatchType.Amenities.Amenity createPropertyValueMatchTypeAmenitiesAmenity() {
        return new PropertyValueMatchType.Amenities.Amenity();
    }

    /**
     * Create an instance of {@link FareTaxesType.Tax.CollectionPoint }
     * 
     */
    public FareTaxesType.Tax.CollectionPoint createFareTaxesTypeTaxCollectionPoint() {
        return new FareTaxesType.Tax.CollectionPoint();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.ReportSummaries }
     * 
     */
    public StatisticApplicationSetType.ReportSummaries createStatisticApplicationSetTypeReportSummaries() {
        return new StatisticApplicationSetType.ReportSummaries();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary }
     * 
     */
    public StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary createStatisticApplicationSetTypeCountCategorySummariesCountCategorySummary() {
        return new StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary }
     * 
     */
    public StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary createStatisticApplicationSetTypeRevenueCategorySummariesRevenueCategorySummary() {
        return new StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary();
    }

    /**
     * Create an instance of {@link StatisticApplicationSetType.StatisticCodes.StatisticCode }
     * 
     */
    public StatisticApplicationSetType.StatisticCodes.StatisticCode createStatisticApplicationSetTypeStatisticCodesStatisticCode() {
        return new StatisticApplicationSetType.StatisticCodes.StatisticCode();
    }

    /**
     * Create an instance of {@link OffLocationServiceType.Telephone }
     * 
     */
    public OffLocationServiceType.Telephone createOffLocationServiceTypeTelephone() {
        return new OffLocationServiceType.Telephone();
    }

    /**
     * Create an instance of {@link RateAmountMessageType.Rates.Rate }
     * 
     */
    public RateAmountMessageType.Rates.Rate createRateAmountMessageTypeRatesRate() {
        return new RateAmountMessageType.Rates.Rate();
    }

    /**
     * Create an instance of {@link VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking }
     * 
     */
    public VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking createVehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking() {
        return new VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking();
    }

    /**
     * Create an instance of {@link VehicleVendorAvailabilityType.VehAvails.VehAvail.Info }
     * 
     */
    public VehicleVendorAvailabilityType.VehAvails.VehAvail.Info createVehicleVendorAvailabilityTypeVehAvailsVehAvailInfo() {
        return new VehicleVendorAvailabilityType.VehAvails.VehAvail.Info();
    }

    /**
     * Create an instance of {@link AssociatedBookingProductType.FlightSegment }
     * 
     */
    public AssociatedBookingProductType.FlightSegment createAssociatedBookingProductTypeFlightSegment() {
        return new AssociatedBookingProductType.FlightSegment();
    }

    /**
     * Create an instance of {@link AssociatedBookingProductType.FlightTicketing }
     * 
     */
    public AssociatedBookingProductType.FlightTicketing createAssociatedBookingProductTypeFlightTicketing() {
        return new AssociatedBookingProductType.FlightTicketing();
    }

    /**
     * Create an instance of {@link AssociatedBookingProductType.Ticketing }
     * 
     */
    public AssociatedBookingProductType.Ticketing createAssociatedBookingProductTypeTicketing() {
        return new AssociatedBookingProductType.Ticketing();
    }

    /**
     * Create an instance of {@link ProfilesType.ProfileInfo }
     * 
     */
    public ProfilesType.ProfileInfo createProfilesTypeProfileInfo() {
        return new ProfilesType.ProfileInfo();
    }

    /**
     * Create an instance of {@link ModificationsType.Modification }
     * 
     */
    public ModificationsType.Modification createModificationsTypeModification() {
        return new ModificationsType.Modification();
    }

    /**
     * Create an instance of {@link RailOriginDestinationSummaryType.OriginLocation }
     * 
     */
    public RailOriginDestinationSummaryType.OriginLocation createRailOriginDestinationSummaryTypeOriginLocation() {
        return new RailOriginDestinationSummaryType.OriginLocation();
    }

    /**
     * Create an instance of {@link RailOriginDestinationSummaryType.DestinationLocation }
     * 
     */
    public RailOriginDestinationSummaryType.DestinationLocation createRailOriginDestinationSummaryTypeDestinationLocation() {
        return new RailOriginDestinationSummaryType.DestinationLocation();
    }

    /**
     * Create an instance of {@link RailOriginDestinationSummaryType.ConnectionLocation }
     * 
     */
    public RailOriginDestinationSummaryType.ConnectionLocation createRailOriginDestinationSummaryTypeConnectionLocation() {
        return new RailOriginDestinationSummaryType.ConnectionLocation();
    }

    /**
     * Create an instance of {@link AirAncillariesBundledProductsSummaryType.Service.Prices.Price }
     * 
     */
    public AirAncillariesBundledProductsSummaryType.Service.Prices.Price createAirAncillariesBundledProductsSummaryTypeServicePricesPrice() {
        return new AirAncillariesBundledProductsSummaryType.Service.Prices.Price();
    }

    /**
     * Create an instance of {@link OntologyLodgingType.PropertyClass }
     * 
     */
    public OntologyLodgingType.PropertyClass createOntologyLodgingTypePropertyClass() {
        return new OntologyLodgingType.PropertyClass();
    }

    /**
     * Create an instance of {@link RFPResponseDetailType.Comments }
     * 
     */
    public RFPResponseDetailType.Comments createRFPResponseDetailTypeComments() {
        return new RFPResponseDetailType.Comments();
    }

    /**
     * Create an instance of {@link RoomSharesType.RoomShare.GuestRPHs.GuestRPH }
     * 
     */
    public RoomSharesType.RoomShare.GuestRPHs.GuestRPH createRoomSharesTypeRoomShareGuestRPHsGuestRPH() {
        return new RoomSharesType.RoomShare.GuestRPHs.GuestRPH();
    }

    /**
     * Create an instance of {@link PkgPassengerRPHs.PassengerRPH }
     * 
     */
    public PkgPassengerRPHs.PassengerRPH createPkgPassengerRPHsPassengerRPH() {
        return new PkgPassengerRPHs.PassengerRPH();
    }

    /**
     * Create an instance of {@link QueuesType.Queue.Summary.Status }
     * 
     */
    public QueuesType.Queue.Summary.Status createQueuesTypeQueueSummaryStatus() {
        return new QueuesType.Queue.Summary.Status();
    }

    /**
     * Create an instance of {@link RestaurantsType.SrvcInfoCodes.SrvcInfoCode }
     * 
     */
    public RestaurantsType.SrvcInfoCodes.SrvcInfoCode createRestaurantsTypeSrvcInfoCodesSrvcInfoCode() {
        return new RestaurantsType.SrvcInfoCodes.SrvcInfoCode();
    }

    /**
     * Create an instance of {@link RestaurantsType.Restaurant.SrvcInfoCodes.SrvcInfoCode }
     * 
     */
    public RestaurantsType.Restaurant.SrvcInfoCodes.SrvcInfoCode createRestaurantsTypeRestaurantSrvcInfoCodesSrvcInfoCode() {
        return new RestaurantsType.Restaurant.SrvcInfoCodes.SrvcInfoCode();
    }

    /**
     * Create an instance of {@link BankFavorType.BankFavorInfos }
     * 
     */
    public BankFavorType.BankFavorInfos createBankFavorTypeBankFavorInfos() {
        return new BankFavorType.BankFavorInfos();
    }

    /**
     * Create an instance of {@link GuestCountType.GuestCount }
     * 
     */
    public GuestCountType.GuestCount createGuestCountTypeGuestCount() {
        return new GuestCountType.GuestCount();
    }

    /**
     * Create an instance of {@link MealPlanType.PassengerRPHs }
     * 
     */
    public MealPlanType.PassengerRPHs createMealPlanTypePassengerRPHs() {
        return new MealPlanType.PassengerRPHs();
    }

    /**
     * Create an instance of {@link MealPlanType.Prices.Price }
     * 
     */
    public MealPlanType.Prices.Price createMealPlanTypePricesPrice() {
        return new MealPlanType.Prices.Price();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.RequestingParty }
     * 
     */
    public MultiModalOfferType.RequestingParty createMultiModalOfferTypeRequestingParty() {
        return new MultiModalOfferType.RequestingParty();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.TravelerCharacteristics.Classification }
     * 
     */
    public MultiModalOfferType.TravelerCharacteristics.Classification createMultiModalOfferTypeTravelerCharacteristicsClassification() {
        return new MultiModalOfferType.TravelerCharacteristics.Classification();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.TravelerCharacteristics.DetailInfo.Identification }
     * 
     */
    public MultiModalOfferType.TravelerCharacteristics.DetailInfo.Identification createMultiModalOfferTypeTravelerCharacteristicsDetailInfoIdentification() {
        return new MultiModalOfferType.TravelerCharacteristics.DetailInfo.Identification();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.TripCharacteristics.DateTimeDuration }
     * 
     */
    public MultiModalOfferType.TripCharacteristics.DateTimeDuration createMultiModalOfferTypeTripCharacteristicsDateTimeDuration() {
        return new MultiModalOfferType.TripCharacteristics.DateTimeDuration();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.TripCharacteristics.Location }
     * 
     */
    public MultiModalOfferType.TripCharacteristics.Location createMultiModalOfferTypeTripCharacteristicsLocation() {
        return new MultiModalOfferType.TripCharacteristics.Location();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.TripCharacteristics.Baggage }
     * 
     */
    public MultiModalOfferType.TripCharacteristics.Baggage createMultiModalOfferTypeTripCharacteristicsBaggage() {
        return new MultiModalOfferType.TripCharacteristics.Baggage();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.TripCharacteristics.Animals }
     * 
     */
    public MultiModalOfferType.TripCharacteristics.Animals createMultiModalOfferTypeTripCharacteristicsAnimals() {
        return new MultiModalOfferType.TripCharacteristics.Animals();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.TripCharacteristics.Lodging }
     * 
     */
    public MultiModalOfferType.TripCharacteristics.Lodging createMultiModalOfferTypeTripCharacteristicsLodging() {
        return new MultiModalOfferType.TripCharacteristics.Lodging();
    }

    /**
     * Create an instance of {@link OntologyAnimalType.Detail.Type }
     * 
     */
    public OntologyAnimalType.Detail.Type createOntologyAnimalTypeDetailType() {
        return new OntologyAnimalType.Detail.Type();
    }

    /**
     * Create an instance of {@link OntologyAnimalType.Detail.Weight }
     * 
     */
    public OntologyAnimalType.Detail.Weight createOntologyAnimalTypeDetailWeight() {
        return new OntologyAnimalType.Detail.Weight();
    }

    /**
     * Create an instance of {@link OntologyBaggageType.Detail.Item }
     * 
     */
    public OntologyBaggageType.Detail.Item createOntologyBaggageTypeDetailItem() {
        return new OntologyBaggageType.Detail.Item();
    }

    /**
     * Create an instance of {@link OntologyLocationType.Type }
     * 
     */
    public OntologyLocationType.Type createOntologyLocationTypeType() {
        return new OntologyLocationType.Type();
    }

    /**
     * Create an instance of {@link OntologyLocationType.GeneralLocation }
     * 
     */
    public OntologyLocationType.GeneralLocation createOntologyLocationTypeGeneralLocation() {
        return new OntologyLocationType.GeneralLocation();
    }

    /**
     * Create an instance of {@link OntologyLocationType.PhysicalLocation }
     * 
     */
    public OntologyLocationType.PhysicalLocation createOntologyLocationTypePhysicalLocation() {
        return new OntologyLocationType.PhysicalLocation();
    }

    /**
     * Create an instance of {@link OntologyAddressType.Street }
     * 
     */
    public OntologyAddressType.Street createOntologyAddressTypeStreet() {
        return new OntologyAddressType.Street();
    }

    /**
     * Create an instance of {@link OntologyAddressType.City }
     * 
     */
    public OntologyAddressType.City createOntologyAddressTypeCity() {
        return new OntologyAddressType.City();
    }

    /**
     * Create an instance of {@link OntologyAddressType.StateProvince }
     * 
     */
    public OntologyAddressType.StateProvince createOntologyAddressTypeStateProvince() {
        return new OntologyAddressType.StateProvince();
    }

    /**
     * Create an instance of {@link OntologyAddressType.Postal }
     * 
     */
    public OntologyAddressType.Postal createOntologyAddressTypePostal() {
        return new OntologyAddressType.Postal();
    }

    /**
     * Create an instance of {@link OntologyAddressType.Country }
     * 
     */
    public OntologyAddressType.Country createOntologyAddressTypeCountry() {
        return new OntologyAddressType.Country();
    }

    /**
     * Create an instance of {@link OntologyLocationType.Geocode.UniversalAddress }
     * 
     */
    public OntologyLocationType.Geocode.UniversalAddress createOntologyLocationTypeGeocodeUniversalAddress() {
        return new OntologyLocationType.Geocode.UniversalAddress();
    }

    /**
     * Create an instance of {@link OntologyTimeDurationType.StartAndEnd.Duration }
     * 
     */
    public OntologyTimeDurationType.StartAndEnd.Duration createOntologyTimeDurationTypeStartAndEndDuration() {
        return new OntologyTimeDurationType.StartAndEnd.Duration();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.RequestedOffer.GuidelinePricing }
     * 
     */
    public MultiModalOfferType.RequestedOffer.GuidelinePricing createMultiModalOfferTypeRequestedOfferGuidelinePricing() {
        return new MultiModalOfferType.RequestedOffer.GuidelinePricing();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.RequestedOffer.TimePeriod.MaximumDuration }
     * 
     */
    public MultiModalOfferType.RequestedOffer.TimePeriod.MaximumDuration createMultiModalOfferTypeRequestedOfferTimePeriodMaximumDuration() {
        return new MultiModalOfferType.RequestedOffer.TimePeriod.MaximumDuration();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Formula }
     * 
     */
    public MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Formula createMultiModalOfferTypeRequestedOfferTimePeriodEarliestStartCalculationMethodFormula() {
        return new MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Formula();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Distance }
     * 
     */
    public MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Distance createMultiModalOfferTypeRequestedOfferTimePeriodEarliestStartCalculationMethodDistance() {
        return new MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Distance();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Duration }
     * 
     */
    public MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Duration createMultiModalOfferTypeRequestedOfferTimePeriodEarliestStartCalculationMethodDuration() {
        return new MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Duration();
    }

    /**
     * Create an instance of {@link MultiModalOfferType.Ontology.CompatibleWith }
     * 
     */
    public MultiModalOfferType.Ontology.CompatibleWith createMultiModalOfferTypeOntologyCompatibleWith() {
        return new MultiModalOfferType.Ontology.CompatibleWith();
    }

    /**
     * Create an instance of {@link OntologyCompanyType.TravelSegment }
     * 
     */
    public OntologyCompanyType.TravelSegment createOntologyCompanyTypeTravelSegment() {
        return new OntologyCompanyType.TravelSegment();
    }

    /**
     * Create an instance of {@link SupplierBookingReferenceIDType.CheckInInfo }
     * 
     */
    public SupplierBookingReferenceIDType.CheckInInfo createSupplierBookingReferenceIDTypeCheckInInfo() {
        return new SupplierBookingReferenceIDType.CheckInInfo();
    }

    /**
     * Create an instance of {@link HotelReservationType.UniqueID }
     * 
     */
    public HotelReservationType.UniqueID createHotelReservationTypeUniqueID() {
        return new HotelReservationType.UniqueID();
    }

    /**
     * Create an instance of {@link HotelResModifyRequestType.UniqueID }
     * 
     */
    public HotelResModifyRequestType.UniqueID createHotelResModifyRequestTypeUniqueID() {
        return new HotelResModifyRequestType.UniqueID();
    }

    /**
     * Create an instance of {@link HotelResModifyRequestType.SupplierFees.SupplierFee }
     * 
     */
    public HotelResModifyRequestType.SupplierFees.SupplierFee createHotelResModifyRequestTypeSupplierFeesSupplierFee() {
        return new HotelResModifyRequestType.SupplierFees.SupplierFee();
    }

    /**
     * Create an instance of {@link AirAncillaryProductPriceType.Base }
     * 
     */
    public AirAncillaryProductPriceType.Base createAirAncillaryProductPriceTypeBase() {
        return new AirAncillaryProductPriceType.Base();
    }

    /**
     * Create an instance of {@link AirAncillaryProductPriceType.Total }
     * 
     */
    public AirAncillaryProductPriceType.Total createAirAncillaryProductPriceTypeTotal() {
        return new AirAncillaryProductPriceType.Total();
    }

    /**
     * Create an instance of {@link ShipInfoType.Ship }
     * 
     */
    public ShipInfoType.Ship createShipInfoTypeShip() {
        return new ShipInfoType.Ship();
    }

    /**
     * Create an instance of {@link ShipInfoType.ShipLength }
     * 
     */
    public ShipInfoType.ShipLength createShipInfoTypeShipLength() {
        return new ShipInfoType.ShipLength();
    }

    /**
     * Create an instance of {@link ShipInfoType.ShipVoltage }
     * 
     */
    public ShipInfoType.ShipVoltage createShipInfoTypeShipVoltage() {
        return new ShipInfoType.ShipVoltage();
    }

    /**
     * Create an instance of {@link TicketRemarkType.Agent }
     * 
     */
    public TicketRemarkType.Agent createTicketRemarkTypeAgent() {
        return new TicketRemarkType.Agent();
    }

    /**
     * Create an instance of {@link UserInputSrvcType.UserText }
     * 
     */
    public UserInputSrvcType.UserText createUserInputSrvcTypeUserText() {
        return new UserInputSrvcType.UserText();
    }

    /**
     * Create an instance of {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.Carrier }
     * 
     */
    public UserInputSrvcType.UserChoices.FlightOptions.Flight.Carrier createUserInputSrvcTypeUserChoicesFlightOptionsFlightCarrier() {
        return new UserInputSrvcType.UserChoices.FlightOptions.Flight.Carrier();
    }

    /**
     * Create an instance of {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.OperatingCarrier }
     * 
     */
    public UserInputSrvcType.UserChoices.FlightOptions.Flight.OperatingCarrier createUserInputSrvcTypeUserChoicesFlightOptionsFlightOperatingCarrier() {
        return new UserInputSrvcType.UserChoices.FlightOptions.Flight.OperatingCarrier();
    }

    /**
     * Create an instance of {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.Departure }
     * 
     */
    public UserInputSrvcType.UserChoices.FlightOptions.Flight.Departure createUserInputSrvcTypeUserChoicesFlightOptionsFlightDeparture() {
        return new UserInputSrvcType.UserChoices.FlightOptions.Flight.Departure();
    }

    /**
     * Create an instance of {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.Arrival }
     * 
     */
    public UserInputSrvcType.UserChoices.FlightOptions.Flight.Arrival createUserInputSrvcTypeUserChoicesFlightOptionsFlightArrival() {
        return new UserInputSrvcType.UserChoices.FlightOptions.Flight.Arrival();
    }

    /**
     * Create an instance of {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.ActionCode }
     * 
     */
    public UserInputSrvcType.UserChoices.FlightOptions.Flight.ActionCode createUserInputSrvcTypeUserChoicesFlightOptionsFlightActionCode() {
        return new UserInputSrvcType.UserChoices.FlightOptions.Flight.ActionCode();
    }

    /**
     * Create an instance of {@link FerryProductType.ItineraryLeg }
     * 
     */
    public FerryProductType.ItineraryLeg createFerryProductTypeItineraryLeg() {
        return new FerryProductType.ItineraryLeg();
    }

    /**
     * Create an instance of {@link FerryProductType.PassengerDetails }
     * 
     */
    public FerryProductType.PassengerDetails createFerryProductTypePassengerDetails() {
        return new FerryProductType.PassengerDetails();
    }

    /**
     * Create an instance of {@link DestActivityResResponseItemType.ReservationItemReferences }
     * 
     */
    public DestActivityResResponseItemType.ReservationItemReferences createDestActivityResResponseItemTypeReservationItemReferences() {
        return new DestActivityResResponseItemType.ReservationItemReferences();
    }

    /**
     * Create an instance of {@link MeetingRoomCapacityType.Occupancy }
     * 
     */
    public MeetingRoomCapacityType.Occupancy createMeetingRoomCapacityTypeOccupancy() {
        return new MeetingRoomCapacityType.Occupancy();
    }

    /**
     * Create an instance of {@link OntologyActivityType.Type }
     * 
     */
    public OntologyActivityType.Type createOntologyActivityTypeType() {
        return new OntologyActivityType.Type();
    }

    /**
     * Create an instance of {@link FacilityChoicesType.AvailableRooms }
     * 
     */
    public FacilityChoicesType.AvailableRooms createFacilityChoicesTypeAvailableRooms() {
        return new FacilityChoicesType.AvailableRooms();
    }

    /**
     * Create an instance of {@link FacilityChoicesType.AvailableMealPlans }
     * 
     */
    public FacilityChoicesType.AvailableMealPlans createFacilityChoicesTypeAvailableMealPlans() {
        return new FacilityChoicesType.AvailableMealPlans();
    }

    /**
     * Create an instance of {@link FacilityChoicesType.RoomPrices }
     * 
     */
    public FacilityChoicesType.RoomPrices createFacilityChoicesTypeRoomPrices() {
        return new FacilityChoicesType.RoomPrices();
    }

    /**
     * Create an instance of {@link SearchQualifierType.Residency }
     * 
     */
    public SearchQualifierType.Residency createSearchQualifierTypeResidency() {
        return new SearchQualifierType.Residency();
    }

    /**
     * Create an instance of {@link SearchQualifierType.PriceRange }
     * 
     */
    public SearchQualifierType.PriceRange createSearchQualifierTypePriceRange() {
        return new SearchQualifierType.PriceRange();
    }

    /**
     * Create an instance of {@link SearchQualifierType.Status }
     * 
     */
    public SearchQualifierType.Status createSearchQualifierTypeStatus() {
        return new SearchQualifierType.Status();
    }

    /**
     * Create an instance of {@link ExtrasCoreType.SubCategory }
     * 
     */
    public ExtrasCoreType.SubCategory createExtrasCoreTypeSubCategory() {
        return new ExtrasCoreType.SubCategory();
    }

    /**
     * Create an instance of {@link ExtrasInfoType.Criteria }
     * 
     */
    public ExtrasInfoType.Criteria createExtrasInfoTypeCriteria() {
        return new ExtrasInfoType.Criteria();
    }

    /**
     * Create an instance of {@link ExtrasInfoType.Periods }
     * 
     */
    public ExtrasInfoType.Periods createExtrasInfoTypePeriods() {
        return new ExtrasInfoType.Periods();
    }

    /**
     * Create an instance of {@link ExtrasInfoType.AdditionalInfoPrompt }
     * 
     */
    public ExtrasInfoType.AdditionalInfoPrompt createExtrasInfoTypeAdditionalInfoPrompt() {
        return new ExtrasInfoType.AdditionalInfoPrompt();
    }

    /**
     * Create an instance of {@link ExtrasInfoType.ParentExtras }
     * 
     */
    public ExtrasInfoType.ParentExtras createExtrasInfoTypeParentExtras() {
        return new ExtrasInfoType.ParentExtras();
    }

    /**
     * Create an instance of {@link ExtrasInfoType.ExtraLocationInfo }
     * 
     */
    public ExtrasInfoType.ExtraLocationInfo createExtrasInfoTypeExtraLocationInfo() {
        return new ExtrasInfoType.ExtraLocationInfo();
    }

    /**
     * Create an instance of {@link TravelCostType.CostTotals }
     * 
     */
    public TravelCostType.CostTotals createTravelCostTypeCostTotals() {
        return new TravelCostType.CostTotals();
    }

    /**
     * Create an instance of {@link VenueType.Positions.Position }
     * 
     */
    public VenueType.Positions.Position createVenueTypePositionsPosition() {
        return new VenueType.Positions.Position();
    }

    /**
     * Create an instance of {@link ServiceRPHsType.ServiceRPH }
     * 
     */
    public ServiceRPHsType.ServiceRPH createServiceRPHsTypeServiceRPH() {
        return new ServiceRPHsType.ServiceRPH();
    }

    /**
     * Create an instance of {@link DestActivityRetrieveInfoType.DestActivityDescriptiveContent }
     * 
     */
    public DestActivityRetrieveInfoType.DestActivityDescriptiveContent createDestActivityRetrieveInfoTypeDestActivityDescriptiveContent() {
        return new DestActivityRetrieveInfoType.DestActivityDescriptiveContent();
    }

    /**
     * Create an instance of {@link DestActivityRetrieveInfoType.DestActivityItems.Item.Vehicles }
     * 
     */
    public DestActivityRetrieveInfoType.DestActivityItems.Item.Vehicles createDestActivityRetrieveInfoTypeDestActivityItemsItemVehicles() {
        return new DestActivityRetrieveInfoType.DestActivityItems.Item.Vehicles();
    }

    /**
     * Create an instance of {@link PaymentsType.Payment }
     * 
     */
    public PaymentsType.Payment createPaymentsTypePayment() {
        return new PaymentsType.Payment();
    }

    /**
     * Create an instance of {@link OperationSchedulesPlusChargeType.OperationSchedule }
     * 
     */
    public OperationSchedulesPlusChargeType.OperationSchedule createOperationSchedulesPlusChargeTypeOperationSchedule() {
        return new OperationSchedulesPlusChargeType.OperationSchedule();
    }

    /**
     * Create an instance of {@link OperationScheduleType.OperationTimes.OperationTime }
     * 
     */
    public OperationScheduleType.OperationTimes.OperationTime createOperationScheduleTypeOperationTimesOperationTime() {
        return new OperationScheduleType.OperationTimes.OperationTime();
    }

    /**
     * Create an instance of {@link PackageType.DateRange }
     * 
     */
    public PackageType.DateRange createPackageTypeDateRange() {
        return new PackageType.DateRange();
    }

    /**
     * Create an instance of {@link PackageType.ItineraryItems }
     * 
     */
    public PackageType.ItineraryItems createPackageTypeItineraryItems() {
        return new PackageType.ItineraryItems();
    }

    /**
     * Create an instance of {@link PackageType.Extras }
     * 
     */
    public PackageType.Extras createPackageTypeExtras() {
        return new PackageType.Extras();
    }

    /**
     * Create an instance of {@link SailingSearchQualifierType.Port }
     * 
     */
    public SailingSearchQualifierType.Port createSailingSearchQualifierTypePort() {
        return new SailingSearchQualifierType.Port();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Deductible }
     * 
     */
    public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Deductible createVehicleLocationLiabilitiesTypeCoveragesCoverageCoverageFeesCoverageFeeDeductible() {
        return new VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Deductible();
    }

    /**
     * Create an instance of {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle }
     * 
     */
    public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle createVehicleLocationLiabilitiesTypeCoveragesCoverageCoverageFeesCoverageFeeVehiclesVehicle() {
        return new VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle();
    }

    /**
     * Create an instance of {@link VehicleCoreType.VehType }
     * 
     */
    public VehicleCoreType.VehType createVehicleCoreTypeVehType() {
        return new VehicleCoreType.VehType();
    }

    /**
     * Create an instance of {@link VehicleCoreType.VehClass }
     * 
     */
    public VehicleCoreType.VehClass createVehicleCoreTypeVehClass() {
        return new VehicleCoreType.VehClass();
    }

    /**
     * Create an instance of {@link VehicleType.VehMakeModel }
     * 
     */
    public VehicleType.VehMakeModel createVehicleTypeVehMakeModel() {
        return new VehicleType.VehMakeModel();
    }

    /**
     * Create an instance of {@link VehicleType.VehIdentity }
     * 
     */
    public VehicleType.VehIdentity createVehicleTypeVehIdentity() {
        return new VehicleType.VehIdentity();
    }

    /**
     * Create an instance of {@link AssociatedFFsType.AssociatedFF }
     * 
     */
    public AssociatedFFsType.AssociatedFF createAssociatedFFsTypeAssociatedFF() {
        return new AssociatedFFsType.AssociatedFF();
    }

    /**
     * Create an instance of {@link AirportWeatherType.DepartureAirport }
     * 
     */
    public AirportWeatherType.DepartureAirport createAirportWeatherTypeDepartureAirport() {
        return new AirportWeatherType.DepartureAirport();
    }

    /**
     * Create an instance of {@link AirportWeatherType.ArrivalAirport }
     * 
     */
    public AirportWeatherType.ArrivalAirport createAirportWeatherTypeArrivalAirport() {
        return new AirportWeatherType.ArrivalAirport();
    }

    /**
     * Create an instance of {@link RateQualifierType.RateComments }
     * 
     */
    public RateQualifierType.RateComments createRateQualifierTypeRateComments() {
        return new RateQualifierType.RateComments();
    }

    /**
     * Create an instance of {@link FlightRestrictionType.DateRange }
     * 
     */
    public FlightRestrictionType.DateRange createFlightRestrictionTypeDateRange() {
        return new FlightRestrictionType.DateRange();
    }

    /**
     * Create an instance of {@link FlightRestrictionType.OriginDestinationOption.Origin }
     * 
     */
    public FlightRestrictionType.OriginDestinationOption.Origin createFlightRestrictionTypeOriginDestinationOptionOrigin() {
        return new FlightRestrictionType.OriginDestinationOption.Origin();
    }

    /**
     * Create an instance of {@link FlightRestrictionType.OriginDestinationOption.Destination }
     * 
     */
    public FlightRestrictionType.OriginDestinationOption.Destination createFlightRestrictionTypeOriginDestinationOptionDestination() {
        return new FlightRestrictionType.OriginDestinationOption.Destination();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Address.StateProv }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Address.StateProv createAddressStateProv() {
        return new com.airchina.datacenter.spnr.sdk.entity.Address.StateProv();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Address.CountryName }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Address.CountryName createAddressCountryName() {
        return new com.airchina.datacenter.spnr.sdk.entity.Address.CountryName();
    }

    /**
     * Create an instance of {@link AirItineraryType.PlatingCarriers.PlatingCarrier }
     * 
     */
    public AirItineraryType.PlatingCarriers.PlatingCarrier createAirItineraryTypePlatingCarriersPlatingCarrier() {
        return new AirItineraryType.PlatingCarriers.PlatingCarrier();
    }

    /**
     * Create an instance of {@link OriginDestinationOptionType.UseLoyalty }
     * 
     */
    public OriginDestinationOptionType.UseLoyalty createOriginDestinationOptionTypeUseLoyalty() {
        return new OriginDestinationOptionType.UseLoyalty();
    }

    /**
     * Create an instance of {@link OriginDestinationOptionType.Baggage }
     * 
     */
    public OriginDestinationOptionType.Baggage createOriginDestinationOptionTypeBaggage() {
        return new OriginDestinationOptionType.Baggage();
    }

    /**
     * Create an instance of {@link OriginDestinationOptionType.FlightSegment }
     * 
     */
    public OriginDestinationOptionType.FlightSegment createOriginDestinationOptionTypeFlightSegment() {
        return new OriginDestinationOptionType.FlightSegment();
    }

    /**
     * Create an instance of {@link AirItineraryType.OriginDestinationOptions.OriginDestinationOption.FormData }
     * 
     */
    public AirItineraryType.OriginDestinationOptions.OriginDestinationOption.FormData createAirItineraryTypeOriginDestinationOptionsOriginDestinationOptionFormData() {
        return new AirItineraryType.OriginDestinationOptions.OriginDestinationOption.FormData();
    }

    /**
     * Create an instance of {@link BaggageSpecificationType.Price }
     * 
     */
    public BaggageSpecificationType.Price createBaggageSpecificationTypePrice() {
        return new BaggageSpecificationType.Price();
    }

    /**
     * Create an instance of {@link BaggageSpecificationType.SpecialItem }
     * 
     */
    public BaggageSpecificationType.SpecialItem createBaggageSpecificationTypeSpecialItem() {
        return new BaggageSpecificationType.SpecialItem();
    }

    /**
     * Create an instance of {@link CustomerCountsType.CustomerCount }
     * 
     */
    public CustomerCountsType.CustomerCount createCustomerCountsTypeCustomerCount() {
        return new CustomerCountsType.CustomerCount();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.MiscellaneousCharges.MiscellaneousCharge }
     * 
     */
    public VehicleLocationAdditionalFeesType.MiscellaneousCharges.MiscellaneousCharge createVehicleLocationAdditionalFeesTypeMiscellaneousChargesMiscellaneousCharge() {
        return new VehicleLocationAdditionalFeesType.MiscellaneousCharges.MiscellaneousCharge();
    }

    /**
     * Create an instance of {@link VehicleChargeType.MinMax }
     * 
     */
    public VehicleChargeType.MinMax createVehicleChargeTypeMinMax() {
        return new VehicleChargeType.MinMax();
    }

    /**
     * Create an instance of {@link VehicleChargeType.Calculation }
     * 
     */
    public VehicleChargeType.Calculation createVehicleChargeTypeCalculation() {
        return new VehicleChargeType.Calculation();
    }

    /**
     * Create an instance of {@link VehicleChargeType.TaxAmounts.TaxAmount }
     * 
     */
    public VehicleChargeType.TaxAmounts.TaxAmount createVehicleChargeTypeTaxAmountsTaxAmount() {
        return new VehicleChargeType.TaxAmounts.TaxAmount();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.Surcharges.Surcharge }
     * 
     */
    public VehicleLocationAdditionalFeesType.Surcharges.Surcharge createVehicleLocationAdditionalFeesTypeSurchargesSurcharge() {
        return new VehicleLocationAdditionalFeesType.Surcharges.Surcharge();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.Fees.Fee }
     * 
     */
    public VehicleLocationAdditionalFeesType.Fees.Fee createVehicleLocationAdditionalFeesTypeFeesFee() {
        return new VehicleLocationAdditionalFeesType.Fees.Fee();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalFeesType.Taxes.Tax }
     * 
     */
    public VehicleLocationAdditionalFeesType.Taxes.Tax createVehicleLocationAdditionalFeesTypeTaxesTax() {
        return new VehicleLocationAdditionalFeesType.Taxes.Tax();
    }

    /**
     * Create an instance of {@link RefundQualifierType.QualifierItem }
     * 
     */
    public RefundQualifierType.QualifierItem createRefundQualifierTypeQualifierItem() {
        return new RefundQualifierType.QualifierItem();
    }

    /**
     * Create an instance of {@link CoveredTravelerType.CoveredPerson }
     * 
     */
    public CoveredTravelerType.CoveredPerson createCoveredTravelerTypeCoveredPerson() {
        return new CoveredTravelerType.CoveredPerson();
    }

    /**
     * Create an instance of {@link CoveredTravelerType.Telephone }
     * 
     */
    public CoveredTravelerType.Telephone createCoveredTravelerTypeTelephone() {
        return new CoveredTravelerType.Telephone();
    }

    /**
     * Create an instance of {@link CoveredTravelerType.CitizenCountryName }
     * 
     */
    public CoveredTravelerType.CitizenCountryName createCoveredTravelerTypeCitizenCountryName() {
        return new CoveredTravelerType.CitizenCountryName();
    }

    /**
     * Create an instance of {@link CoveredTravelerType.Beneficiary.Name }
     * 
     */
    public CoveredTravelerType.Beneficiary.Name createCoveredTravelerTypeBeneficiaryName() {
        return new CoveredTravelerType.Beneficiary.Name();
    }

    /**
     * Create an instance of {@link QRDataType.QRCode }
     * 
     */
    public QRDataType.QRCode createQRDataTypeQRCode() {
        return new QRDataType.QRCode();
    }

    /**
     * Create an instance of {@link SPNREmailType.Attachments.Attachment }
     * 
     */
    public SPNREmailType.Attachments.Attachment createSPNREmailTypeAttachmentsAttachment() {
        return new SPNREmailType.Attachments.Attachment();
    }

    /**
     * Create an instance of {@link HotelReservationIDsType.HotelReservationID }
     * 
     */
    public HotelReservationIDsType.HotelReservationID createHotelReservationIDsTypeHotelReservationID() {
        return new HotelReservationIDsType.HotelReservationID();
    }

    /**
     * Create an instance of {@link LoyaltyPaymentType.Redeem }
     * 
     */
    public LoyaltyPaymentType.Redeem createLoyaltyPaymentTypeRedeem() {
        return new LoyaltyPaymentType.Redeem();
    }

    /**
     * Create an instance of {@link RoutingHopType.RoutingHop }
     * 
     */
    public RoutingHopType.RoutingHop createRoutingHopTypeRoutingHop() {
        return new RoutingHopType.RoutingHop();
    }

    /**
     * Create an instance of {@link MediaLinkType.LinkText }
     * 
     */
    public MediaLinkType.LinkText createMediaLinkTypeLinkText() {
        return new MediaLinkType.LinkText();
    }

    /**
     * Create an instance of {@link CruiseProfileType.CruiseProfile }
     * 
     */
    public CruiseProfileType.CruiseProfile createCruiseProfileTypeCruiseProfile() {
        return new CruiseProfileType.CruiseProfile();
    }

    /**
     * Create an instance of {@link CombinationAllowedType.Combination }
     * 
     */
    public CombinationAllowedType.Combination createCombinationAllowedTypeCombination() {
        return new CombinationAllowedType.Combination();
    }

    /**
     * Create an instance of {@link MembershipPriceType.Base }
     * 
     */
    public MembershipPriceType.Base createMembershipPriceTypeBase() {
        return new MembershipPriceType.Base();
    }

    /**
     * Create an instance of {@link MembershipPriceType.Total }
     * 
     */
    public MembershipPriceType.Total createMembershipPriceTypeTotal() {
        return new MembershipPriceType.Total();
    }

    /**
     * Create an instance of {@link RailPersonInfoType.Telephone }
     * 
     */
    public RailPersonInfoType.Telephone createRailPersonInfoTypeTelephone() {
        return new RailPersonInfoType.Telephone();
    }

    /**
     * Create an instance of {@link RailPersonInfoType.Email }
     * 
     */
    public RailPersonInfoType.Email createRailPersonInfoTypeEmail() {
        return new RailPersonInfoType.Email();
    }

    /**
     * Create an instance of {@link RailPersonInfoType.Address }
     * 
     */
    public RailPersonInfoType.Address createRailPersonInfoTypeAddress() {
        return new RailPersonInfoType.Address();
    }

    /**
     * Create an instance of {@link CabinAvailType.BaggageAllowance }
     * 
     */
    public CabinAvailType.BaggageAllowance createCabinAvailTypeBaggageAllowance() {
        return new CabinAvailType.BaggageAllowance();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.DriverType }
     * 
     */
    public VehicleReservationRQCoreType.DriverType createVehicleReservationRQCoreTypeDriverType() {
        return new VehicleReservationRQCoreType.DriverType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.Fees }
     * 
     */
    public VehicleReservationRQCoreType.Fees createVehicleReservationRQCoreTypeFees() {
        return new VehicleReservationRQCoreType.Fees();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.VehicleCharges }
     * 
     */
    public VehicleReservationRQCoreType.VehicleCharges createVehicleReservationRQCoreTypeVehicleCharges() {
        return new VehicleReservationRQCoreType.VehicleCharges();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.RateDistance }
     * 
     */
    public VehicleReservationRQCoreType.RateDistance createVehicleReservationRQCoreTypeRateDistance() {
        return new VehicleReservationRQCoreType.RateDistance();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.TotalCharge }
     * 
     */
    public VehicleReservationRQCoreType.TotalCharge createVehicleReservationRQCoreTypeTotalCharge() {
        return new VehicleReservationRQCoreType.TotalCharge();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType.SpecialEquipPrefs.SpecialEquipPref }
     * 
     */
    public VehicleReservationRQCoreType.SpecialEquipPrefs.SpecialEquipPref createVehicleReservationRQCoreTypeSpecialEquipPrefsSpecialEquipPref() {
        return new VehicleReservationRQCoreType.SpecialEquipPrefs.SpecialEquipPref();
    }

    /**
     * Create an instance of {@link StatisticType.StatisticApplicationSets }
     * 
     */
    public StatisticType.StatisticApplicationSets createStatisticTypeStatisticApplicationSets() {
        return new StatisticType.StatisticApplicationSets();
    }

    /**
     * Create an instance of {@link BundleProductsType.Product }
     * 
     */
    public BundleProductsType.Product createBundleProductsTypeProduct() {
        return new BundleProductsType.Product();
    }

    /**
     * Create an instance of {@link SPNRPriceAdjustmentsType.PriceAdjustment }
     * 
     */
    public SPNRPriceAdjustmentsType.PriceAdjustment createSPNRPriceAdjustmentsTypePriceAdjustment() {
        return new SPNRPriceAdjustmentsType.PriceAdjustment();
    }

    /**
     * Create an instance of {@link CertificateType.ProgramName }
     * 
     */
    public CertificateType.ProgramName createCertificateTypeProgramName() {
        return new CertificateType.ProgramName();
    }

    /**
     * Create an instance of {@link CertificateType.Holder }
     * 
     */
    public CertificateType.Holder createCertificateTypeHolder() {
        return new CertificateType.Holder();
    }

    /**
     * Create an instance of {@link BookingToolPartyType.AccountUserInfo }
     * 
     */
    public BookingToolPartyType.AccountUserInfo createBookingToolPartyTypeAccountUserInfo() {
        return new BookingToolPartyType.AccountUserInfo();
    }

    /**
     * Create an instance of {@link RailReservationType.PaymentRules }
     * 
     */
    public RailReservationType.PaymentRules createRailReservationTypePaymentRules() {
        return new RailReservationType.PaymentRules();
    }

    /**
     * Create an instance of {@link RailReservationType.Itinerary.OriginAndDestination }
     * 
     */
    public RailReservationType.Itinerary.OriginAndDestination createRailReservationTypeItineraryOriginAndDestination() {
        return new RailReservationType.Itinerary.OriginAndDestination();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.LengthsOfStay }
     * 
     */
    public AvailStatusMessageType.LengthsOfStay createAvailStatusMessageTypeLengthsOfStay() {
        return new AvailStatusMessageType.LengthsOfStay();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.HurdleRate }
     * 
     */
    public AvailStatusMessageType.HurdleRate createAvailStatusMessageTypeHurdleRate() {
        return new AvailStatusMessageType.HurdleRate();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.Delta }
     * 
     */
    public AvailStatusMessageType.Delta createAvailStatusMessageTypeDelta() {
        return new AvailStatusMessageType.Delta();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.RestrictionStatus }
     * 
     */
    public AvailStatusMessageType.RestrictionStatus createAvailStatusMessageTypeRestrictionStatus() {
        return new AvailStatusMessageType.RestrictionStatus();
    }

    /**
     * Create an instance of {@link PackageLoyaltyPricingType.Earn }
     * 
     */
    public PackageLoyaltyPricingType.Earn createPackageLoyaltyPricingTypeEarn() {
        return new PackageLoyaltyPricingType.Earn();
    }

    /**
     * Create an instance of {@link PackageLoyaltyPricingType.Redeem }
     * 
     */
    public PackageLoyaltyPricingType.Redeem createPackageLoyaltyPricingTypeRedeem() {
        return new PackageLoyaltyPricingType.Redeem();
    }

    /**
     * Create an instance of {@link SearchTravelerType.CitizenCountryName }
     * 
     */
    public SearchTravelerType.CitizenCountryName createSearchTravelerTypeCitizenCountryName() {
        return new SearchTravelerType.CitizenCountryName();
    }

    /**
     * Create an instance of {@link AirReservationType.AirItineraryPricingInfo }
     * 
     */
    public AirReservationType.AirItineraryPricingInfo createAirReservationTypeAirItineraryPricingInfo() {
        return new AirReservationType.AirItineraryPricingInfo();
    }

    /**
     * Create an instance of {@link AirReservationType.BookingReferenceID }
     * 
     */
    public AirReservationType.BookingReferenceID createAirReservationTypeBookingReferenceID() {
        return new AirReservationType.BookingReferenceID();
    }

    /**
     * Create an instance of {@link AirReservationType.SupplierNotes.Note }
     * 
     */
    public AirReservationType.SupplierNotes.Note createAirReservationTypeSupplierNotesNote() {
        return new AirReservationType.SupplierNotes.Note();
    }

    /**
     * Create an instance of {@link AirReservationType.Queues.Queue }
     * 
     */
    public AirReservationType.Queues.Queue createAirReservationTypeQueuesQueue() {
        return new AirReservationType.Queues.Queue();
    }

    /**
     * Create an instance of {@link RelativePositionsInfoType.RelativePosition }
     * 
     */
    public RelativePositionsInfoType.RelativePosition createRelativePositionsInfoTypeRelativePosition() {
        return new RelativePositionsInfoType.RelativePosition();
    }

    /**
     * Create an instance of {@link HotelInfoType.HotelName }
     * 
     */
    public HotelInfoType.HotelName createHotelInfoTypeHotelName() {
        return new HotelInfoType.HotelName();
    }

    /**
     * Create an instance of {@link HotelInfoType.ClosedSeasons }
     * 
     */
    public HotelInfoType.ClosedSeasons createHotelInfoTypeClosedSeasons() {
        return new HotelInfoType.ClosedSeasons();
    }

    /**
     * Create an instance of {@link HotelInfoType.Position }
     * 
     */
    public HotelInfoType.Position createHotelInfoTypePosition() {
        return new HotelInfoType.Position();
    }

    /**
     * Create an instance of {@link HotelInfoType.WeatherInfos }
     * 
     */
    public HotelInfoType.WeatherInfos createHotelInfoTypeWeatherInfos() {
        return new HotelInfoType.WeatherInfos();
    }

    /**
     * Create an instance of {@link HotelInfoType.Languages.Language }
     * 
     */
    public HotelInfoType.Languages.Language createHotelInfoTypeLanguagesLanguage() {
        return new HotelInfoType.Languages.Language();
    }

    /**
     * Create an instance of {@link HotelInfoType.OwnershipManagementInfos.OwnershipManagementInfo }
     * 
     */
    public HotelInfoType.OwnershipManagementInfos.OwnershipManagementInfo createHotelInfoTypeOwnershipManagementInfosOwnershipManagementInfo() {
        return new HotelInfoType.OwnershipManagementInfos.OwnershipManagementInfo();
    }

    /**
     * Create an instance of {@link HotelInfoType.Services.Service }
     * 
     */
    public HotelInfoType.Services.Service createHotelInfoTypeServicesService() {
        return new HotelInfoType.Services.Service();
    }

    /**
     * Create an instance of {@link HotelInfoType.HotelInfoCodes.HotelInfoCode }
     * 
     */
    public HotelInfoType.HotelInfoCodes.HotelInfoCode createHotelInfoTypeHotelInfoCodesHotelInfoCode() {
        return new HotelInfoType.HotelInfoCodes.HotelInfoCode();
    }

    /**
     * Create an instance of {@link HotelInfoType.Descriptions.Description }
     * 
     */
    public HotelInfoType.Descriptions.Description createHotelInfoTypeDescriptionsDescription() {
        return new HotelInfoType.Descriptions.Description();
    }

    /**
     * Create an instance of {@link HotelInfoType.Descriptions.MultimediaDescriptions }
     * 
     */
    public HotelInfoType.Descriptions.MultimediaDescriptions createHotelInfoTypeDescriptionsMultimediaDescriptions() {
        return new HotelInfoType.Descriptions.MultimediaDescriptions();
    }

    /**
     * Create an instance of {@link HotelInfoType.Descriptions.Renovation.Text }
     * 
     */
    public HotelInfoType.Descriptions.Renovation.Text createHotelInfoTypeDescriptionsRenovationText() {
        return new HotelInfoType.Descriptions.Renovation.Text();
    }

    /**
     * Create an instance of {@link HotelInfoType.RelativePositions.RelativePosition }
     * 
     */
    public HotelInfoType.RelativePositions.RelativePosition createHotelInfoTypeRelativePositionsRelativePosition() {
        return new HotelInfoType.RelativePositions.RelativePosition();
    }

    /**
     * Create an instance of {@link VideoItemsType.VideoItem }
     * 
     */
    public VideoItemsType.VideoItem createVideoItemsTypeVideoItem() {
        return new VideoItemsType.VideoItem();
    }

    /**
     * Create an instance of {@link MembershipType.Membership }
     * 
     */
    public MembershipType.Membership createMembershipTypeMembership() {
        return new MembershipType.Membership();
    }

    /**
     * Create an instance of {@link CustomerPrimaryAdditionalType.Additional }
     * 
     */
    public CustomerPrimaryAdditionalType.Additional createCustomerPrimaryAdditionalTypeAdditional() {
        return new CustomerPrimaryAdditionalType.Additional();
    }

    /**
     * Create an instance of {@link CustomerPrimaryAdditionalType.DriverType }
     * 
     */
    public CustomerPrimaryAdditionalType.DriverType createCustomerPrimaryAdditionalTypeDriverType() {
        return new CustomerPrimaryAdditionalType.DriverType();
    }

    /**
     * Create an instance of {@link PromotionType.A }
     * 
     */
    public PromotionType.A createPromotionTypeA() {
        return new PromotionType.A();
    }

    /**
     * Create an instance of {@link PromotionType.FromPrices }
     * 
     */
    public PromotionType.FromPrices createPromotionTypeFromPrices() {
        return new PromotionType.FromPrices();
    }

    /**
     * Create an instance of {@link PromotionType.Descriptions }
     * 
     */
    public PromotionType.Descriptions createPromotionTypeDescriptions() {
        return new PromotionType.Descriptions();
    }

    /**
     * Create an instance of {@link MainFromPrice.FromPrice }
     * 
     */
    public MainFromPrice.FromPrice createMainFromPriceFromPrice() {
        return new MainFromPrice.FromPrice();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedFareCode }
     * 
     */
    public CruiseGuestDetailType.SelectedFareCode createCruiseGuestDetailTypeSelectedFareCode() {
        return new CruiseGuestDetailType.SelectedFareCode();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.ContactInfo }
     * 
     */
    public CruiseGuestDetailType.ContactInfo createCruiseGuestDetailTypeContactInfo() {
        return new CruiseGuestDetailType.ContactInfo();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.LoyaltyInfo }
     * 
     */
    public CruiseGuestDetailType.LoyaltyInfo createCruiseGuestDetailTypeLoyaltyInfo() {
        return new CruiseGuestDetailType.LoyaltyInfo();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.LinkedTraveler }
     * 
     */
    public CruiseGuestDetailType.LinkedTraveler createCruiseGuestDetailTypeLinkedTraveler() {
        return new CruiseGuestDetailType.LinkedTraveler();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedDining }
     * 
     */
    public CruiseGuestDetailType.SelectedDining createCruiseGuestDetailTypeSelectedDining() {
        return new CruiseGuestDetailType.SelectedDining();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedInsurance }
     * 
     */
    public CruiseGuestDetailType.SelectedInsurance createCruiseGuestDetailTypeSelectedInsurance() {
        return new CruiseGuestDetailType.SelectedInsurance();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedSpecialServices }
     * 
     */
    public CruiseGuestDetailType.SelectedSpecialServices createCruiseGuestDetailTypeSelectedSpecialServices() {
        return new CruiseGuestDetailType.SelectedSpecialServices();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.AirAccommodations.AirAccommodation }
     * 
     */
    public CruiseGuestDetailType.AirAccommodations.AirAccommodation createCruiseGuestDetailTypeAirAccommodationsAirAccommodation() {
        return new CruiseGuestDetailType.AirAccommodations.AirAccommodation();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedPackages.SelectedPackage }
     * 
     */
    public CruiseGuestDetailType.SelectedPackages.SelectedPackage createCruiseGuestDetailTypeSelectedPackagesSelectedPackage() {
        return new CruiseGuestDetailType.SelectedPackages.SelectedPackage();
    }

    /**
     * Create an instance of {@link CruisePackageType.Location }
     * 
     */
    public CruisePackageType.Location createCruisePackageTypeLocation() {
        return new CruisePackageType.Location();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.TravelerRefNumber }
     * 
     */
    public PTCFareBreakdownType.TravelerRefNumber createPTCFareBreakdownTypeTravelerRefNumber() {
        return new PTCFareBreakdownType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareInfo }
     * 
     */
    public PTCFareBreakdownType.FareInfo createPTCFareBreakdownTypeFareInfo() {
        return new PTCFareBreakdownType.FareInfo();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.Endorsements.Endorsement }
     * 
     */
    public PTCFareBreakdownType.Endorsements.Endorsement createPTCFareBreakdownTypeEndorsementsEndorsement() {
        return new PTCFareBreakdownType.Endorsements.Endorsement();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.TicketDesignators.TicketDesignator }
     * 
     */
    public PTCFareBreakdownType.TicketDesignators.TicketDesignator createPTCFareBreakdownTypeTicketDesignatorsTicketDesignator() {
        return new PTCFareBreakdownType.TicketDesignators.TicketDesignator();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareBasisCodes.FareBasisCode }
     * 
     */
    public PTCFareBreakdownType.FareBasisCodes.FareBasisCode createPTCFareBreakdownTypeFareBasisCodesFareBasisCode() {
        return new PTCFareBreakdownType.FareBasisCodes.FareBasisCode();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PricingSeqs.PricingSeq }
     * 
     */
    public PTCFareBreakdownType.PricingSeqs.PricingSeq createPTCFareBreakdownTypePricingSeqsPricingSeq() {
        return new PTCFareBreakdownType.PricingSeqs.PricingSeq();
    }

    /**
     * Create an instance of {@link ServiceItemCoreType.Endorsement }
     * 
     */
    public ServiceItemCoreType.Endorsement createServiceItemCoreTypeEndorsement() {
        return new ServiceItemCoreType.Endorsement();
    }

    /**
     * Create an instance of {@link ServiceItemCoreType.BookingInstructions.UpgradeMethod }
     * 
     */
    public ServiceItemCoreType.BookingInstructions.UpgradeMethod createServiceItemCoreTypeBookingInstructionsUpgradeMethod() {
        return new ServiceItemCoreType.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link RailChargesType.Charges }
     * 
     */
    public RailChargesType.Charges createRailChargesTypeCharges() {
        return new RailChargesType.Charges();
    }

    /**
     * Create an instance of {@link UniqueIDsType.UniqueID }
     * 
     */
    public UniqueIDsType.UniqueID createUniqueIDsTypeUniqueID() {
        return new UniqueIDsType.UniqueID();
    }

    /**
     * Create an instance of {@link MediaImageType.Height }
     * 
     */
    public MediaImageType.Height createMediaImageTypeHeight() {
        return new MediaImageType.Height();
    }

    /**
     * Create an instance of {@link MediaImageType.Width }
     * 
     */
    public MediaImageType.Width createMediaImageTypeWidth() {
        return new MediaImageType.Width();
    }

    /**
     * Create an instance of {@link MediaImageType.ImageText }
     * 
     */
    public MediaImageType.ImageText createMediaImageTypeImageText() {
        return new MediaImageType.ImageText();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType.ReservationID }
     * 
     */
    public CruiseGuestInfoType.ReservationID createCruiseGuestInfoTypeReservationID() {
        return new CruiseGuestInfoType.ReservationID();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType.GuestDetails }
     * 
     */
    public CruiseGuestInfoType.GuestDetails createCruiseGuestInfoTypeGuestDetails() {
        return new CruiseGuestInfoType.GuestDetails();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType.PaymentOptions.PaymentOption }
     * 
     */
    public CruiseGuestInfoType.PaymentOptions.PaymentOption createCruiseGuestInfoTypePaymentOptionsPaymentOption() {
        return new CruiseGuestInfoType.PaymentOptions.PaymentOption();
    }

    /**
     * Create an instance of {@link PaymentDetailType.PaymentAmount }
     * 
     */
    public PaymentDetailType.PaymentAmount createPaymentDetailTypePaymentAmount() {
        return new PaymentDetailType.PaymentAmount();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType.LinkedBookings.LinkedBooking }
     * 
     */
    public CruiseGuestInfoType.LinkedBookings.LinkedBooking createCruiseGuestInfoTypeLinkedBookingsLinkedBooking() {
        return new CruiseGuestInfoType.LinkedBookings.LinkedBooking();
    }

    /**
     * Create an instance of {@link BatchRefundParamsInfoType.RefundApplicationTimeSpan }
     * 
     */
    public BatchRefundParamsInfoType.RefundApplicationTimeSpan createBatchRefundParamsInfoTypeRefundApplicationTimeSpan() {
        return new BatchRefundParamsInfoType.RefundApplicationTimeSpan();
    }

    /**
     * Create an instance of {@link BatchRefundParamsInfoType.RefundReviewTimeSpan }
     * 
     */
    public BatchRefundParamsInfoType.RefundReviewTimeSpan createBatchRefundParamsInfoTypeRefundReviewTimeSpan() {
        return new BatchRefundParamsInfoType.RefundReviewTimeSpan();
    }

    /**
     * Create an instance of {@link BatchRefundParamsInfoType.Payments }
     * 
     */
    public BatchRefundParamsInfoType.Payments createBatchRefundParamsInfoTypePayments() {
        return new BatchRefundParamsInfoType.Payments();
    }

    /**
     * Create an instance of {@link BatchRefundParamsInfoType.ProcessTimeSpan }
     * 
     */
    public BatchRefundParamsInfoType.ProcessTimeSpan createBatchRefundParamsInfoTypeProcessTimeSpan() {
        return new BatchRefundParamsInfoType.ProcessTimeSpan();
    }

    /**
     * Create an instance of {@link HotelReservationsType.HotelReservation }
     * 
     */
    public HotelReservationsType.HotelReservation createHotelReservationsTypeHotelReservation() {
        return new HotelReservationsType.HotelReservation();
    }

    /**
     * Create an instance of {@link ReservationItemsType.Item }
     * 
     */
    public ReservationItemsType.Item createReservationItemsTypeItem() {
        return new ReservationItemsType.Item();
    }

    /**
     * Create an instance of {@link ReservationItemsType.ItemPricing }
     * 
     */
    public ReservationItemsType.ItemPricing createReservationItemsTypeItemPricing() {
        return new ReservationItemsType.ItemPricing();
    }

    /**
     * Create an instance of {@link ReservationItemsType.SpecialRequestDetails }
     * 
     */
    public ReservationItemsType.SpecialRequestDetails createReservationItemsTypeSpecialRequestDetails() {
        return new ReservationItemsType.SpecialRequestDetails();
    }

    /**
     * Create an instance of {@link ItinPricingType.Cost }
     * 
     */
    public ItinPricingType.Cost createItinPricingTypeCost() {
        return new ItinPricingType.Cost();
    }

    /**
     * Create an instance of {@link TravelSegmentType.Hotel }
     * 
     */
    public TravelSegmentType.Hotel createTravelSegmentTypeHotel() {
        return new TravelSegmentType.Hotel();
    }

    /**
     * Create an instance of {@link TravelSegmentType.Rail }
     * 
     */
    public TravelSegmentType.Rail createTravelSegmentTypeRail() {
        return new TravelSegmentType.Rail();
    }

    /**
     * Create an instance of {@link TravelSegmentType.Cruise }
     * 
     */
    public TravelSegmentType.Cruise createTravelSegmentTypeCruise() {
        return new TravelSegmentType.Cruise();
    }

    /**
     * Create an instance of {@link TravelSegmentType.Tour }
     * 
     */
    public TravelSegmentType.Tour createTravelSegmentTypeTour() {
        return new TravelSegmentType.Tour();
    }

    /**
     * Create an instance of {@link TravelSegmentType.General }
     * 
     */
    public TravelSegmentType.General createTravelSegmentTypeGeneral() {
        return new TravelSegmentType.General();
    }

    /**
     * Create an instance of {@link TravelSegmentType.Package }
     * 
     */
    public TravelSegmentType.Package createTravelSegmentTypePackage() {
        return new TravelSegmentType.Package();
    }

    /**
     * Create an instance of {@link TravelSegmentType.GroundTransport.DetailedReservation }
     * 
     */
    public TravelSegmentType.GroundTransport.DetailedReservation createTravelSegmentTypeGroundTransportDetailedReservation() {
        return new TravelSegmentType.GroundTransport.DetailedReservation();
    }

    /**
     * Create an instance of {@link TravelSegmentType.Air.Reservation.Seats.Seat }
     * 
     */
    public TravelSegmentType.Air.Reservation.Seats.Seat createTravelSegmentTypeAirReservationSeatsSeat() {
        return new TravelSegmentType.Air.Reservation.Seats.Seat();
    }

    /**
     * Create an instance of {@link VehAvailType.VehAvailCore }
     * 
     */
    public VehAvailType.VehAvailCore createVehAvailTypeVehAvailCore() {
        return new VehAvailType.VehAvailCore();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.TotalCharge }
     * 
     */
    public VehicleAvailCoreType.TotalCharge createVehicleAvailCoreTypeTotalCharge() {
        return new VehicleAvailCoreType.TotalCharge();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.PricedEquips }
     * 
     */
    public VehicleAvailCoreType.PricedEquips createVehicleAvailCoreTypePricedEquips() {
        return new VehicleAvailCoreType.PricedEquips();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.Fees }
     * 
     */
    public VehicleAvailCoreType.Fees createVehicleAvailCoreTypeFees() {
        return new VehicleAvailCoreType.Fees();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.Reference }
     * 
     */
    public VehicleAvailCoreType.Reference createVehicleAvailCoreTypeReference() {
        return new VehicleAvailCoreType.Reference();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.Vendor }
     * 
     */
    public VehicleAvailCoreType.Vendor createVehicleAvailCoreTypeVendor() {
        return new VehicleAvailCoreType.Vendor();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.VendorLocation }
     * 
     */
    public VehicleAvailCoreType.VendorLocation createVehicleAvailCoreTypeVendorLocation() {
        return new VehicleAvailCoreType.VendorLocation();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType.DropOffLocation }
     * 
     */
    public VehicleAvailCoreType.DropOffLocation createVehicleAvailCoreTypeDropOffLocation() {
        return new VehicleAvailCoreType.DropOffLocation();
    }

    /**
     * Create an instance of {@link RoomStayLiteType.RoomTypes }
     * 
     */
    public RoomStayLiteType.RoomTypes createRoomStayLiteTypeRoomTypes() {
        return new RoomStayLiteType.RoomTypes();
    }

    /**
     * Create an instance of {@link RoomStayLiteType.RatePlans }
     * 
     */
    public RoomStayLiteType.RatePlans createRoomStayLiteTypeRatePlans() {
        return new RoomStayLiteType.RatePlans();
    }

    /**
     * Create an instance of {@link RoomStayLiteType.RoomRates }
     * 
     */
    public RoomStayLiteType.RoomRates createRoomStayLiteTypeRoomRates() {
        return new RoomStayLiteType.RoomRates();
    }

    /**
     * Create an instance of {@link RoomStayLiteType.BasicPropertyInfo }
     * 
     */
    public RoomStayLiteType.BasicPropertyInfo createRoomStayLiteTypeBasicPropertyInfo() {
        return new RoomStayLiteType.BasicPropertyInfo();
    }

    /**
     * Create an instance of {@link WrittenConfInstType.SupplementalData }
     * 
     */
    public WrittenConfInstType.SupplementalData createWrittenConfInstTypeSupplementalData() {
        return new WrittenConfInstType.SupplementalData();
    }

    /**
     * Create an instance of {@link TicketRemarkVerificationType.StartsWith }
     * 
     */
    public TicketRemarkVerificationType.StartsWith createTicketRemarkVerificationTypeStartsWith() {
        return new TicketRemarkVerificationType.StartsWith();
    }

    /**
     * Create an instance of {@link TicketRemarkVerificationType.Contains }
     * 
     */
    public TicketRemarkVerificationType.Contains createTicketRemarkVerificationTypeContains() {
        return new TicketRemarkVerificationType.Contains();
    }

    /**
     * Create an instance of {@link BaggagePieceType.DescriptionDetails }
     * 
     */
    public BaggagePieceType.DescriptionDetails createBaggagePieceTypeDescriptionDetails() {
        return new BaggagePieceType.DescriptionDetails();
    }

    /**
     * Create an instance of {@link BaggagePieceType.MaxWeight }
     * 
     */
    public BaggagePieceType.MaxWeight createBaggagePieceTypeMaxWeight() {
        return new BaggagePieceType.MaxWeight();
    }

    /**
     * Create an instance of {@link CategoryOptionType.PriceInfos }
     * 
     */
    public CategoryOptionType.PriceInfos createCategoryOptionTypePriceInfos() {
        return new CategoryOptionType.PriceInfos();
    }

    /**
     * Create an instance of {@link IndCoverageReqsType.IndTripCost }
     * 
     */
    public IndCoverageReqsType.IndTripCost createIndCoverageReqsTypeIndTripCost() {
        return new IndCoverageReqsType.IndTripCost();
    }

    /**
     * Create an instance of {@link IndCoverageReqsType.FlightAccidentAmount }
     * 
     */
    public IndCoverageReqsType.FlightAccidentAmount createIndCoverageReqsTypeFlightAccidentAmount() {
        return new IndCoverageReqsType.FlightAccidentAmount();
    }

    /**
     * Create an instance of {@link IndCoverageReqsType.PreexistingConditions.PreexistingCondition }
     * 
     */
    public IndCoverageReqsType.PreexistingConditions.PreexistingCondition createIndCoverageReqsTypePreexistingConditionsPreexistingCondition() {
        return new IndCoverageReqsType.PreexistingConditions.PreexistingCondition();
    }

    /**
     * Create an instance of {@link IndCoverageReqsType.CoveredLuggage.LuggageItem.ItemDeclaredValue }
     * 
     */
    public IndCoverageReqsType.CoveredLuggage.LuggageItem.ItemDeclaredValue createIndCoverageReqsTypeCoveredLuggageLuggageItemItemDeclaredValue() {
        return new IndCoverageReqsType.CoveredLuggage.LuggageItem.ItemDeclaredValue();
    }

    /**
     * Create an instance of {@link IndCoverageReqsType.CoveredLuggage.LuggageItem.LuggagePremium }
     * 
     */
    public IndCoverageReqsType.CoveredLuggage.LuggageItem.LuggagePremium createIndCoverageReqsTypeCoveredLuggageLuggageItemLuggagePremium() {
        return new IndCoverageReqsType.CoveredLuggage.LuggageItem.LuggagePremium();
    }

    /**
     * Create an instance of {@link VehicleProductDetailsType.PricedEquips }
     * 
     */
    public VehicleProductDetailsType.PricedEquips createVehicleProductDetailsTypePricedEquips() {
        return new VehicleProductDetailsType.PricedEquips();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoType.Reference }
     * 
     */
    public VehicleReservationRQAdditionalInfoType.Reference createVehicleReservationRQAdditionalInfoTypeReference() {
        return new VehicleReservationRQAdditionalInfoType.Reference();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoType.Comments }
     * 
     */
    public VehicleReservationRQAdditionalInfoType.Comments createVehicleReservationRQAdditionalInfoTypeComments() {
        return new VehicleReservationRQAdditionalInfoType.Comments();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoType.CoveragePrefs.CoveragePref }
     * 
     */
    public VehicleReservationRQAdditionalInfoType.CoveragePrefs.CoveragePref createVehicleReservationRQAdditionalInfoTypeCoveragePrefsCoveragePref() {
        return new VehicleReservationRQAdditionalInfoType.CoveragePrefs.CoveragePref();
    }

    /**
     * Create an instance of {@link HotelResModifyType.HotelResModify }
     * 
     */
    public HotelResModifyType.HotelResModify createHotelResModifyTypeHotelResModify() {
        return new HotelResModifyType.HotelResModify();
    }

    /**
     * Create an instance of {@link ImageType.Alt }
     * 
     */
    public ImageType.Alt createImageTypeAlt() {
        return new ImageType.Alt();
    }

    /**
     * Create an instance of {@link FFPAccumulationType.TierRates }
     * 
     */
    public FFPAccumulationType.TierRates createFFPAccumulationTypeTierRates() {
        return new FFPAccumulationType.TierRates();
    }

    /**
     * Create an instance of {@link FFPAccumulationType.RBDRates }
     * 
     */
    public FFPAccumulationType.RBDRates createFFPAccumulationTypeRBDRates() {
        return new FFPAccumulationType.RBDRates();
    }

    /**
     * Create an instance of {@link UserInputOtherType.UserText }
     * 
     */
    public UserInputOtherType.UserText createUserInputOtherTypeUserText() {
        return new UserInputOtherType.UserText();
    }

    /**
     * Create an instance of {@link UserInputOtherType.UserChoices.FlightOptions.Flight.ElementNumber }
     * 
     */
    public UserInputOtherType.UserChoices.FlightOptions.Flight.ElementNumber createUserInputOtherTypeUserChoicesFlightOptionsFlightElementNumber() {
        return new UserInputOtherType.UserChoices.FlightOptions.Flight.ElementNumber();
    }

    /**
     * Create an instance of {@link UserInputOtherType.UserChoices.FlightOptions.Flight.Departure }
     * 
     */
    public UserInputOtherType.UserChoices.FlightOptions.Flight.Departure createUserInputOtherTypeUserChoicesFlightOptionsFlightDeparture() {
        return new UserInputOtherType.UserChoices.FlightOptions.Flight.Departure();
    }

    /**
     * Create an instance of {@link UserInputOtherType.UserChoices.FlightOptions.Flight.Arrival }
     * 
     */
    public UserInputOtherType.UserChoices.FlightOptions.Flight.Arrival createUserInputOtherTypeUserChoicesFlightOptionsFlightArrival() {
        return new UserInputOtherType.UserChoices.FlightOptions.Flight.Arrival();
    }

    /**
     * Create an instance of {@link UserInputOtherType.UserChoices.FlightOptions.Flight.Carrier }
     * 
     */
    public UserInputOtherType.UserChoices.FlightOptions.Flight.Carrier createUserInputOtherTypeUserChoicesFlightOptionsFlightCarrier() {
        return new UserInputOtherType.UserChoices.FlightOptions.Flight.Carrier();
    }

    /**
     * Create an instance of {@link UserInputOtherType.UserChoices.FlightOptions.Flight.OperatingCarrier }
     * 
     */
    public UserInputOtherType.UserChoices.FlightOptions.Flight.OperatingCarrier createUserInputOtherTypeUserChoicesFlightOptionsFlightOperatingCarrier() {
        return new UserInputOtherType.UserChoices.FlightOptions.Flight.OperatingCarrier();
    }

    /**
     * Create an instance of {@link UserInputOtherType.UserChoices.FlightOptions.Flight.ActionCode }
     * 
     */
    public UserInputOtherType.UserChoices.FlightOptions.Flight.ActionCode createUserInputOtherTypeUserChoicesFlightOptionsFlightActionCode() {
        return new UserInputOtherType.UserChoices.FlightOptions.Flight.ActionCode();
    }

    /**
     * Create an instance of {@link UserInputOtherType.UserChoices.FlightOptions.Flight.Information }
     * 
     */
    public UserInputOtherType.UserChoices.FlightOptions.Flight.Information createUserInputOtherTypeUserChoicesFlightOptionsFlightInformation() {
        return new UserInputOtherType.UserChoices.FlightOptions.Flight.Information();
    }

    /**
     * Create an instance of {@link SailingType.Dining }
     * 
     */
    public SailingType.Dining createSailingTypeDining() {
        return new SailingType.Dining();
    }

    /**
     * Create an instance of {@link InsCoverageType.CoveredTravelers }
     * 
     */
    public InsCoverageType.CoveredTravelers createInsCoverageTypeCoveredTravelers() {
        return new InsCoverageType.CoveredTravelers();
    }

    /**
     * Create an instance of {@link VerificationType.PersonName }
     * 
     */
    public VerificationType.PersonName createVerificationTypePersonName() {
        return new VerificationType.PersonName();
    }

    /**
     * Create an instance of {@link VerificationType.TelephoneInfo }
     * 
     */
    public VerificationType.TelephoneInfo createVerificationTypeTelephoneInfo() {
        return new VerificationType.TelephoneInfo();
    }

    /**
     * Create an instance of {@link VerificationType.CustLoyalty }
     * 
     */
    public VerificationType.CustLoyalty createVerificationTypeCustLoyalty() {
        return new VerificationType.CustLoyalty();
    }

    /**
     * Create an instance of {@link VerificationType.ReservationTimeSpan }
     * 
     */
    public VerificationType.ReservationTimeSpan createVerificationTypeReservationTimeSpan() {
        return new VerificationType.ReservationTimeSpan();
    }

    /**
     * Create an instance of {@link VerificationType.AssociatedQuantity }
     * 
     */
    public VerificationType.AssociatedQuantity createVerificationTypeAssociatedQuantity() {
        return new VerificationType.AssociatedQuantity();
    }

    /**
     * Create an instance of {@link VerificationType.StartLocation }
     * 
     */
    public VerificationType.StartLocation createVerificationTypeStartLocation() {
        return new VerificationType.StartLocation();
    }

    /**
     * Create an instance of {@link VerificationType.EndLocation }
     * 
     */
    public VerificationType.EndLocation createVerificationTypeEndLocation() {
        return new VerificationType.EndLocation();
    }

    /**
     * Create an instance of {@link VerificationType.CorporateID }
     * 
     */
    public VerificationType.CorporateID createVerificationTypeCorporateID() {
        return new VerificationType.CorporateID();
    }

    /**
     * Create an instance of {@link VerificationType.Customer }
     * 
     */
    public VerificationType.Customer createVerificationTypeCustomer() {
        return new VerificationType.Customer();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos.PriceInfo }
     * 
     */
    public CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos.PriceInfo createCruiseBookingInfoTypeGuestPricesGuestPricePriceInfosPriceInfo() {
        return new CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos.PriceInfo();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.PaymentSchedule.Payment }
     * 
     */
    public CruiseBookingInfoType.PaymentSchedule.Payment createCruiseBookingInfoTypePaymentSchedulePayment() {
        return new CruiseBookingInfoType.PaymentSchedule.Payment();
    }

    /**
     * Create an instance of {@link CruiseBookingInfoType.BookingPrices.BookingPrice }
     * 
     */
    public CruiseBookingInfoType.BookingPrices.BookingPrice createCruiseBookingInfoTypeBookingPricesBookingPrice() {
        return new CruiseBookingInfoType.BookingPrices.BookingPrice();
    }

    /**
     * Create an instance of {@link ModifyRuleType.EffectiveDateRange }
     * 
     */
    public ModifyRuleType.EffectiveDateRange createModifyRuleTypeEffectiveDateRange() {
        return new ModifyRuleType.EffectiveDateRange();
    }

    /**
     * Create an instance of {@link OriginDestinationInformationType.OriginLocation }
     * 
     */
    public OriginDestinationInformationType.OriginLocation createOriginDestinationInformationTypeOriginLocation() {
        return new OriginDestinationInformationType.OriginLocation();
    }

    /**
     * Create an instance of {@link OriginDestinationInformationType.DestinationLocation }
     * 
     */
    public OriginDestinationInformationType.DestinationLocation createOriginDestinationInformationTypeDestinationLocation() {
        return new OriginDestinationInformationType.DestinationLocation();
    }

    /**
     * Create an instance of {@link FerryPaymentDetailType.PaymentAmount }
     * 
     */
    public FerryPaymentDetailType.PaymentAmount createFerryPaymentDetailTypePaymentAmount() {
        return new FerryPaymentDetailType.PaymentAmount();
    }

    /**
     * Create an instance of {@link RailConnectionType.ConnectionLocation }
     * 
     */
    public RailConnectionType.ConnectionLocation createRailConnectionTypeConnectionLocation() {
        return new RailConnectionType.ConnectionLocation();
    }

    /**
     * Create an instance of {@link RatePlanReleases.Release.DaysOfWeek }
     * 
     */
    public RatePlanReleases.Release.DaysOfWeek createRatePlanReleasesReleaseDaysOfWeek() {
        return new RatePlanReleases.Release.DaysOfWeek();
    }

    /**
     * Create an instance of {@link NDCImageType.Height }
     * 
     */
    public NDCImageType.Height createNDCImageTypeHeight() {
        return new NDCImageType.Height();
    }

    /**
     * Create an instance of {@link NDCImageType.Width }
     * 
     */
    public NDCImageType.Width createNDCImageTypeWidth() {
        return new NDCImageType.Width();
    }

    /**
     * Create an instance of {@link NDCImageType.ImageText }
     * 
     */
    public NDCImageType.ImageText createNDCImageTypeImageText() {
        return new NDCImageType.ImageText();
    }

    /**
     * Create an instance of {@link CancellationRefundType.CancellationRefund }
     * 
     */
    public CancellationRefundType.CancellationRefund createCancellationRefundTypeCancellationRefund() {
        return new CancellationRefundType.CancellationRefund();
    }

    /**
     * Create an instance of {@link CancellationRefundType.Taxes }
     * 
     */
    public CancellationRefundType.Taxes createCancellationRefundTypeTaxes() {
        return new CancellationRefundType.Taxes();
    }

    /**
     * Create an instance of {@link CancellationRefundType.ReissueFee }
     * 
     */
    public CancellationRefundType.ReissueFee createCancellationRefundTypeReissueFee() {
        return new CancellationRefundType.ReissueFee();
    }

    /**
     * Create an instance of {@link OrganizationType.OrgMemberName }
     * 
     */
    public OrganizationType.OrgMemberName createOrganizationTypeOrgMemberName() {
        return new OrganizationType.OrgMemberName();
    }

    /**
     * Create an instance of {@link AirAncillariesServiceType.Info }
     * 
     */
    public AirAncillariesServiceType.Info createAirAncillariesServiceTypeInfo() {
        return new AirAncillariesServiceType.Info();
    }

    /**
     * Create an instance of {@link AirAncillariesServiceType.ExchangeRate }
     * 
     */
    public AirAncillariesServiceType.ExchangeRate createAirAncillariesServiceTypeExchangeRate() {
        return new AirAncillariesServiceType.ExchangeRate();
    }

    /**
     * Create an instance of {@link AirAncillariesServiceType.Baggage.MaxWeight }
     * 
     */
    public AirAncillariesServiceType.Baggage.MaxWeight createAirAncillariesServiceTypeBaggageMaxWeight() {
        return new AirAncillariesServiceType.Baggage.MaxWeight();
    }

    /**
     * Create an instance of {@link AirAncillariesServiceType.BookingInstructions.UpgradeMethod }
     * 
     */
    public AirAncillariesServiceType.BookingInstructions.UpgradeMethod createAirAncillariesServiceTypeBookingInstructionsUpgradeMethod() {
        return new AirAncillariesServiceType.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link AreasType.Area }
     * 
     */
    public AreasType.Area createAreasTypeArea() {
        return new AreasType.Area();
    }

    /**
     * Create an instance of {@link TimeSlots.TimeSlot }
     * 
     */
    public TimeSlots.TimeSlot createTimeSlotsTimeSlot() {
        return new TimeSlots.TimeSlot();
    }

    /**
     * Create an instance of {@link VicinityType.Position }
     * 
     */
    public VicinityType.Position createVicinityTypePosition() {
        return new VicinityType.Position();
    }

    /**
     * Create an instance of {@link VicinityType.Radius }
     * 
     */
    public VicinityType.Radius createVicinityTypeRadius() {
        return new VicinityType.Radius();
    }

    /**
     * Create an instance of {@link AirAncillaryLoungeRoomType.Gates }
     * 
     */
    public AirAncillaryLoungeRoomType.Gates createAirAncillaryLoungeRoomTypeGates() {
        return new AirAncillaryLoungeRoomType.Gates();
    }

    /**
     * Create an instance of {@link AirAncillaryLoungeRoomType.ContactInfos }
     * 
     */
    public AirAncillaryLoungeRoomType.ContactInfos createAirAncillaryLoungeRoomTypeContactInfos() {
        return new AirAncillaryLoungeRoomType.ContactInfos();
    }

    /**
     * Create an instance of {@link AirAncillaryLoungeRoomType.OpenTimes.OpenTime }
     * 
     */
    public AirAncillaryLoungeRoomType.OpenTimes.OpenTime createAirAncillaryLoungeRoomTypeOpenTimesOpenTime() {
        return new AirAncillaryLoungeRoomType.OpenTimes.OpenTime();
    }

    /**
     * Create an instance of {@link VerificationODOType.FlightSegment }
     * 
     */
    public VerificationODOType.FlightSegment createVerificationODOTypeFlightSegment() {
        return new VerificationODOType.FlightSegment();
    }

    /**
     * Create an instance of {@link PostResType.PostResInfo.ServiceSessionTimeSpan }
     * 
     */
    public PostResType.PostResInfo.ServiceSessionTimeSpan createPostResTypePostResInfoServiceSessionTimeSpan() {
        return new PostResType.PostResInfo.ServiceSessionTimeSpan();
    }

    /**
     * Create an instance of {@link PostResType.PostResInfo.ContactInfo }
     * 
     */
    public PostResType.PostResInfo.ContactInfo createPostResTypePostResInfoContactInfo() {
        return new PostResType.PostResInfo.ContactInfo();
    }

    /**
     * Create an instance of {@link PostResType.PostResInfo.Vehicle }
     * 
     */
    public PostResType.PostResInfo.Vehicle createPostResTypePostResInfoVehicle() {
        return new PostResType.PostResInfo.Vehicle();
    }

    /**
     * Create an instance of {@link FerryReservationRequest.PassengerDetails }
     * 
     */
    public FerryReservationRequest.PassengerDetails createFerryReservationRequestPassengerDetails() {
        return new FerryReservationRequest.PassengerDetails();
    }

    /**
     * Create an instance of {@link FerryReservationRequest.VehicleDetail }
     * 
     */
    public FerryReservationRequest.VehicleDetail createFerryReservationRequestVehicleDetail() {
        return new FerryReservationRequest.VehicleDetail();
    }

    /**
     * Create an instance of {@link FerryReservationRequest.OwnInsuranceChoices }
     * 
     */
    public FerryReservationRequest.OwnInsuranceChoices createFerryReservationRequestOwnInsuranceChoices() {
        return new FerryReservationRequest.OwnInsuranceChoices();
    }

    /**
     * Create an instance of {@link VehicleDetailsType.Trailer.TrailerPricing.OriginalUnitPrice }
     * 
     */
    public VehicleDetailsType.Trailer.TrailerPricing.OriginalUnitPrice createVehicleDetailsTypeTrailerTrailerPricingOriginalUnitPrice() {
        return new VehicleDetailsType.Trailer.TrailerPricing.OriginalUnitPrice();
    }

    /**
     * Create an instance of {@link VehicleDetailsType.Trailer.TrailerPricing.UnitPrice }
     * 
     */
    public VehicleDetailsType.Trailer.TrailerPricing.UnitPrice createVehicleDetailsTypeTrailerTrailerPricingUnitPrice() {
        return new VehicleDetailsType.Trailer.TrailerPricing.UnitPrice();
    }

    /**
     * Create an instance of {@link VehicleDetailsType.Trailer.TrailerPricing.TotalPrice }
     * 
     */
    public VehicleDetailsType.Trailer.TrailerPricing.TotalPrice createVehicleDetailsTypeTrailerTrailerPricingTotalPrice() {
        return new VehicleDetailsType.Trailer.TrailerPricing.TotalPrice();
    }

    /**
     * Create an instance of {@link VehicleDetailsType.Vehicle.VehiclePricing.OriginalUnitPrice }
     * 
     */
    public VehicleDetailsType.Vehicle.VehiclePricing.OriginalUnitPrice createVehicleDetailsTypeVehicleVehiclePricingOriginalUnitPrice() {
        return new VehicleDetailsType.Vehicle.VehiclePricing.OriginalUnitPrice();
    }

    /**
     * Create an instance of {@link VehicleDetailsType.Vehicle.VehiclePricing.UnitPrice }
     * 
     */
    public VehicleDetailsType.Vehicle.VehiclePricing.UnitPrice createVehicleDetailsTypeVehicleVehiclePricingUnitPrice() {
        return new VehicleDetailsType.Vehicle.VehiclePricing.UnitPrice();
    }

    /**
     * Create an instance of {@link VehicleDetailsType.Vehicle.VehiclePricing.TotalPrice }
     * 
     */
    public VehicleDetailsType.Vehicle.VehiclePricing.TotalPrice createVehicleDetailsTypeVehicleVehiclePricingTotalPrice() {
        return new VehicleDetailsType.Vehicle.VehiclePricing.TotalPrice();
    }

    /**
     * Create an instance of {@link FerryReservationRequest.PassengerCount.SpecialNeed }
     * 
     */
    public FerryReservationRequest.PassengerCount.SpecialNeed createFerryReservationRequestPassengerCountSpecialNeed() {
        return new FerryReservationRequest.PassengerCount.SpecialNeed();
    }

    /**
     * Create an instance of {@link PassengerDetailType.SpecialNeed }
     * 
     */
    public PassengerDetailType.SpecialNeed createPassengerDetailTypeSpecialNeed() {
        return new PassengerDetailType.SpecialNeed();
    }

    /**
     * Create an instance of {@link FareType.BaseFare }
     * 
     */
    public FareType.BaseFare createFareTypeBaseFare() {
        return new FareType.BaseFare();
    }

    /**
     * Create an instance of {@link FareType.EquivFare }
     * 
     */
    public FareType.EquivFare createFareTypeEquivFare() {
        return new FareType.EquivFare();
    }

    /**
     * Create an instance of {@link FareType.Taxes }
     * 
     */
    public FareType.Taxes createFareTypeTaxes() {
        return new FareType.Taxes();
    }

    /**
     * Create an instance of {@link FareType.TotalFare }
     * 
     */
    public FareType.TotalFare createFareTypeTotalFare() {
        return new FareType.TotalFare();
    }

    /**
     * Create an instance of {@link FareType.FareConstruction }
     * 
     */
    public FareType.FareConstruction createFareTypeFareConstruction() {
        return new FareType.FareConstruction();
    }

    /**
     * Create an instance of {@link FareType.UnstructuredFareCalc }
     * 
     */
    public FareType.UnstructuredFareCalc createFareTypeUnstructuredFareCalc() {
        return new FareType.UnstructuredFareCalc();
    }

    /**
     * Create an instance of {@link FareType.Fees.Fee }
     * 
     */
    public FareType.Fees.Fee createFareTypeFeesFee() {
        return new FareType.Fees.Fee();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation }
     * 
     */
    public VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation createVehicleLocationAdditionalDetailsTypeOneWayDropLocationsOneWayDropLocation() {
        return new VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo }
     * 
     */
    public VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo createVehicleLocationAdditionalDetailsTypeShuttleShuttleInfosShuttleInfo() {
        return new VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords.Keyword }
     * 
     */
    public VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords.Keyword createVehicleLocationAdditionalDetailsTypeVehRentLocInfosVehRentLocInfoKeywordsKeyword() {
        return new VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords.Keyword();
    }

    /**
     * Create an instance of {@link PaymentResponseType.PaymentAmount }
     * 
     */
    public PaymentResponseType.PaymentAmount createPaymentResponseTypePaymentAmount() {
        return new PaymentResponseType.PaymentAmount();
    }

    /**
     * Create an instance of {@link ItineraryItemRequestType.RentalCar }
     * 
     */
    public ItineraryItemRequestType.RentalCar createItineraryItemRequestTypeRentalCar() {
        return new ItineraryItemRequestType.RentalCar();
    }

    /**
     * Create an instance of {@link AreaInfoType.RefPoints }
     * 
     */
    public AreaInfoType.RefPoints createAreaInfoTypeRefPoints() {
        return new AreaInfoType.RefPoints();
    }

    /**
     * Create an instance of {@link AreaInfoType.OtherHotels.OtherHotel }
     * 
     */
    public AreaInfoType.OtherHotels.OtherHotel createAreaInfoTypeOtherHotelsOtherHotel() {
        return new AreaInfoType.OtherHotels.OtherHotel();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations.Recreation.MultimediaDescriptions }
     * 
     */
    public AreaInfoType.Recreations.Recreation.MultimediaDescriptions createAreaInfoTypeRecreationsRecreationMultimediaDescriptions() {
        return new AreaInfoType.Recreations.Recreation.MultimediaDescriptions();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations.Recreation.RecreationDetails.RecreationDetail }
     * 
     */
    public AreaInfoType.Recreations.Recreation.RecreationDetails.RecreationDetail createAreaInfoTypeRecreationsRecreationRecreationDetailsRecreationDetail() {
        return new AreaInfoType.Recreations.Recreation.RecreationDetails.RecreationDetail();
    }

    /**
     * Create an instance of {@link AreaInfoType.Attractions.Attraction.Contact }
     * 
     */
    public AreaInfoType.Attractions.Attraction.Contact createAreaInfoTypeAttractionsAttractionContact() {
        return new AreaInfoType.Attractions.Attraction.Contact();
    }

    /**
     * Create an instance of {@link RefPointsType.RefPoint.Descriptions }
     * 
     */
    public RefPointsType.RefPoint.Descriptions createRefPointsTypeRefPointDescriptions() {
        return new RefPointsType.RefPoint.Descriptions();
    }

    /**
     * Create an instance of {@link FormattedTextSubSectionType.Paragraph }
     * 
     */
    public FormattedTextSubSectionType.Paragraph createFormattedTextSubSectionTypeParagraph() {
        return new FormattedTextSubSectionType.Paragraph();
    }

    /**
     * Create an instance of {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos.AddlDriverInfo }
     * 
     */
    public VehicleAdditionalDriverRequirementsType.AddlDriverInfos.AddlDriverInfo createVehicleAdditionalDriverRequirementsTypeAddlDriverInfosAddlDriverInfo() {
        return new VehicleAdditionalDriverRequirementsType.AddlDriverInfos.AddlDriverInfo();
    }

    /**
     * Create an instance of {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles.Vehicle }
     * 
     */
    public VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles.Vehicle createVehicleAdditionalDriverRequirementsTypeAddlDriverInfosVehiclesVehicle() {
        return new VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles.Vehicle();
    }

    /**
     * Create an instance of {@link AllowanceType.TicketBox }
     * 
     */
    public AllowanceType.TicketBox createAllowanceTypeTicketBox() {
        return new AllowanceType.TicketBox();
    }

    /**
     * Create an instance of {@link AllowanceType.BookingInstructions.UpgradeMethod }
     * 
     */
    public AllowanceType.BookingInstructions.UpgradeMethod createAllowanceTypeBookingInstructionsUpgradeMethod() {
        return new AllowanceType.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardIssuerName }
     * 
     */
    public PaymentCardType.CardIssuerName createPaymentCardTypeCardIssuerName() {
        return new PaymentCardType.CardIssuerName();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardHolderTelephone }
     * 
     */
    public PaymentCardType.CardHolderTelephone createPaymentCardTypeCardHolderTelephone() {
        return new PaymentCardType.CardHolderTelephone();
    }

    /**
     * Create an instance of {@link PaymentCardType.CustLoyalty }
     * 
     */
    public PaymentCardType.CustLoyalty createPaymentCardTypeCustLoyalty() {
        return new PaymentCardType.CustLoyalty();
    }

    /**
     * Create an instance of {@link PaymentCardType.ThreeDomainSecurity.Results }
     * 
     */
    public PaymentCardType.ThreeDomainSecurity.Results createPaymentCardTypeThreeDomainSecurityResults() {
        return new PaymentCardType.ThreeDomainSecurity.Results();
    }

    /**
     * Create an instance of {@link PaymentCardType.ThreeDomainSecurity.Gateway.AuthenticationVerificationValue }
     * 
     */
    public PaymentCardType.ThreeDomainSecurity.Gateway.AuthenticationVerificationValue createPaymentCardTypeThreeDomainSecurityGatewayAuthenticationVerificationValue() {
        return new PaymentCardType.ThreeDomainSecurity.Gateway.AuthenticationVerificationValue();
    }

    /**
     * Create an instance of {@link PaymentCardType.ThreeDomainSecurity.Gateway.TransactionPassword }
     * 
     */
    public PaymentCardType.ThreeDomainSecurity.Gateway.TransactionPassword createPaymentCardTypeThreeDomainSecurityGatewayTransactionPassword() {
        return new PaymentCardType.ThreeDomainSecurity.Gateway.TransactionPassword();
    }

    /**
     * Create an instance of {@link CruiseReservationType.PaymentsDue.PaymentDue }
     * 
     */
    public CruiseReservationType.PaymentsDue.PaymentDue createCruiseReservationTypePaymentsDuePaymentDue() {
        return new CruiseReservationType.PaymentsDue.PaymentDue();
    }

    /**
     * Create an instance of {@link BundleAttributesType.Attribute }
     * 
     */
    public BundleAttributesType.Attribute createBundleAttributesTypeAttribute() {
        return new BundleAttributesType.Attribute();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.PickUpReturnDetails }
     * 
     */
    public VehicleRentalTransactionType.PickUpReturnDetails createVehicleRentalTransactionTypePickUpReturnDetails() {
        return new VehicleRentalTransactionType.PickUpReturnDetails();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.Vehicle }
     * 
     */
    public VehicleRentalTransactionType.Vehicle createVehicleRentalTransactionTypeVehicle() {
        return new VehicleRentalTransactionType.Vehicle();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.Fees }
     * 
     */
    public VehicleRentalTransactionType.Fees createVehicleRentalTransactionTypeFees() {
        return new VehicleRentalTransactionType.Fees();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.TotalCharge }
     * 
     */
    public VehicleRentalTransactionType.TotalCharge createVehicleRentalTransactionTypeTotalCharge() {
        return new VehicleRentalTransactionType.TotalCharge();
    }

    /**
     * Create an instance of {@link VehicleRentalTransactionType.PricedEquips.PricedEquip.Equipment }
     * 
     */
    public VehicleRentalTransactionType.PricedEquips.PricedEquip.Equipment createVehicleRentalTransactionTypePricedEquipsPricedEquipEquipment() {
        return new VehicleRentalTransactionType.PricedEquips.PricedEquip.Equipment();
    }

    /**
     * Create an instance of {@link SuperPNRActionsType.OJSuperPNRAction }
     * 
     */
    public SuperPNRActionsType.OJSuperPNRAction createSuperPNRActionsTypeOJSuperPNRAction() {
        return new SuperPNRActionsType.OJSuperPNRAction();
    }

    /**
     * Create an instance of {@link UserInputResponseType.UserText }
     * 
     */
    public UserInputResponseType.UserText createUserInputResponseTypeUserText() {
        return new UserInputResponseType.UserText();
    }

    /**
     * Create an instance of {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Departure }
     * 
     */
    public UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Departure createUserInputResponseTypeUserChoicesFlightOptionsFlightSegmentDeparture() {
        return new UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Departure();
    }

    /**
     * Create an instance of {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Arrival }
     * 
     */
    public UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Arrival createUserInputResponseTypeUserChoicesFlightOptionsFlightSegmentArrival() {
        return new UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Arrival();
    }

    /**
     * Create an instance of {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Carrier }
     * 
     */
    public UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Carrier createUserInputResponseTypeUserChoicesFlightOptionsFlightSegmentCarrier() {
        return new UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Carrier();
    }

    /**
     * Create an instance of {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.StopInformation }
     * 
     */
    public UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.StopInformation createUserInputResponseTypeUserChoicesFlightOptionsFlightSegmentStopInformation() {
        return new UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.StopInformation();
    }

    /**
     * Create an instance of {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes.ClassOfService }
     * 
     */
    public UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes.ClassOfService createUserInputResponseTypeUserChoicesFlightOptionsFlightSegmentClassesClassOfService() {
        return new UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes.ClassOfService();
    }

    /**
     * Create an instance of {@link EMDType.TravelerRefNumber }
     * 
     */
    public EMDType.TravelerRefNumber createEMDTypeTravelerRefNumber() {
        return new EMDType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link EMDType.OriginDestination }
     * 
     */
    public EMDType.OriginDestination createEMDTypeOriginDestination() {
        return new EMDType.OriginDestination();
    }

    /**
     * Create an instance of {@link EMDType.CustLoyalty }
     * 
     */
    public EMDType.CustLoyalty createEMDTypeCustLoyalty() {
        return new EMDType.CustLoyalty();
    }

    /**
     * Create an instance of {@link EMDType.Endorsement }
     * 
     */
    public EMDType.Endorsement createEMDTypeEndorsement() {
        return new EMDType.Endorsement();
    }

    /**
     * Create an instance of {@link EMDType.BaseFare }
     * 
     */
    public EMDType.BaseFare createEMDTypeBaseFare() {
        return new EMDType.BaseFare();
    }

    /**
     * Create an instance of {@link EMDType.EquivFare }
     * 
     */
    public EMDType.EquivFare createEMDTypeEquivFare() {
        return new EMDType.EquivFare();
    }

    /**
     * Create an instance of {@link EMDType.TotalFare }
     * 
     */
    public EMDType.TotalFare createEMDTypeTotalFare() {
        return new EMDType.TotalFare();
    }

    /**
     * Create an instance of {@link EMDType.UnstructuredFareCalc }
     * 
     */
    public EMDType.UnstructuredFareCalc createEMDTypeUnstructuredFareCalc() {
        return new EMDType.UnstructuredFareCalc();
    }

    /**
     * Create an instance of {@link EMDType.FareInfo }
     * 
     */
    public EMDType.FareInfo createEMDTypeFareInfo() {
        return new EMDType.FareInfo();
    }

    /**
     * Create an instance of {@link EMDType.Commission }
     * 
     */
    public EMDType.Commission createEMDTypeCommission() {
        return new EMDType.Commission();
    }

    /**
     * Create an instance of {@link EMDType.OriginalIssueInfo }
     * 
     */
    public EMDType.OriginalIssueInfo createEMDTypeOriginalIssueInfo() {
        return new EMDType.OriginalIssueInfo();
    }

    /**
     * Create an instance of {@link EMDType.ReissuedFlown }
     * 
     */
    public EMDType.ReissuedFlown createEMDTypeReissuedFlown() {
        return new EMDType.ReissuedFlown();
    }

    /**
     * Create an instance of {@link EMDType.PresentInfo }
     * 
     */
    public EMDType.PresentInfo createEMDTypePresentInfo() {
        return new EMDType.PresentInfo();
    }

    /**
     * Create an instance of {@link EMDType.ReasonForIssuance }
     * 
     */
    public EMDType.ReasonForIssuance createEMDTypeReasonForIssuance() {
        return new EMDType.ReasonForIssuance();
    }

    /**
     * Create an instance of {@link EMDType.ValidatingAirline }
     * 
     */
    public EMDType.ValidatingAirline createEMDTypeValidatingAirline() {
        return new EMDType.ValidatingAirline();
    }

    /**
     * Create an instance of {@link EMDType.TaxCouponInformation.TicketDocument.CouponNumber.TaxCouponInfo }
     * 
     */
    public EMDType.TaxCouponInformation.TicketDocument.CouponNumber.TaxCouponInfo createEMDTypeTaxCouponInformationTicketDocumentCouponNumberTaxCouponInfo() {
        return new EMDType.TaxCouponInformation.TicketDocument.CouponNumber.TaxCouponInfo();
    }

    /**
     * Create an instance of {@link EMDType.TaxCouponInformation.TicketDocument.CouponNumber.UnticketedPointInfo }
     * 
     */
    public EMDType.TaxCouponInformation.TicketDocument.CouponNumber.UnticketedPointInfo createEMDTypeTaxCouponInformationTicketDocumentCouponNumberUnticketedPointInfo() {
        return new EMDType.TaxCouponInformation.TicketDocument.CouponNumber.UnticketedPointInfo();
    }

    /**
     * Create an instance of {@link FareComponentType.TotalConstructionAmount }
     * 
     */
    public FareComponentType.TotalConstructionAmount createFareComponentTypeTotalConstructionAmount() {
        return new FareComponentType.TotalConstructionAmount();
    }

    /**
     * Create an instance of {@link EMDType.ExchResidualFareComponent.Taxes }
     * 
     */
    public EMDType.ExchResidualFareComponent.Taxes createEMDTypeExchResidualFareComponentTaxes() {
        return new EMDType.ExchResidualFareComponent.Taxes();
    }

    /**
     * Create an instance of {@link EMDType.ExchResidualFareComponent.TotalAmount }
     * 
     */
    public EMDType.ExchResidualFareComponent.TotalAmount createEMDTypeExchResidualFareComponentTotalAmount() {
        return new EMDType.ExchResidualFareComponent.TotalAmount();
    }

    /**
     * Create an instance of {@link FareComponentType.PriceableUnit.FareComponentDetail.CouponSequence }
     * 
     */
    public FareComponentType.PriceableUnit.FareComponentDetail.CouponSequence createFareComponentTypePriceableUnitFareComponentDetailCouponSequence() {
        return new FareComponentType.PriceableUnit.FareComponentDetail.CouponSequence();
    }

    /**
     * Create an instance of {@link FareComponentType.PriceableUnit.FareComponentDetail.ConstructionPrinciple }
     * 
     */
    public FareComponentType.PriceableUnit.FareComponentDetail.ConstructionPrinciple createFareComponentTypePriceableUnitFareComponentDetailConstructionPrinciple() {
        return new FareComponentType.PriceableUnit.FareComponentDetail.ConstructionPrinciple();
    }

    /**
     * Create an instance of {@link FareComponentType.PriceableUnit.FareComponentDetail.BaseAmount }
     * 
     */
    public FareComponentType.PriceableUnit.FareComponentDetail.BaseAmount createFareComponentTypePriceableUnitFareComponentDetailBaseAmount() {
        return new FareComponentType.PriceableUnit.FareComponentDetail.BaseAmount();
    }

    /**
     * Create an instance of {@link FareComponentType.PriceableUnit.FareComponentDetail.TicketDesignator }
     * 
     */
    public FareComponentType.PriceableUnit.FareComponentDetail.TicketDesignator createFareComponentTypePriceableUnitFareComponentDetailTicketDesignator() {
        return new FareComponentType.PriceableUnit.FareComponentDetail.TicketDesignator();
    }

    /**
     * Create an instance of {@link EMDType.CarrierFeeInfo.Taxes }
     * 
     */
    public EMDType.CarrierFeeInfo.Taxes createEMDTypeCarrierFeeInfoTaxes() {
        return new EMDType.CarrierFeeInfo.Taxes();
    }

    /**
     * Create an instance of {@link EMDType.CarrierFeeInfo.CarrierFee.FeeAmount }
     * 
     */
    public EMDType.CarrierFeeInfo.CarrierFee.FeeAmount createEMDTypeCarrierFeeInfoCarrierFeeFeeAmount() {
        return new EMDType.CarrierFeeInfo.CarrierFee.FeeAmount();
    }

    /**
     * Create an instance of {@link EMDType.TicketDocument.CouponInfo.ExcessBaggage }
     * 
     */
    public EMDType.TicketDocument.CouponInfo.ExcessBaggage createEMDTypeTicketDocumentCouponInfoExcessBaggage() {
        return new EMDType.TicketDocument.CouponInfo.ExcessBaggage();
    }

    /**
     * Create an instance of {@link EMDType.TicketDocument.CouponInfo.PresentInfo }
     * 
     */
    public EMDType.TicketDocument.CouponInfo.PresentInfo createEMDTypeTicketDocumentCouponInfoPresentInfo() {
        return new EMDType.TicketDocument.CouponInfo.PresentInfo();
    }

    /**
     * Create an instance of {@link EMDType.TicketDocument.CouponInfo.ReasonForIssuance }
     * 
     */
    public EMDType.TicketDocument.CouponInfo.ReasonForIssuance createEMDTypeTicketDocumentCouponInfoReasonForIssuance() {
        return new EMDType.TicketDocument.CouponInfo.ReasonForIssuance();
    }

    /**
     * Create an instance of {@link EMDType.TicketDocument.CouponInfo.ValidatingAirline }
     * 
     */
    public EMDType.TicketDocument.CouponInfo.ValidatingAirline createEMDTypeTicketDocumentCouponInfoValidatingAirline() {
        return new EMDType.TicketDocument.CouponInfo.ValidatingAirline();
    }

    /**
     * Create an instance of {@link EMDType.TicketDocument.CouponInfo.FiledFeeInfo }
     * 
     */
    public EMDType.TicketDocument.CouponInfo.FiledFeeInfo createEMDTypeTicketDocumentCouponInfoFiledFeeInfo() {
        return new EMDType.TicketDocument.CouponInfo.FiledFeeInfo();
    }

    /**
     * Create an instance of {@link ETFareInfo.Waiver }
     * 
     */
    public ETFareInfo.Waiver createETFareInfoWaiver() {
        return new ETFareInfo.Waiver();
    }

    /**
     * Create an instance of {@link ETFareInfo.RuleIndicator }
     * 
     */
    public ETFareInfo.RuleIndicator createETFareInfoRuleIndicator() {
        return new ETFareInfo.RuleIndicator();
    }

    /**
     * Create an instance of {@link EMDType.Taxes.Tax }
     * 
     */
    public EMDType.Taxes.Tax createEMDTypeTaxesTax() {
        return new EMDType.Taxes.Tax();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Module.Products.Product }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Module.Products.Product createModuleProductsProduct() {
        return new com.airchina.datacenter.spnr.sdk.entity.Module.Products.Product();
    }

    /**
     * Create an instance of {@link BrandControlRuleInfoType.SaleDateRange }
     * 
     */
    public BrandControlRuleInfoType.SaleDateRange createBrandControlRuleInfoTypeSaleDateRange() {
        return new BrandControlRuleInfoType.SaleDateRange();
    }

    /**
     * Create an instance of {@link RowDetailsType.AirRowCharacteristics }
     * 
     */
    public RowDetailsType.AirRowCharacteristics createRowDetailsTypeAirRowCharacteristics() {
        return new RowDetailsType.AirRowCharacteristics();
    }

    /**
     * Create an instance of {@link RowDetailsType.AirSeats.AirSeat }
     * 
     */
    public RowDetailsType.AirSeats.AirSeat createRowDetailsTypeAirSeatsAirSeat() {
        return new RowDetailsType.AirSeats.AirSeat();
    }

    /**
     * Create an instance of {@link OrdersType.Order.Products.Product }
     * 
     */
    public OrdersType.Order.Products.Product createOrdersTypeOrderProductsProduct() {
        return new OrdersType.Order.Products.Product();
    }

    /**
     * Create an instance of {@link ProductDescriptionsType.ProductDescription }
     * 
     */
    public ProductDescriptionsType.ProductDescription createProductDescriptionsTypeProductDescription() {
        return new ProductDescriptionsType.ProductDescription();
    }

    /**
     * Create an instance of {@link ProductBiasList.Product.Module }
     * 
     */
    public ProductBiasList.Product.Module createProductBiasListProductModule() {
        return new ProductBiasList.Product.Module();
    }

    /**
     * Create an instance of {@link RecipientInfosType.RecipientInfo.ShippingInfo }
     * 
     */
    public RecipientInfosType.RecipientInfo.ShippingInfo createRecipientInfosTypeRecipientInfoShippingInfo() {
        return new RecipientInfosType.RecipientInfo.ShippingInfo();
    }

    /**
     * Create an instance of {@link RecipientInfosType.RecipientInfo.Comments }
     * 
     */
    public RecipientInfosType.RecipientInfo.Comments createRecipientInfosTypeRecipientInfoComments() {
        return new RecipientInfosType.RecipientInfo.Comments();
    }

    /**
     * Create an instance of {@link OntologyPaymentType.TotalTripPrice }
     * 
     */
    public OntologyPaymentType.TotalTripPrice createOntologyPaymentTypeTotalTripPrice() {
        return new OntologyPaymentType.TotalTripPrice();
    }

    /**
     * Create an instance of {@link OntologyPaymentType.PaymentStatus }
     * 
     */
    public OntologyPaymentType.PaymentStatus createOntologyPaymentTypePaymentStatus() {
        return new OntologyPaymentType.PaymentStatus();
    }

    /**
     * Create an instance of {@link OntologyPaymentType.PaymentMethod }
     * 
     */
    public OntologyPaymentType.PaymentMethod createOntologyPaymentTypePaymentMethod() {
        return new OntologyPaymentType.PaymentMethod();
    }

    /**
     * Create an instance of {@link OntologyPaymentType.CardType }
     * 
     */
    public OntologyPaymentType.CardType createOntologyPaymentTypeCardType() {
        return new OntologyPaymentType.CardType();
    }

    /**
     * Create an instance of {@link OntologyPaymentType.CardIssuer }
     * 
     */
    public OntologyPaymentType.CardIssuer createOntologyPaymentTypeCardIssuer() {
        return new OntologyPaymentType.CardIssuer();
    }

    /**
     * Create an instance of {@link OntologyPaymentType.Rate.Category }
     * 
     */
    public OntologyPaymentType.Rate.Category createOntologyPaymentTypeRateCategory() {
        return new OntologyPaymentType.Rate.Category();
    }

    /**
     * Create an instance of {@link OntologyPaymentType.Rate.Code }
     * 
     */
    public OntologyPaymentType.Rate.Code createOntologyPaymentTypeRateCode() {
        return new OntologyPaymentType.Rate.Code();
    }

    /**
     * Create an instance of {@link ItemType.SubAllocation }
     * 
     */
    public ItemType.SubAllocation createItemTypeSubAllocation() {
        return new ItemType.SubAllocation();
    }

    /**
     * Create an instance of {@link ItemType.HotelStay }
     * 
     */
    public ItemType.HotelStay createItemTypeHotelStay() {
        return new ItemType.HotelStay();
    }

    /**
     * Create an instance of {@link ItemType.ItemReferences }
     * 
     */
    public ItemType.ItemReferences createItemTypeItemReferences() {
        return new ItemType.ItemReferences();
    }

    /**
     * Create an instance of {@link ItemType.Vehicles }
     * 
     */
    public ItemType.Vehicles createItemTypeVehicles() {
        return new ItemType.Vehicles();
    }

    /**
     * Create an instance of {@link ItemType.ItemQuantities.ItemQuantity }
     * 
     */
    public ItemType.ItemQuantities.ItemQuantity createItemTypeItemQuantitiesItemQuantity() {
        return new ItemType.ItemQuantities.ItemQuantity();
    }

    /**
     * Create an instance of {@link CoverageLimitType.Deductible }
     * 
     */
    public CoverageLimitType.Deductible createCoverageLimitTypeDeductible() {
        return new CoverageLimitType.Deductible();
    }

    /**
     * Create an instance of {@link CoverageLimitType.PolicyLimit }
     * 
     */
    public CoverageLimitType.PolicyLimit createCoverageLimitTypePolicyLimit() {
        return new CoverageLimitType.PolicyLimit();
    }

    /**
     * Create an instance of {@link CoverageLimitType.IndividualLimit }
     * 
     */
    public CoverageLimitType.IndividualLimit createCoverageLimitTypeIndividualLimit() {
        return new CoverageLimitType.IndividualLimit();
    }

    /**
     * Create an instance of {@link CostingItemType.UnitCost }
     * 
     */
    public CostingItemType.UnitCost createCostingItemTypeUnitCost() {
        return new CostingItemType.UnitCost();
    }

    /**
     * Create an instance of {@link CostingItemType.ExtendedCost }
     * 
     */
    public CostingItemType.ExtendedCost createCostingItemTypeExtendedCost() {
        return new CostingItemType.ExtendedCost();
    }

    /**
     * Create an instance of {@link CostingItemType.Commission }
     * 
     */
    public CostingItemType.Commission createCostingItemTypeCommission() {
        return new CostingItemType.Commission();
    }

    /**
     * Create an instance of {@link AssociatedProductsType.AssociatedProduct }
     * 
     */
    public AssociatedProductsType.AssociatedProduct createAssociatedProductsTypeAssociatedProduct() {
        return new AssociatedProductsType.AssociatedProduct();
    }

    /**
     * Create an instance of {@link SPNRPricingType.ReportingExchangeRates }
     * 
     */
    public SPNRPricingType.ReportingExchangeRates createSPNRPricingTypeReportingExchangeRates() {
        return new SPNRPricingType.ReportingExchangeRates();
    }

    /**
     * Create an instance of {@link SPNRPricingType.PostPayTotal }
     * 
     */
    public SPNRPricingType.PostPayTotal createSPNRPricingTypePostPayTotal() {
        return new SPNRPricingType.PostPayTotal();
    }

    /**
     * Create an instance of {@link SPNRPricingType.PrePayTotal }
     * 
     */
    public SPNRPricingType.PrePayTotal createSPNRPricingTypePrePayTotal() {
        return new SPNRPricingType.PrePayTotal();
    }

    /**
     * Create an instance of {@link SPNRPricingType.PriceAdjustments }
     * 
     */
    public SPNRPricingType.PriceAdjustments createSPNRPricingTypePriceAdjustments() {
        return new SPNRPricingType.PriceAdjustments();
    }

    /**
     * Create an instance of {@link SPNRPricingType.TotalPrice }
     * 
     */
    public SPNRPricingType.TotalPrice createSPNRPricingTypeTotalPrice() {
        return new SPNRPricingType.TotalPrice();
    }

    /**
     * Create an instance of {@link TravelerRPHs.TravelerRPH }
     * 
     */
    public TravelerRPHs.TravelerRPH createTravelerRPHsTravelerRPH() {
        return new TravelerRPHs.TravelerRPH();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.Descriptions }
     * 
     */
    public AffiliationInfoType.Descriptions createAffiliationInfoTypeDescriptions() {
        return new AffiliationInfoType.Descriptions();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.PartnerInfos.PartnerInfo }
     * 
     */
    public AffiliationInfoType.PartnerInfos.PartnerInfo createAffiliationInfoTypePartnerInfosPartnerInfo() {
        return new AffiliationInfoType.PartnerInfos.PartnerInfo();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.Awards.Award }
     * 
     */
    public AffiliationInfoType.Awards.Award createAffiliationInfoTypeAwardsAward() {
        return new AffiliationInfoType.Awards.Award();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramDescription }
     * 
     */
    public AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramDescription createAffiliationInfoTypeLoyalProgramsLoyalProgramProgramDescription() {
        return new AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramDescription();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramRestriction }
     * 
     */
    public AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramRestriction createAffiliationInfoTypeLoyalProgramsLoyalProgramProgramRestriction() {
        return new AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramRestriction();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.Brands.Brand }
     * 
     */
    public AffiliationInfoType.Brands.Brand createAffiliationInfoTypeBrandsBrand() {
        return new AffiliationInfoType.Brands.Brand();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.DistribSystems.DistribSystem.HotelCodes }
     * 
     */
    public AffiliationInfoType.DistribSystems.DistribSystem.HotelCodes createAffiliationInfoTypeDistribSystemsDistribSystemHotelCodes() {
        return new AffiliationInfoType.DistribSystems.DistribSystem.HotelCodes();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.DistribSystems.DistribSystem.Priorities.Priority }
     * 
     */
    public AffiliationInfoType.DistribSystems.DistribSystem.Priorities.Priority createAffiliationInfoTypeDistribSystemsDistribSystemPrioritiesPriority() {
        return new AffiliationInfoType.DistribSystems.DistribSystem.Priorities.Priority();
    }

    /**
     * Create an instance of {@link AirAncillaryBundleProductType.TravelerInfo }
     * 
     */
    public AirAncillaryBundleProductType.TravelerInfo createAirAncillaryBundleProductTypeTravelerInfo() {
        return new AirAncillaryBundleProductType.TravelerInfo();
    }

    /**
     * Create an instance of {@link AirAncillaryBundleProductType.PassengerTypes.PassengerType }
     * 
     */
    public AirAncillaryBundleProductType.PassengerTypes.PassengerType createAirAncillaryBundleProductTypePassengerTypesPassengerType() {
        return new AirAncillaryBundleProductType.PassengerTypes.PassengerType();
    }

    /**
     * Create an instance of {@link PlanRestrictionType.PlanRestriction }
     * 
     */
    public PlanRestrictionType.PlanRestriction createPlanRestrictionTypePlanRestriction() {
        return new PlanRestrictionType.PlanRestriction();
    }

    /**
     * Create an instance of {@link SpecificFlightInfoType.SearchDeadline }
     * 
     */
    public SpecificFlightInfoType.SearchDeadline createSpecificFlightInfoTypeSearchDeadline() {
        return new SpecificFlightInfoType.SearchDeadline();
    }

    /**
     * Create an instance of {@link SpecificFlightInfoType.BookingClassPref.AssociatedBrands.AssociatedBrand }
     * 
     */
    public SpecificFlightInfoType.BookingClassPref.AssociatedBrands.AssociatedBrand createSpecificFlightInfoTypeBookingClassPrefAssociatedBrandsAssociatedBrand() {
        return new SpecificFlightInfoType.BookingClassPref.AssociatedBrands.AssociatedBrand();
    }

    /**
     * Create an instance of {@link PricedItineraryType.AirItineraryPricingInfo }
     * 
     */
    public PricedItineraryType.AirItineraryPricingInfo createPricedItineraryTypeAirItineraryPricingInfo() {
        return new PricedItineraryType.AirItineraryPricingInfo();
    }

    /**
     * Create an instance of {@link PricedItineraryType.Notes.Note }
     * 
     */
    public PricedItineraryType.Notes.Note createPricedItineraryTypeNotesNote() {
        return new PricedItineraryType.Notes.Note();
    }

    /**
     * Create an instance of {@link SpecialSrvcSSRType.Description }
     * 
     */
    public SpecialSrvcSSRType.Description createSpecialSrvcSSRTypeDescription() {
        return new SpecialSrvcSSRType.Description();
    }

    /**
     * Create an instance of {@link CommentType.Comment }
     * 
     */
    public CommentType.Comment createCommentTypeComment() {
        return new CommentType.Comment();
    }

    /**
     * Create an instance of {@link PageviewType.Pageview.TargetPage }
     * 
     */
    public PageviewType.Pageview.TargetPage createPageviewTypePageviewTargetPage() {
        return new PageviewType.Pageview.TargetPage();
    }

    /**
     * Create an instance of {@link PageviewType.Pageview.Source }
     * 
     */
    public PageviewType.Pageview.Source createPageviewTypePageviewSource() {
        return new PageviewType.Pageview.Source();
    }

    /**
     * Create an instance of {@link SpecialSrvcOtherType.Description }
     * 
     */
    public SpecialSrvcOtherType.Description createSpecialSrvcOtherTypeDescription() {
        return new SpecialSrvcOtherType.Description();
    }

    /**
     * Create an instance of {@link WeChatMessageType.Template }
     * 
     */
    public WeChatMessageType.Template createWeChatMessageTypeTemplate() {
        return new WeChatMessageType.Template();
    }

    /**
     * Create an instance of {@link VoluntaryChangesType.Penalty }
     * 
     */
    public VoluntaryChangesType.Penalty createVoluntaryChangesTypePenalty() {
        return new VoluntaryChangesType.Penalty();
    }

    /**
     * Create an instance of {@link PenaltyCoreType.FeeApplies }
     * 
     */
    public PenaltyCoreType.FeeApplies createPenaltyCoreTypeFeeApplies() {
        return new PenaltyCoreType.FeeApplies();
    }

    /**
     * Create an instance of {@link PenaltyCoreType.Cancel.Amount }
     * 
     */
    public PenaltyCoreType.Cancel.Amount createPenaltyCoreTypeCancelAmount() {
        return new PenaltyCoreType.Cancel.Amount();
    }

    /**
     * Create an instance of {@link PenaltyCoreType.Change.Amount }
     * 
     */
    public PenaltyCoreType.Change.Amount createPenaltyCoreTypeChangeAmount() {
        return new PenaltyCoreType.Change.Amount();
    }

    /**
     * Create an instance of {@link TaxCollectionType.CollectionPoint }
     * 
     */
    public TaxCollectionType.CollectionPoint createTaxCollectionTypeCollectionPoint() {
        return new TaxCollectionType.CollectionPoint();
    }

    /**
     * Create an instance of {@link AdjustmentsType.Adjustment }
     * 
     */
    public AdjustmentsType.Adjustment createAdjustmentsTypeAdjustment() {
        return new AdjustmentsType.Adjustment();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Unit }
     * 
     */
    public CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Unit createCodeListFeeTypeTaxesQualifiersChargeUnitUnit() {
        return new CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Unit();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Frequency }
     * 
     */
    public CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Frequency createCodeListFeeTypeTaxesQualifiersChargeUnitFrequency() {
        return new CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Frequency();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Taxes.Amount.Currency }
     * 
     */
    public CodeListFeeType.Taxes.Amount.Currency createCodeListFeeTypeTaxesAmountCurrency() {
        return new CodeListFeeType.Taxes.Amount.Currency();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Taxes.Amount.AlternateCurrency }
     * 
     */
    public CodeListFeeType.Taxes.Amount.AlternateCurrency createCodeListFeeTypeTaxesAmountAlternateCurrency() {
        return new CodeListFeeType.Taxes.Amount.AlternateCurrency();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Qualifiers.ChargeUnit.Unit }
     * 
     */
    public CodeListFeeType.Qualifiers.ChargeUnit.Unit createCodeListFeeTypeQualifiersChargeUnitUnit() {
        return new CodeListFeeType.Qualifiers.ChargeUnit.Unit();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Qualifiers.ChargeUnit.Frequency }
     * 
     */
    public CodeListFeeType.Qualifiers.ChargeUnit.Frequency createCodeListFeeTypeQualifiersChargeUnitFrequency() {
        return new CodeListFeeType.Qualifiers.ChargeUnit.Frequency();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Amount.Currency }
     * 
     */
    public CodeListFeeType.Amount.Currency createCodeListFeeTypeAmountCurrency() {
        return new CodeListFeeType.Amount.Currency();
    }

    /**
     * Create an instance of {@link CodeListFeeType.Amount.AlternateCurrency }
     * 
     */
    public CodeListFeeType.Amount.AlternateCurrency createCodeListFeeTypeAmountAlternateCurrency() {
        return new CodeListFeeType.Amount.AlternateCurrency();
    }

    /**
     * Create an instance of {@link PhonePrefType.Telephone }
     * 
     */
    public PhonePrefType.Telephone createPhonePrefTypeTelephone() {
        return new PhonePrefType.Telephone();
    }

    /**
     * Create an instance of {@link ServiceItemNoPriceRefType.Endorsement }
     * 
     */
    public ServiceItemNoPriceRefType.Endorsement createServiceItemNoPriceRefTypeEndorsement() {
        return new ServiceItemNoPriceRefType.Endorsement();
    }

    /**
     * Create an instance of {@link ServiceItemNoPriceRefType.BookingInstructions.UpgradeMethod }
     * 
     */
    public ServiceItemNoPriceRefType.BookingInstructions.UpgradeMethod createServiceItemNoPriceRefTypeBookingInstructionsUpgradeMethod() {
        return new ServiceItemNoPriceRefType.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link RailAccommDetailType.Compartment }
     * 
     */
    public RailAccommDetailType.Compartment createRailAccommDetailTypeCompartment() {
        return new RailAccommDetailType.Compartment();
    }

    /**
     * Create an instance of {@link RailAccommDetailType.Car }
     * 
     */
    public RailAccommDetailType.Car createRailAccommDetailTypeCar() {
        return new RailAccommDetailType.Car();
    }

    /**
     * Create an instance of {@link StayRestrictionsType.MinimumStay }
     * 
     */
    public StayRestrictionsType.MinimumStay createStayRestrictionsTypeMinimumStay() {
        return new StayRestrictionsType.MinimumStay();
    }

    /**
     * Create an instance of {@link StayRestrictionsType.MaximumStay }
     * 
     */
    public StayRestrictionsType.MaximumStay createStayRestrictionsTypeMaximumStay() {
        return new StayRestrictionsType.MaximumStay();
    }

    /**
     * Create an instance of {@link GDSInfoType.GDSCodes.GDSCode.GDSCodeDetails.GDSCodeDetail }
     * 
     */
    public GDSInfoType.GDSCodes.GDSCode.GDSCodeDetails.GDSCodeDetail createGDSInfoTypeGDSCodesGDSCodeGDSCodeDetailsGDSCodeDetail() {
        return new GDSInfoType.GDSCodes.GDSCode.GDSCodeDetails.GDSCodeDetail();
    }

    /**
     * Create an instance of {@link TicketingInfoType.CouponInfo }
     * 
     */
    public TicketingInfoType.CouponInfo createTicketingInfoTypeCouponInfo() {
        return new TicketingInfoType.CouponInfo();
    }

    /**
     * Create an instance of {@link TicketingInfoType.Remarks }
     * 
     */
    public TicketingInfoType.Remarks createTicketingInfoTypeRemarks() {
        return new TicketingInfoType.Remarks();
    }

    /**
     * Create an instance of {@link TicketingInfoType.CheckInInfo.Notes.Note }
     * 
     */
    public TicketingInfoType.CheckInInfo.Notes.Note createTicketingInfoTypeCheckInInfoNotesNote() {
        return new TicketingInfoType.CheckInInfo.Notes.Note();
    }

    /**
     * Create an instance of {@link SpecialRequestType.SpecialRequest }
     * 
     */
    public SpecialRequestType.SpecialRequest createSpecialRequestTypeSpecialRequest() {
        return new SpecialRequestType.SpecialRequest();
    }

    /**
     * Create an instance of {@link RailPriceBreakdownType.AccommodationAdjustment }
     * 
     */
    public RailPriceBreakdownType.AccommodationAdjustment createRailPriceBreakdownTypeAccommodationAdjustment() {
        return new RailPriceBreakdownType.AccommodationAdjustment();
    }

    /**
     * Create an instance of {@link RailPriceBreakdownType.DiscountClass }
     * 
     */
    public RailPriceBreakdownType.DiscountClass createRailPriceBreakdownTypeDiscountClass() {
        return new RailPriceBreakdownType.DiscountClass();
    }

    /**
     * Create an instance of {@link OntologyLoyaltyType.Sector }
     * 
     */
    public OntologyLoyaltyType.Sector createOntologyLoyaltyTypeSector() {
        return new OntologyLoyaltyType.Sector();
    }

    /**
     * Create an instance of {@link OntologyLoyaltyType.ProgramNameOrCode }
     * 
     */
    public OntologyLoyaltyType.ProgramNameOrCode createOntologyLoyaltyTypeProgramNameOrCode() {
        return new OntologyLoyaltyType.ProgramNameOrCode();
    }

    /**
     * Create an instance of {@link OntologyLoyaltyType.MemberInfo }
     * 
     */
    public OntologyLoyaltyType.MemberInfo createOntologyLoyaltyTypeMemberInfo() {
        return new OntologyLoyaltyType.MemberInfo();
    }

    /**
     * Create an instance of {@link MarketingDataType.Message }
     * 
     */
    public MarketingDataType.Message createMarketingDataTypeMessage() {
        return new MarketingDataType.Message();
    }

    /**
     * Create an instance of {@link MarketingDataType.MediaContent.Images }
     * 
     */
    public MarketingDataType.MediaContent.Images createMarketingDataTypeMediaContentImages() {
        return new MarketingDataType.MediaContent.Images();
    }

    /**
     * Create an instance of {@link MarketingDataType.MediaContent.MediaLinks }
     * 
     */
    public MarketingDataType.MediaContent.MediaLinks createMarketingDataTypeMediaContentMediaLinks() {
        return new MarketingDataType.MediaContent.MediaLinks();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType.Vendor }
     * 
     */
    public VehicleSegmentCoreType.Vendor createVehicleSegmentCoreTypeVendor() {
        return new VehicleSegmentCoreType.Vendor();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType.PricedEquips }
     * 
     */
    public VehicleSegmentCoreType.PricedEquips createVehicleSegmentCoreTypePricedEquips() {
        return new VehicleSegmentCoreType.PricedEquips();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType.Fees }
     * 
     */
    public VehicleSegmentCoreType.Fees createVehicleSegmentCoreTypeFees() {
        return new VehicleSegmentCoreType.Fees();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType.TotalCharge }
     * 
     */
    public VehicleSegmentCoreType.TotalCharge createVehicleSegmentCoreTypeTotalCharge() {
        return new VehicleSegmentCoreType.TotalCharge();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType.Reference }
     * 
     */
    public VehicleSegmentCoreType.Reference createVehicleSegmentCoreTypeReference() {
        return new VehicleSegmentCoreType.Reference();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType.SpecialEquipPrefs.SpecialEquipPref }
     * 
     */
    public VehicleSegmentCoreType.SpecialEquipPrefs.SpecialEquipPref createVehicleSegmentCoreTypeSpecialEquipPrefsSpecialEquipPref() {
        return new VehicleSegmentCoreType.SpecialEquipPrefs.SpecialEquipPref();
    }

    /**
     * Create an instance of {@link SpecialSrvcPaxType.OtherType.TravelerIDRef }
     * 
     */
    public SpecialSrvcPaxType.OtherType.TravelerIDRef createSpecialSrvcPaxTypeOtherTypeTravelerIDRef() {
        return new SpecialSrvcPaxType.OtherType.TravelerIDRef();
    }

    /**
     * Create an instance of {@link SpecialSrvcPaxType.SSRType.TravelerIDRef }
     * 
     */
    public SpecialSrvcPaxType.SSRType.TravelerIDRef createSpecialSrvcPaxTypeSSRTypeTravelerIDRef() {
        return new SpecialSrvcPaxType.SSRType.TravelerIDRef();
    }

    /**
     * Create an instance of {@link AncillaryAvailBoundProductsType.AncillaryProducts.Flights.Flight }
     * 
     */
    public AncillaryAvailBoundProductsType.AncillaryProducts.Flights.Flight createAncillaryAvailBoundProductsTypeAncillaryProductsFlightsFlight() {
        return new AncillaryAvailBoundProductsType.AncillaryProducts.Flights.Flight();
    }

    /**
     * Create an instance of {@link PreferencesType.PrefCollection }
     * 
     */
    public PreferencesType.PrefCollection createPreferencesTypePrefCollection() {
        return new PreferencesType.PrefCollection();
    }

    /**
     * Create an instance of {@link VehicleLocationVehiclesType.Vehicle }
     * 
     */
    public VehicleLocationVehiclesType.Vehicle createVehicleLocationVehiclesTypeVehicle() {
        return new VehicleLocationVehiclesType.Vehicle();
    }

    /**
     * Create an instance of {@link VehicleLocationVehiclesType.VehicleInfos.VehicleInfo }
     * 
     */
    public VehicleLocationVehiclesType.VehicleInfos.VehicleInfo createVehicleLocationVehiclesTypeVehicleInfosVehicleInfo() {
        return new VehicleLocationVehiclesType.VehicleInfos.VehicleInfo();
    }

    /**
     * Create an instance of {@link AmendmentFeesType.AmendmentFee }
     * 
     */
    public AmendmentFeesType.AmendmentFee createAmendmentFeesTypeAmendmentFee() {
        return new AmendmentFeesType.AmendmentFee();
    }

    /**
     * Create an instance of {@link CouponsType.Pricing }
     * 
     */
    public CouponsType.Pricing createCouponsTypePricing() {
        return new CouponsType.Pricing();
    }

    /**
     * Create an instance of {@link CouponsType.PaymentDetails }
     * 
     */
    public CouponsType.PaymentDetails createCouponsTypePaymentDetails() {
        return new CouponsType.PaymentDetails();
    }

    /**
     * Create an instance of {@link RoomPriceType.ProfilePrice }
     * 
     */
    public RoomPriceType.ProfilePrice createRoomPriceTypeProfilePrice() {
        return new RoomPriceType.ProfilePrice();
    }

    /**
     * Create an instance of {@link TripFeaturesType.Activities }
     * 
     */
    public TripFeaturesType.Activities createTripFeaturesTypeActivities() {
        return new TripFeaturesType.Activities();
    }

    /**
     * Create an instance of {@link TripFeaturesType.Operators }
     * 
     */
    public TripFeaturesType.Operators createTripFeaturesTypeOperators() {
        return new TripFeaturesType.Operators();
    }

    /**
     * Create an instance of {@link TripFeaturesType.Destinations.Destination }
     * 
     */
    public TripFeaturesType.Destinations.Destination createTripFeaturesTypeDestinationsDestination() {
        return new TripFeaturesType.Destinations.Destination();
    }

    /**
     * Create an instance of {@link ProductBase.Air }
     * 
     */
    public ProductBase.Air createProductBaseAir() {
        return new ProductBase.Air();
    }

    /**
     * Create an instance of {@link ProductBase.Ferry }
     * 
     */
    public ProductBase.Ferry createProductBaseFerry() {
        return new ProductBase.Ferry();
    }

    /**
     * Create an instance of {@link ProductBase.Insurance }
     * 
     */
    public ProductBase.Insurance createProductBaseInsurance() {
        return new ProductBase.Insurance();
    }

    /**
     * Create an instance of {@link ProductBase.AncillaryProduct.Attributes.Attribute }
     * 
     */
    public ProductBase.AncillaryProduct.Attributes.Attribute createProductBaseAncillaryProductAttributesAttribute() {
        return new ProductBase.AncillaryProduct.Attributes.Attribute();
    }

    /**
     * Create an instance of {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.ExchangeRate }
     * 
     */
    public ProductBase.ProductBaseBaggage.OriginDestination.Service.ExchangeRate createProductBaseProductBaseBaggageOriginDestinationServiceExchangeRate() {
        return new ProductBase.ProductBaseBaggage.OriginDestination.Service.ExchangeRate();
    }

    /**
     * Create an instance of {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage.MaxWeight }
     * 
     */
    public ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage.MaxWeight createProductBaseProductBaseBaggageOriginDestinationServiceBaggageMaxWeight() {
        return new ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage.MaxWeight();
    }

    /**
     * Create an instance of {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions.UpgradeMethod }
     * 
     */
    public ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions.UpgradeMethod createProductBaseProductBaseBaggageOriginDestinationServiceBookingInstructionsUpgradeMethod() {
        return new ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link DestActivityReservationType.TravelerCount }
     * 
     */
    public DestActivityReservationType.TravelerCount createDestActivityReservationTypeTravelerCount() {
        return new DestActivityReservationType.TravelerCount();
    }

    /**
     * Create an instance of {@link ProductBase.Activity.ReservationReferences }
     * 
     */
    public ProductBase.Activity.ReservationReferences createProductBaseActivityReservationReferences() {
        return new ProductBase.Activity.ReservationReferences();
    }

    /**
     * Create an instance of {@link PlanCostType.BasePremium }
     * 
     */
    public PlanCostType.BasePremium createPlanCostTypeBasePremium() {
        return new PlanCostType.BasePremium();
    }

    /**
     * Create an instance of {@link PlanCostType.Charges }
     * 
     */
    public PlanCostType.Charges createPlanCostTypeCharges() {
        return new PlanCostType.Charges();
    }

    /**
     * Create an instance of {@link ProductBase.Activity.TPAExtensions.Insurance.PlanCost.ExchangeRate }
     * 
     */
    public ProductBase.Activity.TPAExtensions.Insurance.PlanCost.ExchangeRate createProductBaseActivityTPAExtensionsInsurancePlanCostExchangeRate() {
        return new ProductBase.Activity.TPAExtensions.Insurance.PlanCost.ExchangeRate();
    }

    /**
     * Create an instance of {@link ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices.IncrementalPrice }
     * 
     */
    public ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices.IncrementalPrice createProductBaseActivityTPAExtensionsInsurancePlanCostIncrementalPricesIncrementalPrice() {
        return new ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices.IncrementalPrice();
    }

    /**
     * Create an instance of {@link ProductBase.Activity.BookingReferenceID.CompanyName }
     * 
     */
    public ProductBase.Activity.BookingReferenceID.CompanyName createProductBaseActivityBookingReferenceIDCompanyName() {
        return new ProductBase.Activity.BookingReferenceID.CompanyName();
    }

    /**
     * Create an instance of {@link ProductBase.Hotel.SupplierPenalties }
     * 
     */
    public ProductBase.Hotel.SupplierPenalties createProductBaseHotelSupplierPenalties() {
        return new ProductBase.Hotel.SupplierPenalties();
    }

    /**
     * Create an instance of {@link VehicleReservationType.Customer }
     * 
     */
    public VehicleReservationType.Customer createVehicleReservationTypeCustomer() {
        return new VehicleReservationType.Customer();
    }

    /**
     * Create an instance of {@link VehicleReservationType.VehSegmentCore }
     * 
     */
    public VehicleReservationType.VehSegmentCore createVehicleReservationTypeVehSegmentCore() {
        return new VehicleReservationType.VehSegmentCore();
    }

    /**
     * Create an instance of {@link VehicleReservationType.VehSegmentInfo }
     * 
     */
    public VehicleReservationType.VehSegmentInfo createVehicleReservationTypeVehSegmentInfo() {
        return new VehicleReservationType.VehSegmentInfo();
    }

    /**
     * Create an instance of {@link ProductBase.Vehicle.DriverType }
     * 
     */
    public ProductBase.Vehicle.DriverType createProductBaseVehicleDriverType() {
        return new ProductBase.Vehicle.DriverType();
    }

    /**
     * Create an instance of {@link ProductBase.Vehicle.BookingReferenceID.CompanyName }
     * 
     */
    public ProductBase.Vehicle.BookingReferenceID.CompanyName createProductBaseVehicleBookingReferenceIDCompanyName() {
        return new ProductBase.Vehicle.BookingReferenceID.CompanyName();
    }

    /**
     * Create an instance of {@link ProductBase.Vehicle.BookingReferenceID.VoucherURL }
     * 
     */
    public ProductBase.Vehicle.BookingReferenceID.VoucherURL createProductBaseVehicleBookingReferenceIDVoucherURL() {
        return new ProductBase.Vehicle.BookingReferenceID.VoucherURL();
    }

    /**
     * Create an instance of {@link AmountType.Base }
     * 
     */
    public AmountType.Base createAmountTypeBase() {
        return new AmountType.Base();
    }

    /**
     * Create an instance of {@link AmountType.AdditionalGuestAmounts }
     * 
     */
    public AmountType.AdditionalGuestAmounts createAmountTypeAdditionalGuestAmounts() {
        return new AmountType.AdditionalGuestAmounts();
    }

    /**
     * Create an instance of {@link AmountType.Discount }
     * 
     */
    public AmountType.Discount createAmountTypeDiscount() {
        return new AmountType.Discount();
    }

    /**
     * Create an instance of {@link AmountType.AdvanceBookingRestriction }
     * 
     */
    public AmountType.AdvanceBookingRestriction createAmountTypeAdvanceBookingRestriction() {
        return new AmountType.AdvanceBookingRestriction();
    }

    /**
     * Create an instance of {@link AmountType.Taxes }
     * 
     */
    public AmountType.Taxes createAmountTypeTaxes() {
        return new AmountType.Taxes();
    }

    /**
     * Create an instance of {@link AmountType.BuyTaxes }
     * 
     */
    public AmountType.BuyTaxes createAmountTypeBuyTaxes() {
        return new AmountType.BuyTaxes();
    }

    /**
     * Create an instance of {@link AmountType.Total }
     * 
     */
    public AmountType.Total createAmountTypeTotal() {
        return new AmountType.Total();
    }

    /**
     * Create an instance of {@link AmountType.AdditionalCharges.AdditionalCharge }
     * 
     */
    public AmountType.AdditionalCharges.AdditionalCharge createAmountTypeAdditionalChargesAdditionalCharge() {
        return new AmountType.AdditionalCharges.AdditionalCharge();
    }

    /**
     * Create an instance of {@link AmountType.NightlyRates.NightlyRate }
     * 
     */
    public AmountType.NightlyRates.NightlyRate createAmountTypeNightlyRatesNightlyRate() {
        return new AmountType.NightlyRates.NightlyRate();
    }

    /**
     * Create an instance of {@link SpecialSrvcSegType.SSRType }
     * 
     */
    public SpecialSrvcSegType.SSRType createSpecialSrvcSegTypeSSRType() {
        return new SpecialSrvcSegType.SSRType();
    }

    /**
     * Create an instance of {@link SpecialSrvcSegType.OtherType }
     * 
     */
    public SpecialSrvcSegType.OtherType createSpecialSrvcSegTypeOtherType() {
        return new SpecialSrvcSegType.OtherType();
    }

    /**
     * Create an instance of {@link BusInfoType.ValidDate }
     * 
     */
    public BusInfoType.ValidDate createBusInfoTypeValidDate() {
        return new BusInfoType.ValidDate();
    }

    /**
     * Create an instance of {@link RailPassengerDetailType.ProfileRef }
     * 
     */
    public RailPassengerDetailType.ProfileRef createRailPassengerDetailTypeProfileRef() {
        return new RailPassengerDetailType.ProfileRef();
    }

    /**
     * Create an instance of {@link RailPassengerDetailType.Telephone }
     * 
     */
    public RailPassengerDetailType.Telephone createRailPassengerDetailTypeTelephone() {
        return new RailPassengerDetailType.Telephone();
    }

    /**
     * Create an instance of {@link RailPassengerDetailType.Email }
     * 
     */
    public RailPassengerDetailType.Email createRailPassengerDetailTypeEmail() {
        return new RailPassengerDetailType.Email();
    }

    /**
     * Create an instance of {@link RailPassengerDetailType.Address }
     * 
     */
    public RailPassengerDetailType.Address createRailPassengerDetailTypeAddress() {
        return new RailPassengerDetailType.Address();
    }

    /**
     * Create an instance of {@link RailPassengerDetailType.CustLoyalty }
     * 
     */
    public RailPassengerDetailType.CustLoyalty createRailPassengerDetailTypeCustLoyalty() {
        return new RailPassengerDetailType.CustLoyalty();
    }

    /**
     * Create an instance of {@link FlightSegmentRefsType.FlightSegmentRef }
     * 
     */
    public FlightSegmentRefsType.FlightSegmentRef createFlightSegmentRefsTypeFlightSegmentRef() {
        return new FlightSegmentRefsType.FlightSegmentRef();
    }

    /**
     * Create an instance of {@link RefundType.Reason }
     * 
     */
    public RefundType.Reason createRefundTypeReason() {
        return new RefundType.Reason();
    }

    /**
     * Create an instance of {@link RefundType.Refund.TimeSpan }
     * 
     */
    public RefundType.Refund.TimeSpan createRefundTypeRefundTimeSpan() {
        return new RefundType.Refund.TimeSpan();
    }

    /**
     * Create an instance of {@link FlightDetailType.Connections }
     * 
     */
    public FlightDetailType.Connections createFlightDetailTypeConnections() {
        return new FlightDetailType.Connections();
    }

    /**
     * Create an instance of {@link EmailsType.Email }
     * 
     */
    public EmailsType.Email createEmailsTypeEmail() {
        return new EmailsType.Email();
    }

    /**
     * Create an instance of {@link AirAncillariesFlightProductSummaryType.FlightSegment }
     * 
     */
    public AirAncillariesFlightProductSummaryType.FlightSegment createAirAncillariesFlightProductSummaryTypeFlightSegment() {
        return new AirAncillariesFlightProductSummaryType.FlightSegment();
    }

    /**
     * Create an instance of {@link ItemsType.Item }
     * 
     */
    public ItemsType.Item createItemsTypeItem() {
        return new ItemsType.Item();
    }

    /**
     * Create an instance of {@link OntologyTransportationType.TripDirection }
     * 
     */
    public OntologyTransportationType.TripDirection createOntologyTransportationTypeTripDirection() {
        return new OntologyTransportationType.TripDirection();
    }

    /**
     * Create an instance of {@link OntologyTransportationType.Vehicle.Class }
     * 
     */
    public OntologyTransportationType.Vehicle.Class createOntologyTransportationTypeVehicleClass() {
        return new OntologyTransportationType.Vehicle.Class();
    }

    /**
     * Create an instance of {@link OntologyTransportationType.Vehicle.Make }
     * 
     */
    public OntologyTransportationType.Vehicle.Make createOntologyTransportationTypeVehicleMake() {
        return new OntologyTransportationType.Vehicle.Make();
    }

    /**
     * Create an instance of {@link OntologyTransportationType.Vehicle.Model }
     * 
     */
    public OntologyTransportationType.Vehicle.Model createOntologyTransportationTypeVehicleModel() {
        return new OntologyTransportationType.Vehicle.Model();
    }

    /**
     * Create an instance of {@link OntologyTransportationType.FlightAndRail.Number }
     * 
     */
    public OntologyTransportationType.FlightAndRail.Number createOntologyTransportationTypeFlightAndRailNumber() {
        return new OntologyTransportationType.FlightAndRail.Number();
    }

    /**
     * Create an instance of {@link OntologyTransportationType.FlightAndRail.Class }
     * 
     */
    public OntologyTransportationType.FlightAndRail.Class createOntologyTransportationTypeFlightAndRailClass() {
        return new OntologyTransportationType.FlightAndRail.Class();
    }

    /**
     * Create an instance of {@link RoomStaysType.RoomStay.Reference }
     * 
     */
    public RoomStaysType.RoomStay.Reference createRoomStaysTypeRoomStayReference() {
        return new RoomStaysType.RoomStay.Reference();
    }

    /**
     * Create an instance of {@link FareCodeOptionType.FareRemark }
     * 
     */
    public FareCodeOptionType.FareRemark createFareCodeOptionTypeFareRemark() {
        return new FareCodeOptionType.FareRemark();
    }

    /**
     * Create an instance of {@link ServiceItemNoPriceType.Endorsement }
     * 
     */
    public ServiceItemNoPriceType.Endorsement createServiceItemNoPriceTypeEndorsement() {
        return new ServiceItemNoPriceType.Endorsement();
    }

    /**
     * Create an instance of {@link ServiceItemNoPriceType.BookingInstructions.UpgradeMethod }
     * 
     */
    public ServiceItemNoPriceType.BookingInstructions.UpgradeMethod createServiceItemNoPriceTypeBookingInstructionsUpgradeMethod() {
        return new ServiceItemNoPriceType.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link FareSummaryTypeDEPRECATE.TotalFare }
     * 
     */
    public FareSummaryTypeDEPRECATE.TotalFare createFareSummaryTypeDEPRECATETotalFare() {
        return new FareSummaryTypeDEPRECATE.TotalFare();
    }

    /**
     * Create an instance of {@link FareSummaryTypeDEPRECATE.Discount }
     * 
     */
    public FareSummaryTypeDEPRECATE.Discount createFareSummaryTypeDEPRECATEDiscount() {
        return new FareSummaryTypeDEPRECATE.Discount();
    }

    /**
     * Create an instance of {@link CabinClassType.AirRows }
     * 
     */
    public CabinClassType.AirRows createCabinClassTypeAirRows() {
        return new CabinClassType.AirRows();
    }

    /**
     * Create an instance of {@link ComboType.ComboProduct }
     * 
     */
    public ComboType.ComboProduct createComboTypeComboProduct() {
        return new ComboType.ComboProduct();
    }

    /**
     * Create an instance of {@link FareFiledInType.Amount }
     * 
     */
    public FareFiledInType.Amount createFareFiledInTypeAmount() {
        return new FareFiledInType.Amount();
    }

    /**
     * Create an instance of {@link FareFiledInType.NUCAmount }
     * 
     */
    public FareFiledInType.NUCAmount createFareFiledInTypeNUCAmount() {
        return new FareFiledInType.NUCAmount();
    }

    /**
     * Create an instance of {@link AllianceConsortiumType.AllianceMember }
     * 
     */
    public AllianceConsortiumType.AllianceMember createAllianceConsortiumTypeAllianceMember() {
        return new AllianceConsortiumType.AllianceMember();
    }

    /**
     * Create an instance of {@link StationDetailsType.Telephone }
     * 
     */
    public StationDetailsType.Telephone createStationDetailsTypeTelephone() {
        return new StationDetailsType.Telephone();
    }

    /**
     * Create an instance of {@link ChildAmountType.ChildAmount }
     * 
     */
    public ChildAmountType.ChildAmount createChildAmountTypeChildAmount() {
        return new ChildAmountType.ChildAmount();
    }

    /**
     * Create an instance of {@link AncillaryAvailBaggageType.OriginDestination }
     * 
     */
    public AncillaryAvailBaggageType.OriginDestination createAncillaryAvailBaggageTypeOriginDestination() {
        return new AncillaryAvailBaggageType.OriginDestination();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.ViewershipCodes }
     * 
     */
    public ViewershipsType.Viewership.ViewershipCodes createViewershipsTypeViewershipViewershipCodes() {
        return new ViewershipsType.Viewership.ViewershipCodes();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.ProfileRefs }
     * 
     */
    public ViewershipsType.Viewership.ProfileRefs createViewershipsTypeViewershipProfileRefs() {
        return new ViewershipsType.Viewership.ProfileRefs();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.Profiles }
     * 
     */
    public ViewershipsType.Viewership.Profiles createViewershipsTypeViewershipProfiles() {
        return new ViewershipsType.Viewership.Profiles();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.DistributorTypes.DistributorType }
     * 
     */
    public ViewershipsType.Viewership.DistributorTypes.DistributorType createViewershipsTypeViewershipDistributorTypesDistributorType() {
        return new ViewershipsType.Viewership.DistributorTypes.DistributorType();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.BookingChannelCodes.BookingChannelCode }
     * 
     */
    public ViewershipsType.Viewership.BookingChannelCodes.BookingChannelCode createViewershipsTypeViewershipBookingChannelCodesBookingChannelCode() {
        return new ViewershipsType.Viewership.BookingChannelCodes.BookingChannelCode();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.LocationCodes.LocationCode }
     * 
     */
    public ViewershipsType.Viewership.LocationCodes.LocationCode createViewershipsTypeViewershipLocationCodesLocationCode() {
        return new ViewershipsType.Viewership.LocationCodes.LocationCode();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.ProfileTypes.ProfileType }
     * 
     */
    public ViewershipsType.Viewership.ProfileTypes.ProfileType createViewershipsTypeViewershipProfileTypesProfileType() {
        return new ViewershipsType.Viewership.ProfileTypes.ProfileType();
    }

    /**
     * Create an instance of {@link ViewershipsType.Viewership.SystemCodes.SystemCode }
     * 
     */
    public ViewershipsType.Viewership.SystemCodes.SystemCode createViewershipsTypeViewershipSystemCodesSystemCode() {
        return new ViewershipsType.Viewership.SystemCodes.SystemCode();
    }

    /**
     * Create an instance of {@link VerificationPNR.SaleTimeSpan }
     * 
     */
    public VerificationPNR.SaleTimeSpan createVerificationPNRSaleTimeSpan() {
        return new VerificationPNR.SaleTimeSpan();
    }

    /**
     * Create an instance of {@link VerificationPNR.TravelStatus }
     * 
     */
    public VerificationPNR.TravelStatus createVerificationPNRTravelStatus() {
        return new VerificationPNR.TravelStatus();
    }

    /**
     * Create an instance of {@link VerificationPNR.PaymentStatus }
     * 
     */
    public VerificationPNR.PaymentStatus createVerificationPNRPaymentStatus() {
        return new VerificationPNR.PaymentStatus();
    }

    /**
     * Create an instance of {@link VerificationPNR.BookingStatus }
     * 
     */
    public VerificationPNR.BookingStatus createVerificationPNRBookingStatus() {
        return new VerificationPNR.BookingStatus();
    }

    /**
     * Create an instance of {@link VerificationPNR.ArchivalStatus }
     * 
     */
    public VerificationPNR.ArchivalStatus createVerificationPNRArchivalStatus() {
        return new VerificationPNR.ArchivalStatus();
    }

    /**
     * Create an instance of {@link VerificationPNR.RefundApplicationTimeSpan }
     * 
     */
    public VerificationPNR.RefundApplicationTimeSpan createVerificationPNRRefundApplicationTimeSpan() {
        return new VerificationPNR.RefundApplicationTimeSpan();
    }

    /**
     * Create an instance of {@link VerificationPNR.RefundReviewTimeSpan }
     * 
     */
    public VerificationPNR.RefundReviewTimeSpan createVerificationPNRRefundReviewTimeSpan() {
        return new VerificationPNR.RefundReviewTimeSpan();
    }

    /**
     * Create an instance of {@link VerificationPNR.RefundRepayTimeSpan }
     * 
     */
    public VerificationPNR.RefundRepayTimeSpan createVerificationPNRRefundRepayTimeSpan() {
        return new VerificationPNR.RefundRepayTimeSpan();
    }

    /**
     * Create an instance of {@link VerificationPNR.StartDateTimeSpan }
     * 
     */
    public VerificationPNR.StartDateTimeSpan createVerificationPNRStartDateTimeSpan() {
        return new VerificationPNR.StartDateTimeSpan();
    }

    /**
     * Create an instance of {@link VerificationPNR.Payments }
     * 
     */
    public VerificationPNR.Payments createVerificationPNRPayments() {
        return new VerificationPNR.Payments();
    }

    /**
     * Create an instance of {@link VerificationPNR.DepartureCountry }
     * 
     */
    public VerificationPNR.DepartureCountry createVerificationPNRDepartureCountry() {
        return new VerificationPNR.DepartureCountry();
    }

    /**
     * Create an instance of {@link VerificationPNR.Queue }
     * 
     */
    public VerificationPNR.Queue createVerificationPNRQueue() {
        return new VerificationPNR.Queue();
    }

    /**
     * Create an instance of {@link VerificationPNR.PromotionCode }
     * 
     */
    public VerificationPNR.PromotionCode createVerificationPNRPromotionCode() {
        return new VerificationPNR.PromotionCode();
    }

    /**
     * Create an instance of {@link VerificationPNR.AdjustmentTimeSpan }
     * 
     */
    public VerificationPNR.AdjustmentTimeSpan createVerificationPNRAdjustmentTimeSpan() {
        return new VerificationPNR.AdjustmentTimeSpan();
    }

    /**
     * Create an instance of {@link VerificationPNR.LoyaltyCode }
     * 
     */
    public VerificationPNR.LoyaltyCode createVerificationPNRLoyaltyCode() {
        return new VerificationPNR.LoyaltyCode();
    }

    /**
     * Create an instance of {@link VerificationPNR.CrossRefs }
     * 
     */
    public VerificationPNR.CrossRefs createVerificationPNRCrossRefs() {
        return new VerificationPNR.CrossRefs();
    }

    /**
     * Create an instance of {@link VerificationPNR.Seat }
     * 
     */
    public VerificationPNR.Seat createVerificationPNRSeat() {
        return new VerificationPNR.Seat();
    }

    /**
     * Create an instance of {@link VerificationPNR.HotelItineraryStatus }
     * 
     */
    public VerificationPNR.HotelItineraryStatus createVerificationPNRHotelItineraryStatus() {
        return new VerificationPNR.HotelItineraryStatus();
    }

    /**
     * Create an instance of {@link VerificationPNR.LastModifiedTimeSpan }
     * 
     */
    public VerificationPNR.LastModifiedTimeSpan createVerificationPNRLastModifiedTimeSpan() {
        return new VerificationPNR.LastModifiedTimeSpan();
    }

    /**
     * Create an instance of {@link VerificationPNR.ModifyType }
     * 
     */
    public VerificationPNR.ModifyType createVerificationPNRModifyType() {
        return new VerificationPNR.ModifyType();
    }

    /**
     * Create an instance of {@link VerificationPNR.Reshop.TimeSpan }
     * 
     */
    public VerificationPNR.Reshop.TimeSpan createVerificationPNRReshopTimeSpan() {
        return new VerificationPNR.Reshop.TimeSpan();
    }

    /**
     * Create an instance of {@link VerificationPNR.Ticketing.TimeSpan }
     * 
     */
    public VerificationPNR.Ticketing.TimeSpan createVerificationPNRTicketingTimeSpan() {
        return new VerificationPNR.Ticketing.TimeSpan();
    }

    /**
     * Create an instance of {@link VerificationPNR.Products.Product.Air }
     * 
     */
    public VerificationPNR.Products.Product.Air createVerificationPNRProductsProductAir() {
        return new VerificationPNR.Products.Product.Air();
    }

    /**
     * Create an instance of {@link VerificationPNR.Products.Product.ReservationTimeSpan }
     * 
     */
    public VerificationPNR.Products.Product.ReservationTimeSpan createVerificationPNRProductsProductReservationTimeSpan() {
        return new VerificationPNR.Products.Product.ReservationTimeSpan();
    }

    /**
     * Create an instance of {@link VerificationPNR.Primary.UniqueID }
     * 
     */
    public VerificationPNR.Primary.UniqueID createVerificationPNRPrimaryUniqueID() {
        return new VerificationPNR.Primary.UniqueID();
    }

    /**
     * Create an instance of {@link VerificationPNR.Primary.Profile }
     * 
     */
    public VerificationPNR.Primary.Profile createVerificationPNRPrimaryProfile() {
        return new VerificationPNR.Primary.Profile();
    }

    /**
     * Create an instance of {@link VerificationPNR.Source.Locales.Locale }
     * 
     */
    public VerificationPNR.Source.Locales.Locale createVerificationPNRSourceLocalesLocale() {
        return new VerificationPNR.Source.Locales.Locale();
    }

    /**
     * Create an instance of {@link VerificationPNR.Refunds.Reason }
     * 
     */
    public VerificationPNR.Refunds.Reason createVerificationPNRRefundsReason() {
        return new VerificationPNR.Refunds.Reason();
    }

    /**
     * Create an instance of {@link VerificationPNR.Refunds.Refund.TimeSpan }
     * 
     */
    public VerificationPNR.Refunds.Refund.TimeSpan createVerificationPNRRefundsRefundTimeSpan() {
        return new VerificationPNR.Refunds.Refund.TimeSpan();
    }

    /**
     * Create an instance of {@link VerificationPNR.Remarks.Remark }
     * 
     */
    public VerificationPNR.Remarks.Remark createVerificationPNRRemarksRemark() {
        return new VerificationPNR.Remarks.Remark();
    }

    /**
     * Create an instance of {@link VerificationPNR.Coupons.Coupon }
     * 
     */
    public VerificationPNR.Coupons.Coupon createVerificationPNRCouponsCoupon() {
        return new VerificationPNR.Coupons.Coupon();
    }

    /**
     * Create an instance of {@link VerificationPNR.Product.Air }
     * 
     */
    public VerificationPNR.Product.Air createVerificationPNRProductAir() {
        return new VerificationPNR.Product.Air();
    }

    /**
     * Create an instance of {@link VerificationPNR.Product.Hotel }
     * 
     */
    public VerificationPNR.Product.Hotel createVerificationPNRProductHotel() {
        return new VerificationPNR.Product.Hotel();
    }

    /**
     * Create an instance of {@link VerificationPNR.Product.Vehicle }
     * 
     */
    public VerificationPNR.Product.Vehicle createVerificationPNRProductVehicle() {
        return new VerificationPNR.Product.Vehicle();
    }

    /**
     * Create an instance of {@link VerificationPNR.Product.Activity }
     * 
     */
    public VerificationPNR.Product.Activity createVerificationPNRProductActivity() {
        return new VerificationPNR.Product.Activity();
    }

    /**
     * Create an instance of {@link VerificationPNR.Product.Membership }
     * 
     */
    public VerificationPNR.Product.Membership createVerificationPNRProductMembership() {
        return new VerificationPNR.Product.Membership();
    }

    /**
     * Create an instance of {@link VerificationPNR.Product.Insurance }
     * 
     */
    public VerificationPNR.Product.Insurance createVerificationPNRProductInsurance() {
        return new VerificationPNR.Product.Insurance();
    }

    /**
     * Create an instance of {@link VerificationPNR.Product.AncillaryProduct }
     * 
     */
    public VerificationPNR.Product.AncillaryProduct createVerificationPNRProductAncillaryProduct() {
        return new VerificationPNR.Product.AncillaryProduct();
    }

    /**
     * Create an instance of {@link VerificationPNR.Product.Ferry }
     * 
     */
    public VerificationPNR.Product.Ferry createVerificationPNRProductFerry() {
        return new VerificationPNR.Product.Ferry();
    }

    /**
     * Create an instance of {@link VerificationPNR.Product.Cruise }
     * 
     */
    public VerificationPNR.Product.Cruise createVerificationPNRProductCruise() {
        return new VerificationPNR.Product.Cruise();
    }

    /**
     * Create an instance of {@link VerificationPNR.Product.Coupon }
     * 
     */
    public VerificationPNR.Product.Coupon createVerificationPNRProductCoupon() {
        return new VerificationPNR.Product.Coupon();
    }

    /**
     * Create an instance of {@link DocumentHandlingType.VendorOption }
     * 
     */
    public DocumentHandlingType.VendorOption createDocumentHandlingTypeVendorOption() {
        return new DocumentHandlingType.VendorOption();
    }

    /**
     * Create an instance of {@link LoyaltyProductType.Earn }
     * 
     */
    public LoyaltyProductType.Earn createLoyaltyProductTypeEarn() {
        return new LoyaltyProductType.Earn();
    }

    /**
     * Create an instance of {@link LoyaltyProductType.PTCs }
     * 
     */
    public LoyaltyProductType.PTCs createLoyaltyProductTypePTCs() {
        return new LoyaltyProductType.PTCs();
    }

    /**
     * Create an instance of {@link LoyaltyProductType.Redemption.Redeem }
     * 
     */
    public LoyaltyProductType.Redemption.Redeem createLoyaltyProductTypeRedemptionRedeem() {
        return new LoyaltyProductType.Redemption.Redeem();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.TravelerInfo }
     * 
     */
    public AirAncillaryProductType.TravelerInfo createAirAncillaryProductTypeTravelerInfo() {
        return new AirAncillaryProductType.TravelerInfo();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.ExchangeRate }
     * 
     */
    public AirAncillaryProductType.ExchangeRate createAirAncillaryProductTypeExchangeRate() {
        return new AirAncillaryProductType.ExchangeRate();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.ServiceRPHs }
     * 
     */
    public AirAncillaryProductType.ServiceRPHs createAirAncillaryProductTypeServiceRPHs() {
        return new AirAncillaryProductType.ServiceRPHs();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.TravelerInputs.TravelerInput }
     * 
     */
    public AirAncillaryProductType.TravelerInputs.TravelerInput createAirAncillaryProductTypeTravelerInputsTravelerInput() {
        return new AirAncillaryProductType.TravelerInputs.TravelerInput();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.ProductGroups.ProductGroup }
     * 
     */
    public AirAncillaryProductType.ProductGroups.ProductGroup createAirAncillaryProductTypeProductGroupsProductGroup() {
        return new AirAncillaryProductType.ProductGroups.ProductGroup();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.Attributes.Attribute }
     * 
     */
    public AirAncillaryProductType.Attributes.Attribute createAirAncillaryProductTypeAttributesAttribute() {
        return new AirAncillaryProductType.Attributes.Attribute();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxWeight }
     * 
     */
    public AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxWeight createAirAncillaryProductTypeProductDescriptiveContentBaggageMaxWeight() {
        return new AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxWeight();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Length }
     * 
     */
    public AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Length createAirAncillaryProductTypeProductDescriptiveContentBaggageMaxDimensionsLength() {
        return new AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Length();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Height }
     * 
     */
    public AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Height createAirAncillaryProductTypeProductDescriptiveContentBaggageMaxDimensionsHeight() {
        return new AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Height();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Width }
     * 
     */
    public AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Width createAirAncillaryProductTypeProductDescriptiveContentBaggageMaxDimensionsWidth() {
        return new AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Width();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.Restrictions.PassengerType }
     * 
     */
    public AirAncillaryProductType.Restrictions.PassengerType createAirAncillaryProductTypeRestrictionsPassengerType() {
        return new AirAncillaryProductType.Restrictions.PassengerType();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.Restrictions.CabinClass }
     * 
     */
    public AirAncillaryProductType.Restrictions.CabinClass createAirAncillaryProductTypeRestrictionsCabinClass() {
        return new AirAncillaryProductType.Restrictions.CabinClass();
    }

    /**
     * Create an instance of {@link AirAncillaryProductType.Restrictions.LoyaltyPrograms }
     * 
     */
    public AirAncillaryProductType.Restrictions.LoyaltyPrograms createAirAncillaryProductTypeRestrictionsLoyaltyPrograms() {
        return new AirAncillaryProductType.Restrictions.LoyaltyPrograms();
    }

    /**
     * Create an instance of {@link PackageResponseType.DateRange }
     * 
     */
    public PackageResponseType.DateRange createPackageResponseTypeDateRange() {
        return new PackageResponseType.DateRange();
    }

    /**
     * Create an instance of {@link PackageResponseType.ItineraryItems }
     * 
     */
    public PackageResponseType.ItineraryItems createPackageResponseTypeItineraryItems() {
        return new PackageResponseType.ItineraryItems();
    }

    /**
     * Create an instance of {@link PackageResponseType.Extras }
     * 
     */
    public PackageResponseType.Extras createPackageResponseTypeExtras() {
        return new PackageResponseType.Extras();
    }

    /**
     * Create an instance of {@link PackageResponseType.Cautions }
     * 
     */
    public PackageResponseType.Cautions createPackageResponseTypeCautions() {
        return new PackageResponseType.Cautions();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.PTCs.PTC }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.PTCs.PTC createPTCsPTC() {
        return new com.airchina.datacenter.spnr.sdk.entity.PTCs.PTC();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Addresses }
     * 
     */
    public BookingOfficeType.Addresses createBookingOfficeTypeAddresses() {
        return new BookingOfficeType.Addresses();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Phones }
     * 
     */
    public BookingOfficeType.Phones createBookingOfficeTypePhones() {
        return new BookingOfficeType.Phones();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Emails }
     * 
     */
    public BookingOfficeType.Emails createBookingOfficeTypeEmails() {
        return new BookingOfficeType.Emails();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Contract.ContactInfos }
     * 
     */
    public BookingOfficeType.Contract.ContactInfos createBookingOfficeTypeContractContactInfos() {
        return new BookingOfficeType.Contract.ContactInfos();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail.BankAcct }
     * 
     */
    public BookingOfficeType.Contract.PaymentDetails.PaymentDetail.BankAcct createBookingOfficeTypeContractPaymentDetailsPaymentDetailBankAcct() {
        return new BookingOfficeType.Contract.PaymentDetails.PaymentDetail.BankAcct();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail.Currency }
     * 
     */
    public BookingOfficeType.Contract.PaymentDetails.PaymentDetail.Currency createBookingOfficeTypeContractPaymentDetailsPaymentDetailCurrency() {
        return new BookingOfficeType.Contract.PaymentDetails.PaymentDetail.Currency();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm }
     * 
     */
    public BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm createBookingOfficeTypeContractPaymentDetailsPaymentDetailAgressoExtraFieldsPaymentTerm() {
        return new BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm();
    }

    /**
     * Create an instance of {@link BookingOfficeType.SupplierNotification.Phones }
     * 
     */
    public BookingOfficeType.SupplierNotification.Phones createBookingOfficeTypeSupplierNotificationPhones() {
        return new BookingOfficeType.SupplierNotification.Phones();
    }

    /**
     * Create an instance of {@link BookingOfficeType.SupplierNotification.Emails }
     * 
     */
    public BookingOfficeType.SupplierNotification.Emails createBookingOfficeTypeSupplierNotificationEmails() {
        return new BookingOfficeType.SupplierNotification.Emails();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Contacts.Contact }
     * 
     */
    public BookingOfficeType.Contacts.Contact createBookingOfficeTypeContactsContact() {
        return new BookingOfficeType.Contacts.Contact();
    }

    /**
     * Create an instance of {@link BookingOfficeType.Names.Name }
     * 
     */
    public BookingOfficeType.Names.Name createBookingOfficeTypeNamesName() {
        return new BookingOfficeType.Names.Name();
    }

    /**
     * Create an instance of {@link FareQuoteInfoType.FlightRefNumber }
     * 
     */
    public FareQuoteInfoType.FlightRefNumber createFareQuoteInfoTypeFlightRefNumber() {
        return new FareQuoteInfoType.FlightRefNumber();
    }

    /**
     * Create an instance of {@link FareQuoteInfoType.Commission }
     * 
     */
    public FareQuoteInfoType.Commission createFareQuoteInfoTypeCommission() {
        return new FareQuoteInfoType.Commission();
    }

    /**
     * Create an instance of {@link FareQuoteInfoType.Endorsements.Endorsement }
     * 
     */
    public FareQuoteInfoType.Endorsements.Endorsement createFareQuoteInfoTypeEndorsementsEndorsement() {
        return new FareQuoteInfoType.Endorsements.Endorsement();
    }

    /**
     * Create an instance of {@link FareQuoteInfoType.TicketDesignators.TicketDesignator }
     * 
     */
    public FareQuoteInfoType.TicketDesignators.TicketDesignator createFareQuoteInfoTypeTicketDesignatorsTicketDesignator() {
        return new FareQuoteInfoType.TicketDesignators.TicketDesignator();
    }

    /**
     * Create an instance of {@link AirPricedOfferType.Restriction }
     * 
     */
    public AirPricedOfferType.Restriction createAirPricedOfferTypeRestriction() {
        return new AirPricedOfferType.Restriction();
    }

    /**
     * Create an instance of {@link CustomRequestType.Instructions }
     * 
     */
    public CustomRequestType.Instructions createCustomRequestTypeInstructions() {
        return new CustomRequestType.Instructions();
    }

    /**
     * Create an instance of {@link CustomRequestType.Control }
     * 
     */
    public CustomRequestType.Control createCustomRequestTypeControl() {
        return new CustomRequestType.Control();
    }

    /**
     * Create an instance of {@link CustomRequestType.Button }
     * 
     */
    public CustomRequestType.Button createCustomRequestTypeButton() {
        return new CustomRequestType.Button();
    }

    /**
     * Create an instance of {@link ItineraryReceiptProductType.ItineraryProduct.Ticketing.TicketPrice }
     * 
     */
    public ItineraryReceiptProductType.ItineraryProduct.Ticketing.TicketPrice createItineraryReceiptProductTypeItineraryProductTicketingTicketPrice() {
        return new ItineraryReceiptProductType.ItineraryProduct.Ticketing.TicketPrice();
    }

    /**
     * Create an instance of {@link ItineraryReceiptProductType.ItineraryProduct.Ticketing.PassengerInfo }
     * 
     */
    public ItineraryReceiptProductType.ItineraryProduct.Ticketing.PassengerInfo createItineraryReceiptProductTypeItineraryProductTicketingPassengerInfo() {
        return new ItineraryReceiptProductType.ItineraryProduct.Ticketing.PassengerInfo();
    }

    /**
     * Create an instance of {@link ItineraryReceiptProductType.DeliveryInfo.EstimatedPrice }
     * 
     */
    public ItineraryReceiptProductType.DeliveryInfo.EstimatedPrice createItineraryReceiptProductTypeDeliveryInfoEstimatedPrice() {
        return new ItineraryReceiptProductType.DeliveryInfo.EstimatedPrice();
    }

    /**
     * Create an instance of {@link LinkType.LinkText }
     * 
     */
    public LinkType.LinkText createLinkTypeLinkText() {
        return new LinkType.LinkText();
    }

    /**
     * Create an instance of {@link TaxItemType.TaxAmount }
     * 
     */
    public TaxItemType.TaxAmount createTaxItemTypeTaxAmount() {
        return new TaxItemType.TaxAmount();
    }

    /**
     * Create an instance of {@link RateType.Rate }
     * 
     */
    public RateType.Rate createRateTypeRate() {
        return new RateType.Rate();
    }

    /**
     * Create an instance of {@link AccommodationType.Compartment }
     * 
     */
    public AccommodationType.Compartment createAccommodationTypeCompartment() {
        return new AccommodationType.Compartment();
    }

    /**
     * Create an instance of {@link AccommodationType.BerthAvailabilityDetail.Car.Compartment.Berth }
     * 
     */
    public AccommodationType.BerthAvailabilityDetail.Car.Compartment.Berth createAccommodationTypeBerthAvailabilityDetailCarCompartmentBerth() {
        return new AccommodationType.BerthAvailabilityDetail.Car.Compartment.Berth();
    }

    /**
     * Create an instance of {@link AccommodationType.SeatAvailabilityDetail.Car.Compartment.Seat }
     * 
     */
    public AccommodationType.SeatAvailabilityDetail.Car.Compartment.Seat createAccommodationTypeSeatAvailabilityDetailCarCompartmentSeat() {
        return new AccommodationType.SeatAvailabilityDetail.Car.Compartment.Seat();
    }

    /**
     * Create an instance of {@link ContactsType.Name.JobTitle }
     * 
     */
    public ContactsType.Name.JobTitle createContactsTypeNameJobTitle() {
        return new ContactsType.Name.JobTitle();
    }

    /**
     * Create an instance of {@link RequestedLocationType.RelativePosition }
     * 
     */
    public RequestedLocationType.RelativePosition createRequestedLocationTypeRelativePosition() {
        return new RequestedLocationType.RelativePosition();
    }

    /**
     * Create an instance of {@link PermissionsType.Permission }
     * 
     */
    public PermissionsType.Permission createPermissionsTypePermission() {
        return new PermissionsType.Permission();
    }

    /**
     * Create an instance of {@link GroundTransportServiceCriteriaType.BusCriteria }
     * 
     */
    public GroundTransportServiceCriteriaType.BusCriteria createGroundTransportServiceCriteriaTypeBusCriteria() {
        return new GroundTransportServiceCriteriaType.BusCriteria();
    }

    /**
     * Create an instance of {@link ResGuestsType.ResGuest.ProfileRPHs.ProfileRPH }
     * 
     */
    public ResGuestsType.ResGuest.ProfileRPHs.ProfileRPH createResGuestsTypeResGuestProfileRPHsProfileRPH() {
        return new ResGuestsType.ResGuest.ProfileRPHs.ProfileRPH();
    }

    /**
     * Create an instance of {@link OtherPaymentForm.Ref }
     * 
     */
    public OtherPaymentForm.Ref createOtherPaymentFormRef() {
        return new OtherPaymentForm.Ref();
    }

    /**
     * Create an instance of {@link AirArrangerType.ProfileRef }
     * 
     */
    public AirArrangerType.ProfileRef createAirArrangerTypeProfileRef() {
        return new AirArrangerType.ProfileRef();
    }

    /**
     * Create an instance of {@link AddQueryInfoType.Brands.Brand }
     * 
     */
    public AddQueryInfoType.Brands.Brand createAddQueryInfoTypeBrandsBrand() {
        return new AddQueryInfoType.Brands.Brand();
    }

    /**
     * Create an instance of {@link AddQueryInfoType.Cabins.Cabin }
     * 
     */
    public AddQueryInfoType.Cabins.Cabin createAddQueryInfoTypeCabinsCabin() {
        return new AddQueryInfoType.Cabins.Cabin();
    }

    /**
     * Create an instance of {@link AddQueryInfoType.Banks.Bank }
     * 
     */
    public AddQueryInfoType.Banks.Bank createAddQueryInfoTypeBanksBank() {
        return new AddQueryInfoType.Banks.Bank();
    }

    /**
     * Create an instance of {@link AcceptablePaymentCardsInfoType.AcceptablePaymentCards.AcceptablePaymentCard }
     * 
     */
    public AcceptablePaymentCardsInfoType.AcceptablePaymentCards.AcceptablePaymentCard createAcceptablePaymentCardsInfoTypeAcceptablePaymentCardsAcceptablePaymentCard() {
        return new AcceptablePaymentCardsInfoType.AcceptablePaymentCards.AcceptablePaymentCard();
    }

    /**
     * Create an instance of {@link TextItemsType.TextItem }
     * 
     */
    public TextItemsType.TextItem createTextItemsTypeTextItem() {
        return new TextItemsType.TextItem();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Phones }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Phones createContactInfoPhones() {
        return new com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Phones();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Emails }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Emails createContactInfoEmails() {
        return new com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Emails();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Contacts.Contact }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Contacts.Contact createContactInfoContactsContact() {
        return new com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Contacts.Contact();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Names.Name }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Names.Name createContactInfoNamesName() {
        return new com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Names.Name();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Addresses.Address }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Addresses.Address createContactInfoAddressesAddress() {
        return new com.airchina.datacenter.spnr.sdk.entity.ContactInfo.Addresses.Address();
    }

    /**
     * Create an instance of {@link FareInfoEndorsementType.InfoSource }
     * 
     */
    public FareInfoEndorsementType.InfoSource createFareInfoEndorsementTypeInfoSource() {
        return new FareInfoEndorsementType.InfoSource();
    }

    /**
     * Create an instance of {@link AvailablePlansType.AvailablePlan.PlanDetail }
     * 
     */
    public AvailablePlansType.AvailablePlan.PlanDetail createAvailablePlansTypeAvailablePlanPlanDetail() {
        return new AvailablePlansType.AvailablePlan.PlanDetail();
    }

    /**
     * Create an instance of {@link AvailablePlansType.AvailablePlan.ProviderDetail }
     * 
     */
    public AvailablePlansType.AvailablePlan.ProviderDetail createAvailablePlansTypeAvailablePlanProviderDetail() {
        return new AvailablePlansType.AvailablePlan.ProviderDetail();
    }

    /**
     * Create an instance of {@link AvailablePlansType.AvailablePlan.UnderwriterDetail }
     * 
     */
    public AvailablePlansType.AvailablePlan.UnderwriterDetail createAvailablePlansTypeAvailablePlanUnderwriterDetail() {
        return new AvailablePlansType.AvailablePlan.UnderwriterDetail();
    }

    /**
     * Create an instance of {@link CustomResponseType.Response }
     * 
     */
    public CustomResponseType.Response createCustomResponseTypeResponse() {
        return new CustomResponseType.Response();
    }

    /**
     * Create an instance of {@link CustomResponseType.Button }
     * 
     */
    public CustomResponseType.Button createCustomResponseTypeButton() {
        return new CustomResponseType.Button();
    }

    /**
     * Create an instance of {@link ProfileVerificationType.UserID }
     * 
     */
    public ProfileVerificationType.UserID createProfileVerificationTypeUserID() {
        return new ProfileVerificationType.UserID();
    }

    /**
     * Create an instance of {@link OptionListType.ColumnHeader }
     * 
     */
    public OptionListType.ColumnHeader createOptionListTypeColumnHeader() {
        return new OptionListType.ColumnHeader();
    }

    /**
     * Create an instance of {@link OptionListType.ListItem.ColumnValue }
     * 
     */
    public OptionListType.ListItem.ColumnValue createOptionListTypeListItemColumnValue() {
        return new OptionListType.ListItem.ColumnValue();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType.Policies }
     * 
     */
    public HotelDescriptiveContentType.Policies createHotelDescriptiveContentTypePolicies() {
        return new HotelDescriptiveContentType.Policies();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType.TaxConfigurations }
     * 
     */
    public HotelDescriptiveContentType.TaxConfigurations createHotelDescriptiveContentTypeTaxConfigurations() {
        return new HotelDescriptiveContentType.TaxConfigurations();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType.RatePlans }
     * 
     */
    public HotelDescriptiveContentType.RatePlans createHotelDescriptiveContentTypeRatePlans() {
        return new HotelDescriptiveContentType.RatePlans();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType.EffectivePeriods.EffectivePeriod }
     * 
     */
    public HotelDescriptiveContentType.EffectivePeriods.EffectivePeriod createHotelDescriptiveContentTypeEffectivePeriodsEffectivePeriod() {
        return new HotelDescriptiveContentType.EffectivePeriods.EffectivePeriod();
    }

    /**
     * Create an instance of {@link PlanForBookRQType.OJTExtensions.FlightSegment }
     * 
     */
    public PlanForBookRQType.OJTExtensions.FlightSegment createPlanForBookRQTypeOJTExtensionsFlightSegment() {
        return new PlanForBookRQType.OJTExtensions.FlightSegment();
    }

    /**
     * Create an instance of {@link ResGuestRPHsType.ResGuestRPH }
     * 
     */
    public ResGuestRPHsType.ResGuestRPH createResGuestRPHsTypeResGuestRPH() {
        return new ResGuestRPHsType.ResGuestRPH();
    }

    /**
     * Create an instance of {@link OJCancelPenaltiesType.CancelPenalty }
     * 
     */
    public OJCancelPenaltiesType.CancelPenalty createOJCancelPenaltiesTypeCancelPenalty() {
        return new OJCancelPenaltiesType.CancelPenalty();
    }

    /**
     * Create an instance of {@link InsCoverageDetailType.TotalTripQuantity }
     * 
     */
    public InsCoverageDetailType.TotalTripQuantity createInsCoverageDetailTypeTotalTripQuantity() {
        return new InsCoverageDetailType.TotalTripQuantity();
    }

    /**
     * Create an instance of {@link InsCoverageDetailType.MaximumTripLength }
     * 
     */
    public InsCoverageDetailType.MaximumTripLength createInsCoverageDetailTypeMaximumTripLength() {
        return new InsCoverageDetailType.MaximumTripLength();
    }

    /**
     * Create an instance of {@link InsCoverageDetailType.TotalTripCost }
     * 
     */
    public InsCoverageDetailType.TotalTripCost createInsCoverageDetailTypeTotalTripCost() {
        return new InsCoverageDetailType.TotalTripCost();
    }

    /**
     * Create an instance of {@link InsCoverageDetailType.CoveredTrips.CoveredTrip }
     * 
     */
    public InsCoverageDetailType.CoveredTrips.CoveredTrip createInsCoverageDetailTypeCoveredTripsCoveredTrip() {
        return new InsCoverageDetailType.CoveredTrips.CoveredTrip();
    }

    /**
     * Create an instance of {@link QuotationType.Tariff }
     * 
     */
    public QuotationType.Tariff createQuotationTypeTariff() {
        return new QuotationType.Tariff();
    }

    /**
     * Create an instance of {@link QuotationType.Scheme }
     * 
     */
    public QuotationType.Scheme createQuotationTypeScheme() {
        return new QuotationType.Scheme();
    }

    /**
     * Create an instance of {@link PurchaseInfoType.Deadline }
     * 
     */
    public PurchaseInfoType.Deadline createPurchaseInfoTypeDeadline() {
        return new PurchaseInfoType.Deadline();
    }

    /**
     * Create an instance of {@link PurchaseInfoType.Ranges.Range.Max }
     * 
     */
    public PurchaseInfoType.Ranges.Range.Max createPurchaseInfoTypeRangesRangeMax() {
        return new PurchaseInfoType.Ranges.Range.Max();
    }

    /**
     * Create an instance of {@link PurchaseInfoType.Ranges.Range.Min }
     * 
     */
    public PurchaseInfoType.Ranges.Range.Min createPurchaseInfoTypeRangesRangeMin() {
        return new PurchaseInfoType.Ranges.Range.Min();
    }

    /**
     * Create an instance of {@link ItineraryInfoType.SpecialRequestDetails }
     * 
     */
    public ItineraryInfoType.SpecialRequestDetails createItineraryInfoTypeSpecialRequestDetails() {
        return new ItineraryInfoType.SpecialRequestDetails();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.FlightTypePref }
     * 
     */
    public AirSearchPrefsType.FlightTypePref createAirSearchPrefsTypeFlightTypePref() {
        return new AirSearchPrefsType.FlightTypePref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.FareRestrictPref }
     * 
     */
    public AirSearchPrefsType.FareRestrictPref createAirSearchPrefsTypeFareRestrictPref() {
        return new AirSearchPrefsType.FareRestrictPref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.CabinPref }
     * 
     */
    public AirSearchPrefsType.CabinPref createAirSearchPrefsTypeCabinPref() {
        return new AirSearchPrefsType.CabinPref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TicketDistribPref }
     * 
     */
    public AirSearchPrefsType.TicketDistribPref createAirSearchPrefsTypeTicketDistribPref() {
        return new AirSearchPrefsType.TicketDistribPref();
    }

    /**
     * Create an instance of {@link PromotionProfileType.FromPrices }
     * 
     */
    public PromotionProfileType.FromPrices createPromotionProfileTypeFromPrices() {
        return new PromotionProfileType.FromPrices();
    }

    /**
     * Create an instance of {@link VehicleAvailAdditionalInfoType.PricedCoverages }
     * 
     */
    public VehicleAvailAdditionalInfoType.PricedCoverages createVehicleAvailAdditionalInfoTypePricedCoverages() {
        return new VehicleAvailAdditionalInfoType.PricedCoverages();
    }

    /**
     * Create an instance of {@link PlanForQuoteRSType.QuoteDetail }
     * 
     */
    public PlanForQuoteRSType.QuoteDetail createPlanForQuoteRSTypeQuoteDetail() {
        return new PlanForQuoteRSType.QuoteDetail();
    }

    /**
     * Create an instance of {@link PlanForQuoteRSType.Description }
     * 
     */
    public PlanForQuoteRSType.Description createPlanForQuoteRSTypeDescription() {
        return new PlanForQuoteRSType.Description();
    }

    /**
     * Create an instance of {@link PlanForQuoteRSType.PlanCost.ExchangeRate }
     * 
     */
    public PlanForQuoteRSType.PlanCost.ExchangeRate createPlanForQuoteRSTypePlanCostExchangeRate() {
        return new PlanForQuoteRSType.PlanCost.ExchangeRate();
    }

    /**
     * Create an instance of {@link PlanForQuoteRSType.PlanCost.ReportingExchangeRates }
     * 
     */
    public PlanForQuoteRSType.PlanCost.ReportingExchangeRates createPlanForQuoteRSTypePlanCostReportingExchangeRates() {
        return new PlanForQuoteRSType.PlanCost.ReportingExchangeRates();
    }

    /**
     * Create an instance of {@link PlanForQuoteRSType.PlanCost.IncrementalPrices.IncrementalPrice }
     * 
     */
    public PlanForQuoteRSType.PlanCost.IncrementalPrices.IncrementalPrice createPlanForQuoteRSTypePlanCostIncrementalPricesIncrementalPrice() {
        return new PlanForQuoteRSType.PlanCost.IncrementalPrices.IncrementalPrice();
    }

    /**
     * Create an instance of {@link RailAmenityType.RailAmenity }
     * 
     */
    public RailAmenityType.RailAmenity createRailAmenityTypeRailAmenity() {
        return new RailAmenityType.RailAmenity();
    }

    /**
     * Create an instance of {@link RailOriginDestinationInformationType.OriginLocation }
     * 
     */
    public RailOriginDestinationInformationType.OriginLocation createRailOriginDestinationInformationTypeOriginLocation() {
        return new RailOriginDestinationInformationType.OriginLocation();
    }

    /**
     * Create an instance of {@link RailOriginDestinationInformationType.DestinationLocation }
     * 
     */
    public RailOriginDestinationInformationType.DestinationLocation createRailOriginDestinationInformationTypeDestinationLocation() {
        return new RailOriginDestinationInformationType.DestinationLocation();
    }

    /**
     * Create an instance of {@link PromotionProfilesType.PromotionProfiles }
     * 
     */
    public PromotionProfilesType.PromotionProfiles createPromotionProfilesTypePromotionProfiles() {
        return new PromotionProfilesType.PromotionProfiles();
    }

    /**
     * Create an instance of {@link DestActivityItemsType.Item }
     * 
     */
    public DestActivityItemsType.Item createDestActivityItemsTypeItem() {
        return new DestActivityItemsType.Item();
    }

    /**
     * Create an instance of {@link LoyaltyDetailType.SubAccountBalance }
     * 
     */
    public LoyaltyDetailType.SubAccountBalance createLoyaltyDetailTypeSubAccountBalance() {
        return new LoyaltyDetailType.SubAccountBalance();
    }

    /**
     * Create an instance of {@link LoyaltyDetailType.UpgradeAccountBalance }
     * 
     */
    public LoyaltyDetailType.UpgradeAccountBalance createLoyaltyDetailTypeUpgradeAccountBalance() {
        return new LoyaltyDetailType.UpgradeAccountBalance();
    }

    /**
     * Create an instance of {@link LoyaltyDetailType.Telephone }
     * 
     */
    public LoyaltyDetailType.Telephone createLoyaltyDetailTypeTelephone() {
        return new LoyaltyDetailType.Telephone();
    }

    /**
     * Create an instance of {@link LoyaltyDetailType.Email }
     * 
     */
    public LoyaltyDetailType.Email createLoyaltyDetailTypeEmail() {
        return new LoyaltyDetailType.Email();
    }

    /**
     * Create an instance of {@link LoyaltyDetailType.Document }
     * 
     */
    public LoyaltyDetailType.Document createLoyaltyDetailTypeDocument() {
        return new LoyaltyDetailType.Document();
    }

    /**
     * Create an instance of {@link ConnectionType.ConnectionLocation }
     * 
     */
    public ConnectionType.ConnectionLocation createConnectionTypeConnectionLocation() {
        return new ConnectionType.ConnectionLocation();
    }

    /**
     * Create an instance of {@link TravelClubType.ClubMemberName }
     * 
     */
    public TravelClubType.ClubMemberName createTravelClubTypeClubMemberName() {
        return new TravelClubType.ClubMemberName();
    }

    /**
     * Create an instance of {@link MessageType.OriginalPayloadStdAttributes }
     * 
     */
    public MessageType.OriginalPayloadStdAttributes createMessageTypeOriginalPayloadStdAttributes() {
        return new MessageType.OriginalPayloadStdAttributes();
    }

    /**
     * Create an instance of {@link CompanyInfoType.TelephoneInfo }
     * 
     */
    public CompanyInfoType.TelephoneInfo createCompanyInfoTypeTelephoneInfo() {
        return new CompanyInfoType.TelephoneInfo();
    }

    /**
     * Create an instance of {@link ServicesType.Service }
     * 
     */
    public ServicesType.Service createServicesTypeService() {
        return new ServicesType.Service();
    }

    /**
     * Create an instance of {@link MoreDataEchoTokensType.MoreDataEchoToken }
     * 
     */
    public MoreDataEchoTokensType.MoreDataEchoToken createMoreDataEchoTokensTypeMoreDataEchoToken() {
        return new MoreDataEchoTokensType.MoreDataEchoToken();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.PTCFareBreakdowns }
     * 
     */
    public TicketingFullInfoType.PTCFareBreakdowns createTicketingFullInfoTypePTCFareBreakdowns() {
        return new TicketingFullInfoType.PTCFareBreakdowns();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.PaymentTotal }
     * 
     */
    public TicketingFullInfoType.PaymentTotal createTicketingFullInfoTypePaymentTotal() {
        return new TicketingFullInfoType.PaymentTotal();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.PaymentInfo.PaymentDetail }
     * 
     */
    public TicketingFullInfoType.PaymentInfo.PaymentDetail createTicketingFullInfoTypePaymentInfoPaymentDetail() {
        return new TicketingFullInfoType.PaymentInfo.PaymentDetail();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.PaymentInfo.PaymentTotal }
     * 
     */
    public TicketingFullInfoType.PaymentInfo.PaymentTotal createTicketingFullInfoTypePaymentInfoPaymentTotal() {
        return new TicketingFullInfoType.PaymentInfo.PaymentTotal();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.Endorsements.Endorsement }
     * 
     */
    public TicketingFullInfoType.Endorsements.Endorsement createTicketingFullInfoTypeEndorsementsEndorsement() {
        return new TicketingFullInfoType.Endorsements.Endorsement();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.PassengerInfo.PassengerWeight }
     * 
     */
    public TicketingFullInfoType.PassengerInfo.PassengerWeight createTicketingFullInfoTypePassengerInfoPassengerWeight() {
        return new TicketingFullInfoType.PassengerInfo.PassengerWeight();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.PassengerInfo.ContactInfo }
     * 
     */
    public TicketingFullInfoType.PassengerInfo.ContactInfo createTicketingFullInfoTypePassengerInfoContactInfo() {
        return new TicketingFullInfoType.PassengerInfo.ContactInfo();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.PassengerInfo.PassengerType }
     * 
     */
    public TicketingFullInfoType.PassengerInfo.PassengerType createTicketingFullInfoTypePassengerInfoPassengerType() {
        return new TicketingFullInfoType.PassengerInfo.PassengerType();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.FlightInfo.CarrierInfo }
     * 
     */
    public TicketingFullInfoType.FlightInfo.CarrierInfo createTicketingFullInfoTypeFlightInfoCarrierInfo() {
        return new TicketingFullInfoType.FlightInfo.CarrierInfo();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.FlightInfo.DepartureInformation }
     * 
     */
    public TicketingFullInfoType.FlightInfo.DepartureInformation createTicketingFullInfoTypeFlightInfoDepartureInformation() {
        return new TicketingFullInfoType.FlightInfo.DepartureInformation();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.FlightInfo.ArrivalInformation }
     * 
     */
    public TicketingFullInfoType.FlightInfo.ArrivalInformation createTicketingFullInfoTypeFlightInfoArrivalInformation() {
        return new TicketingFullInfoType.FlightInfo.ArrivalInformation();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.FlightInfo.BookingInfo.BookingReferenceID }
     * 
     */
    public TicketingFullInfoType.FlightInfo.BookingInfo.BookingReferenceID createTicketingFullInfoTypeFlightInfoBookingInfoBookingReferenceID() {
        return new TicketingFullInfoType.FlightInfo.BookingInfo.BookingReferenceID();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.FlightInfo.ServiceDetails.MealService }
     * 
     */
    public TicketingFullInfoType.FlightInfo.ServiceDetails.MealService createTicketingFullInfoTypeFlightInfoServiceDetailsMealService() {
        return new TicketingFullInfoType.FlightInfo.ServiceDetails.MealService();
    }

    /**
     * Create an instance of {@link TicketingFullInfoType.ConjunctiveTicketNbr.CouponInfo }
     * 
     */
    public TicketingFullInfoType.ConjunctiveTicketNbr.CouponInfo createTicketingFullInfoTypeConjunctiveTicketNbrCouponInfo() {
        return new TicketingFullInfoType.ConjunctiveTicketNbr.CouponInfo();
    }

    /**
     * Create an instance of {@link RatePlanUserTypeRestrictions.UserType }
     * 
     */
    public RatePlanUserTypeRestrictions.UserType createRatePlanUserTypeRestrictionsUserType() {
        return new RatePlanUserTypeRestrictions.UserType();
    }

    /**
     * Create an instance of {@link FlightAmenitiesType.Seat }
     * 
     */
    public FlightAmenitiesType.Seat createFlightAmenitiesTypeSeat() {
        return new FlightAmenitiesType.Seat();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType.Age.AgeSurcharge }
     * 
     */
    public VehicleAgeRequirementsType.Age.AgeSurcharge createVehicleAgeRequirementsTypeAgeAgeSurcharge() {
        return new VehicleAgeRequirementsType.Age.AgeSurcharge();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType.Age.Vehicles.Vehicle }
     * 
     */
    public VehicleAgeRequirementsType.Age.Vehicles.Vehicle createVehicleAgeRequirementsTypeAgeVehiclesVehicle() {
        return new VehicleAgeRequirementsType.Age.Vehicles.Vehicle();
    }

    /**
     * Create an instance of {@link VehicleAgeRequirementsType.Age.AgeInfos.AgeInfo }
     * 
     */
    public VehicleAgeRequirementsType.Age.AgeInfos.AgeInfo createVehicleAgeRequirementsTypeAgeAgeInfosAgeInfo() {
        return new VehicleAgeRequirementsType.Age.AgeInfos.AgeInfo();
    }

    /**
     * Create an instance of {@link BaseInvCountType.StatusApplicationControl }
     * 
     */
    public BaseInvCountType.StatusApplicationControl createBaseInvCountTypeStatusApplicationControl() {
        return new BaseInvCountType.StatusApplicationControl();
    }

    /**
     * Create an instance of {@link BaseInvCountType.OffSell }
     * 
     */
    public BaseInvCountType.OffSell createBaseInvCountTypeOffSell() {
        return new BaseInvCountType.OffSell();
    }

    /**
     * Create an instance of {@link BaseInvCountType.InvCounts.InvCount.InvBlockCutoff }
     * 
     */
    public BaseInvCountType.InvCounts.InvCount.InvBlockCutoff createBaseInvCountTypeInvCountsInvCountInvBlockCutoff() {
        return new BaseInvCountType.InvCounts.InvCount.InvBlockCutoff();
    }

    /**
     * Create an instance of {@link TagsType.Tag }
     * 
     */
    public TagsType.Tag createTagsTypeTag() {
        return new TagsType.Tag();
    }

    /**
     * Create an instance of {@link OntologyDimensionType.DimensionUnit }
     * 
     */
    public OntologyDimensionType.DimensionUnit createOntologyDimensionTypeDimensionUnit() {
        return new OntologyDimensionType.DimensionUnit();
    }

    /**
     * Create an instance of {@link AuthorizationType.CheckAuthorization }
     * 
     */
    public AuthorizationType.CheckAuthorization createAuthorizationTypeCheckAuthorization() {
        return new AuthorizationType.CheckAuthorization();
    }

    /**
     * Create an instance of {@link AuthorizationType.CreditCardAuthorization }
     * 
     */
    public AuthorizationType.CreditCardAuthorization createAuthorizationTypeCreditCardAuthorization() {
        return new AuthorizationType.CreditCardAuthorization();
    }

    /**
     * Create an instance of {@link AuthorizationType.Queue }
     * 
     */
    public AuthorizationType.Queue createAuthorizationTypeQueue() {
        return new AuthorizationType.Queue();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.LoyaltyPref }
     * 
     */
    public VehicleProfileRentalPrefType.LoyaltyPref createVehicleProfileRentalPrefTypeLoyaltyPref() {
        return new VehicleProfileRentalPrefType.LoyaltyPref();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.PaymentFormPref }
     * 
     */
    public VehicleProfileRentalPrefType.PaymentFormPref createVehicleProfileRentalPrefTypePaymentFormPref() {
        return new VehicleProfileRentalPrefType.PaymentFormPref();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.CoveragePref }
     * 
     */
    public VehicleProfileRentalPrefType.CoveragePref createVehicleProfileRentalPrefTypeCoveragePref() {
        return new VehicleProfileRentalPrefType.CoveragePref();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.SpecialEquipPref }
     * 
     */
    public VehicleProfileRentalPrefType.SpecialEquipPref createVehicleProfileRentalPrefTypeSpecialEquipPref() {
        return new VehicleProfileRentalPrefType.SpecialEquipPref();
    }

    /**
     * Create an instance of {@link PricedItineraryExtendType.ExchangeRate }
     * 
     */
    public PricedItineraryExtendType.ExchangeRate createPricedItineraryExtendTypeExchangeRate() {
        return new PricedItineraryExtendType.ExchangeRate();
    }

    /**
     * Create an instance of {@link PricedItineraryExtendType.ReportingExchangeRates }
     * 
     */
    public PricedItineraryExtendType.ReportingExchangeRates createPricedItineraryExtendTypeReportingExchangeRates() {
        return new PricedItineraryExtendType.ReportingExchangeRates();
    }

    /**
     * Create an instance of {@link PricedItineraryExtendType.PTCDocTypes }
     * 
     */
    public PricedItineraryExtendType.PTCDocTypes createPricedItineraryExtendTypePTCDocTypes() {
        return new PricedItineraryExtendType.PTCDocTypes();
    }

    /**
     * Create an instance of {@link ReferenceDataType.Airport }
     * 
     */
    public ReferenceDataType.Airport createReferenceDataTypeAirport() {
        return new ReferenceDataType.Airport();
    }

    /**
     * Create an instance of {@link AirSearchCriteriaType.OriginDestinationOption }
     * 
     */
    public AirSearchCriteriaType.OriginDestinationOption createAirSearchCriteriaTypeOriginDestinationOption() {
        return new AirSearchCriteriaType.OriginDestinationOption();
    }

    /**
     * Create an instance of {@link AirSearchCriteriaType.TravelerInfoSummary }
     * 
     */
    public AirSearchCriteriaType.TravelerInfoSummary createAirSearchCriteriaTypeTravelerInfoSummary() {
        return new AirSearchCriteriaType.TravelerInfoSummary();
    }

    /**
     * Create an instance of {@link FerryInvoiceDetail.NetAmount }
     * 
     */
    public FerryInvoiceDetail.NetAmount createFerryInvoiceDetailNetAmount() {
        return new FerryInvoiceDetail.NetAmount();
    }

    /**
     * Create an instance of {@link FerryInvoiceDetail.BalanceDueAmount }
     * 
     */
    public FerryInvoiceDetail.BalanceDueAmount createFerryInvoiceDetailBalanceDueAmount() {
        return new FerryInvoiceDetail.BalanceDueAmount();
    }

    /**
     * Create an instance of {@link FerryInvoiceDetail.CostingItems.CostingItem }
     * 
     */
    public FerryInvoiceDetail.CostingItems.CostingItem createFerryInvoiceDetailCostingItemsCostingItem() {
        return new FerryInvoiceDetail.CostingItems.CostingItem();
    }

    /**
     * Create an instance of {@link FulfillmentType.PaymentDetails }
     * 
     */
    public FulfillmentType.PaymentDetails createFulfillmentTypePaymentDetails() {
        return new FulfillmentType.PaymentDetails();
    }

    /**
     * Create an instance of {@link FulfillmentType.Name }
     * 
     */
    public FulfillmentType.Name createFulfillmentTypeName() {
        return new FulfillmentType.Name();
    }

    /**
     * Create an instance of {@link FulfillmentType.HolderInfo }
     * 
     */
    public FulfillmentType.HolderInfo createFulfillmentTypeHolderInfo() {
        return new FulfillmentType.HolderInfo();
    }

    /**
     * Create an instance of {@link FulfillmentType.Invoice }
     * 
     */
    public FulfillmentType.Invoice createFulfillmentTypeInvoice() {
        return new FulfillmentType.Invoice();
    }

    /**
     * Create an instance of {@link SpecialType.Special.Text }
     * 
     */
    public SpecialType.Special.Text createSpecialTypeSpecialText() {
        return new SpecialType.Special.Text();
    }

    /**
     * Create an instance of {@link OntologyOfferType.Offer }
     * 
     */
    public OntologyOfferType.Offer createOntologyOfferTypeOffer() {
        return new OntologyOfferType.Offer();
    }

    /**
     * Create an instance of {@link OptionListInputType.SelectedItem }
     * 
     */
    public OptionListInputType.SelectedItem createOptionListInputTypeSelectedItem() {
        return new OptionListInputType.SelectedItem();
    }

    /**
     * Create an instance of {@link BookedTrainSegmentType.Assignment }
     * 
     */
    public BookedTrainSegmentType.Assignment createBookedTrainSegmentTypeAssignment() {
        return new BookedTrainSegmentType.Assignment();
    }

    /**
     * Create an instance of {@link AccommodationServiceType.AccommodationDetail }
     * 
     */
    public AccommodationServiceType.AccommodationDetail createAccommodationServiceTypeAccommodationDetail() {
        return new AccommodationServiceType.AccommodationDetail();
    }

    /**
     * Create an instance of {@link FlightRefInfoType.Departure }
     * 
     */
    public FlightRefInfoType.Departure createFlightRefInfoTypeDeparture() {
        return new FlightRefInfoType.Departure();
    }

    /**
     * Create an instance of {@link FlightRefInfoType.Arrival }
     * 
     */
    public FlightRefInfoType.Arrival createFlightRefInfoTypeArrival() {
        return new FlightRefInfoType.Arrival();
    }

    /**
     * Create an instance of {@link SpecialSrvcType.SSRType }
     * 
     */
    public SpecialSrvcType.SSRType createSpecialSrvcTypeSSRType() {
        return new SpecialSrvcType.SSRType();
    }

    /**
     * Create an instance of {@link SpecialSrvcType.OtherType }
     * 
     */
    public SpecialSrvcType.OtherType createSpecialSrvcTypeOtherType() {
        return new SpecialSrvcType.OtherType();
    }

    /**
     * Create an instance of {@link ServicesFilterType.Attributes.Group }
     * 
     */
    public ServicesFilterType.Attributes.Group createServicesFilterTypeAttributesGroup() {
        return new ServicesFilterType.Attributes.Group();
    }

    /**
     * Create an instance of {@link ServicesFilterType.Attributes.SubGroup }
     * 
     */
    public ServicesFilterType.Attributes.SubGroup createServicesFilterTypeAttributesSubGroup() {
        return new ServicesFilterType.Attributes.SubGroup();
    }

    /**
     * Create an instance of {@link DeliItineraryStatusType.CommitDate }
     * 
     */
    public DeliItineraryStatusType.CommitDate createDeliItineraryStatusTypeCommitDate() {
        return new DeliItineraryStatusType.CommitDate();
    }

    /**
     * Create an instance of {@link DeliItineraryStatusType.DepDate }
     * 
     */
    public DeliItineraryStatusType.DepDate createDeliItineraryStatusTypeDepDate() {
        return new DeliItineraryStatusType.DepDate();
    }

    /**
     * Create an instance of {@link DeliItineraryStatusType.TicketNo }
     * 
     */
    public DeliItineraryStatusType.TicketNo createDeliItineraryStatusTypeTicketNo() {
        return new DeliItineraryStatusType.TicketNo();
    }

    /**
     * Create an instance of {@link DeliItineraryStatusType.UserID }
     * 
     */
    public DeliItineraryStatusType.UserID createDeliItineraryStatusTypeUserID() {
        return new DeliItineraryStatusType.UserID();
    }

    /**
     * Create an instance of {@link DeliItineraryStatusType.Address }
     * 
     */
    public DeliItineraryStatusType.Address createDeliItineraryStatusTypeAddress() {
        return new DeliItineraryStatusType.Address();
    }

    /**
     * Create an instance of {@link DeliItineraryStatusType.TicketStatus }
     * 
     */
    public DeliItineraryStatusType.TicketStatus createDeliItineraryStatusTypeTicketStatus() {
        return new DeliItineraryStatusType.TicketStatus();
    }

    /**
     * Create an instance of {@link AssociatedBookingsType.Booking.Customer.Primary.Profile }
     * 
     */
    public AssociatedBookingsType.Booking.Customer.Primary.Profile createAssociatedBookingsTypeBookingCustomerPrimaryProfile() {
        return new AssociatedBookingsType.Booking.Customer.Primary.Profile();
    }

    /**
     * Create an instance of {@link SuperPNRType.CrossRefs.UniqueID }
     * 
     */
    public SuperPNRType.CrossRefs.UniqueID createSuperPNRTypeCrossRefsUniqueID() {
        return new SuperPNRType.CrossRefs.UniqueID();
    }

    /**
     * Create an instance of {@link SuperPNRType.Attachments.Attachment }
     * 
     */
    public SuperPNRType.Attachments.Attachment createSuperPNRTypeAttachmentsAttachment() {
        return new SuperPNRType.Attachments.Attachment();
    }

    /**
     * Create an instance of {@link SuperPNRType.BackendAudits.BackendAudit }
     * 
     */
    public SuperPNRType.BackendAudits.BackendAudit createSuperPNRTypeBackendAuditsBackendAudit() {
        return new SuperPNRType.BackendAudits.BackendAudit();
    }

    /**
     * Create an instance of {@link OJCustomerPrimaryAdditionalType.Additional }
     * 
     */
    public OJCustomerPrimaryAdditionalType.Additional createOJCustomerPrimaryAdditionalTypeAdditional() {
        return new OJCustomerPrimaryAdditionalType.Additional();
    }

    /**
     * Create an instance of {@link OJCustomerPrimaryAdditionalType.Primary.ShareReward }
     * 
     */
    public OJCustomerPrimaryAdditionalType.Primary.ShareReward createOJCustomerPrimaryAdditionalTypePrimaryShareReward() {
        return new OJCustomerPrimaryAdditionalType.Primary.ShareReward();
    }

    /**
     * Create an instance of {@link SuperPNRType.Queues.Queue }
     * 
     */
    public SuperPNRType.Queues.Queue createSuperPNRTypeQueuesQueue() {
        return new SuperPNRType.Queues.Queue();
    }

    /**
     * Create an instance of {@link PaymentDetailsType.Balance }
     * 
     */
    public PaymentDetailsType.Balance createPaymentDetailsTypeBalance() {
        return new PaymentDetailsType.Balance();
    }

    /**
     * Create an instance of {@link OJAmendPenaltiesType.AmendPenalty }
     * 
     */
    public OJAmendPenaltiesType.AmendPenalty createOJAmendPenaltiesTypeAmendPenalty() {
        return new OJAmendPenaltiesType.AmendPenalty();
    }

    /**
     * Create an instance of {@link ProductPricingType.ReportingExchangeRates }
     * 
     */
    public ProductPricingType.ReportingExchangeRates createProductPricingTypeReportingExchangeRates() {
        return new ProductPricingType.ReportingExchangeRates();
    }

    /**
     * Create an instance of {@link ProductPricingType.PostPayTotal }
     * 
     */
    public ProductPricingType.PostPayTotal createProductPricingTypePostPayTotal() {
        return new ProductPricingType.PostPayTotal();
    }

    /**
     * Create an instance of {@link ProductPricingType.PrePayTotal }
     * 
     */
    public ProductPricingType.PrePayTotal createProductPricingTypePrePayTotal() {
        return new ProductPricingType.PrePayTotal();
    }

    /**
     * Create an instance of {@link ProductPricingType.TotalPrice }
     * 
     */
    public ProductPricingType.TotalPrice createProductPricingTypeTotalPrice() {
        return new ProductPricingType.TotalPrice();
    }

    /**
     * Create an instance of {@link ProductPricingType.InfoAmount }
     * 
     */
    public ProductPricingType.InfoAmount createProductPricingTypeInfoAmount() {
        return new ProductPricingType.InfoAmount();
    }

    /**
     * Create an instance of {@link ModularProductType.CrossRefs.UniqueID }
     * 
     */
    public ModularProductType.CrossRefs.UniqueID createModularProductTypeCrossRefsUniqueID() {
        return new ModularProductType.CrossRefs.UniqueID();
    }

    /**
     * Create an instance of {@link ModularProductType.PaymentRefs.PaymentRef }
     * 
     */
    public ModularProductType.PaymentRefs.PaymentRef createModularProductTypePaymentRefsPaymentRef() {
        return new ModularProductType.PaymentRefs.PaymentRef();
    }

    /**
     * Create an instance of {@link XPromotionType.Search.Top }
     * 
     */
    public XPromotionType.Search.Top createXPromotionTypeSearchTop() {
        return new XPromotionType.Search.Top();
    }

    /**
     * Create an instance of {@link XPromotionType.Search.Cheapest }
     * 
     */
    public XPromotionType.Search.Cheapest createXPromotionTypeSearchCheapest() {
        return new XPromotionType.Search.Cheapest();
    }

    /**
     * Create an instance of {@link ServiceCombineType.ServiceItem }
     * 
     */
    public ServiceCombineType.ServiceItem createServiceCombineTypeServiceItem() {
        return new ServiceCombineType.ServiceItem();
    }

    /**
     * Create an instance of {@link ServiceRefInfoType.ServicePrice }
     * 
     */
    public ServiceRefInfoType.ServicePrice createServiceRefInfoTypeServicePrice() {
        return new ServiceRefInfoType.ServicePrice();
    }

    /**
     * Create an instance of {@link ServiceBundleNoPriceRefType.Item.ItemDetail.DescriptionDetails }
     * 
     */
    public ServiceBundleNoPriceRefType.Item.ItemDetail.DescriptionDetails createServiceBundleNoPriceRefTypeItemItemDetailDescriptionDetails() {
        return new ServiceBundleNoPriceRefType.Item.ItemDetail.DescriptionDetails();
    }

    /**
     * Create an instance of {@link ServiceBundleNoPriceRefType.Item.ItemDetail.BookingInstructions.UpgradeMethod }
     * 
     */
    public ServiceBundleNoPriceRefType.Item.ItemDetail.BookingInstructions.UpgradeMethod createServiceBundleNoPriceRefTypeItemItemDetailBookingInstructionsUpgradeMethod() {
        return new ServiceBundleNoPriceRefType.Item.ItemDetail.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link TaxConfiguration.TaxPolicies.TaxPolicy }
     * 
     */
    public TaxConfiguration.TaxPolicies.TaxPolicy createTaxConfigurationTaxPoliciesTaxPolicy() {
        return new TaxConfiguration.TaxPolicies.TaxPolicy();
    }

    /**
     * Create an instance of {@link ComponentType.Marketing.Images }
     * 
     */
    public ComponentType.Marketing.Images createComponentTypeMarketingImages() {
        return new ComponentType.Marketing.Images();
    }

    /**
     * Create an instance of {@link ComponentType.Marketing.Links }
     * 
     */
    public ComponentType.Marketing.Links createComponentTypeMarketingLinks() {
        return new ComponentType.Marketing.Links();
    }

    /**
     * Create an instance of {@link ComponentType.Marketing.Message }
     * 
     */
    public ComponentType.Marketing.Message createComponentTypeMarketingMessage() {
        return new ComponentType.Marketing.Message();
    }

    /**
     * Create an instance of {@link ComponentType.Location.Row }
     * 
     */
    public ComponentType.Location.Row createComponentTypeLocationRow() {
        return new ComponentType.Location.Row();
    }

    /**
     * Create an instance of {@link ComponentType.Location.Column }
     * 
     */
    public ComponentType.Location.Column createComponentTypeLocationColumn() {
        return new ComponentType.Location.Column();
    }

    /**
     * Create an instance of {@link ComponentType.Location.Space.RowRange }
     * 
     */
    public ComponentType.Location.Space.RowRange createComponentTypeLocationSpaceRowRange() {
        return new ComponentType.Location.Space.RowRange();
    }

    /**
     * Create an instance of {@link ComponentType.Location.Space.ColumnRange }
     * 
     */
    public ComponentType.Location.Space.ColumnRange createComponentTypeLocationSpaceColumnRange() {
        return new ComponentType.Location.Space.ColumnRange();
    }

    /**
     * Create an instance of {@link ComponentType.Dimensions.ActualSize }
     * 
     */
    public ComponentType.Dimensions.ActualSize createComponentTypeDimensionsActualSize() {
        return new ComponentType.Dimensions.ActualSize();
    }

    /**
     * Create an instance of {@link ServicePriceType.ServicePriceCalculation.Operation.Adjustment }
     * 
     */
    public ServicePriceType.ServicePriceCalculation.Operation.Adjustment createServicePriceTypeServicePriceCalculationOperationAdjustment() {
        return new ServicePriceType.ServicePriceCalculation.Operation.Adjustment();
    }

    /**
     * Create an instance of {@link ServicePriceType.ServicePriceCalculation.Operation.DescriptionDetails }
     * 
     */
    public ServicePriceType.ServicePriceCalculation.Operation.DescriptionDetails createServicePriceTypeServicePriceCalculationOperationDescriptionDetails() {
        return new ServicePriceType.ServicePriceCalculation.Operation.DescriptionDetails();
    }

    /**
     * Create an instance of {@link ServicePriceType.ServicePriceCalculation.Operation.RedemptionCurrency }
     * 
     */
    public ServicePriceType.ServicePriceCalculation.Operation.RedemptionCurrency createServicePriceTypeServicePriceCalculationOperationRedemptionCurrency() {
        return new ServicePriceType.ServicePriceCalculation.Operation.RedemptionCurrency();
    }

    /**
     * Create an instance of {@link RedemptionType.Transactions.Transaction.RedeemedProduct }
     * 
     */
    public RedemptionType.Transactions.Transaction.RedeemedProduct createRedemptionTypeTransactionsTransactionRedeemedProduct() {
        return new RedemptionType.Transactions.Transaction.RedeemedProduct();
    }

    /**
     * Create an instance of {@link RedemptionType.Accruals.Accrual }
     * 
     */
    public RedemptionType.Accruals.Accrual createRedemptionTypeAccrualsAccrual() {
        return new RedemptionType.Accruals.Accrual();
    }

    /**
     * Create an instance of {@link ExemptTaxType.Tax.CollectionPoint }
     * 
     */
    public ExemptTaxType.Tax.CollectionPoint createExemptTaxTypeTaxCollectionPoint() {
        return new ExemptTaxType.Tax.CollectionPoint();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.RatePlans.RatePlan.InvCounts.InvCount }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.RatePlans.RatePlan.InvCounts.InvCount createRatePlansRatePlanInvCountsInvCount() {
        return new com.airchina.datacenter.spnr.sdk.entity.RatePlans.RatePlan.InvCounts.InvCount();
    }

    /**
     * Create an instance of {@link DerivationType.Discount }
     * 
     */
    public DerivationType.Discount createDerivationTypeDiscount() {
        return new DerivationType.Discount();
    }

    /**
     * Create an instance of {@link DerivationType.TourCode }
     * 
     */
    public DerivationType.TourCode createDerivationTypeTourCode() {
        return new DerivationType.TourCode();
    }

    /**
     * Create an instance of {@link DerivationType.Certificate.ProgramName }
     * 
     */
    public DerivationType.Certificate.ProgramName createDerivationTypeCertificateProgramName() {
        return new DerivationType.Certificate.ProgramName();
    }

    /**
     * Create an instance of {@link DerivationType.Certificate.Holder }
     * 
     */
    public DerivationType.Certificate.Holder createDerivationTypeCertificateHolder() {
        return new DerivationType.Certificate.Holder();
    }

    /**
     * Create an instance of {@link MediaContentType.MediaLinks.Link }
     * 
     */
    public MediaContentType.MediaLinks.Link createMediaContentTypeMediaLinksLink() {
        return new MediaContentType.MediaLinks.Link();
    }

    /**
     * Create an instance of {@link MediaContentType.Images.Image }
     * 
     */
    public MediaContentType.Images.Image createMediaContentTypeImagesImage() {
        return new MediaContentType.Images.Image();
    }

    /**
     * Create an instance of {@link MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.ImageFormat }
     * 
     */
    public MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.ImageFormat createMultimediaObjectsTypeMultimediaObjectImageItemsImageItemImageFormat() {
        return new MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.ImageFormat();
    }

    /**
     * Create an instance of {@link MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.Text }
     * 
     */
    public MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.Text createMultimediaObjectsTypeMultimediaObjectImageItemsImageItemText() {
        return new MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.Text();
    }

    /**
     * Create an instance of {@link PTCsFromDestActivityCommonTypes.PTC }
     * 
     */
    public PTCsFromDestActivityCommonTypes.PTC createPTCsFromDestActivityCommonTypesPTC() {
        return new PTCsFromDestActivityCommonTypes.PTC();
    }

    /**
     * Create an instance of {@link SearchType.DateInformation }
     * 
     */
    public SearchType.DateInformation createSearchTypeDateInformation() {
        return new SearchType.DateInformation();
    }

    /**
     * Create an instance of {@link SearchType.AirlinePrefs }
     * 
     */
    public SearchType.AirlinePrefs createSearchTypeAirlinePrefs() {
        return new SearchType.AirlinePrefs();
    }

    /**
     * Create an instance of {@link SearchType.VehicleInformation }
     * 
     */
    public SearchType.VehicleInformation createSearchTypeVehicleInformation() {
        return new SearchType.VehicleInformation();
    }

    /**
     * Create an instance of {@link SearchType.AirlineIBEIntegration }
     * 
     */
    public SearchType.AirlineIBEIntegration createSearchTypeAirlineIBEIntegration() {
        return new SearchType.AirlineIBEIntegration();
    }

    /**
     * Create an instance of {@link SearchType.Passengers.ChildAges }
     * 
     */
    public SearchType.Passengers.ChildAges createSearchTypePassengersChildAges() {
        return new SearchType.Passengers.ChildAges();
    }

    /**
     * Create an instance of {@link SearchType.Passengers.InfantAges }
     * 
     */
    public SearchType.Passengers.InfantAges createSearchTypePassengersInfantAges() {
        return new SearchType.Passengers.InfantAges();
    }

    /**
     * Create an instance of {@link SearchType.Passengers.AdultFareBreakdown }
     * 
     */
    public SearchType.Passengers.AdultFareBreakdown createSearchTypePassengersAdultFareBreakdown() {
        return new SearchType.Passengers.AdultFareBreakdown();
    }

    /**
     * Create an instance of {@link SearchType.Passengers.ChildFareBreakdown }
     * 
     */
    public SearchType.Passengers.ChildFareBreakdown createSearchTypePassengersChildFareBreakdown() {
        return new SearchType.Passengers.ChildFareBreakdown();
    }

    /**
     * Create an instance of {@link SearchType.Passengers.InfantFareBreakdown }
     * 
     */
    public SearchType.Passengers.InfantFareBreakdown createSearchTypePassengersInfantFareBreakdown() {
        return new SearchType.Passengers.InfantFareBreakdown();
    }

    /**
     * Create an instance of {@link SearchType.OriginDestinationInformation.Origin }
     * 
     */
    public SearchType.OriginDestinationInformation.Origin createSearchTypeOriginDestinationInformationOrigin() {
        return new SearchType.OriginDestinationInformation.Origin();
    }

    /**
     * Create an instance of {@link SearchType.OriginDestinationInformation.Destination }
     * 
     */
    public SearchType.OriginDestinationInformation.Destination createSearchTypeOriginDestinationInformationDestination() {
        return new SearchType.OriginDestinationInformation.Destination();
    }

    /**
     * Create an instance of {@link SearchType.OriginDestinationInformation.FlightDetails.FlightSegment }
     * 
     */
    public SearchType.OriginDestinationInformation.FlightDetails.FlightSegment createSearchTypeOriginDestinationInformationFlightDetailsFlightSegment() {
        return new SearchType.OriginDestinationInformation.FlightDetails.FlightSegment();
    }

    /**
     * Create an instance of {@link SearchType.HotelInformation.RoomInformation.ChildAges }
     * 
     */
    public SearchType.HotelInformation.RoomInformation.ChildAges createSearchTypeHotelInformationRoomInformationChildAges() {
        return new SearchType.HotelInformation.RoomInformation.ChildAges();
    }

    /**
     * Create an instance of {@link JourneyControlType.JCDFlight.JCDDeparture }
     * 
     */
    public JourneyControlType.JCDFlight.JCDDeparture createJourneyControlTypeJCDFlightJCDDeparture() {
        return new JourneyControlType.JCDFlight.JCDDeparture();
    }

    /**
     * Create an instance of {@link JourneyControlType.JCDFlight.JCDArrival }
     * 
     */
    public JourneyControlType.JCDFlight.JCDArrival createJourneyControlTypeJCDFlightJCDArrival() {
        return new JourneyControlType.JCDFlight.JCDArrival();
    }

    /**
     * Create an instance of {@link JourneyControlType.JCDFlight.JCDDate }
     * 
     */
    public JourneyControlType.JCDFlight.JCDDate createJourneyControlTypeJCDFlightJCDDate() {
        return new JourneyControlType.JCDFlight.JCDDate();
    }

    /**
     * Create an instance of {@link JourneyControlType.JCDFlight.Carrier }
     * 
     */
    public JourneyControlType.JCDFlight.Carrier createJourneyControlTypeJCDFlightCarrier() {
        return new JourneyControlType.JCDFlight.Carrier();
    }

    /**
     * Create an instance of {@link JourneyControlType.JCDFlight.OperatingCarrier }
     * 
     */
    public JourneyControlType.JCDFlight.OperatingCarrier createJourneyControlTypeJCDFlightOperatingCarrier() {
        return new JourneyControlType.JCDFlight.OperatingCarrier();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ExchangeRate }
     * 
     */
    public DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ExchangeRate createDestActivityDescriptiveContentsTypeDestActivityDescriptiveContentExchangeRate() {
        return new DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ExchangeRate();
    }

    /**
     * Create an instance of {@link DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ReportingExchangeRates }
     * 
     */
    public DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ReportingExchangeRates createDestActivityDescriptiveContentsTypeDestActivityDescriptiveContentReportingExchangeRates() {
        return new DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ReportingExchangeRates();
    }

    /**
     * Create an instance of {@link CorporateHierarchiesType.CorporateHierarchy }
     * 
     */
    public CorporateHierarchiesType.CorporateHierarchy createCorporateHierarchiesTypeCorporateHierarchy() {
        return new CorporateHierarchiesType.CorporateHierarchy();
    }

    /**
     * Create an instance of {@link FreqGuestNumberType.Association }
     * 
     */
    public FreqGuestNumberType.Association createFreqGuestNumberTypeAssociation() {
        return new FreqGuestNumberType.Association();
    }

    /**
     * Create an instance of {@link ServiceIncentiveDataType.Offer.OfferCodeID }
     * 
     */
    public ServiceIncentiveDataType.Offer.OfferCodeID createServiceIncentiveDataTypeOfferOfferCodeID() {
        return new ServiceIncentiveDataType.Offer.OfferCodeID();
    }

    /**
     * Create an instance of {@link ServiceIncentiveDataType.Offer.DiscountLevel }
     * 
     */
    public ServiceIncentiveDataType.Offer.DiscountLevel createServiceIncentiveDataTypeOfferDiscountLevel() {
        return new ServiceIncentiveDataType.Offer.DiscountLevel();
    }

    /**
     * Create an instance of {@link SeatDataType.Size }
     * 
     */
    public SeatDataType.Size createSeatDataTypeSize() {
        return new SeatDataType.Size();
    }

    /**
     * Create an instance of {@link SeatDataType.Marketing.Images }
     * 
     */
    public SeatDataType.Marketing.Images createSeatDataTypeMarketingImages() {
        return new SeatDataType.Marketing.Images();
    }

    /**
     * Create an instance of {@link SeatDataType.Marketing.Links }
     * 
     */
    public SeatDataType.Marketing.Links createSeatDataTypeMarketingLinks() {
        return new SeatDataType.Marketing.Links();
    }

    /**
     * Create an instance of {@link SeatDataType.Marketing.Message }
     * 
     */
    public SeatDataType.Marketing.Message createSeatDataTypeMarketingMessage() {
        return new SeatDataType.Marketing.Message();
    }

    /**
     * Create an instance of {@link SaleInfoType.CityCode }
     * 
     */
    public SaleInfoType.CityCode createSaleInfoTypeCityCode() {
        return new SaleInfoType.CityCode();
    }

    /**
     * Create an instance of {@link SaleInfoType.CountryCode }
     * 
     */
    public SaleInfoType.CountryCode createSaleInfoTypeCountryCode() {
        return new SaleInfoType.CountryCode();
    }

    /**
     * Create an instance of {@link SaleInfoType.RequestTime }
     * 
     */
    public SaleInfoType.RequestTime createSaleInfoTypeRequestTime() {
        return new SaleInfoType.RequestTime();
    }

    /**
     * Create an instance of {@link SaleInfoType.Identification.AggregatorInfo }
     * 
     */
    public SaleInfoType.Identification.AggregatorInfo createSaleInfoTypeIdentificationAggregatorInfo() {
        return new SaleInfoType.Identification.AggregatorInfo();
    }

    /**
     * Create an instance of {@link SaleInfoType.Identification.RequestorInfo.OtherAgencyID }
     * 
     */
    public SaleInfoType.Identification.RequestorInfo.OtherAgencyID createSaleInfoTypeIdentificationRequestorInfoOtherAgencyID() {
        return new SaleInfoType.Identification.RequestorInfo.OtherAgencyID();
    }

    /**
     * Create an instance of {@link SaleInfoType.Identification.RequestorInfo.AccountInfo }
     * 
     */
    public SaleInfoType.Identification.RequestorInfo.AccountInfo createSaleInfoTypeIdentificationRequestorInfoAccountInfo() {
        return new SaleInfoType.Identification.RequestorInfo.AccountInfo();
    }

    /**
     * Create an instance of {@link CommissionType.CommissionableAmount }
     * 
     */
    public CommissionType.CommissionableAmount createCommissionTypeCommissionableAmount() {
        return new CommissionType.CommissionableAmount();
    }

    /**
     * Create an instance of {@link CommissionType.PrepaidAmount }
     * 
     */
    public CommissionType.PrepaidAmount createCommissionTypePrepaidAmount() {
        return new CommissionType.PrepaidAmount();
    }

    /**
     * Create an instance of {@link CommissionType.FlatCommission }
     * 
     */
    public CommissionType.FlatCommission createCommissionTypeFlatCommission() {
        return new CommissionType.FlatCommission();
    }

    /**
     * Create an instance of {@link CommissionType.CommissionPayableAmount }
     * 
     */
    public CommissionType.CommissionPayableAmount createCommissionTypeCommissionPayableAmount() {
        return new CommissionType.CommissionPayableAmount();
    }

    /**
     * Create an instance of {@link AttributesType.Group }
     * 
     */
    public AttributesType.Group createAttributesTypeGroup() {
        return new AttributesType.Group();
    }

    /**
     * Create an instance of {@link AttributesType.SubGroup }
     * 
     */
    public AttributesType.SubGroup createAttributesTypeSubGroup() {
        return new AttributesType.SubGroup();
    }

    /**
     * Create an instance of {@link AttributesType.Desc1 }
     * 
     */
    public AttributesType.Desc1 createAttributesTypeDesc1() {
        return new AttributesType.Desc1();
    }

    /**
     * Create an instance of {@link AttributesType.Desc2 }
     * 
     */
    public AttributesType.Desc2 createAttributesTypeDesc2() {
        return new AttributesType.Desc2();
    }

    /**
     * Create an instance of {@link DestActivityDescriptions.Renovation.Text }
     * 
     */
    public DestActivityDescriptions.Renovation.Text createDestActivityDescriptionsRenovationText() {
        return new DestActivityDescriptions.Renovation.Text();
    }

    /**
     * Create an instance of {@link AccommodationCategoryType.Accommodation }
     * 
     */
    public AccommodationCategoryType.Accommodation createAccommodationCategoryTypeAccommodation() {
        return new AccommodationCategoryType.Accommodation();
    }

    /**
     * Create an instance of {@link AvailabilityRates.SellingRestrictions.DistributionChannels.DistributionChannel }
     * 
     */
    public AvailabilityRates.SellingRestrictions.DistributionChannels.DistributionChannel createAvailabilityRatesSellingRestrictionsDistributionChannelsDistributionChannel() {
        return new AvailabilityRates.SellingRestrictions.DistributionChannels.DistributionChannel();
    }

    /**
     * Create an instance of {@link AvailabilityRates.SellingRestrictions.Regions.Region }
     * 
     */
    public AvailabilityRates.SellingRestrictions.Regions.Region createAvailabilityRatesSellingRestrictionsRegionsRegion() {
        return new AvailabilityRates.SellingRestrictions.Regions.Region();
    }

    /**
     * Create an instance of {@link AvailabilityRates.SellingRestrictions.CustomerTypes.CustomerType }
     * 
     */
    public AvailabilityRates.SellingRestrictions.CustomerTypes.CustomerType createAvailabilityRatesSellingRestrictionsCustomerTypesCustomerType() {
        return new AvailabilityRates.SellingRestrictions.CustomerTypes.CustomerType();
    }

    /**
     * Create an instance of {@link AvailabilityRates.Releases.Release }
     * 
     */
    public AvailabilityRates.Releases.Release createAvailabilityRatesReleasesRelease() {
        return new AvailabilityRates.Releases.Release();
    }

    /**
     * Create an instance of {@link AvailabilityRates.StatusApplicationBlackOutDates.StatusApplicationBlackOutDate }
     * 
     */
    public AvailabilityRates.StatusApplicationBlackOutDates.StatusApplicationBlackOutDate createAvailabilityRatesStatusApplicationBlackOutDatesStatusApplicationBlackOutDate() {
        return new AvailabilityRates.StatusApplicationBlackOutDates.StatusApplicationBlackOutDate();
    }

    /**
     * Create an instance of {@link AllRates.QuantityOptions.QuantityOption }
     * 
     */
    public AllRates.QuantityOptions.QuantityOption createAllRatesQuantityOptionsQuantityOption() {
        return new AllRates.QuantityOptions.QuantityOption();
    }

    /**
     * Create an instance of {@link ExPriceAdjustmentsType.PriceAdjustment }
     * 
     */
    public ExPriceAdjustmentsType.PriceAdjustment createExPriceAdjustmentsTypePriceAdjustment() {
        return new ExPriceAdjustmentsType.PriceAdjustment();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Rates.Rate.TotalRate }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Rates.Rate.TotalRate createRatesRateTotalRate() {
        return new com.airchina.datacenter.spnr.sdk.entity.Rates.Rate.TotalRate();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Rates.Rate.NegotiatedPrice }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Rates.Rate.NegotiatedPrice createRatesRateNegotiatedPrice() {
        return new com.airchina.datacenter.spnr.sdk.entity.Rates.Rate.NegotiatedPrice();
    }

    /**
     * Create an instance of {@link AutoExchangeType.Penalty }
     * 
     */
    public AutoExchangeType.Penalty createAutoExchangeTypePenalty() {
        return new AutoExchangeType.Penalty();
    }

    /**
     * Create an instance of {@link AutoExchangeType.CommPenalty }
     * 
     */
    public AutoExchangeType.CommPenalty createAutoExchangeTypeCommPenalty() {
        return new AutoExchangeType.CommPenalty();
    }

    /**
     * Create an instance of {@link AutoExchangeType.ValueOfOldTicket }
     * 
     */
    public AutoExchangeType.ValueOfOldTicket createAutoExchangeTypeValueOfOldTicket() {
        return new AutoExchangeType.ValueOfOldTicket();
    }

    /**
     * Create an instance of {@link FlightTableType.Flight.Departure }
     * 
     */
    public FlightTableType.Flight.Departure createFlightTableTypeFlightDeparture() {
        return new FlightTableType.Flight.Departure();
    }

    /**
     * Create an instance of {@link FlightTableType.Flight.Arrival }
     * 
     */
    public FlightTableType.Flight.Arrival createFlightTableTypeFlightArrival() {
        return new FlightTableType.Flight.Arrival();
    }

    /**
     * Create an instance of {@link FlightTableType.Flight.OnTimeInfo }
     * 
     */
    public FlightTableType.Flight.OnTimeInfo createFlightTableTypeFlightOnTimeInfo() {
        return new FlightTableType.Flight.OnTimeInfo();
    }

    /**
     * Create an instance of {@link FlightTableType.Flight.Classes }
     * 
     */
    public FlightTableType.Flight.Classes createFlightTableTypeFlightClasses() {
        return new FlightTableType.Flight.Classes();
    }

    /**
     * Create an instance of {@link MediaReferenceType.Image }
     * 
     */
    public MediaReferenceType.Image createMediaReferenceTypeImage() {
        return new MediaReferenceType.Image();
    }

    /**
     * Create an instance of {@link MediaReferenceType.Link }
     * 
     */
    public MediaReferenceType.Link createMediaReferenceTypeLink() {
        return new MediaReferenceType.Link();
    }

    /**
     * Create an instance of {@link ProductContentType.Image }
     * 
     */
    public ProductContentType.Image createProductContentTypeImage() {
        return new ProductContentType.Image();
    }

    /**
     * Create an instance of {@link ServiceProcessInfoType.CreationTimeStamp }
     * 
     */
    public ServiceProcessInfoType.CreationTimeStamp createServiceProcessInfoTypeCreationTimeStamp() {
        return new ServiceProcessInfoType.CreationTimeStamp();
    }

    /**
     * Create an instance of {@link SupplierSpecificInfosType.SupplierSpecificInfo }
     * 
     */
    public SupplierSpecificInfosType.SupplierSpecificInfo createSupplierSpecificInfosTypeSupplierSpecificInfo() {
        return new SupplierSpecificInfosType.SupplierSpecificInfo();
    }

    /**
     * Create an instance of {@link SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ExchangeRate }
     * 
     */
    public SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ExchangeRate createSearchResponseDestActivityDescriptiveContentsDestActivityDescriptiveContentExchangeRate() {
        return new SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ExchangeRate();
    }

    /**
     * Create an instance of {@link SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ReportingExchangeRates }
     * 
     */
    public SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ReportingExchangeRates createSearchResponseDestActivityDescriptiveContentsDestActivityDescriptiveContentReportingExchangeRates() {
        return new SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ReportingExchangeRates();
    }

    /**
     * Create an instance of {@link SearchResponse.VehAvails.VehAvail.VehAvailCore }
     * 
     */
    public SearchResponse.VehAvails.VehAvail.VehAvailCore createSearchResponseVehAvailsVehAvailVehAvailCore() {
        return new SearchResponse.VehAvails.VehAvail.VehAvailCore();
    }

    /**
     * Create an instance of {@link SearchResponse.RoomStays.RoomStay }
     * 
     */
    public SearchResponse.RoomStays.RoomStay createSearchResponseRoomStaysRoomStay() {
        return new SearchResponse.RoomStays.RoomStay();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Price.Modular }
     * 
     */
    public SearchResponse.Package.Price.Modular createSearchResponsePackagePriceModular() {
        return new SearchResponse.Package.Price.Modular();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ExchangeRate }
     * 
     */
    public SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ExchangeRate createSearchResponsePackageExtrasExtraDestActivityDescriptiveContentExchangeRate() {
        return new SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ExchangeRate();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ReportingExchangeRates }
     * 
     */
    public SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ReportingExchangeRates createSearchResponsePackageExtrasExtraDestActivityDescriptiveContentReportingExchangeRates() {
        return new SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ReportingExchangeRates();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Flights.PricedItinerary.ExchangeRate }
     * 
     */
    public SearchResponse.Package.Flights.PricedItinerary.ExchangeRate createSearchResponsePackageFlightsPricedItineraryExchangeRate() {
        return new SearchResponse.Package.Flights.PricedItinerary.ExchangeRate();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Flights.PricedItinerary.ReportingExchangeRates }
     * 
     */
    public SearchResponse.Package.Flights.PricedItinerary.ReportingExchangeRates createSearchResponsePackageFlightsPricedItineraryReportingExchangeRates() {
        return new SearchResponse.Package.Flights.PricedItinerary.ReportingExchangeRates();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Flights.Price.Modular }
     * 
     */
    public SearchResponse.Package.Flights.Price.Modular createSearchResponsePackageFlightsPriceModular() {
        return new SearchResponse.Package.Flights.Price.Modular();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Vehicles.Vehicle.PriceAdjustments }
     * 
     */
    public SearchResponse.Package.Vehicles.Vehicle.PriceAdjustments createSearchResponsePackageVehiclesVehiclePriceAdjustments() {
        return new SearchResponse.Package.Vehicles.Vehicle.PriceAdjustments();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Vehicles.Vehicle.VehAvail.VehAvailCore }
     * 
     */
    public SearchResponse.Package.Vehicles.Vehicle.VehAvail.VehAvailCore createSearchResponsePackageVehiclesVehicleVehAvailVehAvailCore() {
        return new SearchResponse.Package.Vehicles.Vehicle.VehAvail.VehAvailCore();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Vehicles.Vehicle.Price.Original }
     * 
     */
    public SearchResponse.Package.Vehicles.Vehicle.Price.Original createSearchResponsePackageVehiclesVehiclePriceOriginal() {
        return new SearchResponse.Package.Vehicles.Vehicle.Price.Original();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Vehicles.Vehicle.Price.Pricing }
     * 
     */
    public SearchResponse.Package.Vehicles.Vehicle.Price.Pricing createSearchResponsePackageVehiclesVehiclePricePricing() {
        return new SearchResponse.Package.Vehicles.Vehicle.Price.Pricing();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Vehicles.Vehicle.Price.Selling }
     * 
     */
    public SearchResponse.Package.Vehicles.Vehicle.Price.Selling createSearchResponsePackageVehiclesVehiclePriceSelling() {
        return new SearchResponse.Package.Vehicles.Vehicle.Price.Selling();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Original }
     * 
     */
    public SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Original createSearchResponsePackageVehiclesVehiclePriceModularOriginal() {
        return new SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Original();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Pricing }
     * 
     */
    public SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Pricing createSearchResponsePackageVehiclesVehiclePriceModularPricing() {
        return new SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Pricing();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Selling }
     * 
     */
    public SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Selling createSearchResponsePackageVehiclesVehiclePriceModularSelling() {
        return new SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Selling();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Accomodation.Room.PriceAdjustments }
     * 
     */
    public SearchResponse.Package.Accomodation.Room.PriceAdjustments createSearchResponsePackageAccomodationRoomPriceAdjustments() {
        return new SearchResponse.Package.Accomodation.Room.PriceAdjustments();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Accomodation.Room.RoomStay }
     * 
     */
    public SearchResponse.Package.Accomodation.Room.RoomStay createSearchResponsePackageAccomodationRoomRoomStay() {
        return new SearchResponse.Package.Accomodation.Room.RoomStay();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Accomodation.Room.Price.Original }
     * 
     */
    public SearchResponse.Package.Accomodation.Room.Price.Original createSearchResponsePackageAccomodationRoomPriceOriginal() {
        return new SearchResponse.Package.Accomodation.Room.Price.Original();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Accomodation.Room.Price.Selling }
     * 
     */
    public SearchResponse.Package.Accomodation.Room.Price.Selling createSearchResponsePackageAccomodationRoomPriceSelling() {
        return new SearchResponse.Package.Accomodation.Room.Price.Selling();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Accomodation.Room.Price.Modular.Original }
     * 
     */
    public SearchResponse.Package.Accomodation.Room.Price.Modular.Original createSearchResponsePackageAccomodationRoomPriceModularOriginal() {
        return new SearchResponse.Package.Accomodation.Room.Price.Modular.Original();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Accomodation.Room.Price.Modular.Pricing }
     * 
     */
    public SearchResponse.Package.Accomodation.Room.Price.Modular.Pricing createSearchResponsePackageAccomodationRoomPriceModularPricing() {
        return new SearchResponse.Package.Accomodation.Room.Price.Modular.Pricing();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Accomodation.Room.Price.Modular.Selling }
     * 
     */
    public SearchResponse.Package.Accomodation.Room.Price.Modular.Selling createSearchResponsePackageAccomodationRoomPriceModularSelling() {
        return new SearchResponse.Package.Accomodation.Room.Price.Modular.Selling();
    }

    /**
     * Create an instance of {@link SearchResponse.Package.Accomodation.Room.Price.Pricing.PriceAdjustments }
     * 
     */
    public SearchResponse.Package.Accomodation.Room.Price.Pricing.PriceAdjustments createSearchResponsePackageAccomodationRoomPricePricingPriceAdjustments() {
        return new SearchResponse.Package.Accomodation.Room.Price.Pricing.PriceAdjustments();
    }

    /**
     * Create an instance of {@link ServicePenaltyType.FeeApplies }
     * 
     */
    public ServicePenaltyType.FeeApplies createServicePenaltyTypeFeeApplies() {
        return new ServicePenaltyType.FeeApplies();
    }

    /**
     * Create an instance of {@link ServicePenaltyType.Cancel.Amount }
     * 
     */
    public ServicePenaltyType.Cancel.Amount createServicePenaltyTypeCancelAmount() {
        return new ServicePenaltyType.Cancel.Amount();
    }

    /**
     * Create an instance of {@link ServicePenaltyType.Change.Amount }
     * 
     */
    public ServicePenaltyType.Change.Amount createServicePenaltyTypeChangeAmount() {
        return new ServicePenaltyType.Change.Amount();
    }

    /**
     * Create an instance of {@link ShoppingResponseIDsType.AssociatedIDs.OfferGroup }
     * 
     */
    public ShoppingResponseIDsType.AssociatedIDs.OfferGroup createShoppingResponseIDsTypeAssociatedIDsOfferGroup() {
        return new ShoppingResponseIDsType.AssociatedIDs.OfferGroup();
    }

    /**
     * Create an instance of {@link ShoppingResponseIDsType.AssociatedIDs.ServiceGroup }
     * 
     */
    public ShoppingResponseIDsType.AssociatedIDs.ServiceGroup createShoppingResponseIDsTypeAssociatedIDsServiceGroup() {
        return new ShoppingResponseIDsType.AssociatedIDs.ServiceGroup();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Extras.Extra.Tax }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Extras.Extra.Tax createExtrasExtraTax() {
        return new com.airchina.datacenter.spnr.sdk.entity.Extras.Extra.Tax();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Extras.Extra.SellTax }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Extras.Extra.SellTax createExtrasExtraSellTax() {
        return new com.airchina.datacenter.spnr.sdk.entity.Extras.Extra.SellTax();
    }

    /**
     * Create an instance of {@link com.airchina.datacenter.spnr.sdk.entity.Extras.Extra.Rooms.Room }
     * 
     */
    public com.airchina.datacenter.spnr.sdk.entity.Extras.Extra.Rooms.Room createExtrasExtraRoomsRoom() {
        return new com.airchina.datacenter.spnr.sdk.entity.Extras.Extra.Rooms.Room();
    }

    /**
     * Create an instance of {@link TktInExchangeForType.TicketNumber }
     * 
     */
    public TktInExchangeForType.TicketNumber createTktInExchangeForTypeTicketNumber() {
        return new TktInExchangeForType.TicketNumber();
    }

    /**
     * Create an instance of {@link PromotionsType.Promotion }
     * 
     */
    public PromotionsType.Promotion createPromotionsTypePromotion() {
        return new PromotionsType.Promotion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "AccommodationCategory")
    public JAXBElement<AccommodationCategoryType> createAccommodationCategory(AccommodationCategoryType value) {
        return new JAXBElement<AccommodationCategoryType>(_AccommodationCategory_QNAME, AccommodationCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "PriceRefKey")
    public JAXBElement<String> createPriceRefKey(String value) {
        return new JAXBElement<String>(_PriceRefKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "FlightDuration")
    public JAXBElement<String> createFlightDuration(String value) {
        return new JAXBElement<String>(_FlightDuration_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferMatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OfferMatch")
    public JAXBElement<OfferMatchType> createOfferMatch(OfferMatchType value) {
        return new JAXBElement<OfferMatchType>(_OfferMatch_QNAME, OfferMatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "DescriptionContent")
    public JAXBElement<String> createDescriptionContent(String value) {
        return new JAXBElement<String>(_DescriptionContent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaleInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "SaleInfo")
    public JAXBElement<SaleInfoType> createSaleInfo(SaleInfoType value) {
        return new JAXBElement<SaleInfoType>(_SaleInfo_QNAME, SaleInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NDCTravelerInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TravelerInfo")
    public JAXBElement<NDCTravelerInfoType> createTravelerInfo(NDCTravelerInfoType value) {
        return new JAXBElement<NDCTravelerInfoType>(_TravelerInfo_QNAME, NDCTravelerInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "SeatData")
    public JAXBElement<SeatDataType> createSeatData(SeatDataType value) {
        return new JAXBElement<SeatDataType>(_SeatData_QNAME, SeatDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "SectionSeatData")
    public JAXBElement<SeatDataType> createSectionSeatData(SeatDataType value) {
        return new JAXBElement<SeatDataType>(_SectionSeatData_QNAME, SeatDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Attributes")
    public JAXBElement<AttributesType> createAttributes(AttributesType value) {
        return new JAXBElement<AttributesType>(_Attributes_QNAME, AttributesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommissionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Commission")
    public JAXBElement<CommissionType> createCommission(CommissionType value) {
        return new JAXBElement<CommissionType>(_Commission_QNAME, CommissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferIDRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OfferIDRef")
    public JAXBElement<OfferIDRefType> createOfferIDRef(OfferIDRefType value) {
        return new JAXBElement<OfferIDRefType>(_OfferIDRef_QNAME, OfferIDRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFrequencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "FlightFrequency")
    public JAXBElement<FlightFrequencyType> createFlightFrequency(FlightFrequencyType value) {
        return new JAXBElement<FlightFrequencyType>(_FlightFrequency_QNAME, FlightFrequencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ServiceDate")
    public JAXBElement<DateTimeType> createServiceDate(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_ServiceDate_QNAME, DateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceIncentiveDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "IncentiveData")
    public JAXBElement<ServiceIncentiveDataType> createIncentiveData(ServiceIncentiveDataType value) {
        return new JAXBElement<ServiceIncentiveDataType>(_IncentiveData_QNAME, ServiceIncentiveDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Meals")
    public JAXBElement<String> createMeals(String value) {
        return new JAXBElement<String>(_Meals_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreqGuestNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "FreqGuestNumber")
    public JAXBElement<FreqGuestNumberType> createFreqGuestNumber(FreqGuestNumberType value) {
        return new JAXBElement<FreqGuestNumberType>(_FreqGuestNumber_QNAME, FreqGuestNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorporateHierarchiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OJ_CorporateHierarchy")
    public JAXBElement<CorporateHierarchiesType> createOJCorporateHierarchy(CorporateHierarchiesType value) {
        return new JAXBElement<CorporateHierarchiesType>(_OJCorporateHierarchy_QNAME, CorporateHierarchiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "FareType")
    public JAXBElement<String> createFareType(String value) {
        return new JAXBElement<String>(_FareType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestActivityDescriptiveContentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "DestActivityDescriptiveContents")
    public JAXBElement<DestActivityDescriptiveContentsType> createDestActivityDescriptiveContents(DestActivityDescriptiveContentsType value) {
        return new JAXBElement<DestActivityDescriptiveContentsType>(_DestActivityDescriptiveContents_QNAME, DestActivityDescriptiveContentsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NDCTicketingInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "NDC_TicketingInfo")
    public JAXBElement<NDCTicketingInfoType> createNDCTicketingInfo(NDCTicketingInfoType value) {
        return new JAXBElement<NDCTicketingInfoType>(_NDCTicketingInfo_QNAME, NDCTicketingInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyControlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "JourneyControlData")
    public JAXBElement<JourneyControlType> createJourneyControlData(JourneyControlType value) {
        return new JAXBElement<JourneyControlType>(_JourneyControlData_QNAME, JourneyControlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "DateRangeType")
    public JAXBElement<DateRangeType> createDateRangeType(DateRangeType value) {
        return new JAXBElement<DateRangeType>(_DateRangeType_QNAME, DateRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightTableRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "FlightTableRef")
    public JAXBElement<FlightTableRefType> createFlightTableRef(FlightTableRefType value) {
        return new JAXBElement<FlightTableRefType>(_FlightTableRef_QNAME, FlightTableRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "NumberOfStops")
    public JAXBElement<Integer> createNumberOfStops(Integer value) {
        return new JAXBElement<Integer>(_NumberOfStops_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Long")
    public JAXBElement<String> createLong(String value) {
        return new JAXBElement<String>(_Long_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "FlightNumber")
    public JAXBElement<String> createFlightNumber(String value) {
        return new JAXBElement<String>(_FlightNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "MediaContent")
    public JAXBElement<MediaContentType> createMediaContent(MediaContentType value) {
        return new JAXBElement<MediaContentType>(_MediaContent_QNAME, MediaContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Diagnostics")
    public JAXBElement<DiagnosticsType> createDiagnostics(DiagnosticsType value) {
        return new JAXBElement<DiagnosticsType>(_Diagnostics_QNAME, DiagnosticsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "AccommodationService")
    public JAXBElement<AccommodationServiceType> createAccommodationService(AccommodationServiceType value) {
        return new JAXBElement<AccommodationServiceType>(_AccommodationService_QNAME, AccommodationServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPAExtensionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TPA_Extensions")
    public JAXBElement<TPAExtensionsType> createTPAExtensions(TPAExtensionsType value) {
        return new JAXBElement<TPAExtensionsType>(_TPAExtensions_QNAME, TPAExtensionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivateFareCorpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Corporate")
    public JAXBElement<PrivateFareCorpType> createCorporate(PrivateFareCorpType value) {
        return new JAXBElement<PrivateFareCorpType>(_Corporate_QNAME, PrivateFareCorpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionCurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "RedemptionCurrency")
    public JAXBElement<RedemptionCurrencyType> createRedemptionCurrency(RedemptionCurrencyType value) {
        return new JAXBElement<RedemptionCurrencyType>(_RedemptionCurrency_QNAME, RedemptionCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Reason")
    public JAXBElement<Byte> createReason(Byte value) {
        return new JAXBElement<Byte>(_Reason_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordLocatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "RecordLocator")
    public JAXBElement<RecordLocatorType> createRecordLocator(RecordLocatorType value) {
        return new JAXBElement<RecordLocatorType>(_RecordLocator_QNAME, RecordLocatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightCOSDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ClassOfService")
    public JAXBElement<FlightCOSDetailType> createClassOfService(FlightCOSDetailType value) {
        return new JAXBElement<FlightCOSDetailType>(_ClassOfService_QNAME, FlightCOSDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerivationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Derivation")
    public JAXBElement<DerivationType> createDerivation(DerivationType value) {
        return new JAXBElement<DerivationType>(_Derivation_QNAME, DerivationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "NumberInParty", defaultValue = "1")
    public JAXBElement<Integer> createNumberInParty(Integer value) {
        return new JAXBElement<Integer>(_NumberInParty_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivateFareContractType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ContractID")
    public JAXBElement<PrivateFareContractType> createContractID(PrivateFareContractType value) {
        return new JAXBElement<PrivateFareContractType>(_ContractID_QNAME, PrivateFareContractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelerInfantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "InfantData")
    public JAXBElement<TravelerInfantType> createInfantData(TravelerInfantType value) {
        return new JAXBElement<TravelerInfantType>(_InfantData_QNAME, TravelerInfantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "InstantPurchase")
    public JAXBElement<String> createInstantPurchase(String value) {
        return new JAXBElement<String>(_InstantPurchase_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "roomRating")
    public JAXBElement<Byte> createRoomRating(Byte value) {
        return new JAXBElement<Byte>(_RoomRating_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Component")
    public JAXBElement<ComponentType> createComponent(ComponentType value) {
        return new JAXBElement<ComponentType>(_Component_QNAME, ComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "CountryCode")
    public JAXBElement<String> createCountryCode(String value) {
        return new JAXBElement<String>(_CountryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelerAgeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Age")
    public JAXBElement<TravelerAgeType> createAge(TravelerAgeType value) {
        return new JAXBElement<TravelerAgeType>(_Age_QNAME, TravelerAgeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "AirDirectOnly")
    public JAXBElement<Boolean> createAirDirectOnly(Boolean value) {
        return new JAXBElement<Boolean>(_AirDirectOnly_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "InfoGroup")
    public JAXBElement<InfoGroupType> createInfoGroup(InfoGroupType value) {
        return new JAXBElement<InfoGroupType>(_InfoGroup_QNAME, InfoGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceBundleNoPriceRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "BundleContent")
    public JAXBElement<ServiceBundleNoPriceRefType> createBundleContent(ServiceBundleNoPriceRefType value) {
        return new JAXBElement<ServiceBundleNoPriceRefType>(_BundleContent_QNAME, ServiceBundleNoPriceRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelerRefInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TravelerRefInfo")
    public JAXBElement<TravelerRefInfoType> createTravelerRefInfo(TravelerRefInfoType value) {
        return new JAXBElement<TravelerRefInfoType>(_TravelerRefInfo_QNAME, TravelerRefInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Comment")
    public JAXBElement<String> createComment(String value) {
        return new JAXBElement<String>(_Comment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CCQualifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "CreditCard")
    public JAXBElement<CCQualifierType> createCreditCard(CCQualifierType value) {
        return new JAXBElement<CCQualifierType>(_CreditCard_QNAME, CCQualifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePenaltyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Penalty")
    public JAXBElement<ServicePenaltyType> createPenalty(ServicePenaltyType value) {
        return new JAXBElement<ServicePenaltyType>(_Penalty_QNAME, ServicePenaltyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "BookByDate")
    public JAXBElement<DateTimeType> createBookByDate(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_BookByDate_QNAME, DateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceRefInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ServiceRefInfo")
    public JAXBElement<ServiceRefInfoType> createServiceRefInfo(ServiceRefInfoType value) {
        return new JAXBElement<ServiceRefInfoType>(_ServiceRefInfo_QNAME, ServiceRefInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCombineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Combinality")
    public JAXBElement<ServiceCombineType> createCombinality(ServiceCombineType value) {
        return new JAXBElement<ServiceCombineType>(_Combinality_QNAME, ServiceCombineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialSrvcType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "SpclAttributes")
    public JAXBElement<SpecialSrvcType> createSpclAttributes(SpecialSrvcType value) {
        return new JAXBElement<SpecialSrvcType>(_SpclAttributes_QNAME, SpecialSrvcType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceIDRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ServiceIDRef")
    public JAXBElement<ServiceIDRefType> createServiceIDRef(ServiceIDRefType value) {
        return new JAXBElement<ServiceIDRefType>(_ServiceIDRef_QNAME, ServiceIDRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ShoppingResponse")
    public JAXBElement<ShoppingResponseType> createShoppingResponse(ShoppingResponseType value) {
        return new JAXBElement<ShoppingResponseType>(_ShoppingResponse_QNAME, ShoppingResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicesFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ServicesFilter")
    public JAXBElement<ServicesFilterType> createServicesFilter(ServicesFilterType value) {
        return new JAXBElement<ServicesFilterType>(_ServicesFilter_QNAME, ServicesFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightRefInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "FlightRefInfo")
    public JAXBElement<FlightRefInfoType> createFlightRefInfo(FlightRefInfoType value) {
        return new JAXBElement<FlightRefInfoType>(_FlightRefInfo_QNAME, FlightRefInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Redemption")
    public JAXBElement<RedemptionType> createRedemption(RedemptionType value) {
        return new JAXBElement<RedemptionType>(_Redemption_QNAME, RedemptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ExtensionPoint")
    public JAXBElement<ExtensionPointType> createExtensionPoint(ExtensionPointType value) {
        return new JAXBElement<ExtensionPointType>(_ExtensionPoint_QNAME, ExtensionPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "PricingCurrency")
    public JAXBElement<String> createPricingCurrency(String value) {
        return new JAXBElement<String>(_PricingCurrency_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "CityCode")
    public JAXBElement<String> createCityCode(String value) {
        return new JAXBElement<String>(_CityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "DepartureTime")
    public JAXBElement<String> createDepartureTime(String value) {
        return new JAXBElement<String>(_DepartureTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TicketedDateTime")
    public JAXBElement<DateTimeStampType> createTicketedDateTime(DateTimeStampType value) {
        return new JAXBElement<DateTimeStampType>(_TicketedDateTime_QNAME, DateTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SrvcDesVariableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "DescriptionVariable")
    public JAXBElement<SrvcDesVariableType> createDescriptionVariable(SrvcDesVariableType value) {
        return new JAXBElement<SrvcDesVariableType>(_DescriptionVariable_QNAME, SrvcDesVariableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelerGenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Gender")
    public JAXBElement<TravelerGenderType> createGender(TravelerGenderType value) {
        return new JAXBElement<TravelerGenderType>(_Gender_QNAME, TravelerGenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TktInExchangeForType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "InExchangeForTicket")
    public JAXBElement<TktInExchangeForType> createInExchangeForTicket(TktInExchangeForType value) {
        return new JAXBElement<TktInExchangeForType>(_InExchangeForTicket_QNAME, TktInExchangeForType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "JourneyTime")
    public JAXBElement<String> createJourneyTime(String value) {
        return new JAXBElement<String>(_JourneyTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingResponseIDsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ShoppingResponseIDs")
    public JAXBElement<ShoppingResponseIDsType> createShoppingResponseIDs(ShoppingResponseIDsType value) {
        return new JAXBElement<ShoppingResponseIDsType>(_ShoppingResponseIDs_QNAME, ShoppingResponseIDsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePenaltyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Penalties")
    public JAXBElement<ServicePenaltyType> createPenalties(ServicePenaltyType value) {
        return new JAXBElement<ServicePenaltyType>(_Penalties_QNAME, ServicePenaltyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NDCPromotionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "PromoCodes")
    public JAXBElement<NDCPromotionType> createPromoCodes(NDCPromotionType value) {
        return new JAXBElement<NDCPromotionType>(_PromoCodes_QNAME, NDCPromotionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherMembershipsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OtherMemberships")
    public JAXBElement<OtherMembershipsType> createOtherMemberships(OtherMembershipsType value) {
        return new JAXBElement<OtherMembershipsType>(_OtherMemberships_QNAME, OtherMembershipsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USDOTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "USDOT")
    public JAXBElement<USDOTType> createUSDOT(USDOTType value) {
        return new JAXBElement<USDOTType>(_USDOT_QNAME, USDOTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareCacheKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "FareCacheKey")
    public JAXBElement<FareCacheKeyType> createFareCacheKey(FareCacheKeyType value) {
        return new JAXBElement<FareCacheKeyType>(_FareCacheKey_QNAME, FareCacheKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "DepartureDate")
    public JAXBElement<XMLGregorianCalendar> createDepartureDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DepartureDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentIDRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "SegmentIDRef")
    public JAXBElement<SegmentIDRefType> createSegmentIDRef(SegmentIDRefType value) {
        return new JAXBElement<SegmentIDRefType>(_SegmentIDRef_QNAME, SegmentIDRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TripMileage")
    public JAXBElement<BigInteger> createTripMileage(BigInteger value) {
        return new JAXBElement<BigInteger>(_TripMileage_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "DateOfBirth")
    public JAXBElement<XMLGregorianCalendar> createDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateOfBirth_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveProgramType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "IncentiveProgram")
    public JAXBElement<IncentiveProgramType> createIncentiveProgram(IncentiveProgramType value) {
        return new JAXBElement<IncentiveProgramType>(_IncentiveProgram_QNAME, IncentiveProgramType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "SeatLocation")
    public JAXBElement<SeatLocationType> createSeatLocation(SeatLocationType value) {
        return new JAXBElement<SeatLocationType>(_SeatLocation_QNAME, SeatLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "AirportCode")
    public JAXBElement<String> createAirportCode(String value) {
        return new JAXBElement<String>(_AirportCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ArrivalCode")
    public JAXBElement<String> createArrivalCode(String value) {
        return new JAXBElement<String>(_ArrivalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OntologyExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OntologyExtension")
    public JAXBElement<OntologyExtensionType> createOntologyExtension(OntologyExtensionType value) {
        return new JAXBElement<OntologyExtensionType>(_OntologyExtension_QNAME, OntologyExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProcessInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ForInfo")
    public JAXBElement<ServiceProcessInfoType> createForInfo(ServiceProcessInfoType value) {
        return new JAXBElement<ServiceProcessInfoType>(_ForInfo_QNAME, ServiceProcessInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "restrictionType")
    public JAXBElement<String> createRestrictionType(String value) {
        return new JAXBElement<String>(_RestrictionType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "FiledCurrencyCode")
    public JAXBElement<CurrencyCodeType> createFiledCurrencyCode(CurrencyCodeType value) {
        return new JAXBElement<CurrencyCodeType>(_FiledCurrencyCode_QNAME, CurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveProgramType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "LoyaltyProgramRef")
    public JAXBElement<IncentiveProgramType> createLoyaltyProgramRef(IncentiveProgramType value) {
        return new JAXBElement<IncentiveProgramType>(_LoyaltyProgramRef_QNAME, IncentiveProgramType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingRestrictionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "NDC_Restrictions")
    public JAXBElement<PricingRestrictionType> createNDCRestrictions(PricingRestrictionType value) {
        return new JAXBElement<PricingRestrictionType>(_NDCRestrictions_QNAME, PricingRestrictionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivateFareOfficeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Office")
    public JAXBElement<PrivateFareOfficeType> createOffice(PrivateFareOfficeType value) {
        return new JAXBElement<PrivateFareOfficeType>(_Office_QNAME, PrivateFareOfficeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileIndexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ProfileIndex")
    public JAXBElement<ProfileIndexType> createProfileIndex(ProfileIndexType value) {
        return new JAXBElement<ProfileIndexType>(_ProfileIndex_QNAME, ProfileIndexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelerInfantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Infant")
    public JAXBElement<TravelerInfantType> createInfant(TravelerInfantType value) {
        return new JAXBElement<TravelerInfantType>(_Infant_QNAME, TravelerInfantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ServiceLocation")
    public JAXBElement<String> createServiceLocation(String value) {
        return new JAXBElement<String>(_ServiceLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "AirlineCode")
    public JAXBElement<String> createAirlineCode(String value) {
        return new JAXBElement<String>(_AirlineCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketDesignatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TicketDesignator")
    public JAXBElement<TicketDesignatorType> createTicketDesignator(TicketDesignatorType value) {
        return new JAXBElement<TicketDesignatorType>(_TicketDesignator_QNAME, TicketDesignatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "MediaReference")
    public JAXBElement<MediaReferenceType> createMediaReference(MediaReferenceType value) {
        return new JAXBElement<MediaReferenceType>(_MediaReference_QNAME, MediaReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "DepartureCode")
    public JAXBElement<String> createDepartureCode(String value) {
        return new JAXBElement<String>(_DepartureCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "PaxType")
    public JAXBElement<String> createPaxType(String value) {
        return new JAXBElement<String>(_PaxType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TicketByDate")
    public JAXBElement<DateTimeType> createTicketByDate(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_TicketByDate_QNAME, DateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "SearchType")
    public JAXBElement<String> createSearchType(String value) {
        return new JAXBElement<String>(_SearchType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareBasisCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "FareBasisCode")
    public JAXBElement<FareBasisCodeType> createFareBasisCode(FareBasisCodeType value) {
        return new JAXBElement<FareBasisCodeType>(_FareBasisCode_QNAME, FareBasisCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ValidatingCarrier")
    public JAXBElement<String> createValidatingCarrier(String value) {
        return new JAXBElement<String>(_ValidatingCarrier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightNumberNodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "FlightSegmentNumber")
    public JAXBElement<FlightNumberNodeType> createFlightSegmentNumber(FlightNumberNodeType value) {
        return new JAXBElement<FlightNumberNodeType>(_FlightSegmentNumber_QNAME, FlightNumberNodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Disclosure")
    public JAXBElement<String> createDisclosure(String value) {
        return new JAXBElement<String>(_Disclosure_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoExchangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ExchangeInfo")
    public JAXBElement<AutoExchangeType> createExchangeInfo(AutoExchangeType value) {
        return new JAXBElement<AutoExchangeType>(_ExchangeInfo_QNAME, AutoExchangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelerIDRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TravelerIDRef")
    public JAXBElement<TravelerIDRefType> createTravelerIDRef(TravelerIDRefType value) {
        return new JAXBElement<TravelerIDRefType>(_TravelerIDRef_QNAME, TravelerIDRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightTableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "FlightTable")
    public JAXBElement<FlightTableType> createFlightTable(FlightTableType value) {
        return new JAXBElement<FlightTableType>(_FlightTable_QNAME, FlightTableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CCIssuerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "CCIssuer")
    public JAXBElement<CCIssuerType> createCCIssuer(CCIssuerType value) {
        return new JAXBElement<CCIssuerType>(_CCIssuer_QNAME, CCIssuerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareRefKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "FareRefKey")
    public JAXBElement<FareRefKeyType> createFareRefKey(FareRefKeyType value) {
        return new JAXBElement<FareRefKeyType>(_FareRefKey_QNAME, FareRefKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TripPurpose")
    public JAXBElement<String> createTripPurpose(String value) {
        return new JAXBElement<String>(_TripPurpose_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "MarriedSegment")
    public JAXBElement<String> createMarriedSegment(String value) {
        return new JAXBElement<String>(_MarriedSegment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFrequencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Frequency")
    public JAXBElement<FlightFrequencyType> createFrequency(FlightFrequencyType value) {
        return new JAXBElement<FlightFrequencyType>(_Frequency_QNAME, FlightFrequencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingResponseIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ShoppingResponseID")
    public JAXBElement<ShoppingResponseIDType> createShoppingResponseID(ShoppingResponseIDType value) {
        return new JAXBElement<ShoppingResponseIDType>(_ShoppingResponseID_QNAME, ShoppingResponseIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultimediaObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Description", scope = ServicesDescriptionType.class)
    public JAXBElement<MultimediaObjectType> createServicesDescriptionTypeDescription(MultimediaObjectType value) {
        return new JAXBElement<MultimediaObjectType>(_ServicesDescriptionTypeDescription_QNAME, MultimediaObjectType.class, ServicesDescriptionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultimediaObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Description", scope = RoomAmenityMixedType.class)
    public JAXBElement<MultimediaObjectType> createRoomAmenityMixedTypeDescription(MultimediaObjectType value) {
        return new JAXBElement<MultimediaObjectType>(_ServicesDescriptionTypeDescription_QNAME, MultimediaObjectType.class, RoomAmenityMixedType.class, value);
    }

    /**
     * Create an instance of {@link PhonesType.Phone.PhoneNumberFromHotelCommon }}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "PhoneNumber", scope = PhonesType.Phone.class)
    public PhonesType.Phone.PhoneNumberFromHotelCommon createPhonesTypePhonePhoneNumberFromHotelCommon(String value) {
        return new PhonesType.Phone.PhoneNumberFromHotelCommon(value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanCostType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "PlanCost", scope = ProductBase.Insurance.class)
    public JAXBElement<PlanCostType> createProductBaseInsurancePlanCost(PlanCostType value) {
        return new JAXBElement<PlanCostType>(_ProductBaseInsurancePlanCost_QNAME, PlanCostType.class, ProductBase.Insurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierPenaltiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "SupplierPenalties", scope = ProductBase.Insurance.class)
    public JAXBElement<SupplierPenaltiesType> createProductBaseInsuranceSupplierPenalties(SupplierPenaltiesType value) {
        return new JAXBElement<SupplierPenaltiesType>(_ProductBaseInsuranceSupplierPenalties_QNAME, SupplierPenaltiesType.class, ProductBase.Insurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniqueIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "UniqueID", scope = ProductBase.Insurance.class)
    public JAXBElement<UniqueIDType> createProductBaseInsuranceUniqueID(UniqueIDType value) {
        return new JAXBElement<UniqueIDType>(_ProductBaseInsuranceUniqueID_QNAME, UniqueIDType.class, ProductBase.Insurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceCustomerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "InsuranceCustomer", scope = ProductBase.Insurance.class)
    public JAXBElement<InsuranceCustomerType> createProductBaseInsuranceInsuranceCustomer(InsuranceCustomerType value) {
        return new JAXBElement<InsuranceCustomerType>(_ProductBaseInsuranceInsuranceCustomer_QNAME, InsuranceCustomerType.class, ProductBase.Insurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJAmendPenaltiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "AmendmentPenalties", scope = ProductBase.Insurance.class)
    public JAXBElement<OJAmendPenaltiesType> createProductBaseInsuranceAmendmentPenalties(OJAmendPenaltiesType value) {
        return new JAXBElement<OJAmendPenaltiesType>(_ProductBaseInsuranceAmendmentPenalties_QNAME, OJAmendPenaltiesType.class, ProductBase.Insurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "PolicyDetail", scope = ProductBase.Insurance.class)
    public JAXBElement<PolicyDetailType> createProductBaseInsurancePolicyDetail(PolicyDetailType value) {
        return new JAXBElement<PolicyDetailType>(_ProductBaseInsurancePolicyDetail_QNAME, PolicyDetailType.class, ProductBase.Insurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPenaltiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "CancellationPenalties", scope = ProductBase.Insurance.class)
    public JAXBElement<CancelPenaltiesType> createProductBaseInsuranceCancellationPenalties(CancelPenaltiesType value) {
        return new JAXBElement<CancelPenaltiesType>(_ProductBaseInsuranceCancellationPenalties_QNAME, CancelPenaltiesType.class, ProductBase.Insurance.class, value);
    }

}
