package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface RepositoryOwnerGQO {

    String getAvatarUrl();

    String getId();

    String getLogin();

    RepositoryConnectionGQO getPinnedRepositories();

    RepositoryConnectionGQO getRepositories();

    RepositoryGQO getRepository();

    String getResourcePath();

    String getUrl();

}