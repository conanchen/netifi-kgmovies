package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.api.*;

public class SetCartItemsInputGQO {

    @javax.validation.constraints.NotNull
    private String cartId;
    @javax.validation.constraints.NotNull
    private Collection<SetCartItemInputGQO> items;

    public SetCartItemsInputGQO() {
    }

    public SetCartItemsInputGQO(String cartId, Collection<SetCartItemInputGQO> items) {
        this.cartId = cartId;
        this.items = items;
    }

    public String getCartId() {
        return cartId;
    }
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Collection<SetCartItemInputGQO> getItems() {
        return items;
    }
    public void setItems(Collection<SetCartItemInputGQO> items) {
        this.items = items;
    }

}