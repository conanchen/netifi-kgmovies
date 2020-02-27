package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class HeadRefDeletedEventGQO implements PullRequestTimelineItemGQO, PullRequestTimelineItemsGQO, NodeGQO{

    private ActorGQO actor;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private RefGQO headRef;
    @javax.validation.constraints.NotNull
    private String headRefName;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestGQO pullRequest;

    public HeadRefDeletedEventGQO() {
    }

    public HeadRefDeletedEventGQO(ActorGQO actor, java.util.Date createdAt, RefGQO headRef, String headRefName, String id, PullRequestGQO pullRequest) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.headRef = headRef;
        this.headRefName = headRefName;
        this.id = id;
        this.pullRequest = pullRequest;
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

    public RefGQO getHeadRef() {
        return headRef;
    }
    public void setHeadRef(RefGQO headRef) {
        this.headRef = headRef;
    }

    public String getHeadRefName() {
        return headRefName;
    }
    public void setHeadRefName(String headRefName) {
        this.headRefName = headRefName;
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

}