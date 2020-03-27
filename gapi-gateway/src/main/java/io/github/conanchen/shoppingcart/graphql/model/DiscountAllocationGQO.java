package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DiscountAllocationGQO implements NodeGQO{

    @lombok.NonNull
    private MoneyGQO allocatedAmount;
    @lombok.NonNull
    private DiscountApplicationGQO discountApplication;
    @lombok.NonNull
    private String id;

    public DiscountAllocationGQO() {
    }

    public DiscountAllocationGQO( MoneyGQO allocatedAmount,  DiscountApplicationGQO discountApplication,  String id) {
        this.allocatedAmount = allocatedAmount;
        this.discountApplication = discountApplication;
        this.id = id;
    }

}