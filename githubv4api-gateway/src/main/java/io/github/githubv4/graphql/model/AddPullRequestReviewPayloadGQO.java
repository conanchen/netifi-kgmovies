package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddPullRequestReviewPayloadGQO {

    private String clientMutationId;
    private PullRequestReviewGQO pullRequestReview;
    private PullRequestReviewEdgeGQO reviewEdge;

    public AddPullRequestReviewPayloadGQO() {
    }

    public AddPullRequestReviewPayloadGQO(String clientMutationId, PullRequestReviewGQO pullRequestReview, PullRequestReviewEdgeGQO reviewEdge) {
        this.clientMutationId = clientMutationId;
        this.pullRequestReview = pullRequestReview;
        this.reviewEdge = reviewEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public PullRequestReviewGQO getPullRequestReview() {
        return pullRequestReview;
    }
    public void setPullRequestReview(PullRequestReviewGQO pullRequestReview) {
        this.pullRequestReview = pullRequestReview;
    }

    public PullRequestReviewEdgeGQO getReviewEdge() {
        return reviewEdge;
    }
    public void setReviewEdge(PullRequestReviewEdgeGQO reviewEdge) {
        this.reviewEdge = reviewEdge;
    }

}