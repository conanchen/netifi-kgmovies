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
public class DemandGQO implements ThingGQO, ShoppingableGQO, NodeGQO{


    private Boolean isShoppingable;

    private String name;

    private String alternateName;

    private String description;

    private PlaceGQO areaServed;

    private BusinessFunctionGQO businessFunction;

    private ServiceGQO itemOffered;

    private PartyGQO seeker;
    @lombok.NonNull
    private String id;

    public DemandGQO() {
    }

    public DemandGQO( Boolean isShoppingable,  String name,  String alternateName,  String description,  PlaceGQO areaServed,  BusinessFunctionGQO businessFunction,  ServiceGQO itemOffered,  PartyGQO seeker,  String id) {
        this.isShoppingable = isShoppingable;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.areaServed = areaServed;
        this.businessFunction = businessFunction;
        this.itemOffered = itemOffered;
        this.seeker = seeker;
        this.id = id;
    }

}