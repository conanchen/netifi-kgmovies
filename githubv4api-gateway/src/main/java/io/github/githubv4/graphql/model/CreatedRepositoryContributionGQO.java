package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreatedRepositoryContributionGQO implements CreatedRepositoryOrRestrictedContributionGQO, ContributionGQO{

    @javax.validation.constraints.NotNull
    private Boolean isRestricted;
    @javax.validation.constraints.NotNull
    private java.util.Date occurredAt;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private UserGQO user;

    public CreatedRepositoryContributionGQO() {
    }

    public CreatedRepositoryContributionGQO(Boolean isRestricted, java.util.Date occurredAt, RepositoryGQO repository, String resourcePath, String url, UserGQO user) {
        this.isRestricted = isRestricted;
        this.occurredAt = occurredAt;
        this.repository = repository;
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

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
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