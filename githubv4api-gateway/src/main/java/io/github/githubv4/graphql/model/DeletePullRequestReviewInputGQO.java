package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeletePullRequestReviewInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String pullRequestReviewId;

    public DeletePullRequestReviewInputGQO() {
    }

    public DeletePullRequestReviewInputGQO(String clientMutationId, String pullRequestReviewId) {
        this.clientMutationId = clientMutationId;
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getPullRequestReviewId() {
        return pullRequestReviewId;
    }
    public void setPullRequestReviewId(String pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
    }

}