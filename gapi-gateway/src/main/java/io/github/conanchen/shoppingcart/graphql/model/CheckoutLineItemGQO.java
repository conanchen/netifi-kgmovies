package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class CheckoutLineItemGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private Collection<CustomAttributeGQO> customAttributes;
    @javax.validation.constraints.NotNull
    private Collection<DiscountAllocationGQO> discountAllocations;
    @javax.validation.constraints.NotNull
    private Integer quantity;
    @javax.validation.constraints.NotNull
    private String title;

    private ShoppingableGQO variant;
    @javax.validation.constraints.NotNull
    private String id;

    public CheckoutLineItemGQO() {
    }

    public CheckoutLineItemGQO( Collection<CustomAttributeGQO> customAttributes,  Collection<DiscountAllocationGQO> discountAllocations,  Integer quantity,  String title,  ShoppingableGQO variant,  String id) {
        this.customAttributes = customAttributes;
        this.discountAllocations = discountAllocations;
        this.quantity = quantity;
        this.title = title;
        this.variant = variant;
        this.id = id;
    }

}