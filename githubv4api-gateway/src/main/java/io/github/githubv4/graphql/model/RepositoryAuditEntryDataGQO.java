package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface RepositoryAuditEntryDataGQO {

    RepositoryGQO getRepository();

    String getRepositoryName();

    String getRepositoryResourcePath();

    String getRepositoryUrl();

}