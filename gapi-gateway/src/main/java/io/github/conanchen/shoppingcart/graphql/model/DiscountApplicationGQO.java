package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DiscountApplicationGQO implements NodeGQO{

    @lombok.NonNull
    private String id;

    public DiscountApplicationGQO() {
    }

    public DiscountApplicationGQO( String id) {
        this.id = id;
    }

}