package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.api.*;

public class CheckoutPayloadGQO {

    private CheckoutGQO checkout;
    @javax.validation.constraints.NotNull
    private Collection<CheckoutErrorGQO> checkoutErrors;

    public CheckoutPayloadGQO() {
    }

    public CheckoutPayloadGQO(CheckoutGQO checkout, Collection<CheckoutErrorGQO> checkoutErrors) {
        this.checkout = checkout;
        this.checkoutErrors = checkoutErrors;
    }

    public CheckoutGQO getCheckout() {
        return checkout;
    }
    public void setCheckout(CheckoutGQO checkout) {
        this.checkout = checkout;
    }

    public Collection<CheckoutErrorGQO> getCheckoutErrors() {
        return checkoutErrors;
    }
    public void setCheckoutErrors(Collection<CheckoutErrorGQO> checkoutErrors) {
        this.checkoutErrors = checkoutErrors;
    }

}