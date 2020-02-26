package io.github.conanchen.shoppingcart.graphql.model;

public class AvailableShippingRatesGQO {

    private String id;

    public AvailableShippingRatesGQO() {
    }

    public AvailableShippingRatesGQO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}