package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RequestReviewsPayloadGQO {

    private String clientMutationId;
    private PullRequestGQO pullRequest;
    private UserEdgeGQO requestedReviewersEdge;

    public RequestReviewsPayloadGQO() {
    }

    public RequestReviewsPayloadGQO(String clientMutationId, PullRequestGQO pullRequest, UserEdgeGQO requestedReviewersEdge) {
        this.clientMutationId = clientMutationId;
        this.pullRequest = pullRequest;
        this.requestedReviewersEdge = requestedReviewersEdge;
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

    public UserEdgeGQO getRequestedReviewersEdge() {
        return requestedReviewersEdge;
    }
    public void setRequestedReviewersEdge(UserEdgeGQO requestedReviewersEdge) {
        this.requestedReviewersEdge = requestedReviewersEdge;
    }

}