package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MergedEventGQO implements PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO, UniformResourceLocatableGQO{

    private ActorGQO actor;
    private CommitGQO commit;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    private RefGQO mergeRef;
    @javax.validation.constraints.NotNull
    private String mergeRefName;
    @javax.validation.constraints.NotNull
    private PullRequestGQO pullRequest;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;

    public MergedEventGQO() {
    }

    public MergedEventGQO(ActorGQO actor, CommitGQO commit, java.util.Date createdAt, String id, RefGQO mergeRef, String mergeRefName, PullRequestGQO pullRequest, String resourcePath, String url) {
        this.actor = actor;
        this.commit = commit;
        this.createdAt = createdAt;
        this.id = id;
        this.mergeRef = mergeRef;
        this.mergeRefName = mergeRefName;
        this.pullRequest = pullRequest;
        this.resourcePath = resourcePath;
        this.url = url;
    }

    public ActorGQO getActor() {
        return actor;
    }
    public void setActor(ActorGQO actor) {
        this.actor = actor;
    }

    public CommitGQO getCommit() {
        return commit;
    }
    public void setCommit(CommitGQO commit) {
        this.commit = commit;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public RefGQO getMergeRef() {
        return mergeRef;
    }
    public void setMergeRef(RefGQO mergeRef) {
        this.mergeRef = mergeRef;
    }

    public String getMergeRefName() {
        return mergeRefName;
    }
    public void setMergeRefName(String mergeRefName) {
        this.mergeRefName = mergeRefName;
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

}