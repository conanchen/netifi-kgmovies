package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface RepositoryOwnerQuery {

    RepositoryOwnerGQO repositoryOwner(String login) throws Exception;

}