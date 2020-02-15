package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class DiscountApplicationGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String id;

    public DiscountApplicationGQO() {
    }

    public DiscountApplicationGQO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}