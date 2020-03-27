package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.CurrencyCodeGQO;
import io.github.conanchen.zommon.graphql.model.CustomAttributeGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class CheckoutGQO implements NodeGQO{

    @lombok.NonNull
    private Collection<AppliedGiftCardGQO> appliedGiftCards;

    private AvailableShippingRatesGQO availableShippingRates;

    private java.util.Date completedAt;
    @lombok.NonNull
    private java.util.Date createdAt;
    @lombok.NonNull
    private CurrencyCodeGQO currencyCode;
    @lombok.NonNull
    private Collection<CustomAttributeGQO> customAttributes;

    private String email;
    @lombok.NonNull
    private MoneyGQO lineItemsSubtotalPrice;

    private String note;

    private PoderGQO poder;

    private java.lang.String poderStatusUrl;
    @lombok.NonNull
    private MoneyGQO paymentDueV2;
    @lombok.NonNull
    private Boolean ready;
    @lombok.NonNull
    private Boolean requiresShipping;

    private PostalAddressGQO shippingAddress;
    @lombok.NonNull
    private Collection<DiscountAllocationGQO> shippingDiscountAllocations;

    private ShippingRateGQO shippingLine;
    @lombok.NonNull
    private MoneyGQO subtotalPriceV2;
    @lombok.NonNull
    private Boolean taxExempt;
    @lombok.NonNull
    private Boolean taxesIncluded;
    @lombok.NonNull
    private MoneyGQO totalPriceV2;
    @lombok.NonNull
    private MoneyGQO totalTaxV2;
    @lombok.NonNull
    private java.util.Date updatedAt;
    @lombok.NonNull
    private java.lang.String webUrl;
    @lombok.NonNull
    private String id;

    public CheckoutGQO() {
    }

    public CheckoutGQO( Collection<AppliedGiftCardGQO> appliedGiftCards,  AvailableShippingRatesGQO availableShippingRates,  java.util.Date completedAt,  java.util.Date createdAt,  CurrencyCodeGQO currencyCode,  Collection<CustomAttributeGQO> customAttributes,  String email,  MoneyGQO lineItemsSubtotalPrice,  String note,  PoderGQO poder,  java.lang.String poderStatusUrl,  MoneyGQO paymentDueV2,  Boolean ready,  Boolean requiresShipping,  PostalAddressGQO shippingAddress,  Collection<DiscountAllocationGQO> shippingDiscountAllocations,  ShippingRateGQO shippingLine,  MoneyGQO subtotalPriceV2,  Boolean taxExempt,  Boolean taxesIncluded,  MoneyGQO totalPriceV2,  MoneyGQO totalTaxV2,  java.util.Date updatedAt,  java.lang.String webUrl,  String id) {
        this.appliedGiftCards = appliedGiftCards;
        this.availableShippingRates = availableShippingRates;
        this.completedAt = completedAt;
        this.createdAt = createdAt;
        this.currencyCode = currencyCode;
        this.customAttributes = customAttributes;
        this.email = email;
        this.lineItemsSubtotalPrice = lineItemsSubtotalPrice;
        this.note = note;
        this.poder = poder;
        this.poderStatusUrl = poderStatusUrl;
        this.paymentDueV2 = paymentDueV2;
        this.ready = ready;
        this.requiresShipping = requiresShipping;
        this.shippingAddress = shippingAddress;
        this.shippingDiscountAllocations = shippingDiscountAllocations;
        this.shippingLine = shippingLine;
        this.subtotalPriceV2 = subtotalPriceV2;
        this.taxExempt = taxExempt;
        this.taxesIncluded = taxesIncluded;
        this.totalPriceV2 = totalPriceV2;
        this.totalTaxV2 = totalTaxV2;
        this.updatedAt = updatedAt;
        this.webUrl = webUrl;
        this.id = id;
    }

}