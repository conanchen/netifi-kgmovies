package io.github.conanchen.shoppingdoor.graphql.model;

import java.util.Collection;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.message.graphql.model.AggregateReviewGQO;
import io.github.conanchen.place.graphql.model.PlaceGQO;

public interface ServiceGQO {

    String getName();

    String getAlternateName();

    String getDescription();

    AggregateReviewGQO getAggregateReview();

    PlaceGQO getAreaServed();

    OpeningHoursSpecificationGQO getHoursAvailable();

    ProductGQO getIsRelatedTo();

    ServiceGQO getIsSimilarTo();

    Collection<ActionGQO> getPotentialAction();

    Collection<ItemCategoryGQO> getItemCategory();

    AggregateOfferGQO getOffers();

    Collection<DemandGQO> getDemands();


}