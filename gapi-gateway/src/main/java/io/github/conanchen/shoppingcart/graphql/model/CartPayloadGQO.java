package io.github.conanchen.shoppingcart.graphql.model;

import java.util.Collection;

public class CartPayloadGQO {

    private CartGQO cart;
    @javax.validation.constraints.NotNull
    private Collection<CartErrorGQO> cartErrors;

    public CartPayloadGQO() {
    }

    public CartPayloadGQO(CartGQO cart, Collection<CartErrorGQO> cartErrors) {
        this.cart = cart;
        this.cartErrors = cartErrors;
    }

    public CartGQO getCart() {
        return cart;
    }
    public void setCart(CartGQO cart) {
        this.cart = cart;
    }

    public Collection<CartErrorGQO> getCartErrors() {
        return cartErrors;
    }
    public void setCartErrors(Collection<CartErrorGQO> cartErrors) {
        this.cartErrors = cartErrors;
    }

}