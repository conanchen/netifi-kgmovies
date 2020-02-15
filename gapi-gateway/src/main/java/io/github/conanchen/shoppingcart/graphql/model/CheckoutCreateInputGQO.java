package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.api.*;

public class CheckoutCreateInputGQO {

    @javax.validation.constraints.NotNull
    private String id;

    public CheckoutCreateInputGQO() {
    }

    public CheckoutCreateInputGQO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}