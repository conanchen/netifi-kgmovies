package io.github.conanchen.shoppingdoor.graphql.model;

import io.github.conanchen.intangible.graphql.model.ReviewGQO;
import io.github.conanchen.organization.graphql.model.OrganizationGQO;

import java.util.Collection;

public interface ProductGQO {

    Boolean getIsShoppingable();

    String getName();

    String getAlternateName();

    String getDescription();

    String getProductID();

    Collection<ProductGQO> getIsRelatedTo();

    Collection<ProductGQO> getIsSimilarTo();

    OrganizationGQO getManufacturer();

    Collection<ItemCategoryGQO> getItemCategory();

    Collection<ProductModelGQO> getModels();

    AggregateOfferGQO getOffers();

    Collection<DemandGQO> getDemands();

    Collection<ReviewGQO> getReview();

}