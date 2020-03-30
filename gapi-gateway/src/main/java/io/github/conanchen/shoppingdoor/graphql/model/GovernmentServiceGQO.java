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
public class GovernmentServiceGQO implements ThingGQO, ServiceGQO, NodeGQO{


    private OrganizationGQO serviceOperator;

    private String name;

    private String alternateName;

    private String description;

    private PlaceGQO areaServed;

    private OpeningHoursSpecificationGQO hoursAvailable;

    private ProductGQO isRelatedTo;

    private ServiceGQO isSimilarTo;

    private Collection<ActionGQO> potentialActions;

    private Collection<ItemCategoryGQO> itemCategory;

    private AggregateOfferGQO offers;

    private Collection<DemandGQO> demands;

    private AggregateReviewGQO aggregateReview;
    @lombok.NonNull
    private String id;

    public GovernmentServiceGQO() {
    }

    public GovernmentServiceGQO( OrganizationGQO serviceOperator,  String name,  String alternateName,  String description,  PlaceGQO areaServed,  OpeningHoursSpecificationGQO hoursAvailable,  ProductGQO isRelatedTo,  ServiceGQO isSimilarTo,  Collection<ActionGQO> potentialActions,  Collection<ItemCategoryGQO> itemCategory,  AggregateOfferGQO offers,  Collection<DemandGQO> demands,  AggregateReviewGQO aggregateReview,  String id) {
        this.serviceOperator = serviceOperator;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.areaServed = areaServed;
        this.hoursAvailable = hoursAvailable;
        this.isRelatedTo = isRelatedTo;
        this.isSimilarTo = isSimilarTo;
        this.potentialActions = potentialActions;
        this.itemCategory = itemCategory;
        this.offers = offers;
        this.demands = demands;
        this.aggregateReview = aggregateReview;
        this.id = id;
    }

}