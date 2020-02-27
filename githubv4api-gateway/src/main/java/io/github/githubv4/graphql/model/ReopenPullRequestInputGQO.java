package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReopenPullRequestInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String pullRequestId;

    public ReopenPullRequestInputGQO() {
    }

    public ReopenPullRequestInputGQO(String clientMutationId, String pullRequestId) {
        this.clientMutationId = clientMutationId;
        this.pullRequestId = pullRequestId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

}