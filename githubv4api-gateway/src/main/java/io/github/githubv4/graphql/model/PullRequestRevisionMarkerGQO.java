package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PullRequestRevisionMarkerGQO implements PullRequestTimelineItemsGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private CommitGQO lastSeenCommit;
    @javax.validation.constraints.NotNull
    private PullRequestGQO pullRequest;

    public PullRequestRevisionMarkerGQO() {
    }

    public PullRequestRevisionMarkerGQO(java.util.Date createdAt, CommitGQO lastSeenCommit, PullRequestGQO pullRequest) {
        this.createdAt = createdAt;
        this.lastSeenCommit = lastSeenCommit;
        this.pullRequest = pullRequest;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public CommitGQO getLastSeenCommit() {
        return lastSeenCommit;
    }
    public void setLastSeenCommit(CommitGQO lastSeenCommit) {
        this.lastSeenCommit = lastSeenCommit;
    }

    public PullRequestGQO getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequestGQO pullRequest) {
        this.pullRequest = pullRequest;
    }

}