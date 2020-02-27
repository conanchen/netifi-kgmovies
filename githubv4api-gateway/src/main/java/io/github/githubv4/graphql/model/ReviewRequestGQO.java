package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReviewRequestGQO implements NodeGQO{

    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestGQO pullRequest;
    private RequestedReviewerGQO requestedReviewer;

    public ReviewRequestGQO() {
    }

    public ReviewRequestGQO(Integer databaseId, String id, PullRequestGQO pullRequest, RequestedReviewerGQO requestedReviewer) {
        this.databaseId = databaseId;
        this.id = id;
        this.pullRequest = pullRequest;
        this.requestedReviewer = requestedReviewer;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public PullRequestGQO getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequestGQO pullRequest) {
        this.pullRequest = pullRequest;
    }

    public RequestedReviewerGQO getRequestedReviewer() {
        return requestedReviewer;
    }
    public void setRequestedReviewer(RequestedReviewerGQO requestedReviewer) {
        this.requestedReviewer = requestedReviewer;
    }

}