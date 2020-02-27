package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DismissPullRequestReviewInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String message;
    @javax.validation.constraints.NotNull
    private String pullRequestReviewId;

    public DismissPullRequestReviewInputGQO() {
    }

    public DismissPullRequestReviewInputGQO(String clientMutationId, String message, String pullRequestReviewId) {
        this.clientMutationId = clientMutationId;
        this.message = message;
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getPullRequestReviewId() {
        return pullRequestReviewId;
    }
    public void setPullRequestReviewId(String pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
    }

}