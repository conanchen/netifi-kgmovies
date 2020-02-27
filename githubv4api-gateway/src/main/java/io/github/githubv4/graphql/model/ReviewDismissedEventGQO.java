package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReviewDismissedEventGQO implements PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO, UniformResourceLocatableGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private Integer databaseId;
    private String dismissalMessage;
    private String dismissalMessageHTML;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestReviewStateGQO previousReviewState;
    @javax.validation.constraints.NotNull
    private PullRequestGQO pullRequest;
    private PullRequestCommitGQO pullRequestCommit;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private PullRequestReviewGQO review;
    @javax.validation.constraints.NotNull
    private String url;

    public ReviewDismissedEventGQO() {
    }

    public ReviewDismissedEventGQO(ActorGQO actor, java.util.Date createdAt, Integer databaseId, String dismissalMessage, String dismissalMessageHTML, String id, PullRequestReviewStateGQO previousReviewState, PullRequestGQO pullRequest, PullRequestCommitGQO pullRequestCommit, String resourcePath, PullRequestReviewGQO review, String url) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.dismissalMessage = dismissalMessage;
        this.dismissalMessageHTML = dismissalMessageHTML;
        this.id = id;
        this.previousReviewState = previousReviewState;
        this.pullRequest = pullRequest;
        this.pullRequestCommit = pullRequestCommit;
        this.resourcePath = resourcePath;
        this.review = review;
        this.url = url;
    }

    public ActorGQO getActor() {
        return actor;
    }
    public void setActor(ActorGQO actor) {
        this.actor = actor;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getDismissalMessage() {
        return dismissalMessage;
    }
    public void setDismissalMessage(String dismissalMessage) {
        this.dismissalMessage = dismissalMessage;
    }

    public String getDismissalMessageHTML() {
        return dismissalMessageHTML;
    }
    public void setDismissalMessageHTML(String dismissalMessageHTML) {
        this.dismissalMessageHTML = dismissalMessageHTML;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public PullRequestReviewStateGQO getPreviousReviewState() {
        return previousReviewState;
    }
    public void setPreviousReviewState(PullRequestReviewStateGQO previousReviewState) {
        this.previousReviewState = previousReviewState;
    }

    public PullRequestGQO getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequestGQO pullRequest) {
        this.pullRequest = pullRequest;
    }

    public PullRequestCommitGQO getPullRequestCommit() {
        return pullRequestCommit;
    }
    public void setPullRequestCommit(PullRequestCommitGQO pullRequestCommit) {
        this.pullRequestCommit = pullRequestCommit;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public PullRequestReviewGQO getReview() {
        return review;
    }
    public void setReview(PullRequestReviewGQO review) {
        this.review = review;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}