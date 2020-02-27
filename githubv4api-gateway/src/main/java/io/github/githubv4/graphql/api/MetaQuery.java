package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface MetaQuery {

    @javax.validation.constraints.NotNull
    GitHubMetadataGQO meta() throws Exception;

}