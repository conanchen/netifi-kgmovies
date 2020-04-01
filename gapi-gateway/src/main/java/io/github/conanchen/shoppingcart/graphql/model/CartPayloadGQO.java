package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class CartPayloadGQO {


    private CartGQO cart;
    @lombok.NonNull
    private Collection<CartErrorGQO> cartErrors;

    public CartPayloadGQO() {
    }

    public CartPayloadGQO( CartGQO cart,  Collection<CartErrorGQO> cartErrors) {
        this.cart = cart;
        this.cartErrors = cartErrors;
    }

}