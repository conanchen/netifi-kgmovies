package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.api.*;

public class WeixinPaymentStep1InputGQO {

    @javax.validation.constraints.NotNull
    private String id;

    public WeixinPaymentStep1InputGQO() {
    }

    public WeixinPaymentStep1InputGQO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}