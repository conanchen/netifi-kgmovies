package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReopenPullRequestPayloadGQO {

    private String clientMutationId;
    private PullRequestGQO pullRequest;

    public ReopenPullRequestPayloadGQO() {
    }

    public ReopenPullRequestPayloadGQO(String clientMutationId, PullRequestGQO pullRequest) {
        this.clientMutationId = clientMutationId;
        this.pullRequest = pullRequest;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public PullRequestGQO getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequestGQO pullRequest) {
        this.pullRequest = pullRequest;
    }

}