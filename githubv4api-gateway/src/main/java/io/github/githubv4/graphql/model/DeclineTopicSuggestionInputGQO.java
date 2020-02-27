package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeclineTopicSuggestionInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private TopicSuggestionDeclineReasonGQO reason;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public DeclineTopicSuggestionInputGQO() {
    }

    public DeclineTopicSuggestionInputGQO(String clientMutationId, String name, TopicSuggestionDeclineReasonGQO reason, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.reason = reason;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public TopicSuggestionDeclineReasonGQO getReason() {
        return reason;
    }
    public void setReason(TopicSuggestionDeclineReasonGQO reason) {
        this.reason = reason;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}