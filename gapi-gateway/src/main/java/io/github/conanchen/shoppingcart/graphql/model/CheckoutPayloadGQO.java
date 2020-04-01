package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class CheckoutPayloadGQO {


    private CheckoutGQO checkout;
    @lombok.NonNull
    private Collection<CheckoutErrorGQO> checkoutErrors;

    public CheckoutPayloadGQO() {
    }

    public CheckoutPayloadGQO( CheckoutGQO checkout,  Collection<CheckoutErrorGQO> checkoutErrors) {
        this.checkout = checkout;
        this.checkoutErrors = checkoutErrors;
    }

}