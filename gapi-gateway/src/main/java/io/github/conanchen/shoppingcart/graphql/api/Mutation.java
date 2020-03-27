package io.github.conanchen.shoppingcart.graphql.api;

import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface Mutation {
// KK
    @javax.validation.constraints.NotNull
    CartPayloadGQO cartAddItem(AddToCartInputGQO input, DataFetchingEnvironment env) throws Exception;
    @javax.validation.constraints.NotNull
    CartPayloadGQO cartSetItems(SetCartItemsInputGQO input, DataFetchingEnvironment env) throws Exception;
    @javax.validation.constraints.NotNull
    CartPayloadGQO cartUpdateItem(UpdateCartItemInputGQO input, DataFetchingEnvironment env) throws Exception;
    @javax.validation.constraints.NotNull
    CartPayloadGQO cartIncrementItemQuantity(UpdateItemQuantityInputGQO input, DataFetchingEnvironment env) throws Exception;
    @javax.validation.constraints.NotNull
    CartPayloadGQO cartDecrementItemQuantity(UpdateItemQuantityInputGQO input, DataFetchingEnvironment env) throws Exception;
    @javax.validation.constraints.NotNull
    CartPayloadGQO cartRemoveItem(RemoveCartItemInputGQO input, DataFetchingEnvironment env) throws Exception;
    @javax.validation.constraints.NotNull
    CartPayloadGQO cartEmpty(EmptyCartInputGQO input, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutCreate(CheckoutCreateInputGQO input, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutCreatePlusPoder(CheckoutCreatePlusPoderInputGQO input, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutDiscountCodeApply(String discountCode, String checkoutId, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutDiscountCodeRemove(String checkoutId, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutShippingAddressUpdate(PostalAddressInputGQO shippingAddress, String checkoutId, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutEmailUpdate(String checkoutId, String email, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutPhoneUpdate(String checkoutId, String email, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutAttributesUpdate(String checkoutId, CheckoutAttributesUpdateInputGQO input, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutCustomerAssociate(String checkoutId, String customerAccessToken, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutCustomerDisassociate(String checkoutId, DataFetchingEnvironment env) throws Exception;
    CheckoutCompletePayloadGQO checkoutCompleteRequest(CheckoutCompleteRequestInputGQO input, DataFetchingEnvironment env) throws Exception;
    CheckoutCompletePayloadGQO checkoutCompleteApprove(CheckoutCompleteApproveInputGQO input, DataFetchingEnvironment env) throws Exception;
    PaymentCompletePayloadGQO paymentCompleteCheckoutWithCreditCard(CreditCardPaymentInputGQO input, DataFetchingEnvironment env) throws Exception;
    PaymentCompletePayloadGQO paymentCompleteCheckoutWithWeixinPaymentStep1(WeixinPaymentStep1InputGQO input, DataFetchingEnvironment env) throws Exception;
    PaymentCompletePayloadGQO paymentCompleteCheckoutWithWeixinPaymentStep2(WeixinPaymentStep2InputGQO input, DataFetchingEnvironment env) throws Exception;
    PaymentCompletePayloadGQO paymentCompleteCheckoutWithAlipayPaymentStep1(AlipayPaymentStep1InputGQO input, DataFetchingEnvironment env) throws Exception;
    PaymentCompletePayloadGQO paymentCompleteCheckoutWithAlipayPaymentStep2(AlipayPaymentStep2InputGQO input, DataFetchingEnvironment env) throws Exception;
    PaymentCompletePayloadGQO paymentCompleteCheckoutWithTokenizedPayment(TokenizedPaymentInputGQO input, DataFetchingEnvironment env) throws Exception;
}