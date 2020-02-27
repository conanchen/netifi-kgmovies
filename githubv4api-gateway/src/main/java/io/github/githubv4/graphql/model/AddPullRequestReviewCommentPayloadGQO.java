package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddPullRequestReviewCommentPayloadGQO {

    private String clientMutationId;
    private PullRequestReviewCommentGQO comment;
    private PullRequestReviewCommentEdgeGQO commentEdge;

    public AddPullRequestReviewCommentPayloadGQO() {
    }

    public AddPullRequestReviewCommentPayloadGQO(String clientMutationId, PullRequestReviewCommentGQO comment, PullRequestReviewCommentEdgeGQO commentEdge) {
        this.clientMutationId = clientMutationId;
        this.comment = comment;
        this.commentEdge = commentEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public PullRequestReviewCommentGQO getComment() {
        return comment;
    }
    public void setComment(PullRequestReviewCommentGQO comment) {
        this.comment = comment;
    }

    public PullRequestReviewCommentEdgeGQO getCommentEdge() {
        return commentEdge;
    }
    public void setCommentEdge(PullRequestReviewCommentEdgeGQO commentEdge) {
        this.commentEdge = commentEdge;
    }

}