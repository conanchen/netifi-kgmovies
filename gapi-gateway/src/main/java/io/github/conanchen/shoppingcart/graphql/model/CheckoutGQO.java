package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class CheckoutGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private Collection<AppliedGiftCardGQO> appliedGiftCards;

    private AvailableShippingRatesGQO availableShippingRates;

    private java.util.Date completedAt;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private CurrencyCodeGQO currencyCode;
    @javax.validation.constraints.NotNull
    private Collection<CustomAttributeGQO> customAttributes;

    private String email;
    @javax.validation.constraints.NotNull
    private MoneyGQO lineItemsSubtotalPrice;

    private String note;

    private PoderGQO poder;

    private java.lang.String poderStatusUrl;
    @javax.validation.constraints.NotNull
    private MoneyGQO paymentDueV2;
    @javax.validation.constraints.NotNull
    private Boolean ready;
    @javax.validation.constraints.NotNull
    private Boolean requiresShipping;

    private PostalAddressGQO shippingAddress;
    @javax.validation.constraints.NotNull
    private Collection<DiscountAllocationGQO> shippingDiscountAllocations;

    private ShippingRateGQO shippingLine;
    @javax.validation.constraints.NotNull
    private MoneyGQO subtotalPriceV2;
    @javax.validation.constraints.NotNull
    private Boolean taxExempt;
    @javax.validation.constraints.NotNull
    private Boolean taxesIncluded;
    @javax.validation.constraints.NotNull
    private MoneyGQO totalPriceV2;
    @javax.validation.constraints.NotNull
    private MoneyGQO totalTaxV2;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private java.lang.String webUrl;
    @javax.validation.constraints.NotNull
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