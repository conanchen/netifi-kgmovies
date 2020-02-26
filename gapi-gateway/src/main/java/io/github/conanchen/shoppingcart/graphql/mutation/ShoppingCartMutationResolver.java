package io.github.conanchen.shoppingcart.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.github.conanchen.shoppingcart.graphql.api.Mutation;
import io.github.conanchen.shoppingcart.graphql.model.*;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class ShoppingCartMutationResolver implements Mutation,GraphQLMutationResolver {

  @Override
  public @NotNull CartPayloadGQO cartAddItem(AddToCartInputGQO input) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public @NotNull CartPayloadGQO cartSetItems(SetCartItemsInputGQO input) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public @NotNull CartPayloadGQO cartUpdateItem(UpdateCartItemInputGQO input) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public @NotNull CartPayloadGQO cartIncrementItemQuantity(UpdateItemQuantityInputGQO input)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public @NotNull CartPayloadGQO cartDecrementItemQuantity(UpdateItemQuantityInputGQO input)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public @NotNull CartPayloadGQO cartRemoveItem(RemoveCartItemInputGQO input) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public @NotNull CartPayloadGQO cartEmpty(EmptyCartInputGQO input) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutCreate(CheckoutCreateInputGQO input) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutCreatePlusOrder(CheckoutCreatePlusOrderInputGQO input)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutDiscountCodeApply(String discountCode, String checkoutId)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutDiscountCodeRemove(String checkoutId) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  

  @Override
  public CheckoutPayloadGQO checkoutEmailUpdate(String checkoutId, String email) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutPhoneUpdate(String checkoutId, String email) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutAttributesUpdate(String checkoutId,
      CheckoutAttributesUpdateInputGQO input) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutCustomerAssociate(String checkoutId, String customerAccessToken)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutCustomerDisassociate(String checkoutId) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CheckoutCompletePayloadGQO checkoutCompleteRequest(CheckoutCompleteRequestInputGQO input)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CheckoutCompletePayloadGQO checkoutCompleteApprove(CheckoutCompleteApproveInputGQO input)
      throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public PaymentCompletePayloadGQO paymentCompleteCheckoutWithCreditCard(
      CreditCardPaymentInputGQO input) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public PaymentCompletePayloadGQO paymentCompleteCheckoutWithWeixinPaymentStep1(
      WeixinPaymentStep1InputGQO input) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public PaymentCompletePayloadGQO paymentCompleteCheckoutWithWeixinPaymentStep2(
      WeixinPaymentStep2InputGQO input) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public PaymentCompletePayloadGQO paymentCompleteCheckoutWithAlipayPaymentStep1(
      AlipayPaymentStep1InputGQO input) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public PaymentCompletePayloadGQO paymentCompleteCheckoutWithAlipayPaymentStep2(
      AlipayPaymentStep2InputGQO input) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public PaymentCompletePayloadGQO paymentCompleteCheckoutWithTokenizedPayment(
      TokenizedPaymentInputGQO input) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CheckoutPayloadGQO checkoutShippingAddressUpdate(PostalAddressInputGQO shippingAddress,
      String checkoutId) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }


  
}