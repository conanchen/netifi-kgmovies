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
public class GeneralProductGQO implements ThingGQO, ProductGQO, ShoppingableGQO, ConversationalThingGQO, NodeGQO{


    private Boolean isShoppingable;

    private String name;

    private String alternateName;

    private String description;

    private String productID;

    private Collection<ProductGQO> isRelatedTo;

    private Collection<ProductGQO> isSimilarTo;

    private OrganizationGQO manufacturer;

    private Collection<ItemCategoryGQO> itemCategory;

    private Collection<ProductModelGQO> models;

    private AggregateOfferGQO offers;

    private Collection<DemandGQO> demands;

    private AggregateReviewGQO aggregateReview;

    private Collection<ConversationGQO> availableConversations;

    private ConversationGQO defaultConversation;
    @lombok.NonNull
    private String id;

    public GeneralProductGQO() {
    }

    public GeneralProductGQO( Boolean isShoppingable,  String name,  String alternateName,  String description,  String productID,  Collection<ProductGQO> isRelatedTo,  Collection<ProductGQO> isSimilarTo,  OrganizationGQO manufacturer,  Collection<ItemCategoryGQO> itemCategory,  Collection<ProductModelGQO> models,  AggregateOfferGQO offers,  Collection<DemandGQO> demands,  AggregateReviewGQO aggregateReview,  Collection<ConversationGQO> availableConversations,  ConversationGQO defaultConversation,  String id) {
        this.isShoppingable = isShoppingable;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.productID = productID;
        this.isRelatedTo = isRelatedTo;
        this.isSimilarTo = isSimilarTo;
        this.manufacturer = manufacturer;
        this.itemCategory = itemCategory;
        this.models = models;
        this.offers = offers;
        this.demands = demands;
        this.aggregateReview = aggregateReview;
        this.availableConversations = availableConversations;
        this.defaultConversation = defaultConversation;
        this.id = id;
    }

}