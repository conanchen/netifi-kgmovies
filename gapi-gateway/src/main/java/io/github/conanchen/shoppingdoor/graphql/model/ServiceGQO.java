package io.github.conanchen.shoppingdoor.graphql.model;

import java.util.Collection;
import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.intangible.graphql.model.AggregateRatingGQO;
import io.github.conanchen.intangible.graphql.model.ReviewGQO;
import io.github.conanchen.place.graphql.model.PlaceGQO;

public interface ServiceGQO {

    String getName();

    String getAlternateName();

    String getDescription();

    AggregateRatingGQO getAggregateRating();

    PlaceGQO getAreaServed();

    OpeningHoursSpecificationGQO getHoursAvailable();

    ProductGQO getIsRelatedTo();

    ServiceGQO getIsSimilarTo();

    Collection<ActionGQO> getPotentialAction();

    Collection<ItemCategoryGQO> getItemCategory();

    Collection<OfferGQO> getOffers();

    Collection<DemandGQO> getDemands();

    Collection<ReviewGQO> getReview();

}