package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateTopicsInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    @javax.validation.constraints.NotNull
    private Collection<String> topicNames;

    public UpdateTopicsInputGQO() {
    }

    public UpdateTopicsInputGQO(String clientMutationId, String repositoryId, Collection<String> topicNames) {
        this.clientMutationId = clientMutationId;
        this.repositoryId = repositoryId;
        this.topicNames = topicNames;
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

    public Collection<String> getTopicNames() {
        return topicNames;
    }
    public void setTopicNames(Collection<String> topicNames) {
        this.topicNames = topicNames;
    }

}