package io.github.conanchen.shopping.graphql.model;

import java.util.Collection;
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

}