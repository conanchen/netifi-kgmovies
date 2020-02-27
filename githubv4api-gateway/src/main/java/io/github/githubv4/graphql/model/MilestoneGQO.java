package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MilestoneGQO implements ClosableGQO, NodeGQO, UniformResourceLocatableGQO{

    @javax.validation.constraints.NotNull
    private Boolean closed;
    private java.util.Date closedAt;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private ActorGQO creator;
    private String description;
    private java.util.Date dueOn;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String issuePrioritiesDebug;
    @javax.validation.constraints.NotNull
    private IssueConnectionGQO issues;
    @javax.validation.constraints.NotNull
    private Integer number;
    @javax.validation.constraints.NotNull
    private PullRequestConnectionGQO pullRequests;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private MilestoneStateGQO state;
    @javax.validation.constraints.NotNull
    private String title;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public MilestoneGQO() {
    }

    public MilestoneGQO(Boolean closed, java.util.Date closedAt, java.util.Date createdAt, ActorGQO creator, String description, java.util.Date dueOn, String id, String issuePrioritiesDebug, IssueConnectionGQO issues, Integer number, PullRequestConnectionGQO pullRequests, RepositoryGQO repository, String resourcePath, MilestoneStateGQO state, String title, java.util.Date updatedAt, String url) {
        this.closed = closed;
        this.closedAt = closedAt;
        this.createdAt = createdAt;
        this.creator = creator;
        this.description = description;
        this.dueOn = dueOn;
        this.id = id;
        this.issuePrioritiesDebug = issuePrioritiesDebug;
        this.issues = issues;
        this.number = number;
        this.pullRequests = pullRequests;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.state = state;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public Boolean getClosed() {
        return closed;
    }
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public java.util.Date getClosedAt() {
        return closedAt;
    }
    public void setClosedAt(java.util.Date closedAt) {
        this.closedAt = closedAt;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public ActorGQO getCreator() {
        return creator;
    }
    public void setCreator(ActorGQO creator) {
        this.creator = creator;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.Date getDueOn() {
        return dueOn;
    }
    public void setDueOn(java.util.Date dueOn) {
        this.dueOn = dueOn;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getIssuePrioritiesDebug() {
        return issuePrioritiesDebug;
    }
    public void setIssuePrioritiesDebug(String issuePrioritiesDebug) {
        this.issuePrioritiesDebug = issuePrioritiesDebug;
    }

    public IssueConnectionGQO getIssues() {
        return issues;
    }
    public void setIssues(IssueConnectionGQO issues) {
        this.issues = issues;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
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

    public MilestoneStateGQO getState() {
        return state;
    }
    public void setState(MilestoneStateGQO state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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