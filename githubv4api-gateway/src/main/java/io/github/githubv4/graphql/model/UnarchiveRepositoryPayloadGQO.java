package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UnarchiveRepositoryPayloadGQO {

    private String clientMutationId;
    private RepositoryGQO repository;

    public UnarchiveRepositoryPayloadGQO() {
    }

    public UnarchiveRepositoryPayloadGQO(String clientMutationId, RepositoryGQO repository) {
        this.clientMutationId = clientMutationId;
        this.repository = repository;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

}