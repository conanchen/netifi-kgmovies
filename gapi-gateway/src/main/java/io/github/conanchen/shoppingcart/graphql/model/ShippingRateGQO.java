package io.github.conanchen.shoppingcart.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShippingRateGQO {


    private String id;

    public ShippingRateGQO() {
    }

    public ShippingRateGQO( String id) {
        this.id = id;
    }

}