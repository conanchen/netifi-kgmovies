package io.github.conanchen.shoppingcart.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.shoppingcart.graphql.api.Mutation;
import io.github.conanchen.shoppingcart.graphql.model.*;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class ShoppingCartMutationResolver implements Mutation,GraphQLMutationResolver {


  @Override
  public @NotNull CartPayloadGQO cartAddItem(AddToCartInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NotNull CartPayloadGQO cartSetItems(SetCartItemsInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NotNull CartPayloadGQO cartUpdateItem(UpdateCartItemInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NotNull CartPayloadGQO cartIncrementItemQuantity(UpdateItemQuantityInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NotNull CartPayloadGQO cartDecrementItemQuantity(UpdateItemQuantityInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NotNull CartPayloadGQO cartRemoveItem(RemoveCartItemInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NotNull CartPayloadGQO cartEmpty(EmptyCartInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutCreate(CheckoutCreateInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutCreatePlusPoder(CheckoutCreatePlusPoderInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutDiscountCodeApply(String discountCode, String checkoutId, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutDiscountCodeRemove(String checkoutId, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutShippingAddressUpdate(PostalAddressInputGQO shippingAddress, String checkoutId, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutEmailUpdate(String checkoutId, String email, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutPhoneUpdate(String checkoutId, String email, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutAttributesUpdate(String checkoutId, CheckoutAttributesUpdateInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutCustomerAssociate(String checkoutId, String customerAccessToken, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutCustomerDisassociate(String checkoutId, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutCompletePayloadGQO checkoutCompleteRequest(CheckoutCompleteRequestInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutCompletePayloadGQO checkoutCompleteApprove(CheckoutCompleteApproveInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public PaymentCompletePayloadGQO paymentCompleteCheckoutWithCreditCard(CreditCardPaymentInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public PaymentCompletePayloadGQO paymentCompleteCheckoutWithWeixinPaymentStep1(WeixinPaymentStep1InputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public PaymentCompletePayloadGQO paymentCompleteCheckoutWithWeixinPaymentStep2(WeixinPaymentStep2InputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public PaymentCompletePayloadGQO paymentCompleteCheckoutWithAlipayPaymentStep1(AlipayPaymentStep1InputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public PaymentCompletePayloadGQO paymentCompleteCheckoutWithAlipayPaymentStep2(AlipayPaymentStep2InputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public PaymentCompletePayloadGQO paymentCompleteCheckoutWithTokenizedPayment(TokenizedPaymentInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }
}