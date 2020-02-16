package io.github.conanchen.shoppingcart.graphql.mutation;

import javax.validation.constraints.NotNull;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.shoppingcart.graphql.api.Mutation;
import io.github.conanchen.shoppingcart.graphql.model.AddToCartInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.AlipayPaymentStep1InputGQO;
import io.github.conanchen.shoppingcart.graphql.model.AlipayPaymentStep2InputGQO;
import io.github.conanchen.shoppingcart.graphql.model.CartPayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.CheckoutAttributesUpdateInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.CheckoutCompleteApproveInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.CheckoutCompletePayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.CheckoutCompleteRequestInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.CheckoutCreateInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.CheckoutCreatePlusOrderInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.CheckoutPayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.CreditCardPaymentInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.EmptyCartInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.MailingAddressInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.PaymentCompletePayloadGQO;
import io.github.conanchen.shoppingcart.graphql.model.RemoveCartItemInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.SetCartItemsInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.TokenizedPaymentInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.UpdateCartItemInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.UpdateItemQuantityInputGQO;
import io.github.conanchen.shoppingcart.graphql.model.WeixinPaymentStep1InputGQO;
import io.github.conanchen.shoppingcart.graphql.model.WeixinPaymentStep2InputGQO;

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
  public CheckoutPayloadGQO checkoutShippingAddressUpdate(MailingAddressInputGQO shippingAddress,
      String checkoutId) throws Exception {
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


  
}