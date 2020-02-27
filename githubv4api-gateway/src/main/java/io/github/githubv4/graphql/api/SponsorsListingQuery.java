package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface SponsorsListingQuery {

    SponsorsListingGQO sponsorsListing(String slug) throws Exception;

}