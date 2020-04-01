package io.github.conanchen.shoppingdoor.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class OfferGQO implements ThingGQO, ShoppingableGQO, NodeGQO{


    private Boolean isShoppingable;

    private String name;

    private String alternateName;

    private String description;

    private ProductGQO itemOffered;

    private PartyGQO offeredBy;

    private Integer price;
    @lombok.NonNull
    private String id;

    public OfferGQO() {
    }

    public OfferGQO( Boolean isShoppingable,  String name,  String alternateName,  String description,  ProductGQO itemOffered,  PartyGQO offeredBy,  Integer price,  String id) {
        this.isShoppingable = isShoppingable;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.itemOffered = itemOffered;
        this.offeredBy = offeredBy;
        this.price = price;
        this.id = id;
    }

}