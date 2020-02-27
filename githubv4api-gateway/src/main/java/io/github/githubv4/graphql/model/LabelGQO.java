package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class LabelGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String color;
    private java.util.Date createdAt;
    private String description;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isDefault;
    @javax.validation.constraints.NotNull
    private IssueConnectionGQO issues;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private PullRequestConnectionGQO pullRequests;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public LabelGQO() {
    }

    public LabelGQO(String color, java.util.Date createdAt, String description, String id, Boolean isDefault, IssueConnectionGQO issues, String name, PullRequestConnectionGQO pullRequests, RepositoryGQO repository, String resourcePath, java.util.Date updatedAt, String url) {
        this.color = color;
        this.createdAt = createdAt;
        this.description = description;
        this.id = id;
        this.isDefault = isDefault;
        this.issues = issues;
        this.name = name;
        this.pullRequests = pullRequests;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public IssueConnectionGQO getIssues() {
        return issues;
    }
    public void setIssues(IssueConnectionGQO issues) {
        this.issues = issues;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public PullRequestConnectionGQO getPullRequests() {
        return pullRequests;
    }
    public void setPullRequests(PullRequestConnectionGQO pullRequests) {
        this.pullRequests = pullRequests;
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

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}