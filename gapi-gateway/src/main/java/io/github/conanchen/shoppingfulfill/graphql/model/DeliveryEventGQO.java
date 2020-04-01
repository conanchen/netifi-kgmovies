package io.github.conanchen.shoppingfulfill.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class DeliveryEventGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String id;

    public DeliveryEventGQO() {
    }

    public DeliveryEventGQO( String id) {
        this.id = id;
    }

}