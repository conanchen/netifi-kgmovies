package io.github.conanchen.fulfill.graphql.model;

import java.util.*;
import io.github.conanchen.fulfill.graphql.api.*;
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