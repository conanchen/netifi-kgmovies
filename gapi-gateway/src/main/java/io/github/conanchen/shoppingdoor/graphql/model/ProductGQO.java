package io.github.conanchen.shoppingdoor.graphql.model;

import java.util.Collection;
import io.github.conanchen.intangible.graphql.model.ReviewGQO;
import io.github.conanchen.personorg.graphql.model.OrganizationGQO;

public interface ProductGQO {

    Boolean getIsOrderable();

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