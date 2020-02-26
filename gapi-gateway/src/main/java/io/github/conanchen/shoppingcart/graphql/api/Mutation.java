package io.github.conanchen.shoppingcart.graphql.api;

import io.github.conanchen.shoppingcart.graphql.model.*;

public interface Mutation {

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartAddItem(AddToCartInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartSetItems(SetCartItemsInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartUpdateItem(UpdateCartItemInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartIncrementItemQuantity(UpdateItemQuantityInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartDecrementItemQuantity(UpdateItemQuantityInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartRemoveItem(RemoveCartItemInputGQO input) throws Exception;

    @javax.validation.constraints.NotNull
    CartPayloadGQO cartEmpty(EmptyCartInputGQO input) throws Exception;

    CheckoutPayloadGQO checkoutCreate(CheckoutCreateInputGQO input) throws Exception;

    CheckoutPayloadGQO checkoutCreatePlusOrder(CheckoutCreatePlusOrderInputGQO input) throws Exception;

    CheckoutPayloadGQO checkoutDiscountCodeApply(String discountCode, String checkoutId) throws Exception;

    CheckoutPayloadGQO checkoutDiscountCodeRemove(String checkoutId) throws Exception;

    CheckoutPayloadGQO checkoutShippingAddressUpdate(PostalAddressInputGQO shippingAddress, String checkoutId) throws Exception;

    CheckoutPayloadGQO checkoutEmailUpdate(String checkoutId, String email) throws Exception;

    CheckoutPayloadGQO checkoutPhoneUpdate(String checkoutId, String email) throws Exception;

    CheckoutPayloadGQO checkoutAttributesUpdate(String checkoutId, CheckoutAttributesUpdateInputGQO input) throws Exception;

    CheckoutPayloadGQO checkoutCustomerAssociate(String checkoutId, String customerAccessToken) throws Exception;

    CheckoutPayloadGQO checkoutCustomerDisassociate(String checkoutId) throws Exception;

    CheckoutCompletePayloadGQO checkoutCompleteRequest(CheckoutCompleteRequestInputGQO input) throws Exception;

    CheckoutCompletePayloadGQO checkoutCompleteApprove(CheckoutCompleteApproveInputGQO input) throws Exception;

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithCreditCard(CreditCardPaymentInputGQO input) throws Exception;

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithWeixinPaymentStep1(WeixinPaymentStep1InputGQO input) throws Exception;

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithWeixinPaymentStep2(WeixinPaymentStep2InputGQO input) throws Exception;

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithAlipayPaymentStep1(AlipayPaymentStep1InputGQO input) throws Exception;

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithAlipayPaymentStep2(AlipayPaymentStep2InputGQO input) throws Exception;

    PaymentCompletePayloadGQO paymentCompleteCheckoutWithTokenizedPayment(TokenizedPaymentInputGQO input) throws Exception;

}