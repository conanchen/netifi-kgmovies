package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.api.*;

public class WeixinPaymentStep2InputGQO {

    @javax.validation.constraints.NotNull
    private String id;

    public WeixinPaymentStep2InputGQO() {
    }

    public WeixinPaymentStep2InputGQO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}