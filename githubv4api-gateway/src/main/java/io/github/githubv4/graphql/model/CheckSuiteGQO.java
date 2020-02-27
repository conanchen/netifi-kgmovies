package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckSuiteGQO implements NodeGQO{

    private AppGQO app;
    private RefGQO branch;
    private CheckRunConnectionGQO checkRuns;
    @javax.validation.constraints.NotNull
    private CommitGQO commit;
    private CheckConclusionStateGQO conclusion;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    private PullRequestConnectionGQO matchingPullRequests;
    private PushGQO push;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private CheckStatusStateGQO status;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public CheckSuiteGQO() {
    }

    public CheckSuiteGQO(AppGQO app, RefGQO branch, CheckRunConnectionGQO checkRuns, CommitGQO commit, CheckConclusionStateGQO conclusion, java.util.Date createdAt, Integer databaseId, String id, PullRequestConnectionGQO matchingPullRequests, PushGQO push, RepositoryGQO repository, String resourcePath, CheckStatusStateGQO status, java.util.Date updatedAt, String url) {
        this.app = app;
        this.branch = branch;
        this.checkRuns = checkRuns;
        this.commit = commit;
        this.conclusion = conclusion;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
        this.matchingPullRequests = matchingPullRequests;
        this.push = push;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.status = status;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public AppGQO getApp() {
        return app;
    }
    public void setApp(AppGQO app) {
        this.app = app;
    }

    public RefGQO getBranch() {
        return branch;
    }
    public void setBranch(RefGQO branch) {
        this.branch = branch;
    }

    public CheckRunConnectionGQO getCheckRuns() {
        return checkRuns;
    }
    public void setCheckRuns(CheckRunConnectionGQO checkRuns) {
        this.checkRuns = checkRuns;
    }

    public CommitGQO getCommit() {
        return commit;
    }
    public void setCommit(CommitGQO commit) {
        this.commit = commit;
    }

    public CheckConclusionStateGQO getConclusion() {
        return conclusion;
    }
    public void setConclusion(CheckConclusionStateGQO conclusion) {
        this.conclusion = conclusion;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public PullRequestConnectionGQO getMatchingPullRequests() {
        return matchingPullRequests;
    }
    public void setMatchingPullRequests(PullRequestConnectionGQO matchingPullRequests) {
        this.matchingPullRequests = matchingPullRequests;
    }

    public PushGQO getPush() {
        return push;
    }
    public void setPush(PushGQO push) {
        this.push = push;
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

    public CheckStatusStateGQO getStatus() {
        return status;
    }
    public void setStatus(CheckStatusStateGQO status) {
        this.status = status;
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