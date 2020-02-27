package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdatePullRequestReviewCommentInputGQO {

    @javax.validation.constraints.NotNull
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String pullRequestReviewCommentId;

    public UpdatePullRequestReviewCommentInputGQO() {
    }

    public UpdatePullRequestReviewCommentInputGQO(String body, String clientMutationId, String pullRequestReviewCommentId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.pullRequestReviewCommentId = pullRequestReviewCommentId;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getPullRequestReviewCommentId() {
        return pullRequestReviewCommentId;
    }
    public void setPullRequestReviewCommentId(String pullRequestReviewCommentId) {
        this.pullRequestReviewCommentId = pullRequestReviewCommentId;
    }

}