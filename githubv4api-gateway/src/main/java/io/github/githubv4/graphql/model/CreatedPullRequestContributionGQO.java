package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreatedPullRequestContributionGQO implements CreatedPullRequestOrRestrictedContributionGQO, ContributionGQO{

    @javax.validation.constraints.NotNull
    private Boolean isRestricted;
    @javax.validation.constraints.NotNull
    private java.util.Date occurredAt;
    @javax.validation.constraints.NotNull
    private PullRequestGQO pullRequest;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private UserGQO user;

    public CreatedPullRequestContributionGQO() {
    }

    public CreatedPullRequestContributionGQO(Boolean isRestricted, java.util.Date occurredAt, PullRequestGQO pullRequest, String resourcePath, String url, UserGQO user) {
        this.isRestricted = isRestricted;
        this.occurredAt = occurredAt;
        this.pullRequest = pullRequest;
        this.resourcePath = resourcePath;
        this.url = url;
        this.user = user;
    }

    public Boolean getIsRestricted() {
        return isRestricted;
    }
    public void setIsRestricted(Boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    public java.util.Date getOccurredAt() {
        return occurredAt;
    }
    public void setOccurredAt(java.util.Date occurredAt) {
        this.occurredAt = occurredAt;
    }

    public PullRequestGQO getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequestGQO pullRequest) {
        this.pullRequest = pullRequest;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public UserGQO getUser() {
        return user;
    }
    public void setUser(UserGQO user) {
        this.user = user;
    }

}