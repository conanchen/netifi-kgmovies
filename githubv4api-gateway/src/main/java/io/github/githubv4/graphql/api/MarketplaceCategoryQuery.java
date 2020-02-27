package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface MarketplaceCategoryQuery {

    MarketplaceCategoryGQO marketplaceCategory(String slug, Boolean useTopicAliases) throws Exception;

}