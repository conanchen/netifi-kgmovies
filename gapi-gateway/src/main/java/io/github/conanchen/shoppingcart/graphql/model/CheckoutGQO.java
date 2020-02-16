package io.github.conanchen.shoppingcart.graphql.model;

import java.util.Collection;
import io.github.conanchen.zommon.graphql.model.CurrencyCodeGQO;
import io.github.conanchen.zommon.graphql.model.CustomAttributeGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

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
    @javax.validation.constraints.NotNull
    private DiscountApplicationConnectionGQO discountApplications;
    private String email;
    @javax.validation.constraints.NotNull
    private CheckoutLineItemConnectionGQO lineItems;
    @javax.validation.constraints.NotNull
    private MoneyGQO lineItemsSubtotalPrice;
    private String note;
    private OrderGQO order;
    private java.lang.String orderStatusUrl;
    @javax.validation.constraints.NotNull
    private MoneyGQO paymentDueV2;
    @javax.validation.constraints.NotNull
    private Boolean ready;
    @javax.validation.constraints.NotNull
    private Boolean requiresShipping;
    private MailingAddressGQO shippingAddress;
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

    public CheckoutGQO(Collection<AppliedGiftCardGQO> appliedGiftCards, AvailableShippingRatesGQO availableShippingRates, java.util.Date completedAt, java.util.Date createdAt, CurrencyCodeGQO currencyCode, Collection<CustomAttributeGQO> customAttributes, DiscountApplicationConnectionGQO discountApplications, String email, CheckoutLineItemConnectionGQO lineItems, MoneyGQO lineItemsSubtotalPrice, String note, OrderGQO order, java.lang.String orderStatusUrl, MoneyGQO paymentDueV2, Boolean ready, Boolean requiresShipping, MailingAddressGQO shippingAddress, Collection<DiscountAllocationGQO> shippingDiscountAllocations, ShippingRateGQO shippingLine, MoneyGQO subtotalPriceV2, Boolean taxExempt, Boolean taxesIncluded, MoneyGQO totalPriceV2, MoneyGQO totalTaxV2, java.util.Date updatedAt, java.lang.String webUrl, String id) {
        this.appliedGiftCards = appliedGiftCards;
        this.availableShippingRates = availableShippingRates;
        this.completedAt = completedAt;
        this.createdAt = createdAt;
        this.currencyCode = currencyCode;
        this.customAttributes = customAttributes;
        this.discountApplications = discountApplications;
        this.email = email;
        this.lineItems = lineItems;
        this.lineItemsSubtotalPrice = lineItemsSubtotalPrice;
        this.note = note;
        this.order = order;
        this.orderStatusUrl = orderStatusUrl;
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

    public Collection<AppliedGiftCardGQO> getAppliedGiftCards() {
        return appliedGiftCards;
    }
    public void setAppliedGiftCards(Collection<AppliedGiftCardGQO> appliedGiftCards) {
        this.appliedGiftCards = appliedGiftCards;
    }

    public AvailableShippingRatesGQO getAvailableShippingRates() {
        return availableShippingRates;
    }
    public void setAvailableShippingRates(AvailableShippingRatesGQO availableShippingRates) {
        this.availableShippingRates = availableShippingRates;
    }

    public java.util.Date getCompletedAt() {
        return completedAt;
    }
    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public CurrencyCodeGQO getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(CurrencyCodeGQO currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Collection<CustomAttributeGQO> getCustomAttributes() {
        return customAttributes;
    }
    public void setCustomAttributes(Collection<CustomAttributeGQO> customAttributes) {
        this.customAttributes = customAttributes;
    }

    public DiscountApplicationConnectionGQO getDiscountApplications() {
        return discountApplications;
    }
    public void setDiscountApplications(DiscountApplicationConnectionGQO discountApplications) {
        this.discountApplications = discountApplications;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public CheckoutLineItemConnectionGQO getLineItems() {
        return lineItems;
    }
    public void setLineItems(CheckoutLineItemConnectionGQO lineItems) {
        this.lineItems = lineItems;
    }

    public MoneyGQO getLineItemsSubtotalPrice() {
        return lineItemsSubtotalPrice;
    }
    public void setLineItemsSubtotalPrice(MoneyGQO lineItemsSubtotalPrice) {
        this.lineItemsSubtotalPrice = lineItemsSubtotalPrice;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public OrderGQO getOrder() {
        return order;
    }
    public void setOrder(OrderGQO order) {
        this.order = order;
    }

    public java.lang.String getOrderStatusUrl() {
        return orderStatusUrl;
    }
    public void setOrderStatusUrl(java.lang.String orderStatusUrl) {
        this.orderStatusUrl = orderStatusUrl;
    }

    public MoneyGQO getPaymentDueV2() {
        return paymentDueV2;
    }
    public void setPaymentDueV2(MoneyGQO paymentDueV2) {
        this.paymentDueV2 = paymentDueV2;
    }

    public Boolean getReady() {
        return ready;
    }
    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    public Boolean getRequiresShipping() {
        return requiresShipping;
    }
    public void setRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    public MailingAddressGQO getShippingAddress() {
        return shippingAddress;
    }
    public void setShippingAddress(MailingAddressGQO shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Collection<DiscountAllocationGQO> getShippingDiscountAllocations() {
        return shippingDiscountAllocations;
    }
    public void setShippingDiscountAllocations(Collection<DiscountAllocationGQO> shippingDiscountAllocations) {
        this.shippingDiscountAllocations = shippingDiscountAllocations;
    }

    public ShippingRateGQO getShippingLine() {
        return shippingLine;
    }
    public void setShippingLine(ShippingRateGQO shippingLine) {
        this.shippingLine = shippingLine;
    }

    public MoneyGQO getSubtotalPriceV2() {
        return subtotalPriceV2;
    }
    public void setSubtotalPriceV2(MoneyGQO subtotalPriceV2) {
        this.subtotalPriceV2 = subtotalPriceV2;
    }

    public Boolean getTaxExempt() {
        return taxExempt;
    }
    public void setTaxExempt(Boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    public Boolean getTaxesIncluded() {
        return taxesIncluded;
    }
    public void setTaxesIncluded(Boolean taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
    }

    public MoneyGQO getTotalPriceV2() {
        return totalPriceV2;
    }
    public void setTotalPriceV2(MoneyGQO totalPriceV2) {
        this.totalPriceV2 = totalPriceV2;
    }

    public MoneyGQO getTotalTaxV2() {
        return totalTaxV2;
    }
    public void setTotalTaxV2(MoneyGQO totalTaxV2) {
        this.totalTaxV2 = totalTaxV2;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public java.lang.String getWebUrl() {
        return webUrl;
    }
    public void setWebUrl(java.lang.String webUrl) {
        this.webUrl = webUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    public DiscountApplicationConnectionGQO discountApplications(Integer first, String after, Integer last, String before, Boolean reverse) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

    public CheckoutLineItemConnectionGQO lineItems(Integer first, String after, Integer last, String before, Boolean reverse) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}