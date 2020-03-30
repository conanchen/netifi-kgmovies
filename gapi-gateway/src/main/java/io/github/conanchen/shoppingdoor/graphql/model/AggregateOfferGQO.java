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
public class AggregateOfferGQO {


    private Integer highPrice;

    private Integer lowPrice;

    private Integer offerCount;

    private Collection<OfferGQO> offers;

    public AggregateOfferGQO() {
    }

    public AggregateOfferGQO( Integer highPrice,  Integer lowPrice,  Integer offerCount,  Collection<OfferGQO> offers) {
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
        this.offerCount = offerCount;
        this.offers = offers;
    }

}