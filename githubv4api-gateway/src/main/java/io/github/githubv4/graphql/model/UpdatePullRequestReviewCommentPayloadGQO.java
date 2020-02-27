package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdatePullRequestReviewCommentPayloadGQO {

    private String clientMutationId;
    private PullRequestReviewCommentGQO pullRequestReviewComment;

    public UpdatePullRequestReviewCommentPayloadGQO() {
    }

    public UpdatePullRequestReviewCommentPayloadGQO(String clientMutationId, PullRequestReviewCommentGQO pullRequestReviewComment) {
        this.clientMutationId = clientMutationId;
        this.pullRequestReviewComment = pullRequestReviewComment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public PullRequestReviewCommentGQO getPullRequestReviewComment() {
        return pullRequestReviewComment;
    }
    public void setPullRequestReviewComment(PullRequestReviewCommentGQO pullRequestReviewComment) {
        this.pullRequestReviewComment = pullRequestReviewComment;
    }

}