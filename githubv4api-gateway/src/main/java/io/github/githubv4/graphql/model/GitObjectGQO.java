package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface GitObjectGQO {

    String getAbbreviatedOid();

    String getCommitResourcePath();

    String getCommitUrl();

    String getId();

    String getOid();

    RepositoryGQO getRepository();

}