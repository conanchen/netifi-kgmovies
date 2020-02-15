package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.api.*;

public class CheckoutInputGQO {

    @javax.validation.constraints.NotNull
    private String cartId;
    private String email;
    @javax.validation.constraints.NotNull
    private AddressInputGQO shipping;
    private AddressInputGQO billing;

    public CheckoutInputGQO() {
    }

    public CheckoutInputGQO(String cartId, String email, AddressInputGQO shipping, AddressInputGQO billing) {
        this.cartId = cartId;
        this.email = email;
        this.shipping = shipping;
        this.billing = billing;
    }

    public String getCartId() {
        return cartId;
    }
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public AddressInputGQO getShipping() {
        return shipping;
    }
    public void setShipping(AddressInputGQO shipping) {
        this.shipping = shipping;
    }

    public AddressInputGQO getBilling() {
        return billing;
    }
    public void setBilling(AddressInputGQO billing) {
        this.billing = billing;
    }

}