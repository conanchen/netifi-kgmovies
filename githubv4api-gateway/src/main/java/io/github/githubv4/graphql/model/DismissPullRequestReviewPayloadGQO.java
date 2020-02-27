package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DismissPullRequestReviewPayloadGQO {

    private String clientMutationId;
    private PullRequestReviewGQO pullRequestReview;

    public DismissPullRequestReviewPayloadGQO() {
    }

    public DismissPullRequestReviewPayloadGQO(String clientMutationId, PullRequestReviewGQO pullRequestReview) {
        this.clientMutationId = clientMutationId;
        this.pullRequestReview = pullRequestReview;
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

}