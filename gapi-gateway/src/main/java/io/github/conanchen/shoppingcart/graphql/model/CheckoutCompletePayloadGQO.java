package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class CheckoutCompletePayloadGQO {


    private PoderGQO poder;
    @lombok.NonNull
    private Collection<CheckoutErrorGQO> checkoutErrors;

    public CheckoutCompletePayloadGQO() {
    }

    public CheckoutCompletePayloadGQO( PoderGQO poder,  Collection<CheckoutErrorGQO> checkoutErrors) {
        this.poder = poder;
        this.checkoutErrors = checkoutErrors;
    }

}