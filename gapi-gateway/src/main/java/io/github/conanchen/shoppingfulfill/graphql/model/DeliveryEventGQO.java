package io.github.conanchen.shoppingfulfill.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class DeliveryEventGQO implements NodeGQO {

    @javax.validation.constraints.NotNull
    private String id;

    public DeliveryEventGQO() {
    }

    public DeliveryEventGQO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}