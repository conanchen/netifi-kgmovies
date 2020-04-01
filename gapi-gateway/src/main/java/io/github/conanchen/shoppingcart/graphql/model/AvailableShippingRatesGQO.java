package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AvailableShippingRatesGQO {


    private String id;

    public AvailableShippingRatesGQO() {
    }

    public AvailableShippingRatesGQO( String id) {
        this.id = id;
    }

}