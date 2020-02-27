package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface ContributionGQO {

    Boolean getIsRestricted();

    java.util.Date getOccurredAt();

    String getResourcePath();

    String getUrl();

    UserGQO getUser();

}