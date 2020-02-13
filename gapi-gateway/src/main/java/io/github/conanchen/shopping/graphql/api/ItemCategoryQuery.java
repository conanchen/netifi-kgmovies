package io.github.conanchen.shopping.graphql.api;

import java.util.*;
import io.github.conanchen.shopping.graphql.model.*;

public interface ItemCategoryQuery {

    ItemCategoryGQO itemCategory(String id, String itcgID) throws Exception;

}