package io.github.conanchen.shoppingdoor.graphql.model;

import java.util.Collection;
import io.github.conanchen.intangible.graphql.model.ReviewGQO;
import io.github.conanchen.message.graphql.model.OrganizationGQO;

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

    ProductGQO getIsVariantOf();

    ProductGQO getPredecessorOf();

    ProductGQO getSuccessorOf();

    Collection<OfferGQO> getOffers();

    Collection<DemandGQO> getDemands();

    Collection<ReviewGQO> getReview();

}