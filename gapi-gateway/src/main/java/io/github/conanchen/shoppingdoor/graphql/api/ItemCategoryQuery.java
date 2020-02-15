package io.github.conanchen.shoppingdoor.graphql.api;

import io.github.conanchen.shoppingdoor.graphql.model.ItemCategoryGQO;

public interface ItemCategoryQuery {

    ItemCategoryGQO itemCategory(String id, String itcgID) throws Exception;

}