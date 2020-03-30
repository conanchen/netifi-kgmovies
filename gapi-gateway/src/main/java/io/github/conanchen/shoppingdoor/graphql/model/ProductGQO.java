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

    AggregateReviewGQO getAggregateReview();

}