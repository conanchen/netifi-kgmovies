package io.github.conanchen.shoppingdoor.graphql.model;

import java.util.Collection;
import io.github.conanchen.message.graphql.model.ActionGQO;
import io.github.conanchen.zommon.graphql.model.PlaceGQO;

public interface ServiceGQO {

    String getName();

    String getAlternateName();

    String getDescription();

    PlaceGQO getAreaServed();

    OpeningHoursSpecificationGQO getHoursAvailable();

    ProductGQO getIsRelatedTo();

    ServiceGQO getIsSimilarTo();

    Collection<ActionGQO> getPotentialAction();

    Collection<ItemCategoryGQO> getItemCategory();

}