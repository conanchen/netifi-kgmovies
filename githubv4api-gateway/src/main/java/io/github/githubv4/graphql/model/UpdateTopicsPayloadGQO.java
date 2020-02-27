package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateTopicsPayloadGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private Collection<String> invalidTopicNames;
    private RepositoryGQO repository;

    public UpdateTopicsPayloadGQO() {
    }

    public UpdateTopicsPayloadGQO(String clientMutationId, Collection<String> invalidTopicNames, RepositoryGQO repository) {
        this.clientMutationId = clientMutationId;
        this.invalidTopicNames = invalidTopicNames;
        this.repository = repository;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Collection<String> getInvalidTopicNames() {
        return invalidTopicNames;
    }
    public void setInvalidTopicNames(Collection<String> invalidTopicNames) {
        this.invalidTopicNames = invalidTopicNames;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

}