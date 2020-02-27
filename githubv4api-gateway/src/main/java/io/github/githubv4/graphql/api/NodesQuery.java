package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface NodesQuery {

    @javax.validation.constraints.NotNull
    Collection<NodeGQO> nodes(Collection<String> ids) throws Exception;

}