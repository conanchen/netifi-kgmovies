package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface MarketplaceCategoriesQuery {

    @javax.validation.constraints.NotNull
    Collection<MarketplaceCategoryGQO> marketplaceCategories(Boolean excludeEmpty, Boolean excludeSubcategories, Collection<String> includeCategories) throws Exception;

}