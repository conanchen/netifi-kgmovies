package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface RepositoryQuery {

    RepositoryGQO repository(String name, String owner) throws Exception;

}