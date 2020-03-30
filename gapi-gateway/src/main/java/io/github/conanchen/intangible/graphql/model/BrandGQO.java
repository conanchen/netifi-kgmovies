package io.github.conanchen.intangible.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.intangible.graphql.api.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class BrandGQO implements ThingGQO, NodeGQO{


    private String name;

    private String alternateName;

    private String description;

    private AggregateReviewGQO aggregateReview;

    private String logo;

    private String slogan;
    @lombok.NonNull
    private String id;

    public BrandGQO() {
    }

    public BrandGQO( String name,  String alternateName,  String description,  AggregateReviewGQO aggregateReview,  String logo,  String slogan,  String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.aggregateReview = aggregateReview;
        this.logo = logo;
        this.slogan = slogan;
        this.id = id;
    }

}