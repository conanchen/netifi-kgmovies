package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface MarketplaceListingsQuery {

    @javax.validation.constraints.NotNull
    MarketplaceListingConnectionGQO marketplaceListings(String adminId, String after, Boolean allStates, String before, String categorySlug, Integer first, Integer last, String organizationId, Boolean primaryCategoryOnly, Collection<String> slugs, Boolean useTopicAliases, Boolean viewerCanAdmin, Boolean withFreeTrialsOnly) throws Exception;

}