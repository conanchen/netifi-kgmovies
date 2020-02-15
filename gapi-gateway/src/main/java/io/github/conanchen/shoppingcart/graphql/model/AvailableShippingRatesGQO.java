package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.api.*;

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