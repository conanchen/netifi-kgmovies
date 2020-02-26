package io.github.conanchen.shoppingcart.graphql.model;

public class ShippingRateGQO {

    private String id;

    public ShippingRateGQO() {
    }

    public ShippingRateGQO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}