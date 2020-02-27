package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface ReactableGQO {

    Integer getDatabaseId();

    String getId();

    Collection<ReactionGroupGQO> getReactionGroups();

    ReactionConnectionGQO getReactions();

    Boolean getViewerCanReact();

}