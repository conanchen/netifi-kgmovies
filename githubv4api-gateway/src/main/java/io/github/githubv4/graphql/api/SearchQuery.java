package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface SearchQuery {

    @javax.validation.constraints.NotNull
    SearchResultItemConnectionGQO search(String after, String before, Integer first, Integer last, String query, SearchTypeGQO type) throws Exception;

}