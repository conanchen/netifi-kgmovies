package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ArchiveRepositoryInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public ArchiveRepositoryInputGQO() {
    }

    public ArchiveRepositoryInputGQO(String clientMutationId, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}