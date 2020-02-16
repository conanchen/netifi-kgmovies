package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class DiscountAllocationGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private MoneyGQO allocatedAmount;
    @javax.validation.constraints.NotNull
    private DiscountApplicationGQO discountApplication;
    @javax.validation.constraints.NotNull
    private String id;

    public DiscountAllocationGQO() {
    }

    public DiscountAllocationGQO(MoneyGQO allocatedAmount, DiscountApplicationGQO discountApplication, String id) {
        this.allocatedAmount = allocatedAmount;
        this.discountApplication = discountApplication;
        this.id = id;
    }

    public MoneyGQO getAllocatedAmount() {
        return allocatedAmount;
    }
    public void setAllocatedAmount(MoneyGQO allocatedAmount) {
        this.allocatedAmount = allocatedAmount;
    }

    public DiscountApplicationGQO getDiscountApplication() {
        return discountApplication;
    }
    public void setDiscountApplication(DiscountApplicationGQO discountApplication) {
        this.discountApplication = discountApplication;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}